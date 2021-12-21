package io.github.linkle.valleycraft.registry.Loot;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.LootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.LootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

/** Loot Pool Builder helper class. */
public class LootBuilder {
    private final FabricLootPoolBuilder pool = FabricLootPoolBuilder.builder();

    public LootBuilder rolls(LootNumberProvider range) {
        pool.rolls(range);
        return this;
    }
    
    public LootBuilder rolls(float value) {
        pool.rolls(ConstantLootNumberProvider.create(value));
        return this;
    }
    
    public LootBuilder rolls(float min, float max) {
        pool.rolls(UniformLootNumberProvider.create(min, max));
        return this;
    }

    public LootBuilder with(LootPoolEntry.Builder<?> entry) {
        pool.with(entry);
        return this;
    }
    
    public LootBuilder with(ItemConvertible item) {
        pool.with(ItemEntry.builder(item));
        return this;
    }

    public LootBuilder conditionally(LootCondition.Builder condition) {
        pool.conditionally(condition);
        return this;
    }

    public LootBuilder apply(LootFunction.Builder function) {
        pool.apply(function);
        return this;
    }

    public LootBuilder withEntry(LootPoolEntry entry) {
        pool.withEntry(entry);
        return this;
    }

    public LootBuilder withCondition(LootCondition condition) {
        pool.withCondition(condition);
        return this;
    }

    public LootBuilder withFunction(LootFunction function) {
        pool.withFunction(function);
        return this;
    }

    public LootBuilder copyFrom(LootPool pool) {
        return copyFrom(pool, false);
    }

    public LootBuilder copyFrom(LootPool pool, boolean copyRolls) {
        this.pool.copyFrom(pool, copyRolls);
        return this;
    }

    public FabricLootPoolBuilder build() {
        return pool;
    }
    
    public static LootBuilder create() {
        return new LootBuilder();
    }
}
