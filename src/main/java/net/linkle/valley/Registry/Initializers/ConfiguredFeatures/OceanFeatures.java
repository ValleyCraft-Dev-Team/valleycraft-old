package net.linkle.valley.Registry.Initializers.ConfiguredFeatures;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.linkle.valley.ValleyMain;
import net.linkle.valley.Registry.Initializers.Aquatic;
import net.linkle.valley.Registry.Initializers.ConfiguredFeatures.Gen.SeaPatchConfig;
import net.linkle.valley.Registry.Initializers.ConfiguredFeatures.Gen.SeaPatchFeature;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.Heightmap;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.ConfiguredDecorator;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.HeightmapDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class OceanFeatures {
    /** Custom gen feature to spawn stuffs in ocean. */
    private static final SeaPatchFeature SEA_PATCH = new SeaPatchFeature();
    private static final ConfiguredDecorator<?> OCEAN_FLOOR = Decorator.HEIGHTMAP.configure(new HeightmapDecoratorConfig(Heightmap.Type.OCEAN_FLOOR_WG)).spreadHorizontally();

    private static final ConfiguredFeature<?, ?> RED_SEAGRASS_PATCH_CONFIG = SEA_PATCH
            .configure(new SeaPatchConfig(Aquatic.RED_SEAGRASS.getDefaultState(), UniformIntProvider.create(10, 16), 9));

    public static void initialize() {
        Registry.register(Registry.FEATURE, new Identifier(ValleyMain.MOD_ID, "sea_patch"), SEA_PATCH);

        var patch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(ValleyMain.MOD_ID, "red_seagrass_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, patch.getValue(), RED_SEAGRASS_PATCH_CONFIG.decorate(OCEAN_FLOOR).applyChance(3));
        BiomeModifications.addFeature(BiomeSelectors.categories(Category.RIVER, Category.OCEAN, Category.SWAMP), GenerationStep.Feature.VEGETAL_DECORATION, patch);
    }

    private static boolean oceanOnly(BiomeSelectionContext context) {
        return context.getBiome().getCategory() == Category.OCEAN;
    }
}
