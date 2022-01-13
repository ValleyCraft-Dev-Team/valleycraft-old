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
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.HeightRangePlacementModifier;
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
            .configure(new SeaPatchConfig(Util.randomHoriFacing(Aquatic.CLAM.getDefaultState().with(Properties.WATERLOGGED, true)), UniformIntProvider.create(3, 5), 7));
    
    private static final ConfiguredFeature<?, ?> SAND_DOllAR_CONFIG = SEA_PATCH
            .configure(new SeaPatchConfig(Aquatic.SAND_DOLLAR.getDefaultState().with(Properties.WATERLOGGED, true), UniformIntProvider.create(1, 3), 5));

    private static final ConfiguredFeature<?, ?> STARFISH_CONFIG = SEA_PATCH
            .configure(new SeaPatchConfig(Aquatic.STARFISH_ORANGE.getDefaultState().with(Properties.WATERLOGGED, true), UniformIntProvider.create(1, 1), 5));

    private static final ConfiguredFeature<?, ?> SEA_URCHIN_CONFIG = SEA_PATCH
            .configure(new SeaPatchConfig(Aquatic.SEA_URCHIN.getDefaultState().with(Properties.WATERLOGGED, true), UniformIntProvider.create(1, 5), 5));

    private static final ConfiguredFeature<?, ?> SEA_FERN_CONFIG = SEA_PATCH
            .configure(new SeaPatchConfig(Aquatic.SEA_FERN.getDefaultState().with(Properties.WATERLOGGED, true), UniformIntProvider.create(4, 16), 9));

    private static final ConfiguredFeature<?, ?> GIANT_SCALLOP_CONFIG = SEA_PATCH
            .configure(new SeaPatchConfig(Util.randomHoriFacing(Aquatic.GIANT_SCALLOP.getDefaultState().with(Properties.WATERLOGGED, true)), UniformIntProvider.create(1, 3), 5));

    private static final ConfiguredFeature<?, ?> TUBE_WORMS_CONFIG = SEA_PATCH
            .configure(new SeaPatchConfig(Aquatic.TUBE_WORMS.getDefaultState().with(Properties.WATERLOGGED, true), UniformIntProvider.create(3, 5), 8));

    private static final ConfiguredFeature<?, ?> ANEMONE_PINK_CONFIG = SEA_PATCH
            .configure(new SeaPatchConfig(Aquatic.ANEMONE_PINK.getDefaultState().with(Properties.WATERLOGGED, true), UniformIntProvider.create(3, 6), 6));

    private static final ConfiguredFeature<?, ?> ANEMONE_PURPLE_CONFIG = SEA_PATCH
            .configure(new SeaPatchConfig(Aquatic.ANEMONE_PURPLE.getDefaultState().with(Properties.WATERLOGGED, true), UniformIntProvider.create(3, 6), 6));

    private static final ConfiguredFeature<?, ?> ANEMONE_YELLOW_CONFIG = SEA_PATCH
            .configure(new SeaPatchConfig(Aquatic.ANEMONE_YELLOW.getDefaultState().with(Properties.WATERLOGGED, true), UniformIntProvider.create(3, 6), 6));

    private static final ConfiguredFeature<?, ?> ANEMONE_GREEN_CONFIG = SEA_PATCH
            .configure(new SeaPatchConfig(Aquatic.ANEMONE_GREEN.getDefaultState().with(Properties.WATERLOGGED, true), UniformIntProvider.create(3, 6), 6));

    private static final ConfiguredFeature<?, ?> ANEMONE_ORANGE_CONFIG = SEA_PATCH
            .configure(new SeaPatchConfig(Aquatic.ANEMONE_ORANGE.getDefaultState().with(Properties.WATERLOGGED, true), UniformIntProvider.create(3, 6), 6));

    public static void initialize() {
        Registry.register(Registry.FEATURE, new Identifier(ValleyMain.MOD_ID, "sea_patch"), SEA_PATCH);

        Predicate<BiomeSelectionContext> selection;
        ArrayList<PlacementModifier> list;
        var step = GenerationStep.Feature.TOP_LAYER_MODIFICATION; // Fix random hole patches on ice layer

        list = new ArrayList<>();
        list.add(SquarePlacementModifier.of());
        list.add(PlacedFeatures.OCEAN_FLOOR_WG_HEIGHTMAP);
        RegistryKey<PlacedFeature> redSeaGrassPatchKey = Util.register("red_seagrass_patch", RED_SEAGRASS_PATCH_CONFIG, list);
        selection = BiomeSelectors.categories(Category.RIVER, Category.OCEAN, Category.SWAMP, Category.BEACH);
        if (ValleyMain.CONFIG.featureGenerations.oceanFeatures.redSeaGrassPatchEnabled)
            BiomeModifications.addFeature(selection, step, redSeaGrassPatchKey);

        list = new ArrayList<>();
        list.add(SquarePlacementModifier.of());
        list.add(PlacedFeatures.OCEAN_FLOOR_WG_HEIGHTMAP);
        RegistryKey<PlacedFeature> seaFernGrassPatchKey = Util.register("sea_fern_patch", SEA_FERN_CONFIG, list);
        selection = BiomeSelectors.includeByKey(BiomeKeys.OCEAN, BiomeKeys.DEEP_OCEAN, BiomeKeys.WARM_OCEAN, BiomeKeys.DEEP_LUKEWARM_OCEAN, BiomeKeys.LUKEWARM_OCEAN, BiomeKeys.BEACH);
            BiomeModifications.addFeature(selection, step, seaFernGrassPatchKey);

        list = new ArrayList<>();
        list.add(RarityFilterPlacementModifier.of(8));
        list.add(SquarePlacementModifier.of());
        list.add(PlacedFeatures.OCEAN_FLOOR_WG_HEIGHTMAP);
        RegistryKey<PlacedFeature> seaUrchinPatchKey = Util.register("sea_urchin_patch", SEA_URCHIN_CONFIG, list);
        selection = BiomeSelectors.includeByKey(BiomeKeys.OCEAN, BiomeKeys.DEEP_OCEAN, BiomeKeys.WARM_OCEAN, BiomeKeys.DEEP_LUKEWARM_OCEAN, BiomeKeys.LUKEWARM_OCEAN, BiomeKeys.BEACH, BiomeKeys.COLD_OCEAN, BiomeKeys.DEEP_COLD_OCEAN);
        BiomeModifications.addFeature(selection, step, seaUrchinPatchKey);

        list = new ArrayList<>();
        list.add(RarityFilterPlacementModifier.of(10));
        list.add(SquarePlacementModifier.of());
        list.add(PlacedFeatures.OCEAN_FLOOR_WG_HEIGHTMAP);
        RegistryKey<PlacedFeature> tubeWormPatchKey = Util.register("tube_worm_patch", TUBE_WORMS_CONFIG, list);
        selection = BiomeSelectors.includeByKey(BiomeKeys.DEEP_OCEAN, BiomeKeys.DEEP_LUKEWARM_OCEAN, BiomeKeys.DEEP_COLD_OCEAN, BiomeKeys.WARM_OCEAN);
        BiomeModifications.addFeature(selection, step, tubeWormPatchKey);

        list = new ArrayList<>();
        list.add(RarityFilterPlacementModifier.of(15));
        list.add(SquarePlacementModifier.of());
        list.add(PlacedFeatures.OCEAN_FLOOR_WG_HEIGHTMAP);
        RegistryKey<PlacedFeature> anPinkPatchKey = Util.register("an_pink_patch", ANEMONE_PINK_CONFIG, list);
        selection = BiomeSelectors.includeByKey(BiomeKeys.DEEP_OCEAN, BiomeKeys.WARM_OCEAN, BiomeKeys.DEEP_LUKEWARM_OCEAN);
        BiomeModifications.addFeature(selection, step, anPinkPatchKey);

        list = new ArrayList<>();
        list.add(RarityFilterPlacementModifier.of(15));
        list.add(SquarePlacementModifier.of());
        list.add(PlacedFeatures.OCEAN_FLOOR_WG_HEIGHTMAP);
        RegistryKey<PlacedFeature> anPurplePatchKey = Util.register("an_purple_patch", ANEMONE_PURPLE_CONFIG, list);
        selection = BiomeSelectors.includeByKey(BiomeKeys.DEEP_OCEAN, BiomeKeys.WARM_OCEAN, BiomeKeys.DEEP_LUKEWARM_OCEAN);
        BiomeModifications.addFeature(selection, step, anPurplePatchKey);

        list = new ArrayList<>();
        list.add(RarityFilterPlacementModifier.of(15));
        list.add(SquarePlacementModifier.of());
        list.add(PlacedFeatures.OCEAN_FLOOR_WG_HEIGHTMAP);
        RegistryKey<PlacedFeature> anYellowPatchKey = Util.register("an_yellow_patch", ANEMONE_YELLOW_CONFIG, list);
        selection = BiomeSelectors.includeByKey(BiomeKeys.DEEP_OCEAN, BiomeKeys.WARM_OCEAN, BiomeKeys.DEEP_LUKEWARM_OCEAN);
        BiomeModifications.addFeature(selection, step, anYellowPatchKey);

        list = new ArrayList<>();
        list.add(RarityFilterPlacementModifier.of(15));
        list.add(SquarePlacementModifier.of());
        list.add(PlacedFeatures.OCEAN_FLOOR_WG_HEIGHTMAP);
        RegistryKey<PlacedFeature> anGreenPatchKey = Util.register("an_green_patch", ANEMONE_GREEN_CONFIG, list);
        selection = BiomeSelectors.includeByKey(BiomeKeys.DEEP_OCEAN, BiomeKeys.WARM_OCEAN, BiomeKeys.DEEP_LUKEWARM_OCEAN);
        BiomeModifications.addFeature(selection, step, anGreenPatchKey);

        list = new ArrayList<>();
        list.add(RarityFilterPlacementModifier.of(15));
        list.add(SquarePlacementModifier.of());
        list.add(PlacedFeatures.OCEAN_FLOOR_WG_HEIGHTMAP);
        RegistryKey<PlacedFeature> anOrangePatchKey = Util.register("an_orange_patch", ANEMONE_ORANGE_CONFIG, list);
        selection = BiomeSelectors.includeByKey(BiomeKeys.DEEP_OCEAN, BiomeKeys.WARM_OCEAN, BiomeKeys.DEEP_LUKEWARM_OCEAN);
        BiomeModifications.addFeature(selection, step, anOrangePatchKey);

        list = new ArrayList<>();
        list.add(RarityFilterPlacementModifier.of(3));
        list.add(SquarePlacementModifier.of());
        list.add(PlacedFeatures.OCEAN_FLOOR_WG_HEIGHTMAP);
        RegistryKey<PlacedFeature> scallopPatchKey = Util.register("scallop_patch", GIANT_SCALLOP_CONFIG, list);
        selection = BiomeSelectors.includeByKey(BiomeKeys.COLD_OCEAN, BiomeKeys.DEEP_COLD_OCEAN, BiomeKeys.FROZEN_OCEAN, BiomeKeys.DEEP_FROZEN_OCEAN);
        BiomeModifications.addFeature(selection, step, scallopPatchKey);

        list = new ArrayList<>();
        list.add(RarityFilterPlacementModifier.of(3));
        list.add(SquarePlacementModifier.of());
        RegistryKey<PlacedFeature> clamPatchKey = Util.register("clam_patch", CLAM_PATCH_CONFIG, list);
        selection = BiomeSelectors.categories(Category.OCEAN, Category.BEACH);
        if (ValleyMain.CONFIG.featureGenerations.oceanFeatures.clamPatchEnabled)
            BiomeModifications.addFeature(selection, step, clamPatchKey);
        
        list = new ArrayList<>();
        list.add(RarityFilterPlacementModifier.of(6));
        list.add(SquarePlacementModifier.of());
        list.add(PlacedFeatures.OCEAN_FLOOR_WG_HEIGHTMAP);
        RegistryKey<PlacedFeature> sandDollarPatchKey = Util.register("sand_dollar_patch", SAND_DOllAR_CONFIG, list);
        selection = BiomeSelectors.categories(Category.OCEAN, Category.BEACH);
        if (ValleyMain.CONFIG.featureGenerations.oceanFeatures.sandDollarPatchEnabled)
            BiomeModifications.addFeature(selection, step, sandDollarPatchKey);

        list = new ArrayList<>();
        list.add(RarityFilterPlacementModifier.of(8));
        list.add(SquarePlacementModifier.of());
        list.add(PlacedFeatures.OCEAN_FLOOR_WG_HEIGHTMAP);
        RegistryKey<PlacedFeature> starfishOrangePatchKey = Util.register("starfish_orange_patch", STARFISH_CONFIG, list);
        selection = BiomeSelectors.categories(Category.OCEAN, Category.BEACH);
        if (ValleyMain.CONFIG.featureGenerations.oceanFeatures.starfishPatchEnabled)
            BiomeModifications.addFeature(selection, step, starfishOrangePatchKey);
    }

}
