package net.linkle.valley.Registry.Blocks.Plants.Decorative;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

import static net.linkle.valley.Registry.Initializers.Furniture.HANGING;
import static net.linkle.valley.Registry.Initializers.FurnitureCont.PLANTER;

public class DriftBlock extends PlantBlock {
    protected static final VoxelShape SHAPE = Block.createCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 1.0D, 14.0D);

    public DriftBlock() {
        super(FabricBlockSettings.of(Material.LEAVES)
                .breakByHand(true)
                .sounds(BlockSoundGroup.WOOD)
                .strength(0, 0.5f));
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        Block block = floor.getBlock();
        return block == Blocks.GRASS_BLOCK ||
                block == Blocks.DIRT ||
                block == Blocks.COARSE_DIRT ||
                block == Blocks.PODZOL ||
                block == Blocks.FARMLAND ||
                block == PLANTER ||
                block == Blocks.GRAVEL ||
                block == Blocks.SOUL_SAND ||
                block == HANGING ||
                block == Blocks.SOUL_SOIL;
    }

    public static final VoxelShape BlockCollisionShape;

    public VoxelShape getCollisionShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return BlockCollisionShape;
    }

    static {
        BlockCollisionShape = VoxelShapes.empty();
    }
}
