package net.linkle.valley.Registry.Blocks.Decorations;

import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class BrownBlock extends Block {
    public BrownBlock() {
        super(Settings.of(Material.STONE)
                .requiresTool()
                .sounds(BlockSoundGroup.NETHER_BRICKS)
                .strength(1.5f, 2));
    }
}
