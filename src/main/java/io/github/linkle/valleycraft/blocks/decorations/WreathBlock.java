package io.github.linkle.valleycraft.blocks.decorations;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import io.github.linkle.valleycraft.blocks.HorizontalWithWaterBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class WreathBlock extends HorizontalWithWaterBlock {
    protected static final VoxelShape EAST_SHAPE;
    protected static final VoxelShape WEST_SHAPE;
    protected static final VoxelShape SOUTH_SHAPE;
    protected static final VoxelShape NORTH_SHAPE;

    public WreathBlock() {
        super(FabricBlockSettings.of(Material.DECORATION)
                .breakByHand(true)
                .sounds(BlockSoundGroup.GRASS)
                .strength(0.2f, 0.5f));
        setDefaultState();
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        switch (state.get(FACING)) {
            case NORTH:
                return NORTH_SHAPE;
            case SOUTH:
                return SOUTH_SHAPE;
            case WEST:
                return WEST_SHAPE;
            case EAST:
                return EAST_SHAPE;
            default:
                return NORTH_SHAPE;
        }
    }
    
    @Override
    protected Direction getFacing(ItemPlacementContext ctx) {
        return getSideElseUserFacing(ctx);
    }

    @Override
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }

    static {
        WEST_SHAPE = Block.createCuboidShape(0, 0, 2, 1, 12, 14);
        EAST_SHAPE = Block.createCuboidShape(15, 0, 2, 16, 12, 14);
        NORTH_SHAPE = Block.createCuboidShape(2, 0, 0, 14, 12, 1);
        SOUTH_SHAPE = Block.createCuboidShape(2, 0, 15, 14, 12, 16);
    }
}

