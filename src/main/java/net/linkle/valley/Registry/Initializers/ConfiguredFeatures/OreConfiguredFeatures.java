package net.linkle.valley.Registry.Initializers.ConfiguredFeatures;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
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
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;

import static net.linkle.valley.ValleyMain.MOD_ID;
import static net.linkle.valley.Registry.Initializers.StoneBlocks.*;
import static net.minecraft.block.Blocks.*;

import java.util.function.Predicate;

public class OreConfiguredFeatures {
    //overworld ores
    private static ConfiguredFeature<?, ?> ORE_SALT_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    SALT_ORE.getDefaultState(),
                    6)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.getBottom(), YOffset.fixed(64)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(15); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> MIXED_ORE_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    MIXED_ORE.getDefaultState(),
                    6)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.getBottom(), YOffset.fixed(32)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(10); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> SALTPETER_ORE_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    SALTPETER_ORE.getDefaultState(),
                    6)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.getBottom(), YOffset.fixed(32)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(6); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> MUD_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    B_CLAY.getDefaultState(),
                    33)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.getBottom(), YOffset.fixed(64)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(10); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> MUD_JUNGLES_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    B_CLAY.getDefaultState(),
                    33)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.getBottom(), YOffset.fixed(128)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(3); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> VOLC_SAND_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    VOLCANIC_ASH.getDefaultState(),
                    33)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.getBottom(), YOffset.fixed(128)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(20); // Number of veins per chunk


    private static ConfiguredFeature<?, ?> VOLC_ROCK_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    VOLCANIC_STONE.getDefaultState(),
                    33)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.getBottom(), YOffset.fixed(128)))) // Inclusive min and max height
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
                    UniformHeightProvider.create(YOffset.getBottom(), YOffset.fixed(128)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(20); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> RED_SANDSTONE_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    RED_SANDSTONE.getDefaultState(),
                    33)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.getBottom(), YOffset.fixed(128)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(20); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> SAND_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    SAND.getDefaultState(),
                    33)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.getBottom(), YOffset.fixed(128)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(20); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> REDSAND_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    RED_SAND.getDefaultState(),
                    33)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.getBottom(), YOffset.fixed(128)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(20); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> DESERT_GRAVEL_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    DESERT_GRAVEL.getDefaultState(),
                    33)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.getBottom(), YOffset.fixed(128)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(20); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> DRY_MOSSY_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    DRY_MOSS_STONE.getDefaultState(),
                    20)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.getBottom(), YOffset.fixed(50)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(10); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> PUMICE_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    PUMICE.getDefaultState(),
                    15)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.getBottom(), YOffset.fixed(50)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(10); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> JASPER_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    JASPER.getDefaultState(),
                    15)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.getBottom(), YOffset.fixed(50)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(5); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> GRANITE_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    GREEN_GRANITE.getDefaultState(),
                    15)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.getBottom(), YOffset.fixed(50)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(5); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> LIMESTONE_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    LIMESTONE.getDefaultState(),
                    15)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.getBottom(), YOffset.fixed(50)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(15); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> BLEACHED_GRAVEL_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    BLEACHED_GRAVEL.getDefaultState(),
                    33)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.getBottom(), YOffset.fixed(128)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(10); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> SCALDING_OW_DESERT = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    SCALDING_SANDSTONE.getDefaultState(),
                    33)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.getBottom(), YOffset.fixed(64)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(20); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> SCALDING_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    SCALDING_STONE.getDefaultState(),
                    20)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.getBottom(), YOffset.fixed(32)))) // Inclusive min and max height
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
                    UniformHeightProvider.create(YOffset.getBottom(), YOffset.fixed(128)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(20); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> SNOW_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    SNOW_BLOCK.getDefaultState(),
                    33)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.getBottom(), YOffset.fixed(128)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(20); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> PACKED_ICE_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    PACKED_ICE.getDefaultState(),
                    16)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.getBottom(), YOffset.fixed(128)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(20); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> BLUE_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    BLUE_ICE.getDefaultState(),
                    16)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.getBottom(), YOffset.fixed(128)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(5); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> GLACIAL_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    GLACIAL_STONE.getDefaultState(),
                    5)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.getBottom(), YOffset.fixed(48)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(5); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> POWDER_SNOW_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    POWDER_SNOW.getDefaultState(),
                    20)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.getBottom(), YOffset.fixed(128)))) // Inclusive min and max height
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
                    UniformHeightProvider.create(YOffset.getBottom(), YOffset.fixed(128)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(10); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> ORE_COAL_NE = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_NETHER,
                    NETHER_COAL_ORE.getDefaultState(),
                    12)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.getBottom(), YOffset.fixed(128)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(10); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> OCEANSTONE_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    OCEAN_STONE.getDefaultState(),
                    33)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.getBottom(), YOffset.fixed(128)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(20); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> SWAMPSTONE_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    SWAMP_STONE.getDefaultState(),
                    33)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.getBottom(), YOffset.fixed(128)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(20); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> DARKSTONE_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    DARK_STONE.getDefaultState(),
                    33)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.getBottom(), YOffset.fixed(128)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(15); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> SCALDING_JUNGLE_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    SCALDING_VOLC.getDefaultState(),
                    20)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.getBottom(), YOffset.fixed(64)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(10); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> JUNGLE_STONE_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    JUNGLE.getDefaultState(),
                    20)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.getBottom(), YOffset.fixed(128)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(15); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> JUNGLE_MOSSY_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    JUNGLE_MOSSY.getDefaultState(),
                    20)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.getBottom(), YOffset.fixed(128)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(15); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> JUNGLE_SPOREY_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    JUNGLE_SPOREY.getDefaultState(),
                    5)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.getBottom(), YOffset.fixed(128)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(15); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> MOSSY_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    STONE_MOSSY.getDefaultState(),
                    33)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.getBottom(), YOffset.fixed(128)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(15); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> TAIGASTONE_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    TAIGA_STONE.getDefaultState(),
                    33)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.getBottom(), YOffset.fixed(128)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(15); // Number of veins per chunk

    private static ConfiguredFeature<?, ?> FOSSIL_OW = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    FOSSIL_ORE.getDefaultState(),
                    3)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.getBottom(), YOffset.fixed(128)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(5); // Number of veins per chunk

    public static void initialize(SimpleConfig config) {
        boolean blobsEnable = !config.get("disable-blobs-gen", false);
        config.script("disable-blobs-gen", 
            "Disable blobs feature gens like stones, mud, sandstone, and biome-specific blobs, but not ores."
        );
        
        var underground = GenerationStep.Feature.UNDERGROUND_ORES;
        Predicate<BiomeSelectionContext> snowOnly;
        snowOnly = context -> context.getBiome().getPrecipitation() == Precipitation.SNOW;

        //jungle ores
        if (blobsEnable) {
            RegistryKey<ConfiguredFeature<?, ?>> scaldingJungle = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(MOD_ID, "ore_jungle_scalding_overworld"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, scaldingJungle.getValue(), SCALDING_JUNGLE_OW);
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE), underground, scaldingJungle);
        }
        

        if (blobsEnable) {
            RegistryKey<ConfiguredFeature<?, ?>> stoneJungle = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(MOD_ID, "ore_jungle_stone_overworld"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, stoneJungle.getValue(), JUNGLE_STONE_OW);
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE), underground, stoneJungle);
        }

        if (blobsEnable) {
            RegistryKey<ConfiguredFeature<?, ?>> mossyJungle = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(MOD_ID, "ore_jungle_mossy_overworld"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, mossyJungle.getValue(), JUNGLE_MOSSY_OW);
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE), underground, mossyJungle);
        }

        if (blobsEnable) {
            RegistryKey<ConfiguredFeature<?, ?>> mudJungle = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(MOD_ID, "ore_mud_jungle_overworld"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, mudJungle.getValue(), MUD_JUNGLES_OW);
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE), underground, mudJungle);
        }

        if (blobsEnable) {
            RegistryKey<ConfiguredFeature<?, ?>> sporeyJungle = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(MOD_ID, "ore_jungle_sporey_overworld"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, sporeyJungle.getValue(), JUNGLE_SPOREY_OW);
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE), underground, sporeyJungle); 
        }

        //all biomes except oceans, deserts, and frozen biomes
        if (blobsEnable) {
            RegistryKey<ConfiguredFeature<?, ?>> mossyStone = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(MOD_ID, "ore_mossy_overworld"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, mossyStone.getValue(), MOSSY_OW);
            var key = BiomeSelectors.categories(Category.OCEAN, Category.DESERT, Category.ICY);
            BiomeModifications.addFeature(c -> !key.test(c) && !snowOnly.test(c), underground, mossyStone);
        }
        
        //just the one above ^-^

        if (blobsEnable) {
            RegistryKey<ConfiguredFeature<?, ?>> oceanStone = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(MOD_ID, "ore_ocean_overworld"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oceanStone.getValue(), OCEANSTONE_OW);
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.OCEAN), underground, oceanStone);
        }

        if (blobsEnable) {
            RegistryKey<ConfiguredFeature<?, ?>> graniteStone = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(MOD_ID, "ore_granite"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, graniteStone.getValue(), GRANITE_OW);
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.OCEAN), underground, graniteStone);
        }

        if (blobsEnable) {
            RegistryKey<ConfiguredFeature<?, ?>> swampStone = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(MOD_ID, "ore_swamp_overworld"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, swampStone.getValue(), SWAMPSTONE_OW);
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.SWAMP), underground, swampStone);
        }

        if (blobsEnable) {
            RegistryKey<ConfiguredFeature<?, ?>> darkStone = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(MOD_ID, "ore_dark_overworld"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, darkStone.getValue(), DARKSTONE_OW);
            BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST, BiomeKeys.DARK_FOREST_HILLS), underground, darkStone);
        }

        //plains and forests
        if (blobsEnable) {
            RegistryKey<ConfiguredFeature<?, ?>> limeStone = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(MOD_ID, "ore_limestone"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, limeStone.getValue(), LIMESTONE_OW);
            Predicate<BiomeSelectionContext> key;
            key = c -> c.getBiomeKey().equals(BiomeKeys.FOREST) || c.getBiome().getCategory() == Category.PLAINS;
            BiomeModifications.addFeature(key, underground, limeStone);
        }

        //desert only ores
        if (blobsEnable) {
            RegistryKey<ConfiguredFeature<?, ?>> pumice_ow = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(MOD_ID, "ore_pumice"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, pumice_ow.getValue(), PUMICE_OW);
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.DESERT), underground, pumice_ow);
        }

        //badlands only ores
        if (blobsEnable) {
            RegistryKey<ConfiguredFeature<?, ?>> jasper_ow = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(MOD_ID, "ore_jasper"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, jasper_ow.getValue(), JASPER_OW);
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.MESA), underground, jasper_ow);
        }
        
        //desert ores and badlands
        if (blobsEnable) {
            RegistryKey<ConfiguredFeature<?, ?>> sand_ow = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(MOD_ID, "ore_sand"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, sand_ow.getValue(), SAND_OW);
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.MESA, Category.DESERT), underground, sand_ow);
        }

        if (blobsEnable) {
            RegistryKey<ConfiguredFeature<?, ?>> sandstone_ow = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(MOD_ID, "ore_sandstone"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, sandstone_ow.getValue(), SANDSTONE_OW);
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.MESA, Category.DESERT), underground, sandstone_ow);
        }

        if (blobsEnable) {
            RegistryKey<ConfiguredFeature<?, ?>> dry_mossy_ow = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(MOD_ID, "ore_dry_mossy"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, dry_mossy_ow.getValue(), DRY_MOSSY_OW);
                BiomeModifications.addFeature(BiomeSelectors.categories(Category.MESA, Category.DESERT), underground, dry_mossy_ow);
        }

        if (blobsEnable) {
            RegistryKey<ConfiguredFeature<?, ?>> gravel_ow = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(MOD_ID, "ore_desert_gravel"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, gravel_ow.getValue(), DESERT_GRAVEL_OW);
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.MESA, Category.DESERT), underground, gravel_ow);
        }

        if (blobsEnable) {
            RegistryKey<ConfiguredFeature<?, ?>> bleached_gravel_ow = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(MOD_ID, "ore_bleached_gravel"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, bleached_gravel_ow.getValue(), BLEACHED_GRAVEL_OW);
            BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MODIFIED_GRAVELLY_MOUNTAINS, BiomeKeys.GRAVELLY_MOUNTAINS), underground, bleached_gravel_ow);
        }
        
        if (blobsEnable) {
            RegistryKey<ConfiguredFeature<?, ?>> scaldingOW_DESERT = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(MOD_ID, "ore_scalding_overworld_desert"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, scaldingOW_DESERT.getValue(), SCALDING_OW_DESERT);
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.MESA, Category.DESERT), underground, scaldingOW_DESERT);
        }

        //badlands ores
        if (blobsEnable) {
            RegistryKey<ConfiguredFeature<?, ?>> redsand_ow = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(MOD_ID, "ore_redsand"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, redsand_ow.getValue(), REDSAND_OW);
            if (blobsEnable)
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.MESA), underground, redsand_ow);
        }

        if (blobsEnable) {
            RegistryKey<ConfiguredFeature<?, ?>> redsandstone_ow = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(MOD_ID, "ore_redsandstone"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, redsandstone_ow.getValue(), RED_SANDSTONE_OW);
            if (blobsEnable)
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.MESA), underground, redsandstone_ow);
        }

        //badlands and deserts
        {
            RegistryKey<ConfiguredFeature<?, ?>> fossil_ow = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(MOD_ID, "ore_fossil"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, fossil_ow.getValue(), FOSSIL_OW);
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.MESA, Category.DESERT), underground, fossil_ow);
        }

        //scalding all biomes
        if (blobsEnable) {
            RegistryKey<ConfiguredFeature<?, ?>> scaldingOW = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(MOD_ID, "ore_scalding_overworld"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, scaldingOW.getValue(), SCALDING_OW);
            if (blobsEnable)
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), underground, scaldingOW);
        }

        //snow ores
        if (blobsEnable) {
            RegistryKey<ConfiguredFeature<?, ?>> oreIceOW = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(MOD_ID, "ore_ice_overworld"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreIceOW.getValue(), ICE_OW);
            if (blobsEnable)
            BiomeModifications.addFeature(snowOnly, underground, oreIceOW);
        }

        if (blobsEnable) {
            RegistryKey<ConfiguredFeature<?, ?>> orePackedIceOW = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(MOD_ID, "ore_packed_ice_overworld"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, orePackedIceOW.getValue(), PACKED_ICE_OW);
            BiomeModifications.addFeature(snowOnly, underground, orePackedIceOW);
        }

        if (blobsEnable) {
            RegistryKey<ConfiguredFeature<?, ?>> oreSnowOW = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(MOD_ID, "ore_snow_overworld"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSnowOW.getValue(), SNOW_OW);
            BiomeModifications.addFeature(snowOnly, underground, oreSnowOW);
        }
        

        if (blobsEnable) {
            RegistryKey<ConfiguredFeature<?, ?>> oreBLUEICE = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(MOD_ID, "ore_blue_overworld"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreBLUEICE.getValue(), BLUE_OW);
            BiomeModifications.addFeature(snowOnly, underground, oreBLUEICE);
        }
        

        if (blobsEnable) {
            RegistryKey<ConfiguredFeature<?, ?>> orePowderSnowOW = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(MOD_ID, "ore_powder_snow_overworld"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, orePowderSnowOW.getValue(), POWDER_SNOW_OW);
            BiomeModifications.addFeature(snowOnly, underground, orePowderSnowOW);
        }

        //mountain ores
        if (blobsEnable) {
            RegistryKey<ConfiguredFeature<?, ?>> oreGlacialOW = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(MOD_ID, "ore_glacial_stone_overworld"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreGlacialOW.getValue(), GLACIAL_OW);
            Predicate<BiomeSelectionContext> key;
            key = BiomeSelectors.includeByKey(BiomeKeys.TAIGA_MOUNTAINS, BiomeKeys.SNOWY_TAIGA_MOUNTAINS, BiomeKeys.SNOWY_MOUNTAINS, BiomeKeys.ICE_SPIKES);
            BiomeModifications.addFeature(c -> key.test(c) || c.getBiome().getCategory() == Category.EXTREME_HILLS, underground, oreGlacialOW);
        }
        

        //overworld ores
        {
            RegistryKey<ConfiguredFeature<?, ?>> oreSaltOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(MOD_ID, "ore_salt_overworld"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSaltOverworld.getValue(), ORE_SALT_OW);
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), underground, oreSaltOverworld);
        }

        {
            RegistryKey<ConfiguredFeature<?, ?>> oreMixedOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(MOD_ID, "ore_mixed_overworld"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreMixedOverworld.getValue(), MIXED_ORE_OW);
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), underground, oreMixedOverworld);
        }

        {
            RegistryKey<ConfiguredFeature<?, ?>> oreSaltpeterOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(MOD_ID, "ore_saltpeter_overworld"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSaltpeterOverworld.getValue(), SALTPETER_ORE_OW);
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), underground, oreSaltpeterOverworld);
        }

        if (blobsEnable) {
            RegistryKey<ConfiguredFeature<?, ?>> mudOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(MOD_ID, "mud_overworld"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, mudOverworld.getValue(), MUD_OW);
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), underground, mudOverworld);
        }

        if (blobsEnable) {
            RegistryKey<ConfiguredFeature<?, ?>> volcSandOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(MOD_ID, "volcanic_sand_overworld"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, volcSandOverworld.getValue(), VOLC_SAND_OW);
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE), underground, volcSandOverworld);
        }
        
        if (blobsEnable) {
            RegistryKey<ConfiguredFeature<?, ?>> volcStoneOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(MOD_ID, "volcanic_stone_overworld"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, volcStoneOverworld.getValue(), VOLC_ROCK_OW);
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE), underground, volcStoneOverworld);
        }

        //nether ores
        if (blobsEnable) {
            RegistryKey<ConfiguredFeature<?, ?>> oreSaltNether = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(MOD_ID, "ore_salt_nether"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSaltNether.getValue(), ORE_SALT_NE);
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), underground, oreSaltNether);
        }
        
        if (blobsEnable) {
            RegistryKey<ConfiguredFeature<?, ?>> oreCoalNether = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(MOD_ID, "ore_coal_nether"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreCoalNether.getValue(), ORE_COAL_NE);
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), underground, oreCoalNether);
        }

        //taiga ores
        if (blobsEnable) {
            RegistryKey<ConfiguredFeature<?, ?>> oreTaigaOW = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                    new Identifier(MOD_ID, "ore_taiga_overworld"));
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTaigaOW.getValue(), TAIGASTONE_OW);
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.TAIGA), underground, oreTaigaOW);
        }
    }
}
