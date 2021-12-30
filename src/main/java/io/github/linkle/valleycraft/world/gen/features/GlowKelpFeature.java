package io.github.linkle.valleycraft.world.gen.features;

import io.github.linkle.valleycraft.init.Aquatic;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.KelpBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Heightmap.Type;
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
        var mutable = new BlockPos.Mutable();

        for (int i = 0; i < 50; ++i) {
            int xOffset = random.nextInt(7) - random.nextInt(7);
            int yOffset = random.nextInt(4) - random.nextInt(4);
            int zOffset = random.nextInt(7) - random.nextInt(7);
            mutable.set(origin, xOffset, yOffset, zOffset);
            
            if (world.getBlockState(mutable).isOf(Blocks.WATER) && world.getBlockState(mutable.down()).isOpaque()) {
                int topY = world.getTopY(Type.OCEAN_FLOOR_WG, mutable.getX(), mutable.getZ());
                if (topY <= mutable.getY()) {
                    continue;
                }
                var surface = mutable.toImmutable();
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
