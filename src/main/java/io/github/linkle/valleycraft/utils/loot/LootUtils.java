package io.github.linkle.valleycraft.utils.loot;

import net.minecraft.item.Item;
import net.minecraft.predicate.item.ItemPredicate;
import net.minecraft.tag.TagKey;

public class LootUtils {
    public static ItemPredicate items(Item... items) {
        return ItemPredicate.Builder.create().items(items).build();
    }

    public static ItemPredicate tag(TagKey<Item> tag) {
        return ItemPredicate.Builder.create().tag(tag).build();
    }
}
