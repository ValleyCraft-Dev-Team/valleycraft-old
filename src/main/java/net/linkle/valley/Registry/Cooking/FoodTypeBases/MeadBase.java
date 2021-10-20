package net.linkle.valley.Registry.Cooking.FoodTypeBases;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

import static net.linkle.valley.Registry.Initializers.Furniture.MUG_BLOCK;

public class MeadBase extends Item {
    public MeadBase(Settings settings) {
        super(settings);
    }

    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack itemStack = super.finishUsing(stack, world, user);
        return user instanceof PlayerEntity && ((PlayerEntity)user).getAbilities().creativeMode ? itemStack : new ItemStack(MUG_BLOCK);
    }

    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }

}
