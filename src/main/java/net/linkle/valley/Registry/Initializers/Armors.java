package net.linkle.valley.Registry.Initializers;

import net.linkle.valley.Registry.Armors.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;

import static net.linkle.valley.Registry.Utils.Util.register;

public class Armors {
    private static final Item.Settings settings = new Item.Settings().group(ItemGroups.EXPLORATION_GROUP);
    
    //public static final Item TRADER_HELMET = new ArmorItem(TraderArmorMaterial.INSTANCE, EquipmentSlot.HEAD, settings);
    //public static final Item TRADER_CHESTPLATE = new ArmorItem(TraderArmorMaterial.INSTANCE, EquipmentSlot.CHEST, settings);
    //public static final Item TRADER_LEGGINGS = new ArmorItem(TraderArmorMaterial.INSTANCE, EquipmentSlot.LEGS, settings);
    //public static final Item TRADER_BOOTS = new ArmorItem(TraderArmorMaterial.INSTANCE, EquipmentSlot.FEET, settings);
    
    public static final Item TURTLE_CHESTPLATE = new ArmorItem(ArmorMaterials.TURTLE, EquipmentSlot.CHEST, settings);
    public static final Item TURTLE_LEGGINGS = new ArmorItem(ArmorMaterials.TURTLE, EquipmentSlot.LEGS, settings);
    public static final Item TURTLE_BOOTS = new ArmorItem(ArmorMaterials.TURTLE, EquipmentSlot.FEET, settings);
    
    //public static final Item STRAY_HELMET = new ArmorItem(StrayArmorMaterial.INSTANCE, EquipmentSlot.HEAD, settings);
    //public static final Item STRAY_CHESTPLATE = new ArmorItem(StrayArmorMaterial.INSTANCE, EquipmentSlot.CHEST, settings);
    //public static final Item STRAY_LEGGINGS = new ArmorItem(StrayArmorMaterial.INSTANCE, EquipmentSlot.LEGS, settings);
    
    public static final Item FUR_CHESTPLATE = new ArmorItem(FurArmorMaterial.INSTANCE, EquipmentSlot.CHEST, settings);

    //public static final Item QUIVER_HELMET = new ArmorItem(QuiverArmorMaterial.INSTANCE, EquipmentSlot.HEAD, settings);
    //public static final Item QUIVER_CHESTPLATE = new ArmorItem(QuiverArmorMaterial.INSTANCE, EquipmentSlot.CHEST, settings);
    //public static final Item QUIVER_LEGGINGS = new ArmorItem(QuiverArmorMaterial.INSTANCE, EquipmentSlot.LEGS, settings);
    //public static final Item QUIVER_BOOTS = new ArmorItem(QuiverArmorMaterial.INSTANCE, EquipmentSlot.FEET, settings);
    
    //public static final Item ALT_TRADER_CHESTPLATE = new ArmorItem(AltTraderArmorMaterial.INSTANCE, EquipmentSlot.CHEST, settings);
    
    //public static final Item CHEF_HELMET = new ArmorItem(ChefArmorMaterial.INSTANCE, EquipmentSlot.HEAD, settings);
    //public static final Item CHEF_CHESTPLATE = new ArmorItem(ChefArmorMaterial.INSTANCE, EquipmentSlot.CHEST, settings);
    
    public static void initialize() {
        //register("trader_helmet", TRADER_HELMET);
        //register("trader_chestplate", TRADER_CHESTPLATE);
        //register("trader_leggings", TRADER_LEGGINGS);
        //register("trader_boots", TRADER_BOOTS);
        
        register("turtle_chestplate", TURTLE_CHESTPLATE);
        register("turtle_leggings", TURTLE_LEGGINGS);
        register("turtle_boots", TURTLE_BOOTS);
        
        //register("stray_helmet", STRAY_HELMET);
        //register("stray_chestplate", STRAY_CHESTPLATE);
        //register("stray_leggings", STRAY_LEGGINGS);
        
        register("fur_chestplate", FUR_CHESTPLATE);
        
        //register("quiver_helmet", QUIVER_HELMET);
        //register("quiver_chestplate", QUIVER_CHESTPLATE);
        //register("quiver_leggings", QUIVER_LEGGINGS);
        //register("quiver_boots", QUIVER_BOOTS);
        
        //register("alt_trader_chestplate", ALT_TRADER_CHESTPLATE);
        
        //register("chef_helmet", CHEF_HELMET);
        //register("chef_chestplate", CHEF_CHESTPLATE);
    }
}
