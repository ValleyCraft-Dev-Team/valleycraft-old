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

    public static void initialize() {
        var config = ValleyMain.CONFIG.blobsGenerations;
        final Predicate<BiomeSelectionContext> snowOnly;
        snowOnly = context -> context.getBiome().getPrecipitation() == Precipitation.SNOW;

        //jungle ores
        if (config.scaldingVolcanicStoneInJungle.enable) {
            var set = config.scaldingVolcanicStoneInJungle;
            var key = register(create(StoneBlocks.SCALDING_VOLC, set.size), set.repeat, set.getMinOffset(), set.getMaxOffset(), "scalding_jungle_stone");
            addFeature(BiomeSelectors.categories(Category.JUNGLE), key, false);
        }

        if (config.carmineStone.enable) {
            var set = config.carmineStone;
            var key = register(create(StoneBlocks.JUNGLE, set.size), set.repeat, set.getMinOffset(), set.getMaxOffset(), "carmine_stone_jungle");
            addFeature(BiomeSelectors.categories(Category.JUNGLE), key, false);
        }

        if (config.mossyCarmineStone.enable) {
            var set = config.mossyCarmineStone;
            var key = register(create(StoneBlocks.JUNGLE_MOSSY, set.size), set.repeat, set.getMinOffset(), set.getMaxOffset(), "ore_jungle_mossy_overworld");
            addFeature(BiomeSelectors.categories(Category.JUNGLE), key, false);
        }

        if (config.mudInJungle.enable) {
            var set = config.mudInJungle;
            var key = register(create(StoneBlocks.B_CLAY, set.size), set.repeat, set.getMinOffset(), set.getMaxOffset(), "ore_mud_jungle_overworld");
            addFeature(BiomeSelectors.categories(Category.JUNGLE), key, false);
        }

        if (config.sporeyCarmineStone.enable) {
            var set = config.sporeyCarmineStone;
            var key = register(create(StoneBlocks.JUNGLE_SPOREY, set.size), set.repeat, set.getMinOffset(), set.getMaxOffset(), "ore_jungle_sporey_overworld");
            addFeature(BiomeSelectors.categories(Category.JUNGLE), key, false);
        }

        //all biomes except oceans, deserts, and frozen biomes
        if (config.mossyStone.enable) {
            var set = config.mossyStone;
            var key = register(create(StoneBlocks.STONE_MOSSY, set.size), set.repeat, set.getMinOffset(), set.getMaxOffset(), "ore_mossy_overworld");
            var select = BiomeSelectors.categories(Category.DESERT, Category.ICY);
            addFeature(c -> !select.test(c) && !snowOnly.test(c), key, false);
        }

        //just the one above ^-^

        if (config.mariniteStone.enable) {
            var set = config.mariniteStone;
            var key = register(create(StoneBlocks.OCEAN_STONE, set.size), set.repeat, set.getMinOffset(), set.getMaxOffset(), "ore_ocean_overworld");
            addFeature(BiomeSelectors.categories(Category.OCEAN), key, false);
        }

        if (config.greenGranite.enable) {
            var set = config.greenGranite;
            var key = register(create(StoneBlocks.GREEN_GRANITE, set.size), set.repeat, set.getMinOffset(), set.getMaxOffset(), "ore_granite");
            addFeature(BiomeSelectors.categories(Category.OCEAN), key, false);
        }

        if (config.swampStone.enable) {
            var set = config.swampStone;
            var key = register(create(StoneBlocks.SWAMP_STONE, set.size), set.repeat, set.getMinOffset(), set.getMaxOffset(), "ore_swamp_overworld");
            addFeature(BiomeSelectors.categories(Category.SWAMP), key, false);
        }

        if (config.darkStone.enable) {
            var set = config.darkStone;
            var key = register(create(StoneBlocks.DARK_STONE, set.size), set.repeat, set.getMinOffset(), set.getMaxOffset(), "ore_dark_overworld");
            addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST), key, false);
        }

        //plains and forests
        if (config.limestone.enable) {
            var set = config.limestone;
            var key = register(create(StoneBlocks.LIMESTONE, set.size), set.repeat, set.getMinOffset(), set.getMaxOffset(), "ore_limestone");
            Predicate<BiomeSelectionContext> select;
            select = c -> c.getBiomeKey().equals(BiomeKeys.FOREST) || c.getBiome().getCategory() == Category.PLAINS;
            addFeature(select, key, false);
        }

        //desert only ores
        if (config.pumice.enable) {
            var set = config.pumice;
            var key = register(create(StoneBlocks.PUMICE, set.size), set.repeat, set.getMinOffset(), set.getMaxOffset(), "ore_pumice");
            addFeature(BiomeSelectors.categories(Category.DESERT), key, false);
        }

        //badlands only ores
        if (config.jasper.enable) {
            var set = config.jasper;
            var key = register(create(StoneBlocks.JASPER, set.size), set.repeat, set.getMinOffset(), set.getMaxOffset(), "ore_jasper");
            addFeature(BiomeSelectors.categories(Category.MESA), key, false);
        }

        //desert ores and badlands
        if (config.undergroundSand.enable) {
            var set = config.undergroundSand;
            var key = register(create(Blocks.SAND, set.size), set.repeat, set.getMinOffset(), set.getMaxOffset(), "ore_sand");
            addFeature(BiomeSelectors.categories(Category.MESA, Category.DESERT), key, false);
        }

        if (config.undergroundSandstone.enable) {
            var set = config.undergroundSandstone;
            var key = register(create(Blocks.SANDSTONE, set.size), set.repeat, set.getMinOffset(), set.getMaxOffset(), "ore_sandstone");
            addFeature(BiomeSelectors.categories(Category.MESA, Category.DESERT), key, false);
        }

        if (config.dryMoss.enable) {
            var set = config.dryMoss;
            var key = register(create(StoneBlocks.DRY_MOSS_STONE, set.size), set.repeat, set.getMinOffset(), set.getMaxOffset(), "ore_dry_mossy");
            addFeature(BiomeSelectors.categories(Category.MESA, Category.DESERT), key, false);
        }

        if (config.gravelInDeserts.enable) {
            var set = config.gravelInDeserts;
            var key = register(create(StoneBlocks.DESERT_GRAVEL, set.size), set.repeat, set.getMinOffset(), set.getMaxOffset(), "ore_desert_gravel");
            addFeature(BiomeSelectors.categories(Category.MESA, Category.DESERT), key, false);
        }

        if (config.scaldingSandstone.enable) {
            var set = config.scaldingSandstone;
            var key = register(create(StoneBlocks.SCALDING_SANDSTONE, set.size), set.repeat, set.getMinOffset(), set.getMaxOffset(), "ore_scalding_overworld_desert");
            addFeature(BiomeSelectors.categories(Category.MESA, Category.DESERT), key, false);
        }

        //badlands ores
        if (config.undergroundRedSand.enable) {
            var set = config.undergroundRedSand;
            var key = register(create(Blocks.RED_SAND, set.size), set.repeat, set.getMinOffset(), set.getMaxOffset(), "ore_redsand");
            addFeature(BiomeSelectors.categories(Category.MESA), key, false);
        }

        if (config.undergroundRedSandstone.enable) {
            var set = config.undergroundRedSandstone;
            var key = register(create(Blocks.RED_SANDSTONE, set.size), set.repeat, set.getMinOffset(), set.getMaxOffset(), "ore_redsandstone");
            addFeature(BiomeSelectors.categories(Category.MESA), key, false);
        }

        //scalding all biomes
        if (config.scaldingStone.enable) {
            var set = config.scaldingStone;
            var key = register(create(StoneBlocks.SCALDING_STONE, set.size), set.repeat, set.getMinOffset(), set.getMaxOffset(), "ore_scalding_overworld");
            addFeature(BiomeSelectors.foundInOverworld(), key, true);
        }

        //snow ores
        if (config.undergroundIce.enable) {
            var set = config.undergroundIce;
            var key = register(create(ICE, set.size), set.repeat, set.getMinOffset(), set.getMaxOffset(), "ore_ice_overworld");
            addFeature(snowOnly, key, false);
        }

        if (config.undergroundPackedIce.enable) {
            var set = config.undergroundPackedIce;
            var key = register(create(PACKED_ICE, set.size), set.repeat, set.getMinOffset(), set.getMaxOffset(), "ore_packed_ice_overworld");
            addFeature(snowOnly, key, false);
        }

        if (config.undergroundSnow.enable) {
            var set = config.undergroundSnow;
            var key = register(create(SNOW_BLOCK, set.size), set.repeat, set.getMinOffset(), set.getMaxOffset(), "ore_snow_overworld");
            addFeature(snowOnly, key, false);
        }


        if (config.undergroundBlueIce.enable) {
            var set = config.undergroundBlueIce;
            var key = register(create(BLUE_ICE, set.size), set.repeat, set.getMinOffset(), set.getMaxOffset(), "ore_blue_overworld");
            addFeature(snowOnly, key, false);
        }


        if (config.undergroundPowderedSnow.enable) {
            var set = config.undergroundPowderedSnow;
            var key = register(create(POWDER_SNOW, set.size), set.repeat, set.getMinOffset(), set.getMaxOffset(), "ore_powder_snow_overworld");
            addFeature(snowOnly, key, false);
        }

        //mountain ores
        if (config.glacialStone.enable) {
            var set = config.glacialStone;
            var key = register(create(StoneBlocks.GLACIAL_STONE, set.size), set.repeat, set.getMinOffset(), set.getMaxOffset(), "ore_glacial_stone_overworld");
            addFeature(c -> c.getBiome().getCategory() == Category.EXTREME_HILLS, key, false);
        }


        //overworld ores
        if (config.saltOre.enable) {
            var set = config.saltOre;
            var key = register(create(StoneBlocks.SALT_ORE, set.size), set.repeat, set.getMinOffset(), set.getMaxOffset(), "ore_salt_overworld");
            addFeature(BiomeSelectors.foundInOverworld(), key, true);
        }

        if (config.mixedOre.enable) {
            var set = config.mixedOre;
            var key = register(create(StoneBlocks.MIXED_ORE, set.size), set.repeat, set.getMinOffset(), set.getMaxOffset(), "ore_mixed_overworld");
            addFeature(BiomeSelectors.foundInOverworld(), key, true);
        }

        if (config.saltpeterOre.enable) {
            var set = config.saltpeterOre;
            var key = register(create(StoneBlocks.SALTPETER_ORE, set.size), set.repeat, set.getMinOffset(), set.getMaxOffset(), "ore_saltpeter_overworld");
            addFeature(BiomeSelectors.foundInOverworld(), key, true);
        }

        if (config.mud.enable) {
            var set = config.mud;
            var key = register(create(StoneBlocks.B_CLAY, set.size), set.repeat, set.getMinOffset(), set.getMaxOffset(), "mud_overworld");

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

        if (config.volcanicAsh.enable) {
            var set = config.volcanicAsh;
            var key = register(create(StoneBlocks.VOLCANIC_ASH, set.size), set.repeat, set.getMinOffset(), set.getMaxOffset(), "volcanic_sand_overworld");
            addFeature(BiomeSelectors.categories(Category.JUNGLE), key, false);
        }

        if (config.volcanicStone.enable) {
            var set = config.volcanicStone;
            var key = register(create(StoneBlocks.VOLCANIC_STONE, set.size), set.repeat, set.getMinOffset(), set.getMaxOffset(), "volcanic_stone_overworld");
            addFeature(BiomeSelectors.categories(Category.JUNGLE), key, false);
        }

        //nether ores
        if (config.netherSaltOre.enable) {
            var set = config.netherSaltOre;
            var key = register(create(OreConfiguredFeatures.NETHERRACK, StoneBlocks.NETHER_SALT, set.size), set.repeat, set.getMinOffset(), set.getMaxOffset(), "ore_salt_nether");
            addFeature(BiomeSelectors.foundInTheNether(), key, true);
        }

        if (config.netherCoalOre.enable) {
            var set = config.netherCoalOre;
            var key = register(create(OreConfiguredFeatures.NETHERRACK, StoneBlocks.NETHER_COAL_ORE, set.size), set.repeat, set.getMinOffset(), set.getMaxOffset(), "ore_coal_nether");
            addFeature(BiomeSelectors.foundInTheNether(), key, true);
        }

        //taiga ores
        if (config.taigaStone.enable) {
            var set = config.taigaStone;
            var key = register(create(StoneBlocks.TAIGA_STONE, set.size), set.repeat, set.getMinOffset(), set.getMaxOffset(), "ore_taiga_overworld");
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