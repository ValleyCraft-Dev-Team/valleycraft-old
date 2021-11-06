package net.linkle.valley.Registry.Initializers;

import net.linkle.valley.Registry.Armors.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import static net.linkle.valley.Registry.Utils.Util.register;

public class Armors {
    public static final Item TRADER_HELMET = new ArmorItem(TraderArmorMaterial.INSTANCE, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item TRADER_CHESTPLATE = new ArmorItem(TraderArmorMaterial.INSTANCE, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    //public static final Item TRADER_LEGGINGS = new ArmorItem(TraderArmorMaterial.INSTANCE, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item TRADER_BOOTS = new ArmorItem(TraderArmorMaterial.INSTANCE, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));
    
    public static final Item TURTLE_CHESTPLATE = new ArmorItem(ArmorMaterials.TURTLE, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item TURTLE_LEGGINGS = new ArmorItem(ArmorMaterials.TURTLE, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item TURTLE_BOOTS = new ArmorItem(ArmorMaterials.TURTLE, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));
    
    public static final Item STRAY_HELMET = new ArmorItem(StrayArmorMaterial.INSTANCE, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item STRAY_CHESTPLATE = new ArmorItem(StrayArmorMaterial.INSTANCE, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item STRAY_LEGGINGS = new ArmorItem(StrayArmorMaterial.INSTANCE, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    
    public static final Item FUR_CHESTPLATE = new ArmorItem(FurArmorMaterial.INSTANCE, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));

    public static void initialize() {
        register("trader_helmet", TRADER_HELMET);
        register("trader_chestplate", TRADER_CHESTPLATE);
        //register("trader_leggings", TRADER_LEGGINGS);
        register("trader_boots", TRADER_BOOTS);
        
        register("turtle_chestplate", TURTLE_CHESTPLATE);
        register("turtle_leggings", TURTLE_LEGGINGS);
        register("turtle_boots", TURTLE_BOOTS);
        
        register("stray_helmet", STRAY_HELMET);
        register("stray_chestplate", STRAY_CHESTPLATE);
        register("stray_leggings", STRAY_LEGGINGS);
        
        register("fur_chestplate", FUR_CHESTPLATE);
    }
}
