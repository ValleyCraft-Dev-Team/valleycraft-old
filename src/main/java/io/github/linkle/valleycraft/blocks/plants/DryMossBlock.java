package io.github.linkle.valleycraft.blocks.plants;

import io.github.linkle.valleycraft.init.Plants;
import net.minecraft.block.BlockState;

public class DryMossBlock extends GrowthBlock {
    @Override
    protected boolean isBlockUpper(BlockState state) {
        return state.isOf(Plants.DRY_MOSS_CARPET) || state.isOf(Plants.DRY_MOSS);
    }

    @Override
    protected BlockState getBlockUpper() {
        return Plants.DRY_MOSS_CARPET.getDefaultState();
    }

    @Override
    protected BlockState getBlockLower() {
        return Plants.DRY_VINES.getDefaultState();
    }
}
