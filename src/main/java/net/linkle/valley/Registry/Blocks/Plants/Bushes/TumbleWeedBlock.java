package net.linkle.valley.Registry.Blocks.Plants.Bushes;

import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

import java.util.Iterator;
import java.util.Random;

import static net.linkle.valley.Registry.Initializers.Furniture.HANGING;
import static net.linkle.valley.Registry.Initializers.FurnitureCont.PLANTER;

public class TumbleWeedBlock extends PlantBlock {
    protected static final VoxelShape SHAPE = Block.createCuboidShape(3.0D, 0.0D, 3.0D, 13.0D, 10.0D, 13.0D);

    public TumbleWeedBlock(Settings settings) {
        super(settings);
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (random.nextInt(25) == 0) {
            int i = 5;
            boolean j = true;

            Iterator var7 = BlockPos.iterate(pos.add(-4, -1, -4), pos.add(4, 1, 4)).iterator();

            while (var7.hasNext()) {
                BlockPos blockPos = (BlockPos) var7.next();
                if (world.getBlockState(blockPos).isOf(this)) {
                    --i;
                    if (i <= 0) {
                        return;
                    }
                }
            }

            BlockPos blockPos2 = pos.add(random.nextInt(3) - 1, random.nextInt(2) - random.nextInt(2), random.nextInt(3) - 1);

            for (int k = 0; k < 4; ++k) {
                if (world.isAir(blockPos2) && state.canPlaceAt(world, blockPos2)) {
                    pos = blockPos2;
                }

                blockPos2 = pos.add(random.nextInt(3) - 1, random.nextInt(2) - random.nextInt(2), random.nextInt(3) - 1);
            }

            if (world.isAir(blockPos2) && state.canPlaceAt(world, blockPos2)) {
                world.setBlockState(blockPos2, state, 2);
            }
        }

    }

    public static final VoxelShape BlockCollisionShape;

    public VoxelShape getCollisionShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return BlockCollisionShape;
    }

    static {
        BlockCollisionShape = VoxelShapes.empty();
    }

    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        Block block = floor.getBlock();
        return block == Blocks.GRASS_BLOCK ||
                block == Blocks.DIRT ||
                block == Blocks.COARSE_DIRT ||
                block == Blocks.GRAVEL ||
                block == Blocks.PODZOL ||
                block == Blocks.FARMLAND ||
                block == Blocks.SAND ||
                block == Blocks.RED_SAND ||
                block == Blocks.NETHERRACK ||
                block == Blocks.SOUL_SAND ||
                block == Blocks.SNOW ||
                block == HANGING ||
                block == PLANTER ||
                block == Blocks.SOUL_SOIL;
    }
}
