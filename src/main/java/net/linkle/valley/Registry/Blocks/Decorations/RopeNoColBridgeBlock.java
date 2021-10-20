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

public class RopeNoColBridgeBlock extends Block implements Waterloggable {

    public static final BooleanProperty WATERLOGGED;
    public static final DirectionProperty FACING;
    protected static final VoxelShape BASEPLATE_SHAPE_X_AXIS;
    protected static final VoxelShape BASEPLATE_SHAPE_Z_AXIS;
    protected static final VoxelShape ROPE_LEFT_X_SHAPE;
    protected static final VoxelShape ROPE_RIGHT_X_SHAPE;
    protected static final VoxelShape ROPE_LEFT_Z_SHAPE;
    protected static final VoxelShape ROPE_RIGHT_Z_SHAPE;
    protected static final VoxelShape Z_AXIS_SHAPE;
    protected static final VoxelShape X_AXIS_SHAPE;

    public RopeNoColBridgeBlock(Settings settings) {
        super(settings);
        this.setDefaultState((BlockState)((BlockState)this.stateManager.getDefaultState()).with(FACING, Direction.NORTH).with(WATERLOGGED, false));
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction direction = (Direction)state.get(FACING);
        return direction.getAxis() == Direction.Axis.X ? X_AXIS_SHAPE : Z_AXIS_SHAPE;
    }

    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return VoxelShapes.empty();
    }

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return (BlockState)this.getDefaultState().with(FACING, ctx.getPlayerFacing());
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{FACING, WATERLOGGED});
    }

    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return true;
    }

    static {
        WATERLOGGED = Properties.WATERLOGGED;
        FACING = HorizontalFacingBlock.FACING;
        BASEPLATE_SHAPE_X_AXIS =  Block.createCuboidShape(1,-2,1,15, 1, 15);
        BASEPLATE_SHAPE_Z_AXIS =  Block.createCuboidShape(1,-2,1,15, 1, 15);
        ROPE_LEFT_X_SHAPE = Block.createCuboidShape(0,0,0,1,12,16);
        ROPE_RIGHT_X_SHAPE = Block.createCuboidShape(15,0,0,16,12,16);
        ROPE_LEFT_Z_SHAPE = Block.createCuboidShape(0,0,0,16,12,1);
        ROPE_RIGHT_Z_SHAPE = Block.createCuboidShape(0,0,15,16,12,16);
        X_AXIS_SHAPE = VoxelShapes.union(BASEPLATE_SHAPE_X_AXIS, new VoxelShape[]{ROPE_LEFT_Z_SHAPE, ROPE_RIGHT_Z_SHAPE});
        Z_AXIS_SHAPE = VoxelShapes.union(BASEPLATE_SHAPE_Z_AXIS, new VoxelShape[]{ROPE_LEFT_X_SHAPE, ROPE_RIGHT_X_SHAPE});
    }
}
