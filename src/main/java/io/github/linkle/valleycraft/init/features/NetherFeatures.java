package io.github.linkle.valleycraft.init.features;

import java.util.ArrayList;
import java.util.function.Predicate;

import io.github.linkle.valleycraft.ValleyMain;
import io.github.linkle.valleycraft.init.Plants;
import io.github.linkle.valleycraft.utils.Util;
import io.github.linkle.valleycraft.world.gen.features.SimplePatchConfig;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.CountPlacementModifier;
import net.minecraft.world.gen.decorator.PlacementModifier;
import net.minecraft.world.gen.decorator.RarityFilterPlacementModifier;
import net.minecraft.world.gen.decorator.SquarePlacementModifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;

public class NetherFeatures {
    
    private static final ConfiguredFeature<?, ?> SOUL_SPORECAP_CONFIG = VFeatures.SIMPLE_PATCH.configure(new SimplePatchConfig(Plants.SOUL_SPORECAP.getDefaultState(), 35, 7, 5));
    private static final ConfiguredFeature<?, ?> ROOTED_WATCHER_CONFIG1 = VFeatures.SIMPLE_PATCH.configure(new SimplePatchConfig(Plants.ROOTED_WATCHER.getDefaultState(), 35, 7, 5));
    private static final ConfiguredFeature<?, ?> ROOTED_WATCHER_CONFIG2 = VFeatures.SIMPLE_PATCH.configure(new SimplePatchConfig(Plants.ROOTED_WATCHER.getDefaultState(), 35, 7, 5));
    private static final ConfiguredFeature<?, ?> TAINTED_WART_CONFIG = VFeatures.SIMPLE_PATCH.configure(new SimplePatchConfig(Plants.TAINTED_WART.getDefaultState(), 35, 7, 5));
    
    public static void initialize() {
        var features = ValleyMain.CONFIG.featureGenerations.netherFeatures;
        Predicate<BiomeSelectionContext> selection;
        ArrayList<PlacementModifier> list;
        RegistryKey<PlacedFeature> key;
        var step = GenerationStep.Feature.VEGETAL_DECORATION;
        
        
        list = new ArrayList<>();
        list.add(CountPlacementModifier.of(4));
        list.add(SquarePlacementModifier.of());
        list.add(PlacedFeatures.BOTTOM_TO_TOP_RANGE);
        key = Util.register("soul_sporecap_patch", SOUL_SPORECAP_CONFIG, list);
        selection = BiomeSelectors.foundInTheNether();
        if (features.soulSporecapPatchEnabled)
            BiomeModifications.addFeature(selection, step, key);
        
        list = new ArrayList<>();
        list.add(RarityFilterPlacementModifier.of(2));
        list.add(SquarePlacementModifier.of());
        list.add(PlacedFeatures.BOTTOM_TO_TOP_RANGE);
        key = Util.register("rooted_watcher_patch", ROOTED_WATCHER_CONFIG1, list);
        selection = BiomeSelectors.foundInTheNether();
        if (features.rootedWatcherPatchEnabled)
            BiomeModifications.addFeature(selection, step, key);
        
        list = new ArrayList<>();
        list.add(CountPlacementModifier.of(5));
        list.add(SquarePlacementModifier.of());
        list.add(PlacedFeatures.BOTTOM_TO_TOP_RANGE);
        key = Util.register("rooted_watcher_patch_crisom", ROOTED_WATCHER_CONFIG2, list);
        selection = BiomeSelectors.includeByKey(BiomeKeys.CRIMSON_FOREST);
        if (features.rootedWatcherPatchEnabled)
            BiomeModifications.addFeature(selection, step, key);
        
        list = new ArrayList<>();
        list.add(CountPlacementModifier.of(3));
        list.add(SquarePlacementModifier.of());
        list.add(PlacedFeatures.BOTTOM_TO_TOP_RANGE);
        key = Util.register("tainted_wart_patch", TAINTED_WART_CONFIG, list);
        selection = BiomeSelectors.foundInTheNether();
        if (features.taintedWartPatchEnabled)
            BiomeModifications.addFeature(selection, step, key);
    }
}
