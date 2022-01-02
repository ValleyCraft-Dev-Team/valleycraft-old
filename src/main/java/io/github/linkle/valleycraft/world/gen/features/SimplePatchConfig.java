package io.github.linkle.valleycraft.world.gen.features;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

public record SimplePatchConfig(BlockStateProvider state, IntProvider tries, IntProvider height, IntProvider size) implements FeatureConfig {
    public static final Codec<SimplePatchConfig> CODEC = RecordCodecBuilder.create(instance -> instance
            .group(BlockStateProvider.TYPE_CODEC.fieldOf("state").forGetter(SimplePatchConfig::state),
             IntProvider.VALUE_CODEC.fieldOf("tries").forGetter(SimplePatchConfig::tries),
             IntProvider.VALUE_CODEC.fieldOf("height").forGetter(SimplePatchConfig::height),
             IntProvider.VALUE_CODEC.fieldOf("size").forGetter(SimplePatchConfig::size))
            .apply(instance, instance.stable(SimplePatchConfig::new)));
    
    public SimplePatchConfig(Block state, int tries, int height, int size) {
        this(state.getDefaultState(), ConstantIntProvider.create(tries), height, size);
    }

    public SimplePatchConfig(BlockState state, int tries, int height, int size) {
        this(BlockStateProvider.of(state), ConstantIntProvider.create(tries), height, size);
    }

    public SimplePatchConfig(BlockState state, IntProvider tries, int height, int size) {
        this(BlockStateProvider.of(state), tries, height, size);
    }

    public SimplePatchConfig(BlockStateProvider state, int tries, int height, int size) {
        this(state, ConstantIntProvider.create(tries), height, size);
    }

    public SimplePatchConfig(BlockStateProvider state, IntProvider tries, int height, int size) {
        this(state, tries, ConstantIntProvider.create(height), ConstantIntProvider.create(size));
    }
}
