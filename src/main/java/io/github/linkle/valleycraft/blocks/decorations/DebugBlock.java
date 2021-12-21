package io.github.linkle.valleycraft.blocks.decorations;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class DebugBlock extends Block {
    public DebugBlock() {
        super(FabricBlockSettings.of(Material.WOOD)
                //.breakByTool(FabricToolTags.AXES)
                .breakByHand(false)
                .sounds(BlockSoundGroup.WOOD)
                .strength(1, 1f));
    }
}
