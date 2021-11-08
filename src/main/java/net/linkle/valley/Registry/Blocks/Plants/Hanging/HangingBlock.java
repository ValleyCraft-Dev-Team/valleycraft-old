package net.linkle.valley.Registry.Blocks.Plants.Hanging;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.linkle.valley.Registry.Commons.HorizontalWithWaterBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class HangingBlock extends HorizontalWithWaterBlock {
    private static final VoxelShape SHAPE = Block.createCuboidShape(3, 12, 3, 13, 17, 13);
    
    public HangingBlock() {
        super(FabricBlockSettings.of(Material.GLASS)
                .breakByHand(true)
                .sounds(BlockSoundGroup.GLASS)
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

