package net.linkle.valley.Registry.Blocks.Plants;

import java.util.Random;

import net.linkle.valley.Registry.Initializers.ConfiguredFeatures.Trees;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;

public class AppleSaplingGen extends SaplingGenerator {
	@Override
	protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random random, boolean bees) {
		return (ConfiguredFeature<TreeFeatureConfig, ?>) Trees.APPLE_TREE;
	}
}
