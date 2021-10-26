package net.linkle.valley.Registry.Initializers;

import net.linkle.valley.Registry.Cooking.FoodTypeBases.*;
import net.linkle.valley.Registry.Misc.FossilItemBase;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

import static net.linkle.valley.Registry.Initializers.ItemGroups.*;
import static net.linkle.valley.ValleyMain.MOD_ID;

public class Fishing {
    public static final Item FIRE_EEL = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build()).rarity(Rarity.RARE).maxCount(64));
    public static final Item OCTO = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(5).saturationModifier(0.4f).build()).rarity(Rarity.RARE).maxCount(64));
    public static final Item GHOST_FISH = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).rarity(Rarity.EPIC).maxCount(64));
    public static final Item PERCH = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item CRAB = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 900),0.8f).build()).maxCount(64));
    public static final Item MUSSEL = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 900),0.3f).build()).maxCount(64));
    public static final Item BROWN_MUSSEL = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 900),0.3f).build()).maxCount(64));
    public static final Item CLAM = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).maxCount(64));
    public static final Item CERITH_SNAIL = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).maxCount(64));
    public static final Item LIONFISH = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item SARDINE = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item SLIMEFISH = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build()).rarity(Rarity.COMMON).maxCount(64));
    public static final Item STARFISH = new FossilItemBase(new Item.Settings().group(FISHING_GROUP).rarity(Rarity.EPIC).maxCount(64));
    public static final Item SAND_DOLLAR = new FossilItemBase(new Item.Settings().group(FISHING_GROUP).rarity(Rarity.COMMON).maxCount(64));

    public static void initialize() {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fire_eel"), FIRE_EEL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ghost_fish"), GHOST_FISH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "perch"), PERCH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "crab_red"), CRAB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "clam"), CLAM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "mussel"), MUSSEL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "brown_mussel"), BROWN_MUSSEL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cerith_snail"), CERITH_SNAIL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "lionfish"), LIONFISH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "sardine"), SARDINE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "slime_fish"), SLIMEFISH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fossilized_starfish"), STARFISH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "sand_dollar"), SAND_DOLLAR);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "octopus"), OCTO);

    }
}