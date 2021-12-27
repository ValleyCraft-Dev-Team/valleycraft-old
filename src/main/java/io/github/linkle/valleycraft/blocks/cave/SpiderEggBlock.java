package io.github.linkle.valleycraft.blocks.cave;

import io.github.linkle.valleycraft.criterions.VCriteria;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShapeContext;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.*;
import net.minecraft.world.explosion.Explosion;

import java.util.Objects;
import java.util.Random;

public class SpiderEggBlock extends Block {

    private static final VoxelShape SHAPE = Block.createCuboidShape(3, 0, 3, 13, 11, 13);

    public SpiderEggBlock(Settings settings) {
        super(settings);
    }

    private void spawnCaveSpider(ServerWorld world, BlockPos pos) {
        int randomSpiderAmount = MathHelper.nextBetween(world.random, 1, 3);
        for (int i = 0; i < randomSpiderAmount; i++) {
            var entity = EntityType.CAVE_SPIDER.create(world);
            Objects.requireNonNull(entity).refreshPositionAndAngles(pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5, 0, 0);
            world.spawnEntity(entity);
            entity.playSpawnEffects();
        }

        var player = world.getClosestPlayer(pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, 16, false);
        if (player != null) {
            VCriteria.SPIDER_SPAWN.trigger((ServerPlayerEntity)player);
        }
    }
    
    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (state.canPlaceAt(world, pos)) {
            return state;
        }
        
        return Blocks.AIR.getDefaultState();
    }

    @Override
    public void onStacksDropped(BlockState state, ServerWorld world, BlockPos pos, ItemStack stack) {
        super.onStacksDropped(state, world, pos, stack);
        if (world.getGameRules().getBoolean(GameRules.DO_TILE_DROPS) && EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, stack) == 0) {
            spawnCaveSpider(world, pos);
        }
    }

    @Override
    public void onDestroyedByExplosion(World world, BlockPos pos, Explosion explosion) {
        if (world instanceof ServerWorld server) {
            spawnCaveSpider(server, pos);
        }
    }
    
    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        tryBreakEgg(world, pos, 100);
        super.onSteppedOn(world, pos, state, entity);
    }
    @Override
    public void onLandedUpon(World world, BlockState state, BlockPos pos, Entity entity, float fallDistance) {
        tryBreakEgg(world, pos, 3);
        super.onLandedUpon(world, state, pos, entity, fallDistance);
    }
    
    private void tryBreakEgg(World world, BlockPos pos, int inverseChance) {
        if (world.random.nextInt(inverseChance) == 0 && world instanceof ServerWorld server) {
            world.breakBlock(pos, false);
            spawnCaveSpider(server, pos);
        }
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (random.nextInt(20) == 0) {
            int num = 5;
            for (var blockPos : BlockPos.iterate(pos.add(-4, -1, -4), pos.add(4, 1, 4))) {
                if (world.getBlockState(blockPos).isOf(this)) {
                    if (--num <= 0) {
                        return;
                    }
                }
            }

            var blockPos = pos.add(random.nextInt(3) - 1, random.nextInt(2) - random.nextInt(2), random.nextInt(3) - 1);

            for (int k = 0; k < 4; ++k) {
                if (world.isAir(blockPos) && state.canPlaceAt(world, blockPos)) {
                    pos = blockPos;
                }

                blockPos = pos.add(random.nextInt(3) - 1, random.nextInt(2) - random.nextInt(2), random.nextInt(3) - 1);
            }

            if (world.isAir(blockPos) && state.canPlaceAt(world, blockPos)) {
                world.setBlockState(blockPos, state, 2);
            }
        }
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        var blockPos = pos.down();
        var blockState = world.getBlockState(blockPos);
        return blockState.isFullCube(world, blockPos);
    }

}