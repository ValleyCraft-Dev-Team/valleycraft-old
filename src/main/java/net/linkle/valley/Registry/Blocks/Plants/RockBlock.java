package net.linkle.valley.Registry.Blocks.Plants;

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
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

public class RockBlock extends PlantBlock implements Waterloggable {
    public static final BooleanProperty WATERLOGGED;
    protected static final VoxelShape SHAPE;

    public RockBlock() {
        super(FabricBlockSettings.of(Material.STONE)
                .breakByHand(false)
                .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                .strength(0.5f, 2.5f));
        this.setDefaultState((BlockState)((BlockState)((BlockState)this.stateManager.getDefaultState()).with(WATERLOGGED, false)));
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState newState, WorldAccess world, BlockPos pos, BlockPos posFrom) {
        if ((Boolean)state.get(WATERLOGGED)) {
            world.getFluidTickScheduler().schedule(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }

        return super.getStateForNeighborUpdate(state, direction, newState, world, pos, posFrom);
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(WATERLOGGED);
    }

    public FluidState getFluidState(BlockState state) {
        return (Boolean)state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }

    static {
        WATERLOGGED = Properties.WATERLOGGED;
        SHAPE = Block.createCuboidShape(1.0D, 0.0D, 1.0D, 15.0D, 1.0D, 15.0D);
    }

    public boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOpaqueFullCube(world, pos);
    }

    public VoxelShape getCollisionShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}

