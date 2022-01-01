package io.github.linkle.valleycraft.items.sickles;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

import static io.github.linkle.valleycraft.init.ItemGroups.EXPLORATION_GROUP;

public class SickleBase extends HoeItem {
    public SickleBase(ToolMaterial material, int attackDamage, float attackSpeed) {
        super(material, attackDamage, attackSpeed, new Settings().group(EXPLORATION_GROUP));
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add( new TranslatableText("item.valley.sickle.tooltip").formatted(Formatting.YELLOW) );
        tooltip.add( new TranslatableText("item.valley.sickle.tooltip_2").formatted(Formatting.YELLOW) );
    }
}