package io.github.linkle.valleycraft.init.features;

import io.github.linkle.valleycraft.ValleyMain;
import io.github.linkle.valleycraft.blocks.plants.bushes.BerryBushBlock;
import io.github.linkle.valleycraft.init.Plants;
import io.github.linkle.valleycraft.utils.Util;
import io.github.linkle.valleycraft.world.gen.features.ReedPatchFeature;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.biome.Biome.Precipitation;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.HeightRangePlacementModifier;
import net.minecraft.world.gen.decorator.SquarePlacementModifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.heightprovider.ConstantHeightProvider;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

import java.util.function.Predicate;

public class PlantFeatures {
    public static final ReedPatchFeature REED_PATCH = new ReedPatchFeature();    
    
    private static final RegistryKey<PlacedFeature> BUSH_PATCH = create("bush_patch", Plants.BUSH, 7);
    private static final RegistryKey<PlacedFeature> HOLLY_PATCH = create("holly_patch", Plants.HOLLY_BUSH.getDefaultState().with(BerryBushBlock.AGE, 2), 1);
    private static final RegistryKey<PlacedFeature> MOREL_PATCH = create("morel_patch", Plants.MOREL, 3);
    private static final RegistryKey<PlacedFeature> HONEYCLUSTER_PATCH = create("honey_cluster_patch", Plants.HONEY_CLUSTER, 2);
    private static final RegistryKey<PlacedFeature> PAN_PATCH = create("panflower_patch", Plants.PANFLOWER, 1);
    private static final RegistryKey<PlacedFeature> CROCUS_PATCH = create("crocus_patch", Plants.CROCUS, 3);
    private static final RegistryKey<PlacedFeature> TAPROOT_PATCH = create("taproots_patch", Plants.TAPROOTS, 1);
    private static final RegistryKey<PlacedFeature> FLOWERING_CACTUS_PATCH = create("flowering_cactus_patch", Plants.FLOWERING_CACTUS, 3);
    private static final RegistryKey<PlacedFeature> SPROUT_PATCH = create("sprout_patch", Plants.SPROUT, 3);
    private static final RegistryKey<PlacedFeature> ROSE_PATCH = create("rose_patch", Plants.ROSEBUSH, 1);
    private static final RegistryKey<PlacedFeature> LILAC_PATCH = create("lilac_patch", Plants.LILACBUSH, 1);
    private static final RegistryKey<PlacedFeature> PEONY_PATCH = create("peony_patch", Plants.PEONYBUSH, 1);
    private static final RegistryKey<PlacedFeature> TUMBLE_PATCH = create("tumbleweed_patch", Plants.TUMBLE_WEED, 1);
    private static final RegistryKey<PlacedFeature> CACTUS_PATCH = create("small_patch", Plants.SMALL_CACTUS, 2);
    private static final RegistryKey<PlacedFeature> ROCK_PATCH = create("rock_patch", Plants.ROCK_PILE, 8);
    private static final RegistryKey<PlacedFeature> SNOW_ROCK_PATCH = create("noname", Plants.SNOW_ROCK_PILE, 10);
    private static final RegistryKey<PlacedFeature> ALIVE_PATCH = create("alive_patch", Plants.BUSH_ALIVE, 10);
    private static final RegistryKey<PlacedFeature> BITTER_PATCH = create("bitter_patch", Plants.BITTER_BERRY_BUSH.getDefaultState().with(BerryBushBlock.AGE, 3), 2);
    private static final RegistryKey<PlacedFeature> TOMATO_PATCH = create("tomato_patch", Plants.TOMATO_BUSH.getDefaultState().with(BerryBushBlock.AGE, 2), 1);
    private static final RegistryKey<PlacedFeature> SNOW_PATCH = create("snow_bush_patch", Plants.SNOW_BUSH, 10);
    private static final RegistryKey<PlacedFeature> WHEAT_PATCH = create("wheat_patch", Plants.WILD_WHEAT, 1);
    private static final RegistryKey<PlacedFeature> CARROT_PATCH = create("carrot_patch", Plants.WILD_CARROT, 1);
    private static final RegistryKey<PlacedFeature> BEET_PATCH = create("beet_patch", Plants.WILD_BEET, 1);
    private static final RegistryKey<PlacedFeature> POTATO_PATCH = create("potato_patch", Plants.WILD_POTATO, 1);
    private static final RegistryKey<PlacedFeature> WILLOW_PATCH = create("willow_patch", Plants.WEAPING_SWAMP_WILLOW, 2);
    private static final RegistryKey<PlacedFeature> RIBBON_PATCH = create("ribbon_patch", Plants.SWAMP_RIBBON, 12);
    private static final RegistryKey<PlacedFeature> DAHLIA_PATCH = create("black_dahlia_patch", Plants.BLACK_DAHLIA, 8);
    private static final RegistryKey<PlacedFeature> LAVENDER_PATCH = create("lavender_patch", Plants.LAVENDER, 8);
    private static final RegistryKey<PlacedFeature> ORANGE_FERN_PATCH = create("orange_fern_patch", Plants.ORANGE_FERN, 5);
    private static final RegistryKey<PlacedFeature> ORANGE_BEAUTY_PATCH = create("orange_beauty_patch", Plants.ORANGE_BEAUTY, 2);
    private static final RegistryKey<PlacedFeature> SORREL_PATCH = create("sorrel_patch", Plants.REDWOOD_SORREL, 5);
    private static final RegistryKey<PlacedFeature> DANDELION_PATCH = create("dandelion_patch", Plants.DANDELION_PUFF, 2);
    private static final RegistryKey<PlacedFeature> JUNGLE_CAP_PATCH = create("jungle_cap_patch", Plants.JUNGLE_CAP, 1);
    private static final RegistryKey<PlacedFeature> SWAMP_BUSH_PATCH = create("js_bush_patch", Plants.SWAMP_BUSH, 7);
    private static final RegistryKey<PlacedFeature> HERB_PATCH = create("herbs_patch", Plants.HERBS, 1);

    public static void initialize() {
        Registry.register(Registry.FEATURE, new Identifier(ValleyMain.MOD_ID, "reed_patch"), REED_PATCH);
        
        var vegetal = GenerationStep.Feature.VEGETAL_DECORATION;
        Predicate<BiomeSelectionContext> snowOnly;
        snowOnly = context -> context.getBiome().getPrecipitation() == Precipitation.SNOW;
        
        //wild patches
        if (ValleyMain.CONFIG.featureGenerations.plantFeatures.wheatPatchEnabled)
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.PLAINS), vegetal, WHEAT_PATCH);

        if (ValleyMain.CONFIG.featureGenerations.plantFeatures.carrotPatchEnabled)
            BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST), vegetal, CARROT_PATCH);

        if (ValleyMain.CONFIG.featureGenerations.plantFeatures.beetPatchEnabled)
            BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BIRCH_FOREST, BiomeKeys.OLD_GROWTH_BIRCH_FOREST), vegetal, BEET_PATCH);

        if (ValleyMain.CONFIG.featureGenerations.plantFeatures.potatoPatchEnabled)
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE, Category.SAVANNA), vegetal, POTATO_PATCH);

        if (ValleyMain.CONFIG.featureGenerations.plantFeatures.willowPatchEnabled)
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.SWAMP, Category.JUNGLE), vegetal, WILLOW_PATCH);

        if (ValleyMain.CONFIG.featureGenerations.plantFeatures.ribbonPatchEnabled)
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.SWAMP, Category.JUNGLE), vegetal, RIBBON_PATCH);

        if (ValleyMain.CONFIG.featureGenerations.plantFeatures.orangeFernPatchEnabled)
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE), vegetal, ORANGE_FERN_PATCH);

        if (ValleyMain.CONFIG.featureGenerations.plantFeatures.orangeBeautyPatchEnabled)
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE), vegetal, ORANGE_BEAUTY_PATCH);

        if (ValleyMain.CONFIG.featureGenerations.plantFeatures.dahliaPatchEnabled)
            BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST), vegetal, DAHLIA_PATCH);

        if (ValleyMain.CONFIG.featureGenerations.plantFeatures.lavenderPatchEnabled)
            BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST), vegetal, LAVENDER_PATCH);

        if (ValleyMain.CONFIG.featureGenerations.plantFeatures.sorrelPatchEnabled)
            BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.OLD_GROWTH_PINE_TAIGA, BiomeKeys.OLD_GROWTH_PINE_TAIGA), vegetal, SORREL_PATCH);

        if (ValleyMain.CONFIG.featureGenerations.plantFeatures.dandelionPatchEnabled)
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.FOREST, Category.PLAINS, Category.TAIGA), vegetal, DANDELION_PATCH);

        //herbs and taproots
        if (ValleyMain.CONFIG.featureGenerations.plantFeatures.herbPatchEnabled)
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), vegetal, HERB_PATCH);

        if (ValleyMain.CONFIG.featureGenerations.plantFeatures.taprootPatchEnabled)
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), vegetal, TAPROOT_PATCH);

        if (ValleyMain.CONFIG.featureGenerations.plantFeatures.crocusPatchEnabled)
            BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.OLD_GROWTH_PINE_TAIGA, BiomeKeys.OLD_GROWTH_PINE_TAIGA), vegetal, CROCUS_PATCH);


        if (ValleyMain.CONFIG.featureGenerations.plantFeatures.hollyPatchEnabled)
            BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.OLD_GROWTH_PINE_TAIGA, BiomeKeys.OLD_GROWTH_PINE_TAIGA), vegetal, HOLLY_PATCH);

        //found in dark woods
        if (ValleyMain.CONFIG.featureGenerations.plantFeatures.morelPatchEnabled)
            BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST), vegetal, MOREL_PATCH);

        //found in every biome except snow
        if (ValleyMain.CONFIG.featureGenerations.plantFeatures.bushPatchEnabled)
            BiomeModifications.addFeature(c -> !snowOnly.test(c), vegetal, BUSH_PATCH);

        if (ValleyMain.CONFIG.featureGenerations.plantFeatures.sproutPatchEnabled)
            BiomeModifications.addFeature(c -> !snowOnly.test(c), vegetal, SPROUT_PATCH);

        //found in jungles
        if (ValleyMain.CONFIG.featureGenerations.plantFeatures.jungleCapPatchEnabled)
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE), vegetal, JUNGLE_CAP_PATCH);

        if (ValleyMain.CONFIG.featureGenerations.plantFeatures.panPatchEnabled)
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE), vegetal, PAN_PATCH);

        //found in jungles and swamps
        if (ValleyMain.CONFIG.featureGenerations.plantFeatures.swampBushPatchEnabled)
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE, Category.SWAMP), vegetal, SWAMP_BUSH_PATCH);

        if (ValleyMain.CONFIG.featureGenerations.plantFeatures.rockPatchEnabled)
            BiomeModifications.addFeature(c -> !snowOnly.test(c), GenerationStep.Feature.VEGETAL_DECORATION, ROCK_PATCH);

        //found in snowy biomes
        if (ValleyMain.CONFIG.featureGenerations.plantFeatures.snowPatchEnabled)
            BiomeModifications.addFeature(snowOnly, vegetal, SNOW_PATCH);

        if (ValleyMain.CONFIG.featureGenerations.plantFeatures.snowRockPatchEnabled)
            BiomeModifications.addFeature(snowOnly, vegetal, SNOW_ROCK_PATCH);

        //these three share the same biomes, keep the values low so they don't overpopulate them!
        //found in forests
        if (ValleyMain.CONFIG.featureGenerations.plantFeatures.rosePatchEnabled)
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.FOREST), vegetal, ROSE_PATCH);

        if (ValleyMain.CONFIG.featureGenerations.plantFeatures.honeyClusterPatchEnabled)
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.FOREST), vegetal, HONEYCLUSTER_PATCH);

        if (ValleyMain.CONFIG.featureGenerations.plantFeatures.lilacPatchEnabled)
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.FOREST), vegetal, LILAC_PATCH);

        if (ValleyMain.CONFIG.featureGenerations.plantFeatures.peonyPatchEnabled)
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.FOREST), vegetal, PEONY_PATCH);

        //found in deserts
        if (ValleyMain.CONFIG.featureGenerations.plantFeatures.tumblePatchEnabled)
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.DESERT, Category.MESA), vegetal, TUMBLE_PATCH);

        if (ValleyMain.CONFIG.featureGenerations.plantFeatures.floweringCactusPatchEnabled)
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.DESERT, Category.MESA), vegetal, FLOWERING_CACTUS_PATCH);

        if (ValleyMain.CONFIG.featureGenerations.plantFeatures.cactusPatchEnabled)
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.DESERT, Category.MESA), vegetal, CACTUS_PATCH);

        if (ValleyMain.CONFIG.featureGenerations.plantFeatures.alivePatchEnabled)
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.SAVANNA), vegetal, ALIVE_PATCH);

        //found in podzol
        if (ValleyMain.CONFIG.featureGenerations.plantFeatures.bitterPatchEnabled)
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE), vegetal, BITTER_PATCH);

        //found in shattered savannas
        if (ValleyMain.CONFIG.featureGenerations.plantFeatures.tomatoPatchEnabled)
            BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WINDSWEPT_SAVANNA), vegetal, TOMATO_PATCH);
        
        // 62 is where a sea level with water block inside.
        // If you want to config reeds counts or something, check the ReedPatchFeature class.
        RegistryKey<PlacedFeature> key = Util.register("reed_patch", REED_PATCH.configure(DefaultFeatureConfig.INSTANCE), 
                HeightRangePlacementModifier.of(ConstantHeightProvider.create(YOffset.fixed(62))));
        var categories = BiomeSelectors.categories(Category.RIVER, Category.PLAINS, Category.SWAMP, Category.FOREST, Category.JUNGLE, Category.TAIGA);
        if (ValleyMain.CONFIG.featureGenerations.plantFeatures.reedPatchEnabled)
            BiomeModifications.addFeature(categories, vegetal, key);
    }
    
    /** Create the random patch feature config. */
    private static RegistryKey<PlacedFeature> create(String id, Block block, int tries) {
        return create(id, block.getDefaultState(), tries);
    }
    
    /** Create the random patch feature config. */
    private static RegistryKey<PlacedFeature> create(String id, BlockState block, int tries) {
        var simple = Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(BlockStateProvider.of(block))).withInAirFilter();
        var config = ConfiguredFeatures.createRandomPatchFeatureConfig(tries, simple);
        return Util.register(id, Feature.RANDOM_PATCH.configure(config), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP);
    }
}
