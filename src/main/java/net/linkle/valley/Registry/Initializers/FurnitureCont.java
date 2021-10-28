package net.linkle.valley.Registry.Initializers;

import net.linkle.valley.Registry.Blocks.Decorations.*;
import net.linkle.valley.Registry.Blocks.Plants.Hanging.PlanterBlock;
import net.linkle.valley.Registry.Blocks.Plants.Hanging.PlanterBlockWater;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

import static net.linkle.valley.Registry.Initializers.ItemGroups.ARTIFACT_GROUP;
import static net.linkle.valley.Registry.Initializers.ItemGroups.FURNITURE_GROUP;
import static net.linkle.valley.ValleyMain.MOD_ID;

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
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "planter_box"), PLANTER);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "planter_box"), new BlockItem(PLANTER, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "planter_box_water"), PLANTER_WATER);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "planter_box_water"), new BlockItem(PLANTER_WATER, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "planter_box_mycelium"), PLANTER_MYCELIUM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "planter_box_mycelium"), new BlockItem(PLANTER_MYCELIUM, new Item.Settings().group(FURNITURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stuffy_brown"), STUFFY_BROWN);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stuffy_brown"), new BlockItem(STUFFY_BROWN, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stuffy_white"), STUFFY_WHITE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stuffy_white"), new BlockItem(STUFFY_WHITE, new Item.Settings().group(FURNITURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "golem_rusty"), GOLEM_R);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "golem_rusty"), new BlockItem(GOLEM_R, new Item.Settings().group(ARTIFACT_GROUP).rarity(Rarity.RARE)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "golem_waxed"), GOLEM_W);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "golem_waxed"), new BlockItem(GOLEM_W, new Item.Settings().group(ARTIFACT_GROUP).rarity(Rarity.RARE)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "golem_idling"), GOLEM_I);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "golem_idling"), new BlockItem(GOLEM_I, new Item.Settings().group(ARTIFACT_GROUP).rarity(Rarity.EPIC)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "log_pile"), LOGPILE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "log_pile"), new BlockItem(LOGPILE, new Item.Settings().group(FURNITURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "campfire_ring"), CAMPFIRE_RING);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "campfire_ring"), new BlockItem(CAMPFIRE_RING, new Item.Settings().group(FURNITURE_GROUP)));

    }
}