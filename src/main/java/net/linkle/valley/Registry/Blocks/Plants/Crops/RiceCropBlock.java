package net.linkle.valley.Registry.Blocks.Plants.Crops;

import static net.linkle.valley.Registry.Initializers.FoodAndCooking.RICE_ITEM;

import java.util.Random;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.tag.BlockTags;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldView;

public class RiceCropBlock extends CropBlock {

    public RiceCropBlock(AbstractBlock.Settings settings) {
        super(settings);
        setDefaultState();
        shapes[0] = createCuboidShape(0, 0, 0, 16, 5, 16);
        shapes[1] = createCuboidShape(0, 0, 0, 16, 7, 16);
        shapes[2] = createCuboidShape(0, 0, 0, 16, 10, 16);
        shapes[3] = createCuboidShape(0, 0, 0, 16, 11, 16);
        shapes[4] = createCuboidShape(0, 0, 0, 16, 14, 16);
        shapes[5] = createCuboidShape(0, 0, 0, 16, 14, 16);
        shapes[6] = shapes[5];
    }

    @Override
    @Environment(EnvType.CLIENT)
    public ItemStack getPickStack(BlockView world, BlockPos pos, BlockState state) {
        return new ItemStack(RICE_ITEM);
    }
    
    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockPos down = pos.down();
        BlockState floor = world.getBlockState(down);
        if (canPlantOnTop(floor, world, pos)) {
            for (var face : Direction.Type.HORIZONTAL) {
                BlockState block = world.getBlockState(down.offset(face));
                FluidState fluid = world.getFluidState(down.offset(face));
                if (fluid.isIn(FluidTags.WATER) || block.isOf(Blocks.FROSTED_ICE)) {
                    return true;
                }
            }
        }

        return false;
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        Block block = floor.getBlock();
        return  super.canPlantOnTop(floor, world, pos) ||
                floor.isIn(BlockTags.SAND) ||
                block == Blocks.GRAVEL ||
                block == Blocks.CLAY;
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        growTick(world, state, pos, 5);
    }

    @Override
    protected ItemConvertible getPickItem() {
        return RICE_ITEM;
    }

    @Override
    protected int getAmount(Random random) {
        return MathHelper.nextBetween(random, 3, 5);
    }

    @Override
    protected int getPickedMinAge() {
        return 0;
    }

    @Override
    protected int getMaxAge() {
        return 6;
    }
}