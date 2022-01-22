package io.github.linkle.valleycraft.config.objects;

import java.util.Map;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

public class GlowKelpConfig implements ConfigData {
    public boolean enable = true;
    public int tries, repeat;
   
    @Comment("Bottom of the world plus a offset.")
    public int yMinBottom = 10;
    
    public int yMax = 32;
    
    public GlowKelpConfig(int tries, int repeat) {
        this.tries = tries;
        this.repeat = repeat;
    }
    
    public static void getLang(Map<String, String> map) {
        map.put("enable", "Enable");
        map.put("tries", "Tries");
        map.put("repeat", "Repeat");
        map.put("yMinBottom", "Y Min Bottom");
        map.put("yMax", "Y Max");
    }
}
