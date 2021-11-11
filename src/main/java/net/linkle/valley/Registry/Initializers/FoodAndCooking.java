package net.linkle.valley.Registry.Initializers;

import net.linkle.valley.Registry.Cooking.FoodTypeBases.*;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.linkle.valley.ValleyMain.MOD_ID;
import static net.linkle.valley.Registry.Initializers.ItemGroups.COOKING_GROUP;
import static net.linkle.valley.Registry.Initializers.ItemGroups.MISC_GROUP;
import static net.linkle.valley.Registry.Utils.Util.register;

public class FoodAndCooking {
    public static final Item DRIED_SALMON = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item DRIED_SARDINE = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item COOKED_SARDINE = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item COOKED_CRAB = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(7).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item COOKED_PERCH = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item DRIED_FIRE_EEL = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item COOKED_FIRE_EEL = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item PEPPERCORN = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(0.6f).build()).maxCount(64));
    public static final Item THYME = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(0.6f).build()).maxCount(64));

    public static final Item DRIED_COD = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item DRIED_TROPICAL = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item COOKED_TROPICAL = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(5).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item DRIED_SUCKER = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item RICE_ITEM = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build()).maxCount(64));
    public static final Item SEAWEED_ITEM = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.6f).build()).maxCount(64));
    public static final Item MILK_BOTTLE = new MilkBottleBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.5f).build()).maxCount(16));
    public static final Item CHOCO_MILK = new DrinkBottleBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(5).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,300), 1.0f).build()).maxCount(1));
    public static final Item PUMPKIN_BOTTLE = new DrinkBottleBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(7).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,300), 1.0f).build()).maxCount(1));
    public static final Item TEA = new DrinkTeaBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(1f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,120), 1.0f).build()).maxCount(1));
    public static final Item TEA_BB = new DrinkTeaBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(1f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED,1200), 1.0f).build()).maxCount(1));
    public static final Item TEA_SB = new DrinkTeaBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(1f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,1200), 1.0f).build()).maxCount(1));
    public static final Item TEA_M = new DrinkTeaBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(1f).statusEffect(new StatusEffectInstance(StatusEffects.HASTE,1200), 1.0f).build()).maxCount(1));
    public static final Item TEA_D = new DrinkTeaBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(1f).statusEffect(new StatusEffectInstance(StatusEffects.LUCK,1200), 1.0f).build()).maxCount(1));

    public static final Item HONEYCOMB_CHUNK = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(1f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,120), 1.0f).build()).maxCount(1));
    public static final Item SALT = new FoodItemBase(new Item.Settings().group(MISC_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(0.5f).build()).maxCount(64));
    public static final Item CLOWN_SALAD = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(8).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE,600),1.0f).build()).maxCount(1));
    public static final Item CAKE_SLICE = new PieBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build()).maxCount(64));

    public static final Item RAW_EGGS = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(1.2f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600), 0.7f).build()).maxCount(1));
    public static final Item COOKED_EGG_BOWL = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(5).saturationModifier(0.6f).meat().build()).maxCount(1));
    public static final Item FRUIT_KABOB = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(8).saturationModifier(0.6f).build()).maxCount(64));
    public static final Item MOREL_KABOB = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(8).saturationModifier(0.6f).build()).maxCount(64));
    public static final Item GOLDEN_FRUIT_KABOB = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(10).saturationModifier(0.6f).build()).maxCount(64));
    public static final Item APPLE_JUICE = new DrinkBottleBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED,200),1.0f).build()).maxCount(1));
    public static final Item BEET_JUICE = new DrinkBottleBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING,200),1.0f).build()).maxCount(1));
    public static final Item CARROT_JUICE = new DrinkBottleBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,200),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.GLOWING,200),1.0f).build()).maxCount(1));
    public static final Item POTATO_JUICE = new DrinkBottleBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(StatusEffects.POISON,200),1.0f).build()).maxCount(1));
    public static final Item MOREL_OIL = new DrinkBottleBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS,200),1.0f).build()).maxCount(1));
    public static final Item GB_JUICE = new DrinkBottleBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(StatusEffects.LUCK,200),1.0f).build()).maxCount(1));
    public static final Item GB_JUICE_2 = new DrinkBottleBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(StatusEffects.GLOWING,200),1.0f).build()).maxCount(1));

    public static final Item APPLE_DOUGH = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(0.5f).build()).maxCount(64));
    public static final Item CARROT_SALAD = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(6).saturationModifier(0.5f).build()).maxCount(1));
    public static final Item APPLE_PIE = new PieBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(8).saturationModifier(0.5f).build()).maxCount(64));
    public static final Item PUMPKIN_BOWL = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(7).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,300),1.0f).build()).maxCount(1));

    public static final Item BBOX_CLOWNFISH = new BBoxBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(10).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE,900),1.0f).build()).maxCount(1));
    public static final Item BBOX_SALMON = new BBoxBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(10).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED,900),1.0f).build()).maxCount(1));
    public static final Item BBOX_UNAGI = new BBoxBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(10).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST,900),1.0f).build()).maxCount(1));

    public static final Item CAKE_DOUGH = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(1f).build()).maxCount(64));
    public static final Item NETHER_FUNGUS_STEW = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(8).saturationModifier(0.4f).build()).maxCount(1));

    public static final Item BONE_BROTH = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.5f).build()).maxCount(1));
    public static final Item TOMATO_SOUP = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(5).saturationModifier(0.5f).build()).maxCount(1));

    public static final Item RICE_BOWL = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.5f).build()).maxCount(1));

    public static final Item COOKIE_DOUGH = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(0.5f).build()).maxCount(64));

    public static final Item SALMON_ROLL = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(6).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED,450), 1.0f).build()).maxCount(64));
    public static final Item CRAB_ROLL = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(6).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,450), 1.0f).build()).maxCount(64));
    public static final Item PERCH_ROLL = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(6).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,450), 1.0f).build()).maxCount(64));
    public static final Item FIRE_EEL_ROLL = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(6).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,450), 1.0f).build()).maxCount(64));

    public static final Item SKELE_DOUGH = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(1f).build()).maxCount(64));
    public static final Item SKELE_COOKIE = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.7f).build()).maxCount(64));
    public static final Item GLAZED_APPLE = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(5).saturationModifier(0.7f).build()).maxCount(64));

    public static final Item BREAD_DOUGH = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(1f).build()).maxCount(64));
    public static final Item PUMPKIN_DOUGH = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(1f).build()).maxCount(64));
    public static final Item PANCAKE_DOUGH = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(1f).build()).maxCount(64));
    public static final Item RAW_BACON = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(1f).build()).maxCount(64));
    public static final Item COOKED_BACON = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.5f).meat().build()).maxCount(64));
    public static final Item PANCAKE = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(5).saturationModifier(0.5f).build()).maxCount(64));
    public static final Item BB_DOUGH = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(1f).build()).maxCount(64));
    public static final Item SB_DOUGH = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(1f).build()).maxCount(64));
    public static final Item GB_DOUGH = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(1f).build()).maxCount(64));

    public static final Item AMERANTH_PANCAKE_DOUGH = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(1f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,200), 1.0f).build()).maxCount(64));
    public static final Item AMERANTH_PANCAKE = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(5).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,450), 1.0f).build()).maxCount(64));
    public static final Item AMERANTH_PORRIDGE = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(10).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,675), 1.0f).build()).maxCount(1));
    public static final Item AMERANTH_PANCAKE_BREAKFAST = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(8).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,900), 1.0f).build()).maxCount(1));

    public static final Item APPLE_CYSER = new MeadBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(1f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,300), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,600), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED,600), 1.0f).build()).maxCount(1));
    public static final Item BITTER_BERRY_CYSER = new MeadBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(1f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,300), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,600), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,600), 1.0f).build()).maxCount(1));
    public static final Item SPICY_BERRY_CYSER = new MeadBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(1f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,300), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,600), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING,600), 1.0f).build()).maxCount(1));
    public static final Item SWEET_BERRY_CYSER = new MeadBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(1f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,300), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST,600), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,600), 1.0f).build()).maxCount(1));
    public static final Item MEAD_MUG = new MeadBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(1f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,300), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,600), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED,600), 1.0f).build()).maxCount(16));
    public static final Item CHOCO_CYSER = new MeadBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(1f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,300), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,600), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED,600), 1.0f).build()).maxCount(1));

    public static final Item SWEET_BERRY_WINE = new DrinkBottleBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(1f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,200), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,500), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,600), 1.0f).build()).maxCount(1));
    public static final Item BITTER_BERRY_WINE = new DrinkBottleBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(1f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,200), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING,500), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,600), 1.0f).build()).maxCount(1));
    public static final Item SPICY_BERRY_WINE = new DrinkBottleBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(1f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,200), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,500), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED,600), 1.0f).build()).maxCount(1));
    public static final Item CHORUS_WINE = new DrinkBottleBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(1f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,400), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY,600), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,600), 1.0f).build()).maxCount(1));

    public static final Item CHICKEN_CURRY = new BowlBase(new Item.Settings().group(COOKING_GROUP)
            .food(new FoodComponent.Builder().hunger(10).saturationModifier(0.7f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING,450), 1.0f).build()).maxCount(1));
    public static final Item FULL_BREAKFAST_VEGETARIAN = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(9).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.HASTE,900), 1.0f).build()).maxCount(1));
    public static final Item COOKED_PUMPKIN_SEEDS = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item COD_CHOWDER = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(10).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,600), 1.0f).build()).maxCount(1));
    public static final Item SARDINE_SOUP = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(10).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,600), 1.0f).build()).maxCount(1));
    public static final Item SEAWEED_SALAD = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.5f).build()).maxCount(1));
    public static final Item MUSHROOM_SALAD = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.5f).build()).maxCount(1));
    public static final Item MINER_SALAD = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(1));
    public static final Item POKE_BOWL = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(8).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,120), 1.0f).build()).maxCount(1));

    public static final Item TOMATO_JUICE = new DrinkBottleBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.5f).build()).maxCount(1));
    public static final Item COCOA = new DrinkTeaBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,120), 1.0f).build()).maxCount(1));
    public static final Item CLOWNFISH_ROLL = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(6).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE,450), 1.0f).build()).maxCount(64));
    public static final Item CRYS_HONEY = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,240), 1.0f).build()).maxCount(64));
    public static final Item MAIZE_PORRIDGE = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(10).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(StatusEffects.HASTE,450), 1.0f).build()).maxCount(1));
    public static final Item BEEF_STEW = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(10).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION,60),1.0f).build()).maxCount(1));
    public static final Item BEAR_STEW = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(10).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,60),1.0f).build()).maxCount(1));
    public static final Item SPICY_RABBIT_BIGO = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(10).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(StatusEffects.HASTE,600),1.0f).build()).maxCount(1));
    public static final Item LAMB_BIRYANI = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(9).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,900), 1.0f).build()).maxCount(1));
    public static final Item PORK_STIR_FRY = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(10).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,600), 1.0f).build()).maxCount(1));
    public static final Item SQUID_ROLL = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(6).saturationModifier(0.7f).build()).maxCount(64));
    public static final Item FROZEN_JELLY = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,600),1.0f).build()).maxCount(64));
    public static final Item GRILLED_SUCKER = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(6).saturationModifier(0.6f).build()).maxCount(64));
    public static final Item MONSTER_JERKY = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).meat().build()).maxCount(64));
    public static final Item GLOW_SOUP = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(8).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(StatusEffects.GLOWING,600), 1.0f).build()).maxCount(1));
    public static final Item BEAR_JERKY = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(10).saturationModifier(0.4f).meat().build()).maxCount(64));
    public static final Item RAW_TENDER = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(5).saturationModifier(0.4f).meat().build()).maxCount(64));
    public static final Item COOKED_TENDER = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(8).saturationModifier(0.4f).meat().build()).maxCount(64));

    public static final Item PANCAKE_BREAKFAST = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(8).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.HASTE,900), 1.0f).build()).maxCount(1));
    public static final Item PANCAKE_BREAKFAST_LARGE = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(10).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.HASTE,1200), 1.0f).build()).maxCount(1));
    public static final Item FULL_BREAKFAST = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(10).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,1200), 1.0f).build()).maxCount(1));
    public static final Item BACON_AND_EGGS = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(8).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,900), 1.0f).build()).maxCount(1));

    public static final Item GRUB = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(12).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,1800), 1.0f).build()).maxCount(1));

    public static final Item DRUMSTICK = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.6f).build()).maxCount(64));
    public static final Item COOKED_APPLE = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(6).saturationModifier(0.5f).build()).maxCount(64));
    public static final Item STUFFED_ONION = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(9).meat().saturationModifier(0.5f).statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST,900), 1.0f).build()).maxCount(64));
    public static final Item BAKED_POTATO_SPECIAL= new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(9).meat().saturationModifier(0.5f).statusEffect(new StatusEffectInstance(StatusEffects.LUCK,900), 1.0f).build()).maxCount(64));
    public static final Item WORM = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.6f).build()).maxCount(64));

    public static final Item DOG_BISCUIT= new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(8).meat().saturationModifier(0.5f).build()).maxCount(64));
    public static final Item DOG_FOOD = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(8).saturationModifier(0.6f).meat().statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,900), 1.0f).build()).maxCount(1));
    public static final Item DOG_PUMPKIN= new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(8).meat().saturationModifier(0.5f).build()).maxCount(64));
    public static final Item FOX_FOOD = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(8).saturationModifier(0.6f).meat().statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,900), 1.0f).build()).maxCount(1));
    public static final Item FOX_TREAT= new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(8).meat().saturationModifier(0.5f).build()).maxCount(64));

    public static final Item GOLDEN_BB = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(10).saturationModifier(0.6f).build()).maxCount(64));
    public static final Item GOLDEN_SB = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(10).saturationModifier(0.6f).build()).maxCount(64));
    public static final Item GOLDEN_SPB = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(10).saturationModifier(0.6f).build()).maxCount(64));
    public static final Item GOLDEN_P = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(10).saturationModifier(0.6f).build()).maxCount(64));
    public static final Item GOLDEN_B = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(10).saturationModifier(0.6f).build()).maxCount(64));
    public static final Item GOLDEN_O = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(10).saturationModifier(0.6f).build()).maxCount(64));
    public static final Item GOLDEN_T = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(10).saturationModifier(0.6f).build()).maxCount(64));
    public static final Item GOLDEN_K = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(10).saturationModifier(0.6f).build()).maxCount(64));
    public static final Item GOLDEN_H = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(10).saturationModifier(0.6f).build()).maxCount(64));
    public static final Item GOLDEN_J = new DrinkBottleBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(10).saturationModifier(0.6f).build()).maxCount(1));
    public static final Item GOLDEN_GB = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(10).saturationModifier(0.6f).build()).maxCount(64));
    public static final Item GOLDEN_M = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(10).saturationModifier(0.6f).build()).maxCount(64));
    public static final Item GOLDEN_GB_2 = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(10).saturationModifier(0.6f).build()).maxCount(64));
    public static final Item VEGE_STIR_FRY = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(10).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,600), 1.0f).build()).maxCount(1));
    public static final Item BEAR_STIR_FRY = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(10).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,600), 1.0f).build()).maxCount(1));
    public static final Item MANDRAKE_SOUP = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(9).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,900), 1.0f).build()).maxCount(1));
    public static final Item CANDIED_SNOW_YAM = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(9).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,900), 1.0f).build()).maxCount(1));
    public static final Item WINTER_ROOT_STEW = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(9).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,900), 1.0f).build()).maxCount(1));
    public static final Item WORM_SOUP = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(8).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,900), 1.0f).build()).maxCount(1));

    public static final Item BITTER_PIE = new PieBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(8).saturationModifier(0.5f).build()).maxCount(64));
    public static final Item SWEET_PIE = new PieBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(8).saturationModifier(0.5f).build()).maxCount(64));
    public static final Item GLOW_PIE = new PieBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(8).saturationModifier(0.5f).build()).maxCount(64));

    public static final Item G_WATER = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.5f).build()).maxCount(64));
    public static final Item B_WATER = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(8).saturationModifier(0.5f).build()).maxCount(64));

    public static void initialize() {
        register("tea", TEA);
        register("tea_sb", TEA_SB);
        register("tea_bb", TEA_BB);
        register("tea_miner", TEA_M);
        register("tea_dandelion", TEA_D);

        register("cocoa", COCOA);

        register("mead_mug", MEAD_MUG);
        register("sweet_berry_cyser", SWEET_BERRY_CYSER);
        register("spicy_berry_cyser", SPICY_BERRY_CYSER);
        register("bitter_berry_cyser", BITTER_BERRY_CYSER);
        register("apple_cyser", APPLE_CYSER);
        register("chocolate_cyser", CHOCO_CYSER);

        register("bitter_berry_wine", BITTER_BERRY_WINE);
        register("spicy_berry_wine", SPICY_BERRY_WINE);
        register("sweet_berry_wine", SWEET_BERRY_WINE);
        register("chorus_wine", CHORUS_WINE);

        register("milk_bottle", MILK_BOTTLE);
        register("chocolate_milk", CHOCO_MILK);
        register("tomato_juice", TOMATO_JUICE);
        register("apple_juice", APPLE_JUICE);
        register("glow_berry_juice", GB_JUICE_2);
        register("beet_juice", BEET_JUICE);
        register("carrot_juice", CARROT_JUICE);
        register("potato_juice", POTATO_JUICE);
        register("gb_juice", GB_JUICE);
        register("pumpkin_bottle", PUMPKIN_BOTTLE);
        register("morel_oil", MOREL_OIL);

        register("grub", GRUB);
        register("pumpkin_bowl", PUMPKIN_BOWL);
        register("tomato_soup", TOMATO_SOUP);
        register("winter_root_stew", WINTER_ROOT_STEW);
        register("bone_broth", BONE_BROTH);
        register("nether_fungus_stew", NETHER_FUNGUS_STEW);
        register("carrot_salad", CARROT_SALAD);
        register("mushroom_salad", MUSHROOM_SALAD);
        register("miners_salad", MINER_SALAD);

        register("cooked_egg_bowl", COOKED_EGG_BOWL);
        register("bacon_and_eggs", BACON_AND_EGGS);
        register("full_breakfast", FULL_BREAKFAST);
        register("full_breakfast_vegetarian", FULL_BREAKFAST_VEGETARIAN);
        register("pancake_breakfast", PANCAKE_BREAKFAST);
        //register("ameranth_pancake_breakfast", AMERANTH_PANCAKE_BREAKFAST);
        register("large_pancake_breakfast", PANCAKE_BREAKFAST_LARGE);

        register("glow_soup", GLOW_SOUP);
        register("clownfish_salad", CLOWN_SALAD);
        register("maize_porridge", MAIZE_PORRIDGE);
        //register("ameranth_porridge", AMERANTH_PORRIDGE);
        register("beef_stew", BEEF_STEW);
        register("bear_stew", BEAR_STEW);
        register("rabbit_bigo", SPICY_RABBIT_BIGO);
        register("lamb_biryani", LAMB_BIRYANI);
        register("vege_stir_fry", VEGE_STIR_FRY);
        register("pork_stir_fry", PORK_STIR_FRY);
        register("bear_stir_fry", BEAR_STIR_FRY);
        register("bear_jerky", BEAR_JERKY);
        register("seaweed_salad", SEAWEED_SALAD);
        register("mandrake_soup", MANDRAKE_SOUP);
        register("cod_chowder", COD_CHOWDER);
        register("sardine_soup", SARDINE_SOUP);
        register("worm_bowl", WORM_SOUP);
        register("chicken_curry", CHICKEN_CURRY);
        register("rice_bowl", RICE_BOWL);
        register("poke_bowl", POKE_BOWL);
        register("dried_seaweed", SEAWEED_ITEM);

        register("grilled_sucker", GRILLED_SUCKER);
        register("dried_salmon", DRIED_SALMON);
        register("fire_eel_dried", DRIED_FIRE_EEL);
        register("dried_cod", DRIED_COD);
        register("dried_sucker", DRIED_SUCKER);
        register("dried_tropical_fish", DRIED_TROPICAL);
        register("cooked_tropical_fish", COOKED_TROPICAL);
        register("sardine_cooked", COOKED_SARDINE);
        register("fire_eel_cooked", COOKED_FIRE_EEL);
        register("crab_red_cooked", COOKED_CRAB);

        register("salmon_roll", SALMON_ROLL);
        register("clownfish_roll", CLOWNFISH_ROLL);
        register("squid_roll", SQUID_ROLL);
        register("fire_eel_roll", FIRE_EEL_ROLL);
        register("perch_roll", PERCH_ROLL);
        register("crab_roll", CRAB_ROLL);

        register("bbox_unagi", BBOX_UNAGI);
        register("bbox_clownfish", BBOX_CLOWNFISH);
        register("bbox_salmon", BBOX_SALMON);

        register("cookie_dough", COOKIE_DOUGH);
        register("cake_dough", CAKE_DOUGH);
        register("apple_dough", APPLE_DOUGH);
        register("pumpkin_dough", PUMPKIN_DOUGH);
        register("bitter_dough", BB_DOUGH);
        register("glow_dough", GB_DOUGH);
        register("sweet_dough", SB_DOUGH);
        register("bread_dough", BREAD_DOUGH);
        register("pancake_dough", PANCAKE_DOUGH);
        //register("ameranth_pancake_dough", AMERANTH_PANCAKE_DOUGH);
        register("skeleton_cookie_dough", SKELE_DOUGH);

        register("pancake", PANCAKE);
        //register("ameranth_pancake", AMERANTH_PANCAKE);
        register("apple_pie", APPLE_PIE);
        register("bitter_pie", BITTER_PIE);
        register("sweet_pie", SWEET_PIE);
        register("glow_pie", GLOW_PIE);

        register("cake_slice", CAKE_SLICE);
        register("skeleton_cookie", SKELE_COOKIE);


        register("honeycomb_chunk", HONEYCOMB_CHUNK);
        register("crystalized_honey", CRYS_HONEY);
        register("frozen_jelly", FROZEN_JELLY);
        register("candied_snow_yams", CANDIED_SNOW_YAM);

        register("cooked_apple", COOKED_APPLE);
        register("glazed_apple", GLAZED_APPLE);
        register("cooked_pumpkin_seeds", COOKED_PUMPKIN_SEEDS);

        register("drumstick", DRUMSTICK);
        register("stuffed_onion", STUFFED_ONION);
        register("baked_potato", BAKED_POTATO_SPECIAL);

        register("rice_item", RICE_ITEM);
        register("raw_bacon", RAW_BACON);
        register("cooked_bacon", COOKED_BACON);
        register("raw_egg_bowl", RAW_EGGS);
        register("raw_tenderloin", RAW_TENDER);
        register("cooked_tenderloin", COOKED_TENDER);
        register("worm", WORM);

        register("salt", SALT);
        register("thyme", THYME);
        register("black_peppercorns", PEPPERCORN);

        register("watermelon_fruit_bowl", B_WATER);
        register("grilled_watermelon", G_WATER);

        register("morel_skewer", MOREL_KABOB);
        register("fruit_kabob", FRUIT_KABOB);
        register("golden_kabob", GOLDEN_FRUIT_KABOB);

        register("glistering_juice", GOLDEN_J);
        register("glistering_honeycomb", GOLDEN_H);
        register("glistering_bitter_berries", GOLDEN_BB);
        register("glistering_sweet_berries", GOLDEN_SB);
        register("glistering_spicy_berries", GOLDEN_SPB);
        register("glistering_glow_berries", GOLDEN_GB_2);
        register("glistering_kelp", GOLDEN_K);
        register("glistering_tomato", GOLDEN_T);
        register("glistering_onion", GOLDEN_O);
        register("glistering_potato", GOLDEN_P);
        register("glistering_beet", GOLDEN_B);
        register("glistering_green_bean", GOLDEN_GB);
        register("glistering_mandrake", GOLDEN_M);

        register("dog_biscuit", DOG_BISCUIT);
        register("dog_food", DOG_FOOD);
        register("monster_jerky", MONSTER_JERKY);
        register("puppy_pumpkin", DOG_PUMPKIN);
        register("fox_food", FOX_FOOD);
        register("fox_treat", FOX_TREAT);
    }
}