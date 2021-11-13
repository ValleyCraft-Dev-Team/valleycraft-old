package net.linkle.valley.Registry.Initializers;

import static net.linkle.valley.Registry.Initializers.ItemGroups.FISHING_GROUP;
import static net.linkle.valley.Registry.Utils.Util.registerWithItem;

import net.linkle.valley.Registry.Blocks.Plants.AquaticPlants.ClamBlock;
import net.minecraft.block.Block;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;

public class Aquatic {

    public static final Block CLAM = new ClamBlock();
    public static final Block STARFISH = new ClamBlock();
    public static final Block SAND_DOLLAR = new ClamBlock();

    public static void initialize() {
        registerWithItem("clam", CLAM, new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).build()));
        registerWithItem("fossilized_starfish", STARFISH, new Item.Settings().group(FISHING_GROUP).rarity(Rarity.EPIC));
        registerWithItem("sand_dollar", SAND_DOLLAR, new Item.Settings().group(FISHING_GROUP).rarity(Rarity.UNCOMMON));
    }
}
