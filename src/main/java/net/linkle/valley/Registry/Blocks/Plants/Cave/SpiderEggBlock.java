package net.linkle.valley.Registry.Blocks.Plants.Cave;

import net.minecraft.block.*;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.CaveSpiderEntity;
import net.minecraft.entity.mob.SilverfishEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.minecraft.world.explosion.Explosion;

import java.util.Iterator;
import java.util.Random;

public class SpiderEggBlock extends Block {

    private static final VoxelShape SHAPE = Block.createCuboidShape(3, 0, 3, 13, 11, 13);

    public SpiderEggBlock(Settings settings) {
        super(settings);
    }

    private void spawnCaveSpider(ServerWorld world, BlockPos pos) {
        CaveSpiderEntity caveSpiderEntity = (CaveSpiderEntity)EntityType.CAVE_SPIDER.create(world);
        caveSpiderEntity.refreshPositionAndAngles((double)pos.getX() + 0.5D, (double)pos.getY(), (double)pos.getZ() + 0.5D, 0.0F, 0.0F);
        world.spawnEntity(caveSpiderEntity);
        caveSpiderEntity.playSpawnEffects();
    }

    public void onStacksDropped(BlockState state, ServerWorld world, BlockPos pos, ItemStack stack) {
        super.onStacksDropped(state, world, pos, stack);
        if (world.getGameRules().getBoolean(GameRules.DO_TILE_DROPS) && EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, stack) == 0) {
            this.spawnCaveSpider(world, pos);
        }

    }

    public void onDestroyedByExplosion(World world, BlockPos pos, Explosion explosion) {
        if (world instanceof ServerWorld) {
            this.spawnCaveSpider((ServerWorld)world, pos);
        }

    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    // mushy stuff
    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (random.nextInt(25) == 0) {
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

    public boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOpaqueFullCube(world, pos);
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        var blockPos = pos.down();
        var blockState = world.getBlockState(blockPos);
        if (blockState.isIn(BlockTags.MUSHROOM_GROW_BLOCK)) {
            return true;
        } else {
            return world.getBaseLightLevel(pos, 0) > 7 && canPlantOnTop(blockState, world, blockPos);
        }
    }
}
