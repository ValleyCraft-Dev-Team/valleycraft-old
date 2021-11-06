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
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "tea"), TEA);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "tea_sb"), TEA_SB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "tea_bb"), TEA_BB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "tea_miner"), TEA_M);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "tea_dandelion"), TEA_D);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cocoa"), COCOA);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "mead_mug"), MEAD_MUG);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "sweet_berry_cyser"), SWEET_BERRY_CYSER);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "spicy_berry_cyser"), SPICY_BERRY_CYSER);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bitter_berry_cyser"), BITTER_BERRY_CYSER);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "apple_cyser"), APPLE_CYSER);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "chocolate_cyser"), CHOCO_CYSER);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bitter_berry_wine"), BITTER_BERRY_WINE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "spicy_berry_wine"), SPICY_BERRY_WINE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "sweet_berry_wine"), SWEET_BERRY_WINE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "chorus_wine"), CHORUS_WINE);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "milk_bottle"), MILK_BOTTLE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "chocolate_milk"), CHOCO_MILK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "tomato_juice"), TOMATO_JUICE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "apple_juice"), APPLE_JUICE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "glow_berry_juice"), GB_JUICE_2);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "beet_juice"), BEET_JUICE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "carrot_juice"), CARROT_JUICE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "potato_juice"), POTATO_JUICE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "gb_juice"), GB_JUICE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pumpkin_bottle"), PUMPKIN_BOTTLE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "morel_oil"), MOREL_OIL);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "grub"), GRUB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pumpkin_bowl"), PUMPKIN_BOWL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "tomato_soup"), TOMATO_SOUP);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "winter_root_stew"), WINTER_ROOT_STEW);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bone_broth"), BONE_BROTH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "nether_fungus_stew"), NETHER_FUNGUS_STEW);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "carrot_salad"), CARROT_SALAD);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "mushroom_salad"), MUSHROOM_SALAD);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "miners_salad"), MINER_SALAD);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cooked_egg_bowl"), COOKED_EGG_BOWL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bacon_and_eggs"), BACON_AND_EGGS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "full_breakfast"), FULL_BREAKFAST);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "full_breakfast_vegetarian"), FULL_BREAKFAST_VEGETARIAN);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pancake_breakfast"), PANCAKE_BREAKFAST);
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ameranth_pancake_breakfast"), AMERANTH_PANCAKE_BREAKFAST);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "large_pancake_breakfast"), PANCAKE_BREAKFAST_LARGE);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "glow_soup"), GLOW_SOUP);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "clownfish_salad"), CLOWN_SALAD);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "maize_porridge"), MAIZE_PORRIDGE);
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ameranth_porridge"), AMERANTH_PORRIDGE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "beef_stew"), BEEF_STEW);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bear_stew"), BEAR_STEW);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rabbit_bigo"), SPICY_RABBIT_BIGO);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "lamb_biryani"), LAMB_BIRYANI);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "vege_stir_fry"), VEGE_STIR_FRY);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pork_stir_fry"), PORK_STIR_FRY);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bear_stir_fry"), BEAR_STIR_FRY);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bear_jerky"), BEAR_JERKY);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "seaweed_salad"), SEAWEED_SALAD);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "mandrake_soup"), MANDRAKE_SOUP);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cod_chowder"), COD_CHOWDER);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "sardine_soup"), SARDINE_SOUP);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "worm_bowl"), WORM_SOUP);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "chicken_curry"), CHICKEN_CURRY);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rice_bowl"), RICE_BOWL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "poke_bowl"), POKE_BOWL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dried_seaweed"), SEAWEED_ITEM);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "grilled_sucker"), GRILLED_SUCKER);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dried_salmon"), DRIED_SALMON);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fire_eel_dried"), DRIED_FIRE_EEL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dried_cod"), DRIED_COD);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dried_sucker"), DRIED_SUCKER);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dried_tropical_fish"), DRIED_TROPICAL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cooked_tropical_fish"), COOKED_TROPICAL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "sardine_cooked"), COOKED_SARDINE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fire_eel_cooked"), COOKED_FIRE_EEL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "crab_red_cooked"), COOKED_CRAB);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "salmon_roll"), SALMON_ROLL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "clownfish_roll"), CLOWNFISH_ROLL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "squid_roll"), SQUID_ROLL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fire_eel_roll"), FIRE_EEL_ROLL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "perch_roll"), PERCH_ROLL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "crab_roll"), CRAB_ROLL);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bbox_unagi"), BBOX_UNAGI);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bbox_clownfish"), BBOX_CLOWNFISH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bbox_salmon"), BBOX_SALMON);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cookie_dough"), COOKIE_DOUGH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cake_dough"), CAKE_DOUGH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "apple_dough"), APPLE_DOUGH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pumpkin_dough"), PUMPKIN_DOUGH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bitter_dough"), BB_DOUGH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "glow_dough"), GB_DOUGH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "sweet_dough"), SB_DOUGH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bread_dough"), BREAD_DOUGH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pancake_dough"), PANCAKE_DOUGH);
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ameranth_pancake_dough"), AMERANTH_PANCAKE_DOUGH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "skeleton_cookie_dough"), SKELE_DOUGH);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pancake"), PANCAKE);
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ameranth_pancake"), AMERANTH_PANCAKE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "apple_pie"), APPLE_PIE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bitter_pie"), BITTER_PIE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "sweet_pie"), SWEET_PIE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "glow_pie"), GLOW_PIE);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cake_slice"), CAKE_SLICE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "skeleton_cookie"), SKELE_COOKIE);


        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "honeycomb_chunk"), HONEYCOMB_CHUNK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "crystalized_honey"), CRYS_HONEY);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "frozen_jelly"), FROZEN_JELLY);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "candied_snow_yams"), CANDIED_SNOW_YAM);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cooked_apple"), COOKED_APPLE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "glazed_apple"), GLAZED_APPLE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cooked_pumpkin_seeds"), COOKED_PUMPKIN_SEEDS);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "drumstick"), DRUMSTICK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stuffed_onion"), STUFFED_ONION);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "baked_potato"), BAKED_POTATO_SPECIAL);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rice_item"), RICE_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "raw_bacon"), RAW_BACON);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cooked_bacon"), COOKED_BACON);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "raw_egg_bowl"), RAW_EGGS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "raw_tenderloin"), RAW_TENDER);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cooked_tenderloin"), COOKED_TENDER);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "worm"), WORM);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "salt"), SALT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "thyme"), THYME);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "black_peppercorns"), PEPPERCORN);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "watermelon_fruit_bowl"), B_WATER);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "grilled_watermelon"), G_WATER);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "morel_skewer"), MOREL_KABOB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fruit_kabob"), FRUIT_KABOB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "golden_kabob"), GOLDEN_FRUIT_KABOB);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "glistering_juice"), GOLDEN_J);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "glistering_honeycomb"), GOLDEN_H);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "glistering_bitter_berries"), GOLDEN_BB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "glistering_sweet_berries"), GOLDEN_SB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "glistering_spicy_berries"), GOLDEN_SPB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "glistering_glow_berries"), GOLDEN_GB_2);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "glistering_kelp"), GOLDEN_K);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "glistering_tomato"), GOLDEN_T);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "glistering_onion"), GOLDEN_O);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "glistering_potato"), GOLDEN_P);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "glistering_beet"), GOLDEN_B);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "glistering_green_bean"), GOLDEN_GB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "glistering_mandrake"), GOLDEN_M);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dog_biscuit"), DOG_BISCUIT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dog_food"), DOG_FOOD);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "monster_jerky"), MONSTER_JERKY);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "puppy_pumpkin"), DOG_PUMPKIN);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fox_food"), FOX_FOOD);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fox_treat"), FOX_TREAT);
    }
}