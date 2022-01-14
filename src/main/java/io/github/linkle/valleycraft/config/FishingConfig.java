package io.github.linkle.valleycraft.config;

import static io.github.linkle.valleycraft.ValleyMain.MOD_ID;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import me.shedaniel.autoconfig.ConfigData;

public class FishingConfig implements ConfigData {
    public boolean enabled = true;
    public List<FishEntry> fish = new ArrayList<>();
    public List<FishEntry> junk = new ArrayList<>();
    
    {
        add("crab_red", 20, fish);
        add("masking_crab", 10, fish);
        add("lobster", 20, fish);
        add("mussel", 13, fish);
        add("brown_mussel", 13, fish);
        add("cerith_snail", 13, fish);
        add("marlin_spike_seashell", 12, fish);
        add("squid_sucker", 4, fish);
        add("clam", 24, fish);
        add("sardine", 43, fish);
        add("lionfish", 6, fish);
        add("slime_fish", 20, fish);
        add("perch", 40, fish);
        add("sand_dollar", 10, fish);
        add("starfish", 10, fish);
        add("fire_eel", 7, fish);
        add("octopus", 9, fish);
        add("glistering_anglerfish", 2, fish);
        add("ghost_fish", 5, fish);
        add("pridefin", 5, fish);
        add("rainbow_wrasse", 5, fish);
        add("hairy_frog_fish", 7, fish);
        add("sea_urchin", 13, fish);
        add("stoneroller_minnow", 43, fish);
        add("abyss_watcher", 15, fish);
        add("bonefin", 13, fish);
        add("sea_creature_eye", 2, fish);
        add("message_bottle", 5, fish);
        
        add("red_seagrass", 17, junk);
        add("glow_kelp", 10, junk);
        addCraft("bone", 4, junk);
        addCraft("skeleton_skull", 1, junk);
    }
    
    private void add(String id, int weight, List<FishEntry> list) {
        list.add(new FishEntry(MOD_ID + ":" + id, weight));
    }
    
    private void addCraft(String id, int weight, List<FishEntry> list) {
        list.add(new FishEntry("minecraft:" + id, weight));
    }
    
    static void getLang(Map<String, String> map) {
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
