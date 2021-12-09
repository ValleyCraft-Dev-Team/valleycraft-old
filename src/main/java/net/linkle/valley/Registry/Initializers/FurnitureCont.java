package net.linkle.valley.Registry.Initializers;

import net.linkle.valley.Registry.Blocks.Decorations.*;
import net.linkle.valley.Registry.Blocks.Plants.Hanging.PlanterBlock;
import net.linkle.valley.Registry.Blocks.Plants.Hanging.PlanterBlockWater;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;

import static net.linkle.valley.Registry.Initializers.ItemGroups.FURNITURE_GROUP;
import static net.linkle.valley.Registry.Utils.Util.registerWithItem;

public class FurnitureCont {
    public static final Block PLANTER = new PlanterBlock();
    public static final Block PLANTER_WATER = new PlanterBlockWater();
    public static final Block PLANTER_MYCELIUM = new PlanterBlock();
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

    public static void initialize() {
        var furnGroup = new Item.Settings().group(FURNITURE_GROUP);
        var furnGroupRare = new Item.Settings().group(FURNITURE_GROUP).rarity(Rarity.RARE);
        var furnGroupEpic = new Item.Settings().group(FURNITURE_GROUP).rarity(Rarity.EPIC);
        
        //registerWithItem("planter_box", PLANTER, furnGroup);
        //registerWithItem("planter_box_water", PLANTER_WATER, furnGroup);
        //registerWithItem("planter_box_mycelium", PLANTER_MYCELIUM, furnGroup);

        registerWithItem("stuffy_brown", STUFFY_BROWN, furnGroup);
        registerWithItem("stuffy_white", STUFFY_WHITE, furnGroup);

        //registerWithItem("golem_rusty", GOLEM_R, furnGroupRare);
        //registerWithItem("golem_waxed", GOLEM_W, furnGroupRare);
        //registerWithItem("golem_idling", GOLEM_I, furnGroupEpic);

        registerWithItem("log_pile", LOGPILE, furnGroup);

        registerWithItem("campfire_ring", CAMPFIRE_RING, furnGroup);

        registerWithItem("crate_apple", CRATE_APPLE, furnGroup);
        registerWithItem("crate_carrot", CRATE_CARROT, furnGroup);
        registerWithItem("crate_potato", CRATE_POTATO, furnGroup);
        registerWithItem("crate_beet", CRATE_BEET, furnGroup);

        registerWithItem("crate_rice", CRATE_RICE, furnGroup);
        registerWithItem("crate_corn", CRATE_CORN, furnGroup);
        registerWithItem("crate_tomato", CRATE_TOMATO, furnGroup);

        registerWithItem("crate_green", CRATE_GREEN, furnGroup);
        registerWithItem("crate_mandrake", CRATE_MANDRAKE, furnGroup);
        registerWithItem("crate_snow", CRATE_SNOW, furnGroup);
        registerWithItem("crate_pepper", CRATE_PEPPER, furnGroup);
        registerWithItem("crate_eggplant", CRATE_EGGPLANT, furnGroup);

        registerWithItem("crate_onion", CRATE_ONION, furnGroup);
        registerWithItem("crate_miner", CRATE_MINER, furnGroup);

        registerWithItem("crate_chorus", CRATE_CHORUS, furnGroup);
        registerWithItem("crate_sweet", CRATE_SWEET, furnGroup);
        registerWithItem("crate_glow", CRATE_GLOW, furnGroup);
        registerWithItem("crate_bitter", CRATE_BITTER, furnGroup);
        registerWithItem("crate_spicy", CRATE_SPICY, furnGroup);
        registerWithItem("crate_holly", CRATE_HOLLY, furnGroup);
        registerWithItem("crate_cocoa", CRATE_COCOA, furnGroup);

        registerWithItem("crate_puff", CRATE_PUFF, furnGroup);

        registerWithItem("crate_duck", CRATE_DUCK, furnGroup);
        registerWithItem("crate_egg", CRATE_EGG, furnGroup);

        registerWithItem("crate_bamboo", CRATE_BAMBOO, furnGroup);
        registerWithItem("crate_sugar", CRATE_SUGAR, furnGroup);

    }
}