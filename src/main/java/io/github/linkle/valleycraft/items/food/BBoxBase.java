package io.github.linkle.valleycraft.items.food;

import io.github.linkle.valleycraft.utils.FoodStatusEffect;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import static io.github.linkle.valleycraft.init.Furniture.BENTO_BLOCK;

public class BBoxBase extends FoodItemBase {
    public BBoxBase(Settings settings, int hunger, float saturationModifier, boolean isMeat,
            @Nullable FoodStatusEffect effects) {
        super(settings, hunger, saturationModifier, isMeat, effects);
    }

    public BBoxBase(Settings settings, int hunger, float saturationModifier, boolean isMeat) {
        super(settings, hunger, saturationModifier, isMeat);
    }

    public BBoxBase(Settings settings, int hunger, float saturationModifier, @Nullable FoodStatusEffect effects) {
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
