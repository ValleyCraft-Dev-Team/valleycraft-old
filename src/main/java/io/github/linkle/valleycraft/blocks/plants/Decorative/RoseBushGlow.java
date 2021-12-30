package io.github.linkle.valleycraft.blocks.plants.Decorative;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.PlantBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class RoseBushGlow extends PlantBlock {
    protected static final VoxelShape SHAPE = Block.createCuboidShape(2, 0, 2, 14, 13, 14);

    public RoseBushGlow() {
        super(FabricBlockSettings.of(Material.PLANT)
                .sounds(BlockSoundGroup.GRASS)
                .luminance(8)
                .strength(0, 0.5f)
                .noCollision());
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        Block block = floor.getBlock();
        return  floor.isIn(BlockTags.DIRT) ||
                block == Blocks.FARMLAND ||
                block == Blocks.GRAVEL ||
                block == Blocks.SOUL_SAND ||
                block == Blocks.SOUL_SOIL;
    }
}
