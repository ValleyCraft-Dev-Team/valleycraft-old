package io.github.linkle.valleycraft.blocks.sapling;

import java.util.Random;

import io.github.linkle.valleycraft.init.ConfiguredFeatures.Trees;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;

public class AppleSaplingGen extends SaplingGenerator {
	
    @Override
	protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random random, boolean bees) {
		return Trees.APPLE_TREE;
	}

}