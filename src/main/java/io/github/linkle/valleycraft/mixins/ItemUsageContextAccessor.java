package io.github.linkle.valleycraft.mixins;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.hit.BlockHitResult;

@Mixin(ItemUsageContext.class)
public interface ItemUsageContextAccessor {
    @Accessor
    BlockHitResult getHit();
}
