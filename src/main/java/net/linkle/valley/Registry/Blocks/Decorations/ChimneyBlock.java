package net.linkle.valley.Registry.Blocks.Decorations;

import net.minecraft.block.*;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class ChimneyBlock extends Block implements Waterloggable {

    public static final BooleanProperty WATERLOGGED;
    protected static final VoxelShape ROPE_LEFT_X_SHAPE;
    protected static final VoxelShape ROPE_RIGHT_X_SHAPE;
    protected static final VoxelShape ROPE_LEFT_Z_SHAPE;
    protected static final VoxelShape ROPE_RIGHT_Z_SHAPE;
    protected static final VoxelShape FULL_SHAPE;

    public ChimneyBlock(Settings settings) {
        super(settings);
        this.setDefaultState((BlockState)((BlockState)this.stateManager.getDefaultState()).with(WATERLOGGED, false));
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return FULL_SHAPE;
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{WATERLOGGED});
    }

    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return true;
    }

    static {
        WATERLOGGED = Properties.WATERLOGGED;
        ROPE_LEFT_X_SHAPE = Block.createCuboidShape(0,0,0,1,16,16);
        ROPE_RIGHT_X_SHAPE = Block.createCuboidShape(15,0,0,16,16,16);
        ROPE_LEFT_Z_SHAPE = Block.createCuboidShape(0,0,0,16,16,1);
        ROPE_RIGHT_Z_SHAPE = Block.createCuboidShape(0,0,15,16,16,16);
        FULL_SHAPE = VoxelShapes.union(ROPE_LEFT_X_SHAPE, ROPE_RIGHT_X_SHAPE,ROPE_LEFT_Z_SHAPE, ROPE_RIGHT_Z_SHAPE);
    }
}
