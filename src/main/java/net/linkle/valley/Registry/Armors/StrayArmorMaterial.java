package net.linkle.valley.Registry.Armors;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class StrayArmorMaterial implements ArmorMaterial {
    public static final ArmorMaterial INSTANCE = new StrayArmorMaterial();
    
    static final int[] PROTECTION_VALUES = new int[] {2, 5, 6, 2};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return getDurability(slot, 10);
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 20;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_LEATHER;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.LEATHER);
    }

    @Override
    public String getName() {
        return "stray";
    }

}
