package net.linkle.valley.Registry.Initializers;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.linkle.valley.Registry.Misc.MiscItemBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.linkle.valley.Registry.Initializers.Plants.ORANGE_BEAUTY;
import static net.linkle.valley.Registry.Initializers.Fishing.LIONFISH;
import static net.linkle.valley.Registry.Initializers.FoodAndCooking.COD_CHOWDER;
import static net.linkle.valley.Registry.Initializers.FurnitureCont.GOLEM_W;
import static net.linkle.valley.Registry.Initializers.MiscItems.FIBER;
import static net.linkle.valley.ValleyMain.MOD_ID;

public class ItemGroups {
    //icons for item groups
    public static final Item EXPLORATION_ICON = new MiscItemBase(new Item.Settings());
    public static final Item COOKING_ICON = new MiscItemBase(new Item.Settings());
    public static final Item FURNITURE_ICON = new MiscItemBase(new Item.Settings());
    public static final Item MISC_ICON = new MiscItemBase(new Item.Settings());
    public static final Item NATURE_ICON = new MiscItemBase(new Item.Settings());
    public static final Item ARTIFACT_ICON = new MiscItemBase(new Item.Settings());
    public static final Item FISHING_ICON = new MiscItemBase(new Item.Settings());

    //item groups & some items
    //i hate order of operations in programming
    public static final ItemGroup NATURE_GROUP = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "nature")).icon(() -> new ItemStack(ORANGE_BEAUTY)).build();

    public static final ItemGroup COOKING_GROUP = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "cooking")).icon(() -> new ItemStack(COD_CHOWDER)).build();

    public static final ItemGroup EXPLORATION_GROUP = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "exploration")).icon(() -> new ItemStack(EXPLORATION_ICON)).build();

    public static final ItemGroup FURNITURE_GROUP = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "furniture")).icon(() -> new ItemStack(FURNITURE_ICON)).build();

    public static final ItemGroup MISC_GROUP = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "misc")).icon(() -> new ItemStack(FIBER)).build();

    public static final ItemGroup FISHING_GROUP = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "fishing")).icon(() -> new ItemStack(LIONFISH)).build();

    public static void initialize() {
        //icons
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "furniture"), FURNITURE_ICON);
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cooking"), COOKING_ICON);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "exploration"), EXPLORATION_ICON);
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "misc"), MISC_ICON);
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "nature"), NATURE_ICON);
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "artifact"), ARTIFACT_ICON);
    }
}
