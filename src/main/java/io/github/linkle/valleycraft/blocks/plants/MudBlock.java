package io.github.linkle.valleycraft.blocks.plants;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class MudBlock extends FallingBlock {
    public MudBlock() {
        super(FabricBlockSettings.of(Material.SOIL)
                .breakByHand(true)
                .sounds(BlockSoundGroup.GRAVEL)
                .strength(0.6f, 1.5f));
    }
}