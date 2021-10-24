package net.linkle.valley.Registry.Initializers.ConfiguredFeatures.Gen;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.world.gen.decorator.DecoratorConfig;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;

/**
 * The <code>count</code> is amount of blocks can spawn in patch. The
 * <code>size</code> is the size of the patch.
 */
public record SeaPatchConfig(BlockStateProvider state, IntProvider count, IntProvider size)
        implements FeatureConfig, DecoratorConfig {

    public static final Codec<SeaPatchConfig> CODEC = RecordCodecBuilder.create(instance -> instance
            .group(BlockStateProvider.TYPE_CODEC.fieldOf("state").forGetter(SeaPatchConfig::state),
             IntProvider.VALUE_CODEC.fieldOf("count").forGetter(SeaPatchConfig::count),
             IntProvider.VALUE_CODEC.fieldOf("size").forGetter(SeaPatchConfig::size))
            .apply(instance, instance.stable(SeaPatchConfig::new)));

    public SeaPatchConfig(BlockState state, int count, int size) {
        this(new SimpleBlockStateProvider(state), ConstantIntProvider.create(count), size);
    }

    public SeaPatchConfig(BlockState state, IntProvider count, int size) {
        this(new SimpleBlockStateProvider(state), count, size);
    }

    public SeaPatchConfig(BlockStateProvider state, int count, int size) {
        this(state, ConstantIntProvider.create(count), size);
    }

    public SeaPatchConfig(BlockStateProvider state, IntProvider count, int size) {
        this(state, count, ConstantIntProvider.create(size));
    }

    public SeaPatchConfig(BlockStateProvider state, IntProvider count, IntProvider size) {
        this.state = state;
        this.count = count;
        this.size = size;
    }
}
