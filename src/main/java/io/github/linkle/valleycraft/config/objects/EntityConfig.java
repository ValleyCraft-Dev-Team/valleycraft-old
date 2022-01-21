package io.github.linkle.valleycraft.config.objects;

import java.util.Map;
import java.util.function.Predicate;

import me.shedaniel.autoconfig.ConfigData;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;


public class EntityConfig implements ConfigData {
    
    public boolean enable = true;
    public int weight;
    public int minGroupSize;
    public int maxGroupSize;
    
    public EntityConfig(int weight, int minGroupSize, int maxGroupSize) {
        this.weight = weight;
        this.minGroupSize = minGroupSize;
        this.maxGroupSize = maxGroupSize;
    }
    
    public void addSpawn(Predicate<BiomeSelectionContext> biomeSelector, SpawnGroup spawnGroup, EntityType<?> entityType) {
        if (enable)
        BiomeModifications.addSpawn(biomeSelector, spawnGroup, entityType, weight, minGroupSize, maxGroupSize);
    }
    
    public static void getLang(Map<String, String> map) {
        map.put("enable", "Enable");
        map.put("weight", "Weight");
        map.put("minGroupSize", "Min Group Size");
        map.put("maxGroupSize", "Max Group Size");
    }
}
