package io.github.linkle.valleycraft.utils.loot;

import net.minecraft.item.Item;
import net.minecraft.predicate.item.ItemPredicate;
import net.minecraft.tag.Tag;

public class LootUtils {
    public static ItemPredicate items(Item... items) {
        return ItemPredicate.Builder.create().items(items).build();
    }
    
    public static ItemPredicate tag(Tag<Item> tag) {
        return ItemPredicate.Builder.create().tag(tag).build();
    }
}
