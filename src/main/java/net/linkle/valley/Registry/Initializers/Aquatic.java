package net.linkle.valley.Registry.Initializers;

import static net.linkle.valley.Registry.Initializers.ItemGroups.FISHING_GROUP;
import static net.linkle.valley.Registry.Utils.Util.register;
import static net.linkle.valley.Registry.Utils.Util.registerWithItem;

import net.linkle.valley.Registry.Blocks.Plants.AquaticPlants.ClamBlock;
import net.linkle.valley.Registry.Blocks.Plants.AquaticPlants.GlowKelp;
import net.linkle.valley.Registry.Blocks.Plants.AquaticPlants.GlowKelpPlant;
import net.linkle.valley.Registry.Blocks.Plants.AquaticPlants.RedSeagrass;
import net.minecraft.block.Block;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;

public class Aquatic {

    public static final Block CLAM = new ClamBlock();
    public static final Block STARFISH = new ClamBlock();
    public static final Block SAND_DOLLAR = new ClamBlock();
    public static final Block RED_SEAGRASS = new RedSeagrass();
    
    public static final GlowKelp GLOW_KELP = new GlowKelp();
    public static final Block GLOW_KELP_PLANT = new GlowKelpPlant();

    public static void initialize() {
        registerWithItem("clam", CLAM, new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).build()));
        registerWithItem("fossilized_starfish", STARFISH, new Item.Settings().group(FISHING_GROUP).rarity(Rarity.EPIC));
        registerWithItem("sand_dollar", SAND_DOLLAR, new Item.Settings().group(FISHING_GROUP).rarity(Rarity.UNCOMMON));
        registerWithItem("red_seagrass", RED_SEAGRASS, new Item.Settings().group(FISHING_GROUP));
        
        registerWithItem("glow_kelp", GLOW_KELP, new Item.Settings().group(FISHING_GROUP));
        register("glow_kelp_plant", GLOW_KELP_PLANT);
    }
}
