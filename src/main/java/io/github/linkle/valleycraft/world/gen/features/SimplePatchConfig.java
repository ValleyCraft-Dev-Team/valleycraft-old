package io.github.linkle.valleycraft.world.gen.features;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import io.github.linkle.valleycraft.utils.BlockPlacer;
import io.github.linkle.valleycraft.utils.SimpleBlockPlacer;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

public record SimplePatchConfig(BlockStateProvider state, IntProvider tries, IntProvider height, IntProvider size, BlockPlacer placer) implements FeatureConfig {
    public static final Codec<SimplePatchConfig> CODEC = RecordCodecBuilder.create(instance -> instance
            .group(BlockStateProvider.TYPE_CODEC.fieldOf("state").forGetter(SimplePatchConfig::state),
             IntProvider.VALUE_CODEC.fieldOf("tries").forGetter(SimplePatchConfig::tries),
             IntProvider.VALUE_CODEC.fieldOf("height").forGetter(SimplePatchConfig::height),
             IntProvider.VALUE_CODEC.fieldOf("size").forGetter(SimplePatchConfig::size))
            .apply(instance, instance.stable(SimplePatchConfig::new)));

    public SimplePatchConfig(BlockState state, int tries, int height, int size) {
        this(BlockStateProvider.of(state), tries, height, size);
    }
    
    public SimplePatchConfig(BlockState state, int tries, int height, int size, BlockPlacer placer) {
        this(BlockStateProvider.of(state), ConstantIntProvider.create(tries), ConstantIntProvider.create(height), ConstantIntProvider.create(size), placer);
    }

    public SimplePatchConfig(BlockStateProvider state, int tries, int height, int size) {
        this(state, ConstantIntProvider.create(tries), ConstantIntProvider.create(height), ConstantIntProvider.create(size));
    }
    
    public SimplePatchConfig(BlockStateProvider state, IntProvider tries, IntProvider height, IntProvider size) {
        this(state, tries, height, size, SimpleBlockPlacer.INSTANCE);
    }
}
