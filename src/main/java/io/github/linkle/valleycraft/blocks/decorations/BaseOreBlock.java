package io.github.linkle.valleycraft.blocks.decorations;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;

public class BaseOreBlock extends OreBlock {
    public BaseOreBlock(Block targetBlock) {
        super(FabricBlockSettings.copyOf(targetBlock));
    }
}
