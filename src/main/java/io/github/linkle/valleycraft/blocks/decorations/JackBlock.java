package io.github.linkle.valleycraft.blocks.decorations;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.CarvedPumpkinBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class JackBlock extends CarvedPumpkinBlock {
    public JackBlock() {
        super(FabricBlockSettings.of(Material.GOURD)
                .luminance(15)
                .sounds(BlockSoundGroup.WOOD)
                .strength(1f, 1.0f));
    }
}
