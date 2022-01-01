package io.github.linkle.valleycraft.init;

import io.github.linkle.valleycraft.items.food.*;
import io.github.linkle.valleycraft.utils.Util;
import net.minecraft.item.Item;

import static io.github.linkle.valleycraft.init.ItemGroups.MISC_GROUP;
import static net.minecraft.item.Items.GLASS_BOTTLE;

public class FoodAndCooking {
    public static final Item DRIED_SALMON = new FoodItemBase(new Item.Settings(), 4, 0.4f);
    public static final Item DRIED_SARDINE = new FoodItemBase(new Item.Settings(), 3, 0.4f);
    public static final Item COOKED_SARDINE = new FoodItemBase(new Item.Settings(), 4, 0.4f);
    public static final Item COOKED_CRAB = new FoodItemBase(new Item.Settings(), 7, 0.4f);
    public static final Item COOKED_PERCH = new FoodItemBase(new Item.Settings(), 4, 0.4f);
    public static final Item DRIED_FIRE_EEL = new FoodItemBase(new Item.Settings(), 3, 0.4f);
    public static final Item COOKED_FIRE_EEL = new FoodItemBase(new Item.Settings(), 4, 0.4f);
    public static final Item PEPPERCORN = new FoodItemBase(new Item.Settings(), 1, 0.6f);
    public static final Item THYME = new FoodItemBase(new Item.Settings(), 1, 0.6f);

    public static final Item DRIED_COD = new FoodItemBase(new Item.Settings(), 4, 0.4f);
    public static final Item DRIED_TROPICAL = new FoodItemBase(new Item.Settings(), 4, 0.4f);
    public static final Item COOKED_TROPICAL = new FoodItemBase(new Item.Settings(), 5, 0.4f);
    public static final Item DRIED_SUCKER = new FoodItemBase(new Item.Settings(), 4, 0.4f);
    public static final Item RICE_ITEM = new FoodItemBase(new Item.Settings(), 3, 0.6f);
    public static final Item SEAWEED_ITEM = new FoodItemBase(new Item.Settings(), 4, 0.6f);
    public static final Item MILK_BOTTLE = new MilkBottleBase(new Item.Settings().maxCount(16).recipeRemainder(GLASS_BOTTLE), 2, 0.5f);
    public static final Item CHOCO_MILK = new DrinkBottleBase(new Item.Settings().maxCount(1), 5, 0.5f, FoodStatusEffects.CHOCO_MILK);
    public static final Item PUMPKIN_BOTTLE = new DrinkBottleBase(new Item.Settings().maxCount(1), 7, 0.5f, FoodStatusEffects.PUMPKIN_BOTTLE);
    public static final Item TEA = new DrinkTeaBase(new Item.Settings().maxCount(1), 2, 1, FoodStatusEffects.TEA);
    public static final Item TEA_BB = new DrinkTeaBase(new Item.Settings().maxCount(1), 2, 1, FoodStatusEffects.TEA_BB);
    public static final Item TEA_SB = new DrinkTeaBase(new Item.Settings().maxCount(1), 2, 1, FoodStatusEffects.TEA_SB);
    public static final Item TEA_M = new DrinkTeaBase(new Item.Settings().maxCount(1), 2, 1, FoodStatusEffects.TEA_M);
    public static final Item TEA_D = new DrinkTeaBase(new Item.Settings().maxCount(1), 2, 1, FoodStatusEffects.TEA_D);
    public static final Item TEA_L = new DrinkTeaBase(new Item.Settings().maxCount(1), 2, 1, FoodStatusEffects.TEA_L);
    public static final Item TEA_SR = new DrinkTeaBase(new Item.Settings().maxCount(1), 2, 1, FoodStatusEffects.TEA_SR);

    public static final Item HONEYCOMB_CHUNK = new FoodItemBase(new Item.Settings(), 2, 1f, FoodStatusEffects.HONEYCOMB_CHUNK);
    public static final Item SALT = new FoodItemBase(new Item.Settings().group(MISC_GROUP), 1, 0.5f);
    public static final Item CLOWN_SALAD = new BowlBase(new Item.Settings().maxCount(1), 8, 0.6f, FoodStatusEffects.CLOWN_SALAD);
    public static final Item CAKE_SLICE = new FoodItemBase(new Item.Settings(), 2, 0.4f);

    public static final Item RAW_EGGS = new BowlBase(new Item.Settings().maxCount(1), 1, 1.2f, FoodStatusEffects.RAW_EGGS);
    public static final Item COOKED_EGG_BOWL = new BowlBase(new Item.Settings().maxCount(1), 5, 0.6f, true);
    public static final Item FRUIT_KABOB = new FoodItemBase(new Item.Settings(), 8, 0.6f);
    public static final Item MOREL_KABOB = new FoodItemBase(new Item.Settings(), 8, 0.6f);
    public static final Item GOLDEN_FRUIT_KABOB = new FoodItemBase(new Item.Settings(), 10, 0.6f);
    public static final Item APPLE_JUICE = new DrinkBottleBase(new Item.Settings().maxCount(1), 4, 0.5f, FoodStatusEffects.APPLE_JUICE);
    public static final Item BEET_JUICE = new DrinkBottleBase(new Item.Settings().maxCount(1), 4, 0.5f, FoodStatusEffects.BEET_JUICE);
    public static final Item CARROT_JUICE = new DrinkBottleBase(new Item.Settings().maxCount(1), 4, 0.5f, FoodStatusEffects.CARROT_JUICE);
    public static final Item POTATO_JUICE = new DrinkBottleBase(new Item.Settings().maxCount(1), 4, 0.5f, FoodStatusEffects.POTATO_JUICE);
    public static final Item MOREL_OIL = new DrinkBottleBase(new Item.Settings().maxCount(1), 4, 0.5f, FoodStatusEffects.MOREL_OIL);
    public static final Item GB_JUICE = new DrinkBottleBase(new Item.Settings().maxCount(1), 4, 0.5f, FoodStatusEffects.GB_JUICE);
    public static final Item GB_JUICE_2 = new DrinkBottleBase(new Item.Settings().maxCount(1), 4, 0.5f, FoodStatusEffects.GB_JUICE_2);

    public static final Item APPLE_DOUGH = new FoodItemBase(new Item.Settings(), 1, 0.5f);
    public static final Item CRAB_DOUGH = new FoodItemBase(new Item.Settings(), 1, 0.5f);
    public static final Item CARROT_SALAD = new BowlBase(new Item.Settings().maxCount(1), 6, 0.5f);
    public static final Item APPLE_PIE = new FoodItemBase(new Item.Settings(), 8, 0.5f);
    public static final Item PUMPKIN_BOWL = new BowlBase(new Item.Settings().maxCount(1), 7, 0.5f, FoodStatusEffects.PUMPKIN_BOWL);

    public static final Item BBOX_CLOWNFISH = new BBoxBase(new Item.Settings().maxCount(1), 10, 0.5f, FoodStatusEffects.BBOX_CLOWNFISH);
    public static final Item BBOX_SALMON = new BBoxBase(new Item.Settings().maxCount(1), 10, 0.5f, FoodStatusEffects.BBOX_SALMON);
    public static final Item BBOX_UNAGI = new BBoxBase(new Item.Settings().maxCount(1), 10, 0.5f, FoodStatusEffects.BBOX_UNAGI);
    public static final Item BBOX_GH_TAIL = new BBoxBase(new Item.Settings().maxCount(1), 10, 0.5f, FoodStatusEffects.BBOX_GH_TAIL);
    public static final Item STEAMED_COD = new FoodItemBase(new Item.Settings(), 10, 0.5f, FoodStatusEffects.STEAMED_COD);
    public static final Item CARROT_STEW = new BowlBase(new Item.Settings().maxCount(1), 6, 0.5f, FoodStatusEffects.CARROT_STEW);
    public static final Item CREAMY_HEART_STEW = new BowlBase(new Item.Settings().maxCount(1), 6, 0.5f, FoodStatusEffects.CREAMY_HEART_STEW);

    public static final Item CAKE_DOUGH = new FoodItemBase(new Item.Settings(), 1, 1f);
    public static final Item NETHER_FUNGUS_STEW = new BowlBase(new Item.Settings().maxCount(1), 8, 0.4f);

    public static final Item BONE_BROTH = new BowlBase(new Item.Settings().maxCount(1), 4, 0.5f);
    public static final Item TOMATO_SOUP = new BowlBase(new Item.Settings().maxCount(1), 5, 0.5f);

    public static final Item RICE_BOWL = new BowlBase(new Item.Settings().maxCount(1), 4, 0.5f);

    public static final Item COOKIE_DOUGH = new FoodItemBase(new Item.Settings(), 1, 0.5f);

    public static final Item SALMON_ROLL = new FoodItemBase(new Item.Settings(), 6, 0.5f, FoodStatusEffects.SALMON_ROLL);
    public static final Item CRAB_ROLL = new FoodItemBase(new Item.Settings(), 6, 0.5f, FoodStatusEffects.CRAB_ROLL);
    public static final Item PERCH_ROLL = new FoodItemBase(new Item.Settings(), 6, 0.5f, FoodStatusEffects.PERCH_ROLL);
    public static final Item FIRE_EEL_ROLL = new FoodItemBase(new Item.Settings(), 6, 0.5f, FoodStatusEffects.FIRE_EEL_ROLL);
    public static final Item OCTO_ROLL = new FoodItemBase(new Item.Settings(), 6, 0.5f, FoodStatusEffects.OCTO_ROLL);

    public static final Item SKELE_DOUGH = new FoodItemBase(new Item.Settings(), 1, 1f);
    public static final Item SKELE_COOKIE = new FoodItemBase(new Item.Settings(), 4, 0.7f);
    public static final Item GLAZED_APPLE = new FoodItemBase(new Item.Settings(), 5, 0.7f);

    public static final Item BREAD_DOUGH = new FoodItemBase(new Item.Settings(), 1, 1f);
    public static final Item PUMPKIN_DOUGH = new FoodItemBase(new Item.Settings(), 1, 1f);
    public static final Item PANCAKE_DOUGH = new FoodItemBase(new Item.Settings(), 1, 1f);
    public static final Item RAW_BACON = new FoodItemBase(new Item.Settings(), 1, 1f);
    public static final Item COOKED_BACON = new FoodItemBase(new Item.Settings(), 4, 0.5f, true);
    public static final Item PANCAKE = new FoodItemBase(new Item.Settings(), 5, 0.5f);
    public static final Item BB_DOUGH = new FoodItemBase(new Item.Settings(), 1, 1f);
    public static final Item SB_DOUGH = new FoodItemBase(new Item.Settings(), 1, 1f);
    public static final Item GB_DOUGH = new FoodItemBase(new Item.Settings(), 1, 1f);
    public static final Item SR_DOUGH = new FoodItemBase(new Item.Settings(), 1, 1f);

    public static final Item AMERANTH_PANCAKE_DOUGH = new FoodItemBase(new Item.Settings(), 1, 1f, FoodStatusEffects.AMERANTH_PANCAKE_DOUGH);
    public static final Item AMERANTH_PANCAKE = new FoodItemBase(new Item.Settings(), 5, 0.5f, FoodStatusEffects.AMERANTH_PANCAKE);
    public static final Item AMERANTH_PORRIDGE = new BowlBase(new Item.Settings(), 10, 0.5f, FoodStatusEffects.AMERANTH_PORRIDGE);
    public static final Item AMERANTH_PANCAKE_BREAKFAST = new BowlBase(new Item.Settings(), 8, 0.6f, FoodStatusEffects.AMERANTH_PANCAKE_BREAKFAST);

    public static final Item APPLE_CYSER = new MeadBase(new Item.Settings().maxCount(1), 3, 1f, FoodStatusEffects.APPLE_CYSER);
    public static final Item BITTER_BERRY_CYSER = new MeadBase(new Item.Settings().maxCount(1), 3, 1f, FoodStatusEffects.BITTER_BERRY_CYSER);
    public static final Item SPICY_BERRY_CYSER = new MeadBase(new Item.Settings().maxCount(1), 3, 1f, FoodStatusEffects.SPICY_BERRY_CYSER);
    public static final Item SWEET_BERRY_CYSER = new MeadBase(new Item.Settings().maxCount(1), 3, 1f, FoodStatusEffects.SWEET_BERRY_CYSER);
    public static final Item SOUR_BERRY_CYSER = new MeadBase(new Item.Settings().maxCount(1), 3, 1f, FoodStatusEffects.SOUR_BERRY_CYSER);
    public static final Item MEAD_MUG = new MeadBase(new Item.Settings().maxCount(64), 3, 1f, FoodStatusEffects.MEAD_MUG);
    public static final Item CHOCO_CYSER = new MeadBase(new Item.Settings().maxCount(1), 3, 1f, FoodStatusEffects.CHOCO_CYSER);

    public static final Item SWEET_BERRY_WINE = new DrinkBottleBase(new Item.Settings().maxCount(1), 2, 1f, FoodStatusEffects.SWEET_BERRY_WINE);
    public static final Item BITTER_BERRY_WINE = new DrinkBottleBase(new Item.Settings().maxCount(1), 2, 1f, FoodStatusEffects.BITTER_BERRY_WINE);
    public static final Item SOUR_BERRY_WINE = new DrinkBottleBase(new Item.Settings().maxCount(1), 2, 1f, FoodStatusEffects.SOUR_BERRY_WINE);
    public static final Item SPICY_BERRY_WINE = new DrinkBottleBase(new Item.Settings().maxCount(1), 2, 1f, FoodStatusEffects.SPICY_BERRY_WINE);
    public static final Item CHORUS_WINE = new DrinkBottleBase(new Item.Settings().maxCount(1), 2, 1f, FoodStatusEffects.CHORUS_WINE);

    public static final Item CHICKEN_CURRY = new BowlBase(new Item.Settings().maxCount(1), 10, 0.7f, FoodStatusEffects.CHICKEN_CURRY);
    public static final Item FULL_BREAKFAST_VEGETARIAN = new BowlBase(new Item.Settings().maxCount(1), 9, 0.6f, FoodStatusEffects.FULL_BREAKFAST_VEGETARIAN);
    public static final Item COOKED_PUMPKIN_SEEDS = new FoodItemBase(new Item.Settings(), 2, 0.4f);
    public static final Item COD_CHOWDER = new BowlBase(new Item.Settings().maxCount(1), 10, 0.7f, FoodStatusEffects.COD_CHOWDER);
    public static final Item CLAM_CHOWDER = new BowlBase(new Item.Settings().maxCount(1), 10, 0.7f, FoodStatusEffects.CLAM_CHOWDER);
    public static final Item SARDINE_SOUP = new BowlBase(new Item.Settings().maxCount(1), 10, 0.7f, FoodStatusEffects.SARDINE_SOUP);
    public static final Item SEAWEED_SALAD = new BowlBase(new Item.Settings().maxCount(1), 4, 0.5f);
    public static final Item MUSHROOM_SALAD = new BowlBase(new Item.Settings().maxCount(1), 4, 0.5f);
    public static final Item MINER_SALAD = new BowlBase(new Item.Settings().maxCount(1), 4, 0.4f);
    public static final Item POKE_BOWL = new BowlBase(new Item.Settings().maxCount(1), 8, 0.4f, FoodStatusEffects.POKE_BOWL);

    public static final Item TOMATO_JUICE = new DrinkBottleBase(new Item.Settings().maxCount(1), 4, 0.5f);
    public static final Item JUICE_EG = new DrinkBottleBase(new Item.Settings().maxCount(1), 4, 0.5f);
    public static final Item COCOA = new DrinkTeaBase(new Item.Settings().maxCount(1), 2, 0.5f, FoodStatusEffects.COCOA);
    public static final Item CLOWNFISH_ROLL = new FoodItemBase(new Item.Settings(), 6, 0.5f, FoodStatusEffects.CLOWNFISH_ROLL);
    public static final Item CRYS_HONEY = new FoodItemBase(new Item.Settings(), 4, 0.5f, FoodStatusEffects.CRYS_HONEY);
    public static final Item MAIZE_PORRIDGE = new BowlBase(new Item.Settings().maxCount(1), 10, 0.5f, FoodStatusEffects.MAIZE_PORRIDGE);
    public static final Item BEEF_STEW = new BowlBase(new Item.Settings().maxCount(1), 10, 0.5f, FoodStatusEffects.BEEF_STEW);
    public static final Item BEAR_STEW = new BowlBase(new Item.Settings().maxCount(1), 10, 0.5f, FoodStatusEffects.BEAR_STEW);
    public static final Item SPICY_RABBIT_BIGO = new BowlBase(new Item.Settings().maxCount(1), 10, 0.4f, FoodStatusEffects.SPICY_RABBIT_BIGO);
    public static final Item LAMB_BIRYANI = new BowlBase(new Item.Settings().maxCount(1), 9, 0.4f,FoodStatusEffects.LAMB_BIRYANI);
    public static final Item PORK_STIR_FRY = new BowlBase(new Item.Settings().maxCount(1), 10, 0.4f, FoodStatusEffects.PORK_STIR_FRY);
    public static final Item SQUID_ROLL = new FoodItemBase(new Item.Settings(), 6, 0.7f);
    public static final Item FROZEN_JELLY = new FoodItemBase(new Item.Settings(), 4, 0.6f, FoodStatusEffects.FROZEN_JELLY);
    public static final Item ROCK_CANDY = new FoodItemBase(new Item.Settings(), 4, 0.6f, FoodStatusEffects.ROCK_CANDY);
    public static final Item GRILLED_SUCKER = new FoodItemBase(new Item.Settings(), 6, 0.6f);
    public static final Item MONSTER_JERKY = new FoodItemBase(new Item.Settings(), 4, 0.4f, true);
    public static final Item GLOW_SOUP = new BowlBase(new Item.Settings().maxCount(1), 8, 0.7f, FoodStatusEffects.GLOW_SOUP);
    public static final Item BEAR_JERKY = new FoodItemBase(new Item.Settings(), 10, 0.4f, true);
    public static final Item RAW_TENDER = new FoodItemBase(new Item.Settings(), 5, 0.4f, true);
    public static final Item COOKED_TENDER = new FoodItemBase(new Item.Settings(), 8, 0.4f, true);

    public static final Item PANCAKE_BREAKFAST = new BowlBase(new Item.Settings().maxCount(1), 8, 0.6f, FoodStatusEffects.PANCAKE_BREAKFAST);
    public static final Item PANCAKE_BREAKFAST_LARGE = new BowlBase(new Item.Settings().maxCount(1), 10, 0.6f, FoodStatusEffects.PANCAKE_BREAKFAST_LARGE);
    public static final Item FULL_BREAKFAST = new BowlBase(new Item.Settings().maxCount(1), 10, 0.6f, FoodStatusEffects.FULL_BREAKFAST);
    public static final Item BACON_AND_EGGS = new BowlBase(new Item.Settings().maxCount(1), 8, 0.6f, FoodStatusEffects.BACON_AND_EGGS);
    public static final Item DUMPLING = new FoodItemBase(new Item.Settings(), 8, 0.6f, FoodStatusEffects.DUMPLING);

    public static final Item GRUB = new BowlBase(new Item.Settings().maxCount(1), 12, 0.6f, FoodStatusEffects.GRUB);

    public static final Item DRUMSTICK = new FoodItemBase(new Item.Settings(), 4, 0.6f);
    public static final Item COOKED_APPLE = new FoodItemBase(new Item.Settings(), 6, 0.5f);
    public static final Item STUFFED_ONION = new FoodItemBase(new Item.Settings(), 9, 0.5f, true, FoodStatusEffects.STUFFED_ONION);
    public static final Item BAKED_POTATO_SPECIAL= new FoodItemBase(new Item.Settings(), 9, 0.5f, FoodStatusEffects.BAKED_POTATO_SPECIAL);
    public static final Item WORM = new FoodItemBase(new Item.Settings(), 2, 0.6f);

    public static final Item DOG_BISCUIT= new FoodItemBase(new Item.Settings(), 8, 0.5f, true);
    public static final Item DOG_FOOD = new BowlBase(new Item.Settings().maxCount(1), 8, 0.6f, true, FoodStatusEffects.DOG_FOOD);
    public static final Item DOG_PUMPKIN= new FoodItemBase(new Item.Settings(), 8, 0.5f, true);
    public static final Item FOX_FOOD = new BowlBase(new Item.Settings().maxCount(1), 8, 0.6f, true, FoodStatusEffects.FOX_FOOD);
    public static final Item FOX_TREAT= new FoodItemBase(new Item.Settings(), 8, 0.5f, true);

    public static final Item GOLDEN_BB = new FoodItemBase(new Item.Settings(), 10, 0.6f);
    public static final Item GOLDEN_SB = new FoodItemBase(new Item.Settings(), 10, 0.6f);
    public static final Item GOLDEN_SRB = new FoodItemBase(new Item.Settings(), 10, 0.6f);
    public static final Item GOLDEN_SPB = new FoodItemBase(new Item.Settings(), 10, 0.6f);
    public static final Item GOLDEN_P = new FoodItemBase(new Item.Settings(), 10, 0.6f);
    public static final Item GOLDEN_B = new FoodItemBase(new Item.Settings(), 10, 0.6f);
    public static final Item GOLDEN_O = new FoodItemBase(new Item.Settings(), 10, 0.6f);
    public static final Item GOLDEN_C = new FoodItemBase(new Item.Settings(), 10, 0.6f);
    public static final Item GOLDEN_SY = new FoodItemBase(new Item.Settings(), 10, 0.6f);
    public static final Item GOLDEN_T = new FoodItemBase(new Item.Settings(), 10, 0.6f);
    public static final Item GOLDEN_K = new FoodItemBase(new Item.Settings(), 10, 0.6f);
    public static final Item GOLDEN_H = new FoodItemBase(new Item.Settings(), 10, 0.6f);
    public static final Item GOLDEN_J = new DrinkBottleBase(new Item.Settings().maxCount(1), 10, 0.6f);
    public static final Item GOLDEN_GB = new FoodItemBase(new Item.Settings(), 10, 0.6f);
    public static final Item GOLDEN_M = new FoodItemBase(new Item.Settings(), 10, 0.6f);
    public static final Item GOLDEN_EP = new FoodItemBase(new Item.Settings(), 10, 0.6f);
    public static final Item GOLDEN_GB_2 = new FoodItemBase(new Item.Settings(), 10, 0.6f);
    public static final Item VEGE_STIR_FRY = new BowlBase(new Item.Settings().maxCount(1), 10, 0.4f, FoodStatusEffects.VEGE_STIR_FRY);
    public static final Item EGG_STIR_FRY = new BowlBase(new Item.Settings().maxCount(1), 10, 0.4f, FoodStatusEffects.EGG_STIR_FRY);
    public static final Item BEAR_STIR_FRY = new BowlBase(new Item.Settings().maxCount(1), 10, 0.4f, FoodStatusEffects.BEAR_STIR_FRY);
    public static final Item MANDRAKE_SOUP = new BowlBase(new Item.Settings().maxCount(1), 9, 0.4f, FoodStatusEffects.MANDRAKE_SOUP);
    public static final Item CANDIED_SNOW_YAM = new BowlBase(new Item.Settings().maxCount(1), 9, 0.4f, FoodStatusEffects.CANDIED_SNOW_YAM);
    public static final Item WINTER_ROOT_STEW = new BowlBase(new Item.Settings().maxCount(1), 9, 0.4f, FoodStatusEffects.WINTER_ROOT_STEW);
    public static final Item WORM_SOUP = new BowlBase(new Item.Settings().maxCount(1), 8, 0.8f, FoodStatusEffects.WORM_SOUP);
    public static final Item SLIME_SOUP = new BowlBase(new Item.Settings().maxCount(1), 5, 0.4f, FoodStatusEffects.SLIME_SOUP);

    public static final Item VEGE_BOWL = new BowlBase(new Item.Settings().maxCount(1), 8, 0.4f);
    public static final Item FRUIT_BOWL = new BowlBase(new Item.Settings().maxCount(1), 8, 0.4f);

    public static final Item BITTER_PIE = new FoodItemBase(new Item.Settings(), 8, 0.5f);
    public static final Item SWEET_PIE = new FoodItemBase(new Item.Settings(), 8, 0.5f);
    public static final Item GLOW_PIE = new FoodItemBase(new Item.Settings(), 8, 0.5f);
    public static final Item SOUR_PIE = new FoodItemBase(new Item.Settings(), 8, 0.5f);
    public static final Item CRAB_CAKE = new FoodItemBase(new Item.Settings(), 8, 0.5f, FoodStatusEffects.CRAB_CAKE);

    public static final Item G_WATER = new FoodItemBase(new Item.Settings(), 4, 0.5f);
    public static final Item B_WATER = new FoodItemBase(new Item.Settings(), 8, 0.5f);
    public static final Item GOLDEN_PE = new FoodItemBase(new Item.Settings(), 10, 0.6f);

    public static final Item SANDWICH_CHEESE = new FoodItemBase(new Item.Settings(), 10, 0.7f);
    public static final Item SANDWICH_BLT = new FoodItemBase(new Item.Settings(), 10, 0.7f);
    public static final Item SANDWICH_BEEF = new FoodItemBase(new Item.Settings(), 11, 0.8f);
    public static final Item SANDWICH_PORK = new FoodItemBase(new Item.Settings(), 11, 0.8f);
    public static final Item SANDWICH_MUTTON = new FoodItemBase(new Item.Settings(), 11, 0.8f);
    public static final Item SANDWICH_TENDERLOIN = new FoodItemBase(new Item.Settings(), 11, 0.8f);
    public static final Item CHICKEN_SOUP = new BowlBase(new Item.Settings().maxCount(1), 8, 0.7f);
    public static final Item FISH_PLATTER = new BowlBase(new Item.Settings().maxCount(1), 8, 0.5f);


    public static void initialize() {
        Util.register("tea", TEA);
        Util.register("tea_sb", TEA_SB);
        Util.register("tea_bb", TEA_BB);
        Util.register("tea_miner", TEA_M);
        Util.register("tea_dandelion", TEA_D);
        Util.register("tea_lavender", TEA_L);
        Util.register("tea_sour_berry", TEA_SR);

        Util.register("cocoa", COCOA);

        Util.register("mead_mug", MEAD_MUG);
        Util.register("sweet_berry_cyser", SWEET_BERRY_CYSER);
        Util.register("spicy_berry_cyser", SPICY_BERRY_CYSER);
        Util.register("bitter_berry_cyser", BITTER_BERRY_CYSER);
        Util.register("sour_berry_cyser", SOUR_BERRY_CYSER);
        Util.register("apple_cyser", APPLE_CYSER);
        Util.register("chocolate_cyser", CHOCO_CYSER);

        Util.register("sweet_berry_wine", SWEET_BERRY_WINE);
        Util.register("spicy_berry_wine", SPICY_BERRY_WINE);
        Util.register("bitter_berry_wine", BITTER_BERRY_WINE);
        Util.register("sour_berry_wine", SOUR_BERRY_WINE);
        Util.register("chorus_wine", CHORUS_WINE);

        Util.register("milk_bottle", MILK_BOTTLE);
        Util.register("chocolate_milk", CHOCO_MILK);
        Util.register("tomato_juice", TOMATO_JUICE);
        Util.register("apple_juice", APPLE_JUICE);
        Util.register("glow_berry_juice", GB_JUICE_2);
        Util.register("beet_juice", BEET_JUICE);
        Util.register("carrot_juice", CARROT_JUICE);
        Util.register("potato_juice", POTATO_JUICE);
        Util.register("gb_juice", GB_JUICE);
        Util.register("eggplant_juice", JUICE_EG);
        Util.register("pumpkin_bottle", PUMPKIN_BOTTLE);
        Util.register("morel_oil", MOREL_OIL);

        Util.register("grub", GRUB);
        Util.register("pumpkin_bowl", PUMPKIN_BOWL);
        Util.register("tomato_soup", TOMATO_SOUP);
        Util.register("chicken_soup", CHICKEN_SOUP);
        Util.register("carrot_stew", CARROT_STEW);
        Util.register("creamy_heart_stew", CREAMY_HEART_STEW);
        //register("winter_root_stew", WINTER_ROOT_STEW);
        Util.register("bone_broth", BONE_BROTH);
        Util.register("nether_fungus_stew", NETHER_FUNGUS_STEW);
        Util.register("carrot_salad", CARROT_SALAD);
        Util.register("mushroom_salad", MUSHROOM_SALAD);
        Util.register("miners_salad", MINER_SALAD);

        Util.register("cooked_egg_bowl", COOKED_EGG_BOWL);
        Util.register("bacon_and_eggs", BACON_AND_EGGS);
        Util.register("full_breakfast", FULL_BREAKFAST);
        Util.register("full_breakfast_vegetarian", FULL_BREAKFAST_VEGETARIAN);
        Util.register("pancake_breakfast", PANCAKE_BREAKFAST);
        //register("ameranth_pancake_breakfast", AMERANTH_PANCAKE_BREAKFAST);
        Util.register("large_pancake_breakfast", PANCAKE_BREAKFAST_LARGE);

        Util.register("fish_platter", FISH_PLATTER);
        Util.register("glow_soup", GLOW_SOUP);
        Util.register("clownfish_salad", CLOWN_SALAD);
        Util.register("maize_porridge", MAIZE_PORRIDGE);
        //register("ameranth_porridge", AMERANTH_PORRIDGE);
        Util.register("beef_stew", BEEF_STEW);
        Util.register("bear_stew", BEAR_STEW);
        Util.register("rabbit_bigo", SPICY_RABBIT_BIGO);
        Util.register("lamb_biryani", LAMB_BIRYANI);
        Util.register("vege_stir_fry", VEGE_STIR_FRY);
        Util.register("eggplant_stir_fry", EGG_STIR_FRY);
        Util.register("pork_stir_fry", PORK_STIR_FRY);
        Util.register("bear_stir_fry", BEAR_STIR_FRY);
        Util.register("seaweed_salad", SEAWEED_SALAD);
        Util.register("mandrake_soup", MANDRAKE_SOUP);
        Util.register("cod_chowder", COD_CHOWDER);
        Util.register("clam_chowder", CLAM_CHOWDER);
        Util.register("sardine_soup", SARDINE_SOUP);
        Util.register("worm_bowl", WORM_SOUP);
        Util.register("slime_soup", SLIME_SOUP);
        Util.register("chicken_curry", CHICKEN_CURRY);
        Util.register("rice_bowl", RICE_BOWL);
        Util.register("vege_bowl", VEGE_BOWL);
        Util.register("fruit_bowl", FRUIT_BOWL);

        Util.register("poke_bowl", POKE_BOWL);
        Util.register("dried_seaweed", SEAWEED_ITEM);

        Util.register("grilled_sucker", GRILLED_SUCKER);
        Util.register("steamed_cod", STEAMED_COD);
        Util.register("dried_salmon", DRIED_SALMON);
        Util.register("fire_eel_dried", DRIED_FIRE_EEL);
        Util.register("dried_cod", DRIED_COD);
        Util.register("dried_sucker", DRIED_SUCKER);
        Util.register("dried_tropical_fish", DRIED_TROPICAL);
        Util.register("cooked_tropical_fish", COOKED_TROPICAL);
        Util.register("sardine_cooked", COOKED_SARDINE);
        Util.register("fire_eel_cooked", COOKED_FIRE_EEL);
        Util.register("crab_red_cooked", COOKED_CRAB);

        Util.register("salmon_roll", SALMON_ROLL);
        Util.register("clownfish_roll", CLOWNFISH_ROLL);
        Util.register("squid_roll", SQUID_ROLL);
        Util.register("fire_eel_roll", FIRE_EEL_ROLL);
        Util.register("perch_roll", PERCH_ROLL);
        Util.register("crab_roll", CRAB_ROLL);
        Util.register("octo_roll", OCTO_ROLL);

        Util.register("bbox_unagi", BBOX_UNAGI);
        Util.register("bbox_clownfish", BBOX_CLOWNFISH);
        Util.register("bbox_salmon", BBOX_SALMON);
        Util.register("bbox_ghost", BBOX_GH_TAIL);

        Util.register("grilled_cheese", SANDWICH_CHEESE);
        Util.register("blt", SANDWICH_BLT);
        Util.register("steak_sandwich", SANDWICH_BEEF);
        Util.register("pork_sandwich", SANDWICH_PORK);
        Util.register("mutton_sandwich", SANDWICH_MUTTON);
        Util.register("tenderloin_sandwich", SANDWICH_TENDERLOIN);

        Util.register("cookie_dough", COOKIE_DOUGH);
        Util.register("cake_dough", CAKE_DOUGH);
        Util.register("apple_dough", APPLE_DOUGH);
        Util.register("pumpkin_dough", PUMPKIN_DOUGH);
        Util.register("sweet_dough", SB_DOUGH);
        Util.register("bitter_dough", BB_DOUGH);
        Util.register("sour_dough", SR_DOUGH);
        Util.register("glow_dough", GB_DOUGH);
        Util.register("bread_dough", BREAD_DOUGH);
        Util.register("pancake_dough", PANCAKE_DOUGH);
        //register("ameranth_pancake_dough", AMERANTH_PANCAKE_DOUGH);
        Util.register("skeleton_cookie_dough", SKELE_DOUGH);
        Util.register("crabcake_dough", CRAB_DOUGH);

        Util.register("pancake", PANCAKE);
        //register("ameranth_pancake", AMERANTH_PANCAKE);
        Util.register("apple_pie", APPLE_PIE);
        Util.register("sweet_pie", SWEET_PIE);
        Util.register("bitter_pie", BITTER_PIE);
        Util.register("sour_pie", SOUR_PIE);
        Util.register("glow_pie", GLOW_PIE);

        Util.register("cake_slice", CAKE_SLICE);
        Util.register("skeleton_cookie", SKELE_COOKIE);
        Util.register("crabcake", CRAB_CAKE);


        Util.register("honeycomb_chunk", HONEYCOMB_CHUNK);
        Util.register("crystalized_honey", CRYS_HONEY);
        Util.register("frozen_jelly", FROZEN_JELLY);
        Util.register("rock_candy", ROCK_CANDY);
        Util.register("candied_snow_yams", CANDIED_SNOW_YAM);

        Util.register("cooked_apple", COOKED_APPLE);
        Util.register("glazed_apple", GLAZED_APPLE);
        Util.register("cooked_pumpkin_seeds", COOKED_PUMPKIN_SEEDS);

        Util.register("drumstick", DRUMSTICK);
        Util.register("stuffed_onion", STUFFED_ONION);
        Util.register("baked_potato", BAKED_POTATO_SPECIAL);
        Util.register("dumpling", DUMPLING);

        Util.register("rice_item", RICE_ITEM);
        Util.register("raw_bacon", RAW_BACON);
        Util.register("cooked_bacon", COOKED_BACON);
        Util.register("raw_egg_bowl", RAW_EGGS);
        Util.register("raw_tenderloin", RAW_TENDER);
        Util.register("cooked_tenderloin", COOKED_TENDER);
        Util.register("bear_jerky", BEAR_JERKY);

        Util.register("salt", SALT);
        //register("thyme", THYME);
        //register("black_peppercorns", PEPPERCORN);

        Util.register("watermelon_fruit_bowl", B_WATER);
        Util.register("grilled_watermelon", G_WATER);

        Util.register("morel_skewer", MOREL_KABOB);
        Util.register("fruit_kabob", FRUIT_KABOB);
        Util.register("golden_kabob", GOLDEN_FRUIT_KABOB);

        Util.register("glistering_juice", GOLDEN_J);
        Util.register("glistering_honeycomb", GOLDEN_H);
        Util.register("glistering_sweet_berries", GOLDEN_SB);
        Util.register("glistering_spicy_berries", GOLDEN_SPB);
        Util.register("glistering_bitter_berries", GOLDEN_BB);
        Util.register("glistering_sour_berries", GOLDEN_SRB);
        Util.register("glistering_glow_berries", GOLDEN_GB_2);
        Util.register("glistering_kelp", GOLDEN_K);
        Util.register("glistering_tomato", GOLDEN_T);
        Util.register("glistering_onion", GOLDEN_O);
        Util.register("glistering_potato", GOLDEN_P);
        Util.register("glistering_beet", GOLDEN_B);
        Util.register("glistering_green_bean", GOLDEN_GB);
        Util.register("glistering_mandrake", GOLDEN_M);
        Util.register("glistering_corn", GOLDEN_C);
        Util.register("glistering_snow_yam", GOLDEN_SY);
        Util.register("glistering_pepper", GOLDEN_PE);
        Util.register("glistering_eggplant", GOLDEN_EP);

        Util.register("dog_biscuit", DOG_BISCUIT);
        Util.register("dog_food", DOG_FOOD);
        Util.register("monster_jerky", MONSTER_JERKY);
        Util.register("puppy_pumpkin", DOG_PUMPKIN);
        Util.register("fox_food", FOX_FOOD);
        Util.register("fox_treat", FOX_TREAT);
        Util.register("worm", WORM);
    }
}