package io.github.linkle.valleycraft.init;

import static io.github.linkle.valleycraft.utils.Util.newId;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

public class Reg {
	public static Item register(String id, Item item) {
	    return Registry.register(Registry.ITEM, newId(id), item);
	}

	public static Block register(String id, Block block) {
	    return Registry.register(Registry.BLOCK, newId(id), block);
	}

	public static void register(String id, BlockItem item) {
	    var identifier = newId(id);
	    Registry.register(Registry.BLOCK, identifier, item.getBlock());
	    Registry.register(Registry.ITEM, identifier, item);
	}

	public static void registerWithItem(String id, Block block, Item.Settings settings) {
	    var identifier = newId(id);
	    block = Registry.register(Registry.BLOCK, identifier, block);
	    Registry.register(Registry.ITEM, identifier, new BlockItem(block, settings));
	}
    
    public static <C extends FeatureConfig> Feature<C> register(String id, Feature<C> feature) {
        return Registry.register(Registry.FEATURE, newId(id), feature);
    }
    
    public static <T> RegistryEntry<T> add(Registry<T> registry, String id, T value) {
        return BuiltinRegistries.add(registry, newId(id), value);
    }
    
    public static RegistryEntry<PlacedFeature> register(String id, RegistryEntry<? extends ConfiguredFeature<?, ?>> entry, List<PlacementModifier> modifiers) {
        return add(BuiltinRegistries.PLACED_FEATURE, id, new PlacedFeature(RegistryEntry.upcast(entry), modifiers));
    }
    
    public static RegistryEntry<PlacedFeature> register(String id, ConfiguredFeature<?, ?> config, List<PlacementModifier> modifiers) {
        var identifier = newId(id);
        var entry = BuiltinRegistries.add(BuiltinRegistries.CONFIGURED_FEATURE, identifier, config);
        return BuiltinRegistries.add(BuiltinRegistries.PLACED_FEATURE, identifier, new PlacedFeature(RegistryEntry.upcast(entry), modifiers));
    }
    
    public static RegistryEntry<PlacedFeature> register(String id, ConfiguredFeature<?, ?> config, PlacementModifier... modifiers) {
        return register(id, config, List.of(modifiers));
    }
    
    public static RegistryEntry<PlacedFeature> register(String id, RegistryEntry<? extends ConfiguredFeature<?, ?>> entry, PlacementModifier... modifiers) {
        return register(id, entry, List.of(modifiers));
    }
}
