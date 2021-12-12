package net.linkle.valley.Registry.Blocks.Decorations;

import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;
import net.minecraft.sound.BlockSoundGroup;

public class TileSlabBlock extends SlabBlock {
    public TileSlabBlock() {
        super(Settings.of(Material.STONE)
                .requiresTool()
                .sounds(BlockSoundGroup.STONE)
                .strength(1.5f, 2));
    }
}
