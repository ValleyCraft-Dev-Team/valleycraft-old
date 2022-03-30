package io.github.linkle.valleycraft.init;

import io.github.linkle.valleycraft.items.food.*;
import net.minecraft.item.Item;

import static io.github.linkle.valleycraft.init.ItemGroups.MISC_GROUP;
import static net.minecraft.item.Items.GLASS_BOTTLE;

public class FoodAndCooking {
    public static final Item DRIED_SALMON = new FoodItemBase(new Item.Settings(), 4, 0.4f);
    //public static final Item DRIED_SARDINE = new FoodItemBase(new Item.Settings(), 3, 0.4f);
    public static final Item COOKED_SARDINE = new FoodItemBase(new Item.Settings(), 4, 0.4f);
    public static final Item COOKED_RED_PORGY = new FoodItemBase(new Item.Settings(), 4, 0.4f);
    public static final Item COOKED_CRAB = new FoodItemBase(new Item.Settings(), 7, 0.4f);
    public static final Item COOKED_LOBSTER = new FoodItemBase(new Item.Settings(), 7, 0.4f);
    public static final Item COOKED_PERCH = new FoodItemBase(new Item.Settings(), 4, 0.4f);
    public static final Item DRIED_FIRE_EEL = new FoodItemBase(new Item.Settings(), 4, 0.4f);
    public static final Item COOKED_FIRE_EEL = new FoodItemBase(new Item.Settings(), 5, 0.4f);
    public static final Item COOKED_SEA_URCHIN = new FoodItemBase(new Item.Settings(), 6, 0.5f);
    //public static final Item PEPPERCORN = new FoodItemBase(new Item.Settings(), 1, 0.6f);
    //public static final Item THYME = new FoodItemBase(new Item.Settings(), 1, 0.6f);
    public static final Item COOKED_PRIDEFIN = new FoodItemBase(new Item.Settings(), 8, 0.5f);
    public static final Item COOKED_STONESPINNER_MINNOW = new FoodItemBase(new Item.Settings(), 3, 0.3f);

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
    public static final Item BBOX_ABYSS = new BBoxBase(new Item.Settings().maxCount(1), 10, 0.5f, FoodStatusEffects.BBOX_ABYSS);
    public static final Item STEAMED_COD = new FoodItemBase(new Item.Settings(), 10, 0.5f, FoodStatusEffects.STEAMED_COD);
    public static final Item CARROT_STEW = new BowlBase(new Item.Settings().maxCount(1), 6, 0.5f, FoodStatusEffects.CARROT_STEW);
    public static final Item CREAMY_HEART_STEW = new BowlBase(new Item.Settings().maxCount(1), 6, 0.5f, FoodStatusEffects.CREAMY_HEART_STEW);

    public static final Item CAKE_DOUGH = new FoodItemBase(new Item.Settings(), 1, 1f);
    public static final Item NETHER_FUNGUS_STEW = new BowlBase(new Item.Settings().maxCount(1), 8, 0.4f);

    public static final Item BONE_BROTH = new BowlBase(new Item.Settings().maxCount(1), 4, 0.5f);
    public static final Item TOMATO_SOUP = new BowlBase(new Item.Settings().maxCount(1), 5, 0.5f);
    public static final Item ORANGE_GILL_SOUP = new BowlBase(new Item.Settings().maxCount(1), 5, 0.5f);

    public static final Item RICE_BOWL = new BowlBase(new Item.Settings().maxCount(1), 4, 0.5f);

    public static final Item COOKIE_DOUGH = new FoodItemBase(new Item.Settings(), 1, 0.5f);

    public static final Item SALMON_ROLL = new FoodItemBase(new Item.Settings(), 6, 0.5f, FoodStatusEffects.SALMON_ROLL);
    public static final Item CRAB_ROLL = new FoodItemBase(new Item.Settings(), 6, 0.5f, FoodStatusEffects.CRAB_ROLL);
    public static final Item PERCH_ROLL = new FoodItemBase(new Item.Settings(), 6, 0.5f, FoodStatusEffects.PERCH_ROLL);
    public static final Item FIRE_EEL_ROLL = new FoodItemBase(new Item.Settings(), 6, 0.5f, FoodStatusEffects.FIRE_EEL_ROLL);
    public static final Item OCTO_ROLL = new FoodItemBase(new Item.Settings(), 6, 0.5f, FoodStatusEffects.OCTO_ROLL);
    public static final Item CLOWNFISH_ROLL = new FoodItemBase(new Item.Settings(), 6, 0.5f, FoodStatusEffects.CLOWNFISH_ROLL);
    public static final Item PRIDEFIN_ROLL = new FoodItemBase(new Item.Settings(), 6, 0.5f, FoodStatusEffects.PRIDEFIN_ROLL);
    public static final Item RAINBOW_ROLL = new FoodItemBase(new Item.Settings(), 6, 0.5f, FoodStatusEffects.RAINBOW_ROLL);
    public static final Item SQUID_ROLL = new FoodItemBase(new Item.Settings(), 6, 0.5f, FoodStatusEffects.SQUID_ROLL);

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

    //public static final Item AMERANTH_PANCAKE_DOUGH = new FoodItemBase(new Item.Settings(), 1, 1f, FoodStatusEffects.AMERANTH_PANCAKE_DOUGH);
    //public static final Item AMERANTH_PANCAKE = new FoodItemBase(new Item.Settings(), 5, 0.5f, FoodStatusEffects.AMERANTH_PANCAKE);
    //public static final Item AMERANTH_PORRIDGE = new BowlBase(new Item.Settings(), 10, 0.5f, FoodStatusEffects.AMERANTH_PORRIDGE);
    //public static final Item AMERANTH_PANCAKE_BREAKFAST = new BowlBase(new Item.Settings(), 8, 0.6f, FoodStatusEffects.AMERANTH_PANCAKE_BREAKFAST);

    public static final Item APPLE_CYSER = new MeadBase(new Item.Settings().maxCount(1), 3, 1f, FoodStatusEffects.APPLE_CYSER);
    public static final Item BITTER_BERRY_CYSER = new MeadBase(new Item.Settings().maxCount(1), 3, 1f, FoodStatusEffects.BITTER_BERRY_CYSER);
    public static final Item SPICY_BERRY_CYSER = new MeadBase(new Item.Settings().maxCount(1), 3, 1f, FoodStatusEffects.SPICY_BERRY_CYSER);
    public static final Item SWEET_BERRY_CYSER = new MeadBase(new Item.Settings().maxCount(1), 3, 1f, FoodStatusEffects.SWEET_BERRY_CYSER);
    public static final Item SOUR_BERRY_CYSER = new MeadBase(new Item.Settings().maxCount(1), 3, 1f, FoodStatusEffects.SOUR_BERRY_CYSER);
    public static final Item MEAD_MUG = new MeadBase(new Item.Settings().maxCount(1), 3, 1f, FoodStatusEffects.MEAD_MUG);
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
    public static final Item CRYS_HONEY = new FoodItemBase(new Item.Settings(), 4, 0.5f, FoodStatusEffects.CRYS_HONEY);
    public static final Item MAIZE_PORRIDGE = new BowlBase(new Item.Settings().maxCount(1), 10, 0.5f, FoodStatusEffects.MAIZE_PORRIDGE);
    public static final Item BEEF_STEW = new BowlBase(new Item.Settings().maxCount(1), 10, 0.5f, FoodStatusEffects.BEEF_STEW);
    public static final Item BEAR_STEW = new BowlBase(new Item.Settings().maxCount(1), 10, 0.5f, FoodStatusEffects.BEAR_STEW);
    public static final Item SPICY_RABBIT_BIGO = new BowlBase(new Item.Settings().maxCount(1), 10, 0.4f, FoodStatusEffects.SPICY_RABBIT_BIGO);
    public static final Item LAMB_BIRYANI = new BowlBase(new Item.Settings().maxCount(1), 9, 0.4f,FoodStatusEffects.LAMB_BIRYANI);
    public static final Item PORK_STIR_FRY = new BowlBase(new Item.Settings().maxCount(1), 10, 0.4f, FoodStatusEffects.PORK_STIR_FRY);
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
    //public static final Item WINTER_ROOT_STEW = new BowlBase(new Item.Settings().maxCount(1), 9, 0.4f, FoodStatusEffects.WINTER_ROOT_STEW);
    public static final Item WORM_SOUP = new BowlBase(new Item.Settings().maxCount(1), 8, 0.8f, FoodStatusEffects.WORM_SOUP);
    public static final Item SLIME_SOUP = new BowlBase(new Item.Settings().maxCount(1), 5, 0.4f, FoodStatusEffects.SLIME_SOUP);

    public static final Item VEGE_BOWL = new BowlBase(new Item.Settings().maxCount(1), 8, 0.4f);
    public static final Item FRUIT_BOWL = new BowlBase(new Item.Settings().maxCount(1), 8, 0.4f);

    public static final Item BITTER_PIE = new FoodItemBase(new Item.Settings(), 8, 0.5f);
    public static final Item SWEET_PIE = new FoodItemBase(new Item.Settings(), 8, 0.5f);
    public static final Item GLOW_PIE = new FoodItemBase(new Item.Settings(), 8, 0.5f);
    public static final Item SOUR_PIE = new FoodItemBase(new Item.Settings(), 8, 0.5f);
    public static final Item CRAB_CAKE = new FoodItemBase(new Item.Settings(), 8, 0.5f, FoodStatusEffects.CRAB_CAKE);
    public static final Item SEA_URCHIN_SOUP = new FoodItemBase(new Item.Settings(), 8, 0.6f, FoodStatusEffects.CRAB_CAKE);

    public static final Item G_WATER = new FoodItemBase(new Item.Settings(), 4, 0.5f);
    public static final Item B_WATER = new FoodItemBase(new Item.Settings(), 8, 0.5f);
    public static final Item GOLDEN_PE = new FoodItemBase(new Item.Settings(), 10, 0.6f);

    public static final Item SANDWICH_CHEESE = new FoodItemBase(new Item.Settings(), 9, 0.4f);
    public static final Item SANDWICH_BLT = new FoodItemBase(new Item.Settings(), 9, 0.4f);
    public static final Item SANDWICH_BEEF = new FoodItemBase(new Item.Settings(), 10, 0.3f);
    public static final Item SANDWICH_PORK = new FoodItemBase(new Item.Settings(), 10, 0.3f);
    public static final Item SANDWICH_MUTTON = new FoodItemBase(new Item.Settings(), 10, 0.3f);
    public static final Item SANDWICH_TENDERLOIN = new FoodItemBase(new Item.Settings(), 10, 0.3f);
    public static final Item CHICKEN_SOUP = new BowlBase(new Item.Settings().maxCount(1), 8, 0.5f);
    public static final Item FISH_PLATTER = new BowlBase(new Item.Settings().maxCount(1), 8, 0.5f);


    public static void initialize() {
        Reg.register("tea", TEA);
        Reg.register("tea_sb", TEA_SB);
        Reg.register("tea_bb", TEA_BB);
        Reg.register("tea_miner", TEA_M);
        Reg.register("tea_dandelion", TEA_D);
        Reg.register("tea_lavender", TEA_L);
        Reg.register("tea_sour_berry", TEA_SR);

        Reg.register("cocoa", COCOA);

        Reg.register("mead_mug", MEAD_MUG);
        Reg.register("sweet_berry_cyser", SWEET_BERRY_CYSER);
        Reg.register("spicy_berry_cyser", SPICY_BERRY_CYSER);
        Reg.register("bitter_berry_cyser", BITTER_BERRY_CYSER);
        Reg.register("sour_berry_cyser", SOUR_BERRY_CYSER);
        Reg.register("apple_cyser", APPLE_CYSER);
        Reg.register("chocolate_cyser", CHOCO_CYSER);

        Reg.register("sweet_berry_wine", SWEET_BERRY_WINE);
        Reg.register("spicy_berry_wine", SPICY_BERRY_WINE);
        Reg.register("bitter_berry_wine", BITTER_BERRY_WINE);
        Reg.register("sour_berry_wine", SOUR_BERRY_WINE);
        Reg.register("chorus_wine", CHORUS_WINE);

        Reg.register("milk_bottle", MILK_BOTTLE);
        Reg.register("chocolate_milk", CHOCO_MILK);
        Reg.register("tomato_juice", TOMATO_JUICE);
        Reg.register("apple_juice", APPLE_JUICE);
        Reg.register("glow_berry_juice", GB_JUICE_2);
        Reg.register("beet_juice", BEET_JUICE);
        Reg.register("carrot_juice", CARROT_JUICE);
        Reg.register("potato_juice", POTATO_JUICE);
        Reg.register("gb_juice", GB_JUICE);
        Reg.register("eggplant_juice", JUICE_EG);
        Reg.register("pumpkin_bottle", PUMPKIN_BOTTLE);
        Reg.register("morel_oil", MOREL_OIL);

        Reg.register("grub", GRUB);
        Reg.register("pumpkin_bowl", PUMPKIN_BOWL);
        Reg.register("tomato_soup", TOMATO_SOUP);
        Reg.register("orange_gilled_waxing_cap_soup", ORANGE_GILL_SOUP);
        Reg.register("chicken_soup", CHICKEN_SOUP);
        Reg.register("carrot_stew", CARROT_STEW);
        Reg.register("creamy_heart_stew", CREAMY_HEART_STEW);
        //register("winter_root_stew", WINTER_ROOT_STEW);
        Reg.register("bone_broth", BONE_BROTH);
        Reg.register("nether_fungus_stew", NETHER_FUNGUS_STEW);
        Reg.register("carrot_salad", CARROT_SALAD);
        Reg.register("mushroom_salad", MUSHROOM_SALAD);
        Reg.register("miners_salad", MINER_SALAD);

        Reg.register("cooked_egg_bowl", COOKED_EGG_BOWL);
        Reg.register("bacon_and_eggs", BACON_AND_EGGS);
        Reg.register("full_breakfast", FULL_BREAKFAST);
        Reg.register("full_breakfast_vegetarian", FULL_BREAKFAST_VEGETARIAN);
        Reg.register("pancake_breakfast", PANCAKE_BREAKFAST);
        //register("ameranth_pancake_breakfast", AMERANTH_PANCAKE_BREAKFAST);
        Reg.register("large_pancake_breakfast", PANCAKE_BREAKFAST_LARGE);

        Reg.register("fish_platter", FISH_PLATTER);
        Reg.register("glow_soup", GLOW_SOUP);
        Reg.register("sea_urchin_soup", SEA_URCHIN_SOUP);
        Reg.register("clownfish_salad", CLOWN_SALAD);
        Reg.register("maize_porridge", MAIZE_PORRIDGE);
        //register("ameranth_porridge", AMERANTH_PORRIDGE);
        Reg.register("beef_stew", BEEF_STEW);
        Reg.register("bear_stew", BEAR_STEW);
        Reg.register("rabbit_bigo", SPICY_RABBIT_BIGO);
        Reg.register("lamb_biryani", LAMB_BIRYANI);
        Reg.register("vege_stir_fry", VEGE_STIR_FRY);
        Reg.register("eggplant_stir_fry", EGG_STIR_FRY);
        Reg.register("pork_stir_fry", PORK_STIR_FRY);
        Reg.register("bear_stir_fry", BEAR_STIR_FRY);
        Reg.register("seaweed_salad", SEAWEED_SALAD);
        Reg.register("mandrake_soup", MANDRAKE_SOUP);
        Reg.register("cod_chowder", COD_CHOWDER);
        Reg.register("clam_chowder", CLAM_CHOWDER);
        Reg.register("sardine_soup", SARDINE_SOUP);
        Reg.register("worm_bowl", WORM_SOUP);
        Reg.register("slime_soup", SLIME_SOUP);
        Reg.register("chicken_curry", CHICKEN_CURRY);
        Reg.register("rice_bowl", RICE_BOWL);
        Reg.register("vege_bowl", VEGE_BOWL);
        Reg.register("fruit_bowl", FRUIT_BOWL);

        Reg.register("poke_bowl", POKE_BOWL);
        Reg.register("dried_seaweed", SEAWEED_ITEM);

        Reg.register("grilled_sucker", GRILLED_SUCKER);
        Reg.register("steamed_cod", STEAMED_COD);
        Reg.register("dried_salmon", DRIED_SALMON);
        Reg.register("fire_eel_dried", DRIED_FIRE_EEL);
        Reg.register("dried_cod", DRIED_COD);
        Reg.register("dried_sucker", DRIED_SUCKER);
        Reg.register("dried_tropical_fish", DRIED_TROPICAL);
        Reg.register("cooked_tropical_fish", COOKED_TROPICAL);
        Reg.register("cooked_perch", COOKED_PERCH);
        Reg.register("cooked_stonespinner_minnow", COOKED_STONESPINNER_MINNOW);
        Reg.register("cooked_pridefin", COOKED_PRIDEFIN);

        Reg.register("sardine_cooked", COOKED_SARDINE);
        Reg.register("cooked_red_porgy", COOKED_RED_PORGY);
        Reg.register("fire_eel_cooked", COOKED_FIRE_EEL);
        Reg.register("crab_red_cooked", COOKED_CRAB);
        Reg.register("cooked_lobster", COOKED_LOBSTER);
        Reg.register("cooked_sea_urchin", COOKED_SEA_URCHIN);

        Reg.register("salmon_roll", SALMON_ROLL);
        Reg.register("clownfish_roll", CLOWNFISH_ROLL);
        Reg.register("squid_roll", SQUID_ROLL);
        Reg.register("fire_eel_roll", FIRE_EEL_ROLL);
        Reg.register("perch_roll", PERCH_ROLL);
        Reg.register("crab_roll", CRAB_ROLL);
        Reg.register("octo_roll", OCTO_ROLL);
        Reg.register("pridefin_roll", PRIDEFIN_ROLL);
        Reg.register("rainbow_roll", RAINBOW_ROLL);

        Reg.register("bbox_unagi", BBOX_UNAGI);
        Reg.register("bbox_clownfish", BBOX_CLOWNFISH);
        Reg.register("bbox_salmon", BBOX_SALMON);
        Reg.register("bbox_ghost", BBOX_GH_TAIL);
        Reg.register("bbox_abyss_watcher", BBOX_ABYSS);

        Reg.register("grilled_cheese", SANDWICH_CHEESE);
        Reg.register("blt", SANDWICH_BLT);
        Reg.register("steak_sandwich", SANDWICH_BEEF);
        Reg.register("pork_sandwich", SANDWICH_PORK);
        Reg.register("mutton_sandwich", SANDWICH_MUTTON);
        Reg.register("tenderloin_sandwich", SANDWICH_TENDERLOIN);

        Reg.register("cookie_dough", COOKIE_DOUGH);
        Reg.register("cake_dough", CAKE_DOUGH);
        Reg.register("apple_dough", APPLE_DOUGH);
        Reg.register("pumpkin_dough", PUMPKIN_DOUGH);
        Reg.register("sweet_dough", SB_DOUGH);
        Reg.register("bitter_dough", BB_DOUGH);
        Reg.register("sour_dough", SR_DOUGH);
        Reg.register("glow_dough", GB_DOUGH);
        Reg.register("bread_dough", BREAD_DOUGH);
        Reg.register("pancake_dough", PANCAKE_DOUGH);
        //register("ameranth_pancake_dough", AMERANTH_PANCAKE_DOUGH);
        Reg.register("skeleton_cookie_dough", SKELE_DOUGH);
        Reg.register("crabcake_dough", CRAB_DOUGH);

        Reg.register("pancake", PANCAKE);
        //register("ameranth_pancake", AMERANTH_PANCAKE);
        Reg.register("apple_pie", APPLE_PIE);
        Reg.register("sweet_pie", SWEET_PIE);
        Reg.register("bitter_pie", BITTER_PIE);
        Reg.register("sour_pie", SOUR_PIE);
        Reg.register("glow_pie", GLOW_PIE);

        Reg.register("cake_slice", CAKE_SLICE);
        Reg.register("skeleton_cookie", SKELE_COOKIE);
        Reg.register("crabcake", CRAB_CAKE);


        Reg.register("honeycomb_chunk", HONEYCOMB_CHUNK);
        Reg.register("crystalized_honey", CRYS_HONEY);
        Reg.register("frozen_jelly", FROZEN_JELLY);
        Reg.register("rock_candy", ROCK_CANDY);
        Reg.register("candied_snow_yams", CANDIED_SNOW_YAM);

        Reg.register("cooked_apple", COOKED_APPLE);
        Reg.register("glazed_apple", GLAZED_APPLE);
        Reg.register("cooked_pumpkin_seeds", COOKED_PUMPKIN_SEEDS);

        Reg.register("drumstick", DRUMSTICK);
        Reg.register("stuffed_onion", STUFFED_ONION);
        Reg.register("baked_potato", BAKED_POTATO_SPECIAL);
        Reg.register("dumpling", DUMPLING);

        Reg.register("rice_item", RICE_ITEM);
        Reg.register("raw_bacon", RAW_BACON);
        Reg.register("cooked_bacon", COOKED_BACON);
        Reg.register("raw_egg_bowl", RAW_EGGS);
        Reg.register("raw_tenderloin", RAW_TENDER);
        Reg.register("cooked_tenderloin", COOKED_TENDER);
        Reg.register("bear_jerky", BEAR_JERKY);

        Reg.register("salt", SALT);
        //register("thyme", THYME);
        //register("black_peppercorns", PEPPERCORN);

        Reg.register("watermelon_fruit_bowl", B_WATER);
        Reg.register("grilled_watermelon", G_WATER);

        Reg.register("morel_skewer", MOREL_KABOB);
        Reg.register("fruit_kabob", FRUIT_KABOB);
        Reg.register("golden_kabob", GOLDEN_FRUIT_KABOB);

        Reg.register("glistering_juice", GOLDEN_J);
        Reg.register("glistering_honeycomb", GOLDEN_H);
        Reg.register("glistering_sweet_berries", GOLDEN_SB);
        Reg.register("glistering_spicy_berries", GOLDEN_SPB);
        Reg.register("glistering_bitter_berries", GOLDEN_BB);
        Reg.register("glistering_sour_berries", GOLDEN_SRB);
        Reg.register("glistering_glow_berries", GOLDEN_GB_2);
        Reg.register("glistering_kelp", GOLDEN_K);
        Reg.register("glistering_tomato", GOLDEN_T);
        Reg.register("glistering_onion", GOLDEN_O);
        Reg.register("glistering_potato", GOLDEN_P);
        Reg.register("glistering_beet", GOLDEN_B);
        Reg.register("glistering_green_bean", GOLDEN_GB);
        Reg.register("glistering_mandrake", GOLDEN_M);
        Reg.register("glistering_corn", GOLDEN_C);
        Reg.register("glistering_snow_yam", GOLDEN_SY);
        Reg.register("glistering_pepper", GOLDEN_PE);
        Reg.register("glistering_eggplant", GOLDEN_EP);

        Reg.register("dog_biscuit", DOG_BISCUIT);
        Reg.register("dog_food", DOG_FOOD);
        Reg.register("monster_jerky", MONSTER_JERKY);
        Reg.register("puppy_pumpkin", DOG_PUMPKIN);
        Reg.register("fox_food", FOX_FOOD);
        Reg.register("fox_treat", FOX_TREAT);
        Reg.register("worm", WORM);
    }
}