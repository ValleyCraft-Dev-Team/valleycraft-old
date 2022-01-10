package io.github.linkle.valleycraft.items.ocean_relics;

import io.github.linkle.valleycraft.init.ItemGroups;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.Rarity;
import net.minecraft.world.World;

import java.util.List;

public class EncrustedPickaxeBase extends PickaxeItem {
    public EncrustedPickaxeBase(ToolMaterial material, int attackDamage, float attackSpeed) {
        super(material, attackDamage, attackSpeed, new Settings().group(ItemGroups.ARTEFACT_GROUP).rarity(Rarity.RARE));
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add( new TranslatableText("item.valley.encrusted_pickaxe.tooltip").formatted(Formatting.YELLOW) );
    }
}
