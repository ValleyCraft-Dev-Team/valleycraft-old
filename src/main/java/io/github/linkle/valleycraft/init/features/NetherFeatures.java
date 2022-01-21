package io.github.linkle.valleycraft.init.features;

import java.util.function.Predicate;

import io.github.linkle.valleycraft.ValleyMain;
import io.github.linkle.valleycraft.init.Plants;
import io.github.linkle.valleycraft.utils.Util;
import io.github.linkle.valleycraft.world.gen.features.SimplePatchConfig;
import io.github.linkle.valleycraft.world.placer.ConditionBlockPlacer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Block;
import net.minecraft.block.TallPlantBlock;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.CountPlacementModifier;
import net.minecraft.world.gen.decorator.SquarePlacementModifier;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

public class NetherFeatures {
    
    public static void initialize() {
        var features = ValleyMain.CONFIG.featureGenerations.netherFeatures;
        var step = GenerationStep.Feature.VEGETAL_DECORATION;
        Predicate<BiomeSelectionContext> selection;
        
        if (features.soulSporecapPatch.enable) {
            selection = BiomeSelectors.foundInTheNether();
            BiomeModifications.addFeature(selection, step, create("soul_sporecap_patch", Plants.SOUL_SPORECAP, 50, 4));
        }
        
        if (features.rootedWatcherPatch.enable) {
            selection = BiomeSelectors.foundInTheNether();
            BiomeModifications.addFeature(selection, step, create("rooted_watcher_patch", Plants.ROOTED_WATCHER, 50, 2));
        }
        
        if (features.rootedWatcherCrimsonPatch.enable) {
            selection = BiomeSelectors.includeByKey(BiomeKeys.CRIMSON_FOREST);
            BiomeModifications.addFeature(selection, step, create("rooted_watcher_patch_crimson", Plants.ROOTED_WATCHER, 50, 4));
        }
        
        if (features.taintedWartPatch.enable) {
            selection = BiomeSelectors.foundInTheNether();
            BiomeModifications.addFeature(selection, step, create("tainted_wart_patch", Plants.TAINTED_WART, 50, 3));
        }
    }
    
    private static final int PLACER = VFeatures.SIMPLE_PATCH.create(new ConditionBlockPlacer(state ->
        state.getMaterial().isReplaceable() && !(state.getBlock() instanceof TallPlantBlock)
    ));
    
    private static RegistryKey<PlacedFeature> create(String id, Block block, int tries, int repeat) {
        return create(id, BlockStateProvider.of(block), tries, repeat);
    }
    
    /** Create the random patch feature config. */
    private static RegistryKey<PlacedFeature> create(String id, BlockStateProvider block, int tries, int repeat) {
        var config = VFeatures.SIMPLE_PATCH.configure(new SimplePatchConfig(block, tries, 7, 5, PLACER));
        return Util.register(id, config, CountPlacementModifier.of(repeat), SquarePlacementModifier.of(), PlacedFeatures.BOTTOM_TO_TOP_RANGE);
    }
}
