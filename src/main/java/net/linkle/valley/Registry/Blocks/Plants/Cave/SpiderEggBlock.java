package net.linkle.valley.Registry.Blocks.Plants.Cave;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.PlantBlock;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.CaveSpiderEntity;
import net.minecraft.entity.mob.SilverfishEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.minecraft.world.explosion.Explosion;

import java.util.Iterator;
import java.util.Random;

public class SpiderEggBlock extends Block {

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
}
