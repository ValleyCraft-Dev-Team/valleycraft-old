package io.github.linkle.valleycraft.blocks.plants.aquatic;

import io.github.linkle.valleycraft.blocks.DirectionBlockWithWater;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.ShapeContext;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public class BarnacleBlock extends DirectionBlockWithWater {
    protected final VoxelShape northShape;
    protected final VoxelShape southShape;
    protected final VoxelShape eastShape;
    protected final VoxelShape westShape;
    protected final VoxelShape upShape;
    protected final VoxelShape downShape;

    public BarnacleBlock() {
        super(FabricBlockSettings.of(Material.UNDERWATER_PLANT)
                .nonOpaque()
                .breakByHand(false)
                .sounds(BlockSoundGroup.CALCITE)
                .strength(0.3f, 0.5f)
                .ticksRandomly()
                .noCollision());
        setDefaultState();
        int height = 15;
        int xzOffset = 2;
        upShape = createCuboidShape(xzOffset, 0.0, xzOffset, 16 - xzOffset, height, 16 - xzOffset);
        downShape = createCuboidShape(xzOffset, 16 - height, xzOffset, 16 - xzOffset, 16.0, 16 - xzOffset);
        northShape = createCuboidShape(xzOffset, xzOffset, 16 - height, 16 - xzOffset, 16 - xzOffset, 16.0);
        southShape = createCuboidShape(xzOffset, xzOffset, 0.0, 16 - xzOffset, 16 - xzOffset, height);
        eastShape = createCuboidShape(0.0, xzOffset, xzOffset, height, 16 - xzOffset, 16 - xzOffset);
        westShape = createCuboidShape(16 - height, xzOffset, xzOffset, 16.0, 16 - xzOffset, 16 - xzOffset);
    }
    
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        switch (state.get(FACING)) {
            case NORTH: {
                return northShape;
            }
            case SOUTH: {
                return southShape;
            }
            case EAST: {
                return eastShape;
            }
            case WEST: {
                return westShape;
            }
            case DOWN: {
                return downShape;
            }
            default: {
                return upShape;
            }
        }
    }
    
    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        var face = state.get(FACING);
        pos = pos.offset(face.getOpposite());
        return world.getBlockState(pos).isSideSolidFullSquare(world, pos, face);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
        if (direction == state.get(FACING).getOpposite() && !state.canPlaceAt(world, pos)) {
            return Blocks.AIR.getDefaultState();
        }
        return state;
    }
    
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        var world = ctx.getWorld();
        var pos = ctx.getBlockPos();
        return getDefaultState().with(WATERLOGGED, world.getFluidState(pos).getFluid() == Fluids.WATER).with(FACING, ctx.getSide());
    }
}