package io.github.linkle.valleycraft.items.food;

import io.github.linkle.valleycraft.utils.FoodStatusEffect;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import static io.github.linkle.valleycraft.init.Furniture.TEA_MUG;

public class DrinkTeaBase extends FoodItemBase {

    public DrinkTeaBase(Settings settings, int hunger, float saturationModifier, @Nullable FoodStatusEffect effects) {
        super(settings, hunger, saturationModifier, effects);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack itemStack = super.finishUsing(stack, world, user);
        return user instanceof PlayerEntity player && player.getAbilities().creativeMode ? itemStack : new ItemStack(TEA_MUG);
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }

}