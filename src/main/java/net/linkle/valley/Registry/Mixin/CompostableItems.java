package net.linkle.valley.Registry.Mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

import net.minecraft.block.ComposterBlock;
import net.minecraft.item.ItemConvertible;

@Mixin(ComposterBlock.class)
public interface CompostableItems {
    @Invoker("registerCompostableItem")
    static void registerItem(float chance, ItemConvertible item) {
        throw new AssertionError(); // If this is throwned, then clearly something went wrong.
    }
}
