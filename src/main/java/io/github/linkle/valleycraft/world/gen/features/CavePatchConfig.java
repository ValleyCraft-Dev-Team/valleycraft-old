package io.github.linkle.valleycraft.world.gen.features;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

/**
 * The <code>tries</code> is amount of blocks can spawn in patch, it's better to
 * set it high value. The <code>size</code> is the size of the patch, and height
 * is how tall the patch can spawn in (basically a bounding box to spawn in).
 */
public record CavePatchConfig(BlockStateProvider state, IntProvider tries, IntProvider height, IntProvider size, float extraBlockChance, BlockState extraBlock)
		implements FeatureConfig {

	public static final Codec<CavePatchConfig> CODEC = RecordCodecBuilder.create(instance -> instance
			.group(BlockStateProvider.TYPE_CODEC.fieldOf("state").forGetter(CavePatchConfig::state),
					IntProvider.VALUE_CODEC.fieldOf("tries").forGetter(CavePatchConfig::tries),
					IntProvider.VALUE_CODEC.fieldOf("height").forGetter(CavePatchConfig::height),
					IntProvider.VALUE_CODEC.fieldOf("size").forGetter(CavePatchConfig::size),
					Codec.FLOAT.fieldOf("extraBlockChance").forGetter(CavePatchConfig::extraBlockChance),
					BlockState.CODEC.fieldOf("extraBlock").forGetter(CavePatchConfig::extraBlock)
			).apply(instance, instance.stable(CavePatchConfig::new)));

}