package io.github.linkle.valleycraft.mixins;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.advancement.criterion.Criterion;

@Mixin(Criteria.class)
public interface CriteriaInvoker {
    @Invoker("register")
    static <T extends Criterion<?>> T register(T object) {
        throw new AssertionError();
    }
}
