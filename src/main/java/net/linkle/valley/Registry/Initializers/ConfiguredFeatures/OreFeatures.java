package net.linkle.valley.Registry.Initializers.ConfiguredFeatures;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.linkle.valley.Registry.Utils.SimpleConfig;
import net.linkle.valley.Registry.Utils.Util;
import net.minecraft.block.Block;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.biome.Biome.Precipitation;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.CountPlacementModifier;
import net.minecraft.world.gen.decorator.HeightRangePlacementModifier;
import net.minecraft.world.gen.decorator.PlacementModifier;
import net.minecraft.world.gen.decorator.SquarePlacementModifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreConfiguredFeatures;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.PlacedFeature;

import static net.linkle.valley.Registry.Initializers.StoneBlocks.*;
import static net.minecraft.block.Blocks.*;

import java.util.ArrayList;
import java.util.function.Predicate;

public class OreFeatures {
    //overworld ores
    private static ConfiguredFeature<?, ?> ORE_SALT_OW = create(SALT_ORE, 6);
    private static ConfiguredFeature<?, ?> MIXED_ORE_OW = create(MIXED_ORE, 6);
    private static ConfiguredFeature<?, ?> SALTPETER_ORE_OW = create(SALTPETER_ORE, 6);
    private static ConfiguredFeature<?, ?> MUD_OW = create(B_CLAY, 33);
    private static ConfiguredFeature<?, ?> MUD_JUNGLES_OW = create(B_CLAY, 33);
    private static ConfiguredFeature<?, ?> VOLC_SAND_OW = create(VOLCANIC_ASH, 33);
    private static ConfiguredFeature<?, ?> VOLC_ROCK_OW = create(VOLCANIC_STONE, 33);

    //desert ores
    private static ConfiguredFeature<?, ?> SANDSTONE_OW = create(SANDSTONE, 33);
    private static ConfiguredFeature<?, ?> RED_SANDSTONE_OW = create(RED_SANDSTONE, 33);
    private static ConfiguredFeature<?, ?> SAND_OW = create(SAND, 33);
    private static ConfiguredFeature<?, ?> REDSAND_OW = create(RED_SAND, 33);
    private static ConfiguredFeature<?, ?> DESERT_GRAVEL_OW = create(DESERT_GRAVEL, 33);
    private static ConfiguredFeature<?, ?> DRY_MOSSY_OW = create(DRY_MOSS_STONE, 20);
    private static ConfiguredFeature<?, ?> PUMICE_OW = create(PUMICE, 15);
    
    private static ConfiguredFeature<?, ?> JASPER_OW = create(JASPER, 15);
    private static ConfiguredFeature<?, ?> GRANITE_OW = create(GREEN_GRANITE, 15);
    private static ConfiguredFeature<?, ?> LIMESTONE_OW = create(LIMESTONE, 15);
    private static ConfiguredFeature<?, ?> BLEACHED_GRAVEL_OW = create(BLEACHED_GRAVEL, 33);
    private static ConfiguredFeature<?, ?> SCALDING_OW_DESERT = create(SCALDING_SANDSTONE, 33);
    private static ConfiguredFeature<?, ?> SCALDING_OW = create(SCALDING_STONE, 20);

    //snow ores
    private static ConfiguredFeature<?, ?> ICE_OW = create(ICE, 33);
    private static ConfiguredFeature<?, ?> SNOW_OW = create(SNOW_BLOCK, 33);
    private static ConfiguredFeature<?, ?> PACKED_ICE_OW = create(PACKED_ICE, 16);
    private static ConfiguredFeature<?, ?> BLUE_OW = create(BLUE_ICE, 16);
    private static ConfiguredFeature<?, ?> GLACIAL_OW = create(GLACIAL_STONE, 5);
    private static ConfiguredFeature<?, ?> POWDER_SNOW_OW = create(POWDER_SNOW, 20);

    //nether ores
    private static ConfiguredFeature<?, ?> ORE_SALT_NE = create(NETHER_SALT, 12);
    private static ConfiguredFeature<?, ?> ORE_COAL_NE = create(NETHER_COAL_ORE, 12);
    
    private static ConfiguredFeature<?, ?> OCEANSTONE_OW = create(OCEAN_STONE, 33);
    private static ConfiguredFeature<?, ?> SWAMPSTONE_OW = create(SWAMP_STONE, 33);
    private static ConfiguredFeature<?, ?> DARKSTONE_OW = create(DARK_STONE, 33);
    private static ConfiguredFeature<?, ?> SCALDING_JUNGLE_OW = create(SCALDING_VOLC, 20);
    private static ConfiguredFeature<?, ?> JUNGLE_STONE_OW = create(JUNGLE, 20);
    private static ConfiguredFeature<?, ?> JUNGLE_MOSSY_OW = create(JUNGLE_MOSSY, 20);
    private static ConfiguredFeature<?, ?> JUNGLE_SPOREY_OW = create(JUNGLE_SPOREY, 5);
    private static ConfiguredFeature<?, ?> MOSSY_OW = create(STONE_MOSSY, 33);
    private static ConfiguredFeature<?, ?> TAIGASTONE_OW = create(TAIGA_STONE, 33);

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
            var key = register(SCALDING_JUNGLE_OW, 15, 0, 64, "ore_jungle_scalding_overworld");
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE), underground, key);
        }
        

        if (blobsEnable) {
            var key = register(JUNGLE_STONE_OW, 15, 0, 128, "ore_jungle_stone_overworld");
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE), underground, key);
        }

        if (blobsEnable) {
            var key = register(JUNGLE_MOSSY_OW, 15, 0, 128, "ore_jungle_mossy_overworld");
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE), underground, key);
        }

        if (blobsEnable) {
            var key = register(MUD_JUNGLES_OW, 3, 0, 128, "ore_mud_jungle_overworld");
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE), underground, key);
        }

        if (blobsEnable) {
            var key = register(JUNGLE_SPOREY_OW, 15, 0, 128, "ore_jungle_sporey_overworld");
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE), underground, key); 
        }

        //all biomes except oceans, deserts, and frozen biomes
        if (blobsEnable) {
            var key = register(MOSSY_OW, 15, 0, 128, "ore_mossy_overworld");
            var select = BiomeSelectors.categories(Category.DESERT, Category.ICY, Category.UNDERGROUND);
            BiomeModifications.addFeature(c -> !select.test(c) && !snowOnly.test(c), underground, key);
        }
        
        //just the one above ^-^

        if (blobsEnable) {
            var key = register(OCEANSTONE_OW, 10, 0, 64, "ore_ocean_overworld");
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.OCEAN), underground, key);
        }

        if (blobsEnable) {
            var key = register(GRANITE_OW, 5, 0, 50, "ore_granite");
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.OCEAN), underground, key);
        }

        if (blobsEnable) {
            var key = register(SWAMPSTONE_OW, 20, 0, 128, "ore_swamp_overworld");
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.SWAMP), underground, key);
        }

        if (blobsEnable) {
            var key = register(DARKSTONE_OW, 15, 0, 128, "ore_dark_overworld");
            BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST), underground, key);
        }

        //plains and forests
        if (blobsEnable) {
            var key = register(LIMESTONE_OW, 10, 0, 50, "ore_limestone");
            Predicate<BiomeSelectionContext> select;
            select = c -> c.getBiomeKey().equals(BiomeKeys.FOREST) || c.getBiome().getCategory() == Category.PLAINS;
            BiomeModifications.addFeature(select, underground, key);
        }

        //desert only ores
        if (blobsEnable) {
            var key = register(PUMICE_OW, 10, 0, 50, "ore_pumice");
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.DESERT), underground, key);
        }

        //badlands only ores
        if (blobsEnable) {
            var key = register(JASPER_OW, 5, 0, 50, "ore_jasper");
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.MESA), underground, key);
        }
        
        //desert ores and badlands
        if (blobsEnable) {
            var key = register(SAND_OW, 20, 0, 128, "ore_sand");
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.MESA, Category.DESERT), underground, key);
        }

        if (blobsEnable) {
            var key = register(SANDSTONE_OW, 20, 0, 128, "ore_sandstone");
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.MESA, Category.DESERT), underground, key);
        }

        if (blobsEnable) {
            var key = register(DRY_MOSSY_OW, 10, 0, 64, "ore_dry_mossy");
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.MESA, Category.DESERT), underground, key);
        }

        if (blobsEnable) {
            var key = register(DESERT_GRAVEL_OW, 20, 0, 128, "ore_desert_gravel");
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.MESA, Category.DESERT), underground, key);
        }
        
        if (blobsEnable) {
            var key = register(SCALDING_OW_DESERT, 15, 0, 64, "ore_scalding_overworld_desert");
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.MESA, Category.DESERT), underground, key);
        }

        //badlands ores
        if (blobsEnable) {
            var key = register(REDSAND_OW, 20, 0, 128, "ore_redsand");
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.MESA), underground, key);
        }

        if (blobsEnable) {
            var key = register(RED_SANDSTONE_OW, 20, 0, 128, "ore_redsandstone");
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.MESA), underground, key);
        }
        
        //scalding all biomes
        if (blobsEnable) {
            var key = register(SCALDING_OW, 8, 0, 32, "ore_scalding_overworld");
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), underground, key);
        }

        //snow ores
        if (blobsEnable) {
            var key = register(ICE_OW, 20, 0, 128, "ore_ice_overworld");
            BiomeModifications.addFeature(snowOnly, underground, key);
        }

        if (blobsEnable) {
            var key = register(PACKED_ICE_OW, 20, 0, 128, "ore_packed_ice_overworld");
            BiomeModifications.addFeature(snowOnly, underground, key);
        }

        if (blobsEnable) {
            var key = register(SNOW_OW, 20, 0, 128, "ore_snow_overworld");
            BiomeModifications.addFeature(snowOnly, underground, key);
        }
        

        if (blobsEnable) {
            var key = register(BLUE_OW, 5, 0, 128, "ore_blue_overworld");
            BiomeModifications.addFeature(snowOnly, underground, key);
        }
        

        if (blobsEnable) {
            var key = register(POWDER_SNOW_OW, 15, 0, 128, "ore_powder_snow_overworld");
            BiomeModifications.addFeature(snowOnly, underground, key);
        }

        //mountain ores
        if (blobsEnable) {
            var key = register(GLACIAL_OW, 5, 0, 48, "ore_glacial_stone_overworld");
            BiomeModifications.addFeature(c -> c.getBiome().getCategory() == Category.EXTREME_HILLS, underground, key);
        }
        

        //overworld ores
        {
            var key = register(ORE_SALT_OW, 15, 0, 64, "ore_salt_overworld");
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), underground, key);
        }

        {
            var key = register(MIXED_ORE_OW, 10, 0, 32, "ore_mixed_overworld");
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), underground, key);
        }

        {
            var key = register(SALTPETER_ORE_OW, 6, 0, 32, "ore_saltpeter_overworld");
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), underground, key);
        }

        if (blobsEnable) {
            var key = register(MUD_OW, 5, 0, 64, "mud_overworld");
            Predicate<BiomeSelectionContext> select 
            = c -> (BiomeSelectors.foundInOverworld().test(c) && c.getBiome().getCategory() != Category.DESERT && !snowOnly.test(c));
            BiomeModifications.addFeature(select, underground, key);
        }

        if (blobsEnable) {
            var key = register(VOLC_SAND_OW, 10, 0, 128, "volcanic_sand_overworld");
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE), underground, key);
        }
        
        if (blobsEnable) {
            var key = register(VOLC_ROCK_OW, 20, 0, 128, "volcanic_stone_overworld");
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.JUNGLE), underground, key);
        }

        //nether ores
        if (blobsEnable) {
            var key = register(ORE_SALT_NE, 10, YOffset.getBottom(), YOffset.getTop(), "ore_salt_nether");
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), underground, key);
        }
        
        if (blobsEnable) {
            var key = register(ORE_COAL_NE, 10, YOffset.getBottom(), YOffset.getTop(), "ore_coal_nether");
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), underground, key);
        }

        //taiga ores
        if (blobsEnable) {
            var key = register(TAIGASTONE_OW, 15, 0, 128, "ore_taiga_overworld");
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.TAIGA), underground, key);
        }
    }
    
    private static RegistryKey<PlacedFeature> register(ConfiguredFeature<?, ?> config, int repeat, int yMinOffset, int yMaxOffset, String id) {
        return register(config, repeat, YOffset.fixed(yMinOffset), YOffset.fixed(yMaxOffset), id);
    }
    
    private static RegistryKey<PlacedFeature> register(ConfiguredFeature<?, ?> config, int repeat, YOffset yMinOffset, YOffset yMaxOffset, String id) {
        var list = new ArrayList<PlacementModifier>(3);
        list.add(CountPlacementModifier.of(repeat)); // number of veins per chunk
        list.add(SquarePlacementModifier.of()); // spreading horizontally
        list.add(HeightRangePlacementModifier.uniform(yMinOffset, yMaxOffset)); // height
        return Util.register(id, config, list);
    }
    
    private static ConfiguredFeature<OreFeatureConfig, ?> create(Block block, int size) {
        return Feature.ORE.configure(new OreFeatureConfig(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, block.getDefaultState(), size));
    }
}
