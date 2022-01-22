package io.github.linkle.valleycraft.config.objects;

import java.util.Map;

import me.shedaniel.autoconfig.ConfigData;

public class CrystalConfig implements ConfigData {
    public boolean enable = true;
    public int tries;
    public int spread;
    public int rarity;
    
    public CrystalConfig(int tries, int spread, int rarity) {
        this.tries = tries;
        this.spread = spread;
        this.rarity = rarity;
    }
    
    public static void getLang(Map<String, String> map) {
        map.put("enable", "Enable");
        map.put("tries", "Tries");
        map.put("spread", "Spread");
        map.put("rarity", "Rarity");
    }
}
