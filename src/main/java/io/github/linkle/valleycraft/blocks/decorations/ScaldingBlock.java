package io.github.linkle.valleycraft.blocks.decorations;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.MagmaBlock;

public class ScaldingBlock extends MagmaBlock {
    public ScaldingBlock() {
        super(FabricBlockSettings.copyOf(Blocks.MAGMA_BLOCK)
                .postProcess((blockState, pos, view) -> true)
                .emissiveLighting((blockState, pos, view) -> true)
        );
    }
}
