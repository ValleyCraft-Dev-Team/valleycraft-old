package io.github.linkle.valleycraft.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.*;


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
}
