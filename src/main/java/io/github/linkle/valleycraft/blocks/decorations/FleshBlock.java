package io.github.linkle.valleycraft.blocks.decorations;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class FleshBlock extends Block {
    public FleshBlock() {
        super(FabricBlockSettings.of(Material.GOURD)
                .breakByHand(true)
                .sounds(BlockSoundGroup.WET_GRASS)
                .strength(0.4f, 0.5f));
    }
}
