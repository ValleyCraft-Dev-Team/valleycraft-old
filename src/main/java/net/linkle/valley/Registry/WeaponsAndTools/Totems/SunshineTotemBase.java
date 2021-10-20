package net.linkle.valley.Registry.WeaponsAndTools.Totems;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

public class SunshineTotemBase extends Item {
    public SunshineTotemBase(Settings settings) {
        super(settings);
    }

    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        PlayerEntity playerEntity = user instanceof PlayerEntity ? (PlayerEntity)user : null;
        if (playerEntity instanceof ServerPlayerEntity) {
            Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity)playerEntity, stack);
        }

        if (playerEntity != null) {
            playerEntity.incrementStat(Stats.USED.getOrCreateStat(this));
            if (!playerEntity.getAbilities().creativeMode) {
                stack.decrement(1);
            }
        }

        return stack.isEmpty() ? new ItemStack(Items.AIR, 0) : stack;
    }

    public int getMaxUseTime(ItemStack stack) {
        return 1;
    }

    public UseAction getUseAction(ItemStack stack) {
        return UseAction.BLOCK;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient) {
            ((ServerWorld)world).setWeather(24000, 0, false, false);
        }

        return ItemUsage.consumeHeldItem(world, user, hand);
    }
}