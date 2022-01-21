package io.github.linkle.valleycraft.world.gen.features;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.dynamic.Codecs;
import net.minecraft.world.gen.feature.FeatureConfig;

public record CrystalPatchConfig(BlockState state, int tries, int spread) implements FeatureConfig {
    public static final Codec<CrystalPatchConfig> CODEC = RecordCodecBuilder.create(instance -> instance
            .group(BlockState.CODEC.fieldOf("state").forGetter(CrystalPatchConfig::state),
            Codecs.POSITIVE_INT.fieldOf("tries").forGetter(CrystalPatchConfig::tries),
            Codecs.POSITIVE_INT.fieldOf("spread").forGetter(CrystalPatchConfig::spread))
            .apply(instance, instance.stable(CrystalPatchConfig::new)));
    
    public CrystalPatchConfig(Block block, int tries, int spread) {
        this(block.getDefaultState(), tries, spread);
    }
}
