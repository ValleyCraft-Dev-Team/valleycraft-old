package io.github.linkle.valleycraft.utils;

import com.mojang.datafixers.util.Pair;

import io.github.linkle.valleycraft.ValleyMain;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.FoodComponent;

import java.util.ArrayList;
import java.util.List;

public class FoodStatusEffect {
    private final List<Pair<StatusEffectInstance, Float>> statusEffects = new ArrayList<>();

    public FoodStatusEffect(StatusEffectInstance... effects) {
        for (var effect : effects) {
            addEffect(effect);
        }
    }
    
    public void addEffect(StatusEffectInstance effect) {
        addEffect(effect, 1);
    }
    
    public FoodStatusEffect addEffect(StatusEffectInstance effect, float chance) {
        if (ValleyMain.CONFIG.misc.foodEffectsEnabled)
        statusEffects.add(new Pair<>(effect, chance));
        return this;
    }
    
    public FoodComponent.Builder build(FoodComponent.Builder builder) {
        boolean hasEffect = false;
        for (var effect : statusEffects) {
            builder.statusEffect(effect.getFirst(), effect.getSecond());
            hasEffect |= effect.getSecond() >= 1f;
        }
        if (hasEffect) {
            builder.alwaysEdible();
        }
        return builder;
    }
}
