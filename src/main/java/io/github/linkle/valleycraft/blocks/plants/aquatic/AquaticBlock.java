package io.github.linkle.valleycraft.blocks.plants.aquatic;

import java.util.Random;

import io.github.linkle.valleycraft.blocks.BlockWithWater;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.ShapeContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public class AquaticBlock extends BlockWithWater {

    protected final VoxelShape shape;

    public AquaticBlock(VoxelShape shape) {
        this(getSettings(), shape);
    }

    public AquaticBlock(Settings settings, VoxelShape shape) {
        super(settings);
        setDefaultState();
        this.shape = shape;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return shape;
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (random.nextInt(25) == 0) {
            int num = 5;

            for (var blockPos : BlockPos.iterate(pos.add(-4, -1, -4), pos.add(4, 1, 4))) {
                if (world.getBlockState(blockPos).isOf(this) && --num <= 0) {
                    return;
                }
            }

            var blockPos = pos.add(random.nextInt(3) - 1, random.nextInt(2) - random.nextInt(2), random.nextInt(3) - 1);

            for (int i = 0; i < 4; ++i) {
                if (world.getBlockState(blockPos).isOf(Blocks.WATER) && state.canPlaceAt(world, blockPos)) {
                    pos = blockPos;
                }

                blockPos = pos.add(random.nextInt(3) - 1, random.nextInt(2) - random.nextInt(2), random.nextInt(3) - 1);
            }

            if (world.getBlockState(blockPos).isOf(Blocks.WATER) && state.canPlaceAt(world, blockPos)) {
                world.setBlockState(blockPos, getDefaultState(), Block.NOTIFY_LISTENERS);
            }
        }
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (!state.canPlaceAt(world, pos)) {
            return Blocks.AIR.getDefaultState();
        }
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        var blockPos = pos.down();
        var blockState = world.getBlockState(blockPos);
        return blockState.isFullCube(world, blockPos);
    }

    public static FabricBlockSettings getSettings() {
        return FabricBlockSettings.of(Material.UNDERWATER_PLANT)
                .nonOpaque()
                .breakByHand(true)
                .sounds(BlockSoundGroup.CALCITE)
                .strength(0.0f, 0.1f)
                .ticksRandomly();
    }
}