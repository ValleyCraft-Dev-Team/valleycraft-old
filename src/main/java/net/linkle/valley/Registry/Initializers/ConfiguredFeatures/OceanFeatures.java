package net.linkle.valley.Registry.Initializers.ConfiguredFeatures;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.linkle.valley.ValleyMain;
import net.linkle.valley.Registry.Initializers.ConfiguredFeatures.Gen.SeaPatchConfig;
import net.linkle.valley.Registry.Initializers.ConfiguredFeatures.Gen.SeaPatchFeature;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.Heightmap;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.HeightmapDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;

@SuppressWarnings("deprecation")
public class OceanFeatures {
    /** Custom gen feature to spawn stuffs in ocean. */
    private static final SeaPatchFeature SEA_PATCH = new SeaPatchFeature();

    private static final ConfiguredFeature<?, ?> GLOW_PATCH_CONFIG = SEA_PATCH
            .configure(new SeaPatchConfig(Blocks.GLOWSTONE.getDefaultState(), UniformIntProvider.create(4, 6), 8));

    public static void initialize() {
        Registry.register(Registry.FEATURE, new Identifier(ValleyMain.MOD_ID, "sea_patch"), SEA_PATCH);

        var glowPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(ValleyMain.MOD_ID, "glowstone_patch"));
        var oceanFloor = Decorator.HEIGHTMAP.configure(new HeightmapDecoratorConfig(Heightmap.Type.OCEAN_FLOOR_WG)).spreadHorizontally();

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, glowPatch.getValue(), GLOW_PATCH_CONFIG.decorate(oceanFloor).applyChance(5));

        BiomeModifications.addFeature(OceanFeatures::oceanOnly, GenerationStep.Feature.VEGETAL_DECORATION, glowPatch);
    }

    private static boolean oceanOnly(BiomeSelectionContext context) {
        return context.getBiome().getCategory() == Biome.Category.OCEAN;
    }
}
