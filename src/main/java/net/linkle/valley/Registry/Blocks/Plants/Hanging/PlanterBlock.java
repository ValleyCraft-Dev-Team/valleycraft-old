package net.linkle.valley.Registry.Blocks.Plants.Hanging;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.FarmlandBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class PlanterBlock extends Block {
    public PlanterBlock() {
        super(FabricBlockSettings.of(Material.WOOD)
                .breakByTool(FabricToolTags.AXES)
                .breakByHand(true)
                .sounds(BlockSoundGroup.WOOD).nonOpaque()
                .strength(2, 2));
    }
}
