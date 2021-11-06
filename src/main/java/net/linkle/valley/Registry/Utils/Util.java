package net.linkle.valley.Registry.Utils;

import static net.linkle.valley.ValleyMain.MOD_ID;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Util {
    public static Item register(String ID, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, ID), item);
    }
}
