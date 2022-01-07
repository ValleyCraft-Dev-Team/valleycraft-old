package io.github.linkle.valleycraft.init;

import java.util.HashMap;
import java.util.Random;

import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class CrabTrapBaits {
    private static final HashMap<Item, IntProvider> BAITS = new HashMap<Item, IntProvider>();
    
    public static void initialize() {
        add(MiscItems.BAIT, 210, 300); // 3.5 to 5 minutes, or 3:30 to 5:00 minutes.
        add(MiscItems.GOLDEN_BAIT, 180, 240); // 3 to 4 minutes. Golden Bait.
        add(MiscItems.PIG_BAIT, 230, 310); //
    }
    
    /** min and max seconds */
    private static void add(ItemConvertible item, int min, int max) {
        BAITS.put(item.asItem(), UniformIntProvider.create(min, max));
    }
    
    public static boolean contains(ItemConvertible item) {
        return BAITS.containsKey(item.asItem());
    }
    
    public static int get(ItemConvertible item, Random random) {
        return BAITS.get(item.asItem()).get(random) * 20;
    }

    public static int size() {
        return BAITS.size();
    }
}
