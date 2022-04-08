package io.github.linkle.valleycraft.init.features;

import java.util.ArrayList;

import io.github.linkle.valleycraft.ValleyMain;
import io.github.linkle.valleycraft.init.Plants;
import io.github.linkle.valleycraft.init.Reg;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.placementmodifier.BlockFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

public class Trees {

    private static final TreeFeatureConfig APPLE_TREE_CONFIG = new TreeFeatureConfig.Builder(
            BlockStateProvider.of(Blocks.OAK_LOG),
            new StraightTrunkPlacer(4, 2, 0),
            new WeightedBlockStateProvider(new DataPool.Builder<BlockState>()
                    .add(Plants.FRUIT_BEARING_APPLE_LEAVES.getDefaultState(), 1).add(Plants.APPLE_LEAVES.getDefaultState(), 4)),
            new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
            new TwoLayersFeatureSize(1, 0, 1)
            ).build();

    public static RegistryEntry<ConfiguredFeature<?, ?>> APPLE_TREE;
    
    static {
        
        
    }

    public static void initialize() {
        var config = new ConfiguredFeature<>(Feature.TREE, APPLE_TREE_CONFIG);
        APPLE_TREE = Reg.add(BuiltinRegistries.CONFIGURED_FEATURE, "apple_tree", config);
        
        ArrayList<PlacementModifier> list = new ArrayList<>(4);
        list.add(RarityFilterPlacementModifier.of(10));
        list.add(SquarePlacementModifier.of());
        list.add(PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP);
        list.add(BlockFilterPlacementModifier.of(BlockPredicate.wouldSurvive(Plants.APPLE_SAPLING.getDefaultState(), BlockPos.ORIGIN)));
        
        var appleTreeKey = Reg.register("apple_tree", APPLE_TREE, list).getKey().get();
        if (ValleyMain.CONFIG.featureGenerations.trees.appleTreeEnabled)
            BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MEADOW), GenerationStep.Feature.VEGETAL_DECORATION, appleTreeKey);
    }
}
