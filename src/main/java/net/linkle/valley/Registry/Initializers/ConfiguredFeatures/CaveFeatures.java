package net.linkle.valley.Registry.Initializers.ConfiguredFeatures;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.linkle.valley.ValleyMain;
import net.linkle.valley.Registry.Initializers.ConfiguredFeatures.Gen.CavePatchConfig;
import net.linkle.valley.Registry.Initializers.ConfiguredFeatures.Gen.CavePatchFeature;
import net.minecraft.block.Blocks;
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

    private static final ConfiguredFeature<?, ?> GLOW_PATCH_CONFIG = CAVE_PATCH
            .configure(new CavePatchConfig(Blocks.GLOWSTONE.getDefaultState(), 40, 4, 7));

    @SuppressWarnings("deprecation")
    public static void initialize() {
        Registry.register(Registry.FEATURE, new Identifier(ValleyMain.MOD_ID, "cave_patch"), CAVE_PATCH);

        var glowPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(ValleyMain.MOD_ID, "glowstone_patch_cave"));
        var offset = new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.aboveBottom(5), YOffset.fixed(42))); // 42 is maximum height can spawn.
        var spread = Decorator.RANGE.configure(offset).spreadHorizontally().applyChance(1);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, glowPatch.getValue(), GLOW_PATCH_CONFIG.decorate(spread));

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_DECORATION, glowPatch);
    }
}
