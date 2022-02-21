package io.github.linkle.valleycraft.blocks.decorations;

import java.util.function.Predicate;

import io.github.linkle.valleycraft.blocks.HorizontalWithWaterBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.EntityShapeContext;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
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

    protected static final VoxelShape SHAPE = createCuboidShape(0, 0, 0, 16, 10, 16);

    public RopeBridgeBlock(Settings settings) {
        super(settings);
        setDefaultState();
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        if (context.isHolding(state.getBlock().asItem())) {
            return SHAPE;
        }

        if (context instanceof EntityShapeContext entityContext && entityContext.getEntity() instanceof LivingEntity entity) {
            Predicate<ItemStack> predicate = stack -> {
                return stack.getItem() instanceof BlockItem blockItem && blockItem.getBlock() instanceof RopeBridgeBlock;
            };
            if (entity.isHolding(predicate)) {
                return SHAPE;
            }
        }

        final Direction direction = state.get(FACING);
        return direction.getAxis() == Direction.Axis.X ? X_AXIS_SHAPE : Z_AXIS_SHAPE;
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        if (collidable) {
            final Direction direction = state.get(FACING);
            return direction.getAxis() == Direction.Axis.X ? X_AXIS_SHAPE : Z_AXIS_SHAPE;
        }

        return VoxelShapes.empty();
    }

    @Override
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return true;
    }

    @Override
    protected Direction getFacing(ItemPlacementContext ctx) {
        var world = ctx.getWorld();
        var pos = ctx.getBlockPos();
        for (int i = 0; i < 4; i++) {
            var face = Direction.fromHorizontal(i);
            var state = world.getBlockState(pos.offset(face));
            if (state.getBlock() instanceof RopeBridgeBlock) {
                if (face.getAxis() == state.get(FACING).getAxis()) {
                    return face;
                }
            }
        }
        return super.getFacing(ctx);
    }

    static {
        BASEPLATE_SHAPE_X_AXIS =  Block.createCuboidShape(1, -1, 1, 15, 1, 15);
        BASEPLATE_SHAPE_Z_AXIS =  Block.createCuboidShape(1, -1, 1, 15, 1, 15);
        ROPE_LEFT_X_SHAPE = Block.createCuboidShape(0.5, 0, 0, 1.5, 12, 16);
        ROPE_RIGHT_X_SHAPE = Block.createCuboidShape(14.5, 0, 0, 15.5, 12, 16);
        ROPE_LEFT_Z_SHAPE = Block.createCuboidShape(0, 0, 0.5, 16, 12, 1.5);
        ROPE_RIGHT_Z_SHAPE = Block.createCuboidShape(0, 0, 14.5, 16, 12, 15.5);
        X_AXIS_SHAPE = VoxelShapes.union(BASEPLATE_SHAPE_X_AXIS, ROPE_LEFT_Z_SHAPE, ROPE_RIGHT_Z_SHAPE);
        Z_AXIS_SHAPE = VoxelShapes.union(BASEPLATE_SHAPE_Z_AXIS, ROPE_LEFT_X_SHAPE, ROPE_RIGHT_X_SHAPE);
    }
}
