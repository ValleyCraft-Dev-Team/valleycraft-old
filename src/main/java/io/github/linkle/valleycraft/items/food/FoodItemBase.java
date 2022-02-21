package io.github.linkle.valleycraft.items.food;

import java.util.List;

import org.jetbrains.annotations.Nullable;

import io.github.linkle.valleycraft.init.ItemGroups;
import io.github.linkle.valleycraft.mixins.ItemSettingsAccessor;
import io.github.linkle.valleycraft.utils.FoodStatusEffect;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.effect.StatusEffectUtil;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.BaseText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

public class FoodItemBase extends Item {

    public FoodItemBase(Settings settings) {
        super(settings);
    }

    public FoodItemBase(Settings settings, int hunger, float saturationModifier) {
        this(settings, hunger, saturationModifier, false);
    }

    public FoodItemBase(Settings settings, int hunger, float saturationModifier, boolean isMeat) {
        this(settings, hunger, saturationModifier, isMeat, null);
    }

    public FoodItemBase(Settings settings, int hunger, float saturationModifier, @Nullable FoodStatusEffect effects) {
        this(settings, hunger, saturationModifier, false, effects);
    }

    public FoodItemBase(Settings settings, int hunger, float saturationModifier, boolean isMeat, @Nullable FoodStatusEffect effects) {
        super(defaultGroup(settings).food(newFoodComponent(hunger, saturationModifier, isMeat, effects)));
    }

    /** Sets default item group if there's no item group. */
    protected static Settings defaultGroup(Settings settings) {
        if (((ItemSettingsAccessor)settings).getGroup() == null) {
            settings.group(ItemGroups.COOKING_GROUP);
        }
        return settings;
    }

    protected static FoodComponent newFoodComponent(int hunger, float saturationModifier, boolean isMeat, @Nullable FoodStatusEffect statusEffects) {
        var builder = new FoodComponent.Builder();
        builder.hunger(hunger);
        builder.saturationModifier(saturationModifier);

        if (isMeat) {
            builder.meat();
        }

        if (statusEffects != null) {
            statusEffects.build(builder);
        }

        return builder.build();
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        if (getFoodComponent() == null) return;
        var list = getFoodComponent().getStatusEffects();

        for (var pair : list) {
            var effect = pair.getFirst();
            var name = effect.getEffectType().getName();
            if (name instanceof BaseText text) {
                var color = effect.getEffectType().isBeneficial() ? Formatting.BLUE : Formatting.RED;
                var build = new StringBuilder();

                /* Won't work
                if (effect.getAmplifier() > 0) {
                    build.append(' ');
                    build.append(new TranslatableText("potion.withAmplifier" + effect.getAmplifier()));
                } */

                if (effect.getDuration() > 20) {
                    build.append(" (");
                    build.append(StatusEffectUtil.durationToString(effect, 1));
                    build.append(')');
                }

                tooltip.add(text.formatted(color).append(build.toString()));
            }
        }
    }
}
