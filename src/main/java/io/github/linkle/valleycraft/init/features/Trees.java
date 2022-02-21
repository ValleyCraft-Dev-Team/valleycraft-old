package io.github.linkle.valleycraft.init.features;

import io.github.linkle.valleycraft.ValleyMain;
import io.github.linkle.valleycraft.init.Plants;
import io.github.linkle.valleycraft.utils.Util;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.decorator.BlockFilterPlacementModifier;
import net.minecraft.world.gen.decorator.PlacementModifier;
import net.minecraft.world.gen.decorator.RarityFilterPlacementModifier;
import net.minecraft.world.gen.decorator.SquarePlacementModifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.ArrayList;

public class Trees {

    private static final TreeFeatureConfig APPLE_TREE_CONFIG = new TreeFeatureConfig.Builder(
            BlockStateProvider.of(Blocks.OAK_LOG),
            new StraightTrunkPlacer(4, 2, 0),
            new WeightedBlockStateProvider(new DataPool.Builder<BlockState>()
                    .add(Plants.APPLE_LEAVES.getDefaultState(), 1).add(Plants.APPLE_LEAVES_EMPTY.getDefaultState(), 4)),
            new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
            new TwoLayersFeatureSize(1, 0, 1)
            ).build();

    public static ConfiguredFeature<TreeFeatureConfig, ?> APPLE_TREE = Feature.TREE.configure(APPLE_TREE_CONFIG);

    public static void initialize() {
        ArrayList<PlacementModifier> list = new ArrayList<>();
        list.add(RarityFilterPlacementModifier.of(10));
        list.add(SquarePlacementModifier.of());
        list.add(PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP);
        list.add(BlockFilterPlacementModifier.of(BlockPredicate.wouldSurvive(Plants.APPLE_SAPLING.getDefaultState(), BlockPos.ORIGIN)));
        RegistryKey<PlacedFeature> appleTreeKey = Util.register("apple_tree", Feature.TREE.configure(APPLE_TREE_CONFIG), list);
        if (ValleyMain.CONFIG.featureGenerations.trees.appleTreeEnabled)
            BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MEADOW), GenerationStep.Feature.VEGETAL_DECORATION, appleTreeKey);
    }
}
