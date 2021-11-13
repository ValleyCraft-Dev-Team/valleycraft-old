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

    public static void initialize() {
        var furnGroup = new Item.Settings().group(FURNITURE_GROUP);
        var furnGroupRare = new Item.Settings().group(FURNITURE_GROUP).rarity(Rarity.RARE);
        var furnGroupEpic = new Item.Settings().group(FURNITURE_GROUP).rarity(Rarity.EPIC);
        
        //registerWithItem("planter_box", PLANTER, furnGroup);
        //registerWithItem("planter_box_water", PLANTER_WATER, furnGroup);
        //registerWithItem("planter_box_mycelium", PLANTER_MYCELIUM, furnGroup);

        registerWithItem("stuffy_brown", STUFFY_BROWN, furnGroup);
        registerWithItem("stuffy_white", STUFFY_WHITE, furnGroup);

        registerWithItem("golem_rusty", GOLEM_R, furnGroupRare);
        registerWithItem("golem_waxed", GOLEM_W, furnGroupRare);
        registerWithItem("golem_idling", GOLEM_I, furnGroupEpic);

        registerWithItem("log_pile", LOGPILE, furnGroup);

        registerWithItem("campfire_ring", CAMPFIRE_RING, furnGroup);
    }
}