package io.github.linkle.valleycraft.config.objects;

import java.util.Map;

import me.shedaniel.autoconfig.ConfigData;
import net.minecraft.world.gen.YOffset;

public class OreConfig implements ConfigData {

    public boolean enable = true;
    public int size;
    public int repeat;
    public int minOffset;
    public int maxOffset;
    public boolean minBelowTop;
    public boolean maxAboveBottom;

    public OreConfig(int size, int repeat, int minOffset, int maxOffset) {
        this(size, repeat, minOffset, maxOffset, false, false);
    }

    public OreConfig(int size, int repeat, int minOffset, int maxOffset, boolean minBelowTop, boolean maxAboveBottom) {
        this.size = size;
        this.repeat = repeat;
        this.minOffset = minOffset;
        this.maxOffset = maxOffset;
        this.minBelowTop = minBelowTop;
        this.maxAboveBottom = maxAboveBottom;
    }

    public YOffset getMinOffset() {
        return minBelowTop ? YOffset.belowTop(minOffset) : YOffset.fixed(minOffset);
    }

    public YOffset getMaxOffset() {
        return maxAboveBottom ? YOffset.aboveBottom(maxOffset) : YOffset.fixed(maxOffset);
    }

    public static void getLang(Map<String, String> map) {
        map.put("enable", "Enable");
        map.put("size", "Vein Size");
        map.put("repeat", "Repeat");
        map.put("minOffset", "Y Min Offset");
        map.put("maxOffset", "Y Max Offset");
        map.put("minBelowTop", "Y Min Use Below Top Offset");
        map.put("maxAboveBottom", "Y Max Use Above Bottom Offset");
    }
}
