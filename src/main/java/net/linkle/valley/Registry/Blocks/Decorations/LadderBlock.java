package net.linkle.valley.Registry.Blocks.Decorations;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

public class LadderBlock extends HorizontalFacingBlock implements Waterloggable {
    public static final BooleanProperty WATERLOGGED;
    protected static final VoxelShape EAST_SHAPE;
    protected static final VoxelShape WEST_SHAPE;
    protected static final VoxelShape SOUTH_SHAPE;
    protected static final VoxelShape NORTH_SHAPE;

    public LadderBlock() {
        super(FabricBlockSettings.of(Material.WOOD).nonOpaque()
                .breakByHand(true)
                .sounds(BlockSoundGroup.WOOD)
                .strength(0.8f,0.8f));
        setDefaultState(stateManager.getDefaultState().with(WATERLOGGED, false).with(FACING, Direction.NORTH));
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        switch (state.get(FACING)) {
            case NORTH:
                return NORTH_SHAPE;
            case SOUTH:
                return SOUTH_SHAPE;
            case WEST:
                return WEST_SHAPE;
            case EAST:
                return EAST_SHAPE;
            default: return NORTH_SHAPE;
        }
    }

    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        var directions = ctx.getPlacementDirections();
        var pos = ctx.getBlockPos();
        var world = ctx.getWorld();
        BlockState state;
        if (!ctx.canReplaceExisting()) {
            state = world.getBlockState(pos.offset(ctx.getSide().getOpposite()));
            if (state.getBlock() instanceof LadderBlock && state.get(FACING) == ctx.getSide()) {
                return null;
            }
        }
        
        state = getDefaultState();
        var fluidState = world.getFluidState(pos);
        
        if (ctx.getSide().getAxis().isVertical()) {
            var hitBlock = world.getBlockState(pos.offset(ctx.getSide().getOpposite()));
            if (hitBlock.getBlock() instanceof LadderBlock) {
                state = getDefaultState().with(FACING, hitBlock.get(FACING));
                if (state.canPlaceAt(world, pos)) {
                    return state.with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER);
                }
            }
        }
        
        if ((state = world.getBlockState(pos.down())).getBlock() instanceof LadderBlock) {
            state = getDefaultState().with(FACING, state.get(FACING));
            if (state.canPlaceAt(world, pos)) {
                return state.with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER);
            }
        } 
        if ((state = world.getBlockState(pos.up())).getBlock() instanceof LadderBlock) {
            state = getDefaultState().with(FACING, state.get(FACING));
            if (state.canPlaceAt(world, pos)) {
                return state.with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER);
            }
        }
        
        state = getDefaultState();
        for(int i = 0; i < directions.length; ++i) {
            var direction = directions[i];
            if (direction.getAxis().isHorizontal()) {
                state = state.with(FACING, direction);
                if (state.canPlaceAt(world, pos)) {
                    return state.with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER);
                }
            }
        }
        
        return null;
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState newState, WorldAccess world, BlockPos pos, BlockPos posFrom) {
        if (state.get(WATERLOGGED)) {
            world.getFluidTickScheduler().schedule(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }

        return super.getStateForNeighborUpdate(state, direction, newState, world, pos, posFrom);
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, WATERLOGGED);
    }

    public FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }

    static {
        WATERLOGGED = Properties.WATERLOGGED;
        EAST_SHAPE = Block.createCuboidShape(13,0,0,16,16,16);
        NORTH_SHAPE = Block.createCuboidShape(0,0,0,16,16,3);
        WEST_SHAPE = Block.createCuboidShape(0,0,0,3,16,16);
        SOUTH_SHAPE = Block.createCuboidShape(0,0,13,16,16,16);
    }
}

