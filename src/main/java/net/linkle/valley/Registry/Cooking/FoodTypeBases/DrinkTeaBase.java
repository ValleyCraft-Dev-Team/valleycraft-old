package net.linkle.valley.Registry.Cooking.FoodTypeBases;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

import static net.linkle.valley.Registry.Initializers.Furniture.SMALL_MUG_BLOCK;

import org.jetbrains.annotations.Nullable;

import net.linkle.valley.Registry.Utils.FoodStatusEffects;

public class DrinkTeaBase extends FoodItemBase {
    
    public DrinkTeaBase(Settings settings) {
        super(settings);
    }

    public DrinkTeaBase(Settings settings, int hunger, float saturationModifier, boolean isMeat,
            @Nullable FoodStatusEffects effects) {
        super(settings, hunger, saturationModifier, isMeat, effects);
    }

    public DrinkTeaBase(Settings settings, int hunger, float saturationModifier, boolean isMeat) {
        super(settings, hunger, saturationModifier, isMeat);
    }

    public DrinkTeaBase(Settings settings, int hunger, float saturationModifier, @Nullable FoodStatusEffects effects) {
        super(settings, hunger, saturationModifier, effects);
    }

    public DrinkTeaBase(Settings settings, int hunger, float saturationModifier) {
        super(settings, hunger, saturationModifier);
    }

    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack itemStack = super.finishUsing(stack, world, user);
        return user instanceof PlayerEntity && ((PlayerEntity)user).getAbilities().creativeMode ? itemStack : new ItemStack(SMALL_MUG_BLOCK);
    }

    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }

}
