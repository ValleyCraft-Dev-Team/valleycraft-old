package io.github.linkle.valleycraft.blocks.decorations;

import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class BoneJointBlock extends Block {
    public BoneJointBlock() {
        super(Settings.of(Material.STONE)
                .requiresTool()
                .sounds(BlockSoundGroup.BONE)
                .strength(1.5f, 2));
    }
}
