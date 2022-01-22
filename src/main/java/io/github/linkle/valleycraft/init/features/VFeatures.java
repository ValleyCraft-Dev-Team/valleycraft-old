package io.github.linkle.valleycraft.init.features;

import io.github.linkle.valleycraft.ValleyMain;
import io.github.linkle.valleycraft.world.gen.features.CavePatchFeature;
import io.github.linkle.valleycraft.world.gen.features.CrystalPatchFeature;
import io.github.linkle.valleycraft.world.gen.features.GlowKelpFeature;
import io.github.linkle.valleycraft.world.gen.features.ReedPatchFeature;
import io.github.linkle.valleycraft.world.gen.features.SimplePatchFeature;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.Feature;

class VFeatures {
    static final SimplePatchFeature SIMPLE_PATCH = register(new SimplePatchFeature(), "simple_patch");
    static final ReedPatchFeature REED_PATCH = register(new ReedPatchFeature(), "reed_patch");
    static final CavePatchFeature CAVE_PATCH = register(new CavePatchFeature(), "cave_patch");
    static final GlowKelpFeature GLOW_KELP = register(new GlowKelpFeature(), "glow_kelp");
    static final CrystalPatchFeature PRIS_CLUSTER = register(new CrystalPatchFeature(), "pris_cluster");
    
    private static <T extends Feature<?>> T register(T feature, String id) {
        return Registry.register(Registry.FEATURE, new Identifier(ValleyMain.MOD_ID, id), feature);
    }
}
