package net.linkle.valley.Registry.Initializers.ConfiguredFeatures;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.linkle.valley.ValleyMain;
import net.linkle.valley.Registry.Blocks.Plants.Bushes.BerryBushBlock;
import net.linkle.valley.Registry.Initializers.ConfiguredFeatures.Gen.ReedPatchFeature;
import net.linkle.valley.Registry.Utils.SimpleConfig;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.biome.Biome.Precipitation;
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

import java.util.function.Predicate;

import static net.linkle.valley.Registry.Initializers.Plants.*;

public class OverworldPlantConfiguredFeatures {
    public static final ReedPatchFeature REED_PATCH = new ReedPatchFeature();    
    
    public static final ConfiguredFeature<?, ?> BUSH_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(BUSH
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(7).build());

    //new
    public static final ConfiguredFeature<?, ?> BOX_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(HEDGE
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(3).build());

    public static final ConfiguredFeature<?, ?> HOLLY_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(HOLLY_BUSH
                    .getDefaultState().with(BerryBushBlock.AGE, 2)), SimpleBlockPlacer.INSTANCE)).tries(1).build());

    public static final ConfiguredFeature<?, ?> MOREL_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(MOREL
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(3).build());

    public static final ConfiguredFeature<?, ?> HONEYCLUSTER_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(HONEY_CLUSTER
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(2).build());

    public static final ConfiguredFeature<?, ?> PAN_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(PANFLOWER
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(1).build());

    public static final ConfiguredFeature<?, ?> CROCUS_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(CROCUS
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(3).build());

    public static final ConfiguredFeature<?, ?> TAPROOT_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(TAPROOTS
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(1).build());

    public static final ConfiguredFeature<?, ?> HERB_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(HERBS
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(1).build());

    public static final ConfiguredFeature<?, ?> FLOWERING_CACTUS_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(FLOWERING_CACTUS
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(3).build());

    //

    public static final ConfiguredFeature<?, ?> SPROUT_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(SPROUT
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(3).build());

    public static final ConfiguredFeature<?, ?> ROSE_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(ROSEBUSH
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(1).build());

    public static final ConfiguredFeature<?, ?> LILAC_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(LILACBUSH
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(1).build());

    public static final ConfiguredFeature<?, ?> PEONY_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(PEONYBUSH
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(1).build());

    public static final ConfiguredFeature<?, ?> TUMBLE_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(TUMBLE_WEED
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(1).build());

    public static final ConfiguredFeature<?, ?> CACTUS_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(SMALL_CACTUS
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(2).build());

    public static final ConfiguredFeature<?, ?> ROCK_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(ROCK_PILE
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(8).build());

    public static final ConfiguredFeature<?, ?> SNOW_ROCK_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(SNOW_ROCK_PILE
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(10).build());

    public static final ConfiguredFeature<?, ?> ALIVE_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(BUSH_ALIVE
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(10).build());

    public static final ConfiguredFeature<?, ?> BITTER_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(BITTER_BERRY_BUSH
                    .getDefaultState().with(BerryBushBlock.AGE, 3)), SimpleBlockPlacer.INSTANCE)).tries(2).build());

    public static final ConfiguredFeature<?, ?> TOMATO_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(TOMATO_BUSH
                    .getDefaultState().with(BerryBushBlock.AGE, 2)), SimpleBlockPlacer.INSTANCE)).tries(1).build());

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
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(2).build());

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
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(2).build());

    public static final ConfiguredFeature<?, ?> SORREL_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(REDWOOD_SORREL
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(5).build());

    public static final ConfiguredFeature<?, ?> DANDELION_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(DANDELION_PUFF
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(2).build());

    public static final ConfiguredFeature<?, ?> JUNGLE_CAP_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(JUNGLE_CAP
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(1).build());

    public static final ConfiguredFeature<?, ?> SWAMP_BUSH_PATCH = Feature.RANDOM_PATCH
            .configure((new RandomPatchFeatureConfig.Builder (new SimpleBlockStateProvider(SWAMP_BUSH
                    .getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(7).build());

    public static void initialize(SimpleConfig config) {
        config.script("disable-features-gen", "Disable world gen features like plants, flowers, crops, and rocks.");
        if (config.get("disable-features-gen", false)) {
            return;
        }
        
        Registry.register(Registry.FEATURE, new Identifier(ValleyMain.MOD_ID, "reed_patch"), REED_PATCH);
        
        var vegetal = GenerationStep.Feature.UNDERGROUND_ORES;
        Predicate<BiomeSelectionContext> snowOnly;
        snowOnly = context -> context.getBiome().getPrecipitation() == Precipitation.SNOW;
        
        //wild patches
        RegistryKey<ConfiguredFeature<?, ?>> wheatPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "wheat_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, wheatPatch.getValue(), WHEAT_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.categories(Category.PLAINS), vegetal, wheatPatch);

        RegistryKey<ConfiguredFeature<?, ?>> carrotPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "carrot_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, carrotPatch.getValue(), CARROT_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST, BiomeKeys.DARK_FOREST_HILLS),
                vegetal, carrotPatch);

        RegistryKey<ConfiguredFeature<?, ?>> beetPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "beet_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, beetPatch.getValue(), BEET_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BIRCH_FOREST, BiomeKeys.BIRCH_FOREST_HILLS, BiomeKeys.TALL_BIRCH_FOREST, BiomeKeys.TALL_BIRCH_HILLS), vegetal, beetPatch);

        RegistryKey<ConfiguredFeature<?, ?>> potatoPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "potato_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, potatoPatch.getValue(), POTATO_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE, Category.SAVANNA), vegetal, potatoPatch);

        RegistryKey<ConfiguredFeature<?, ?>> willowPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "willow_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, willowPatch.getValue(), WILLOW_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.categories(Category.SWAMP, Category.JUNGLE), vegetal, willowPatch);

        RegistryKey<ConfiguredFeature<?, ?>> ribbonPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "ribbon_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ribbonPatch.getValue(), RIBBON_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.categories(Category.SWAMP, Category.JUNGLE), vegetal, ribbonPatch);

        RegistryKey<ConfiguredFeature<?, ?>> ofPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "orange_fern_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ofPatch.getValue(), ORANGE_FERN_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE), vegetal, ofPatch);

        RegistryKey<ConfiguredFeature<?, ?>> obPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "orange_beauty_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, obPatch.getValue(), ORANGE_BEAUTY_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE), vegetal, obPatch);

        RegistryKey<ConfiguredFeature<?, ?>> bdPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "black_dahlia_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, bdPatch.getValue(), DAHLIA_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST), vegetal, bdPatch);

        RegistryKey<ConfiguredFeature<?, ?>> lPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "lavender_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, lPatch.getValue(), LAVENDER_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST), vegetal, lPatch);

        RegistryKey<ConfiguredFeature<?, ?>> sorrelPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "sorrel_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, sorrelPatch.getValue(), SORREL_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.GIANT_TREE_TAIGA, BiomeKeys.GIANT_SPRUCE_TAIGA, BiomeKeys.GIANT_TREE_TAIGA_HILLS, BiomeKeys.GIANT_SPRUCE_TAIGA_HILLS), vegetal, sorrelPatch);

        RegistryKey<ConfiguredFeature<?, ?>> dandelionPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "dandelion_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, dandelionPatch.getValue(), DANDELION_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.categories(Category.FOREST, Category.PLAINS, Category.TAIGA), vegetal, dandelionPatch);

        //herbs and taproots
        RegistryKey<ConfiguredFeature<?, ?>> herbsPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "herbs_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, herbsPatch.getValue(), HERB_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), vegetal, herbsPatch);

        RegistryKey<ConfiguredFeature<?, ?>> taprootsPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "taproots_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, taprootsPatch.getValue(), TAPROOT_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), vegetal, taprootsPatch);

        //found in redwoods
        RegistryKey<ConfiguredFeature<?, ?>> hedgePatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "boxwood_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, hedgePatch.getValue(), BOX_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.GIANT_TREE_TAIGA_HILLS, BiomeKeys.GIANT_SPRUCE_TAIGA_HILLS, BiomeKeys.GIANT_SPRUCE_TAIGA, BiomeKeys.GIANT_TREE_TAIGA), vegetal, hedgePatch);

        RegistryKey<ConfiguredFeature<?, ?>> crocusPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "crocus_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, crocusPatch.getValue(), CROCUS_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.GIANT_TREE_TAIGA_HILLS, BiomeKeys.GIANT_SPRUCE_TAIGA_HILLS, BiomeKeys.GIANT_SPRUCE_TAIGA, BiomeKeys.GIANT_TREE_TAIGA), vegetal, crocusPatch);


        RegistryKey<ConfiguredFeature<?, ?>> hollyPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "holly_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, hollyPatch.getValue(), HOLLY_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.GIANT_TREE_TAIGA_HILLS, BiomeKeys.GIANT_SPRUCE_TAIGA_HILLS, BiomeKeys.GIANT_SPRUCE_TAIGA, BiomeKeys.GIANT_TREE_TAIGA), vegetal, hollyPatch);

        //found in dark woods
        RegistryKey<ConfiguredFeature<?, ?>> morelPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "morel_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, morelPatch.getValue(), MOREL_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST, BiomeKeys.DARK_FOREST_HILLS), vegetal, morelPatch);

        //found in every biome except snow
        RegistryKey<ConfiguredFeature<?, ?>> bushPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "bush_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, bushPatch.getValue(), BUSH_PATCH);
        BiomeModifications.addFeature(c -> !snowOnly.test(c), GenerationStep.Feature.VEGETAL_DECORATION, bushPatch);

        RegistryKey<ConfiguredFeature<?, ?>> sproutPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "sprout_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, sproutPatch.getValue(), SPROUT_PATCH);
        BiomeModifications.addFeature(c -> !snowOnly.test(c), vegetal, sproutPatch);

        //found in jungles
        RegistryKey<ConfiguredFeature<?, ?>> junglePatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "jungle_cap_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, junglePatch.getValue(), JUNGLE_CAP_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE), vegetal, junglePatch);

        RegistryKey<ConfiguredFeature<?, ?>> panPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "panflower_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, panPatch.getValue(), PAN_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE), vegetal, panPatch);

        //found in jungles and swamps
        RegistryKey<ConfiguredFeature<?, ?>> jsbushPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "js_bush_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, jsbushPatch.getValue(), SWAMP_BUSH_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE, Category.SWAMP), vegetal, jsbushPatch);

        RegistryKey<ConfiguredFeature<?, ?>> rockPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "rock_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, rockPatch.getValue(), ROCK_PATCH);
        BiomeModifications.addFeature(c -> !snowOnly.test(c), GenerationStep.Feature.VEGETAL_DECORATION, rockPatch);

        //found in snowy biomes
        RegistryKey<ConfiguredFeature<?, ?>> snowBushPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "snow_bush_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, snowBushPatch.getValue(), SNOW_PATCH);
        BiomeModifications.addFeature(snowOnly, vegetal, snowBushPatch);

        RegistryKey<ConfiguredFeature<?, ?>> snowRockPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "snow_rock_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, snowRockPatch.getValue(), SNOW_ROCK_PATCH);
        BiomeModifications.addFeature(snowOnly, vegetal, snowRockPatch);

        //these three share the same biomes, keep the values low so they don't overpopulate them!
        //found in forests
        RegistryKey<ConfiguredFeature<?, ?>> rosePatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "rose_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, rosePatch.getValue(), ROSE_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.categories(Category.FOREST), vegetal, rosePatch);

        RegistryKey<ConfiguredFeature<?, ?>> honeyPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "honey_cluster_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, honeyPatch.getValue(), HONEYCLUSTER_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.categories(Category.FOREST), vegetal, honeyPatch);

        RegistryKey<ConfiguredFeature<?, ?>> lilacPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "lilac_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, lilacPatch.getValue(), LILAC_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.categories(Category.FOREST), vegetal, lilacPatch);

        RegistryKey<ConfiguredFeature<?, ?>> peonyPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "peony_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, peonyPatch.getValue(), PEONY_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.categories(Category.FOREST), vegetal, peonyPatch);

        //found in deserts
        RegistryKey<ConfiguredFeature<?, ?>> tumblePatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "tumbleweed_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, tumblePatch.getValue(), TUMBLE_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.categories(Category.DESERT, Category.MESA), vegetal, tumblePatch);

        RegistryKey<ConfiguredFeature<?, ?>> floweringPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "flowering_cactus_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, floweringPatch.getValue(), FLOWERING_CACTUS_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.categories(Category.DESERT, Category.MESA), vegetal, floweringPatch);

        RegistryKey<ConfiguredFeature<?, ?>> smallPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "small_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, smallPatch.getValue(), CACTUS_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.categories(Category.DESERT, Category.MESA), vegetal, smallPatch);

        RegistryKey<ConfiguredFeature<?, ?>> alivePatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "alive_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, alivePatch.getValue(), ALIVE_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.categories(Category.SAVANNA), vegetal, alivePatch);

        //found in podzol
        RegistryKey<ConfiguredFeature<?, ?>> bitterPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "bitter_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, bitterPatch.getValue(), BITTER_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE), vegetal, bitterPatch);

        //found in shattered savannas
        RegistryKey<ConfiguredFeature<?, ?>> tomatoPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "tomato_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, tomatoPatch.getValue(), TOMATO_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SHATTERED_SAVANNA, BiomeKeys.SHATTERED_SAVANNA_PLATEAU), vegetal, tomatoPatch);
    
        var ranch = new RangeDecoratorConfig(ConstantHeightProvider.create(YOffset.fixed(62))); // 62 is where a sea level with water block inside.
        var spread = Decorator.RANGE.configure(ranch).spreadHorizontally(); 
        
        // If you want to config reeds counts or something, check the ReedPatchFeature class.
        var registryKey = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(MOD_ID, "reed_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, registryKey.getValue(), REED_PATCH.configure(DefaultFeatureConfig.INSTANCE).decorate(spread));
        var categories = BiomeSelectors.categories(Category.RIVER, Category.PLAINS, Category.SWAMP, Category.FOREST, Category.JUNGLE, Category.TAIGA);
        BiomeModifications.addFeature(categories, vegetal, registryKey);
    }
}
