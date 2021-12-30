package io.github.linkle.valleycraft.init;

import io.github.linkle.valleycraft.blocks.plants.aquatic.AquaticBlock;
import io.github.linkle.valleycraft.blocks.plants.aquatic.ClamBlock;
import io.github.linkle.valleycraft.blocks.plants.aquatic.GlowKelp;
import io.github.linkle.valleycraft.blocks.plants.aquatic.GlowKelpPlant;
import io.github.linkle.valleycraft.blocks.plants.aquatic.RedSeagrass;
import io.github.linkle.valleycraft.utils.Util;
import net.minecraft.block.Block;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;

import static io.github.linkle.valleycraft.init.ItemGroups.FISHING_GROUP;

public class Aquatic {

    public static final Block CLAM = new ClamBlock();
    public static final Block STARFISH = new AquaticBlock();
    public static final Block SAND_DOLLAR = new AquaticBlock();
    public static final Block RED_SEA_GRASS = new RedSeagrass();
    
    public static final GlowKelp GLOW_KELP = new GlowKelp();
    public static final Block GLOW_KELP_PLANT = new GlowKelpPlant();

    public static void initialize() {
        Util.registerWithItem("clam", CLAM, new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).build()));
        Util.registerWithItem("fossilized_starfish", STARFISH, new Item.Settings().group(FISHING_GROUP).rarity(Rarity.EPIC));
        Util.registerWithItem("sand_dollar", SAND_DOLLAR, new Item.Settings().group(FISHING_GROUP).rarity(Rarity.UNCOMMON));
        Util.registerWithItem("red_seagrass", RED_SEA_GRASS, new Item.Settings().group(FISHING_GROUP));
        
        Util.registerWithItem("glow_kelp", GLOW_KELP, new Item.Settings().group(FISHING_GROUP));
        Util.register("glow_kelp_plant", GLOW_KELP_PLANT);
    }
}
