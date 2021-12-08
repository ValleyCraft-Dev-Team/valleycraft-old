package net.linkle.valley.Registry.Utils;

import java.util.ArrayList;
import java.util.List;

import com.mojang.datafixers.util.Pair;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.FoodComponent;

public class FoodStatusEffects {
    private final List<Pair<StatusEffectInstance, Float>> statusEffects = new ArrayList<>();
    
    public FoodStatusEffects() {
        
    }
    
    public FoodStatusEffects(StatusEffectInstance... effects) {
        for (var effect : effects) {
            addEffect(effect);
        }
    }
    
    public FoodStatusEffects addEffect(StatusEffectInstance effect) {
        return addEffect(effect, 1);
    }
    
    public FoodStatusEffects addEffect(StatusEffectInstance effect, float chance) {
        statusEffects.add(new Pair<StatusEffectInstance, Float>(effect, chance));
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
