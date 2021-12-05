package net.linkle.valley.Registry.Blocks.Plants;

import static net.linkle.valley.Registry.Initializers.Plants.MOSSY_VINES;
import static net.minecraft.block.Blocks.MOSS_CARPET;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;

public class MossBlock extends GrowthBlock {
    @Override
    protected boolean isBlockUpper(BlockState state) {
        return state.isOf(Blocks.MOSS_CARPET) || state.isOf(Blocks.MOSS_BLOCK);
    }

    @Override
    protected BlockState getBlockUpper() {
        return MOSS_CARPET.getDefaultState();
    }

    @Override
    protected BlockState getBlockLower() {
        return MOSSY_VINES.getDefaultState();
    }
}
