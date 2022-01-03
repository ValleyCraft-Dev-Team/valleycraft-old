package io.github.linkle.valleycraft.blocks.decorations;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class CrabTrapBlock extends Block {
    public CrabTrapBlock() {
        super(FabricBlockSettings.of(Material.WOOD)
                .breakByHand(true).nonOpaque()
                .sounds(BlockSoundGroup.WOOD)
                .strength(1.0f, 1));
    }
}