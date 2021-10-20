package net.linkle.valley.Registry.Blocks.Plants;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

import java.util.Iterator;
import java.util.Random;

public class CactusBlock extends FacingBlock {
    public static final VoxelShape COLLISION_SHAPE;
    public static final VoxelShape OUTLINE_SHAPE;
    protected static final VoxelShape EAST_SHAPE;
    protected static final VoxelShape WEST_SHAPE;
    protected static final VoxelShape SOUTH_SHAPE;
    protected static final VoxelShape NORTH_SHAPE;
    protected static final VoxelShape UP_SHAPE;
    protected static final VoxelShape DOWN_SHAPE;

    public CactusBlock(FabricBlockSettings strength) {
        super(FabricBlockSettings.of(Material.LEAVES).nonOpaque()
                .breakByHand(true)
                .sounds(BlockSoundGroup.BAMBOO_SAPLING)
                .strength(0.4f, 0.1f));
        this.setDefaultState((BlockState)((BlockState)this.stateManager.getDefaultState()).with(FACING, Direction.NORTH));
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        switch ((Direction)state.get(FACING)) {
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

    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return (BlockState)super.getPlacementState(ctx).with(FACING, ctx.getPlayerLookDirection().getOpposite());
    }

    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!state.canPlaceAt(world, pos)) {
            world.breakBlock(pos, true);
        }

    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return COLLISION_SHAPE;
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState newState, WorldAccess world, BlockPos pos, BlockPos posFrom) {
        if (!state.canPlaceAt(world, pos)) {
            world.getBlockTickScheduler().schedule(pos, this, 1);
        }

        return super.getStateForNeighborUpdate(state, direction, newState, world, pos, posFrom);
    }

    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        Iterator var4 = Direction.Type.HORIZONTAL.iterator();

        Direction direction;
        Material material;
        do {
            if (!var4.hasNext()) {
                BlockState blockState2 = world.getBlockState(pos.down());
                return (blockState2.isOf(Blocks.SAND) || blockState2.isOf(Blocks.RED_SAND)) && !world.getBlockState(pos.up()).getMaterial().isLiquid();
            }

            direction = (Direction)var4.next();
            BlockState blockState = world.getBlockState(pos.offset(direction));
            material = blockState.getMaterial();
        } while(!material.isSolid() && !world.getFluidState(pos.offset(direction)).isIn(FluidTags.LAVA));

        return false;
    }

    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        entity.damage(DamageSource.CACTUS, 2.0F);
    }

    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }

    static {
        COLLISION_SHAPE = Block.createCuboidShape(1.0D, 0.0D, 1.0D, 15.0D, 15.0D, 15.0D);
        OUTLINE_SHAPE = Block.createCuboidShape(1.0D, 0.0D, 1.0D, 15.0D, 16.0D, 15.0D);
        UP_SHAPE = Block.createCuboidShape(1.0D, 0.0D, 1.0D, 15.0D, 16.0D, 15.0D);
        DOWN_SHAPE = Block.createCuboidShape(1.0D, 0.0D, 1.0D, 15.0D, 16.0D, 15.0D);
        EAST_SHAPE = Block.createCuboidShape(1.0D, 0.0D, 1.0D, 15.0D, 16.0D, 15.0D);
        WEST_SHAPE = Block.createCuboidShape(1.0D, 0.0D, 1.0D, 15.0D, 16.0D, 15.0D);
        NORTH_SHAPE = Block.createCuboidShape(1.0D, 0.0D, 1.0D, 15.0D, 16.0D, 15.0D);
        SOUTH_SHAPE = Block.createCuboidShape(1.0D, 0.0D, 1.0D, 15.0D, 16.0D, 15.0D);
    }
}
