package io.github.linkle.valleycraft.utils;

import java.util.List;

import io.github.linkle.valleycraft.ValleyMain;
import net.minecraft.block.Block;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.decorator.PlacementModifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;

public class Util {
    public static Item register(String ID, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ValleyMain.MOD_ID, ID), item);
    }
    
    public static Block register(String ID, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(ValleyMain.MOD_ID, ID), block);
    }
    
    public static void registerWithItem(String ID, Block block, Item.Settings settings) {
        var id = new Identifier(ValleyMain.MOD_ID, ID);
        Registry.register(Registry.BLOCK, id, block);
        Registry.register(Registry.ITEM, id, new BlockItem(block, settings));
    }
    
    public static boolean inWater(ItemPlacementContext context) {
        var state = context.getWorld().getFluidState(context.getBlockPos());
        return state.getFluid() == Fluids.WATER;
    }
    
    public static RegistryKey<PlacedFeature> register(String id, ConfiguredFeature<?, ?> config, PlacementModifier... mods) {
        return register(id, config, List.of(mods));
    }
    
    public static RegistryKey<PlacedFeature> register(String id, ConfiguredFeature<?, ?> config, List<PlacementModifier> mods) {
        var place = config.withPlacement(mods);
        var identifier = new Identifier(ValleyMain.MOD_ID, id);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, identifier, config);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, identifier, place);
        return RegistryKey.of(Registry.PLACED_FEATURE_KEY, identifier);
    }
}
