package io.github.linkle.valleycraft.init.features;

import io.github.linkle.valleycraft.ValleyMain;
import io.github.linkle.valleycraft.init.StoneBlocks;
import io.github.linkle.valleycraft.utils.Util;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.RuleTest;
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
import net.minecraft.world.gen.feature.*;

import java.util.ArrayList;
import java.util.function.Predicate;

import static net.minecraft.block.Blocks.*;

public class OreFeatures {
    //overworld ores
    private static final ConfiguredFeature<?, ?> SALT_ORE = create(StoneBlocks.SALT_ORE, 6);
    private static final ConfiguredFeature<?, ?> MIXED_ORE = create(StoneBlocks.MIXED_ORE, 6);
    private static final ConfiguredFeature<?, ?> SALTPETER_ORE = create(StoneBlocks.SALTPETER_ORE, 6);
    private static final ConfiguredFeature<?, ?> JUNGLE_MUD = create(StoneBlocks.B_CLAY, 33);
    private static final ConfiguredFeature<?, ?> MUD = create(StoneBlocks.B_CLAY, 33);
    private static final ConfiguredFeature<?, ?> VOLCANIC_ASH = create(StoneBlocks.VOLCANIC_ASH, 33);
    private static final ConfiguredFeature<?, ?> VOLCANIC_STONE = create(StoneBlocks.VOLCANIC_STONE, 33);

    //desert ores
    private static final ConfiguredFeature<?, ?> SANDSTONE = create(Blocks.SANDSTONE, 33);
    private static final ConfiguredFeature<?, ?> RED_SANDSTONE = create(Blocks.RED_SANDSTONE, 33);
    private static final ConfiguredFeature<?, ?> SAND = create(Blocks.SAND, 33);
    private static final ConfiguredFeature<?, ?> RED_SAND = create(Blocks.RED_SAND, 33);
    private static final ConfiguredFeature<?, ?> DESERT_GRAVEL = create(StoneBlocks.DESERT_GRAVEL, 33);
    private static final ConfiguredFeature<?, ?> DRY_MOSS = create(StoneBlocks.DRY_MOSS_STONE, 20);
    private static final ConfiguredFeature<?, ?> PUMICE = create(StoneBlocks.PUMICE, 15);
    
    private static final ConfiguredFeature<?, ?> JASPER = create(StoneBlocks.JASPER, 15);
    private static final ConfiguredFeature<?, ?> GREEN_GRANITE = create(StoneBlocks.GREEN_GRANITE, 15);
    private static final ConfiguredFeature<?, ?> LIMESTONE = create(StoneBlocks.LIMESTONE, 15);
    private static final ConfiguredFeature<?, ?> SCALDING_SANDSTONE = create(StoneBlocks.SCALDING_SANDSTONE, 33);
    private static final ConfiguredFeature<?, ?> SCALDING_STONE = create(StoneBlocks.SCALDING_STONE, 20);

    //snow ores
    private static final ConfiguredFeature<?, ?> ICE_OW = create(ICE, 33);
    private static final ConfiguredFeature<?, ?> SNOW_OW = create(SNOW_BLOCK, 33);
    private static final ConfiguredFeature<?, ?> PACKED_ICE_OW = create(PACKED_ICE, 16);
    private static final ConfiguredFeature<?, ?> BLUE_OW = create(BLUE_ICE, 16);
    private static final ConfiguredFeature<?, ?> GLACIAL_OW = create(StoneBlocks.GLACIAL_STONE, 5);
    private static final ConfiguredFeature<?, ?> POWDER_SNOW_OW = create(POWDER_SNOW, 20);

    //nether ores
    private static final ConfiguredFeature<?, ?> NETHER_SALT_ORE = create(OreConfiguredFeatures.NETHERRACK, StoneBlocks.NETHER_SALT, 12);
    private static final ConfiguredFeature<?, ?> NETHER_COAL_ORE = create(OreConfiguredFeatures.NETHERRACK, StoneBlocks.NETHER_COAL_ORE, 12);
    
    private static final ConfiguredFeature<?, ?> OCEAN_STONE = create(StoneBlocks.OCEAN_STONE, 33);
    private static final ConfiguredFeature<?, ?> SWAMP_STONE = create(StoneBlocks.SWAMP_STONE, 33);
    private static final ConfiguredFeature<?, ?> DARK_STONE = create(StoneBlocks.DARK_STONE, 33);
    private static final ConfiguredFeature<?, ?> SCALDING_VOLCANIC_STONE_JUNGLE = create(StoneBlocks.SCALDING_VOLC, 20);
    private static final ConfiguredFeature<?, ?> CARMINE_STONE = create(StoneBlocks.JUNGLE, 20);
    private static final ConfiguredFeature<?, ?> MOSSY_CARMINE_STONE = create(StoneBlocks.JUNGLE_MOSSY, 20);
    private static final ConfiguredFeature<?, ?> SPOREY_CARMINE_STONE = create(StoneBlocks.JUNGLE_SPOREY, 5);
    private static final ConfiguredFeature<?, ?> MOSSY_STONE = create(StoneBlocks.STONE_MOSSY, 33);
    private static final ConfiguredFeature<?, ?> TAIGA_STONE = create(StoneBlocks.TAIGA_STONE, 33);

    public static void initialize() {
        var underground = GenerationStep.Feature.RAW_GENERATION;
        final Predicate<BiomeSelectionContext> snowOnly;
        snowOnly = context -> context.getBiome().getPrecipitation() == Precipitation.SNOW;

        //jungle ores
        if (ValleyMain.CONFIG.blobsGenerations.generateScaldingVolcanicStoneInJungle) {
            var key = register(SCALDING_VOLCANIC_STONE_JUNGLE, 15, 0, 64, "scalding_jungle_stone");
            addFeature(BiomeSelectors.categories(Category.JUNGLE), key, false);
        }

        if (ValleyMain.CONFIG.blobsGenerations.generateCarmineStone) {
            var key = register(CARMINE_STONE, 15, 0, 128, "carmine_stone_jungle");
            addFeature(BiomeSelectors.categories(Category.JUNGLE), key, false);
        }

        if (ValleyMain.CONFIG.blobsGenerations.generateMossyCarmineStone) {
            var key = register(MOSSY_CARMINE_STONE, 15, 0, 128, "ore_jungle_mossy_overworld");
            addFeature(BiomeSelectors.categories(Category.JUNGLE), key, false);
        }

        if (ValleyMain.CONFIG.blobsGenerations.generateMudInJungle) {
            var key = register(JUNGLE_MUD, 3, 32, 128, "ore_mud_jungle_overworld");
            addFeature(BiomeSelectors.categories(Category.JUNGLE), key, false);
        }

        if (ValleyMain.CONFIG.blobsGenerations.generateSporeyCarmineStone) {
            var key = register(SPOREY_CARMINE_STONE, 15, 0, 128, "ore_jungle_sporey_overworld");
            addFeature(BiomeSelectors.categories(Category.JUNGLE), key, false);
        }

        //all biomes except oceans, deserts, and frozen biomes
        if (ValleyMain.CONFIG.blobsGenerations.generateMossyStone) {
            var key = register(MOSSY_STONE, 15, 0, 128, "ore_mossy_overworld");
            var select = BiomeSelectors.categories(Category.DESERT, Category.ICY);
            addFeature(c -> !select.test(c) && !snowOnly.test(c), key, false);
        }

        //just the one above ^-^

        if (ValleyMain.CONFIG.blobsGenerations.generateOceanStone) {
            var key = register(OCEAN_STONE, 10, 0, 64, "ore_ocean_overworld");
            addFeature(BiomeSelectors.categories(Category.OCEAN), key, false);
        }

        if (ValleyMain.CONFIG.blobsGenerations.generateGreenGranite) {
            var key = register(GREEN_GRANITE, 5, 0, 50, "ore_granite");
            addFeature(BiomeSelectors.categories(Category.OCEAN), key, false);
        }

        if (ValleyMain.CONFIG.blobsGenerations.generateSwampStone) {
            var key = register(SWAMP_STONE, 20, 0, 128, "ore_swamp_overworld");
            addFeature(BiomeSelectors.categories(Category.SWAMP), key, false);
        }

        if (ValleyMain.CONFIG.blobsGenerations.generateDarkStone) {
            var key = register(DARK_STONE, 15, 0, 128, "ore_dark_overworld");
            addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST), key, false);
        }

        //plains and forests
        if (ValleyMain.CONFIG.blobsGenerations.generateLimestone) {
            var key = register(LIMESTONE, 10, 0, 50, "ore_limestone");
            Predicate<BiomeSelectionContext> select;
            select = c -> c.getBiomeKey().equals(BiomeKeys.FOREST) || c.getBiome().getCategory() == Category.PLAINS;
            addFeature(select, key, false);
        }

        //desert only ores
        if (ValleyMain.CONFIG.blobsGenerations.generatePumice) {
            var key = register(PUMICE, 10, 0, 50, "ore_pumice");
            addFeature(BiomeSelectors.categories(Category.DESERT), key, false);
        }

        //badlands only ores
        if (ValleyMain.CONFIG.blobsGenerations.generateJasper) {
            var key = register(JASPER, 5, 0, 50, "ore_jasper");
            addFeature(BiomeSelectors.categories(Category.MESA), key, false);
        }

        //desert ores and badlands
        if (ValleyMain.CONFIG.blobsGenerations.generateUndergroundSand) {
            var key = register(SAND, 20, 0, 128, "ore_sand");
            addFeature(BiomeSelectors.categories(Category.MESA, Category.DESERT), key, false);
        }

        if (ValleyMain.CONFIG.blobsGenerations.generateUndergroundSandstone) {
            var key = register(SANDSTONE, 20, 0, 128, "ore_sandstone");
            addFeature(BiomeSelectors.categories(Category.MESA, Category.DESERT), key, false);
        }

        if (ValleyMain.CONFIG.blobsGenerations.generateDryMoss) {
            var key = register(DRY_MOSS, 10, 0, 64, "ore_dry_mossy");
            addFeature(BiomeSelectors.categories(Category.MESA, Category.DESERT), key, false);
        }

        if (ValleyMain.CONFIG.blobsGenerations.generateGravelInDeserts) {
            var key = register(DESERT_GRAVEL, 20, 0, 128, "ore_desert_gravel");
            addFeature(BiomeSelectors.categories(Category.MESA, Category.DESERT), key, false);
        }

        if (ValleyMain.CONFIG.blobsGenerations.generateScaldingSandstone) {
            var key = register(SCALDING_SANDSTONE, 15, 0, 64, "ore_scalding_overworld_desert");
            addFeature(BiomeSelectors.categories(Category.MESA, Category.DESERT), key, false);
        }

        //badlands ores
        if (ValleyMain.CONFIG.blobsGenerations.generateUndergroundRedSand) {
            var key = register(RED_SAND, 20, 0, 128, "ore_redsand");
            addFeature(BiomeSelectors.categories(Category.MESA), key, false);
        }

        if (ValleyMain.CONFIG.blobsGenerations.generateUndergroundRedSandstone) {
            var key = register(RED_SANDSTONE, 20, 0, 128, "ore_redsandstone");
            addFeature(BiomeSelectors.categories(Category.MESA), key, false);
        }
        
        //scalding all biomes
        if (ValleyMain.CONFIG.blobsGenerations.generateScaldingStone) {
            var key = register(SCALDING_STONE, 8, 0, 32, "ore_scalding_overworld");
            addFeature(BiomeSelectors.foundInOverworld(), key, true);
        }

        //snow ores
        if (ValleyMain.CONFIG.blobsGenerations.generateUndergroundIce) {
            var key = register(ICE_OW, 20, 0, 128, "ore_ice_overworld");
            addFeature(snowOnly, key, false);
        }

        if (ValleyMain.CONFIG.blobsGenerations.generateUndergroundPackedIce) {
            var key = register(PACKED_ICE_OW, 20, 0, 128, "ore_packed_ice_overworld");
            addFeature(snowOnly, key, false);
        }

        if (ValleyMain.CONFIG.blobsGenerations.generateUndergroundSnow) {
            var key = register(SNOW_OW, 20, 0, 128, "ore_snow_overworld");
            addFeature(snowOnly, key, false);
        }
        

        if (ValleyMain.CONFIG.blobsGenerations.generateUndergroundBlueIce) {
            var key = register(BLUE_OW, 5, 0, 128, "ore_blue_overworld");
            addFeature(snowOnly, key, false);
        }
        

        if (ValleyMain.CONFIG.blobsGenerations.generateUndergroundPowderedSnow) {
            var key = register(POWDER_SNOW_OW, 15, 0, 128, "ore_powder_snow_overworld");
            addFeature(snowOnly, key, false);
        }

        //mountain ores
        if (ValleyMain.CONFIG.blobsGenerations.generateGlacialStone) {
            var key = register(GLACIAL_OW, 5, 0, 48, "ore_glacial_stone_overworld");
            addFeature(c -> c.getBiome().getCategory() == Category.EXTREME_HILLS, key, false);
        }
        

        //overworld ores
        if (ValleyMain.CONFIG.blobsGenerations.generateSaltOre) {
            var key = register(SALT_ORE, 15, 0, 64, "ore_salt_overworld");
            addFeature(BiomeSelectors.foundInOverworld(), key, true);
        }

        if (ValleyMain.CONFIG.blobsGenerations.generateMixedOre) {
            var key = register(MIXED_ORE, 10, 0, 32, "ore_mixed_overworld");
            addFeature(BiomeSelectors.foundInOverworld(), key, true);
        }

        if (ValleyMain.CONFIG.blobsGenerations.generateSaltpeterOre) {
            var key = register(SALTPETER_ORE, 6, 0, 32, "ore_saltpeter_overworld");
            addFeature(BiomeSelectors.foundInOverworld(), key, true);
        }

        if (ValleyMain.CONFIG.blobsGenerations.generateMud) {
            var key = register(MUD, 5, 32, 64, "mud_overworld");
            
            var overWorldOnly = BiomeSelectors.foundInOverworld();
            var blackList = BiomeSelectors.categories(Category.DESERT, Category.ICY);
            Predicate<BiomeSelectionContext> select = (context) -> {
                if (!overWorldOnly.test(context) || blackList.test(context) || snowOnly.test(context)) {
                    return false;
                }
                return true;
            };
            
            addFeature(select, key, false);
        }

        if (ValleyMain.CONFIG.blobsGenerations.generateVolcanicAsh) {
            var key = register(VOLCANIC_ASH, 10, 0, 128, "volcanic_sand_overworld");
            addFeature(BiomeSelectors.categories(Category.JUNGLE), key, false);
        }
        
        if (ValleyMain.CONFIG.blobsGenerations.generateVolcanicStone) {
            var key = register(VOLCANIC_STONE, 20, 0, 128, "volcanic_stone_overworld");
            addFeature(BiomeSelectors.categories(Category.JUNGLE), key, false);
        }

        //nether ores
        if (ValleyMain.CONFIG.blobsGenerations.generateNetherSaltOre) {
            var key = register(NETHER_SALT_ORE, 10, YOffset.getBottom(), YOffset.getTop(), "ore_salt_nether");
            addFeature(BiomeSelectors.foundInTheNether(), key, true);
        }
        
        if (ValleyMain.CONFIG.blobsGenerations.generateNetherCoalOre) {
            var key = register(NETHER_COAL_ORE, 10, YOffset.getBottom(), YOffset.getTop(), "ore_coal_nether");
            addFeature(BiomeSelectors.foundInTheNether(), key, true);
        }

        //taiga ores
        if (ValleyMain.CONFIG.blobsGenerations.generateTaigaStone) {
            var key = register(TAIGA_STONE, 15, 0, 128, "ore_taiga_overworld");
            addFeature(BiomeSelectors.categories(Category.TAIGA), key, false);
        }
    }
    
    /** 
     * @param underbiome if whether it include it in underground biomes.
     * */
    private static void addFeature(Predicate<BiomeSelectionContext> selector, RegistryKey<PlacedFeature> key, boolean underbiome) {
        Predicate<BiomeSelectionContext> select = (context) -> {
            var cat = context.getBiome().getCategory();
            return selector.test(context) && (underbiome ? true : cat != Category.UNDERGROUND);
        };
        BiomeModifications.addFeature(select, GenerationStep.Feature.UNDERGROUND_ORES, key);
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
        return create(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, block, size);
    }
    
    private static ConfiguredFeature<OreFeatureConfig, ?> create(RuleTest test, Block block, int size) {
        return Feature.ORE.configure(new OreFeatureConfig(test, block.getDefaultState(), size));
    }
}