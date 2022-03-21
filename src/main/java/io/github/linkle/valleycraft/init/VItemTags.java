package io.github.linkle.valleycraft.init;

import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class VItemTags {

    // if any hard-coded string is changed, change the assets accordingly

    // common tags ("c" is short for "common")
    public static final TagKey<Item> BITTER_BERRIES = TagKey.of(Registry.ITEM_KEY, newId("bitter_berries"));
    public static final TagKey<Item> BONES = TagKey.of(Registry.ITEM_KEY, newId("bones"));
    public static final TagKey<Item> COPPER_INGOT = TagKey.of(Registry.ITEM_KEY, newId("copper_ingot"));
    public static final TagKey<Item> COPPER_NUGGETS = TagKey.of(Registry.ITEM_KEY, newId("copper_nuggets"));
    public static final TagKey<Item> CORN = TagKey.of(Registry.ITEM_KEY, newId("corn"));
    public static final TagKey<Item> DOUGH = TagKey.of(Registry.ITEM_KEY, newId("dough"));
    public static final TagKey<Item> EGGS = TagKey.of(Registry.ITEM_KEY, newId("eggs"));
    public static final TagKey<Item> FLOUR = TagKey.of(Registry.ITEM_KEY, newId("flour"));
    public static final TagKey<Item> KNIVES = TagKey.of(Registry.ITEM_KEY, newId("knives"));
    public static final TagKey<Item> SICKLES = TagKey.of(Registry.ITEM_KEY, newId("sickles"));
    public static final TagKey<Item> LIGHT_BLUE_DYES = TagKey.of(Registry.ITEM_KEY, newId("light_blue_dyes"));
    public static final TagKey<Item> MINERS_LETTUCE = TagKey.of(Registry.ITEM_KEY, newId("miners_lettuce"));
    public static final TagKey<Item> MOLLUSKS = TagKey.of(Registry.ITEM_KEY, newId("mollusks"));
    public static final TagKey<Item> NETHERITE_NUGGETS = TagKey.of(Registry.ITEM_KEY, newId("netherite_nuggets"));
    public static final TagKey<Item> ONION = TagKey.of(Registry.ITEM_KEY, newId("onion"));
    public static final TagKey<Item> RED_DYES = TagKey.of(Registry.ITEM_KEY, newId("red_dyes"));
    public static final TagKey<Item> RICE = TagKey.of(Registry.ITEM_KEY, newId("rice"));
    public static final TagKey<Item> SALT = TagKey.of(Registry.ITEM_KEY, newId("salt"));
    public static final TagKey<Item> SPICY_BERRIES = TagKey.of(Registry.ITEM_KEY, newId("spicy_berries"));
    public static final TagKey<Item> TOMATO = TagKey.of(Registry.ITEM_KEY, newId("tomato"));
    public static final TagKey<Item> TROPICAL_FISH = TagKey.of(Registry.ITEM_KEY, newId("tropical_fish"));
    public static final TagKey<Item> WHITE_DYES = TagKey.of(Registry.ITEM_KEY, newId("white_dyes"));
    public static final TagKey<Item> WORMS = TagKey.of(Registry.ITEM_KEY, newId("worms"));
    public static final TagKey<Item> HOLLY = TagKey.of(Registry.ITEM_KEY, newId("holly"));
    public static final TagKey<Item> EGGPLANTS = TagKey.of(Registry.ITEM_KEY, newId("eggplants"));

    // valley tags
    // use ValleyMain.MOD_ID for namespace

    // private constructor to avoid instantiation
    private VItemTags() {
        assert false; // should never be called
    }

    private static Identifier newId(String id) {
        return new Identifier("c", id);
    }
}
