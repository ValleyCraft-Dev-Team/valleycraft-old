package net.linkle.valley.Registry.Initializers.ConfiguredFeatures;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;

import static net.linkle.valley.Registry.Initializers.Plants.ROCK_PILE;
import static net.linkle.valley.Registry.Initializers.StoneBlocks.*;
import static net.minecraft.block.Blocks.*;

public class OreConfiguredFeatures {

    public static final String MOD_ID = "valley";

    //rock pile ore
    private static ConfiguredFeature<?, ?> ORE_ROCK_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ROCK_PILE.getDefaultState(),
                    3)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(64)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(33); // Number of veins per chunk

    //overworld ores
    private static ConfiguredFeature<?, ?> ORE_SALT_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    SALT_ORE.getDefaultState(),
                    6)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(64)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(15); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> MIXED_ORE_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    MIXED_ORE.getDefaultState(),
                    6)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(32)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(10); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> SALTPETER_ORE_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    SALTPETER_ORE.getDefaultState(),
                    6)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(32)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(6); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> MUD_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    B_CLAY.getDefaultState(),
                    33)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(128)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(10); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> VOLC_SAND_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    VOLCANIC_ASH.getDefaultState(),
                    33)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(128)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(20); // Number of veins per chunk


    private static ConfiguredFeature<?, ?> VOLC_ROCK_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    VOLCANIC_STONE.getDefaultState(),
                    33)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(128)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(20); // Number of veins per chunk

    //desert ores
    private static ConfiguredFeature<?, ?> SANDSTONE_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    SANDSTONE.getDefaultState(),
                    33)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(128)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(20); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> RED_SANDSTONE_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    RED_SANDSTONE.getDefaultState(),
                    33)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(128)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(20); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> SAND_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    SAND.getDefaultState(),
                    33)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(128)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(20); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> REDSAND_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    RED_SAND.getDefaultState(),
                    33)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(128)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(20); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> DESERT_GRAVEL_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    DESERT_GRAVEL.getDefaultState(),
                    33)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(128)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(20); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> SCALDING_OW_DESERT = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    SCALDING_SANDSTONE.getDefaultState(),
                    33)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(64)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(20); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> SCALDING_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    SCALDING_STONE.getDefaultState(),
                    20)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(32)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(10); // Number of veins per chunk

    //snow ores
    private static ConfiguredFeature<?, ?> ICE_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ICE.getDefaultState(),
                    33)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(128)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(20); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> SNOW_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    SNOW_BLOCK.getDefaultState(),
                    33)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(128)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(20); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> PACKED_ICE_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    PACKED_ICE.getDefaultState(),
                    16)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(128)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(20); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> BLUE_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    BLUE_ICE.getDefaultState(),
                    16)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(128)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(5); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> GLACIAL_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    GLACIAL_STONE.getDefaultState(),
                    5)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(48)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(5); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> POWDER_SNOW_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    POWDER_SNOW.getDefaultState(),
                    20)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(128)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(15); // Number of veins per chunk

    //nether ores
    private static ConfiguredFeature<?, ?> ORE_SALT_NE = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_NETHER,
                    NETHER_SALT.getDefaultState(),
                    12)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(128)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(10); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> ORE_COAL_NE = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_NETHER,
                    NETHER_COAL_ORE.getDefaultState(),
                    12)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(128)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(10); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> OCEANSTONE_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    OCEAN_STONE.getDefaultState(),
                    33)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(128)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(20); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> SWAMPSTONE_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    SWAMP_STONE.getDefaultState(),
                    33)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(128)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(20); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> DARKSTONE_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    DARK_STONE.getDefaultState(),
                    33)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(128)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(15); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> SCALDING_JUNGLE_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    SCALDING_VOLC.getDefaultState(),
                    20)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(64)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(10); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> JUNGLE_STONE_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    JUNGLE.getDefaultState(),
                    20)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(128)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(15); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> JUNGLE_MOSSY_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    JUNGLE_MOSSY.getDefaultState(),
                    20)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(128)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(15); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> JUNGLE_SPOREY_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    JUNGLE_SPOREY.getDefaultState(),
                    5)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(128)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(15); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> MOSSY_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    STONE_MOSSY.getDefaultState(),
                    33)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(128)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(15); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> TAIGASTONE_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    TAIGA_STONE.getDefaultState(),
                    33)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(128)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(15); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> FOSSIL_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    FOSSIL_ORE.getDefaultState(),
                    3)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(128)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(5); // Number of veins per chunk

    public static void initialize() {

        //jungle ores
        RegistryKey<ConfiguredFeature<?, ?>> scaldingJungle = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "ore_jungle_scalding_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, scaldingJungle.getValue(), SCALDING_JUNGLE_OW);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.JUNGLE_EDGE,BiomeKeys.JUNGLE_HILLS, BiomeKeys.JUNGLE, BiomeKeys.MODIFIED_JUNGLE_EDGE, BiomeKeys.BAMBOO_JUNGLE_HILLS, BiomeKeys.BAMBOO_JUNGLE),
                GenerationStep.Feature.UNDERGROUND_ORES, scaldingJungle);

        RegistryKey<ConfiguredFeature<?, ?>> stoneJungle = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "ore_jungle_stone_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, stoneJungle.getValue(), JUNGLE_STONE_OW);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.JUNGLE_EDGE,BiomeKeys.JUNGLE_HILLS, BiomeKeys.JUNGLE, BiomeKeys.MODIFIED_JUNGLE_EDGE, BiomeKeys.BAMBOO_JUNGLE_HILLS, BiomeKeys.BAMBOO_JUNGLE),
                GenerationStep.Feature.UNDERGROUND_ORES, stoneJungle);

        RegistryKey<ConfiguredFeature<?, ?>> mossyJungle = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "ore_jungle_mossy_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, mossyJungle.getValue(), JUNGLE_MOSSY_OW);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.JUNGLE_EDGE,BiomeKeys.JUNGLE_HILLS, BiomeKeys.JUNGLE, BiomeKeys.MODIFIED_JUNGLE_EDGE, BiomeKeys.BAMBOO_JUNGLE_HILLS, BiomeKeys.BAMBOO_JUNGLE),
                GenerationStep.Feature.UNDERGROUND_ORES, mossyJungle);

        RegistryKey<ConfiguredFeature<?, ?>> sporeyJungle = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "ore_jungle_sporey_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, sporeyJungle.getValue(), JUNGLE_SPOREY_OW);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.JUNGLE_EDGE,BiomeKeys.JUNGLE_HILLS, BiomeKeys.JUNGLE, BiomeKeys.MODIFIED_JUNGLE_EDGE, BiomeKeys.BAMBOO_JUNGLE_HILLS, BiomeKeys.BAMBOO_JUNGLE),
                GenerationStep.Feature.UNDERGROUND_ORES, sporeyJungle);

        //all biomes except oceans, deserts, and frozen biomes
        RegistryKey<ConfiguredFeature<?, ?>> mossyStone = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "ore_mossy_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, mossyStone.getValue(), MOSSY_OW);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.JUNGLE_EDGE,BiomeKeys.JUNGLE_HILLS, BiomeKeys.JUNGLE, BiomeKeys.MODIFIED_JUNGLE_EDGE, BiomeKeys.BAMBOO_JUNGLE_HILLS, BiomeKeys.BAMBOO_JUNGLE, BiomeKeys.SWAMP_HILLS, BiomeKeys.SWAMP, BiomeKeys.GIANT_TREE_TAIGA, BiomeKeys.GIANT_SPRUCE_TAIGA, BiomeKeys.GIANT_SPRUCE_TAIGA_HILLS, BiomeKeys.GIANT_TREE_TAIGA_HILLS, BiomeKeys.TAIGA, BiomeKeys.TAIGA_HILLS, BiomeKeys.TAIGA_MOUNTAINS, BiomeKeys.DARK_FOREST_HILLS, BiomeKeys.DARK_FOREST, BiomeKeys.WOODED_MOUNTAINS, BiomeKeys.GRAVELLY_MOUNTAINS, BiomeKeys.SUNFLOWER_PLAINS, BiomeKeys.PLAINS, BiomeKeys.BIRCH_FOREST, BiomeKeys.BIRCH_FOREST_HILLS, BiomeKeys.TALL_BIRCH_HILLS, BiomeKeys.TALL_BIRCH_FOREST, BiomeKeys.FOREST, BiomeKeys.FLOWER_FOREST, BiomeKeys.RIVER, BiomeKeys.MOUNTAINS, BiomeKeys.MOUNTAIN_EDGE),
                GenerationStep.Feature.UNDERGROUND_ORES, mossyStone);
        //just the one above ^-^

        RegistryKey<ConfiguredFeature<?, ?>> oceanStone = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "ore_ocean_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oceanStone.getValue(), OCEANSTONE_OW);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.OCEAN, BiomeKeys.DEEP_OCEAN, BiomeKeys.DEEP_LUKEWARM_OCEAN, BiomeKeys.DEEP_WARM_OCEAN, BiomeKeys.WARM_OCEAN, BiomeKeys.LUKEWARM_OCEAN, BiomeKeys.FROZEN_OCEAN, BiomeKeys.DEEP_FROZEN_OCEAN, BiomeKeys.DEEP_COLD_OCEAN, BiomeKeys.COLD_OCEAN),
                GenerationStep.Feature.UNDERGROUND_ORES, oceanStone);

        RegistryKey<ConfiguredFeature<?, ?>> swampStone = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "ore_swamp_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, swampStone.getValue(), SWAMPSTONE_OW);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SWAMP, BiomeKeys.SWAMP_HILLS),
                GenerationStep.Feature.UNDERGROUND_ORES, swampStone);

        RegistryKey<ConfiguredFeature<?, ?>> darkStone = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "ore_dark_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, darkStone.getValue(), DARKSTONE_OW);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST, BiomeKeys.DARK_FOREST_HILLS),
                GenerationStep.Feature.UNDERGROUND_ORES, darkStone);

        //desert ores
        RegistryKey<ConfiguredFeature<?, ?>> sand_ow = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "ore_sand"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, sand_ow.getValue(), SAND_OW);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DESERT, BiomeKeys.DESERT_HILLS, BiomeKeys.DESERT_LAKES, BiomeKeys.BADLANDS, BiomeKeys.BADLANDS_PLATEAU, BiomeKeys.ERODED_BADLANDS, BiomeKeys.WOODED_BADLANDS_PLATEAU, BiomeKeys.MODIFIED_WOODED_BADLANDS_PLATEAU),
                GenerationStep.Feature.UNDERGROUND_ORES, sand_ow);

        RegistryKey<ConfiguredFeature<?, ?>> sandstone_ow = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "ore_sandstone"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, sandstone_ow.getValue(), SANDSTONE_OW);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DESERT, BiomeKeys.DESERT_HILLS, BiomeKeys.DESERT_LAKES, BiomeKeys.BADLANDS, BiomeKeys.BADLANDS_PLATEAU, BiomeKeys.ERODED_BADLANDS, BiomeKeys.WOODED_BADLANDS_PLATEAU, BiomeKeys.MODIFIED_WOODED_BADLANDS_PLATEAU),
                GenerationStep.Feature.UNDERGROUND_ORES, sandstone_ow);

        RegistryKey<ConfiguredFeature<?, ?>> gravel_ow = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "ore_desert_gravel"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, gravel_ow.getValue(), DESERT_GRAVEL_OW);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DESERT, BiomeKeys.DESERT_HILLS, BiomeKeys.DESERT_LAKES, BiomeKeys.BADLANDS, BiomeKeys.BADLANDS_PLATEAU, BiomeKeys.ERODED_BADLANDS, BiomeKeys.WOODED_BADLANDS_PLATEAU, BiomeKeys.MODIFIED_WOODED_BADLANDS_PLATEAU),
                GenerationStep.Feature.UNDERGROUND_ORES, gravel_ow);

        RegistryKey<ConfiguredFeature<?, ?>> scaldingOW_DESERT = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "ore_scalding_overworld_desert"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, scaldingOW_DESERT.getValue(), SCALDING_OW_DESERT);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DESERT, BiomeKeys.DESERT_HILLS, BiomeKeys.DESERT_LAKES, BiomeKeys.BADLANDS, BiomeKeys.BADLANDS_PLATEAU, BiomeKeys.ERODED_BADLANDS, BiomeKeys.WOODED_BADLANDS_PLATEAU, BiomeKeys.MODIFIED_WOODED_BADLANDS_PLATEAU),
                GenerationStep.Feature.UNDERGROUND_ORES, scaldingOW_DESERT);

        //badlands ores
        RegistryKey<ConfiguredFeature<?, ?>> redsand_ow = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "ore_redsand"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, redsand_ow.getValue(), REDSAND_OW);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BADLANDS, BiomeKeys.BADLANDS_PLATEAU, BiomeKeys.ERODED_BADLANDS, BiomeKeys.WOODED_BADLANDS_PLATEAU, BiomeKeys.MODIFIED_WOODED_BADLANDS_PLATEAU),
                GenerationStep.Feature.UNDERGROUND_ORES, redsand_ow);

        RegistryKey<ConfiguredFeature<?, ?>> redsandstone_ow = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "ore_redsandstone"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, redsandstone_ow.getValue(), RED_SANDSTONE_OW);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BADLANDS, BiomeKeys.BADLANDS_PLATEAU, BiomeKeys.ERODED_BADLANDS, BiomeKeys.WOODED_BADLANDS_PLATEAU, BiomeKeys.MODIFIED_WOODED_BADLANDS_PLATEAU),
                GenerationStep.Feature.UNDERGROUND_ORES, redsandstone_ow);

        //badlands and deserts
        RegistryKey<ConfiguredFeature<?, ?>> fossil_ow = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "ore_fossil"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, fossil_ow.getValue(), FOSSIL_OW);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BADLANDS, BiomeKeys.BADLANDS_PLATEAU, BiomeKeys.ERODED_BADLANDS, BiomeKeys.WOODED_BADLANDS_PLATEAU, BiomeKeys.MODIFIED_WOODED_BADLANDS_PLATEAU, BiomeKeys.DESERT, BiomeKeys.DESERT_HILLS, BiomeKeys.DESERT_LAKES),
                GenerationStep.Feature.UNDERGROUND_ORES, fossil_ow);

        //scalding all biomes
        RegistryKey<ConfiguredFeature<?, ?>> scaldingOW = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "ore_scalding_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, scaldingOW.getValue(), SCALDING_OW);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, scaldingOW);

        //snow ores
        RegistryKey<ConfiguredFeature<?, ?>> oreIceOW = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "ore_ice_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreIceOW.getValue(), ICE_OW);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.ICE_SPIKES,BiomeKeys.SNOWY_TAIGA,BiomeKeys.SNOWY_TAIGA_HILLS,BiomeKeys.SNOWY_BEACH,BiomeKeys.SNOWY_TAIGA_MOUNTAINS,BiomeKeys.SNOWY_MOUNTAINS,BiomeKeys.SNOWY_TUNDRA, BiomeKeys.ICE_SPIKES),
                GenerationStep.Feature.UNDERGROUND_ORES, oreIceOW);

        RegistryKey<ConfiguredFeature<?, ?>> orePackedIceOW = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "ore_packed_ice_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, orePackedIceOW.getValue(), PACKED_ICE_OW);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.ICE_SPIKES,BiomeKeys.SNOWY_TAIGA,BiomeKeys.SNOWY_TAIGA_HILLS,BiomeKeys.SNOWY_BEACH,BiomeKeys.SNOWY_TAIGA_MOUNTAINS,BiomeKeys.SNOWY_MOUNTAINS,BiomeKeys.SNOWY_TUNDRA, BiomeKeys.ICE_SPIKES),
                GenerationStep.Feature.UNDERGROUND_ORES, orePackedIceOW);

        RegistryKey<ConfiguredFeature<?, ?>> oreSnowOW = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "ore_snow_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSnowOW.getValue(), SNOW_OW);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.ICE_SPIKES,BiomeKeys.SNOWY_TAIGA,BiomeKeys.SNOWY_TAIGA_HILLS,BiomeKeys.SNOWY_BEACH,BiomeKeys.SNOWY_TAIGA_MOUNTAINS,BiomeKeys.SNOWY_MOUNTAINS,BiomeKeys.SNOWY_TUNDRA, BiomeKeys.ICE_SPIKES),
                GenerationStep.Feature.UNDERGROUND_ORES, oreSnowOW);

        RegistryKey<ConfiguredFeature<?, ?>> oreBLUEICE = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "ore_blue_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreBLUEICE.getValue(), BLUE_OW);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.ICE_SPIKES,BiomeKeys.SNOWY_TAIGA,BiomeKeys.SNOWY_TAIGA_HILLS,BiomeKeys.SNOWY_BEACH,BiomeKeys.SNOWY_TAIGA_MOUNTAINS,BiomeKeys.SNOWY_MOUNTAINS,BiomeKeys.SNOWY_TUNDRA, BiomeKeys.ICE_SPIKES),
                GenerationStep.Feature.UNDERGROUND_ORES, oreBLUEICE);

        RegistryKey<ConfiguredFeature<?, ?>> orePowderSnowOW = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "ore_powder_snow_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, orePowderSnowOW.getValue(), POWDER_SNOW_OW);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.ICE_SPIKES,BiomeKeys.SNOWY_TAIGA,BiomeKeys.SNOWY_TAIGA_HILLS,BiomeKeys.SNOWY_BEACH,BiomeKeys.SNOWY_TAIGA_MOUNTAINS,BiomeKeys.SNOWY_MOUNTAINS,BiomeKeys.SNOWY_TUNDRA, BiomeKeys.ICE_SPIKES),
                GenerationStep.Feature.UNDERGROUND_ORES, orePowderSnowOW);

        //mountain ores
        RegistryKey<ConfiguredFeature<?, ?>> oreGlacialOW = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "ore_glacial_stone_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreGlacialOW.getValue(), GLACIAL_OW);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MOUNTAINS, BiomeKeys.MOUNTAIN_EDGE, BiomeKeys.WOODED_MOUNTAINS, BiomeKeys.GRAVELLY_MOUNTAINS, BiomeKeys.TAIGA_MOUNTAINS, BiomeKeys.SNOWY_TAIGA_MOUNTAINS, BiomeKeys.MODIFIED_GRAVELLY_MOUNTAINS, BiomeKeys.ICE_SPIKES),
                GenerationStep.Feature.UNDERGROUND_ORES, oreGlacialOW);

        //overworld ores
        RegistryKey<ConfiguredFeature<?, ?>> oreSaltOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "ore_salt_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSaltOverworld.getValue(), ORE_SALT_OW);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreSaltOverworld);

        RegistryKey<ConfiguredFeature<?, ?>> oreMixedOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "ore_mixed_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreMixedOverworld.getValue(), MIXED_ORE_OW);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreMixedOverworld);

        RegistryKey<ConfiguredFeature<?, ?>> oreSaltpeterOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "ore_saltpeter_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSaltpeterOverworld.getValue(), SALTPETER_ORE_OW);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreSaltpeterOverworld);

        RegistryKey<ConfiguredFeature<?, ?>> mudOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "mud_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, mudOverworld.getValue(), MUD_OW);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, mudOverworld);

        RegistryKey<ConfiguredFeature<?, ?>> volcSandOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "volcanic_sand_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, volcSandOverworld.getValue(), VOLC_SAND_OW);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BAMBOO_JUNGLE, BiomeKeys.JUNGLE,BiomeKeys.JUNGLE_HILLS, BiomeKeys.BAMBOO_JUNGLE_HILLS, BiomeKeys.MODIFIED_JUNGLE), GenerationStep.Feature.UNDERGROUND_ORES, volcSandOverworld);

        RegistryKey<ConfiguredFeature<?, ?>> volcStoneOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "volcanic_stone_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, volcStoneOverworld.getValue(), VOLC_ROCK_OW);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BAMBOO_JUNGLE, BiomeKeys.JUNGLE,BiomeKeys.JUNGLE_HILLS, BiomeKeys.BAMBOO_JUNGLE_HILLS, BiomeKeys.MODIFIED_JUNGLE), GenerationStep.Feature.UNDERGROUND_ORES, volcStoneOverworld);

        //nether ores
        RegistryKey<ConfiguredFeature<?, ?>> oreSaltNether = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "ore_salt_nether"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSaltNether.getValue(), ORE_SALT_NE);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.NETHER_WASTES, BiomeKeys.CRIMSON_FOREST, BiomeKeys.WARPED_FOREST), GenerationStep.Feature.UNDERGROUND_ORES, oreSaltNether);

        RegistryKey<ConfiguredFeature<?, ?>> oreCoalNether = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "ore_coal_nether"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreCoalNether.getValue(), ORE_COAL_NE);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.NETHER_WASTES, BiomeKeys.CRIMSON_FOREST, BiomeKeys.WARPED_FOREST), GenerationStep.Feature.UNDERGROUND_ORES, oreCoalNether);

        //taiga ores
        RegistryKey<ConfiguredFeature<?, ?>> oreTaigaOW = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(MOD_ID, "ore_taiga_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTaigaOW.getValue(), TAIGASTONE_OW);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.TAIGA,BiomeKeys.TAIGA_HILLS, BiomeKeys.TAIGA_MOUNTAINS, BiomeKeys.SNOWY_TAIGA_HILLS, BiomeKeys.SNOWY_TAIGA_MOUNTAINS, BiomeKeys.GIANT_SPRUCE_TAIGA, BiomeKeys.SNOWY_TAIGA,BiomeKeys.GIANT_SPRUCE_TAIGA_HILLS, BiomeKeys.GIANT_TREE_TAIGA_HILLS, BiomeKeys.GIANT_SPRUCE_TAIGA, BiomeKeys.GIANT_TREE_TAIGA),
                GenerationStep.Feature.UNDERGROUND_ORES, oreTaigaOW);
    }
}
