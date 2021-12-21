package io.github.linkle.valleycraft.blocks.decorations;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import io.github.linkle.valleycraft.blocks.DirectionBlockWithWater;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class AnchorBlock extends DirectionBlockWithWater {
    protected static final VoxelShape EAST_SHAPE;
    protected static final VoxelShape WEST_SHAPE;
    protected static final VoxelShape SOUTH_SHAPE;
    protected static final VoxelShape NORTH_SHAPE;
    protected static final VoxelShape UP_SHAPE;
    protected static final VoxelShape DOWN_SHAPE;

    public AnchorBlock() {
        super(FabricBlockSettings.of(Material.METAL)
                .breakByHand(false)
                .sounds(BlockSoundGroup.CHAIN).nonOpaque()
                .strength(2f, 2f));
        setDefaultState();
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case NORTH -> NORTH_SHAPE;
            case SOUTH -> SOUTH_SHAPE;
            case WEST -> WEST_SHAPE;
            case EAST ->  EAST_SHAPE;
            case UP -> UP_SHAPE;
            case DOWN -> DOWN_SHAPE;
        };
    }

    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }

    static {
        var side = Block.createCuboidShape(4, 0, 4, 12, 7, 12);
        var down = Block.createCuboidShape(3, 0, 3, 13, 2, 13);
        
        UP_SHAPE = side;
        DOWN_SHAPE = down;
        EAST_SHAPE = side;
        WEST_SHAPE = side;
        NORTH_SHAPE = side;
        SOUTH_SHAPE = side;
    }
}
