package io.github.linkle.valleycraft.world.gen.features;

import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.util.FeatureContext;

public class SimplePatchFeature extends Feature<SimplePatchConfig> {

    public SimplePatchFeature() {
        super(SimplePatchConfig.CODEC);
    }

    @Override
    public boolean generate(FeatureContext<SimplePatchConfig> context) {
        var config = context.getConfig();
        var random = context.getRandom();
        var origin = context.getOrigin();
        var world = context.getWorld();
        var state = config.state().getBlockState(random, origin);
        var mutable = new BlockPos.Mutable();

        int height = config.height().get(random);
        int size = config.size().get(random) * 2;
        int tries = config.tries().get(random);
        int spawned = 0;

        for (int i = 0; i < tries; ++i) {
            int xOffset = random.nextInt(size) - (size / 2);
            int yOffset = random.nextInt(height) - (height / 2);
            int zOffset = random.nextInt(size) - (size / 2);
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