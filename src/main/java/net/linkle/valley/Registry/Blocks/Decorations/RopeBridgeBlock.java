package net.linkle.valley.Registry.Blocks.Decorations;

import net.linkle.valley.Registry.Commons.HorizontalWithWaterBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class RopeBridgeBlock extends HorizontalWithWaterBlock {

    protected static final VoxelShape BASEPLATE_SHAPE_X_AXIS;
    protected static final VoxelShape BASEPLATE_SHAPE_Z_AXIS;
    protected static final VoxelShape ROPE_LEFT_X_SHAPE;
    protected static final VoxelShape ROPE_RIGHT_X_SHAPE;
    protected static final VoxelShape ROPE_LEFT_Z_SHAPE;
    protected static final VoxelShape ROPE_RIGHT_Z_SHAPE;
    protected static final VoxelShape Z_AXIS_SHAPE;
    protected static final VoxelShape X_AXIS_SHAPE;

    public RopeBridgeBlock(Settings settings) {
        super(settings);
        setDefaultState(stateManager.getDefaultState().with(FACING, Direction.NORTH).with(WATERLOGGED, false));
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction direction = state.get(FACING);
        return direction.getAxis() == Direction.Axis.X ? X_AXIS_SHAPE : Z_AXIS_SHAPE;
    }

    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return true;
    }
    
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        var placeState = super.getPlacementState(ctx);
        var world = ctx.getWorld();
        var pos = ctx.getBlockPos();
        for (int i = 0; i < 4; i++) {
            var face = Direction.fromHorizontal(i);
            var state = world.getBlockState(pos.offset(face));
            if (state.getBlock() instanceof RopeBridgeBlock) {
                if (face.getAxis() == state.get(FACING).getAxis()) {
                    return placeState.with(FACING, face);
                }
            }
        }
        return placeState;
    }

    static {
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
