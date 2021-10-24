package net.linkle.valley.Registry.WeaponsAndTools.Totems;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;

public class RuneTotemBase extends AbstractTotemBase {
    public RuneTotemBase(Settings settings) {
        super(settings);
    }

    @Override
    public boolean canSetWeather(World world) {
        return world.isRaining();
    }

    @Override
    public void setWeather(ServerWorld world) {
        world.setWeather(MAX_DURATION, 0, false, false);
    }

    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack itemStack = super.finishUsing(stack, world, user);
        return user instanceof PlayerEntity && ((PlayerEntity)user).getAbilities().creativeMode ? itemStack : new ItemStack();
    }
}