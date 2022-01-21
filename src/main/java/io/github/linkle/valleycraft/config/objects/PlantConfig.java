package io.github.linkle.valleycraft.config.objects;

import java.util.Map;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

public class PlantConfig implements ConfigData {
    
    public boolean enable = true;
    
    @Comment("How many place tries in a patch. Higher tries means more plants in a patch.")
    public int tries;
    
    @Comment("Spawn rarity in a chunk. Higher rarity means less likely to spawn a patch.")
    public int rarity;
    
    public PlantConfig(int tries, int rarity) {
        this.tries = tries;
        this.rarity = rarity;
    }
    
    public static void getLang(Map<String, String> map) {
        map.put("enable", "Enable");
        map.put("tries", "Tries");
        map.put("rarity", "Rarity");
    }
}
