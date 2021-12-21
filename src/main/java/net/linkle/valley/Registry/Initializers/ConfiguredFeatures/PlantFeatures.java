package net.linkle.valley.Registry.Initializers.ConfiguredFeatures;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.linkle.valley.ValleyMain;
import net.linkle.valley.Registry.Blocks.Plants.Bushes.BerryBushBlock;
import net.linkle.valley.Registry.Initializers.ConfiguredFeatures.Gen.ReedPatchFeature;
import net.linkle.valley.Registry.Utils.SimpleConfig;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
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

public class PlantFeatures {
    public static final ReedPatchFeature REED_PATCH = new ReedPatchFeature();    
    
    private static final RegistryKey<ConfiguredFeature<?, ?>> BUSH_PATCH = create("bush_patch", BUSH, 7);
    private static final RegistryKey<ConfiguredFeature<?, ?>> HOLLY_PATCH = create("holly_patch", HOLLY_BUSH.getDefaultState().with(BerryBushBlock.AGE, 2), 1);
    private static final RegistryKey<ConfiguredFeature<?, ?>> MOREL_PATCH = create("morel_patch", MOREL, 3);
    private static final RegistryKey<ConfiguredFeature<?, ?>> HONEYCLUSTER_PATCH = create("honey_cluster_patch", HONEY_CLUSTER, 2);
    private static final RegistryKey<ConfiguredFeature<?, ?>> PAN_PATCH = create("panflower_patch", PANFLOWER, 1);
    private static final RegistryKey<ConfiguredFeature<?, ?>> CROCUS_PATCH = create("crocus_patch", CROCUS, 3);
    private static final RegistryKey<ConfiguredFeature<?, ?>> TAPROOT_PATCH = create("taproots_patch", TAPROOTS, 1);
    private static final RegistryKey<ConfiguredFeature<?, ?>> FLOWERING_CACTUS_PATCH = create("flowering_cactus_patch", FLOWERING_CACTUS, 3);
    private static final RegistryKey<ConfiguredFeature<?, ?>> SPROUT_PATCH = create("sprout_patch", SPROUT, 3);
    private static final RegistryKey<ConfiguredFeature<?, ?>> ROSE_PATCH = create("rose_patch", ROSEBUSH, 1);
    private static final RegistryKey<ConfiguredFeature<?, ?>> LILAC_PATCH = create("lilac_patch", LILACBUSH, 1);
    private static final RegistryKey<ConfiguredFeature<?, ?>> PEONY_PATCH = create("peony_patch", PEONYBUSH, 1);
    private static final RegistryKey<ConfiguredFeature<?, ?>> TUMBLE_PATCH = create("tumbleweed_patch", TUMBLE_WEED, 1);
    private static final RegistryKey<ConfiguredFeature<?, ?>> CACTUS_PATCH = create("small_patch", SMALL_CACTUS, 2);
    private static final RegistryKey<ConfiguredFeature<?, ?>> ROCK_PATCH = create("rock_patch", ROCK_PILE, 8);
    private static final RegistryKey<ConfiguredFeature<?, ?>> SNOW_ROCK_PATCH = create("noname", SNOW_ROCK_PILE, 10);
    private static final RegistryKey<ConfiguredFeature<?, ?>> ALIVE_PATCH = create("alive_patch", BUSH_ALIVE, 10);
    private static final RegistryKey<ConfiguredFeature<?, ?>> BITTER_PATCH = create("bitter_patch", BITTER_BERRY_BUSH.getDefaultState().with(BerryBushBlock.AGE, 3), 2);
    private static final RegistryKey<ConfiguredFeature<?, ?>> TOMATO_PATCH = create("tomato_patch", TOMATO_BUSH.getDefaultState().with(BerryBushBlock.AGE, 2), 1);
    private static final RegistryKey<ConfiguredFeature<?, ?>> SNOW_PATCH = create("snow_bush_patch", SNOW_BUSH, 10);
    private static final RegistryKey<ConfiguredFeature<?, ?>> WHEAT_PATCH = create("wheat_patch", WILD_WHEAT, 1);
    private static final RegistryKey<ConfiguredFeature<?, ?>> CARROT_PATCH = create("carrot_patch", WILD_CARROT, 1);
    private static final RegistryKey<ConfiguredFeature<?, ?>> BEET_PATCH = create("beet_patch", WILD_BEET, 1);
    private static final RegistryKey<ConfiguredFeature<?, ?>> POTATO_PATCH = create("potato_patch", WILD_POTATO, 1);
    private static final RegistryKey<ConfiguredFeature<?, ?>> WILLOW_PATCH = create("willow_patch", WEAPING_SWAMP_WILLOW, 2);
    private static final RegistryKey<ConfiguredFeature<?, ?>> RIBBON_PATCH = create("ribbon_patch", SWAMP_RIBBON, 12);
    private static final RegistryKey<ConfiguredFeature<?, ?>> DAHLIA_PATCH = create("black_dahlia_patch", BLACK_DAHLIA, 8);
    private static final RegistryKey<ConfiguredFeature<?, ?>> LAVENDER_PATCH = create("lavender_patch", LAVENDER, 8);
    private static final RegistryKey<ConfiguredFeature<?, ?>> ORANGE_FERN_PATCH = create("orange_fern_patch", ORANGE_FERN, 5);
    private static final RegistryKey<ConfiguredFeature<?, ?>> ORANGE_BEAUTY_PATCH = create("orange_beauty_patch", ORANGE_BEAUTY, 2);
    private static final RegistryKey<ConfiguredFeature<?, ?>> SORREL_PATCH = create("sorrel_patch", REDWOOD_SORREL, 5);
    private static final RegistryKey<ConfiguredFeature<?, ?>> DANDELION_PATCH = create("dandelion_patch", DANDELION_PUFF, 2);
    private static final RegistryKey<ConfiguredFeature<?, ?>> JUNGLE_CAP_PATCH = create("jungle_cap_patch", JUNGLE_CAP, 1);
    private static final RegistryKey<ConfiguredFeature<?, ?>> SWAMP_BUSH_PATCH = create("js_bush_patch", SWAMP_BUSH, 7);
    private static final RegistryKey<ConfiguredFeature<?, ?>> HERB_PATCH = create("herbs_patch", HERBS, 1);

    public static void initialize(SimpleConfig config) {
        config.script("disable-features-gen", "Disable world gen features like plants, flowers, crops, and rocks.");
        if (config.get("disable-features-gen", false)) {
            return;
        }
        
        Registry.register(Registry.FEATURE, new Identifier(ValleyMain.MOD_ID, "reed_patch"), REED_PATCH);
        
        var vegetal = GenerationStep.Feature.VEGETAL_DECORATION;
        Predicate<BiomeSelectionContext> snowOnly;
        snowOnly = context -> context.getBiome().getPrecipitation() == Precipitation.SNOW;
        
        //wild patches
        BiomeModifications.addFeature(BiomeSelectors.categories(Category.PLAINS), vegetal, WHEAT_PATCH);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST, BiomeKeys.DARK_FOREST_HILLS), vegetal, CARROT_PATCH);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BIRCH_FOREST, BiomeKeys.BIRCH_FOREST_HILLS, BiomeKeys.TALL_BIRCH_FOREST, BiomeKeys.TALL_BIRCH_HILLS), vegetal, BEET_PATCH);

        BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE, Category.SAVANNA), vegetal, POTATO_PATCH);

        BiomeModifications.addFeature(BiomeSelectors.categories(Category.SWAMP, Category.JUNGLE), vegetal, WILLOW_PATCH);

        BiomeModifications.addFeature(BiomeSelectors.categories(Category.SWAMP, Category.JUNGLE), vegetal, RIBBON_PATCH);

        BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE), vegetal, ORANGE_FERN_PATCH);

        BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE), vegetal, ORANGE_BEAUTY_PATCH);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST), vegetal, DAHLIA_PATCH);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST), vegetal, LAVENDER_PATCH);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.GIANT_SPRUCE_TAIGA, BiomeKeys.GIANT_SPRUCE_TAIGA_HILLS, BiomeKeys.GIANT_TREE_TAIGA, BiomeKeys.GIANT_TREE_TAIGA_HILLS), vegetal, SORREL_PATCH);

        BiomeModifications.addFeature(BiomeSelectors.categories(Category.FOREST, Category.PLAINS, Category.TAIGA), vegetal, DANDELION_PATCH);

        //herbs and taproots
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), vegetal, HERB_PATCH);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), vegetal, TAPROOT_PATCH);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.GIANT_SPRUCE_TAIGA, BiomeKeys.GIANT_SPRUCE_TAIGA_HILLS, BiomeKeys.GIANT_TREE_TAIGA, BiomeKeys.GIANT_TREE_TAIGA_HILLS), vegetal, CROCUS_PATCH);


        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.GIANT_SPRUCE_TAIGA, BiomeKeys.GIANT_SPRUCE_TAIGA_HILLS, BiomeKeys.GIANT_TREE_TAIGA, BiomeKeys.GIANT_TREE_TAIGA_HILLS), vegetal, HOLLY_PATCH);

        //found in dark woods
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST), vegetal, MOREL_PATCH);

        //found in every biome except snow
        BiomeModifications.addFeature(c -> !snowOnly.test(c), vegetal, BUSH_PATCH);

        BiomeModifications.addFeature(c -> !snowOnly.test(c), vegetal, SPROUT_PATCH);

        //found in jungles
        BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE), vegetal, JUNGLE_CAP_PATCH);

        BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE), vegetal, PAN_PATCH);

        //found in jungles and swamps
        BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE, Category.SWAMP), vegetal, SWAMP_BUSH_PATCH);

        BiomeModifications.addFeature(c -> !snowOnly.test(c), GenerationStep.Feature.VEGETAL_DECORATION, ROCK_PATCH);

        //found in snowy biomes
        BiomeModifications.addFeature(snowOnly, vegetal, SNOW_PATCH);

        BiomeModifications.addFeature(snowOnly, vegetal, SNOW_ROCK_PATCH);

        //these three share the same biomes, keep the values low so they don't overpopulate them!
        //found in forests
        BiomeModifications.addFeature(BiomeSelectors.categories(Category.FOREST), vegetal, ROSE_PATCH);

        BiomeModifications.addFeature(BiomeSelectors.categories(Category.FOREST), vegetal, HONEYCLUSTER_PATCH);

        BiomeModifications.addFeature(BiomeSelectors.categories(Category.FOREST), vegetal, LILAC_PATCH);

        BiomeModifications.addFeature(BiomeSelectors.categories(Category.FOREST), vegetal, PEONY_PATCH);

        //found in deserts
        BiomeModifications.addFeature(BiomeSelectors.categories(Category.DESERT, Category.MESA), vegetal, TUMBLE_PATCH);

        BiomeModifications.addFeature(BiomeSelectors.categories(Category.DESERT, Category.MESA), vegetal, FLOWERING_CACTUS_PATCH);

        BiomeModifications.addFeature(BiomeSelectors.categories(Category.DESERT, Category.MESA), vegetal, CACTUS_PATCH);

        BiomeModifications.addFeature(BiomeSelectors.categories(Category.SAVANNA), vegetal, ALIVE_PATCH);

        //found in podzol
        BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE), vegetal, BITTER_PATCH);

        //found in shattered savannas
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SHATTERED_SAVANNA, BiomeKeys.SHATTERED_SAVANNA_PLATEAU), vegetal, TOMATO_PATCH);
        
     // 62 is where a sea level with water block inside.
        var ranch = new RangeDecoratorConfig(ConstantHeightProvider.create(YOffset.fixed(62))); 
        var spread = Decorator.RANGE.configure(ranch).spreadHorizontally(); 
        
        // If you want to config reeds counts or something, check the ReedPatchFeature class.
        var registryKey = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(MOD_ID, "reed_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, registryKey.getValue(), REED_PATCH.configure(DefaultFeatureConfig.INSTANCE).decorate(spread));
        var categories = BiomeSelectors.categories(Category.RIVER, Category.PLAINS, Category.SWAMP, Category.FOREST, Category.JUNGLE, Category.TAIGA);
        BiomeModifications.addFeature(categories, vegetal, registryKey);
    }
    
    /** Create the random patch feature config. */
    private static RegistryKey<ConfiguredFeature<?, ?>> create(String id, Block block, int tries) {
        return create(id, block.getDefaultState(), tries);
    }
    
    /** Create the random patch feature config. */
    private static RegistryKey<ConfiguredFeature<?, ?>> create(String id, BlockState block, int tries) {
        var config = Feature.RANDOM_PATCH.configure((new RandomPatchFeatureConfig.Builder (
                new SimpleBlockStateProvider(block), 
                SimpleBlockPlacer.INSTANCE)
                ).tries(tries).build());
        var key = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(MOD_ID, id));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, key.getValue(), config);
        return key;
    }
}