package net.linkle.valley.Registry.Blocks.Decorations;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class BookshelfBlockGlow extends Block {

    public BookshelfBlockGlow() {
        super(FabricBlockSettings.of(Material.WOOD)
                .breakByTool(FabricToolTags.AXES)
                .breakByHand(true)
                .sounds(BlockSoundGroup.WOOD).luminance(15)
                .strength(1, 2f));
    }
}
