package io.github.linkle.valleycraft.utils.loot;

import io.github.linkle.valleycraft.ValleyMain;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.FabricLootSupplierBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback.LootTableSetter;
import net.fabricmc.fabric.mixin.loot.table.LootSupplierBuilderHooks;
import net.minecraft.loot.LootManager;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;

/** Loot table helper using fabric's loot API. */
public class LootTableHelper {
    private static final HashMap<Identifier, List<FabricLootPoolBuilder>> APPEND_MAP = new HashMap<>(64);
    private static final HashMap<Identifier, List<Consumer<FabricLootPoolBuilder>>> INJECT_MAP = new HashMap<>(64);
    
    /** Create and append a new pool. */
    public static void appendLoot(Identifier lootID, LootBuilder loot) {
        var pools = APPEND_MAP.computeIfAbsent(lootID, k -> new ArrayList<>(5));
        pools.add(loot.build());
    }
    
    /** Inject pool with new entry. */
    public static void injectLoot(Identifier lootID, Consumer<FabricLootPoolBuilder> consumer) {
        var pools = INJECT_MAP.computeIfAbsent(lootID, k -> new ArrayList<>(5));
        pools.add(consumer);
    }
    
    private static void onLootLoad(ResourceManager resourceManager, LootManager manager, 
            Identifier id, FabricLootSupplierBuilder supplier, LootTableSetter setter) {
        var inject = INJECT_MAP.get(id);
        if (inject != null) {
            var pools = ((LootSupplierBuilderHooks)supplier).getPools();
            if (pools.isEmpty()) {
                ValleyMain.LOGGER.warn("Unable inject loot for " + id);
            } else {
                var pool = FabricLootPoolBuilder.of(pools.get(0));
                inject.forEach(c->c.accept(pool));
                pools.set(0, pool.build());
            }
        }
        
        var append = APPEND_MAP.get(id);
        if (append != null) {
            append.forEach(supplier::pool);
        }
    }
    
    static {
        LootTableLoadingCallback.EVENT.register(LootTableHelper::onLootLoad);
    }

}