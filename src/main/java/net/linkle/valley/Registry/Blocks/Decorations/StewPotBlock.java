package net.linkle.valley.Registry.Blocks.Decorations;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.linkle.valley.Registry.Commons.HorizontalWithWaterBlock;
import net.minecraft.block.*;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class StewPotBlock extends HorizontalWithWaterBlock {
    protected static final VoxelShape SHAPE = Block.createCuboidShape(4, 0, 4, 12, 5, 12);

    public StewPotBlock() {
        super(FabricBlockSettings.of(Material.WOOD)
                .breakByHand(true)
                .sounds(BlockSoundGroup.WOOD)
                .strength(0.5f, 2.5f));
        setDefaultState(stateManager.getDefaultState().with(WATERLOGGED, false).with(FACING, Direction.NORTH));
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }
}

