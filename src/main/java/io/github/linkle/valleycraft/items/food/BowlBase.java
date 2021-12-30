package io.github.linkle.valleycraft.items.food;

import io.github.linkle.valleycraft.utils.FoodStatusEffect;
import org.jetbrains.annotations.Nullable;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;

public class BowlBase extends FoodItemBase {
    
    public BowlBase(Settings settings, int hunger, float saturationModifier, boolean isMeat,
            @Nullable FoodStatusEffect effects) {
        super(settings, hunger, saturationModifier, isMeat, effects);
    }

    public BowlBase(Settings settings, int hunger, float saturationModifier, boolean isMeat) {
        super(settings, hunger, saturationModifier, isMeat);
    }

    public BowlBase(Settings settings, int hunger, float saturationModifier, @Nullable FoodStatusEffect effects) {
        super(settings, hunger, saturationModifier, effects);
    }

    public BowlBase(Settings settings, int hunger, float saturationModifier) {
        super(settings, hunger, saturationModifier);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack itemStack = super.finishUsing(stack, world, user);
        return user instanceof PlayerEntity player && player.getAbilities().creativeMode ? itemStack : new ItemStack(Items.BOWL);
    }
}
