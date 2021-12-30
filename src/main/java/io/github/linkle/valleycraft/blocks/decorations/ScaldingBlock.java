package io.github.linkle.valleycraft.blocks.decorations;

import net.minecraft.block.Blocks;
import net.minecraft.block.MagmaBlock;

public class ScaldingBlock extends MagmaBlock {
    public ScaldingBlock() {
        super(Settings.copy(Blocks.MAGMA_BLOCK)
                .postProcess((blockState, pos, view) -> true)
                .emissiveLighting((blockState, pos, view) -> true)
        );
    }
}
