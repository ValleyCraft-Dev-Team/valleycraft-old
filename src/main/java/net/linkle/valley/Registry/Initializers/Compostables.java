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

        registerItem(levelLow, Blocks.RICE_SEEDLINGS);
        registerItem(levelLow, Blocks.TOMATO_BUSH);
        registerItem(levelLow, Blocks.SPICY_BERRY_BUSH);
        registerItem(levelLow, Blocks.BITTER_BERRY_BUSH);
        registerItem(levelLow, Blocks.HOLLY_BUSH);
        registerItem(levelLow, Blocks.APPLE_SAPLING);
        registerItem(levelLow, Blocks.APPLE_LEAVES);
        registerItem(levelLow, Blocks.APPLE_LEAVES_EMPTY);
        registerItem(levelLow, Blocks.SMALL_CACTUS);
        registerItem(levelLow, Crops.PUFF_SEEDS);
        registerItem(levelLow, Crops.MANDRAKE_SEEDS);
        registerItem(levelLow, Crops.GREEN_BEAN);
        registerItem(levelLow, Crops.GB_SEEDS);
        registerItem(levelLow, FIBER);
        registerItem(levelLow, MOSS_BALL);
        registerItem(levelLow, TURF_ITEM);
        registerItem(levelLow, Items.STICK);

        registerItem(levelMed, Blocks.MOREL);
        registerItem(levelMed, Blocks.BUSH);
        registerItem(levelMed, Blocks.SNOW_YAM);
        registerItem(levelMed, SNOW_YAM_ITEM);
        registerItem(levelMed, WINTER_ROOT_ITEM);
        registerItem(levelMed, Blocks.SNOW_BUSH);
        registerItem(levelMed, Blocks.WINTER_ROOT);
        registerItem(levelMed, Blocks.BUSH_ALIVE);
        registerItem(levelMed, Blocks.BUSH_ALIVE_TALL);
        registerItem(levelMed, Blocks.FERNBUSH);
        registerItem(levelMed, Blocks.JUNGLE_CAP);
        registerItem(levelMed, Blocks.ORANGE_FERN);
        registerItem(levelMed, Blocks.SPROUT);
        registerItem(levelMed, Blocks.MAIZE_CROP);
        registerItem(levelMed, Blocks.REED_BLOCK);
        registerItem(levelMed, Blocks.MINER_BUSH);
        registerItem(levelMed, Blocks.ONION);
        registerItem(levelMed, Blocks.MOSSY_VINE);
        registerItem(levelMed, Blocks.SWAMP_BUSH);
        registerItem(levelMed, Blocks.HEDGE);
        registerItem(levelMed, Crops.MANDRAKE);
        registerItem(levelMed, Blocks.BUSH_DEAD_TALL);
        registerItem(levelMed, Blocks.TUMBLE_WEED);
        registerItem(levelMed, Blocks.APPLE_LEAVES_EMPTY);
        registerItem(levelMed, WORM);

        registerItem(levelHigh, MULCH);
        registerItem(levelHigh, Blocks.ROSEBUSH);
        registerItem(levelHigh, Blocks.LILACBUSH);
        registerItem(levelHigh, Blocks.PEONYBUSH);
        registerItem(levelHigh, Blocks.FERNBUSH);
        registerItem(levelHigh, Blocks.WEAPING_SWAMP_WILLOW);
        registerItem(levelHigh, Blocks.REDWOOD_SORREL);
        registerItem(levelHigh, Blocks.CROCUS);
        registerItem(levelHigh, Blocks.DANDELION_PUFF);
        registerItem(levelHigh, Blocks.LAVENDER);
        registerItem(levelHigh, Blocks.LAVENDER_SPRIG);
        registerItem(levelHigh, Blocks.SWAMP_RIBBON);
        registerItem(levelHigh, Blocks.ROSE_SPRIG);
        registerItem(levelHigh, Blocks.BLACK_DAHLIA);
        registerItem(levelHigh, Blocks.ICE_ROSE);
        registerItem(levelHigh, Blocks.WILD_CARROT);
        registerItem(levelHigh, Blocks.WILD_POTATO);
        registerItem(levelHigh, Blocks.WILD_BEET);
        registerItem(levelHigh, Blocks.WILD_WHEAT);
        registerItem(levelHigh, Blocks.ORANGE_BEAUTY);
        registerItem(levelHigh, Blocks.JUNGLE_BUSH);
        registerItem(levelHigh, Blocks.JUNGLE_BUSH);
        registerItem(levelHigh, Crops.COOKED_MANDRAKE);
        registerItem(levelHigh, Items.EGG);
        registerItem(levelHigh, DUCK_EGG);
        registerItem(levelHigh, Items.COD);
        registerItem(levelHigh, Items.SALMON);
        registerItem(levelHigh, Items.TROPICAL_FISH);
        registerItem(levelHigh, FIBER_BALE);

        registerItem(levelVery, Blocks.AMERANTH_BLOCK);
    }
    
    private static void registerItem(float chance, ItemConvertible item) {
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(item.asItem(), chance);
    }
}
