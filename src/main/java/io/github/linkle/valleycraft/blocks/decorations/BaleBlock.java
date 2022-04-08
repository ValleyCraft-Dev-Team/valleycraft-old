package io.github.linkle.valleycraft.blocks.decorations;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.HayBlock;

public class BaleBlock extends HayBlock {

    public BaleBlock() {
        super(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK));
    }

}
