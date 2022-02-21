package io.github.linkle.valleycraft.items.ocean_relics;

import io.github.linkle.valleycraft.init.ItemGroups;
import io.github.linkle.valleycraft.items.knives.KnifeBase;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.Rarity;
import net.minecraft.world.World;

import java.util.List;

public class MermaidSpearItem
extends KnifeBase {
    public MermaidSpearItem(ToolMaterial material, int attackDamage, float attackSpeed) {
        super(material, attackDamage, attackSpeed, new Settings().group(ItemGroups.ARTEFACT_GROUP).rarity(Rarity.RARE));
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add( new TranslatableText("item.valley.mermaids_spear.tooltip").formatted(Formatting.DARK_AQUA) );
        tooltip.add( new TranslatableText("item.valley.mermaids_spear.tooltip_2").formatted(Formatting.DARK_AQUA) );
    }

    //Make the mermaid sword accept Impaling
    @Override
    public boolean isExplicitlyValid(Enchantment enchantment) {
        return enchantment.equals(Enchantments.IMPALING);
    }
}
