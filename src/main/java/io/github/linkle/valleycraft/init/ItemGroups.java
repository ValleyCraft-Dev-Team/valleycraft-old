package io.github.linkle.valleycraft.init;

import io.github.linkle.valleycraft.items.misc.MiscItemBase;
import io.github.linkle.valleycraft.ValleyMain;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static io.github.linkle.valleycraft.init.MiscItems.FIBER;

public class ItemGroups {
    //icons for item groups
    public static final Item EXPLORATION_ICON = new MiscItemBase(new Item.Settings());
    public static final Item FURNITURE_ICON = new MiscItemBase(new Item.Settings());

    //item groups & some items
    //i hate order of operations in programming
    public static final ItemGroup NATURE_GROUP = FabricItemGroupBuilder.create(
            new Identifier(ValleyMain.MOD_ID, "nature")).icon(() -> new ItemStack(Plants.ORANGE_BEAUTY)).build();

    public static final ItemGroup COOKING_GROUP = FabricItemGroupBuilder.create(
            new Identifier(ValleyMain.MOD_ID, "cooking")).icon(() -> new ItemStack(FoodAndCooking.COD_CHOWDER)).build();

    public static final ItemGroup EXPLORATION_GROUP = FabricItemGroupBuilder.create(
            new Identifier(ValleyMain.MOD_ID, "exploration")).icon(() -> new ItemStack(EXPLORATION_ICON)).build();

    public static final ItemGroup FURNITURE_GROUP = FabricItemGroupBuilder.create(
            new Identifier(ValleyMain.MOD_ID, "furniture")).icon(() -> new ItemStack(FURNITURE_ICON)).build();

    public static final ItemGroup MISC_GROUP = FabricItemGroupBuilder.create(
            new Identifier(ValleyMain.MOD_ID, "misc")).icon(() -> new ItemStack(FIBER)).build();

    public static final ItemGroup FISHING_GROUP = FabricItemGroupBuilder.create(
            new Identifier(ValleyMain.MOD_ID, "fishing")).icon(() -> new ItemStack(Fishing.LIONFISH)).build();

    public static void initialize() {
        //icons
        Registry.register(Registry.ITEM, new Identifier(ValleyMain.MOD_ID, "furniture"), FURNITURE_ICON);
        Registry.register(Registry.ITEM, new Identifier(ValleyMain.MOD_ID, "exploration"), EXPLORATION_ICON);
    }
}
