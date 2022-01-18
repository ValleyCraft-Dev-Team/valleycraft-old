package io.github.linkle.valleycraft.items.sickles;

import net.minecraft.block.BlockState;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.Vanishable;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Collections;
import java.util.List;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;

import io.github.linkle.valleycraft.api.EnchantmentHandler;
import io.github.linkle.valleycraft.init.VBlockTags;

import static io.github.linkle.valleycraft.init.ItemGroups.EXPLORATION_GROUP;

public class SickleBase
extends ToolItem
implements Vanishable, EnchantmentHandler {
    private final float attackDamage;
    private final Multimap<EntityAttribute, EntityAttributeModifier> attributeModifiers;

    public SickleBase(ToolMaterial material, int attackDamage, float attackSpeed) {
        super(material, new Settings().group(EXPLORATION_GROUP));
        this.attackDamage = attackDamage + material.getAttackDamage();
        ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
        builder.put(EntityAttributes.GENERIC_ATTACK_DAMAGE, new EntityAttributeModifier(ATTACK_DAMAGE_MODIFIER_ID, "Tool modifier", (double)this.attackDamage, EntityAttributeModifier.Operation.ADDITION));
        builder.put(EntityAttributes.GENERIC_ATTACK_SPEED, new EntityAttributeModifier(ATTACK_SPEED_MODIFIER_ID, "Tool modifier", (double)attackSpeed, EntityAttributeModifier.Operation.ADDITION));
        this.attributeModifiers = builder.build();
    }

        //Damage the sickle when it's used to hit mobs
    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        stack.damage(2, attacker, e -> e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
        return true;
    }

        //Damage the sickle when it's used to mine blocks
    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
            //Breaking things with no hardness, like plants, won't take durabiltiy,
            //*unless* the block is in the valley:sickle_harvestables block tag
        if (!world.isClient && (state.getHardness(world, pos) != 0.0f || state.isIn(VBlockTags.SICKLE_HARVESTABLES))) {
            stack.damage(1, miner, e -> e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
        }
        return true;
    }

        //Add the explanatory tooltip
    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add( new TranslatableText("item.valley.sickle.tooltip").formatted(Formatting.YELLOW) );
        tooltip.add( new TranslatableText("item.valley.sickle.tooltip_2").formatted(Formatting.YELLOW) );
    }

        //This is needed to show the damage and attack speed tooltip shown by all tools
    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(EquipmentSlot slot) {
        if (slot == EquipmentSlot.MAINHAND) {
            return this.attributeModifiers;
        }
        return super.getAttributeModifiers(slot);
    }

        //These two methods use our special mixin to force specific enchantments to work on the sickle
        //despite enchantment compatibility being hardcoded in vanilla.

        //Make the sickle accept any weapon enchantments
    @Override
    public List<EnchantmentTarget> getEnchantmentTypes() {
        return Collections.singletonList(EnchantmentTarget.WEAPON);
    }

        //Make the sickle accept Fortune and Silk Touch specifically
    @Override
    public boolean isExplicitlyValid(Enchantment enchantment) {
        return enchantment.equals(Enchantments.FORTUNE) || enchantment.equals(Enchantments.SILK_TOUCH);
    }
}