package net.linkle.valley.Registry.Initializers.ConfiguredFeatures;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.linkle.valley.ValleyMain;
import net.linkle.valley.Registry.Initializers.Aquatic;
import net.linkle.valley.Registry.Initializers.ConfiguredFeatures.Gen.GlowKelpFeature;
import net.linkle.valley.Registry.Initializers.ConfiguredFeatures.Gen.SeaPatchConfig;
import net.linkle.valley.Registry.Initializers.ConfiguredFeatures.Gen.SeaPatchFeature;
import net.linkle.valley.Registry.Utils.SimpleConfig;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.Heightmap;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.ConfiguredDecorator;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.HeightmapDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.FeatureConfig;

public class OceanFeatures {
    /** Custom gen feature to spawn stuffs in ocean. */
    private static final SeaPatchFeature SEA_PATCH = new SeaPatchFeature();
    private static final GlowKelpFeature GLOW_KELP = new GlowKelpFeature();
    private static final ConfiguredDecorator<?> OCEAN_FLOOR = Decorator.HEIGHTMAP.configure(new HeightmapDecoratorConfig(Heightmap.Type.OCEAN_FLOOR_WG)).spreadHorizontally();

    private static final ConfiguredFeature<?, ?> RED_SEAGRASS_PATCH_CONFIG = SEA_PATCH
            .configure(new SeaPatchConfig(Aquatic.RED_SEAGRASS.getDefaultState(), UniformIntProvider.create(10, 16), 9));

    public static void initialize(SimpleConfig config) {
        Registry.register(Registry.FEATURE, new Identifier(ValleyMain.MOD_ID, "sea_patch"), SEA_PATCH);
        Registry.register(Registry.FEATURE, new Identifier(ValleyMain.MOD_ID, "glow_kelp"), GLOW_KELP);
        
        boolean enableGen = !config.get("disable-features-gen", false);

        var patch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(ValleyMain.MOD_ID, "red_seagrass_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, patch.getValue(), RED_SEAGRASS_PATCH_CONFIG.decorate(OCEAN_FLOOR).applyChance(1));
        if (enableGen)
        BiomeModifications.addFeature(BiomeSelectors.categories(Category.RIVER, Category.OCEAN, Category.SWAMP, Category.BEACH, Category.UNDERGROUND), GenerationStep.Feature.VEGETAL_DECORATION, patch);
    
        patch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(ValleyMain.MOD_ID, "glow_kelp"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, patch.getValue(), GLOW_KELP.configure(FeatureConfig.DEFAULT).decorate(OCEAN_FLOOR).applyChance(2));
        if (enableGen)
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FROZEN_OCEAN, BiomeKeys.DEEP_FROZEN_OCEAN), GenerationStep.Feature.VEGETAL_DECORATION, patch);
    }

    private static boolean oceanOnly(BiomeSelectionContext context) {
        return context.getBiome().getCategory() == Category.OCEAN;
    }
}
