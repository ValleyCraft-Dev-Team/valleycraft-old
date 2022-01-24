package io.github.linkle.valleycraft.items.knives;

import io.github.linkle.valleycraft.init.ItemGroups;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class ScalpelBase extends PickaxeItem {
    public ScalpelBase(ToolMaterial material, int attackDamage, float attackSpeed) {
        super(material, attackDamage, attackSpeed, new Settings().group(ItemGroups.FISHING_GROUP));
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add( new TranslatableText("item.valley.prismarine_scalpel.tooltip").formatted(Formatting.AQUA) );
    }
}
