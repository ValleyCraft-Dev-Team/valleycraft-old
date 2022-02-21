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

public class CoralDaggerItem
extends KnifeBase {
    public CoralDaggerItem(ToolMaterial material, int attackDamage, float attackSpeed) {
        super(material, attackDamage, attackSpeed, new Settings().group(ItemGroups.ARTEFACT_GROUP).rarity(Rarity.RARE));
    }

    //Add the explanatory tooltip
    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add( new TranslatableText("item.valley.coral_knife.tooltip").formatted(Formatting.LIGHT_PURPLE) );
    }

    //Make the coral dagger accept Impaling
    @Override
    public boolean isExplicitlyValid(Enchantment enchantment) {
        return enchantment.equals(Enchantments.IMPALING);
    }
}
