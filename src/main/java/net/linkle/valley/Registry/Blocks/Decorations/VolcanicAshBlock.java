package net.linkle.valley.Registry.Blocks.Decorations;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.GravelBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class VolcanicAshBlock extends GravelBlock {
    public VolcanicAshBlock() {
        super(FabricBlockSettings.of(Material.SOIL)
                .breakByTool(FabricToolTags.SHOVELS)
                .breakByHand(true)
                .sounds(BlockSoundGroup.GRAVEL)
                .strength(0.5f, 1.5f));
    }
}
