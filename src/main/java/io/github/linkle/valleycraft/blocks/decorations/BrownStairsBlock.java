package io.github.linkle.valleycraft.blocks.decorations;

import io.github.linkle.valleycraft.init.BuildingBlocks;
import net.minecraft.block.Material;
import net.minecraft.block.StairsBlock;
import net.minecraft.sound.BlockSoundGroup;

public class BrownStairsBlock extends StairsBlock {
    public BrownStairsBlock() {
        super(BuildingBlocks.MIXED_BRICKS.getDefaultState(), Settings.of(Material.STONE)
                .requiresTool()
                .sounds(BlockSoundGroup.NETHER_BRICKS)
                .strength(1.5f, 2));
    }
}