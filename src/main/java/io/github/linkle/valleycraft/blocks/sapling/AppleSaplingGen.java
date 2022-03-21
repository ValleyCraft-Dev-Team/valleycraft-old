package io.github.linkle.valleycraft.blocks.sapling;

import java.util.Random;

import io.github.linkle.valleycraft.init.features.Trees;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;

public class AppleSaplingGen extends SaplingGenerator {

    @Override
    protected RegistryEntry<? extends ConfiguredFeature<?, ?>> getTreeFeature(Random arg0, boolean arg1) {
        // TODO Auto-generated method stub
        return null;
    }
    
    /* 
    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random random, boolean bees) {
        return Trees.APPLE_TREE;
    }
    */
}