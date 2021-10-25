package net.linkle.valley.Registry.WeaponsAndTools.Totems;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

public abstract class AbstractTotemBase extends Item {
    
    public static final int MAX_DURATION = 24000;

    public AbstractTotemBase(Settings settings) {
        super(settings);
    }
    
    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        PlayerEntity playerEntity = user instanceof PlayerEntity ? (PlayerEntity)user : null;
        if (playerEntity instanceof ServerPlayerEntity serverEntity) {
            Criteria.CONSUME_ITEM.trigger(serverEntity, stack);
        }
        
        showFloatingItem(world, user);

        if (playerEntity != null) {
            playerEntity.incrementStat(Stats.USED.getOrCreateStat(this));
            if (!playerEntity.getAbilities().creativeMode) {
                stack.decrement(1);
            }
        }

        return stack.isEmpty() ? new ItemStack(Items.AIR, 0) : stack;
    }
    
    @Override
    public int getMaxUseTime(ItemStack stack) {
        return 1;
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.BLOCK;
    }
    
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!canSetWeather(world)) {
            return TypedActionResult.pass(user.getStackInHand(hand));
        }
        
        if (world instanceof ServerWorld serverWorld) {
            setWeather(serverWorld);
        }

        return ItemUsage.consumeHeldItem(world, user, hand);
    }
    
    protected void showFloatingItem(World world, LivingEntity user) {
        if (world.isClient) {
            var client = MinecraftClient.getInstance();
            client.particleManager.addEmitter(user, ParticleTypes.TOTEM_OF_UNDYING, 30);
            if (user == client.player) {
                client.gameRenderer.showFloatingItem(new ItemStack(this));
            }
        } else {
            world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.ITEM_TOTEM_USE, user.getSoundCategory(), 1, 1);
        }
    }
    
    public abstract boolean canSetWeather(World world);
    
    public abstract void setWeather(ServerWorld world);
}
