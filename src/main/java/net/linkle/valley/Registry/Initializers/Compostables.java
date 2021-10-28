package net.linkle.valley.Registry.Initializers;

import net.minecraft.block.ComposterBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;

import static net.linkle.valley.Registry.Initializers.Crops.SNOW_YAM_ITEM;
import static net.linkle.valley.Registry.Initializers.Crops.WINTER_ROOT_ITEM;
import static net.linkle.valley.Registry.Initializers.FoodAndCooking.WORM;
import static net.linkle.valley.Registry.Initializers.Furniture.FIBER_BALE;
import static net.linkle.valley.Registry.Initializers.MiscItems.*;

/** Registering items for composer block */
public class Compostables {
    public static void initialize() {
        float levelLow = 0.3f; // leaves, seeds, saplings, grass.
        float levelMed = 0.5f; // double plant, vines.
        float levelHigh = 0.65f; // foods, flowers.
        float levelVery = 0.85f; // blocks.
        float levelUltra = 1.0f; // specialties.

        registerItem(levelLow, Plants.RICE_SEEDLINGS);
        registerItem(levelLow, Plants.TOMATO_BUSH);
        registerItem(levelLow, Plants.SPICY_BERRY_BUSH);
        registerItem(levelLow, Plants.BITTER_BERRY_BUSH);
        registerItem(levelLow, Plants.HOLLY_BUSH);
        registerItem(levelLow, Plants.APPLE_SAPLING);
        registerItem(levelLow, Plants.APPLE_LEAVES);
        registerItem(levelLow, Plants.APPLE_LEAVES_EMPTY);
        registerItem(levelLow, Plants.SMALL_CACTUS);
        registerItem(levelLow, Crops.PUFF_SEEDS);
        registerItem(levelLow, Crops.MANDRAKE_SEEDS);
        registerItem(levelLow, Crops.GREEN_BEAN);
        registerItem(levelLow, Crops.GB_SEEDS);
        registerItem(levelLow, FIBER);
        registerItem(levelLow, MOSS_BALL);
        registerItem(levelLow, TURF_ITEM);
        registerItem(levelLow, Items.STICK);

        registerItem(levelMed, Plants.MOREL);
        registerItem(levelMed, Plants.BUSH);
        registerItem(levelMed, Plants.SNOW_YAM);
        registerItem(levelMed, SNOW_YAM_ITEM);
        registerItem(levelMed, WINTER_ROOT_ITEM);
        registerItem(levelMed, Plants.SNOW_BUSH);
        registerItem(levelMed, Plants.WINTER_ROOT);
        registerItem(levelMed, Plants.BUSH_ALIVE);
        registerItem(levelMed, Plants.BUSH_ALIVE_TALL);
        registerItem(levelMed, Plants.FERNBUSH);
        registerItem(levelMed, Plants.JUNGLE_CAP);
        registerItem(levelMed, Plants.ORANGE_FERN);
        registerItem(levelMed, Plants.SPROUT);
        registerItem(levelMed, Plants.MAIZE_CROP);
        registerItem(levelMed, Plants.REED_BLOCK);
        registerItem(levelMed, Plants.MINER_BUSH);
        registerItem(levelMed, Plants.ONION);
        registerItem(levelMed, Plants.MOSSY_VINE);
        registerItem(levelMed, Plants.SWAMP_BUSH);
        registerItem(levelMed, Plants.HEDGE);
        registerItem(levelMed, Crops.MANDRAKE);
        registerItem(levelMed, Plants.BUSH_DEAD_TALL);
        registerItem(levelMed, Plants.TUMBLE_WEED);
        registerItem(levelMed, Plants.APPLE_LEAVES_EMPTY);
        registerItem(levelMed, WORM);

        registerItem(levelHigh, MULCH);
        registerItem(levelHigh, Plants.ROSEBUSH);
        registerItem(levelHigh, Plants.LILACBUSH);
        registerItem(levelHigh, Plants.PEONYBUSH);
        registerItem(levelHigh, Plants.FERNBUSH);
        registerItem(levelHigh, Plants.WEAPING_SWAMP_WILLOW);
        registerItem(levelHigh, Plants.REDWOOD_SORREL);
        registerItem(levelHigh, Plants.CROCUS);
        registerItem(levelHigh, Plants.DANDELION_PUFF);
        registerItem(levelHigh, Plants.LAVENDER);
        registerItem(levelHigh, Plants.LAVENDER_SPRIG);
        registerItem(levelHigh, Plants.SWAMP_RIBBON);
        registerItem(levelHigh, Plants.ROSE_SPRIG);
        registerItem(levelHigh, Plants.BLACK_DAHLIA);
        registerItem(levelHigh, Plants.ICE_ROSE);
        registerItem(levelHigh, Plants.WILD_CARROT);
        registerItem(levelHigh, Plants.WILD_POTATO);
        registerItem(levelHigh, Plants.WILD_BEET);
        registerItem(levelHigh, Plants.WILD_WHEAT);
        registerItem(levelHigh, Plants.ORANGE_BEAUTY);
        registerItem(levelHigh, Plants.JUNGLE_BUSH);
        registerItem(levelHigh, Plants.JUNGLE_BUSH);
        registerItem(levelHigh, Crops.COOKED_MANDRAKE);
        registerItem(levelHigh, Items.EGG);
        registerItem(levelHigh, DUCK_EGG);
        registerItem(levelHigh, Items.COD);
        registerItem(levelHigh, Items.SALMON);
        registerItem(levelHigh, Items.TROPICAL_FISH);
        registerItem(levelHigh, FIBER_BALE);

        registerItem(levelVery, Plants.AMERANTH_BLOCK);
    }
    
    private static void registerItem(float chance, ItemConvertible item) {
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(item.asItem(), chance);
    }
}
