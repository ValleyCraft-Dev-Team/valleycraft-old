package io.github.linkle.valleycraft.world.gen.features;

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
        var mutable = new BlockPos.Mutable();

        int height = config.ySpread();
        int size = config.xzSpread() * 2;
        int tries = config.tries();
        int spawned = 0;

        for (int i = 0; i < tries; ++i) {
            int xOffset = random.nextInt(size) - (size / 2);
            int yOffset = random.nextInt(height) - (height / 2);
            int zOffset = random.nextInt(size) - (size / 2);
            mutable.set(origin, xOffset, yOffset, zOffset);
            var state = config.state().getBlockState(random, mutable);
            
            if (state.canPlaceAt(world, mutable) && config.placer().place(world, mutable, state)) {
                spawned++;
            }
        }

        return spawned > 0;
    }
}