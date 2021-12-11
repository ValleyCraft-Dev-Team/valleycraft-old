package net.linkle.valley.Registry.Initializers;

import static net.fabricmc.fabric.api.tag.TagFactory.ITEM;

import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class VItemTags {

    // if any hard-coded string is changed, change the assets accordingly

    // common tags ("c" is short for "common")
    public static final Tag<Item> BITTER_BERRIES = ITEM.create(newId("bitter_berries"));
    public static final Tag<Item> BONES = ITEM.create(newId("bones"));
    public static final Tag<Item> COPPER_INGOT = ITEM.create(newId("copper_ingot"));
    public static final Tag<Item> COPPER_NUGGETS = ITEM.create(newId("copper_nuggets"));
    public static final Tag<Item> CORN = ITEM.create(newId("corn"));
    public static final Tag<Item> DOUGH = ITEM.create(newId("dough"));
    public static final Tag<Item> EGGS = ITEM.create(newId("eggs"));
    public static final Tag<Item> FLOUR = ITEM.create(newId("flour"));
    public static final Tag<Item> KNIVES = ITEM.create(newId("knives"));
    public static final Tag<Item> LIGHT_BLUE_DYES = ITEM.create(newId("light_blue_dyes"));
    public static final Tag<Item> MINERS_LETTUCE = ITEM.create(newId("miners_lettuce"));
    public static final Tag<Item> MOLLUSKS = ITEM.create(newId("mollusks"));
    public static final Tag<Item> NETHERITE_NUGGETS = ITEM.create(newId("netherite_nuggets"));
    public static final Tag<Item> ONION = ITEM.create(newId("onion"));
    public static final Tag<Item> RED_DYES = ITEM.create(newId("red_dyes"));
    public static final Tag<Item> RICE = ITEM.create(newId("rice"));
    public static final Tag<Item> SALT = ITEM.create(newId("salt"));
    public static final Tag<Item> SPICY_BERRIES = ITEM.create(newId("spicy_berries"));
    public static final Tag<Item> TOMATO = ITEM.create(newId("tomato"));
    public static final Tag<Item> TROPICAL_FISH = ITEM.create(newId("tropical_fish"));
    public static final Tag<Item> WHITE_DYES = ITEM.create(newId("white_dyes"));
    public static final Tag<Item> WORMS = ITEM.create(newId("worms"));
    public static final Tag<Item> HOLLY = ITEM.create(newId("holly"));
    public static final Tag<Item> EGGPLANTS = ITEM.create(newId("eggplants"));
    
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
