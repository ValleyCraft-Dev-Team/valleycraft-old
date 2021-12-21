package net.linkle.valley.Registry.Initializers.ConfiguredFeatures;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.linkle.valley.Registry.Utils.SimpleConfig;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
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

public class OreFeatures {
    //overworld ores
    private static RegistryKey<ConfiguredFeature<?, ?>> ORE_SALT_OW = create("ore_salt_overworld", SALT_ORE, 6, 15, 0, 64);
    private static RegistryKey<ConfiguredFeature<?, ?>> MIXED_ORE_OW = create("ore_mixed_overworld", MIXED_ORE, 6, 10, 0, 32);
    private static RegistryKey<ConfiguredFeature<?, ?>> SALTPETER_ORE_OW = create("ore_saltpeter_overworld", SALTPETER_ORE, 6, 6, 0, 32);
    private static RegistryKey<ConfiguredFeature<?, ?>> MUD_OW = create("mud_overworld", B_CLAY, 33, 5, 0, 64);
    private static RegistryKey<ConfiguredFeature<?, ?>> MUD_JUNGLES_OW = create("ore_mud_jungle_overworld", B_CLAY, 33, 3, 0, 128);
    private static RegistryKey<ConfiguredFeature<?, ?>> VOLC_SAND_OW = create("volcanic_sand_overworld", VOLCANIC_ASH, 33, 10, 0, 128);
    private static RegistryKey<ConfiguredFeature<?, ?>> VOLC_ROCK_OW = create("volcanic_stone_overworld", VOLCANIC_STONE, 33, 20, 0, 128);

    //desert ores
    private static RegistryKey<ConfiguredFeature<?, ?>> SANDSTONE_OW = create("ore_sandstone", SANDSTONE, 33, 20, 0, 128);
    private static RegistryKey<ConfiguredFeature<?, ?>> RED_SANDSTONE_OW = create("ore_redsandstone", RED_SANDSTONE, 33, 20, 0, 128);
    private static RegistryKey<ConfiguredFeature<?, ?>> SAND_OW = create("ore_sand", SAND, 33, 20, 0, 128);
    private static RegistryKey<ConfiguredFeature<?, ?>> REDSAND_OW = create("ore_redsand", RED_SAND, 33, 20, 0, 128);
    private static RegistryKey<ConfiguredFeature<?, ?>> DESERT_GRAVEL_OW = create("ore_desert_gravel", DESERT_GRAVEL, 33, 20, 0, 128);
    private static RegistryKey<ConfiguredFeature<?, ?>> DRY_MOSSY_OW = create("ore_dry_mossy", DRY_MOSS_STONE, 20, 10, 0, 64);
    private static RegistryKey<ConfiguredFeature<?, ?>> PUMICE_OW = create("ore_pumice", PUMICE, 15, 10, 0, 50);
    
    private static RegistryKey<ConfiguredFeature<?, ?>> JASPER_OW = create("ore_jasper", JASPER, 15, 5, 0, 50);
    private static RegistryKey<ConfiguredFeature<?, ?>> GRANITE_OW = create("ore_granite", GREEN_GRANITE, 15, 5, 0, 50);
    private static RegistryKey<ConfiguredFeature<?, ?>> LIMESTONE_OW = create("ore_limestone", LIMESTONE, 15, 10, 0, 50);
    private static RegistryKey<ConfiguredFeature<?, ?>> BLEACHED_GRAVEL_OW = create("ore_bleached_gravel", BLEACHED_GRAVEL, 33, 10, 0, 128);
    private static RegistryKey<ConfiguredFeature<?, ?>> SCALDING_OW_DESERT = create("ore_scalding_overworld_desert", SCALDING_SANDSTONE, 33, 15, 0, 64);
    private static RegistryKey<ConfiguredFeature<?, ?>> SCALDING_OW = create("ore_scalding_overworld", SCALDING_STONE, 20, 8, 0, 32);

    //snow ores
    private static RegistryKey<ConfiguredFeature<?, ?>> ICE_OW = create("ore_ice_overworld", ICE, 33, 20, 0, 128);
    private static RegistryKey<ConfiguredFeature<?, ?>> SNOW_OW = create("ore_snow_overworld", SNOW_BLOCK, 33, 20, 0, 128);
    private static RegistryKey<ConfiguredFeature<?, ?>> PACKED_ICE_OW = create("ore_packed_ice_overworld", PACKED_ICE, 16, 20, 0, 128);
    private static RegistryKey<ConfiguredFeature<?, ?>> BLUE_OW = create("ore_blue_overworld", BLUE_ICE, 16, 5, 0, 128);
    private static RegistryKey<ConfiguredFeature<?, ?>> GLACIAL_OW = create("ore_glacial_stone_overworld", GLACIAL_STONE, 5, 5, 0, 48);
    private static RegistryKey<ConfiguredFeature<?, ?>> POWDER_SNOW_OW = create("ore_powder_snow_overworld", POWDER_SNOW, 20, 15, 0, 128);

    //nether ores
    private static RegistryKey<ConfiguredFeature<?, ?>> ORE_SALT_NE = create("ore_salt_nether", NETHER_SALT, 12, 10, YOffset.getBottom(), YOffset.getTop());
    private static RegistryKey<ConfiguredFeature<?, ?>> ORE_COAL_NE = create("ore_coal_nether", NETHER_COAL_ORE, 12, 10, YOffset.getBottom(), YOffset.getTop());
    
    private static RegistryKey<ConfiguredFeature<?, ?>> OCEANSTONE_OW = create("ore_ocean_overworld", OCEAN_STONE, 33, 10, 0, 64);
    private static RegistryKey<ConfiguredFeature<?, ?>> SWAMPSTONE_OW = create("ore_swamp_overworld", SWAMP_STONE, 33, 20, 0, 128);
    private static RegistryKey<ConfiguredFeature<?, ?>> DARKSTONE_OW = create("ore_dark_overworld", DARK_STONE, 33, 15, 0, 128);
    private static RegistryKey<ConfiguredFeature<?, ?>> SCALDING_JUNGLE_OW = create("ore_jungle_scalding_overworld", SCALDING_VOLC, 20, 15, 0, 64);
    private static RegistryKey<ConfiguredFeature<?, ?>> JUNGLE_STONE_OW = create("ore_jungle_stone_overworld", JUNGLE, 20, 15, 0, 128);
    private static RegistryKey<ConfiguredFeature<?, ?>> JUNGLE_MOSSY_OW = create("ore_jungle_mossy_overworld", JUNGLE_MOSSY, 20, 15, 0, 128);
    private static RegistryKey<ConfiguredFeature<?, ?>> JUNGLE_SPOREY_OW = create("ore_jungle_sporey_overworld", JUNGLE_SPOREY, 5, 15, 0, 128);
    private static RegistryKey<ConfiguredFeature<?, ?>> MOSSY_OW = create("ore_mossy_overworld", STONE_MOSSY, 33, 15, 0, 128);
    private static RegistryKey<ConfiguredFeature<?, ?>> TAIGASTONE_OW = create("ore_taiga_overworld", TAIGA_STONE, 33, 15, 0, 128);

    public static void initialize(SimpleConfig config) {
        boolean blobsEnable = !config.get("disable-blobs-gen", false);
        config.script("disable-blobs-gen", 
            "Disable blobs feature gens like stone variants, mud, sandstone, snow, sand, and biome-specific blobs, but not ores."
        );
        
        var underground = GenerationStep.Feature.UNDERGROUND_ORES;
        Predicate<BiomeSelectionContext> snowOnly;
        snowOnly = context -> context.getBiome().getPrecipitation() == Precipitation.SNOW;

        //jungle ores
        if (blobsEnable) {
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE), underground, SCALDING_JUNGLE_OW);
        }
        

        if (blobsEnable) {
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE), underground, JUNGLE_STONE_OW);
        }

        if (blobsEnable) {
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE), underground, JUNGLE_MOSSY_OW);
        }

        if (blobsEnable) {
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE), underground, MUD_JUNGLES_OW);
        }

        if (blobsEnable) {
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE), underground, JUNGLE_SPOREY_OW); 
        }

        //all biomes except oceans, deserts, and frozen biomes
        if (blobsEnable) {
            var select = BiomeSelectors.categories(Category.DESERT, Category.ICY, Category.UNDERGROUND);
            BiomeModifications.addFeature(c -> !select.test(c) && !snowOnly.test(c), underground, MOSSY_OW);
        }
        
        //just the one above ^-^

        if (blobsEnable) {
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.OCEAN), underground, OCEANSTONE_OW);
        }

        if (blobsEnable) {
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.OCEAN), underground, GRANITE_OW);
        }

        if (blobsEnable) {
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.SWAMP), underground, SWAMPSTONE_OW);
        }

        if (blobsEnable) {
            BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST), underground, DARKSTONE_OW);
        }

        //plains and forests
        if (blobsEnable) {
            Predicate<BiomeSelectionContext> select;
            select = c -> c.getBiomeKey().equals(BiomeKeys.FOREST) || c.getBiome().getCategory() == Category.PLAINS;
            BiomeModifications.addFeature(select, underground, LIMESTONE_OW);
        }

        //desert only ores
        if (blobsEnable) {
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.DESERT), underground, PUMICE_OW);
        }

        //badlands only ores
        if (blobsEnable) {
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.MESA), underground, JASPER_OW);
        }
        
        //desert ores and badlands
        if (blobsEnable) {
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.MESA, Category.DESERT), underground, SAND_OW);
        }

        if (blobsEnable) {
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.MESA, Category.DESERT), underground, SANDSTONE_OW);
        }

        if (blobsEnable) {
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.MESA, Category.DESERT), underground, DRY_MOSSY_OW);
        }

        if (blobsEnable) {
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.MESA, Category.DESERT), underground, DESERT_GRAVEL_OW);
        }
        
        if (blobsEnable) {
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.MESA, Category.DESERT), underground, SCALDING_OW_DESERT);
        }

        //badlands ores
        if (blobsEnable) {
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.MESA), underground, REDSAND_OW);
        }

        if (blobsEnable) {
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.MESA), underground, RED_SANDSTONE_OW);
        }
        
        //scalding all biomes
        if (blobsEnable) {
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), underground, SCALDING_OW);
        }

        //snow ores
        if (blobsEnable) {
            BiomeModifications.addFeature(snowOnly, underground, ICE_OW);
        }

        if (blobsEnable) {
            BiomeModifications.addFeature(snowOnly, underground, PACKED_ICE_OW);
        }

        if (blobsEnable) {
            BiomeModifications.addFeature(snowOnly, underground, SNOW_OW);
        }
        

        if (blobsEnable) {
            BiomeModifications.addFeature(snowOnly, underground, BLUE_OW);
        }
        

        if (blobsEnable) {
            BiomeModifications.addFeature(snowOnly, underground, POWDER_SNOW_OW);
        }

        //mountain ores
        if (blobsEnable) {
            BiomeModifications.addFeature(c -> c.getBiome().getCategory() == Category.EXTREME_HILLS, underground, GLACIAL_OW);
        }
        
        if (blobsEnable) {
            BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MODIFIED_GRAVELLY_MOUNTAINS, BiomeKeys.GRAVELLY_MOUNTAINS), underground, BLEACHED_GRAVEL_OW);
        }
        

        //overworld ores
        {
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), underground, ORE_SALT_OW);
        }

        {
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), underground, MIXED_ORE_OW);
        }

        {
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), underground, SALTPETER_ORE_OW);
        }

        if (blobsEnable) {
            Predicate<BiomeSelectionContext> select 
            = c -> (BiomeSelectors.foundInOverworld().test(c) && c.getBiome().getCategory() != Category.DESERT && !snowOnly.test(c));
            BiomeModifications.addFeature(select, underground, MUD_OW);
        }

        if (blobsEnable) {
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE), underground, VOLC_SAND_OW);
        }
        
        if (blobsEnable) {
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE), underground, VOLC_ROCK_OW);
        }

        //nether ores
        if (blobsEnable) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), underground, ORE_SALT_NE);
        }
        
        if (blobsEnable) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), underground, ORE_COAL_NE);
        }

        //taiga ores
        if (blobsEnable) {
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.TAIGA), underground, TAIGASTONE_OW);
        }
    }
    
    private static RegistryKey<ConfiguredFeature<?, ?>> create(String id, Block block, int size, int repeat, int yMinOffset, int yMaxOffset) {
        return create(id, block, size, repeat, YOffset.aboveBottom(yMinOffset), YOffset.fixed(yMaxOffset));
    }
    
    private static RegistryKey<ConfiguredFeature<?, ?>> create(String id, Block block, int size, int repeat, YOffset yMinOffset, YOffset yMaxOffset) {
        var config = Feature.ORE
                .configure(new OreFeatureConfig(
                        OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                        block.getDefaultState(),
                        size)) // Vein size
                .range(new RangeDecoratorConfig(
                        // You can also use one of the other height providers if you don't want a uniform distribution
                        UniformHeightProvider.create(yMinOffset, yMaxOffset))) // Inclusive min and max height
                .spreadHorizontally()
                .repeat(repeat);
        return  RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(MOD_ID, id));
    }
}