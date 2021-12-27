package io.github.linkle.valleycraft.world.gen.features;

import io.github.linkle.valleycraft.init.Plants;
import net.minecraft.block.Block;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.util.FeatureContext;

public class CavePatchFeature extends Feature<CavePatchConfig> {

    public CavePatchFeature() {
        super(CavePatchConfig.CODEC);
    }

    @Override
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
            int xOffset = random.nextInt(size) - (size / 2);
            int yOffset = random.nextInt(height) - (height / 2);
            int zOffset = random.nextInt(size) - (size / 2);
            mutable.set(origin, xOffset, yOffset, zOffset);

            var surface = mutable.down();
            var surState = world.getBlockState(surface);
            if (surState.isOpaque() && world.isAir(mutable) && state.canPlaceAt(world, mutable)) {
                world.setBlockState(mutable, state, Block.NOTIFY_LISTENERS);
                ++spawned;

                if (!state.isOf(Plants.SPIDER_EGG_BLOCK)) {
                    for (BlockPos pos : BlockPos.iterate(mutable.getX() - 3, mutable.getY() - 3, mutable.getZ() - 3,
                            mutable.getX() + 3, mutable.getY() + 3, mutable.getZ() + 3)) {
                        if (random.nextFloat(1) < config.extraBlockChance()) {
                            if (world.getBlockState(pos).isIn(BlockTags.DEEPSLATE_ORE_REPLACEABLES)) {
                                world.setBlockState(pos, config.extraBlock(), Block.NOTIFY_LISTENERS);
                            }
                        }
                    }
                } else {
                    for (Direction direction : Direction.values()) {
                        BlockPos pos = mutable.offset(direction);
                        if (world.isAir(pos)) {
                            world.setBlockState(pos, config.extraBlock(), Block.NOTIFY_LISTENERS);
                        }
                    }
                }
            }
        }

        return spawned > 0;
    }
}
