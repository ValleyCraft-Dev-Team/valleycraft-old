package net.linkle.valley.Registry.Blocks.Decorations;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Blocks;
import net.minecraft.block.HayBlock;

public class BaleBlock extends HayBlock {
    
    public BaleBlock() {
        super(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)
            .breakByTool(FabricToolTags.HOES)
            .breakByHand(true)
        );
    }
    
    public BaleBlock(Settings settings) {
        super(settings);
    }
}
