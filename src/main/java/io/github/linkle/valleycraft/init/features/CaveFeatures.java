package io.github.linkle.valleycraft.init.features;

import java.util.ArrayList;

import io.github.linkle.valleycraft.ValleyMain;
import io.github.linkle.valleycraft.init.Aquatic;
import io.github.linkle.valleycraft.init.Plants;
import io.github.linkle.valleycraft.utils.IntPredicates;
import io.github.linkle.valleycraft.utils.Util;
import io.github.linkle.valleycraft.world.gen.features.CavePatchConfig;
import io.github.linkle.valleycraft.world.gen.features.CrystalPatchConfig;
import io.github.linkle.valleycraft.world.gen.features.SimplePatchConfig;
import io.github.linkle.valleycraft.world.placer.HeightMapBlockPlacer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Blocks;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.Heightmap;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.gen.CountConfig;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.CountPlacementModifier;
import net.minecraft.world.gen.decorator.HeightRangePlacementModifier;
import net.minecraft.world.gen.decorator.PlacementModifier;
import net.minecraft.world.gen.decorator.RarityFilterPlacementModifier;
import net.minecraft.world.gen.decorator.SquarePlacementModifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

public class CaveFeatures {
    /** Custom gen feature to spawn stuffs in caves. */

    private static final ConfiguredFeature<?, ?> REDSTONE_CRYSTAL_PATCH_CONFIG = VFeatures.CAVE_PATCH
            .configure(new CavePatchConfig(BlockStateProvider.of(Plants.REDSTONE_CRYSTAL.getDefaultState()), ConstantIntProvider.create(15),
                    ConstantIntProvider.create(4), ConstantIntProvider.create(6), 0.03F, Blocks.DEEPSLATE_REDSTONE_ORE.getDefaultState()));
    
    private static final ConfiguredFeature<?, ?> SPIDER_EGG_PATCH_CONFIG = VFeatures.CAVE_PATCH
            .configure(new CavePatchConfig(BlockStateProvider.of(Plants.SPIDER_EGG_BLOCK.getDefaultState()), ConstantIntProvider.create(30),
                    ConstantIntProvider.create(4), ConstantIntProvider.create(6), 1.0F, Blocks.COBWEB.getDefaultState()));
    
    private static final ConfiguredFeature<?, ?> ROCKS_PATCH_CONFIG = 
            VFeatures.SIMPLE_PATCH.configure(new SimplePatchConfig(
        Plants.ROCK_PILE.getDefaultState(), 30, 7, 5, 
        VFeatures.SIMPLE_PATCH.create(new HeightMapBlockPlacer(Heightmap.Type.WORLD_SURFACE_WG, IntPredicates.LESS))
    ));

    public static void initialize() {
        var config = ValleyMain.CONFIG.featureGenerations.caveFeatures;
        var underground = GenerationStep.Feature.UNDERGROUND_DECORATION;
        ArrayList<PlacementModifier> list;
        RegistryKey<PlacedFeature> key;

        list = new ArrayList<>();
        list.add(SquarePlacementModifier.of());
        list.add(HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(0)));
        key = Util.register("redstone_crystal_patch_cave", REDSTONE_CRYSTAL_PATCH_CONFIG, list);
        if (config.redstoneCrystalPatchEnabled)
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), underground, key);
        
        list = new ArrayList<>();
        list.add(RarityFilterPlacementModifier.of(2));
        list.add(SquarePlacementModifier.of());
        list.add(HeightRangePlacementModifier.uniform(YOffset.aboveBottom(24), YOffset.fixed(24)));
        key = Util.register("spider_egg_patch_cave", SPIDER_EGG_PATCH_CONFIG, list);
        if (config.spiderSackPatchEnabled)
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), underground, key);
        
        list = new ArrayList<>();
        list.add(CountPlacementModifier.of(13));
        list.add(SquarePlacementModifier.of());
        list.add(HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(50)));
        key = Util.register("rocks_patch_cave", ROCKS_PATCH_CONFIG, list);
        if (config.rocksPatchEnabled)
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), underground, key);
        
        if (config.glowKelpPatch.enable) {
            var set = config.glowKelpPatch;
            list = new ArrayList<>();
            list.add(CountPlacementModifier.of(set.repeat));
            list.add(SquarePlacementModifier.of());
            list.add(HeightRangePlacementModifier.uniform(YOffset.aboveBottom(set.yMinBottom), YOffset.fixed(set.yMax)));
            key = Util.register("glow_kelp_patch_cave", VFeatures.GLOW_KELP.configure(new CountConfig(set.tries)), list);
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), underground, key);
        }
        
        if (config.prismarineCluster.enable) {
            var set = config.prismarineCluster;
            list = new ArrayList<>();
            list.add(RarityFilterPlacementModifier.of(set.rarity));
            list.add(SquarePlacementModifier.of());
            list.add(HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(42)));
            key = Util.register("pris_cluster_patch", VFeatures.PRIS_CLUSTER.configure(new CrystalPatchConfig(Aquatic.PRISMARINE_CLUSTER.getDefaultState().with(Properties.WATERLOGGED, true), set.tries, set.spread)), list);
            BiomeModifications.addFeature(BiomeSelectors.categories(Category.OCEAN), underground, key);
        }
    }
}
