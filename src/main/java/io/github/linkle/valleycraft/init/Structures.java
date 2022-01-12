package io.github.linkle.valleycraft.init;

import static io.github.linkle.valleycraft.ValleyMain.MOD_ID;

import io.github.linkle.valleycraft.world.gen.structures.ResearchStationFeature;
import io.github.linkle.valleycraft.world.gen.structures.ShipwreckFeature;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.structure.v1.FabricStructureBuilder;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredStructureFeature;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.StructureFeature;

public class Structures {
    private static final StructureFeature<DefaultFeatureConfig> SHIPWRECK = new ShipwreckFeature();
    
    private static final StructureFeature<DefaultFeatureConfig> AQUATIC_STATION = new ResearchStationFeature();

    public static void initialize() {
        var surface = GenerationStep.Feature.SURFACE_STRUCTURES;
        var underground = GenerationStep.Feature.UNDERGROUND_STRUCTURES;
        RegistryKey<ConfiguredStructureFeature<?, ?>> key;

        FabricStructureBuilder.create(new Identifier(MOD_ID, "shipwreck"), SHIPWRECK)
                .step(surface)
                .defaultConfig(32, 12, 4353)
                .adjustsSurface()
                .register();
        
        FabricStructureBuilder.create(new Identifier(MOD_ID, "research_station"), AQUATIC_STATION)
                .step(surface)
                .defaultConfig(64, 28, 5678)
                .register();

        key = registor(SHIPWRECK.configure(DefaultFeatureConfig.DEFAULT), "shipwreck");
        BiomeModifications.addStructure(BiomeSelectors.categories(Category.OCEAN), key);
        
        key = registor(AQUATIC_STATION.configure(DefaultFeatureConfig.DEFAULT), "research_station");
        BiomeModifications.addStructure(BiomeSelectors.categories(Category.OCEAN), key);
    }

    private static RegistryKey<ConfiguredStructureFeature<?, ?>> registor(ConfiguredStructureFeature<?, ?> config, String id) {
        var key = RegistryKey.of(Registry.CONFIGURED_STRUCTURE_FEATURE_KEY, new Identifier(MOD_ID, id));
        BuiltinRegistries.add(BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE, key.getValue(), config);
        return key;
    }
}
