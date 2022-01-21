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
import net.minecraft.world.gen.decorator.RarityFilterPlacementModifier;
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
            var set = features.soulSporecapPatch;
            selection = BiomeSelectors.foundInTheNether();
            BiomeModifications.addFeature(selection, step, create("soul_sporecap_patch", Plants.SOUL_SPORECAP, set.tries, set.rarity));
        }
        
        if (features.rootedWatcherPatch.enable) {
            var set = features.rootedWatcherPatch;
            selection = BiomeSelectors.foundInTheNether();
            BiomeModifications.addFeature(selection, step, create("rooted_watcher_patch", Plants.ROOTED_WATCHER, set.tries, set.rarity));
        }
        
        if (features.rootedWatcherCrimsonPatch.enable) {
            var set = features.rootedWatcherCrimsonPatch;
            selection = BiomeSelectors.includeByKey(BiomeKeys.CRIMSON_FOREST);
            BiomeModifications.addFeature(selection, step, create("rooted_watcher_patch_crimson", Plants.ROOTED_WATCHER, set.tries, set.rarity));
        }
        
        if (features.taintedWartPatch.enable) {
            var set = features.taintedWartPatch;
            selection = BiomeSelectors.foundInTheNether();
            BiomeModifications.addFeature(selection, step, create("tainted_wart_patch", Plants.TAINTED_WART, set.tries, set.rarity));
        }
    }
    
    private static final int PLACER = VFeatures.SIMPLE_PATCH.create(new ConditionBlockPlacer(state ->
        state.getMaterial().isReplaceable() && !(state.getBlock() instanceof TallPlantBlock)
    ));
    
    private static RegistryKey<PlacedFeature> create(String id, Block block, int tries, int rarity) {
        return create(id, BlockStateProvider.of(block), tries, rarity);
    }
    
    /** Create the random patch feature config. */
    private static RegistryKey<PlacedFeature> create(String id, BlockStateProvider block, int tries, int rarity) {
        var config = VFeatures.SIMPLE_PATCH.configure(new SimplePatchConfig(block, tries, 7, 5, PLACER));
        return Util.register(id, config, RarityFilterPlacementModifier.of(rarity), SquarePlacementModifier.of(), PlacedFeatures.BOTTOM_TO_TOP_RANGE);
    }
}
