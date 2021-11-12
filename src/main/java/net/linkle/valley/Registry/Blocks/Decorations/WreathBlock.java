package net.linkle.valley.Registry.Blocks.Decorations;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.linkle.valley.Registry.Commons.DirectionBlockWithWater;
import net.minecraft.block.*;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class WreathBlock extends DirectionBlockWithWater {
    protected static final VoxelShape EAST_SHAPE;
    protected static final VoxelShape WEST_SHAPE;
    protected static final VoxelShape SOUTH_SHAPE;
    protected static final VoxelShape NORTH_SHAPE;
    protected static final VoxelShape UP_SHAPE;
    protected static final VoxelShape DOWN_SHAPE;

    public WreathBlock() {
        super(FabricBlockSettings.of(Material.LEAVES)
                .breakByHand(true)
                .sounds(BlockSoundGroup.GRASS)
                .strength(0.5f, 0.5f));
        setDefaultState(stateManager.getDefaultState().with(WATERLOGGED, false).with(FACING, Direction.NORTH));
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
            case UP:
                return UP_SHAPE;
            case DOWN:
            default:
                return DOWN_SHAPE;
        }
    }

    @Override
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }

    static {
        UP_SHAPE = Block.createCuboidShape(2.0D, 0.0D, 0.0D, 14.0D, 12.0D, 1.0D);
        DOWN_SHAPE = Block.createCuboidShape(2.0D, 0.0D, 0.0D, 14.0D, 12.0D, 1.0D);
        WEST_SHAPE = Block.createCuboidShape(0.0D, 0.0D, 2.0D, 1.0D, 12.0D, 14.0D);
        EAST_SHAPE = Block.createCuboidShape(15.0D, 0.0D, 2.0D, 16.0D, 12.0D, 15.0D);
        NORTH_SHAPE = Block.createCuboidShape(2.0D, 0.0D, 0.0D, 14.0D, 12.0D, 1.0D);
        SOUTH_SHAPE = Block.createCuboidShape(2.0D, 0.0D, 15.0D, 14.0D, 12.0D, 16.0D);
    }
}

