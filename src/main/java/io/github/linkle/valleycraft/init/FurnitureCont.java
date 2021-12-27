package io.github.linkle.valleycraft.init;

import io.github.linkle.valleycraft.blocks.decorations.*;
import io.github.linkle.valleycraft.utils.Util;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;

import static io.github.linkle.valleycraft.init.ItemGroups.FURNITURE_GROUP;

public class FurnitureCont {
    public static final Block STUFFY_BROWN = new StuffyBlock();
    public static final Block STUFFY_WHITE = new StuffyBlock();

    public static final Block GOLEM_R = new GolemBlockWaxed();
    public static final Block GOLEM_W = new GolemBlockRusted();
    public static final Block GOLEM_I = new GolemBlock();

    public static final Block CAMPFIRE_RING = new CampfireRocksBlock();
    public static final Block LOGPILE = new LogPileBlock();

    public static final Block CRATE_BAMBOO = new CrateBlock();
    public static final Block CRATE_SUGAR = new CrateBlock();
    public static final Block CRATE_COCOA = new CrateBlock();
    public static final Block CRATE_CHORUS = new CrateBlock();
    public static final Block CRATE_GLOW = new CrateBlock();
    public static final Block CRATE_SWEET = new CrateBlock();
    public static final Block CRATE_BITTER = new CrateBlock();
    public static final Block CRATE_SPICY = new CrateBlock();
    public static final Block CRATE_GREEN = new CrateBlock();
    public static final Block CRATE_MANDRAKE = new CrateBlock();
    public static final Block CRATE_SNOW = new CrateBlock();
    public static final Block CRATE_HOLLY = new CrateBlock();
    public static final Block CRATE_RICE = new CrateBlock();
    public static final Block CRATE_CORN = new CrateBlock();
    public static final Block CRATE_ONION = new CrateBlock();
    public static final Block CRATE_TOMATO = new CrateBlock();
    public static final Block CRATE_PUFF = new CrateBlock();
    public static final Block CRATE_MINER = new CrateBlock();
    public static final Block CRATE_DUCK = new CrateBlock();
    public static final Block CRATE_EGG = new CrateBlock();
    public static final Block CRATE_BEET = new CrateBlock();
    public static final Block CRATE_POTATO = new CrateBlock();
    public static final Block CRATE_CARROT = new CrateBlock();
    public static final Block CRATE_APPLE = new CrateBlock();
    public static final Block CRATE_PEPPER = new CrateBlock();
    public static final Block CRATE_EGGPLANT = new CrateBlock();

    @SuppressWarnings("unused")
    public static void initialize() {
        var furnGroup = new Item.Settings().group(FURNITURE_GROUP);
        var furnGroupRare = new Item.Settings().group(FURNITURE_GROUP).rarity(Rarity.RARE);
        var furnGroupEpic = new Item.Settings().group(FURNITURE_GROUP).rarity(Rarity.EPIC);

        Util.registerWithItem("stuffy_brown", STUFFY_BROWN, furnGroup);
        Util.registerWithItem("stuffy_white", STUFFY_WHITE, furnGroup);

        Util.registerWithItem("log_pile", LOGPILE, furnGroup);

        Util.registerWithItem("campfire_ring", CAMPFIRE_RING, furnGroup);

        Util.registerWithItem("crate_apple", CRATE_APPLE, furnGroup);
        Util.registerWithItem("crate_carrot", CRATE_CARROT, furnGroup);
        Util.registerWithItem("crate_potato", CRATE_POTATO, furnGroup);
        Util.registerWithItem("crate_beet", CRATE_BEET, furnGroup);

        Util.registerWithItem("crate_rice", CRATE_RICE, furnGroup);
        Util.registerWithItem("crate_corn", CRATE_CORN, furnGroup);
        Util.registerWithItem("crate_tomato", CRATE_TOMATO, furnGroup);

        Util.registerWithItem("crate_green", CRATE_GREEN, furnGroup);
        Util.registerWithItem("crate_mandrake", CRATE_MANDRAKE, furnGroup);
        Util.registerWithItem("crate_snow", CRATE_SNOW, furnGroup);
        Util.registerWithItem("crate_pepper", CRATE_PEPPER, furnGroup);
        Util.registerWithItem("crate_eggplant", CRATE_EGGPLANT, furnGroup);

        Util.registerWithItem("crate_onion", CRATE_ONION, furnGroup);
        Util.registerWithItem("crate_miner", CRATE_MINER, furnGroup);

        Util.registerWithItem("crate_chorus", CRATE_CHORUS, furnGroup);
        Util.registerWithItem("crate_sweet", CRATE_SWEET, furnGroup);
        Util.registerWithItem("crate_glow", CRATE_GLOW, furnGroup);
        Util.registerWithItem("crate_bitter", CRATE_BITTER, furnGroup);
        Util.registerWithItem("crate_spicy", CRATE_SPICY, furnGroup);
        Util.registerWithItem("crate_holly", CRATE_HOLLY, furnGroup);
        Util.registerWithItem("crate_cocoa", CRATE_COCOA, furnGroup);

        Util.registerWithItem("crate_puff", CRATE_PUFF, furnGroup);

        Util.registerWithItem("crate_duck", CRATE_DUCK, furnGroup);
        Util.registerWithItem("crate_egg", CRATE_EGG, furnGroup);

        Util.registerWithItem("crate_bamboo", CRATE_BAMBOO, furnGroup);
        Util.registerWithItem("crate_sugar", CRATE_SUGAR, furnGroup);

    }
}