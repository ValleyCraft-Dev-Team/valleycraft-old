package io.github.linkle.valleycraft.blocks.decorations;

import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.StairsBlock;
import net.minecraft.sound.BlockSoundGroup;

public class TileStairsBlock extends StairsBlock {
    public TileStairsBlock(Block base) {
        super(base.getDefaultState(), Settings.of(Material.STONE)
                .requiresTool()
                .sounds(BlockSoundGroup.STONE)
                .strength(1, 2));
    }
}