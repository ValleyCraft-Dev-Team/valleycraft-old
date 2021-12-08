package net.linkle.valley.Registry.Blocks.Plants.Cave;

import net.linkle.valley.Registry.Commons.BlockWithWater;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class CrystalBlock extends BlockWithWater {
    protected static final VoxelShape SHAPE = createCuboidShape(1, 0, 1, 15, 15, 15);

    private final boolean isRedstone;

    public CrystalBlock(Settings settings, boolean isRedstone) {
        super(settings);
        setDefaultState();
        this.isRedstone = isRedstone;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public boolean emitsRedstonePower(BlockState state) {
        return isRedstone;
    }

    @Override
    public int getWeakRedstonePower(BlockState state, BlockView world, BlockPos pos, Direction direction) {
        return isRedstone ? 15 : 0;
    }
}