package io.github.linkle.valleycraft.blocks.decorations;

import java.util.Random;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ChainBlock;
import net.minecraft.block.Oxidizable;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

public class OxidizableChainBlock extends ChainBlock implements Oxidizable {
    
    private final OxidationLevel level;

    public OxidizableChainBlock(OxidationLevel level, Settings settings) {
        super(settings);
        this.level = level;
    }
    
    public OxidizableChainBlock(OxidationLevel level) {
        this(level, Settings.copy(Blocks.CHAIN));
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        tickDegradation(state, world, pos, random);
    }

    @Override
    public boolean hasRandomTicks(BlockState state) {
        return Oxidizable.getIncreasedOxidationBlock(state.getBlock()).isPresent();
    }

    @Override
    public OxidationLevel getDegradationLevel() {
        return this.level;
    }
}
