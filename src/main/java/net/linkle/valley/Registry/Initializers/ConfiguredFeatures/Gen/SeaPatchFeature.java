package net.linkle.valley.Registry.Initializers.ConfiguredFeatures.Gen;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Heightmap.Type;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.util.FeatureContext;

public class SeaPatchFeature extends Feature<SeaPatchConfig> {

    public SeaPatchFeature() {
        super(SeaPatchConfig.CODEC);
    }

    public boolean generate(FeatureContext<SeaPatchConfig> context) {
        int spawned = 0;
        var random = context.getRandom();
        var world = context.getWorld();
        var origin = context.getOrigin();
        var stateProvider = context.getConfig().state();
        int size = context.getConfig().size().get(random);
        int loops = context.getConfig().count().get(random);

        for (int i = 0; i < loops; ++i) {
            int xPos = random.nextInt(size) - random.nextInt(size);
            int zPos = random.nextInt(size) - random.nextInt(size);
            int n = world.getTopY(Type.OCEAN_FLOOR, origin.getX() + xPos, origin.getZ() + xPos);
            var blockPos = new BlockPos(origin.getX() + zPos, n, origin.getZ() + xPos);
            var blockState = stateProvider.getBlockState(random, blockPos);
            if (world.getBlockState(blockPos).isOf(Blocks.WATER) && blockState.canPlaceAt(world, blockPos)) {
                world.setBlockState(blockPos, blockState, Block.NOTIFY_LISTENERS);
                ++spawned;
            }
        }

        return spawned > 0;
    }
}
