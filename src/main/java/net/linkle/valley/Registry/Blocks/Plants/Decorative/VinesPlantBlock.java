package net.linkle.valley.Registry.Blocks.Plants.Decorative;

import net.minecraft.block.AbstractPlantBlock;
import net.minecraft.block.AbstractPlantStemBlock;
import net.minecraft.block.Block;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;

public class VinesPlantBlock extends AbstractPlantBlock {
    private static final VoxelShape SHAPE = Block.createCuboidShape(1.0D, 0.0D, 1.0D, 15.0D, 16.0D, 15.0D);

    private AbstractPlantStemBlock stem; 
    
    public VinesPlantBlock(Settings settings) {
        super(settings, Direction.DOWN, SHAPE, false);
    }
    
    public void setStem(AbstractPlantStemBlock stem) {
        this.stem = stem;
    }

    @Override
    protected AbstractPlantStemBlock getStem() {
        return stem;
    }
}
