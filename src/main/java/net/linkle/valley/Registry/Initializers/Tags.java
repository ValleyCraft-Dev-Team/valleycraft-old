package net.linkle.valley.Registry.Initializers;

import net.fabricmc.fabric.api.tag.TagFactory;
import net.linkle.valley.ValleyMain;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class Tags {

    // if any hard-coded string is changed, change the assets accordingly

    // common tags ("c" is short for "common")
    public static final Tag<Item> BITTER_BERRIES = TagFactory.ITEM.create(new Identifier("c", "bitter_berries"));
    public static final Tag<Item> BONES = TagFactory.ITEM.create(new Identifier("c", "bones"));
    public static final Tag<Item> COPPER_INGOT = TagFactory.ITEM.create(new Identifier("c", "copper_ingot"));
    public static final Tag<Item> COPPER_NUGGETS = TagFactory.ITEM.create(new Identifier("c", "copper_nuggets"));
    public static final Tag<Item> CORN = TagFactory.ITEM.create(new Identifier("c", "corn"));
    public static final Tag<Item> DOUGH = TagFactory.ITEM.create(new Identifier("c", "dough"));
    public static final Tag<Item> EGGS = TagFactory.ITEM.create(new Identifier("c", "eggs"));
    public static final Tag<Item> FLOUR = TagFactory.ITEM.create(new Identifier("c", "flour"));
    public static final Tag<Item> KNIVES = TagFactory.ITEM.create(new Identifier("c", "knives"));
    public static final Tag<Item> LIGHT_BLUE_DYES = TagFactory.ITEM.create(new Identifier("c", "light_blue_dyes"));
    public static final Tag<Item> MINERS_LETTUCE = TagFactory.ITEM.create(new Identifier("c", "miners_lettuce"));
    public static final Tag<Item> MOLLUSKS = TagFactory.ITEM.create(new Identifier("c", "mollusks"));
    public static final Tag<Item> NETHERITE_NUGGETS = TagFactory.ITEM.create(new Identifier("c", "netherite_nuggets"));
    public static final Tag<Item> ONION = TagFactory.ITEM.create(new Identifier("c", "onion"));
    public static final Tag<Item> RED_DYES = TagFactory.ITEM.create(new Identifier("c", "red_dyes"));
    public static final Tag<Item> RICE = TagFactory.ITEM.create(new Identifier("c", "rice"));
    public static final Tag<Item> SALT = TagFactory.ITEM.create(new Identifier("c", "salt"));
    public static final Tag<Item> SPICY_BERRIES = TagFactory.ITEM.create(new Identifier("c", "spicy_berries"));
    public static final Tag<Item> TOMATO = TagFactory.ITEM.create(new Identifier("c", "tomato"));
    public static final Tag<Item> TROPICAL_FISH = TagFactory.ITEM.create(new Identifier("c", "tropical_fish"));
    public static final Tag<Item> WHITE_DYES = TagFactory.ITEM.create(new Identifier("c", "white_dyes"));
    public static final Tag<Item> WORMS = TagFactory.ITEM.create(new Identifier("c", "worms"));

    // valley tags
    // use ValleyMain.MOD_ID for namespace

    // private constructor to avoid instantiation
    private Tags() {
        assert false; // should never be called
    }

}
