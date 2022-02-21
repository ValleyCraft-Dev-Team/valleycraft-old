package io.github.linkle.valleycraft.items.misc;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class BaitItemBase extends Item {

    private final String tooltip;

    public BaitItemBase(Settings settings, String tooltip) {
        super(settings);
        this.tooltip = tooltip;
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(new TranslatableText("item.valley.bait.tooltip").formatted(Formatting.GREEN));
        tooltip.add(new TranslatableText(this.tooltip).formatted(Formatting.GREEN));
    }
}
