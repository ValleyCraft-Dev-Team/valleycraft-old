package io.github.linkle.valleycraft.items.misc;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class LingeringItemBase extends Item {
    public LingeringItemBase(Settings settings) { super(settings); }


    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add( new TranslatableText("item.valley.lingering_powder.tooltip_1").formatted(Formatting.GOLD) );
        tooltip.add( new TranslatableText("item.valley.lingering_powder.tooltip_2").formatted(Formatting.GOLD) );
        tooltip.add( new TranslatableText("item.valley.lingering_powder.tooltip_3").formatted(Formatting.GOLD) );
    }
}
