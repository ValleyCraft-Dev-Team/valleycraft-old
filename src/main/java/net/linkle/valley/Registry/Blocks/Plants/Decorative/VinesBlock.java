package net.linkle.valley.Registry.Blocks.Plants.Decorative;

import java.util.Random;

import net.minecraft.block.AbstractPlantBlock;
import net.minecraft.block.AbstractPlantStemBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.VineLogic;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;

public class VinesBlock extends AbstractPlantStemBlock {
    private static final VoxelShape SHAPE = Block.createCuboidShape(4.0D, 9.0D, 4.0D, 12.0D, 16.0D, 12.0D);
    
    private Block plant;

    public VinesBlock(Settings settings) {
        super(settings, Direction.DOWN, SHAPE, false, 0.1D);
    }
    
    public void setPlant(AbstractPlantBlock plant) {
        this.plant = plant;
    }

    @Override
    protected int getGrowthLength(Random random) {
        return VineLogic.getGrowthLength(random);
    }
    
    @Override
    protected Block getPlant() {
        return plant;
    }

    @Override
    protected boolean chooseStemState(BlockState state) {
        return VineLogic.isValidForWeepingStem(state);
    }
}
