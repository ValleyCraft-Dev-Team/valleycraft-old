package io.github.linkle.valleycraft.items.armorMaterials;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class RoseGoldArmorMaterial implements ArmorMaterial {
    public static final ArmorMaterial INSTANCE = new RoseGoldArmorMaterial();

    static final int[] PROTECTION_VALUES = {1, 3, 5, 2};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return getDurability(slot, 15);
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 25;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_GOLD;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.COPPER_INGOT);
    }

    @Override
    public String getName() {
        return "rg";
    }
}
