package net.linkle.valley.Registry.Initializers.ConfiguredFeatures.Gen;

import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.util.FeatureContext;

public class CavePatchFeature extends Feature<CavePatchConfig> {

    public CavePatchFeature() {
        super(CavePatchConfig.CODEC);
    }

    public boolean generate(FeatureContext<CavePatchConfig> context) {
        var config = context.getConfig();
        var random = context.getRandom();
        var origin = context.getOrigin();
        var world = context.getWorld();
        var state = config.state().getBlockState(random, origin);
        var mutable = new BlockPos.Mutable();

        int height = config.height().get(random);
        int size = config.size().get(random);
        int tries = config.tries().get(random);
        int spawned = 0;

        for (int i = 0; i < tries; ++i) {
            int xOffset = random.nextInt(size) - random.nextInt(size);
            int yOffset = random.nextInt(height) - random.nextInt(height);
            int zOffset = random.nextInt(size) - random.nextInt(size);
            mutable.set(origin, xOffset, yOffset, zOffset);

            var surface = mutable.down();
            var surState = world.getBlockState(surface);
            if (surState.isOpaque() && world.isAir(mutable) && state.canPlaceAt(world, mutable)) {
                world.setBlockState(mutable, state, Block.NOTIFY_LISTENERS);
                ++spawned;
            }
        }

        return spawned > 0;
    }
}
