package io.github.linkle.valleycraft.items.misc;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class EyeItemBase extends Item {

    public EyeItemBase(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(new TranslatableText("item.valley.sea_creature_eye.tooltip_1").formatted(Formatting.DARK_RED));
        tooltip.add(new TranslatableText("item.valley.sea_creature_eye.tooltip_2").formatted(Formatting.DARK_RED));
    }
}
