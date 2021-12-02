package net.linkle.valley.Registry.Initializers;

import net.fabricmc.fabric.api.tag.TagFactory;
import net.linkle.valley.ValleyMain;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class Tags {
    public static final Tag<Item> KNIVES = registerItem("knives");
    
    public static void initialize() {
        // Force java to load this class so it can register our tags.
        System.out.println("initializing the tags"); 
    }
    
    private static Tag<Item> registerItem(String id) {
        return TagFactory.ITEM.create(new Identifier(ValleyMain.MOD_ID, id));
    }
}
