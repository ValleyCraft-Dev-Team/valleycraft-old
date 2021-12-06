package net.linkle.valley.Registry.Blocks.Plants.Decorative;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.PlantBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class Plant extends PlantBlock {
    private static final VoxelShape SHAPE = Block.createCuboidShape(3, 0, 3, 13, 12, 13);
    private static final Settings SETTINGS = Settings.copy(Blocks.POPPY);

    public Plant() {
        super(SETTINGS);
    }
    
    public Plant(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
