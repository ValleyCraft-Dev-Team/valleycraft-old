package io.github.linkle.valleycraft.init.features;

import java.util.function.Predicate;

import io.github.linkle.valleycraft.ValleyMain;
import io.github.linkle.valleycraft.config.objects.PlantConfig;
import io.github.linkle.valleycraft.init.Aquatic;
import io.github.linkle.valleycraft.utils.Util;
import io.github.linkle.valleycraft.world.gen.features.SimplePatchConfig;
import io.github.linkle.valleycraft.world.placer.ConditionBlockPlacer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FluidFillable;
import net.minecraft.block.TallPlantBlock;
import net.minecraft.state.property.Properties;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.RarityFilterPlacementModifier;
import net.minecraft.world.gen.decorator.SquarePlacementModifier;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

public class OceanFeatures {
    
    public static void initialize() {
        Predicate<BiomeSelectionContext> selection;
        PlantConfig set;
        var step = GenerationStep.Feature.TOP_LAYER_MODIFICATION; // Fix random hole patches on ice layer
        var config = ValleyMain.CONFIG.featureGenerations.oceanFeatures;

        if (config.redSeaGrassPatch.enable) {
            set = config.redSeaGrassPatch;
            selection = BiomeSelectors.categories(Category.RIVER, Category.OCEAN, Category.SWAMP, Category.BEACH);
            BiomeModifications.addFeature(selection, step, create("red_seagrass_patch", Aquatic.RED_SEA_GRASS, set.tries, set.rarity));
        }
        
        if (config.seaFernPatch.enable) {
            set = config.seaFernPatch;
            selection = BiomeSelectors.includeByKey(BiomeKeys.OCEAN, BiomeKeys.DEEP_OCEAN, BiomeKeys.WARM_OCEAN, BiomeKeys.DEEP_LUKEWARM_OCEAN, BiomeKeys.LUKEWARM_OCEAN, BiomeKeys.BEACH, BiomeKeys.RIVER);
            BiomeModifications.addFeature(selection, step, create("sea_fern_patch", Aquatic.SEA_FERN, set.tries, set.rarity));
        }
        
        if (config.seaUrchinPatch.enable) {
            set = config.seaUrchinPatch;
            selection = BiomeSelectors.includeByKey(BiomeKeys.OCEAN, BiomeKeys.DEEP_OCEAN, BiomeKeys.WARM_OCEAN, BiomeKeys.DEEP_LUKEWARM_OCEAN, BiomeKeys.LUKEWARM_OCEAN, BiomeKeys.BEACH, BiomeKeys.COLD_OCEAN, BiomeKeys.DEEP_COLD_OCEAN);
            BiomeModifications.addFeature(selection, step, create("sea_urchin_patch", Aquatic.SEA_URCHIN, set.tries, set.rarity));
        }

        if (config.tubeWormPatch.enable) {
            set = config.tubeWormPatch;
            selection = BiomeSelectors.includeByKey(BiomeKeys.DEEP_OCEAN, BiomeKeys.DEEP_LUKEWARM_OCEAN, BiomeKeys.DEEP_COLD_OCEAN, BiomeKeys.WARM_OCEAN);
            BiomeModifications.addFeature(selection, step, create("tube_worm_patch", Aquatic.TUBE_WORMS, set.tries, set.rarity));
        }
        
        if (config.anPinkPatch.enable) {
            set = config.anPinkPatch;
            selection = BiomeSelectors.includeByKey(BiomeKeys.DEEP_OCEAN, BiomeKeys.WARM_OCEAN, BiomeKeys.DEEP_LUKEWARM_OCEAN);
            BiomeModifications.addFeature(selection, step, create("an_pink_patch", Aquatic.ANEMONE_PINK, set.tries, set.rarity));
        }
        
        if (config.anPurplePatch.enable) {
            set = config.anPurplePatch;
            selection = BiomeSelectors.includeByKey(BiomeKeys.DEEP_OCEAN, BiomeKeys.WARM_OCEAN, BiomeKeys.DEEP_LUKEWARM_OCEAN);
            BiomeModifications.addFeature(selection, step, create("an_purple_patch", Aquatic.ANEMONE_PURPLE, set.tries, set.rarity));
        }
        
        if (config.anYellowPatch.enable) {
            set = config.anYellowPatch;
            selection = BiomeSelectors.includeByKey(BiomeKeys.DEEP_OCEAN, BiomeKeys.WARM_OCEAN, BiomeKeys.DEEP_LUKEWARM_OCEAN);
            BiomeModifications.addFeature(selection, step, create("an_yellow_patch", Aquatic.ANEMONE_YELLOW, set.tries, set.rarity));
        }
        
        if (config.anGreenPatch.enable) {
            set = config.anGreenPatch;
            selection = BiomeSelectors.includeByKey(BiomeKeys.DEEP_OCEAN, BiomeKeys.WARM_OCEAN, BiomeKeys.DEEP_LUKEWARM_OCEAN);
            BiomeModifications.addFeature(selection, step, create("an_green_patch", Aquatic.ANEMONE_GREEN, set.tries, set.rarity));
        }
        
        if (config.anOrangePatch.enable) {
            set = config.anOrangePatch;
            selection = BiomeSelectors.includeByKey(BiomeKeys.DEEP_OCEAN, BiomeKeys.WARM_OCEAN, BiomeKeys.DEEP_LUKEWARM_OCEAN);
            BiomeModifications.addFeature(selection, step, create("an_orange_patch", Aquatic.ANEMONE_ORANGE, set.tries, set.rarity));
        }
        
        if (config.scallopPatch.enable) {
            set = config.scallopPatch;
            selection = BiomeSelectors.includeByKey(BiomeKeys.COLD_OCEAN, BiomeKeys.DEEP_COLD_OCEAN, BiomeKeys.FROZEN_OCEAN, BiomeKeys.DEEP_FROZEN_OCEAN);
            BiomeModifications.addFeature(selection, step, create("scallop_patch", Util.randomHoriFacing(Aquatic.GIANT_SCALLOP.getDefaultState()), set.tries, set.rarity));
        }

        if (config.clamPatch.enable) {
            set = config.clamPatch;
            selection = BiomeSelectors.categories(Category.OCEAN, Category.BEACH);
            BiomeModifications.addFeature(selection, step, create("clam_patch", Util.randomHoriFacing(Aquatic.CLAM.getDefaultState().with(Properties.WATERLOGGED, true)), set.tries, set.rarity));
        }
        
        if (config.sandDollarPatch.enable) {
            set = config.sandDollarPatch;
            selection = BiomeSelectors.categories(Category.OCEAN, Category.BEACH);
            BiomeModifications.addFeature(selection, step, create("sand_dollar_patch", Aquatic.SAND_DOLLAR, set.tries, set.rarity));
        }

        if (config.starfishPatch.enable) {
            set = config.starfishPatch;
            selection = BiomeSelectors.categories(Category.OCEAN, Category.BEACH);
            BiomeModifications.addFeature(selection, step, create("starfish_orange_patch", Util.randomHoriFacing(Aquatic.STARFISH_ORANGE.getDefaultState()), set.tries, set.rarity));
        }
    }
    
    private static final int PLACER = VFeatures.SIMPLE_PATCH.create(new ConditionBlockPlacer((world, pos) -> {
        if (world.isWater(pos)) {
            return true;
        }
        
        var state = world.getBlockState(pos);
        if (!state.getMaterial().isReplaceable()) {
            return false;
        }
        
        if (state.getBlock() instanceof TallPlantBlock) {
            return false;
        }
        
        return state.getBlock() instanceof FluidFillable;
    }));
    
    private static RegistryKey<PlacedFeature> create(String id, Block block, int tries, int rarity) {
        return create(id, block.getDefaultState(), tries, rarity);
    }
    
    private static RegistryKey<PlacedFeature> create(String id, BlockState state, int tries, int rarity) {
        if (state.contains(Properties.WATERLOGGED)) {
            state = state.with(Properties.WATERLOGGED, true);
        }
        return create(id, BlockStateProvider.of(state), tries, rarity);
    }
    
    private static RegistryKey<PlacedFeature> create(String id, BlockStateProvider block, int tries, int rarity) {
        var config = VFeatures.SIMPLE_PATCH.configure(new SimplePatchConfig(block, tries, 7, 3, PLACER));
        return Util.register(id, config, RarityFilterPlacementModifier.of(rarity), SquarePlacementModifier.of(), PlacedFeatures.OCEAN_FLOOR_WG_HEIGHTMAP);
    }
}
