package io.github.linkle.valleycraft.blocks.decorations;

import net.minecraft.block.MagmaBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class ScaldingBlock extends MagmaBlock {
    public ScaldingBlock() {
        super(Settings.of(Material.STONE)
                .requiresTool()
                .luminance(s->3)
                .sounds(BlockSoundGroup.STONE)
                .strength(1.5f, 2f));
    }
}
