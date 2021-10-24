package net.linkle.valley.Registry.Blocks.Decorations;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.linkle.valley.Registry.Initializers.Furniture;
import net.minecraft.block.Material;
import net.minecraft.block.StairsBlock;
import net.minecraft.sound.BlockSoundGroup;

public class TileStairsBlock extends StairsBlock {
    public TileStairsBlock() {
        super(Furniture.SMOOTH_STONE_TILE.getDefaultState(), FabricBlockSettings.of(Material.STONE)
                .breakByTool(FabricToolTags.PICKAXES)
                .breakByHand(false)
                .sounds(BlockSoundGroup.STONE)
                .strength(1, 2));
    }
}