package io.github.linkle.valleycraft.blocks.plants;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import io.github.linkle.valleycraft.blocks.BlockWithWater;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.ShapeContext;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public class RockBlock extends BlockWithWater {
    protected static final VoxelShape SHAPE = Block.createCuboidShape(1, 0, 1, 15, 1, 15);

    public RockBlock() {
        super(FabricBlockSettings.of(Material.DECORATION)
                .breakByHand(false)
                .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                .strength(0.5f, 2.5f));
        setDefaultState();
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        return !state.canPlaceAt(world, pos) ? Blocks.AIR.getDefaultState() : super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        pos = pos.down();
        state = world.getBlockState(pos);
        return state.isSideSolidFullSquare(world, pos, Direction.UP) && !state.isIn(BlockTags.ICE);
    }
}

