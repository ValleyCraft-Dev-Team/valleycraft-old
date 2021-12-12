package net.linkle.valley.Registry.Blocks.Decorations;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;

public class GlacialStone extends SoulSandBlock {
    public GlacialStone() {
        super(FabricBlockSettings.of(Material.STONE)
                .requiresTool().breakByTool(FabricToolTags.PICKAXES, 1)
                .breakByHand(true).ticksRandomly()
                .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                .strength(1.5f, 5f));
    }
}
