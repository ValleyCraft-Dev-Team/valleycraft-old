package io.github.linkle.valleycraft.init;

import io.github.linkle.valleycraft.items.food.*;
import net.minecraft.item.Item;

import static io.github.linkle.valleycraft.init.ItemGroups.MISC_GROUP;
import static net.minecraft.item.Items.GLASS_BOTTLE;

public class FoodAndCooking {
    //Tea Mug beverages
    public static final Item BITTER_BERRY_TEA = new DrinkTeaBase(new Item.Settings().maxCount(1), 2, 1, FoodStatusEffects.TEA_BB);
    public static final Item DANDELION_TEA = new DrinkTeaBase(new Item.Settings().maxCount(1), 2, 1, FoodStatusEffects.TEA_D);
    public static final Item FERN_TEA = new DrinkTeaBase(new Item.Settings().maxCount(1), 2, 1, FoodStatusEffects.TEA);
    public static final Item HOT_COCOA = new DrinkTeaBase(new Item.Settings().maxCount(1), 2, 0.5f, FoodStatusEffects.COCOA);
    public static final Item LAVENDER_TEA = new DrinkTeaBase(new Item.Settings().maxCount(1), 2, 1, FoodStatusEffects.TEA_L);
    public static final Item MINERS_TEA = new DrinkTeaBase(new Item.Settings().maxCount(1), 2, 1, FoodStatusEffects.TEA_M);
    public static final Item SOUR_BERRY_TEA = new DrinkTeaBase(new Item.Settings().maxCount(1), 2, 1, FoodStatusEffects.TEA_SR);
    public static final Item SWEET_BERRY_TEA = new DrinkTeaBase(new Item.Settings().maxCount(1), 2, 1, FoodStatusEffects.TEA_SB);

    //Mead Mug beverages
    public static final Item APPLE_CYSER = new MeadBase(new Item.Settings().maxCount(1), 3, 1f, FoodStatusEffects.APPLE_CYSER);
    public static final Item BITTER_BERRY_CYSER = new MeadBase(new Item.Settings().maxCount(1), 3, 1f, FoodStatusEffects.BITTER_BERRY_CYSER);
    public static final Item CHOCOLATE_CYSER = new MeadBase(new Item.Settings().maxCount(1), 3, 1f, FoodStatusEffects.CHOCO_CYSER);
    public static final Item MEAD = new MeadBase(new Item.Settings().maxCount(1), 3, 1f, FoodStatusEffects.MEAD_MUG);
    public static final Item SOUR_BERRY_CYSER = new MeadBase(new Item.Settings().maxCount(1), 3, 1f, FoodStatusEffects.SOUR_BERRY_CYSER);
    public static final Item SPICY_BERRY_CYSER = new MeadBase(new Item.Settings().maxCount(1), 3, 1f, FoodStatusEffects.SPICY_BERRY_CYSER);
    public static final Item SWEET_BERRY_CYSER = new MeadBase(new Item.Settings().maxCount(1), 3, 1f, FoodStatusEffects.SWEET_BERRY_CYSER);

    //Wines
    public static final Item BITTER_BERRY_WINE = new DrinkBottleBase(new Item.Settings().maxCount(1), 2, 1f, FoodStatusEffects.BITTER_BERRY_WINE);
    public static final Item CHORUS_WINE = new DrinkBottleBase(new Item.Settings().maxCount(1), 2, 1f, FoodStatusEffects.CHORUS_WINE);
    public static final Item SOUR_BERRY_WINE = new DrinkBottleBase(new Item.Settings().maxCount(1), 2, 1f, FoodStatusEffects.SOUR_BERRY_WINE);
    public static final Item SPICY_BERRY_WINE = new DrinkBottleBase(new Item.Settings().maxCount(1), 2, 1f, FoodStatusEffects.SPICY_BERRY_WINE);
    public static final Item SWEET_BERRY_WINE = new DrinkBottleBase(new Item.Settings().maxCount(1), 2, 1f, FoodStatusEffects.SWEET_BERRY_WINE);

    //Juices
    public static final Item APPLE_JUICE = new DrinkBottleBase(new Item.Settings().maxCount(1), 4, 0.5f, FoodStatusEffects.APPLE_JUICE);
    public static final Item BEET_JUICE = new DrinkBottleBase(new Item.Settings().maxCount(1), 4, 0.5f, FoodStatusEffects.BEET_JUICE);
    public static final Item CARROT_JUICE = new DrinkBottleBase(new Item.Settings().maxCount(1), 4, 0.5f, FoodStatusEffects.CARROT_JUICE);
    public static final Item EGGPLANT_JUICE = new DrinkBottleBase(new Item.Settings().maxCount(1), 4, 0.5f);
    public static final Item GLISTERING_MELON_JUICE = new DrinkBottleBase(new Item.Settings().maxCount(1), 10, 0.6f);
    public static final Item GLOW_BERRY_JUICE = new DrinkBottleBase(new Item.Settings().maxCount(1), 4, 0.5f, FoodStatusEffects.GB_JUICE_2);
    public static final Item GREEN_BEAN_JUICE = new DrinkBottleBase(new Item.Settings().maxCount(1), 4, 0.5f, FoodStatusEffects.GB_JUICE);
    public static final Item SUSPICIOUS_JUICE = new DrinkBottleBase(new Item.Settings().maxCount(1), 4, 0.5f, FoodStatusEffects.POTATO_JUICE);
    public static final Item TOMATO_JUICE = new DrinkBottleBase(new Item.Settings().maxCount(1), 4, 0.5f);

    //Misc. Glass Bottle beverages
    public static final Item CHOCOLATE_MILK_BOTTLE = new DrinkBottleBase(new Item.Settings().maxCount(1), 5, 0.5f, FoodStatusEffects.CHOCO_MILK);
    public static final Item MILK_BOTTLE = new MilkBottleBase(new Item.Settings().maxCount(16).recipeRemainder(GLASS_BOTTLE), 2, 0.5f);
    public static final Item MOREL_OIL = new DrinkBottleBase(new Item.Settings().maxCount(1), 4, 0.5f, FoodStatusEffects.MOREL_OIL);
    public static final Item PUMPKIN_SOUP_BOTTLE = new DrinkBottleBase(new Item.Settings().maxCount(1), 7, 0.5f, FoodStatusEffects.PUMPKIN_BOTTLE);

    //Wooden Bowl soups & stews
    public static final Item BEAR_STEW = new BowlBase(new Item.Settings().maxCount(1), 10, 0.5f, FoodStatusEffects.BEAR_STEW);
    public static final Item BEEF_STEW = new BowlBase(new Item.Settings().maxCount(1), 10, 0.5f, FoodStatusEffects.BEEF_STEW);
    public static final Item BONE_BROTH = new BowlBase(new Item.Settings().maxCount(1), 4, 0.5f);
    public static final Item CARROT_STEW = new BowlBase(new Item.Settings().maxCount(1), 6, 0.5f, FoodStatusEffects.CARROT_STEW);
    public static final Item CHICKEN_SOUP = new BowlBase(new Item.Settings().maxCount(1), 8, 0.5f);
    public static final Item CREAMY_HEART_STEW = new BowlBase(new Item.Settings().maxCount(1), 6, 0.5f, FoodStatusEffects.CREAMY_HEART_STEW);
    public static final Item GLOW_SQUID_SOUP = new BowlBase(new Item.Settings().maxCount(1), 8, 0.7f, FoodStatusEffects.GLOW_SOUP);
    public static final Item MANDRAKE_SOUP = new BowlBase(new Item.Settings().maxCount(1), 9, 0.4f, FoodStatusEffects.MANDRAKE_SOUP);
    public static final Item NETHER_FUNGUS_STEW = new BowlBase(new Item.Settings().maxCount(1), 8, 0.4f);
    public static final Item ORANGE_GILLED_WAXING_CAP_SOUP = new BowlBase(new Item.Settings().maxCount(1), 5, 0.5f);
    public static final Item PUMPKIN_SOUP = new BowlBase(new Item.Settings().maxCount(1), 7, 0.5f, FoodStatusEffects.PUMPKIN_BOWL);
    public static final Item RABBIT_BIGO = new BowlBase(new Item.Settings().maxCount(1), 10, 0.4f, FoodStatusEffects.SPICY_RABBIT_BIGO);
    public static final Item SARDINE_SOUP = new BowlBase(new Item.Settings().maxCount(1), 10, 0.7f, FoodStatusEffects.SARDINE_SOUP);
    public static final Item SLIME_SOUP = new BowlBase(new Item.Settings().maxCount(1), 5, 0.4f, FoodStatusEffects.SLIME_SOUP);
    public static final Item TOMATO_SOUP = new BowlBase(new Item.Settings().maxCount(1), 5, 0.5f);
    public static final Item WORM_SOUP = new BowlBase(new Item.Settings().maxCount(1), 8, 0.8f, FoodStatusEffects.WORM_SOUP);

    //Salads
    public static final Item CARROT_SALAD = new BowlBase(new Item.Settings().maxCount(1), 6, 0.5f);
    public static final Item MINER_SALAD = new BowlBase(new Item.Settings().maxCount(1), 4, 0.4f);
    public static final Item MUSHROOM_SALAD = new BowlBase(new Item.Settings().maxCount(1), 4, 0.5f);
    public static final Item SEAWEED_SALAD = new BowlBase(new Item.Settings().maxCount(1), 4, 0.5f);
    public static final Item TROPICAL_FISH_SALAD = new BowlBase(new Item.Settings().maxCount(1), 8, 0.6f, FoodStatusEffects.CLOWN_SALAD);

    //Stir-fry
    public static final Item BEAR_STIR_FRY = new BowlBase(new Item.Settings().maxCount(1), 10, 0.4f, FoodStatusEffects.BEAR_STIR_FRY);
    public static final Item EGG_STIR_FRY = new BowlBase(new Item.Settings().maxCount(1), 10, 0.4f, FoodStatusEffects.EGG_STIR_FRY);
    public static final Item MIXED_VEGETABLE_STIR_FRY = new BowlBase(new Item.Settings().maxCount(1), 10, 0.4f, FoodStatusEffects.VEGE_STIR_FRY);
    public static final Item PORK_STIR_FRY = new BowlBase(new Item.Settings().maxCount(1), 10, 0.4f, FoodStatusEffects.PORK_STIR_FRY);

    //Breakfast dishes
    public static final Item BACON_BREAKFAST = new BowlBase(new Item.Settings().maxCount(1), 10, 0.6f, FoodStatusEffects.FULL_BREAKFAST);
    public static final Item BACON_AND_EGGS = new BowlBase(new Item.Settings().maxCount(1), 8, 0.6f, FoodStatusEffects.BACON_AND_EGGS);
    public static final Item FULL_BREAKFAST = new BowlBase(new Item.Settings().maxCount(1), 9, 0.6f, FoodStatusEffects.FULL_BREAKFAST_VEGETARIAN);
    public static final Item LARGE_PANCAKE_BREAKFAST = new BowlBase(new Item.Settings().maxCount(1), 10, 0.6f, FoodStatusEffects.PANCAKE_BREAKFAST_LARGE);
    public static final Item PANCAKE = new FoodItemBase(new Item.Settings(), 5, 0.5f);
    public static final Item PANCAKE_BREAKFAST = new BowlBase(new Item.Settings().maxCount(1), 8, 0.6f, FoodStatusEffects.PANCAKE_BREAKFAST);
    public static final Item SCRAMBLED_EGGS = new BowlBase(new Item.Settings().maxCount(1), 5, 0.6f, true);

    //Misc. Bowl dishes
    public static final Item CHICKEN_CURRY = new BowlBase(new Item.Settings().maxCount(1), 10, 0.7f, FoodStatusEffects.CHICKEN_CURRY);
    public static final Item COD_CHOWDER = new BowlBase(new Item.Settings().maxCount(1), 10, 0.7f, FoodStatusEffects.COD_CHOWDER);
    public static final Item CORN_PORRIDGE = new BowlBase(new Item.Settings().maxCount(1), 10, 0.5f, FoodStatusEffects.MAIZE_PORRIDGE);
    public static final Item CREAMY_CHOWDER = new BowlBase(new Item.Settings().maxCount(1), 10, 0.7f, FoodStatusEffects.CLAM_CHOWDER);
    public static final Item FISH_PLATTER = new BowlBase(new Item.Settings().maxCount(1), 8, 0.5f);
    public static final Item GRUB = new BowlBase(new Item.Settings().maxCount(1), 12, 0.6f, FoodStatusEffects.GRUB);
    public static final Item LAMB_BIRYANI = new BowlBase(new Item.Settings().maxCount(1), 9, 0.4f,FoodStatusEffects.LAMB_BIRYANI);
    public static final Item MELON_FRUIT_BOWL = new FoodItemBase(new Item.Settings(), 8, 0.5f);
    public static final Item MIXED_VEGETABLE_BOWL = new BowlBase(new Item.Settings().maxCount(1), 8, 0.4f);
    public static final Item MIXED_FRUIT_BOWL = new BowlBase(new Item.Settings().maxCount(1), 8, 0.4f);
    public static final Item POKE_BOWL = new BowlBase(new Item.Settings().maxCount(1), 8, 0.4f, FoodStatusEffects.POKE_BOWL);
    public static final Item RAW_EGGS = new BowlBase(new Item.Settings().maxCount(1), 1, 1.2f, FoodStatusEffects.RAW_EGGS);
    public static final Item RICE_BOWL = new BowlBase(new Item.Settings().maxCount(1), 4, 0.5f);

    //Cooked sea creatures
    public static final Item COOKED_DUNGENESS_CRAB = new FoodItemBase(new Item.Settings(), 7, 0.4f);
    public static final Item COOKED_FIRE_EEL = new FoodItemBase(new Item.Settings(), 5, 0.4f);
    public static final Item COOKED_LOBSTER = new FoodItemBase(new Item.Settings(), 7, 0.4f);
    public static final Item COOKED_PERCH = new FoodItemBase(new Item.Settings(), 4, 0.4f);
    public static final Item COOKED_PRIDEFIN = new FoodItemBase(new Item.Settings(), 8, 0.5f);
    public static final Item COOKED_RED_PORGY = new FoodItemBase(new Item.Settings(), 4, 0.4f);
    public static final Item COOKED_SARDINE = new FoodItemBase(new Item.Settings(), 4, 0.4f);
    public static final Item COOKED_SEA_URCHIN = new FoodItemBase(new Item.Settings(), 6, 0.5f);
    public static final Item COOKED_STONESPINNER_MINNOW = new FoodItemBase(new Item.Settings(), 3, 0.3f);
    public static final Item COOKED_TROPICAL_FISH = new FoodItemBase(new Item.Settings(), 5, 0.4f);

    //Dried sea creatures
    public static final Item DRIED_COD = new FoodItemBase(new Item.Settings(), 4, 0.4f);
    public static final Item DRIED_FIRE_EEL = new FoodItemBase(new Item.Settings(), 4, 0.4f);
    public static final Item DRIED_SALMON = new FoodItemBase(new Item.Settings(), 4, 0.4f);
    public static final Item DRIED_SEAWEED = new FoodItemBase(new Item.Settings(), 4, 0.6f);
    public static final Item DRIED_SUCKER = new FoodItemBase(new Item.Settings(), 4, 0.4f);
    public static final Item DRIED_TROPICAL_FISH = new FoodItemBase(new Item.Settings(), 4, 0.4f);
    
    //Seafood rolls
    public static final Item CRAB_ROLL = new FoodItemBase(new Item.Settings(), 6, 0.5f, FoodStatusEffects.CRAB_ROLL);
    public static final Item FIRE_EEL_ROLL = new FoodItemBase(new Item.Settings(), 6, 0.5f, FoodStatusEffects.FIRE_EEL_ROLL);
    public static final Item OCTOROK_ROLL = new FoodItemBase(new Item.Settings(), 6, 0.5f, FoodStatusEffects.OCTO_ROLL);
    public static final Item PERCH_ROLL = new FoodItemBase(new Item.Settings(), 6, 0.5f, FoodStatusEffects.PERCH_ROLL);
    public static final Item PRIDEFIN_ROLL = new FoodItemBase(new Item.Settings(), 6, 0.5f, FoodStatusEffects.PRIDEFIN_ROLL);
    public static final Item RAINBOW_ROLL = new FoodItemBase(new Item.Settings(), 6, 0.5f, FoodStatusEffects.RAINBOW_ROLL);
    public static final Item SALMON_ROLL = new FoodItemBase(new Item.Settings(), 6, 0.5f, FoodStatusEffects.SALMON_ROLL);
    public static final Item SQUID_ROLL = new FoodItemBase(new Item.Settings(), 6, 0.5f, FoodStatusEffects.SQUID_ROLL);
    public static final Item TROPICAL_ROLL = new FoodItemBase(new Item.Settings(), 6, 0.5f, FoodStatusEffects.CLOWNFISH_ROLL);

    //Bento boxes
    public static final Item ABYSS_WATCHER_BENTO_BOX = new BBoxBase(new Item.Settings().maxCount(1), 10, 0.5f, FoodStatusEffects.BBOX_ABYSS);
    public static final Item GHOSTFIN_BENTO_BOX = new BBoxBase(new Item.Settings().maxCount(1), 10, 0.5f, FoodStatusEffects.BBOX_GH_TAIL);
    public static final Item SALMON_ROLL_BENTO_BOX = new BBoxBase(new Item.Settings().maxCount(1), 10, 0.5f, FoodStatusEffects.BBOX_SALMON);
    public static final Item SQUID_BENTO_BOX = new BBoxBase(new Item.Settings().maxCount(1), 10, 0.5f, FoodStatusEffects.BBOX_UNAGI);
    public static final Item TROPICAL_FISH_BENTO_BOX = new BBoxBase(new Item.Settings().maxCount(1), 10, 0.5f, FoodStatusEffects.BBOX_CLOWNFISH);

    //Misc. seafood
    public static final Item GRILLED_SUCKER = new FoodItemBase(new Item.Settings(), 6, 0.6f);
    public static final Item SEA_URCHIN_SOUP = new FoodItemBase(new Item.Settings(), 8, 0.6f, FoodStatusEffects.CRAB_CAKE);
    public static final Item STEAMED_COD = new FoodItemBase(new Item.Settings(), 10, 0.5f, FoodStatusEffects.STEAMED_COD);

    //Sandwiches
    public static final Item BLT = new FoodItemBase(new Item.Settings(), 9, 0.4f);
    public static final Item GRILLED_CHEESE = new FoodItemBase(new Item.Settings(), 9, 0.4f);
    public static final Item MUTTON_SANDWICH = new FoodItemBase(new Item.Settings(), 10, 0.3f);
    public static final Item PORK_SANDWICH = new FoodItemBase(new Item.Settings(), 10, 0.3f);
    public static final Item STEAK_SANDWICH = new FoodItemBase(new Item.Settings(), 10, 0.3f);
    public static final Item TENDERLOIN_SANDWICH = new FoodItemBase(new Item.Settings(), 10, 0.3f);

    //Dough
    public static final Item APPLE_PIE_DOUGH = new FoodItemBase(new Item.Settings(), 1, 0.5f);
    public static final Item BITTER_BERRY_PIE_DOUGH = new FoodItemBase(new Item.Settings(), 1, 1f);
    public static final Item BREAD_DOUGH = new FoodItemBase(new Item.Settings(), 1, 1f);
    public static final Item CAKE_DOUGH = new FoodItemBase(new Item.Settings(), 1, 1f);
    public static final Item COOKIE_DOUGH = new FoodItemBase(new Item.Settings(), 1, 0.5f);
    public static final Item CRAB_CAKE_DOUGH = new FoodItemBase(new Item.Settings(), 1, 0.5f);
    public static final Item GLOW_BERRY_PIE_DOUGH = new FoodItemBase(new Item.Settings(), 1, 1f);
    public static final Item PANCAKE_DOUGH = new FoodItemBase(new Item.Settings(), 1, 1f);
    public static final Item PUMPKIN_DOUGH = new FoodItemBase(new Item.Settings(), 1, 1f);
    public static final Item SKELETON_COOKIE_DOUGH = new FoodItemBase(new Item.Settings(), 1, 1f);
    public static final Item SOUR_BERRY_PIE_DOUGH = new FoodItemBase(new Item.Settings(), 1, 1f);
    public static final Item SWEET_BERRY_PIE_DOUGH = new FoodItemBase(new Item.Settings(), 1, 1f);

    //Baked goods
    public static final Item APPLE_PIE = new FoodItemBase(new Item.Settings(), 8, 0.5f);
    public static final Item BITTER_BERRY_PIE = new FoodItemBase(new Item.Settings(), 8, 0.5f);
    public static final Item CAKE_SLICE = new FoodItemBase(new Item.Settings(), 2, 0.4f);
    public static final Item CRAB_CAKE = new FoodItemBase(new Item.Settings(), 8, 0.5f, FoodStatusEffects.CRAB_CAKE);
    public static final Item GLOW_BERRY_PIE = new FoodItemBase(new Item.Settings(), 8, 0.5f);
    public static final Item SKELETON_COOKIE = new FoodItemBase(new Item.Settings(), 4, 0.7f);
    public static final Item SOUR_BERRY_PIE = new FoodItemBase(new Item.Settings(), 8, 0.5f);
    public static final Item SWEET_BERRY_PIE = new FoodItemBase(new Item.Settings(), 8, 0.5f);

    //Misc. meats
    public static final Item BEAR_JERKY = new FoodItemBase(new Item.Settings(), 10, 0.4f, true);
    public static final Item COOKED_BACON = new FoodItemBase(new Item.Settings(), 4, 0.5f, true);
    public static final Item COOKED_TENDERLOIN = new FoodItemBase(new Item.Settings(), 8, 0.4f, true);
    public static final Item DRUMSTICK = new FoodItemBase(new Item.Settings(), 4, 0.6f);
    public static final Item MONSTER_JERKY = new FoodItemBase(new Item.Settings(), 4, 0.4f, true);
    public static final Item RAW_BACON = new FoodItemBase(new Item.Settings(), 1, 1f);
    public static final Item RAW_TENDERLOIN = new FoodItemBase(new Item.Settings(), 5, 0.4f, true);

    //Pet food
    public static final Item DOG_BISCUIT= new FoodItemBase(new Item.Settings(), 8, 0.5f, true);
    public static final Item DOG_FOOD = new BowlBase(new Item.Settings().maxCount(1), 8, 0.6f, true, FoodStatusEffects.DOG_FOOD);
    public static final Item FOX_FOOD = new BowlBase(new Item.Settings().maxCount(1), 8, 0.6f, true, FoodStatusEffects.FOX_FOOD);
    public static final Item FOX_TREAT= new FoodItemBase(new Item.Settings(), 8, 0.5f, true);
    public static final Item PUMPKIN_PUPPY_TREAT = new FoodItemBase(new Item.Settings(), 8, 0.5f, true);

    //Skewers
    public static final Item FRUIT_SKEWER = new FoodItemBase(new Item.Settings(), 8, 0.6f);
    public static final Item GOLDEN_FRUIT_SKEWER = new FoodItemBase(new Item.Settings(), 10, 0.6f);
    public static final Item MOREL_SKEWER = new FoodItemBase(new Item.Settings(), 8, 0.6f);

    //Misc. dishes
    public static final Item BAKED_APPLE = new FoodItemBase(new Item.Settings(), 6, 0.5f);
    public static final Item CANDIED_SNOW_YAMS = new BowlBase(new Item.Settings().maxCount(1), 9, 0.4f, FoodStatusEffects.CANDIED_SNOW_YAM);
    public static final Item COOKED_PUMPKIN_SEEDS = new FoodItemBase(new Item.Settings(), 2, 0.4f);
    public static final Item CRYSTALLIZED_HONEY = new FoodItemBase(new Item.Settings(), 4, 0.5f, FoodStatusEffects.CRYS_HONEY);
    public static final Item DUMPLING = new FoodItemBase(new Item.Settings(), 8, 0.6f, FoodStatusEffects.DUMPLING);
    public static final Item FROZEN_SLIME_BALL = new FoodItemBase(new Item.Settings(), 4, 0.6f, FoodStatusEffects.FROZEN_JELLY);
    public static final Item GLAZED_APPLE = new FoodItemBase(new Item.Settings(), 5, 0.7f);
    public static final Item GRILLED_WATERMELON = new FoodItemBase(new Item.Settings(), 4, 0.5f);
    public static final Item HONEYCOMB_CHUNK = new FoodItemBase(new Item.Settings(), 2, 1f, FoodStatusEffects.HONEYCOMB_CHUNK);
    public static final Item RICE = new FoodItemBase(new Item.Settings(), 3, 0.6f);
    public static final Item ROCK_CANDY = new FoodItemBase(new Item.Settings(), 4, 0.6f, FoodStatusEffects.ROCK_CANDY);
    public static final Item STUFFED_BAKED_POTATO = new FoodItemBase(new Item.Settings(), 9, 0.5f, FoodStatusEffects.BAKED_POTATO_SPECIAL);
    public static final Item STUFFED_ONION = new FoodItemBase(new Item.Settings(), 9, 0.5f, true, FoodStatusEffects.STUFFED_ONION);
    public static final Item WORM = new FoodItemBase(new Item.Settings(), 2, 0.6f);

    //Salt
    public static final Item SALT = new FoodItemBase(new Item.Settings().group(MISC_GROUP), 1, 0.5f);

    //Golden foods
    public static final Item GOLDEN_BEET = new FoodItemBase(new Item.Settings(), 10, 0.6f);
    public static final Item GOLDEN_BITTER_BERRIES = new FoodItemBase(new Item.Settings(), 10, 0.6f);
    public static final Item GOLDEN_CORN = new FoodItemBase(new Item.Settings(), 10, 0.6f);
    public static final Item GOLDEN_EGGPLANT = new FoodItemBase(new Item.Settings(), 10, 0.6f);
    public static final Item GOLDEN_GLOW_BERRIES = new FoodItemBase(new Item.Settings(), 10, 0.6f);
    public static final Item GOLDEN_GREEN_BEAN = new FoodItemBase(new Item.Settings(), 10, 0.6f);
    public static final Item GOLDEN_HONEYCOMB = new FoodItemBase(new Item.Settings(), 10, 0.6f);
    public static final Item GOLDEN_KELP = new FoodItemBase(new Item.Settings(), 10, 0.6f);
    public static final Item GOLDEN_MANDRAKE = new FoodItemBase(new Item.Settings(), 10, 0.6f);
    public static final Item GOLDEN_ONION = new FoodItemBase(new Item.Settings(), 10, 0.6f);
    public static final Item GOLDEN_PEPPER = new FoodItemBase(new Item.Settings(), 10, 0.6f);
    public static final Item GOLDEN_POTATO = new FoodItemBase(new Item.Settings(), 10, 0.6f);
    public static final Item GOLDEN_SNOW_YAM = new FoodItemBase(new Item.Settings(), 10, 0.6f);
    public static final Item GOLDEN_SOUR_BERRIES = new FoodItemBase(new Item.Settings(), 10, 0.6f);
    public static final Item GOLDEN_SPICY_BERRIES = new FoodItemBase(new Item.Settings(), 10, 0.6f);
    public static final Item GOLDEN_SWEET_BERRIES = new FoodItemBase(new Item.Settings(), 10, 0.6f);
    public static final Item GOLDEN_TOMATO = new FoodItemBase(new Item.Settings(), 10, 0.6f);


    public static void initialize() {
        //Tea Mug beverages
        Reg.register("bitter_berry_tea", BITTER_BERRY_TEA);
        Reg.register("dandelion_tea", DANDELION_TEA);
        Reg.register("fern_tea", FERN_TEA);
        Reg.register("hot_cocoa", HOT_COCOA);
        Reg.register("lavender_tea", LAVENDER_TEA);
        Reg.register("miners_tea", MINERS_TEA);
        Reg.register("sour_berry_tea", SOUR_BERRY_TEA);
        Reg.register("sweet_berry_tea", SWEET_BERRY_TEA);

        //Mead Mug beverages
        Reg.register("apple_cyser", APPLE_CYSER);
        Reg.register("bitter_berry_cyser", BITTER_BERRY_CYSER);
        Reg.register("chocolate_cyser", CHOCOLATE_CYSER);
        Reg.register("mead", MEAD);
        Reg.register("sour_berry_cyser", SOUR_BERRY_CYSER);
        Reg.register("spicy_berry_cyser", SPICY_BERRY_CYSER);
        Reg.register("sweet_berry_cyser", SWEET_BERRY_CYSER);

        //Wines
        Reg.register("bitter_berry_wine", BITTER_BERRY_WINE);
        Reg.register("chorus_wine", CHORUS_WINE);
        Reg.register("sour_berry_wine", SOUR_BERRY_WINE);
        Reg.register("spicy_berry_wine", SPICY_BERRY_WINE);
        Reg.register("sweet_berry_wine", SWEET_BERRY_WINE);

        //Juices
        Reg.register("apple_juice", APPLE_JUICE);
        Reg.register("beet_juice", BEET_JUICE);
        Reg.register("carrot_juice", CARROT_JUICE);
        Reg.register("eggplant_juice", EGGPLANT_JUICE);
        Reg.register("glistering_melon_juice", GLISTERING_MELON_JUICE);
        Reg.register("glow_berry_juice", GLOW_BERRY_JUICE);
        Reg.register("green_bean_juice", GREEN_BEAN_JUICE);
        Reg.register("suspicious_juice", SUSPICIOUS_JUICE);
        Reg.register("tomato_juice", TOMATO_JUICE);

        //Misc. Glass Bottle beverages
        Reg.register("chocolate_milk_bottle", CHOCOLATE_MILK_BOTTLE);
        Reg.register("milk_bottle", MILK_BOTTLE);
        Reg.register("morel_oil", MOREL_OIL);
        Reg.register("pumpkin_soup_bottle", PUMPKIN_SOUP_BOTTLE);

        //Wooden Bowl soups & stews
        Reg.register("bear_stew", BEAR_STEW);
        Reg.register("beef_stew", BEEF_STEW);
        Reg.register("bone_broth", BONE_BROTH);
        Reg.register("carrot_stew", CARROT_STEW);
        Reg.register("chicken_soup", CHICKEN_SOUP);
        Reg.register("creamy_heart_stew", CREAMY_HEART_STEW);
        Reg.register("glow_soup", GLOW_SQUID_SOUP);
        Reg.register("mandrake_soup", MANDRAKE_SOUP);
        Reg.register("nether_fungus_stew", NETHER_FUNGUS_STEW);
        Reg.register("orange_gilled_waxing_cap_soup", ORANGE_GILLED_WAXING_CAP_SOUP);
        Reg.register("pumpkin_soup", PUMPKIN_SOUP);
        Reg.register("rabbit_bigo", RABBIT_BIGO);
        Reg.register("sardine_soup", SARDINE_SOUP);
        Reg.register("slime_soup", SLIME_SOUP);
        Reg.register("tomato_soup", TOMATO_SOUP);
        Reg.register("worm_soup", WORM_SOUP);

        //Salads
        Reg.register("carrot_salad", CARROT_SALAD);
        Reg.register("miners_salad", MINER_SALAD);
        Reg.register("mushroom_salad", MUSHROOM_SALAD);
        Reg.register("seaweed_salad", SEAWEED_SALAD);
        Reg.register("tropical_fish_salad", TROPICAL_FISH_SALAD);

        //Stir-fry
        Reg.register("bear_stir_fry", BEAR_STIR_FRY);
        Reg.register("eggplant_stir_fry", EGG_STIR_FRY);
        Reg.register("mixed_vegetable_stir_fry", MIXED_VEGETABLE_STIR_FRY);
        Reg.register("pork_stir_fry", PORK_STIR_FRY);

        //Breakfast dishes
        Reg.register("bacon_breakfast", BACON_BREAKFAST);
        Reg.register("bacon_and_eggs", BACON_AND_EGGS);
        Reg.register("full_breakfast", FULL_BREAKFAST);
        Reg.register("large_pancake_breakfast", LARGE_PANCAKE_BREAKFAST);
        Reg.register("pancake", PANCAKE);
        Reg.register("pancake_breakfast", PANCAKE_BREAKFAST);
        Reg.register("scrambled_eggs", SCRAMBLED_EGGS);

        //Misc. Bowl dishes
        Reg.register("chicken_curry", CHICKEN_CURRY);
        Reg.register("cod_chowder", COD_CHOWDER);
        Reg.register("corn_porridge", CORN_PORRIDGE);
        Reg.register("creamy_chowder", CREAMY_CHOWDER);
        Reg.register("fish_platter", FISH_PLATTER);
        Reg.register("grub", GRUB);
        Reg.register("lamb_biryani", LAMB_BIRYANI);
        Reg.register("melon_fruit_bowl", MELON_FRUIT_BOWL);
        Reg.register("mixed_fruit_bowl", MIXED_FRUIT_BOWL);
        Reg.register("mixed_vegetable_bowl", MIXED_VEGETABLE_BOWL);
        Reg.register("poke_bowl", POKE_BOWL);
        Reg.register("raw_eggs", RAW_EGGS);
        Reg.register("rice_bowl", RICE_BOWL);

        //Cooked sea creatures
        Reg.register("cooked_dungeness_crab", COOKED_DUNGENESS_CRAB);
        Reg.register("cooked_fire_eel", COOKED_FIRE_EEL);
        Reg.register("cooked_lobster", COOKED_LOBSTER);
        Reg.register("cooked_perch", COOKED_PERCH);
        Reg.register("cooked_pridefin", COOKED_PRIDEFIN);
        Reg.register("cooked_red_porgy", COOKED_RED_PORGY);
        Reg.register("cooked_sardine", COOKED_SARDINE);
        Reg.register("cooked_sea_urchin", COOKED_SEA_URCHIN);
        Reg.register("cooked_stonespinner_minnow", COOKED_STONESPINNER_MINNOW);
        Reg.register("cooked_tropical_fish", COOKED_TROPICAL_FISH);

        //Dried sea creatures
        Reg.register("dried_cod", DRIED_COD);
        Reg.register("dried_fire_eel", DRIED_FIRE_EEL);
        Reg.register("dried_salmon", DRIED_SALMON);
        Reg.register("dried_seaweed", DRIED_SEAWEED);
        Reg.register("dried_sucker", DRIED_SUCKER);
        Reg.register("dried_tropical_fish", DRIED_TROPICAL_FISH);

        //Seafood rolls
        Reg.register("crab_roll", CRAB_ROLL);
        Reg.register("fire_eel_roll", FIRE_EEL_ROLL);
        Reg.register("octorok_roll", OCTOROK_ROLL);
        Reg.register("perch_roll", PERCH_ROLL);
        Reg.register("pridefin_roll", PRIDEFIN_ROLL);
        Reg.register("rainbow_roll", RAINBOW_ROLL);
        Reg.register("salmon_roll", SALMON_ROLL);
        Reg.register("squid_roll", SQUID_ROLL);
        Reg.register("tropical_roll", TROPICAL_ROLL);

        //Bento boxes
        Reg.register("abyss_watcher_bento_box", ABYSS_WATCHER_BENTO_BOX);
        Reg.register("ghostfin_bento_box", GHOSTFIN_BENTO_BOX);
        Reg.register("salmon_roll_bento_box", SALMON_ROLL_BENTO_BOX);
        Reg.register("squid_bento_box", SQUID_BENTO_BOX);
        Reg.register("tropical_fish_bento_box", TROPICAL_FISH_BENTO_BOX);

        //Misc. seafood
        Reg.register("grilled_sucker", GRILLED_SUCKER);
        Reg.register("sea_urchin_soup", SEA_URCHIN_SOUP);
        Reg.register("steamed_cod", STEAMED_COD);

        //Sandwiches
        Reg.register("blt", BLT);
        Reg.register("grilled_cheese", GRILLED_CHEESE);
        Reg.register("mutton_sandwich", MUTTON_SANDWICH);
        Reg.register("pork_sandwich", PORK_SANDWICH);
        Reg.register("steak_sandwich", STEAK_SANDWICH);
        Reg.register("tenderloin_sandwich", TENDERLOIN_SANDWICH);

        //Dough
        Reg.register("apple_pie_dough", APPLE_PIE_DOUGH);
        Reg.register("bitter_berry_pie_dough", BITTER_BERRY_PIE_DOUGH);
        Reg.register("bread_dough", BREAD_DOUGH);
        Reg.register("cake_dough", CAKE_DOUGH);
        Reg.register("cookie_dough", COOKIE_DOUGH);
        Reg.register("crab_cake_dough", CRAB_CAKE_DOUGH);
        Reg.register("glow_berry_pie_dough", GLOW_BERRY_PIE_DOUGH);
        Reg.register("pancake_dough", PANCAKE_DOUGH);
        Reg.register("pumpkin_dough", PUMPKIN_DOUGH);
        Reg.register("skeleton_cookie_dough", SKELETON_COOKIE_DOUGH);
        Reg.register("sour_berry_pie_dough", SOUR_BERRY_PIE_DOUGH);
        Reg.register("sweet_berry_pie_dough", SWEET_BERRY_PIE_DOUGH);

        //Baked goods
        Reg.register("apple_pie", APPLE_PIE);
        Reg.register("bitter_berry_pie", BITTER_BERRY_PIE);
        Reg.register("cake_slice", CAKE_SLICE);
        Reg.register("crab_cake", CRAB_CAKE);
        Reg.register("glow_berry_pie", GLOW_BERRY_PIE);
        Reg.register("skeleton_cookie", SKELETON_COOKIE);
        Reg.register("sour_berry_pie", SOUR_BERRY_PIE);
        Reg.register("sweet_berry_pie", SWEET_BERRY_PIE);

        //Misc. meats
        Reg.register("bear_jerky", BEAR_JERKY);
        Reg.register("cooked_bacon", COOKED_BACON);
        Reg.register("cooked_tenderloin", COOKED_TENDERLOIN);
        Reg.register("drumstick", DRUMSTICK);
        Reg.register("monster_jerky", MONSTER_JERKY);
        Reg.register("raw_bacon", RAW_BACON);
        Reg.register("raw_tenderloin", RAW_TENDERLOIN);

        //Pet food
        Reg.register("dog_biscuit", DOG_BISCUIT);
        Reg.register("dog_food", DOG_FOOD);
        Reg.register("fox_food", FOX_FOOD);
        Reg.register("fox_treat", FOX_TREAT);
        Reg.register("pumpkin_puppy_treat", PUMPKIN_PUPPY_TREAT);

        //Skewers
        Reg.register("fruit_skewer", FRUIT_SKEWER);
        Reg.register("golden_fruit_skewer", GOLDEN_FRUIT_SKEWER);
        Reg.register("morel_skewer", MOREL_SKEWER);

        //Misc. dishes
        Reg.register("baked_apple", BAKED_APPLE);
        Reg.register("candied_snow_yams", CANDIED_SNOW_YAMS);
        Reg.register("cooked_pumpkin_seeds", COOKED_PUMPKIN_SEEDS);
        Reg.register("crystallized_honey", CRYSTALLIZED_HONEY);
        Reg.register("dumpling", DUMPLING);
        Reg.register("frozen_slime_ball", FROZEN_SLIME_BALL);
        Reg.register("glazed_apple", GLAZED_APPLE);
        Reg.register("grilled_watermelon", GRILLED_WATERMELON);
        Reg.register("honeycomb_chunk", HONEYCOMB_CHUNK);
        Reg.register("rice", RICE);
        Reg.register("rock_candy", ROCK_CANDY);
        Reg.register("stuffed_baked_potato", STUFFED_BAKED_POTATO);
        Reg.register("stuffed_onion", STUFFED_ONION);
        Reg.register("worm", WORM);

        //Salt
        Reg.register("salt", SALT);

        //Golden foods
        Reg.register("golden_beet", GOLDEN_BEET);
        Reg.register("golden_bitter_berries", GOLDEN_BITTER_BERRIES);
        Reg.register("golden_corn", GOLDEN_CORN);
        Reg.register("golden_eggplant", GOLDEN_EGGPLANT);
        Reg.register("golden_green_bean", GOLDEN_GREEN_BEAN);
        Reg.register("golden_glow_berries", GOLDEN_GLOW_BERRIES);
        Reg.register("golden_honeycomb", GOLDEN_HONEYCOMB);
        Reg.register("golden_kelp", GOLDEN_KELP);
        Reg.register("golden_mandrake", GOLDEN_MANDRAKE);
        Reg.register("golden_onion", GOLDEN_ONION);
        Reg.register("golden_pepper", GOLDEN_PEPPER);
        Reg.register("golden_potato", GOLDEN_POTATO);
        Reg.register("golden_snow_yam", GOLDEN_SNOW_YAM);
        Reg.register("golden_sour_berries", GOLDEN_SOUR_BERRIES);
        Reg.register("golden_spicy_berries", GOLDEN_SPICY_BERRIES);
        Reg.register("golden_sweet_berries", GOLDEN_SWEET_BERRIES);
        Reg.register("golden_tomato", GOLDEN_TOMATO);
    }
}