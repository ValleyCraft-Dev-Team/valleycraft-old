package io.github.linkle.valleycraft.utils;

import io.github.linkle.valleycraft.mixins.ItemUsageContextAccessor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;

public class VItemUsageContext extends ItemUsageContext {
    public VItemUsageContext(ItemUsageContext context, ItemStack stack) {
        super(context.getWorld(), context.getPlayer(), context.getHand(), stack, ((ItemUsageContextAccessor)context).getHit());
    }
}
