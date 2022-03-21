package io.github.linkle.valleycraft.blocks.decorations;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class BookshelfBlockGlow extends Block {

    public BookshelfBlockGlow() {
        super(FabricBlockSettings.of(Material.WOOD)
                //.breakByTool(FabricToolTags.AXES)
                .sounds(BlockSoundGroup.WOOD).luminance(15)
                .strength(1, 2f));
    }
}
