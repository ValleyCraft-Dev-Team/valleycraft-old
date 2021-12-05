package net.linkle.valley.Registry.Initializers.ConfiguredFeatures;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.linkle.valley.ValleyMain;
import net.linkle.valley.Registry.Initializers.Plants;
import net.linkle.valley.Registry.Initializers.ConfiguredFeatures.Gen.CavePatchConfig;
import net.linkle.valley.Registry.Initializers.ConfiguredFeatures.Gen.CavePatchFeature;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;

public class CaveFeatures {
    /** Custom gen feature to spawn stuffs in caves. */
    private static final CavePatchFeature CAVE_PATCH = new CavePatchFeature();

    private static final ConfiguredFeature<?, ?> RED_PILE_PATCH_CONFIG = CAVE_PATCH
            .configure(new CavePatchConfig(Plants.RED_PILE.getDefaultState(), 20, 4, 6));
    
    private static final ConfiguredFeature<?, ?> SPIDER_EGG_PATCH_CONFIG = CAVE_PATCH
            .configure(new CavePatchConfig(Plants.SPIDER_EGG_BLOCK.getDefaultState(), 20, 4, 6));

    public static void initialize() {
        Registry.register(Registry.FEATURE, new Identifier(ValleyMain.MOD_ID, "cave_patch"), CAVE_PATCH);

        var patch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(ValleyMain.MOD_ID, "red_pile_patch_cave"));
        var range = new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.aboveBottom(5), YOffset.fixed(20))); // 20 is maximum height can spawn.
        var decor = Decorator.RANGE.configure(range).spreadHorizontally().applyChance(4);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, patch.getValue(), RED_PILE_PATCH_CONFIG.decorate(decor));
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_DECORATION, patch);
    
        patch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(ValleyMain.MOD_ID, "spider_egg_patch_cave"));
        range = new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.aboveBottom(5), YOffset.fixed(30)));
        decor = Decorator.RANGE.configure(range).spreadHorizontally().applyChance(5);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, patch.getValue(), SPIDER_EGG_PATCH_CONFIG.decorate(decor));
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_DECORATION, patch);
    }
}
