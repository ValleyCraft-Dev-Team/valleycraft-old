package net.linkle.valley.Registry.Loot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.FabricLootSupplierBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback.LootTableSetter;
import net.minecraft.loot.LootManager;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;

/** Loot table helper using fabric's loot API. */
public class LootTableHelper {
    private static final Map<Identifier, List<FabricLootPoolBuilder>> POOLSMAP = new HashMap<>(64);
    
    /** Create and append a new pool. */
    public static void appendLoot(Identifier lootID, LootBuilder loot) {
        var pools = POOLSMAP.get(lootID);
        
        if (pools == null) {
            pools = new ArrayList<>(5);
            POOLSMAP.put(lootID, pools);
        }
        
        pools.add(loot.build());
    }
    
    private static void onLootLoad(ResourceManager resourceManager, LootManager manager, 
            Identifier id, FabricLootSupplierBuilder supplier, LootTableSetter setter) {
        var pools = POOLSMAP.get(id);
        if (pools != null) {
            pools.forEach(supplier::pool);
        }
    }
    
    static {
        LootTableLoadingCallback.EVENT.register(LootTableHelper::onLootLoad);
    }
}