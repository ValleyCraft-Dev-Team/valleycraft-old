package io.github.linkle.valleycraft.config.objects;

import java.util.Map;
import java.util.Objects;

import me.shedaniel.autoconfig.ConfigData;

public class FishingConfig implements ConfigData {
    public boolean enabled = true;

    public static void getLang(Map<String, String> map) {
        map.put("enabled", "Enable Fishing Loot");
        map.put("fish", "Fish Loot List");
        map.put("junk", "Junk Loot List");
    }

    public static class FishEntry implements ConfigData {
        public String item;
        public int weight;

        public FishEntry() {
        }

        public FishEntry(String item, int weight) {
            this.item = item;
            this.weight = weight;
        }

        @Override
        public int hashCode() {
            return Objects.hash(item, weight);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj instanceof FishEntry entry) {
                return Objects.equals(item, entry.item) && weight == entry.weight;
            }
            return false;
        }

        static void getLang(Map<String, String> map) {
            map.put("item", "Item");
            map.put("weight", "Weight");
        }
    }
}
