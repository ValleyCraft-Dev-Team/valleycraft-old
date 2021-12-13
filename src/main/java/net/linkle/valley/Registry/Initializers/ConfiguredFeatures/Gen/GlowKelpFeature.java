package net.linkle.valley.Registry.Initializers.ConfiguredFeatures.Gen;

import net.linkle.valley.Registry.Initializers.Aquatic;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.KelpBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.Heightmap;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.util.FeatureContext;

public class GlowKelpFeature extends Feature<DefaultFeatureConfig> {

    public GlowKelpFeature() {
        super(DefaultFeatureConfig.CODEC);
    }

    @Override
    public boolean generate(FeatureContext<DefaultFeatureConfig> context) {
        int spawned = 0;
        var world = context.getWorld();
        var origin = context.getOrigin();
        var random = context.getRandom();
        var kelp = Aquatic.GLOW_KELP.getDefaultState();
        var plant = Aquatic.GLOW_KELP_PLANT.getDefaultState();
        var loops = MathHelper.nextInt(random, 3, 7);
        
        for (int i = 0; i < loops; i++) {
            int xPos = random.nextInt(7) - random.nextInt(7);
            int zPos = random.nextInt(7) - random.nextInt(7);
            var top = world.getTopY(Heightmap.Type.OCEAN_FLOOR, origin.getX() + xPos, origin.getZ() + zPos);
            var surface = new BlockPos(origin.getX() + xPos, top, origin.getZ() + zPos);
            if (world.getBlockState(surface).isOf(Blocks.WATER)) {
                int height = 1 + random.nextInt(8);
                for (int h = 0; h <= height; ++h) {
                    if (world.getBlockState(surface).isOf(Blocks.WATER) && world.getBlockState(surface.up()).isOf(Blocks.WATER) && plant.canPlaceAt(world, surface)) {
                        if (h == height) {
                            world.setBlockState(surface, kelp.with(KelpBlock.AGE, random.nextInt(4) + 20), Block.NOTIFY_LISTENERS);
                            ++spawned;
                        } else {
                            world.setBlockState(surface, plant, Block.NOTIFY_LISTENERS);
                        }
                    } else if (h > 0) {
                        var down = surface.down();
                        if (!kelp.canPlaceAt(world, down) || world.getBlockState(down.down()).isOf(Blocks.KELP)) break;
                        world.setBlockState(down, kelp.with(KelpBlock.AGE, random.nextInt(4) + 20), Block.NOTIFY_LISTENERS);
                        ++spawned;
                        break;
                    }
                    surface = surface.up();
                }
            }
        }
        
        return spawned > 0;
    }
}
