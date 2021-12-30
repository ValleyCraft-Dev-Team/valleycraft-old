package io.github.linkle.valleycraft.blocks.decorations;

import net.minecraft.block.Blocks;
import net.minecraft.block.ChainBlock;

public class VChainBlock extends ChainBlock {
    public VChainBlock(Settings settings) {
        super(settings);
    }
    
    public VChainBlock() {
        super(Settings.copy(Blocks.CHAIN));
    }
}