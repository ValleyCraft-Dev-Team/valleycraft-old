package io.github.linkle.valleycraft.init;

import io.github.linkle.valleycraft.blocks.plants.aquatic.*;
import io.github.linkle.valleycraft.utils.Util;
import net.minecraft.block.Block;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;

import static io.github.linkle.valleycraft.init.ItemGroups.ARTEFACT_GROUP;
import static io.github.linkle.valleycraft.init.ItemGroups.FISHING_GROUP;

public class Aquatic {

    public static final Block CLAM = new ClamBlock();
    public static final Block GIANT_SCALLOP = new GiantClamBlock();
    public static final Block STARFISH = new AquaticFacingBlock(Block.createCuboidShape(3, 0, 3, 13, 1, 13));
    public static final Block SAND_DOLLAR = new AquaticFacingBlock(Block.createCuboidShape(3, 0, 3, 13, 1, 13));
    public static final Block RED_SEA_GRASS = new RedSeagrassBlock();
    
    public static final GlowKelp GLOW_KELP = new GlowKelp();
    public static final Block GLOW_KELP_PLANT = new GlowKelpPlant();

    public static final Block SEA_URCHIN = new UrchinBlock();
    public static final Block BARNACLE = new BarnacleBlock();

    public static final Block ANEMONE_PINK = new AnenomeBlock();
    public static final Block ANEMONE_PURPLE = new AnenomeBlock();
    public static final Block ANEMONE_YELLOW = new AnenomeBlock();
    public static final Block ANEMONE_GREEN = new AnenomeBlock();
    public static final Block ANEMONE_ORANGE = new AnenomeBlock();

    public static final Block TUBE_WORMS = new AnenomeBlock();

    public static final Block PRISMARINE_CLUSTER = new PrismarineClusterBlock();

    public static final Block SEA_FERN = new SeaPlantBlock();

    public static void initialize() {
        Util.registerWithItem("clam", CLAM, new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).build()));
        Util.registerWithItem("giant_scallop", GIANT_SCALLOP, new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).build()).maxCount(16));
        Util.registerWithItem("fossilized_starfish", STARFISH, new Item.Settings().group(ARTEFACT_GROUP).rarity(Rarity.EPIC));
        Util.registerWithItem("sand_dollar", SAND_DOLLAR, new Item.Settings().group(FISHING_GROUP).rarity(Rarity.UNCOMMON));
        Util.registerWithItem("red_seagrass", RED_SEA_GRASS, new Item.Settings().group(FISHING_GROUP));
        Util.registerWithItem("sea_fern", SEA_FERN, new Item.Settings().group(FISHING_GROUP));

        Util.registerWithItem("glow_kelp", GLOW_KELP, new Item.Settings().group(FISHING_GROUP));
        Util.register("glow_kelp_plant", GLOW_KELP_PLANT);

        Util.registerWithItem("sea_urchin", SEA_URCHIN, new Item.Settings().group(FISHING_GROUP));

        Util.registerWithItem("anemone_pink", ANEMONE_PINK, new Item.Settings().group(FISHING_GROUP));
        Util.registerWithItem("anemone_purple", ANEMONE_PURPLE, new Item.Settings().group(FISHING_GROUP));
        Util.registerWithItem("anemone_yellow", ANEMONE_YELLOW, new Item.Settings().group(FISHING_GROUP));
        Util.registerWithItem("anemone_green", ANEMONE_GREEN, new Item.Settings().group(FISHING_GROUP));
        Util.registerWithItem("anemone_orange", ANEMONE_ORANGE, new Item.Settings().group(FISHING_GROUP));

        Util.registerWithItem("tube_worms", TUBE_WORMS, new Item.Settings().group(FISHING_GROUP));

        Util.registerWithItem("barnacle", BARNACLE, new Item.Settings().group(FISHING_GROUP));

        Util.registerWithItem("prismarine_cluster", PRISMARINE_CLUSTER, new Item.Settings().group(FISHING_GROUP));
    }
}
