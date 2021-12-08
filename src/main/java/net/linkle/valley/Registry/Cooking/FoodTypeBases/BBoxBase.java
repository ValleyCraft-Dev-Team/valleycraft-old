package net.linkle.valley.Registry.Cooking.FoodTypeBases;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import static net.linkle.valley.Registry.Initializers.Furniture.BENTO_BLOCK;

import org.jetbrains.annotations.Nullable;

import net.linkle.valley.Registry.Utils.FoodStatusEffects;

public class BBoxBase extends FoodItemBase {
    public BBoxBase(Settings settings, int hunger, float saturationModifier, boolean isMeat,
            @Nullable FoodStatusEffects effects) {
        super(settings, hunger, saturationModifier, isMeat, effects);
    }

    public BBoxBase(Settings settings, int hunger, float saturationModifier, boolean isMeat) {
        super(settings, hunger, saturationModifier, isMeat);
    }

    public BBoxBase(Settings settings, int hunger, float saturationModifier, @Nullable FoodStatusEffects effects) {
        super(settings, hunger, saturationModifier, effects);
    }

    public BBoxBase(Settings settings, int hunger, float saturationModifier) {
        super(settings, hunger, saturationModifier);
    }

    public BBoxBase(Settings settings) {
        super(settings);
    }

    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack itemStack = super.finishUsing(stack, world, user);
        return user instanceof PlayerEntity && ((PlayerEntity)user).getAbilities().creativeMode ? itemStack : new ItemStack(BENTO_BLOCK);
    }
}
