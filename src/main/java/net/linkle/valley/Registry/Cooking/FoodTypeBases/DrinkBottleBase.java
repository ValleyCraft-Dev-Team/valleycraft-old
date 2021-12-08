package net.linkle.valley.Registry.Cooking.FoodTypeBases;

import org.jetbrains.annotations.Nullable;

import net.linkle.valley.Registry.Utils.FoodStatusEffects;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

public class DrinkBottleBase extends FoodItemBase {
    public DrinkBottleBase(Settings settings, int hunger, float saturationModifier, boolean isMeat,
            @Nullable FoodStatusEffects effects) {
        super(settings, hunger, saturationModifier, isMeat, effects);
    }

    public DrinkBottleBase(Settings settings, int hunger, float saturationModifier, boolean isMeat) {
        super(settings, hunger, saturationModifier, isMeat);
    }

    public DrinkBottleBase(Settings settings, int hunger, float saturationModifier,
            @Nullable FoodStatusEffects effects) {
        super(settings, hunger, saturationModifier, effects);
    }

    public DrinkBottleBase(Settings settings, int hunger, float saturationModifier) {
        super(settings, hunger, saturationModifier);
    }

    public DrinkBottleBase(Settings settings) {
        super(settings);
    }

    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack itemStack = super.finishUsing(stack, world, user);
        return user instanceof PlayerEntity && ((PlayerEntity)user).getAbilities().creativeMode ? itemStack : new ItemStack(Items.GLASS_BOTTLE);
    }

    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }
}
