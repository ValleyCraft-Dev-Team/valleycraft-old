package io.github.linkle.valleycraft.init;


import io.github.linkle.valleycraft.blocks.decorations.*;
import io.github.linkle.valleycraft.blocks.plants.Decorative.SporeBlock;
import io.github.linkle.valleycraft.blocks.plants.DryMossBlock;
import io.github.linkle.valleycraft.blocks.plants.MossBlock;
import io.github.linkle.valleycraft.blocks.plants.MudBlock;
import io.github.linkle.valleycraft.utils.Util;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;

import static io.github.linkle.valleycraft.init.ItemGroups.FURNITURE_GROUP;
import static io.github.linkle.valleycraft.init.ItemGroups.NATURE_GROUP;

public class StoneBlocks {
    public static final Block VOLCANIC_ASH = new VolcanicAshBlock();
    public static final Block VOLCANIC_STONE = new StoneBlock();

    public static final Block MIXED_ORE = new BaseOreBlock(Blocks.STONE);
    public static final Block DEEPSLATE_MIXED_ORE = new BaseOreBlock(Blocks.DEEPSLATE);
    public static final Block SALTPETER_ORE = new BaseOreBlock(Blocks.STONE);
    public static final Block DEEPSLATE_SALTPETER_ORE = new BaseOreBlock(Blocks.DEEPSLATE);
    //public static final Block FROZEN_FOSSIL = new FrozenFossilOreBlock();

    public static final Block SCALDING_STONE = new ScaldingBlock();
    public static final Block SCALDING_SANDSTONE = new ScaldingBlock();
    public static final Block DESERT_GRAVEL = new VolcanicAshBlock();
    public static final Block BLEACHED_GRAVEL = new VolcanicAshBlock();
    public static final Block SCALDING_VOLC = new ScaldingBlock();
    public static final Block GLACIAL_STONE = new GlacialStone();

    public static final Block SALT_ORE = new BaseOreBlock(Blocks.STONE);
    public static final Block SALT_BLOCK = new StoneBlock();
    public static final Block NETHER_SALT = new BaseOreBlock(Blocks.NETHER_GOLD_ORE);
    public static final Block NETHER_COAL_ORE = new BaseOreBlock(Blocks.NETHER_GOLD_ORE);
    public static final Block B_CLAY = new MudBlock();

    public static final Block JUNGLE = new StoneBlock();
    public static final Block JUNGLE_MOSSY = new MossBlock();
    public static final Block JUNGLE_SPOREY = new SporeBlock();
    public static final Block JUNGLE_COBBLE = new BaseOreBlock(Blocks.STONE);
    public static final Block STONE_MOSSY = new MossBlock();
    public static final Block DRY_MOSS_STONE = new DryMossBlock();

    public static final Block OCEAN_STONE = new StoneBlock();
    public static final Block SWAMP_STONE = new StoneBlock();
    public static final Block DARK_STONE = new StoneBlock();
    public static final Block TAIGA_STONE = new StoneBlock();

    public static final Block LIMESTONE = new StoneBlock();
    public static final Block PUMICE = new StoneBlock();
    public static final Block JASPER = new StoneBlock();
    public static final Block GREEN_GRANITE = new StoneBlock();

    public static final Block DIABASE_SMOOTH = new StoneBlock();
    public static final Block GRIMESTONE_SMOOTH = new StoneBlock();
    public static final Block VERDANTINE_SMOOTH = new StoneBlock();
    public static final Block MARINITE_SMOOTH = new StoneBlock();
    public static final Block JASPER_SMOOTH = new StoneBlock();
    public static final Block PUMICE_SMOOTH = new StoneBlock();
    public static final Block GREEN_GRANITE_SMOOTH = new StoneBlock();
    public static final Block LIMESTONE_SMOOTH = new StoneBlock();

    //public static final Block CICADA = new CicadaBlock();

    public static void initialize() {
        var natureGroup = new Item.Settings().group(NATURE_GROUP);
        var furnGroup = new Item.Settings().group(FURNITURE_GROUP);

        Util.registerWithItem("brown_clay", B_CLAY, natureGroup);
        Util.registerWithItem("volc_ash", VOLCANIC_ASH, natureGroup);
        Util.registerWithItem("volc_stone", VOLCANIC_STONE, natureGroup);
        Util.registerWithItem("scalding_volc_stone", SCALDING_VOLC, natureGroup);

        Util.registerWithItem("mixed_ore", MIXED_ORE, natureGroup);
        Util.registerWithItem("deepslate_mixed_ore", DEEPSLATE_MIXED_ORE, natureGroup);
        Util.registerWithItem("saltpeter_ore", SALTPETER_ORE, natureGroup);
        Util.registerWithItem("deepslate_saltpeter_ore", DEEPSLATE_SALTPETER_ORE, natureGroup);

        Util.registerWithItem("glacial_stone", GLACIAL_STONE, natureGroup);
        Util.registerWithItem("scalding_stone", SCALDING_STONE, natureGroup);
        Util.registerWithItem("scalding_sandstone", SCALDING_SANDSTONE, natureGroup);
        Util.registerWithItem("desert_gravel", DESERT_GRAVEL, natureGroup);
        Util.registerWithItem("bleached_gravel", BLEACHED_GRAVEL, natureGroup);

        Util.registerWithItem("jungle_stone", JUNGLE, natureGroup);
        Util.registerWithItem("jungle_cobble", JUNGLE_COBBLE, furnGroup);
        Util.registerWithItem("jungle_sporey", JUNGLE_SPOREY, natureGroup);
        Util.registerWithItem("jungle_mossy", JUNGLE_MOSSY, natureGroup);
        Util.registerWithItem("stone_mossy", STONE_MOSSY, natureGroup);
        Util.registerWithItem("dry_mossy_stone", DRY_MOSS_STONE, natureGroup);

        Util.registerWithItem("oceanstone", OCEAN_STONE, natureGroup);
        Util.registerWithItem("swampstone", SWAMP_STONE, natureGroup);
        Util.registerWithItem("darkstone", DARK_STONE, natureGroup);
        Util.registerWithItem("taigastone", TAIGA_STONE, natureGroup);
        Util.registerWithItem("green_granite", GREEN_GRANITE, natureGroup);
        Util.registerWithItem("pumice", PUMICE, natureGroup);
        Util.registerWithItem("jasper", JASPER, natureGroup);
        Util.registerWithItem("limestone", LIMESTONE, natureGroup);

        Util.registerWithItem("diabase_smooth", DIABASE_SMOOTH, furnGroup);
        Util.registerWithItem("grimestone_smooth", GRIMESTONE_SMOOTH, furnGroup);
        Util.registerWithItem("marinite_smooth", MARINITE_SMOOTH, furnGroup);
        Util.registerWithItem("verdantine_smooth", VERDANTINE_SMOOTH, furnGroup);
        Util.registerWithItem("green_granite_smooth", GREEN_GRANITE_SMOOTH, furnGroup);
        Util.registerWithItem("pumice_smooth", PUMICE_SMOOTH, furnGroup);
        Util.registerWithItem("jasper_smooth", JASPER_SMOOTH, furnGroup);
        Util.registerWithItem("limestone_smooth", LIMESTONE_SMOOTH, furnGroup);

        Util.registerWithItem("salt_ore", SALT_ORE, natureGroup);
        Util.registerWithItem("salt_block", SALT_BLOCK, furnGroup);
        Util.registerWithItem("nether_salt", NETHER_SALT, natureGroup);
        Util.registerWithItem("nether_coal_ore", NETHER_COAL_ORE, natureGroup);
    }
}