package net.linkle.valley.Registry.Initializers;

import net.minecraft.block.ComposterBlock;
import net.minecraft.item.ItemConvertible;

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

        registerItem(levelMed, Blocks.MOREL);
        registerItem(levelMed, Blocks.BUSH);
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

        registerItem(levelVery, Blocks.AMERANTH_BLOCK);
    }
    
    private static void registerItem(float chance, ItemConvertible item) {
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(item.asItem(), chance);
    }
}
