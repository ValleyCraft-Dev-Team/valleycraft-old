package io.github.linkle.valleycraft.init;

import io.github.linkle.valleycraft.blocks.plants.aquatic.*;
import net.minecraft.block.Block;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;

import static io.github.linkle.valleycraft.init.ItemGroups.FISHING_GROUP;

public class Aquatic {

    public static final Block CLAM = new ClamBlock();
    public static final Block GIANT_SCALLOP = new GiantClamBlock();
    public static final Block SAND_DOLLAR = new AquaticBlock(Block.createCuboidShape(3, 0, 3, 13, 1, 13));
    public static final Block RED_SEA_GRASS = new RedSeagrassBlock();

    public static final GlowKelp GLOW_KELP = new GlowKelp();
    public static final Block GLOW_KELP_PLANT = new GlowKelpPlant();

    public static final Block SEA_URCHIN = new UrchinBlock();
    public static final Block THORACICA_BARNACLE = new BarnacleBlock();

    public static final Block PINK_ANEMONE = new AnenomeBlock();
    public static final Block PURPLE_ANEMONE = new AnenomeBlock();
    public static final Block YELLOW_ANEMONE = new AnenomeBlock();
    public static final Block GREEN_ANEMONE = new AnenomeBlock();
    public static final Block ORANGE_ANEMONE = new AnenomeBlock();
    public static final Block STARFISH = new AquaticFacingBlock(Block.createCuboidShape(3, 0, 3, 13, 1, 13));

    public static final Block TUBE_WORMS = new AnenomeBlock();

    public static final Block PRISMARINE_CLUSTER = new PrismarineClusterBlock();

    public static final Block DANCING_SEA_FERN = new SeaPlantBlock();

    public static void initialize() {
        Reg.registerWithItem("clam", CLAM, new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).build()));
        Reg.registerWithItem("giant_scallop", GIANT_SCALLOP, new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).build()).maxCount(16));
        Reg.registerWithItem("sand_dollar", SAND_DOLLAR, new Item.Settings().group(FISHING_GROUP).rarity(Rarity.UNCOMMON));
        Reg.registerWithItem("red_seagrass", RED_SEA_GRASS, new Item.Settings().group(FISHING_GROUP));
        Reg.registerWithItem("dancing_sea_fern", DANCING_SEA_FERN, new Item.Settings().group(FISHING_GROUP));

        Reg.registerWithItem("glow_kelp", GLOW_KELP, new Item.Settings().group(FISHING_GROUP));
        Reg.register("glow_kelp_plant", GLOW_KELP_PLANT);

        Reg.registerWithItem("sea_urchin", SEA_URCHIN, new Item.Settings().group(FISHING_GROUP));

        Reg.registerWithItem("pink_anemone", PINK_ANEMONE, new Item.Settings().group(FISHING_GROUP));
        Reg.registerWithItem("purple_anemone", PURPLE_ANEMONE, new Item.Settings().group(FISHING_GROUP));
        Reg.registerWithItem("yellow_anemone", YELLOW_ANEMONE, new Item.Settings().group(FISHING_GROUP));
        Reg.registerWithItem("green_anemone", GREEN_ANEMONE, new Item.Settings().group(FISHING_GROUP));
        Reg.registerWithItem("orange_anemone", ORANGE_ANEMONE, new Item.Settings().group(FISHING_GROUP));

        Reg.registerWithItem("starfish", STARFISH, new Item.Settings().group(FISHING_GROUP));

        Reg.registerWithItem("tube_worms", TUBE_WORMS, new Item.Settings().group(FISHING_GROUP));

        Reg.registerWithItem("thoracica_barnacle", THORACICA_BARNACLE, new Item.Settings().group(FISHING_GROUP));

        Reg.registerWithItem("prismarine_cluster", PRISMARINE_CLUSTER, new Item.Settings().group(FISHING_GROUP));
    }
}
