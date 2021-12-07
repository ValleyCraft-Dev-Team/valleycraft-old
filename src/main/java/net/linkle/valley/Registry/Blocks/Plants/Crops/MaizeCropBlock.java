package net.linkle.valley.Registry.Blocks.Plants.Crops;

import java.util.Random;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemConvertible;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.BlockView;

public class MaizeCropBlock extends CropBlock {

    public MaizeCropBlock(Settings settings) {
        super(settings);
        setDefaultState();
        shapes[0] = createCuboidShape(1, 0, 1, 15, 3, 15);
        shapes[1] = createCuboidShape(1, 0, 1, 15, 5, 15);
        shapes[2] = createCuboidShape(1, 0, 1, 15, 7, 15);
        shapes[3] = createCuboidShape(1, 0, 1, 15, 14, 15);
        shapes[4] = createCuboidShape(1, 0, 1, 15, 19, 15);
        shapes[5] = createCuboidShape(1, 0, 1, 15, 24, 15);
        shapes[6] = createCuboidShape(1, 0, 1, 15, 29, 15);
        shapes[7] = createCuboidShape(1, 0, 1, 15, 31, 15);
        shapes[8] = shapes[7];
        shapes[9] = shapes[7];
        shapes[10] = shapes[7];
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        growTick(world, state, pos, 8);
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        var block = floor.getBlock();
        return  super.canPlantOnTop(floor, world, pos) ||
                floor.isIn(BlockTags.SAND) ||
                block == Blocks.GRAVEL ||
                block == Blocks.CLAY;
    }

    @Override
    protected ItemConvertible getPickItem() {
        return this;
    }

    @Override
    protected int getAmount(Random random) {
        return MathHelper.nextBetween(random, 3, 5);
    }

    @Override
    protected int getPickedMinAge() {
        return 7;
    }

    @Override
    protected int getMaxAge() {
        return 10;
    }
}