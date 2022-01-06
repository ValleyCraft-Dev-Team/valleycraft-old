package io.github.linkle.valleycraft.blocks.entity;

import java.util.Random;

import org.jetbrains.annotations.Nullable;

import io.github.linkle.valleycraft.utils.Util;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricMaterialBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.MapColor;
import net.minecraft.block.Waterloggable;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager.Builder;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

public class CrabTrap extends BlockWithEntity implements Waterloggable {
    protected static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;
    
    public static BlockEntityType<CrabTrapEntity> BLOCK_ENTITY;

    public CrabTrap() {
        super(Settings.of(new FabricMaterialBuilder(MapColor.ORANGE).blocksPistons().build())
                .strength(1.5f, 2.0f)
                .sounds(BlockSoundGroup.WOOD)
                .nonOpaque());
        setDefaultState(stateManager.getDefaultState().with(WATERLOGGED, false));
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new CrabTrapEntity(pos, state);
    }
    
    @Override
    @Nullable
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return world.isClient ? null : Util.checkType(type, BLOCK_ENTITY, CrabTrapEntity::tick);
    }
    
    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }
    
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (world.isClient) {
            return ActionResult.SUCCESS;
        }
        var blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof CrabTrapEntity entity) {
            player.openHandledScreen(entity);
        }
        return ActionResult.CONSUME;
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack itemStack) {
        if (world.getBlockEntity(pos) instanceof CrabTrapEntity entity) {
            entity.checkValidation();
        }
    }
    
    @Override
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if (state.isOf(newState.getBlock())) {
            if (world.getBlockEntity(pos) instanceof CrabTrapEntity entity) {
                entity.checkValidation();
            }
            return;
        }
        var blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof CrabTrapEntity) {
            ItemScatterer.spawn(world, pos, (Inventory)blockEntity);
        }
        super.onStateReplaced(state, world, pos, newState, moved);
    }
    
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return super.getPlacementState(ctx).with(WATERLOGGED, Util.inWater(ctx));
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState newState,
            WorldAccess world, BlockPos pos, BlockPos posFrom) {
        if (state.get(WATERLOGGED)) {
            world.createAndScheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }

        return super.getStateForNeighborUpdate(state, direction, newState, world, pos, posFrom);
    }

    @Override
    protected void appendProperties(Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(WATERLOGGED);
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }
}