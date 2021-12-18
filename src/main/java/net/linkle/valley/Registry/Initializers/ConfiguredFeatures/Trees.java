package net.linkle.valley.Registry.Initializers.ConfiguredFeatures;

import static net.linkle.valley.Registry.Initializers.Plants.APPLE_LEAVES;
import static net.linkle.valley.Registry.Initializers.Plants.APPLE_LEAVES_EMPTY;
import static net.linkle.valley.Registry.Utils.Util.register;

import java.util.ArrayList;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.linkle.valley.Registry.Initializers.Plants;
import net.linkle.valley.Registry.Utils.SimpleConfig;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.Heightmap.Type;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.decorator.BlockFilterPlacementModifier;
import net.minecraft.world.gen.decorator.HeightmapPlacementModifier;
import net.minecraft.world.gen.decorator.PlacementModifier;
import net.minecraft.world.gen.decorator.RarityFilterPlacementModifier;
import net.minecraft.world.gen.decorator.SquarePlacementModifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

public class Trees {

	private static final TreeFeatureConfig APPLE_TREE_CONFIG = new TreeFeatureConfig.Builder(
	        BlockStateProvider.of(Blocks.OAK_LOG),
			new StraightTrunkPlacer(4, 2, 0),
			new WeightedBlockStateProvider(new DataPool.Builder<BlockState>()
					.add(APPLE_LEAVES.getDefaultState(), 1).add(APPLE_LEAVES_EMPTY.getDefaultState(), 4)),
			new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
			new TwoLayersFeatureSize(1, 0, 1)
	).build();
	
	public static ConfiguredFeature<?, ?> APPLE_TREE = Feature.TREE.configure(APPLE_TREE_CONFIG);
	
	public static void initialize(SimpleConfig config) {
	    if (config.get("disable-features-gen", false)) {
	        return;
	    }
	    
		var vegetal = GenerationStep.Feature.VEGETAL_DECORATION;
        ArrayList<PlacementModifier> list;
        RegistryKey<PlacedFeature> place;
		
		list = new ArrayList<>();
		list.add(RarityFilterPlacementModifier.of(10));
		list.add(SquarePlacementModifier.of());
        list.add(PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP);
        list.add(BlockFilterPlacementModifier.of(BlockPredicate.wouldSurvive(Plants.APPLE_SAPLING.getDefaultState(), BlockPos.ORIGIN)));
        place = register("apple_tree", Feature.TREE.configure(APPLE_TREE_CONFIG), list);
		BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MEADOW), vegetal, place);
	}
}
