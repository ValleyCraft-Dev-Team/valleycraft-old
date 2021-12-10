package net.linkle.valley.Registry.Blocks.Decorations;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class CrateBlock extends Block {
    public CrateBlock() {
        super(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)
                .breakByTool(FabricToolTags.AXES)
                .breakByHand(true));
    }
}
