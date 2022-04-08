package io.github.linkle.valleycraft.init;

import static io.github.linkle.valleycraft.ValleyMain.MOD_ID;

import io.github.linkle.valleycraft.world.gen.structures.ResearchStationFeature;
import io.github.linkle.valleycraft.world.gen.structures.ShipwreckFeature;
import io.github.linkle.valleycraft.world.gen.structures.TidePoolFeatures;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredStructureFeature;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.StructureFeature;

public class Structures {
    private static final StructureFeature<DefaultFeatureConfig> SHIPWRECK = new ShipwreckFeature();
    private static final StructureFeature<DefaultFeatureConfig> AQUATIC_STATION = new ResearchStationFeature();
    private static final StructureFeature<DefaultFeatureConfig> TIDE_POOL = new TidePoolFeatures();

    public static void initialize() {
        var surface = GenerationStep.Feature.SURFACE_STRUCTURES;
        RegistryKey<ConfiguredStructureFeature<?, ?>> key;

        /*
        FabricStructureBuilder.create(new Identifier(MOD_ID, "shipwreck"), SHIPWRECK)
        .step(surface)
        .defaultConfig(24, 10, 4353)
        .adjustsSurface()
        .register();

        FabricStructureBuilder.create(new Identifier(MOD_ID, "research_station"), AQUATIC_STATION)
        .step(surface)
        .defaultConfig(64, 24, 5678)
        .register();

        FabricStructureBuilder.create(new Identifier(MOD_ID, "tide_pool"), TIDE_POOL)
        .step(surface)
        .defaultConfig(6, 2, 2545)
        .adjustsSurface()
        .register();

        key = registor(SHIPWRECK.configure(FeatureConfig.DEFAULT), "shipwreck");
        BiomeModifications.addStructure(BiomeSelectors.categories(Category.OCEAN), key);

        key = registor(AQUATIC_STATION.configure(FeatureConfig.DEFAULT), "research_station");
        BiomeModifications.addStructure(BiomeSelectors.categories(Category.OCEAN), key);

        key = registor(TIDE_POOL.configure(FeatureConfig.DEFAULT), "tide_pool");
        BiomeModifications.addStructure(BiomeSelectors.categories(Category.OCEAN), key);
        */
    }

    private static RegistryKey<ConfiguredStructureFeature<?, ?>> registor(ConfiguredStructureFeature<?, ?> config, String id) {
        var key = RegistryKey.of(Registry.CONFIGURED_STRUCTURE_FEATURE_KEY, new Identifier(MOD_ID, id));
        BuiltinRegistries.add(BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE, key.getValue(), config);
        return key;
    }
}
