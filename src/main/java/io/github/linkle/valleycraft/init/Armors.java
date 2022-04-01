package io.github.linkle.valleycraft.init;

import io.github.linkle.valleycraft.items.armorMaterials.FurArmorMaterial;
import io.github.linkle.valleycraft.items.armorMaterials.RoseGoldArmorMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;

public class Armors {
    private static final Item.Settings settings = new Item.Settings().group(ItemGroups.EXPLORATION_GROUP);

    public static final Item ROSE_GOLD_HELMET = new ArmorItem(RoseGoldArmorMaterial.INSTANCE, EquipmentSlot.HEAD, settings);
    public static final Item ROSE_GOLD_CHESTPLATE = new ArmorItem(RoseGoldArmorMaterial.INSTANCE, EquipmentSlot.CHEST, settings);
    public static final Item ROSE_GOLD_LEGGINGS = new ArmorItem(RoseGoldArmorMaterial.INSTANCE, EquipmentSlot.LEGS, settings);
    public static final Item ROSE_GOLD_BOOTS = new ArmorItem(RoseGoldArmorMaterial.INSTANCE, EquipmentSlot.FEET, settings);

    public static final Item TURTLE_CHESTPLATE = new ArmorItem(ArmorMaterials.TURTLE, EquipmentSlot.CHEST, settings);
    public static final Item TURTLE_LEGGINGS = new ArmorItem(ArmorMaterials.TURTLE, EquipmentSlot.LEGS, settings);
    public static final Item TURTLE_BOOTS = new ArmorItem(ArmorMaterials.TURTLE, EquipmentSlot.FEET, settings);

    public static final Item FUR_CLOAK = new ArmorItem(FurArmorMaterial.INSTANCE, EquipmentSlot.CHEST, settings);

    public static void initialize() {

        Reg.register("rose_gold_helmet", ROSE_GOLD_HELMET);
        Reg.register("rose_gold_chestplate", ROSE_GOLD_CHESTPLATE);
        Reg.register("rose_gold_leggings", ROSE_GOLD_LEGGINGS);
        Reg.register("rose_gold_boots", ROSE_GOLD_BOOTS);

        Reg.register("turtle_chestplate", TURTLE_CHESTPLATE);
        Reg.register("turtle_leggings", TURTLE_LEGGINGS);
        Reg.register("turtle_boots", TURTLE_BOOTS);

        Reg.register("fur_cloak", FUR_CLOAK);
    }
}
