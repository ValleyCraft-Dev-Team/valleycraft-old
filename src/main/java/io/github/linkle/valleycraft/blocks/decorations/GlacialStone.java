package io.github.linkle.valleycraft.blocks.decorations;

import net.minecraft.block.Material;
import net.minecraft.block.SoulSandBlock;
import net.minecraft.sound.BlockSoundGroup;

public class GlacialStone extends SoulSandBlock {
    public GlacialStone() {
        super(Settings.of(Material.STONE)
                .requiresTool().ticksRandomly()
                .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                .strength(1.5f, 5f));
    }
}
