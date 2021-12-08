package net.linkle.valley.Registry.Mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

@Mixin(Item.Settings.class)
public interface ItemSettingsAccessor {
    @Accessor
    ItemGroup getGroup();
}
