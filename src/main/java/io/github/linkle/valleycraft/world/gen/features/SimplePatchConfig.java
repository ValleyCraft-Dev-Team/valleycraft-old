package io.github.linkle.valleycraft.world.gen.features;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import net.minecraft.block.BlockState;
import net.minecraft.util.dynamic.Codecs;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;


public record SimplePatchConfig(BlockStateProvider state, int tries, int xzSpread, int ySpread, int placerId) implements FeatureConfig {
    public static final Codec<SimplePatchConfig> CODEC = RecordCodecBuilder.create(instance -> instance
            .group(BlockStateProvider.TYPE_CODEC.fieldOf("state").forGetter(SimplePatchConfig::state),
                    Codecs.POSITIVE_INT.fieldOf("tries").forGetter(SimplePatchConfig::tries),
                    Codecs.POSITIVE_INT.fieldOf("xzSpread").forGetter(SimplePatchConfig::xzSpread),
                    Codecs.POSITIVE_INT.fieldOf("ySpread").forGetter(SimplePatchConfig::ySpread),
                    Codecs.NONNEGATIVE_INT.fieldOf("placerId").forGetter(SimplePatchConfig::placerId))
            .apply(instance, instance.stable(SimplePatchConfig::new)));

    public SimplePatchConfig(BlockState state, int tries, int xzSpread, int ySpread) {
        this(BlockStateProvider.of(state), tries, xzSpread, ySpread);
    }

    public SimplePatchConfig(BlockState state, int tries, int xzSpread, int ySpread, int placerId) {
        this(BlockStateProvider.of(state), tries, xzSpread, ySpread, placerId);
    }

    public SimplePatchConfig(BlockStateProvider state, int tries, int xzSpread, int ySpread) {
        this(state, tries, xzSpread, ySpread, 0);
    }
}
