package net.linkle.valley.Registry.Blocks.Plants.Decorative;

import java.util.Random;

import net.linkle.valley.Registry.Initializers.Plants;
import net.minecraft.block.AbstractPlantStemBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.VineLogic;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;

public class MossVinesBlock extends AbstractPlantStemBlock {
    private static final VoxelShape SHAPE = Block.createCuboidShape(4.0D, 9.0D, 4.0D, 12.0D, 16.0D, 12.0D);

    public MossVinesBlock(Settings settings) {
        super(settings, Direction.DOWN, SHAPE, false, 0.1D);
    }

    @Override
    protected int getGrowthLength(Random random) {
        return VineLogic.getGrowthLength(random);
    }
    
    @Override
    protected Block getPlant() {
        return Plants.MOSSY_VINE_PLANT;
    }

    @Override
    protected boolean chooseStemState(BlockState state) {
        return VineLogic.isValidForWeepingStem(state);
    }
}
