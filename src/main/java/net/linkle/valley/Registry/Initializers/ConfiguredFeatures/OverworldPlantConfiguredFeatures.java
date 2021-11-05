package net.linkle.valley.Registry.Initializers.ConfiguredFeatures;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.linkle.valley.ValleyMain;
import net.linkle.valley.Registry.Blocks.Plants.Bushes.BitterBerryBushBlock;
import net.linkle.valley.Registry.Blocks.Plants.Bushes.MinerBushBlock;
import net.linkle.valley.Registry.Blocks.Plants.Bushes.OnionBushBlock;
import net.linkle.valley.Registry.Blocks.Plants.Bushes.TomatoBushBlock;
import net.linkle.valley.Registry.Initializers.ConfiguredFeatures.Gen.ReedPatchFeature;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.RandomPatchFeatureConfig;
import net.minecraft.world.gen.heightprovider.ConstantHeightProvider;
import net.minecraft.world.gen.placer.SimpleBlockPlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;

import static net.linkle.valley.ValleyMain.MOD_ID;

import static net.linkle.valley.Registry.Initializers.Plants.*;

@SuppressWarnings("deprecation")
public class OverworldPlantConfiguredFeatures {
    public static final ReedPatchFeature REED_PATCH = new ReedPatchFeature();    
    
    public static final ConfiguredFeature<?, ?> BUSH_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(BUSH
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(10).build());

    public static final ConfiguredFeature<?, ?> ROSE_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(ROSEBUSH
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(2).build());

    public static final ConfiguredFeature<?, ?> LILAC_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(LILACBUSH
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(2).build());

    public static final ConfiguredFeature<?, ?> PEONY_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(PEONYBUSH
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(2).build());

    public static final ConfiguredFeature<?, ?> FERN_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(FERNBUSH
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(10).build());

    public static final ConfiguredFeature<?, ?> TUMBLE_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(TUMBLE_WEED
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(2).build());

    public static final ConfiguredFeature<?, ?> CACTUS_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(SMALL_CACTUS
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(2).build());

    public static final ConfiguredFeature<?, ?> DEAD_PATCH_TALL = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(BUSH_DEAD_TALL
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(10).build());

    public static final ConfiguredFeature<?, ?> ROCK_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(ROCK_PILE
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(5).build());

    public static final ConfiguredFeature<?, ?> SNOW_ROCK_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(SNOW_ROCK_PILE
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(10).build());

    public static final ConfiguredFeature<?, ?> ALIVE_PATCH_TALL = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(BUSH_ALIVE_TALL
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(10).build());

    public static final ConfiguredFeature<?, ?> ALIVE_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(BUSH_ALIVE
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(10).build());

    public static final ConfiguredFeature<?, ?> BITTER_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(BITTER_BERRY_BUSH
                    .getDefaultState().with(BitterBerryBushBlock.AGE, 3)), SimpleBlockPlacer.INSTANCE)).tries(2).build());

    public static final ConfiguredFeature<?, ?> TOMATO_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(TOMATO_BUSH
                    .getDefaultState().with(TomatoBushBlock.AGE, 2)), SimpleBlockPlacer.INSTANCE)).tries(1).build());

    public static final ConfiguredFeature<?, ?> SNOW_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(SNOW_BUSH
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(10).build());

    //wild patches
    public static final ConfiguredFeature<?, ?> WHEAT_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(WILD_WHEAT
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(1).build());

    public static final ConfiguredFeature<?, ?> CARROT_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(WILD_CARROT
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(1).build());

    public static final ConfiguredFeature<?, ?> BEET_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(WILD_BEET
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(1).build());

    public static final ConfiguredFeature<?, ?> POTATO_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(WILD_POTATO
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(1).build());

    public static final ConfiguredFeature<?, ?> WILLOW_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(WEAPING_SWAMP_WILLOW
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(5).build());

    public static final ConfiguredFeature<?, ?> RIBBON_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(SWAMP_RIBBON
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(12).build());

    public static final ConfiguredFeature<?, ?> DAHLIA_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(BLACK_DAHLIA
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(8).build());

    public static final ConfiguredFeature<?, ?> LAVENDER_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(LAVENDER
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(8).build());

    public static final ConfiguredFeature<?, ?> ORANGE_FERN_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(ORANGE_FERN
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(5).build());

    public static final ConfiguredFeature<?, ?> ORANGE_BEAUTY_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(ORANGE_BEAUTY
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(5).build());

    public static final ConfiguredFeature<?, ?> SORREL_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(REDWOOD_SORREL
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(5).build());

    public static final ConfiguredFeature<?, ?> DANDELION_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(DANDELION_PUFF
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(5).build());

    public static final ConfiguredFeature<?, ?> MINER_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(MINER_BUSH
                    .getDefaultState().with(MinerBushBlock.AGE, 3)), SimpleBlockPlacer.INSTANCE)).tries(5).build());

    public static final ConfiguredFeature<?, ?> ONION_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(ONION
                    .getDefaultState().with(OnionBushBlock.AGE, 1)), SimpleBlockPlacer.INSTANCE)).tries(5).build());

    public static final ConfiguredFeature<?, ?> JUNGLE_CAP_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(JUNGLE_CAP
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(5).build());

    public static final ConfiguredFeature<?, ?> SWAMP_BUSH_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(SWAMP_BUSH
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(10).build());

    public static final ConfiguredFeature<?, ?> SPROUT_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(SPROUT
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(5).build());

    public static void initialize() {
        Registry.register(Registry.FEATURE, new Identifier(ValleyMain.MOD_ID, "reed_patch"), REED_PATCH);
        
        //wild patches
        RegistryKey<ConfiguredFeature<?, ?>> wheatPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "wheat_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, wheatPatch.getValue(), WHEAT_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS, BiomeKeys.SUNFLOWER_PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, wheatPatch);

        RegistryKey<ConfiguredFeature<?, ?>> carrotPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "carrot_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, carrotPatch.getValue(), CARROT_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST, BiomeKeys.DARK_FOREST_HILLS),
                GenerationStep.Feature.VEGETAL_DECORATION, carrotPatch);

        RegistryKey<ConfiguredFeature<?, ?>> beetPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "beet_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, beetPatch.getValue(), BEET_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BIRCH_FOREST, BiomeKeys.BIRCH_FOREST_HILLS, BiomeKeys.TALL_BIRCH_FOREST, BiomeKeys.TALL_BIRCH_HILLS),
                GenerationStep.Feature.VEGETAL_DECORATION, beetPatch);

        RegistryKey<ConfiguredFeature<?, ?>> potatoPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "potato_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, potatoPatch.getValue(), POTATO_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.JUNGLE_HILLS, BiomeKeys.JUNGLE_EDGE, BiomeKeys.JUNGLE, BiomeKeys.MODIFIED_JUNGLE_EDGE, BiomeKeys.MODIFIED_JUNGLE, BiomeKeys.SAVANNA_PLATEAU, BiomeKeys.SAVANNA, BiomeKeys.SHATTERED_SAVANNA_PLATEAU, BiomeKeys.SHATTERED_SAVANNA),
                GenerationStep.Feature.VEGETAL_DECORATION, potatoPatch);

        RegistryKey<ConfiguredFeature<?, ?>> willowPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "willow_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, willowPatch.getValue(), WILLOW_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SWAMP, BiomeKeys.SWAMP_HILLS, BiomeKeys.JUNGLE, BiomeKeys.JUNGLE_HILLS, BiomeKeys.JUNGLE_EDGE, BiomeKeys.MODIFIED_JUNGLE, BiomeKeys.MODIFIED_JUNGLE_EDGE, BiomeKeys.BAMBOO_JUNGLE, BiomeKeys.BAMBOO_JUNGLE_HILLS),
                GenerationStep.Feature.VEGETAL_DECORATION, willowPatch);

        RegistryKey<ConfiguredFeature<?, ?>> ribbonPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "ribbon_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ribbonPatch.getValue(), RIBBON_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SWAMP, BiomeKeys.SWAMP_HILLS, BiomeKeys.JUNGLE, BiomeKeys.JUNGLE_HILLS, BiomeKeys.JUNGLE_EDGE, BiomeKeys.MODIFIED_JUNGLE, BiomeKeys.MODIFIED_JUNGLE_EDGE, BiomeKeys.BAMBOO_JUNGLE, BiomeKeys.BAMBOO_JUNGLE_HILLS),
                GenerationStep.Feature.VEGETAL_DECORATION, ribbonPatch);

        RegistryKey<ConfiguredFeature<?, ?>> ofPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "orange_fern_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ofPatch.getValue(), ORANGE_FERN_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.JUNGLE, BiomeKeys.JUNGLE_HILLS, BiomeKeys.JUNGLE_EDGE, BiomeKeys.MODIFIED_JUNGLE, BiomeKeys.MODIFIED_JUNGLE_EDGE, BiomeKeys.BAMBOO_JUNGLE, BiomeKeys.BAMBOO_JUNGLE_HILLS),
                GenerationStep.Feature.VEGETAL_DECORATION, ofPatch);

        RegistryKey<ConfiguredFeature<?, ?>> obPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "orange_beauty_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, obPatch.getValue(), ORANGE_BEAUTY_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.JUNGLE, BiomeKeys.JUNGLE_HILLS, BiomeKeys.JUNGLE_EDGE, BiomeKeys.MODIFIED_JUNGLE, BiomeKeys.MODIFIED_JUNGLE_EDGE, BiomeKeys.BAMBOO_JUNGLE, BiomeKeys.BAMBOO_JUNGLE_HILLS),
                GenerationStep.Feature.VEGETAL_DECORATION, obPatch);

        RegistryKey<ConfiguredFeature<?, ?>> bdPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "black_dahlia_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, bdPatch.getValue(), DAHLIA_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, bdPatch);

        RegistryKey<ConfiguredFeature<?, ?>> lPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "lavender_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, lPatch.getValue(), LAVENDER_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, lPatch);

        RegistryKey<ConfiguredFeature<?, ?>> sorrelPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "sorrel_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, sorrelPatch.getValue(), SORREL_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.GIANT_TREE_TAIGA, BiomeKeys.GIANT_SPRUCE_TAIGA, BiomeKeys.GIANT_TREE_TAIGA_HILLS, BiomeKeys.GIANT_SPRUCE_TAIGA_HILLS),
                GenerationStep.Feature.VEGETAL_DECORATION, sorrelPatch);

        RegistryKey<ConfiguredFeature<?, ?>> minerPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "miner_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, minerPatch.getValue(), MINER_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.TAIGA, BiomeKeys.TAIGA_HILLS, BiomeKeys.TAIGA_MOUNTAINS, BiomeKeys.GIANT_TREE_TAIGA, BiomeKeys.GIANT_SPRUCE_TAIGA, BiomeKeys.GIANT_TREE_TAIGA_HILLS, BiomeKeys.GIANT_SPRUCE_TAIGA_HILLS),
                GenerationStep.Feature.VEGETAL_DECORATION, minerPatch);

        RegistryKey<ConfiguredFeature<?, ?>> dandelionPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "dandelion_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, dandelionPatch.getValue(), DANDELION_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FOREST, BiomeKeys.FLOWER_FOREST, BiomeKeys.TALL_BIRCH_FOREST, BiomeKeys.BIRCH_FOREST_HILLS, BiomeKeys.DARK_FOREST_HILLS, BiomeKeys.BIRCH_FOREST, BiomeKeys.DARK_FOREST, BiomeKeys.TALL_BIRCH_HILLS, BiomeKeys.PLAINS, BiomeKeys.SUNFLOWER_PLAINS, BiomeKeys.TAIGA, BiomeKeys.TAIGA_HILLS, BiomeKeys.TAIGA_MOUNTAINS, BiomeKeys.GIANT_TREE_TAIGA, BiomeKeys.GIANT_SPRUCE_TAIGA, BiomeKeys.GIANT_TREE_TAIGA_HILLS, BiomeKeys.GIANT_SPRUCE_TAIGA_HILLS),
                GenerationStep.Feature.VEGETAL_DECORATION, dandelionPatch);

        RegistryKey<ConfiguredFeature<?, ?>> onionPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "onion_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, onionPatch.getValue(), ONION_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MOUNTAINS, BiomeKeys.GRAVELLY_MOUNTAINS, BiomeKeys.WOODED_MOUNTAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, onionPatch);

        //found in every biome except snow
        RegistryKey<ConfiguredFeature<?, ?>> bushPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "bush_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, bushPatch.getValue(), BUSH_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BADLANDS_PLATEAU, BiomeKeys.BADLANDS_PLATEAU, BiomeKeys.BAMBOO_JUNGLE_HILLS, BiomeKeys.BAMBOO_JUNGLE,BiomeKeys.BIRCH_FOREST, BiomeKeys.BIRCH_FOREST_HILLS, BiomeKeys.BEACH, BiomeKeys.DESERT_LAKES, BiomeKeys.DESERT_HILLS, BiomeKeys.DESERT, BiomeKeys.DARK_FOREST_HILLS, BiomeKeys.DARK_FOREST, BiomeKeys.DEEP_WARM_OCEAN, BiomeKeys.DEEP_OCEAN, BiomeKeys.DEEP_LUKEWARM_OCEAN, BiomeKeys.ERODED_BADLANDS, BiomeKeys.FLOWER_FOREST, BiomeKeys.FOREST, BiomeKeys.GIANT_SPRUCE_TAIGA_HILLS, BiomeKeys.GIANT_TREE_TAIGA_HILLS, BiomeKeys.GIANT_SPRUCE_TAIGA, BiomeKeys.GIANT_TREE_TAIGA, BiomeKeys.GRAVELLY_MOUNTAINS, BiomeKeys.JUNGLE, BiomeKeys.JUNGLE_EDGE, BiomeKeys.JUNGLE_HILLS,BiomeKeys.MODIFIED_WOODED_BADLANDS_PLATEAU,BiomeKeys.MODIFIED_JUNGLE,BiomeKeys.MODIFIED_BADLANDS_PLATEAU,BiomeKeys.MODIFIED_GRAVELLY_MOUNTAINS,BiomeKeys.MODIFIED_JUNGLE_EDGE,BiomeKeys.OCEAN,BiomeKeys.PLAINS,BiomeKeys.RIVER,BiomeKeys.SHATTERED_SAVANNA_PLATEAU,BiomeKeys.SHATTERED_SAVANNA,BiomeKeys.SAVANNA_PLATEAU,BiomeKeys.SAVANNA,BiomeKeys.SWAMP_HILLS,BiomeKeys.SWAMP,BiomeKeys.STONE_SHORE,BiomeKeys.SUNFLOWER_PLAINS,BiomeKeys.TAIGA_MOUNTAINS,BiomeKeys.TAIGA_HILLS,BiomeKeys.TAIGA,BiomeKeys.TALL_BIRCH_HILLS,BiomeKeys.TALL_BIRCH_FOREST,BiomeKeys.WOODED_MOUNTAINS,BiomeKeys.WOODED_HILLS), GenerationStep.Feature.VEGETAL_DECORATION, bushPatch);

        RegistryKey<ConfiguredFeature<?, ?>> sproutPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "sprout_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, sproutPatch.getValue(), SPROUT_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BADLANDS_PLATEAU, BiomeKeys.BADLANDS_PLATEAU, BiomeKeys.BAMBOO_JUNGLE_HILLS, BiomeKeys.BAMBOO_JUNGLE,BiomeKeys.BIRCH_FOREST, BiomeKeys.BIRCH_FOREST_HILLS, BiomeKeys.BEACH, BiomeKeys.DESERT_LAKES, BiomeKeys.DESERT_HILLS, BiomeKeys.DESERT, BiomeKeys.DARK_FOREST_HILLS, BiomeKeys.DARK_FOREST, BiomeKeys.DEEP_WARM_OCEAN, BiomeKeys.DEEP_OCEAN, BiomeKeys.DEEP_LUKEWARM_OCEAN, BiomeKeys.ERODED_BADLANDS, BiomeKeys.FLOWER_FOREST, BiomeKeys.FOREST, BiomeKeys.GIANT_SPRUCE_TAIGA_HILLS, BiomeKeys.GIANT_TREE_TAIGA_HILLS, BiomeKeys.GIANT_SPRUCE_TAIGA, BiomeKeys.GIANT_TREE_TAIGA, BiomeKeys.GRAVELLY_MOUNTAINS, BiomeKeys.JUNGLE, BiomeKeys.JUNGLE_EDGE, BiomeKeys.JUNGLE_HILLS,BiomeKeys.MODIFIED_WOODED_BADLANDS_PLATEAU,BiomeKeys.MODIFIED_JUNGLE,BiomeKeys.MODIFIED_BADLANDS_PLATEAU,BiomeKeys.MODIFIED_GRAVELLY_MOUNTAINS,BiomeKeys.MODIFIED_JUNGLE_EDGE,BiomeKeys.OCEAN,BiomeKeys.PLAINS,BiomeKeys.RIVER,BiomeKeys.SHATTERED_SAVANNA_PLATEAU,BiomeKeys.SHATTERED_SAVANNA,BiomeKeys.SAVANNA_PLATEAU,BiomeKeys.SAVANNA,BiomeKeys.SWAMP_HILLS,BiomeKeys.SWAMP,BiomeKeys.STONE_SHORE,BiomeKeys.SUNFLOWER_PLAINS,BiomeKeys.TAIGA_MOUNTAINS,BiomeKeys.TAIGA_HILLS,BiomeKeys.TAIGA,BiomeKeys.TALL_BIRCH_HILLS,BiomeKeys.TALL_BIRCH_FOREST,BiomeKeys.WOODED_MOUNTAINS,BiomeKeys.WOODED_HILLS), GenerationStep.Feature.VEGETAL_DECORATION, sproutPatch);

        //found in jungles
        RegistryKey<ConfiguredFeature<?, ?>> junglePatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "jungle_cap_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, junglePatch.getValue(), JUNGLE_CAP_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.JUNGLE, BiomeKeys.JUNGLE_EDGE, BiomeKeys.JUNGLE_HILLS, BiomeKeys.BAMBOO_JUNGLE_HILLS, BiomeKeys.MODIFIED_JUNGLE_EDGE, BiomeKeys.BAMBOO_JUNGLE, BiomeKeys.MODIFIED_JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, junglePatch);

        //found in jungles and swamps
        RegistryKey<ConfiguredFeature<?, ?>> jsbushPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "js_bush_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, jsbushPatch.getValue(), SWAMP_BUSH_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.JUNGLE, BiomeKeys.JUNGLE_EDGE, BiomeKeys.JUNGLE_HILLS, BiomeKeys.BAMBOO_JUNGLE_HILLS, BiomeKeys.MODIFIED_JUNGLE_EDGE, BiomeKeys.BAMBOO_JUNGLE, BiomeKeys.MODIFIED_JUNGLE, BiomeKeys.SWAMP, BiomeKeys.SWAMP_HILLS),
                GenerationStep.Feature.VEGETAL_DECORATION, jsbushPatch);

        RegistryKey<ConfiguredFeature<?, ?>> rockPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "rock_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, rockPatch.getValue(), ROCK_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BADLANDS_PLATEAU, BiomeKeys.BADLANDS_PLATEAU, BiomeKeys.BAMBOO_JUNGLE_HILLS, BiomeKeys.BAMBOO_JUNGLE,BiomeKeys.BIRCH_FOREST, BiomeKeys.BIRCH_FOREST_HILLS, BiomeKeys.BEACH, BiomeKeys.DESERT_LAKES, BiomeKeys.DESERT_HILLS, BiomeKeys.DESERT, BiomeKeys.DARK_FOREST_HILLS, BiomeKeys.DARK_FOREST, BiomeKeys.DEEP_WARM_OCEAN, BiomeKeys.DEEP_OCEAN, BiomeKeys.DEEP_LUKEWARM_OCEAN, BiomeKeys.ERODED_BADLANDS, BiomeKeys.FLOWER_FOREST, BiomeKeys.FOREST, BiomeKeys.GIANT_SPRUCE_TAIGA_HILLS, BiomeKeys.GIANT_TREE_TAIGA_HILLS, BiomeKeys.GIANT_SPRUCE_TAIGA, BiomeKeys.GIANT_TREE_TAIGA, BiomeKeys.GRAVELLY_MOUNTAINS, BiomeKeys.JUNGLE, BiomeKeys.JUNGLE_EDGE, BiomeKeys.JUNGLE_HILLS,BiomeKeys.MODIFIED_WOODED_BADLANDS_PLATEAU,BiomeKeys.MODIFIED_JUNGLE,BiomeKeys.MODIFIED_BADLANDS_PLATEAU,BiomeKeys.MODIFIED_GRAVELLY_MOUNTAINS,BiomeKeys.MODIFIED_JUNGLE_EDGE,BiomeKeys.OCEAN,BiomeKeys.PLAINS,BiomeKeys.RIVER,BiomeKeys.SHATTERED_SAVANNA_PLATEAU,BiomeKeys.SHATTERED_SAVANNA,BiomeKeys.SAVANNA_PLATEAU,BiomeKeys.SAVANNA,BiomeKeys.SWAMP_HILLS,BiomeKeys.SWAMP,BiomeKeys.STONE_SHORE,BiomeKeys.SUNFLOWER_PLAINS,BiomeKeys.TAIGA_MOUNTAINS,BiomeKeys.TAIGA_HILLS,BiomeKeys.TAIGA,BiomeKeys.TALL_BIRCH_HILLS,BiomeKeys.TALL_BIRCH_FOREST,BiomeKeys.WOODED_MOUNTAINS,BiomeKeys.WOODED_HILLS), GenerationStep.Feature.VEGETAL_DECORATION, rockPatch);

        //found in snowy biomes
        RegistryKey<ConfiguredFeature<?, ?>> snowBushPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "snow_bush_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, snowBushPatch.getValue(), SNOW_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SNOWY_TAIGA,BiomeKeys.SNOWY_TAIGA_HILLS,BiomeKeys.SNOWY_BEACH,BiomeKeys.SNOWY_TAIGA_MOUNTAINS,BiomeKeys.SNOWY_MOUNTAINS,BiomeKeys.SNOWY_TUNDRA, BiomeKeys.ICE_SPIKES),
                GenerationStep.Feature.VEGETAL_DECORATION, snowBushPatch);

        RegistryKey<ConfiguredFeature<?, ?>> snowRockPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "snow_rock_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, snowRockPatch.getValue(), SNOW_ROCK_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SNOWY_TAIGA,BiomeKeys.SNOWY_TAIGA_HILLS,BiomeKeys.SNOWY_BEACH,BiomeKeys.SNOWY_TAIGA_MOUNTAINS,BiomeKeys.SNOWY_MOUNTAINS,BiomeKeys.SNOWY_TUNDRA, BiomeKeys.ICE_SPIKES),
                GenerationStep.Feature.VEGETAL_DECORATION, snowRockPatch);

        //these three share the same biomes, keep the values low so they don't overpopulate them!
        //found in forests
        RegistryKey<ConfiguredFeature<?, ?>> rosePatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "rose_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, rosePatch.getValue(), ROSE_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST, BiomeKeys.DARK_FOREST_HILLS, BiomeKeys.DARK_FOREST_HILLS, BiomeKeys.BIRCH_FOREST, BiomeKeys.BIRCH_FOREST_HILLS, BiomeKeys.TALL_BIRCH_FOREST, BiomeKeys.TALL_BIRCH_HILLS, BiomeKeys.FOREST, BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, rosePatch);

        RegistryKey<ConfiguredFeature<?, ?>> lilacPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "lilac_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, lilacPatch.getValue(), LILAC_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST, BiomeKeys.DARK_FOREST_HILLS, BiomeKeys.DARK_FOREST_HILLS, BiomeKeys.BIRCH_FOREST, BiomeKeys.BIRCH_FOREST_HILLS, BiomeKeys.TALL_BIRCH_FOREST, BiomeKeys.TALL_BIRCH_HILLS, BiomeKeys.FOREST, BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, lilacPatch);

        RegistryKey<ConfiguredFeature<?, ?>> peonyPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "peony_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, peonyPatch.getValue(), PEONY_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST, BiomeKeys.DARK_FOREST_HILLS, BiomeKeys.DARK_FOREST_HILLS, BiomeKeys.BIRCH_FOREST, BiomeKeys.BIRCH_FOREST_HILLS, BiomeKeys.TALL_BIRCH_FOREST, BiomeKeys.TALL_BIRCH_HILLS, BiomeKeys.FOREST, BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, peonyPatch);

        //found in cold forests and jungles
        RegistryKey<ConfiguredFeature<?, ?>> fernPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "fern_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, fernPatch.getValue(), FERN_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.JUNGLE_HILLS, BiomeKeys.JUNGLE, BiomeKeys.BAMBOO_JUNGLE_HILLS, BiomeKeys.BAMBOO_JUNGLE_HILLS, BiomeKeys.MODIFIED_JUNGLE, BiomeKeys.TAIGA, BiomeKeys.TAIGA_HILLS, BiomeKeys.TAIGA_MOUNTAINS, BiomeKeys.SNOWY_TAIGA_HILLS, BiomeKeys.SNOWY_TAIGA, BiomeKeys.GIANT_SPRUCE_TAIGA, BiomeKeys.GIANT_TREE_TAIGA, BiomeKeys.GIANT_SPRUCE_TAIGA_HILLS, BiomeKeys.GIANT_TREE_TAIGA_HILLS),
                GenerationStep.Feature.VEGETAL_DECORATION, fernPatch);

        //found in deserts
        RegistryKey<ConfiguredFeature<?, ?>> tumblePatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "tumbleweed_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, tumblePatch.getValue(), TUMBLE_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DESERT, BiomeKeys.DESERT_HILLS, BiomeKeys.DESERT_LAKES, BiomeKeys.BADLANDS, BiomeKeys.BADLANDS_PLATEAU, BiomeKeys.ERODED_BADLANDS, BiomeKeys.WOODED_BADLANDS_PLATEAU, BiomeKeys.MODIFIED_WOODED_BADLANDS_PLATEAU), GenerationStep.Feature.VEGETAL_DECORATION, tumblePatch);

        RegistryKey<ConfiguredFeature<?, ?>> smallPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "small_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, smallPatch.getValue(), CACTUS_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DESERT, BiomeKeys.DESERT_HILLS, BiomeKeys.DESERT_LAKES, BiomeKeys.BADLANDS, BiomeKeys.BADLANDS_PLATEAU, BiomeKeys.ERODED_BADLANDS, BiomeKeys.WOODED_BADLANDS_PLATEAU, BiomeKeys.MODIFIED_WOODED_BADLANDS_PLATEAU), GenerationStep.Feature.VEGETAL_DECORATION, smallPatch);

        RegistryKey<ConfiguredFeature<?, ?>> alivePatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "alive_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, alivePatch.getValue(), ALIVE_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SAVANNA, BiomeKeys.SAVANNA_PLATEAU, BiomeKeys.SHATTERED_SAVANNA, BiomeKeys.SHATTERED_SAVANNA_PLATEAU),
                GenerationStep.Feature.VEGETAL_DECORATION, alivePatch);

        RegistryKey<ConfiguredFeature<?, ?>> aliveTallPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "alive_patch_tall"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, aliveTallPatch.getValue(), ALIVE_PATCH_TALL);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SAVANNA, BiomeKeys.SAVANNA_PLATEAU, BiomeKeys.SHATTERED_SAVANNA, BiomeKeys.SHATTERED_SAVANNA_PLATEAU),
                GenerationStep.Feature.VEGETAL_DECORATION, aliveTallPatch);

        RegistryKey<ConfiguredFeature<?, ?>> deadPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "dead_patch_tall"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, deadPatch.getValue(), DEAD_PATCH_TALL);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SWAMP, BiomeKeys.SWAMP_HILLS, BiomeKeys.DESERT, BiomeKeys.DESERT_HILLS, BiomeKeys.DESERT_LAKES, BiomeKeys.BADLANDS, BiomeKeys.BADLANDS_PLATEAU, BiomeKeys.ERODED_BADLANDS, BiomeKeys.WOODED_BADLANDS_PLATEAU, BiomeKeys.MODIFIED_WOODED_BADLANDS_PLATEAU),
                GenerationStep.Feature.VEGETAL_DECORATION, deadPatch);

        //found in podzol
        RegistryKey<ConfiguredFeature<?, ?>> bitterPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "bitter_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, bitterPatch.getValue(), BITTER_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.JUNGLE_HILLS, BiomeKeys.JUNGLE, BiomeKeys.BAMBOO_JUNGLE_HILLS, BiomeKeys.BAMBOO_JUNGLE_HILLS, BiomeKeys.MODIFIED_JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, bitterPatch);

        //found in shattered savannas
        RegistryKey<ConfiguredFeature<?, ?>> tomatoPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "tomato_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, tomatoPatch.getValue(), TOMATO_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SHATTERED_SAVANNA, BiomeKeys.SHATTERED_SAVANNA_PLATEAU), GenerationStep.Feature.VEGETAL_DECORATION, tomatoPatch);
    
        var ranch = new RangeDecoratorConfig(ConstantHeightProvider.create(YOffset.fixed(62))); // 62 is where a sea level with water block inside.
        var spread = Decorator.RANGE.configure(ranch).spreadHorizontally(); 
        
        // If you want to config reeds counts or something, check the ReedPatchFeature class.
        var registryKey = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(MOD_ID, "reed_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, registryKey.getValue(), REED_PATCH.configure(DefaultFeatureConfig.INSTANCE).decorate(spread));
        var categories = BiomeSelectors.categories(Category.RIVER, Category.PLAINS, Category.SWAMP, Category.FOREST, Category.JUNGLE, Category.TAIGA);
        BiomeModifications.addFeature(categories, GenerationStep.Feature.VEGETAL_DECORATION, registryKey);
    }
}
