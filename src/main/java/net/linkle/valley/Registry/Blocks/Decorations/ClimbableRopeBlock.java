package net.linkle.valley.Registry.Blocks.Decorations;

import net.minecraft.block.*;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

public class ClimbableRopeBlock extends PillarBlock implements Waterloggable {
    public static final BooleanProperty WATERLOGGED;
    protected static final VoxelShape Y_SHAPE;
    protected static final VoxelShape Z_SHAPE;
    protected static final VoxelShape X_SHAPE;

    public ClimbableRopeBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(WATERLOGGED, false).with(AXIS, Direction.Axis.Y));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        switch(state.get(AXIS)) {
            case X:
            default:
                return X_SHAPE;
            case Z:
                return Z_SHAPE;
            case Y:
                return Y_SHAPE;
        }
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        FluidState fluidState = ctx.getWorld().getFluidState(ctx.getBlockPos());
        boolean bl = fluidState.getFluid() == Fluids.WATER;
        return super.getPlacementState(ctx).with(WATERLOGGED, bl);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState newState, WorldAccess world, BlockPos pos, BlockPos posFrom) {
        if (state.get(WATERLOGGED)) {
            world.getFluidTickScheduler().schedule(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }

        return super.getStateForNeighborUpdate(state, direction, newState, world, pos, posFrom);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(WATERLOGGED);
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    @Override
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return true;
    }

    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return VoxelShapes.empty();
    }

    static {
        WATERLOGGED = Properties.WATERLOGGED;
        Y_SHAPE = Block.createCuboidShape(6.5D, 0.0D, 6.5D, 9.5D, 16.0D, 9.5D);
        Z_SHAPE = Block.createCuboidShape(6.5D, 6.5D, 0.0D, 9.5D, 9.5D, 16.0D);
        X_SHAPE = Block.createCuboidShape(0.0D, 6.5D, 6.5D, 16.0D, 9.5D, 9.5D);
    }
}