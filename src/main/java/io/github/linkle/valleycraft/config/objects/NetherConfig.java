package io.github.linkle.valleycraft.config.objects;

import java.util.Map;

import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

/** Nether Plant Config */
public class NetherConfig {
    public boolean enable = true;

    @Comment("How many place tries in a patch. Higher tries means more plants in a patch.")
    public int tries;

    @Comment("Repeat spawn patch in a chunk. Higher repeat means more likely to spawn a patch.")
    public int repeat;

    public NetherConfig(int tries, int repeat) {
        this.tries = tries;
        this.repeat = repeat;
    }

    public static void getLang(Map<String, String> map) {
        map.put("enable", "Enable");
        map.put("tries", "Tries");
        map.put("repeat", "Repeat");
    }
}
