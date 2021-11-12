package net.linkle.valley.Registry.Blocks.Plants.Hanging;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.linkle.valley.Registry.Commons.BlockWithWater;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class PlanterBlockWater extends BlockWithWater {
    
    public PlanterBlockWater() {
        super(FabricBlockSettings.of(Material.WOOD)
                .breakByTool(FabricToolTags.AXES)
                .breakByHand(true)
                .sounds(BlockSoundGroup.WOOD).nonOpaque()
                .strength(2, 2));
        setDefaultState(stateManager.getDefaultState().with(WATERLOGGED, false));
    }
}
