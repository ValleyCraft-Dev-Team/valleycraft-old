package net.linkle.valley.Registry.Blocks.Decorations;

import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;
import net.minecraft.sound.BlockSoundGroup;

public class BrownSlabBlock extends SlabBlock {
    public BrownSlabBlock() {
        super(Settings.of(Material.STONE)
                .requiresTool()
                .sounds(BlockSoundGroup.NETHER_BRICKS)
                .strength(1.5f, 2));
    }
}
