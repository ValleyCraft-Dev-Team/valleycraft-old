package net.linkle.valley.Registry.Initializers.ConfiguredFeatures;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.Heightmap;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.HeightmapDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import static net.linkle.valley.Registry.Initializers.Plants.*;
import static net.linkle.valley.ValleyMain.MOD_ID;

public class Trees {

	private static final TreeFeatureConfig APPLE_TREE_CONFIG = new TreeFeatureConfig.Builder(
			new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
			new StraightTrunkPlacer(4, 2, 0),
			new WeightedBlockStateProvider(new DataPool.Builder<BlockState>()
					.add(APPLE_LEAVES.getDefaultState(), 1).add(APPLE_LEAVES_EMPTY.getDefaultState(), 5)),
			new SimpleBlockStateProvider(APPLE_SAPLING.getDefaultState()),
			new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
			new TwoLayersFeatureSize(1, 0, 1)
	).build();
	
	public static ConfiguredFeature<?, ?> APPLE_TREE = Feature.TREE.configure(APPLE_TREE_CONFIG);
	
	@SuppressWarnings("deprecation")
	public static void ints() {
		RegistryKey<ConfiguredFeature<?, ?>> appleTree = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(MOD_ID, "apple_tree"));
		
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, appleTree.getValue(), Feature.TREE
		.configure(APPLE_TREE_CONFIG)
		.decorate(Decorator.HEIGHTMAP.configure(new HeightmapDecoratorConfig(Heightmap.Type.MOTION_BLOCKING)))
		.spreadHorizontally()
		.applyChance(2));
		
		BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST), GenerationStep.Feature.VEGETAL_DECORATION, appleTree);
	}
}
