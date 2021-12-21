package io.github.linkle.valleycraft.items.food;

import static io.github.linkle.valleycraft.init.Furniture.MUG_BLOCK;

import io.github.linkle.valleycraft.utils.FoodStatusEffect;
import org.jetbrains.annotations.Nullable;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

public class MeadBase extends FoodItemBase {
    public MeadBase(Settings settings, int hunger, float saturationModifier, boolean isMeat,
            @Nullable FoodStatusEffect effects) {
        super(settings, hunger, saturationModifier, isMeat, effects);
    }

    public MeadBase(Settings settings, int hunger, float saturationModifier, boolean isMeat) {
        super(settings, hunger, saturationModifier, isMeat);
    }

    public MeadBase(Settings settings, int hunger, float saturationModifier, @Nullable FoodStatusEffect effects) {
        super(settings, hunger, saturationModifier, effects);
    }

    public MeadBase(Settings settings, int hunger, float saturationModifier) {
        super(settings, hunger, saturationModifier);
    }

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
