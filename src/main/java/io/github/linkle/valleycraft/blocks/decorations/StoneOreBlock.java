package io.github.linkle.valleycraft.blocks.decorations;

import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.sound.BlockSoundGroup;

public class StoneOreBlock extends OreBlock {
    public StoneOreBlock() {
        super(Settings.of(Material.STONE)
                .requiresTool()
                .sounds(BlockSoundGroup.STONE)
                .strength(2, 3));
    }
}
