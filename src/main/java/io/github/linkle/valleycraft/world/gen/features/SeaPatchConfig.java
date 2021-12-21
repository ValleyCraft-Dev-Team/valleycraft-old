package io.github.linkle.valleycraft.world.gen.features;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

/**
 * The <code>count</code> is amount of blocks can spawn in patch. The
 * <code>size</code> is the size of the patch.
 */
public record SeaPatchConfig(BlockStateProvider state, IntProvider count, IntProvider size) implements FeatureConfig {

	public static final Codec<SeaPatchConfig> CODEC = RecordCodecBuilder.create(instance -> instance
			.group(BlockStateProvider.TYPE_CODEC.fieldOf("state").forGetter(SeaPatchConfig::state),
					IntProvider.VALUE_CODEC.fieldOf("count").forGetter(SeaPatchConfig::count),
					IntProvider.VALUE_CODEC.fieldOf("size").forGetter(SeaPatchConfig::size)
            ).apply(instance, instance.stable(SeaPatchConfig::new)));

	public SeaPatchConfig(BlockState state, IntProvider count, int size) {
		this(BlockStateProvider.of(state), count, ConstantIntProvider.create(size));
	}

}