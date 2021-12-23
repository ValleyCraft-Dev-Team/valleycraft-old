package io.github.linkle.valleycraft.init.features;

import io.github.linkle.valleycraft.ValleyMain;
import io.github.linkle.valleycraft.init.Aquatic;
import io.github.linkle.valleycraft.utils.Util;
import io.github.linkle.valleycraft.world.gen.features.SeaPatchConfig;
import io.github.linkle.valleycraft.world.gen.features.SeaPatchFeature;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.PlacementModifier;
import net.minecraft.world.gen.decorator.RarityFilterPlacementModifier;
import net.minecraft.world.gen.decorator.SquarePlacementModifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;

import java.util.ArrayList;
import java.util.function.Predicate;

public class OceanFeatures {
    /** Custom gen feature to spawn stuffs in ocean. */
    private static final SeaPatchFeature SEA_PATCH = new SeaPatchFeature();
    
    private static final ConfiguredFeature<?, ?> RED_SEAGRASS_PATCH_CONFIG = SEA_PATCH
            .configure(new SeaPatchConfig(Aquatic.RED_SEA_GRASS.getDefaultState(), UniformIntProvider.create(10, 16), 9));
    
    private static final ConfiguredFeature<?, ?> CLAM_PATCH_CONFIG = SEA_PATCH
            .configure(new SeaPatchConfig(Aquatic.CLAM.getDefaultState().with(Properties.WATERLOGGED, true), UniformIntProvider.create(3, 5), 7));
    
    private static final ConfiguredFeature<?, ?> SAND_DOllAR_CONFIG = SEA_PATCH
            .configure(new SeaPatchConfig(Aquatic.SAND_DOLLAR.getDefaultState().with(Properties.WATERLOGGED, true), UniformIntProvider.create(1, 3), 5));

    public static void initialize() {
        Registry.register(Registry.FEATURE, new Identifier(ValleyMain.MOD_ID, "sea_patch"), SEA_PATCH);

        Predicate<BiomeSelectionContext> selection;
        ArrayList<PlacementModifier> list;

        list = new ArrayList<>();
        list.add(SquarePlacementModifier.of());
        list.add(PlacedFeatures.OCEAN_FLOOR_WG_HEIGHTMAP);
        RegistryKey<PlacedFeature> redSeaGrassPatchKey = Util.register("red_seagrass_patch", RED_SEAGRASS_PATCH_CONFIG, list);
        selection = BiomeSelectors.categories(Category.RIVER, Category.OCEAN, Category.SWAMP, Category.BEACH);
        if (ValleyMain.CONFIG.featureGenerations.oceanFeatures.redSeaGrassPatchEnabled)
            BiomeModifications.addFeature(selection, GenerationStep.Feature.VEGETAL_DECORATION, redSeaGrassPatchKey);
        
        list = new ArrayList<>();
        list.add(RarityFilterPlacementModifier.of(3));
        list.add(SquarePlacementModifier.of());
        RegistryKey<PlacedFeature> clamPatchKey = Util.register("clam_patch", CLAM_PATCH_CONFIG, list);
        selection = BiomeSelectors.categories(Category.OCEAN, Category.BEACH);
        if (ValleyMain.CONFIG.featureGenerations.oceanFeatures.clamPatchEnabled)
            BiomeModifications.addFeature(selection, GenerationStep.Feature.VEGETAL_DECORATION, clamPatchKey);
        
        list = new ArrayList<>();
        list.add(RarityFilterPlacementModifier.of(6));
        list.add(SquarePlacementModifier.of());
        list.add(PlacedFeatures.OCEAN_FLOOR_WG_HEIGHTMAP);
        RegistryKey<PlacedFeature> sandDollarPatchKey = Util.register("sand_dollar_patch", SAND_DOllAR_CONFIG, list);
        selection = BiomeSelectors.categories(Category.OCEAN, Category.BEACH);
        if (ValleyMain.CONFIG.featureGenerations.oceanFeatures.sandDollarPatchEnabled)
            BiomeModifications.addFeature(selection, GenerationStep.Feature.VEGETAL_DECORATION, sandDollarPatchKey);
    }

}
