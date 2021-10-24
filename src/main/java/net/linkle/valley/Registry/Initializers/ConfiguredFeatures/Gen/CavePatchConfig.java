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
 * The <code>tries</code> is amount of blocks can spawn in patch, it's better to
 * set it high value. The <code>size</code> is the size of the patch, and height
 * is how tall the patch can spawn in (basically a bounding box to spawn in).
 */
public record CavePatchConfig(BlockStateProvider state, IntProvider tries, IntProvider height, IntProvider size)
        implements FeatureConfig, DecoratorConfig {

    public static final Codec<CavePatchConfig> CODEC = RecordCodecBuilder.create(instance -> instance
            .group(BlockStateProvider.TYPE_CODEC.fieldOf("state").forGetter(CavePatchConfig::state),
             IntProvider.VALUE_CODEC.fieldOf("tries").forGetter(CavePatchConfig::tries),
             IntProvider.VALUE_CODEC.fieldOf("height").forGetter(CavePatchConfig::height),
             IntProvider.VALUE_CODEC.fieldOf("size").forGetter(CavePatchConfig::size))
            .apply(instance, instance.stable(CavePatchConfig::new)));

    public CavePatchConfig(BlockState state, int tries, int height, int size) {
        this(new SimpleBlockStateProvider(state), ConstantIntProvider.create(tries), height, size);
    }

    public CavePatchConfig(BlockState state, IntProvider tries, int height, int size) {
        this(new SimpleBlockStateProvider(state), tries, height, size);
    }

    public CavePatchConfig(BlockStateProvider state, int tries, int height, int size) {
        this(state, ConstantIntProvider.create(tries), height, size);
    }

    public CavePatchConfig(BlockStateProvider state, IntProvider tries, int height, int size) {
        this(state, tries, ConstantIntProvider.create(height), ConstantIntProvider.create(size));
    }

    public CavePatchConfig(BlockStateProvider state, IntProvider tries, IntProvider height, IntProvider size) {
        this.state = state;
        this.tries = tries;
        this.height = height;
        this.size = size;
    }
}
