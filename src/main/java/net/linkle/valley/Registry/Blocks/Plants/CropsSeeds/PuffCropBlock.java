package net.linkle.valley.Registry.Blocks.Plants.CropsSeeds;

import net.minecraft.block.*;
import net.minecraft.item.ItemConvertible;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;

import javax.swing.text.html.BlockView;

import static net.linkle.valley.Registry.Initializers.Crops.PUFF_SEEDS;

public class PuffCropBlock extends CropBlock {
    private static final VoxelShape[] AGE_TO_SHAPE = new VoxelShape[]{Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D),
            Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.0D, 16.0D),
            Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D),
            Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 5.0D, 16.0D),
            Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D),
            Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 7.0D, 16.0D),
            Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D),
            Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 9.0D, 16.0D)

    };

    public PuffCropBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    public ItemConvertible getSeedsItem() {
        return PUFF_SEEDS;
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return AGE_TO_SHAPE[(Integer)state.get(this.getAgeProperty())];
    }
}
