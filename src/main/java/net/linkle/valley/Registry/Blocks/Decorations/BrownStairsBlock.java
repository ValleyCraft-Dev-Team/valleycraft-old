package net.linkle.valley.Registry.Blocks.Decorations;

import net.linkle.valley.Registry.Initializers.Furniture;
import net.minecraft.block.Material;
import net.minecraft.block.StairsBlock;
import net.minecraft.sound.BlockSoundGroup;

public class BrownStairsBlock extends StairsBlock {
    public BrownStairsBlock() {
        super(Furniture.B_BRICKS.getDefaultState(), Settings.of(Material.STONE)
                .requiresTool()
                .sounds(BlockSoundGroup.NETHER_BRICKS)
                .strength(1.5f, 2));
    }
}