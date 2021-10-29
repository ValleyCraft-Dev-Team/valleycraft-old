package net.linkle.valley.Registry.Initializers;

import net.linkle.valley.Registry.Blocks.Plants.AquaticPlants.ClamBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

import static net.linkle.valley.Registry.Initializers.ItemGroups.FISHING_GROUP;
import static net.linkle.valley.ValleyMain.MOD_ID;

public class Aquatic {

    public static final Block CLAM = new ClamBlock();
    public static final Block STARFISH = new ClamBlock();
    public static final Block SAND_DOLLAR = new ClamBlock();

    public static void initialize() {
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "clam"), CLAM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "clam"), new BlockItem(CLAM, new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).build())));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "fossilized_starfish"), STARFISH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fossilized_starfish"), new BlockItem(STARFISH, new Item.Settings().group(FISHING_GROUP).rarity(Rarity.EPIC)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "sand_dollar"), SAND_DOLLAR);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "sand_dollar"), new BlockItem(SAND_DOLLAR, new Item.Settings().group(FISHING_GROUP).rarity(Rarity.UNCOMMON)));

    }
}
