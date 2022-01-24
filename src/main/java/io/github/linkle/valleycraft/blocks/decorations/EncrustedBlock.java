package io.github.linkle.valleycraft.blocks.decorations;

import net.minecraft.block.Material;
import net.minecraft.block.PillarBlock;
import net.minecraft.sound.BlockSoundGroup;

public class EncrustedBlock extends PillarBlock {
    public EncrustedBlock() {
        super(Settings.of(Material.STONE)
                .requiresTool()
                .sounds(BlockSoundGroup.STONE)
                .strength(1.5f, 2));
    }
}
