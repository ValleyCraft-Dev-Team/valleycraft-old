package io.github.linkle.valleycraft.blocks.decorations;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class CrateBlock extends Block {
    public CrateBlock() {
        super(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).breakByHand(true));
    }
}
