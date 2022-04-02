package io.github.linkle.valleycraft.init;

import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.util.registry.Registry;

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
        registerItem(Plants.SOUR_BERRY_BUSH, levelLow);
        registerItem(Plants.HOLLY_BUSH, levelLow);
        registerItem(Plants.APPLE_SAPLING, levelLow);
        registerItem(Plants.FRUIT_BEARING_APPLE_LEAVES, levelLow);
        registerItem(Plants.APPLE_LEAVES, levelLow);
        registerItem(Plants.SMALL_CACTUS, levelLow);
        registerItem(Plants.FLOWERING_CACTUS, levelLow);
        registerItem(Plants.WILD_HERBS, levelLow);
        registerItem(Aquatic.RED_SEA_GRASS, levelLow);
        registerItem(Plants.WILD_TAPROOTS, levelLow);
        registerItem(Plants.DRY_MOSS_CARPET, levelLow);
        registerItem(Plants.HONEY_CLUSTER, levelLow);
        registerItem(Plants.PANFLOWERS, levelLow);
        registerItem(Crops.PUFF_SEEDS, levelLow);
        registerItem(Crops.ONION_SEEDS, levelLow);
        registerItem(Crops.EGGPLANT_SEEDS, levelLow);
        registerItem(Crops.EGGPLANT_ITEM, levelLow);
        registerItem(Crops.MANDRAKE_SEEDS, levelLow);
        registerItem(Crops.GREEN_BEAN, levelLow);
        registerItem(Crops.PEPPER_SEEDS, levelLow);
        registerItem(Crops.PEPPER_ITEM, levelLow);
        registerItem(Crops.GB_SEEDS, levelLow);
        registerItem(MiscItems.PLANT_FIBER, levelLow);
        registerItem(MiscItems.MOSS_CLUMP, levelLow);
        registerItem(MiscItems.GRASS_TURF, levelLow);
        registerItem(Plants.DRY_VINES, levelLow);
        registerItem(Items.STICK, levelLow);
        registerItem(Aquatic.SEA_FERN, levelLow);
        registerItem(Aquatic.RED_SEA_GRASS, levelLow);
        registerItem(MiscItems.DRY_MOSS_CLUMP, levelLow);

        registerItem(Plants.DRY_MOSS, levelMed);
        registerItem(MiscItems.DUCK_EGG, levelMed);
        registerItem(Items.EGG, levelMed);

        registerItem(Plants.MOREL, levelMed);
        registerItem(Plants.COMMON_BUSH, levelMed);
        registerItem(Crops.SNOW_YAM_ITEM, levelMed);
        registerItem(Plants.SNOWY_BUSH, levelMed);
        registerItem(Plants.SCRAGGLY_BUSH, levelMed);
        registerItem(Plants.ORANGE_GILLED_WAXING_CAP, levelMed);
        registerItem(Plants.ORANGE_FERN, levelMed);
        registerItem(Plants.MAIZE_CROP, levelMed);
        registerItem(Plants.CATTAILS, levelMed);
        registerItem(Crops.MINERS_LETTUCE_ITEM, levelMed);
        registerItem(Crops.SNOW_YAM_ITEM, levelMed);
        registerItem(Crops.ONION, levelMed);
        registerItem(Plants.MOSS_VINES, levelMed);
        registerItem(Plants.VERDANT_BUSH, levelMed);
        registerItem(Plants.BOXWOOD_BUSH, levelMed);
        registerItem(Crops.MANDRAKE, levelMed);
        registerItem(Plants.TUMBLE_WEED, levelMed);
        registerItem(Plants.APPLE_LEAVES, levelMed);
        registerItem(FoodAndCooking.WORM, levelMed);

        registerItem(MiscItems.MULCH, levelHigh);
        registerItem(Plants.SMALL_ROSE_BUSH, levelHigh);
        registerItem(Plants.SMALL_LILAC, levelHigh);
        registerItem(Plants.SMALL_PEONY, levelHigh);
        registerItem(Plants.WEEPING_JUNGLE_WILLOW, levelHigh);
        registerItem(Plants.REDWOOD_SORREL, levelHigh);
        registerItem(Plants.CROCUS, levelHigh);
        registerItem(Plants.MATURE_DANDELIONS, levelHigh);
        registerItem(Plants.LAVENDER, levelHigh);
        registerItem(Plants.SPRING_OF_LAVENDER, levelHigh);
        registerItem(Plants.POND_RIBBONS, levelHigh);
        registerItem(Plants.ROSE, levelHigh);
        registerItem(Plants.BLACK_DAHLIA, levelHigh);
        registerItem(Plants.FROZEN_ROSE, levelHigh);
        registerItem(Plants.WILD_CARROT, levelHigh);
        registerItem(Plants.WILD_POTATO, levelHigh);
        registerItem(Plants.WILD_BEETROOT, levelHigh);
        registerItem(Plants.WILD_WHEAT, levelHigh);
        registerItem(Plants.ORANGE_BEAUTY, levelHigh);
        registerItem(Plants.BLUE_POPPY_BUSH, levelHigh);
        registerItem(Crops.COOKED_MANDRAKE, levelHigh);
        registerItem(Items.EGG, levelHigh);
        registerItem(MiscItems.DUCK_EGG, levelHigh);
        registerItem(Items.COD, levelHigh);
        registerItem(Items.SALMON, levelHigh);
        registerItem(Items.TROPICAL_FISH, levelHigh);
        registerItem(Furniture.PLANT_FIBER_BALE, levelHigh);
    }
    
    private static void registerItem(ItemConvertible item, float chance) {
        if (Registry.ITEM.getId(item.asItem()).equals(Registry.ITEM.getDefaultId())) {
            // TODO: Add warning logs.
            return;
        }
        CompostingChanceRegistry.INSTANCE.add(item, chance);
    }
}
