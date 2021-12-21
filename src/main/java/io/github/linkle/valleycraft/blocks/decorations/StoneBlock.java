package io.github.linkle.valleycraft.blocks.decorations;

import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class StoneBlock extends Block {
    public StoneBlock() {
        super(Settings.of(Material.STONE)
                .requiresTool()
                .sounds(BlockSoundGroup.STONE)
                .strength(1.5f, 2.0f));
    }
}
