package io.github.linkle.valleycraft.init.features;

import java.util.function.Predicate;

import com.google.common.base.Predicates;
import com.ibm.icu.impl.units.UnitsData.Categories;

import io.github.linkle.valleycraft.ValleyMain;
import io.github.linkle.valleycraft.blocks.plants.bushes.BerryBushBlock;
import io.github.linkle.valleycraft.init.Aquatic;
import io.github.linkle.valleycraft.init.Plants;
import io.github.linkle.valleycraft.utils.Util;
import io.github.linkle.valleycraft.world.gen.features.SimplePatchConfig;
import io.github.linkle.valleycraft.world.placer.ConditionBlockPlacer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.property.Properties;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.biome.Biome.Precipitation;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.HeightRangePlacementModifier;
import net.minecraft.world.gen.decorator.RarityFilterPlacementModifier;
import net.minecraft.world.gen.decorator.SquarePlacementModifier;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.heightprovider.ConstantHeightProvider;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

public class PlantFeatures {
    //Beach Features
    private static final RegistryKey<PlacedFeature> CLAM_BEACH_PATCH = create("clam_beach_patch", Aquatic.CLAM, 3, 4);
    private static final RegistryKey<PlacedFeature> SAND_DOLLAR_BEACH_PATCH = create("sand_dollar_beach_patch", Aquatic.SAND_DOLLAR.getDefaultState().with(Properties.WATERLOGGED, false), 1, 10);
    private static final RegistryKey<PlacedFeature> STARFISH_ORANGE_BEACH_PATCH = create("starfish_orange_beach_patch", Aquatic.STARFISH_ORANGE.getDefaultState().with(Properties.WATERLOGGED, false), 1, 10);

    public static void initialize() {
        var config = ValleyMain.CONFIG.featureGenerations.plantFeatures;
        var vegetal = GenerationStep.Feature.VEGETAL_DECORATION;
        var topLayer = GenerationStep.Feature.TOP_LAYER_MODIFICATION;
        Predicate<BiomeSelectionContext> snowOnly;
        snowOnly = context -> context.getBiome().getPrecipitation() == Precipitation.SNOW;

        //found on beaches
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BEACH, BiomeKeys.SNOWY_BEACH), vegetal, CLAM_BEACH_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BEACH, BiomeKeys.SNOWY_BEACH), vegetal, SAND_DOLLAR_BEACH_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BEACH), vegetal, STARFISH_ORANGE_BEACH_PATCH);

        //wild patches
        if (config.wheatPatch.enable) {
            var set = config.wheatPatch;
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.PLAINS), vegetal, create("wheat_patch", Plants.WILD_WHEAT, set.tries, set.rarity));
        }

        if (config.carrotPatch.enable) {
            var set = config.carrotPatch;
            BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST), vegetal, create("carrot_patch", Plants.WILD_CARROT, set.tries, set.rarity));
        }

        if (config.beetPatch.enable) {
            var set = config.beetPatch;
            BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BIRCH_FOREST, BiomeKeys.OLD_GROWTH_BIRCH_FOREST), vegetal, create("beet_patch", Plants.WILD_BEET, set.tries, set.rarity));
        }
            
        if (config.potatoPatch.enable) {
            var set = config.potatoPatch;
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE, Category.SAVANNA), vegetal, create("potato_patch", Plants.WILD_POTATO, set.tries, set.rarity));
        }
            
        if (config.willowPatch.enable) {
            var set = config.willowPatch;
            BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.JUNGLE, BiomeKeys.BAMBOO_JUNGLE), vegetal, create("willow_patch", Plants.WEAPING_SWAMP_WILLOW, set.tries, set.rarity));
        }
            
        if (config.ribbonPatch.enable) {
            var set = config.ribbonPatch;
            BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SWAMP, BiomeKeys.JUNGLE, BiomeKeys.SPARSE_JUNGLE, BiomeKeys.BAMBOO_JUNGLE), vegetal, create("ribbon_patch", Plants.SWAMP_RIBBON, set.tries, set.rarity));
        }
            
        if (config.orangeFernPatch.enable) {
            var set = config.orangeFernPatch;
            BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.JUNGLE, BiomeKeys.BAMBOO_JUNGLE), vegetal, create("orange_fern_patch", Plants.ORANGE_FERN, set.tries, set.rarity));
        }
            
        if (config.orangeBeautyPatch.enable) {
            var set = config.orangeBeautyPatch;
            BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.JUNGLE, BiomeKeys.BAMBOO_JUNGLE), vegetal, create("orange_beauty_patch", Plants.ORANGE_BEAUTY, set.tries, set.rarity));
        }
            
        if (config.dahliaPatch.enable) {
            var set = config.dahliaPatch;
            BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST), vegetal, create("black_dahlia_patch", Plants.BLACK_DAHLIA, set.tries, set.rarity));
        }
            
        if (config.lavenderPatch.enable) {
            var set = config.lavenderPatch;
            BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST), vegetal, create("lavender_patch", Plants.LAVENDER, set.tries, set.rarity));
        }
            
        if (config.sorrelPatch.enable) {
            var set = config.sorrelPatch;
            BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.OLD_GROWTH_PINE_TAIGA, BiomeKeys.OLD_GROWTH_PINE_TAIGA), vegetal, create("sorrel_patch", Plants.REDWOOD_SORREL, set.tries, set.rarity));
        }
            
        if (config.dandelionPatch.enable) {
            var set = config.dandelionPatch;
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.FOREST, Category.PLAINS, Category.TAIGA), vegetal, create("dandelion_patch", Plants.DANDELION_PUFF, set.tries, set.rarity));
        }
            
        //herbs and taproots
        if (config.herbPatch.enable) {
            var set = config.herbPatch;
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), vegetal, create("herbs_patch", Plants.HERBS, set.tries, set.rarity));
        }
            
        if (config.taprootPatch.enable) {
            var set = config.taprootPatch;
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), vegetal, create("taproots_patch", Plants.TAPROOTS, set.tries, set.rarity));
        }
            
        if (config.crocusPatch.enable) {
            var set = config.crocusPatch;
            BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.OLD_GROWTH_PINE_TAIGA, BiomeKeys.OLD_GROWTH_PINE_TAIGA), vegetal, create("crocus_patch", Plants.CROCUS, set.tries, set.rarity));
        }
            

        if (config.hollyPatch.enable) {
            var set = config.hollyPatch;
            var key = create("holly_patch", Plants.HOLLY_BUSH.getDefaultState().with(BerryBushBlock.AGE, 2), set.tries, set.rarity);
            BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.OLD_GROWTH_PINE_TAIGA, BiomeKeys.OLD_GROWTH_PINE_TAIGA), vegetal, key);
        }
            
        //found in dark woods
        if (config.morelPatch.enable) {
            var set = config.morelPatch;
            BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST), vegetal, create("morel_patch", Plants.MOREL, set.tries, set.rarity));
        }
           
        if (config.sourPatch.enable) {
            var set = config.sourPatch;
            var key = create("sour_patch", Plants.SOUR_BERRY_BUSH.getDefaultState().with(BerryBushBlock.AGE, 2), set.tries, set.rarity);
            BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST), vegetal, key);
        }

        //found in every biome except snow
        if (config.bushPatch.enable) {
            var set = config.bushPatch;
            BiomeModifications.addFeature(Predicates.not(snowOnly::test), vegetal, create("bush_patch", Plants.BUSH, set.tries, set.rarity));
        }
        
        if (config.sproutPatch.enable) {
            var set = config.sproutPatch;
            BiomeModifications.addFeature(Predicates.not(snowOnly::test), vegetal, create("sprout_patch", Plants.SPROUT, set.tries, set.rarity));
        }
            
        //found in old growth biomes
        if (config.boxwoodPatch.enable) {
            var set = config.boxwoodPatch;
            BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.OLD_GROWTH_PINE_TAIGA, BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA), vegetal, create("boxwood_patch", Plants.HEDGE, set.tries, set.rarity));
        }

        //found in jungles
        if (config.jungleCapPatch.enable) {
            var set = config.jungleCapPatch;
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE), vegetal, create("jungle_cap_patch", Plants.JUNGLE_CAP, set.tries, set.rarity));
        }
            
        if (config.panPatch.enable) {
            var set = config.panPatch;
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE), vegetal, create("panflower_patch", Plants.PANFLOWER, set.tries, set.rarity));
        }
            
        //found in jungles and swamps
        if (config.swampBushPatch.enable) {
            var set = config.swampBushPatch;
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE, Category.SWAMP), vegetal, create("js_bush_patch", Plants.SWAMP_BUSH, set.tries, set.rarity));
        }
            
        if (config.rockPatch.enable) {
            var set = config.rockPatch;
            BiomeModifications.addFeature(Predicates.not(snowOnly::test), vegetal, create("rock_patch", Plants.ROCK_PILE, set.tries, set.rarity));
        }
            
        //found in snowy biomes
        if (config.snowPatch.enable) {
            var set = config.snowPatch;
            BiomeModifications.addFeature(snowOnly, vegetal, create("snow_bush_patch", Plants.SNOW_BUSH, set.tries, set.rarity));
        }
            
        if (config.snowRockPatch.enable) {
            var set = config.snowRockPatch;
            BiomeModifications.addFeature(snowOnly, vegetal, create("snow_rock_patch", Plants.SNOW_ROCK_PILE, set.tries, set.rarity));
        }
            
        //these three share the same biomes, keep the values low so they don't overpopulate them!
        //found in forests
        if (config.rosePatch.enable) {
            var set = config.rosePatch;
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.FOREST), vegetal, create("rose_patch", Plants.ROSEBUSH, set.tries, set.rarity));
        }
            
        if (config.honeyClusterPatch.enable) {
            var set = config.honeyClusterPatch;
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.FOREST, Category.PLAINS), vegetal, create("honey_cluster_patch", Plants.HONEY_CLUSTER, set.tries, set.rarity));
        }
            
        if (config.lilacPatch.enable) {
            var set = config.lilacPatch;
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.FOREST, Category.PLAINS), vegetal, create("lilac_patch", Plants.LILACBUSH, set.tries, set.rarity));
        }
            
        if (config.peonyPatch.enable) {
            var set = config.peonyPatch;
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.FOREST), vegetal, create("peony_patch", Plants.PEONYBUSH, set.tries, set.rarity));
        }
            
        //found in deserts
        if (config.tumblePatch.enable) {
            var set = config.tumblePatch;
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.DESERT, Category.MESA), vegetal, create("tumbleweed_patch", Plants.TUMBLE_WEED, set.tries, set.rarity));
        }
            
        if (config.floweringCactusPatch.enable) {
            var set = config.floweringCactusPatch;
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.DESERT, Category.MESA), vegetal, create("flowering_cactus_patch", Plants.FLOWERING_CACTUS, set.tries, set.rarity));
        }
            
        if (config.cactusPatch.enable) {
            var set = config.cactusPatch;
            var key = create("small_patch", Util.randomHoriFacing(Plants.SMALL_CACTUS.getDefaultState()), set.tries, set.rarity);
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.DESERT, Category.MESA), vegetal, key);
        }

        if (config.alivePatch.enable) {
            var set = config.alivePatch;
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.SAVANNA), vegetal, create("alive_patch", Plants.BUSH_ALIVE, set.tries, set.rarity));
        }
            
        //found in podzol
        if (config.bitterPatch.enable) {
            var set = config.bitterPatch;
            var key = create("bitter_patch", Plants.BITTER_BERRY_BUSH.getDefaultState().with(BerryBushBlock.AGE, 3), set.tries, set.rarity);
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE), vegetal, key);
        }

        //found in shattered savannas
        if (config.tomatoPatch.enable) {
            var set = config.tomatoPatch;
            var key = create("tomato_patch", Plants.TOMATO_BUSH.getDefaultState().with(BerryBushBlock.AGE, 2), set.tries, set.rarity);
            BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WINDSWEPT_SAVANNA), vegetal, key);
        }
        
        // 62 is where a sea level with water block inside.
        // If you want to config reeds counts or something, check the ReedPatchFeature class.
        RegistryKey<PlacedFeature> key = Util.register("reed_patch", VFeatures.REED_PATCH.configure(DefaultFeatureConfig.INSTANCE), 
                HeightRangePlacementModifier.of(ConstantHeightProvider.create(YOffset.fixed(62))));
        var categories = BiomeSelectors.categories(Category.RIVER, Category.PLAINS, Category.SWAMP, Category.FOREST, Category.JUNGLE, Category.TAIGA);
        if (config.reedPatch.enable)
            BiomeModifications.addFeature(categories, topLayer, key);
    }
    
    /** Create the random patch feature config. */
    private static RegistryKey<PlacedFeature> create(String id, Block block, int tries, int rarity) {
        return create(id, block.getDefaultState(), tries, rarity);
    }
    
    /** Create the random patch feature config. */
    private static RegistryKey<PlacedFeature> create(String id, BlockState block, int tries, int rarity) {
        return create(id, BlockStateProvider.of(block), tries, rarity);
    }
    
    private static final ConditionBlockPlacer PLACER = new ConditionBlockPlacer(state -> state.getMaterial().isReplaceable());
    
    /** Create the random patch feature config. */
    private static RegistryKey<PlacedFeature> create(String id, BlockStateProvider block, int tries, int rarity) {
        var config = VFeatures.SIMPLE_PATCH.configure(new SimplePatchConfig(block, tries, 7, 3, PLACER));
        return Util.register(id, config, RarityFilterPlacementModifier.of(rarity), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP);
    }
}
