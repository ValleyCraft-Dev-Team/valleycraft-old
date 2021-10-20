package net.linkle.valley.Registry.Blocks.Plants.Decorative;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

import static net.linkle.valley.Registry.Initializers.Furniture.HANGING;
import static net.linkle.valley.Registry.Initializers.FurnitureCont.PLANTER;

public class RoseBush extends PlantBlock {
    protected static final VoxelShape SHAPE = Block.createCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 13.0D, 14.0D);

    public RoseBush() {
        super(FabricBlockSettings.of(Material.LEAVES)
                .breakByTool(FabricToolTags.SHEARS)
                .breakByHand(true)
                .sounds(BlockSoundGroup.GRASS)
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
