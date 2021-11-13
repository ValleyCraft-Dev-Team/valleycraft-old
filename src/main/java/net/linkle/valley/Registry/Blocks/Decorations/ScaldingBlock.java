package net.linkle.valley.Registry.Blocks.Decorations;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.MagmaBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class ScaldingBlock extends MagmaBlock {
    public ScaldingBlock() {
        super(FabricBlockSettings.of(Material.STONE)
                .requiresTool()
                .breakByTool(FabricToolTags.PICKAXES, 1)
                .luminance(3)
                .sounds(BlockSoundGroup.STONE)
                .strength(1f, 1.5f));
    }
}
