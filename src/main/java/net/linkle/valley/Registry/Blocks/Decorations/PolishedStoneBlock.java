package net.linkle.valley.Registry.Blocks.Decorations;

import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class PolishedStoneBlock extends Block {
    public PolishedStoneBlock() {
        super(Settings.of(Material.STONE)
                .requiresTool()
                .sounds(BlockSoundGroup.STONE)
                .strength(1.5f, 3.5f));
    }
}
