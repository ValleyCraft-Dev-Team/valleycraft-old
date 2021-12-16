package net.linkle.valley.Registry.Loot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.FabricLootSupplierBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback.LootTableSetter;
import net.fabricmc.fabric.mixin.loot.table.LootSupplierBuilderHooks;
import net.minecraft.loot.LootManager;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;

import static net.linkle.valley.ValleyMain.LOGGER;

/** Loot table helper using fabric's loot API. */
public class LootTableHelper {
    private static final Map<Identifier, List<FabricLootPoolBuilder>> APPENDMAP = new HashMap<>(64);
    private static final Map<Identifier, List<Consumer<FabricLootPoolBuilder>>> INJECTMAP = new HashMap<>(64);
    
    /** Create and append a new pool. */
    public static void appendLoot(Identifier lootID, LootBuilder loot) {
        var pools = APPENDMAP.get(lootID);
        
        if (pools == null) {
            pools = new ArrayList<>(5);
            APPENDMAP.put(lootID, pools);
        }
        
        pools.add(loot.build());
    }
    
    /** Inject pool with new entry. */
    public static void injectLoot(Identifier lootID, Consumer<FabricLootPoolBuilder> consumer) {
        var pools = INJECTMAP.get(lootID);
        
        if (pools == null) {
            pools = new ArrayList<>(5);
            INJECTMAP.put(lootID, pools);
        }
        
        pools.add(consumer);
    }
    
    private static void onLootLoad(ResourceManager resourceManager, LootManager manager, 
            Identifier id, FabricLootSupplierBuilder supplier, LootTableSetter setter) {
        var inject = INJECTMAP.get(id);
        if (inject != null) {
            var pools = ((LootSupplierBuilderHooks)supplier).getPools();
            if (pools.isEmpty()) {
                LOGGER.warn("Unable inject loot for " + id);
            } else {
                var pool = FabricLootPoolBuilder.of(pools.get(0));
                inject.forEach(c->c.accept(pool));
                pools.set(0, pool.build());
            }
        }
        
        var append = APPENDMAP.get(id);
        if (append != null) {
            append.forEach(supplier::pool);
        }
    }
    
    static {
        LootTableLoadingCallback.EVENT.register(LootTableHelper::onLootLoad);
    }
}