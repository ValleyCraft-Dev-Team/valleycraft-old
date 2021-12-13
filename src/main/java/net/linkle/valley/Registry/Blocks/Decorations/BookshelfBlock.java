package net.linkle.valley.Registry.Blocks.Decorations;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class BookshelfBlock extends Block {

    public BookshelfBlock() {
        super(FabricBlockSettings.of(Material.WOOD)
                .breakByHand(true)
                .sounds(BlockSoundGroup.WOOD)
                .strength(1, 2f));
    }
}
