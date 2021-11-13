package net.linkle.valley.Registry.Initializers;

import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;

import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;

/** Registering items for composer block */
public class Compostables {
    public static void initialize() {
        float levelLow = 0.3f; // leaves, seeds, saplings, grass.
        float levelMed = 0.5f; // double plant, vines.
        float levelHigh = 0.65f; // foods, flowers.
        float levelVery = 0.85f; // blocks.
        float levelUltra = 1.0f; // specialties.

        registerItem(Plants.RICE_SEEDLINGS, levelLow);
        registerItem(Plants.TOMATO_BUSH, levelLow);
        registerItem(Plants.SPICY_BERRY_BUSH, levelLow);
        registerItem(Plants.BITTER_BERRY_BUSH, levelLow);
        registerItem(Plants.HOLLY_BUSH, levelLow);
        registerItem(Plants.APPLE_SAPLING, levelLow);
        registerItem(Plants.APPLE_LEAVES, levelLow);
        registerItem(Plants.APPLE_LEAVES_EMPTY, levelLow);
        registerItem(Plants.SMALL_CACTUS, levelLow);
        registerItem(Crops.PUFF_SEEDS, levelLow);
        registerItem(Crops.MANDRAKE_SEEDS, levelLow);
        registerItem(Crops.GREEN_BEAN, levelLow);
        registerItem(Crops.GB_SEEDS, levelLow);
        registerItem(MiscItems.FIBER, levelLow);
        registerItem(MiscItems.MOSS_BALL, levelLow);
        registerItem(MiscItems.TURF_ITEM, levelLow);
        registerItem(Items.STICK, levelLow);

        registerItem(Plants.MOREL, levelMed);
        registerItem(Plants.BUSH, levelMed);
        registerItem(Plants.SNOW_YAM, levelMed);
        registerItem(Crops.SNOW_YAM_ITEM, levelMed);
        registerItem(Crops.WINTER_ROOT_ITEM, levelMed);
        registerItem(Plants.SNOW_BUSH, levelMed);
        registerItem(Plants.WINTER_ROOT, levelMed);
        registerItem(Plants.BUSH_ALIVE, levelMed);
        registerItem(Plants.BUSH_ALIVE_TALL, levelMed);
        registerItem(Plants.FERNBUSH, levelMed);
        registerItem(Plants.JUNGLE_CAP, levelMed);
        registerItem(Plants.ORANGE_FERN, levelMed);
        registerItem(Plants.SPROUT, levelMed);
        registerItem(Plants.MAIZE_CROP, levelMed);
        registerItem(Plants.REED_BLOCK, levelMed);
        registerItem(Plants.MINER_BUSH, levelMed);
        registerItem(Plants.ONION, levelMed);
        registerItem(Plants.MOSSY_VINE, levelMed);
        registerItem(Plants.SWAMP_BUSH, levelMed);
        registerItem(Plants.HEDGE, levelMed);
        registerItem(Crops.MANDRAKE, levelMed);
        registerItem(Plants.BUSH_DEAD_TALL, levelMed);
        registerItem(Plants.TUMBLE_WEED, levelMed);
        registerItem(Plants.APPLE_LEAVES_EMPTY, levelMed);
        registerItem(FoodAndCooking.WORM, levelMed);

        registerItem(MiscItems.MULCH, levelHigh);
        registerItem(Plants.ROSEBUSH, levelHigh);
        registerItem(Plants.LILACBUSH, levelHigh);
        registerItem(Plants.PEONYBUSH, levelHigh);
        registerItem(Plants.FERNBUSH, levelHigh);
        registerItem(Plants.WEAPING_SWAMP_WILLOW, levelHigh);
        registerItem(Plants.REDWOOD_SORREL, levelHigh);
        registerItem(Plants.CROCUS, levelHigh);
        registerItem(Plants.DANDELION_PUFF, levelHigh);
        registerItem(Plants.LAVENDER, levelHigh);
        registerItem(Plants.LAVENDER_SPRIG, levelHigh);
        registerItem(Plants.SWAMP_RIBBON, levelHigh);
        registerItem(Plants.ROSE_SPRIG, levelHigh);
        registerItem(Plants.BLACK_DAHLIA, levelHigh);
        registerItem(Plants.ICE_ROSE, levelHigh);
        registerItem(Plants.WILD_CARROT, levelHigh);
        registerItem(Plants.WILD_POTATO, levelHigh);
        registerItem(Plants.WILD_BEET, levelHigh);
        registerItem(Plants.WILD_WHEAT, levelHigh);
        registerItem(Plants.ORANGE_BEAUTY, levelHigh);
        registerItem(Plants.JUNGLE_BUSH, levelHigh);
        registerItem(Plants.JUNGLE_BUSH, levelHigh);
        registerItem(Crops.COOKED_MANDRAKE, levelHigh);
        registerItem(Items.EGG, levelHigh);
        registerItem(MiscItems.DUCK_EGG, levelHigh);
        registerItem(Items.COD, levelHigh);
        registerItem(Items.SALMON, levelHigh);
        registerItem(Items.TROPICAL_FISH, levelHigh);
        registerItem(Furniture.FIBER_BALE, levelHigh);

        registerItem(Plants.AMERANTH_BLOCK, levelVery);
    }
    
    private static void registerItem(ItemConvertible item, float chance) {
        CompostingChanceRegistry.INSTANCE.add(item, chance);
    }
}
