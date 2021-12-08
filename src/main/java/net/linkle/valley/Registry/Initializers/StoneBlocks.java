package net.linkle.valley.Registry.Initializers;


import net.linkle.valley.Registry.Blocks.Decorations.*;
import net.linkle.valley.Registry.Blocks.Plants.*;
import net.linkle.valley.Registry.Blocks.Plants.Decorative.SporeBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

import static net.linkle.valley.Registry.Initializers.ItemGroups.FURNITURE_GROUP;
import static net.linkle.valley.Registry.Initializers.ItemGroups.NATURE_GROUP;
import static net.linkle.valley.Registry.Utils.Util.registerWithItem;

public class StoneBlocks {
    public static final Block VOLCANIC_ASH = new VolcanicAshBlock();
    public static final Block VOLCANIC_STONE = new StoneOreBlock();

    public static final Block MIXED_ORE = new StoneOreBlock();
    public static final Block SALTPETER_ORE = new StoneOreBlock();
    public static final Block FOSSIL_ORE = new StoneOreBlock();
    public static final Block FROZEN_FOSSIL = new FrozenFossilOreBlock();

    public static final Block SCALDING_STONE = new ScaldingBlock();
    public static final Block SCALDING_SANDSTONE = new ScaldingBlock();
    public static final Block DESERT_GRAVEL = new VolcanicAshBlock();
    public static final Block BLEACHED_GRAVEL = new VolcanicAshBlock();
    public static final Block SCALDING_VOLC = new ScaldingBlock();
    public static final Block GLACIAL_STONE = new GlacialStone();

    public static final Block SALT_ORE = new StoneOreBlock();
    public static final Block SALT_BLOCK = new StoneOreBlock();
    public static final Block NETHER_SALT = new StoneOreBlock();
    public static final Block NETHER_COAL_ORE = new StoneOreBlock();
    public static final Block B_CLAY = new MudBlock();

    public static final Block JUNGLE = new StoneOreBlock();
    public static final Block JUNGLE_MOSSY = new MossBlock();
    public static final Block JUNGLE_SPOREY = new SporeBlock();
    public static final Block JUNGLE_COBBLE = new StoneOreBlock();
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

    public static final Block CICADA = new CicadaBlock();

    public static void initialize() {
        var natureGroup = new Item.Settings().group(NATURE_GROUP);
        var furnGroup = new Item.Settings().group(FURNITURE_GROUP);

        registerWithItem("brown_clay", B_CLAY, natureGroup);
        //registerWithItem("muddy_reed_roots", B_ROOTS, natureGroup);
        registerWithItem("volc_ash", VOLCANIC_ASH, natureGroup);
        registerWithItem("volc_stone", VOLCANIC_STONE, natureGroup);
        registerWithItem("scalding_volc_stone", SCALDING_VOLC, natureGroup);

        registerWithItem("mixed_ore", MIXED_ORE, natureGroup);
        registerWithItem("saltpeter_ore", SALTPETER_ORE, natureGroup);
        //registerWithItem("fossil_ore", FOSSIL_ORE, natureGroup);
        //registerWithItem("frozen_fossil_ore", FROZEN_FOSSIL, natureGroup);
        //registerWithItem("fossilized_sand_cicada", CICADA, natureGroup);

        registerWithItem("glacial_stone", GLACIAL_STONE, natureGroup);
        registerWithItem("scalding_stone", SCALDING_STONE, natureGroup);
        registerWithItem("scalding_sandstone", SCALDING_SANDSTONE, natureGroup);
        registerWithItem("desert_gravel", DESERT_GRAVEL, natureGroup);
        registerWithItem("bleached_gravel", BLEACHED_GRAVEL, natureGroup);

        registerWithItem("jungle_stone", JUNGLE, natureGroup);
        registerWithItem("jungle_cobble", JUNGLE_COBBLE, furnGroup);
        registerWithItem("jungle_sporey", JUNGLE_SPOREY, natureGroup);
        registerWithItem("jungle_mossy", JUNGLE_MOSSY, natureGroup);
        registerWithItem("stone_mossy", STONE_MOSSY, natureGroup);
        registerWithItem("dry_mossy_stone", DRY_MOSS_STONE, natureGroup);
        
        registerWithItem("oceanstone", OCEAN_STONE, natureGroup);
        registerWithItem("swampstone", SWAMP_STONE, natureGroup);
        registerWithItem("darkstone", DARK_STONE, natureGroup);
        registerWithItem("taigastone", TAIGA_STONE, natureGroup);
        registerWithItem("green_granite", GREEN_GRANITE, natureGroup);
        registerWithItem("pumice", PUMICE, natureGroup);
        registerWithItem("jasper", JASPER, natureGroup);
        registerWithItem("limestone", LIMESTONE, natureGroup);

        registerWithItem("diabase_smooth", DIABASE_SMOOTH, furnGroup);
        registerWithItem("grimestone_smooth", GRIMESTONE_SMOOTH, furnGroup);
        registerWithItem("marinite_smooth", MARINITE_SMOOTH, furnGroup);
        registerWithItem("verdantine_smooth", VERDANTINE_SMOOTH, furnGroup);
        registerWithItem("green_granite_smooth", GREEN_GRANITE_SMOOTH, furnGroup);
        registerWithItem("pumice_smooth", PUMICE_SMOOTH, furnGroup);
        registerWithItem("jasper_smooth", JASPER_SMOOTH, furnGroup);
        registerWithItem("limestone_smooth", LIMESTONE_SMOOTH, furnGroup);

        registerWithItem("salt_ore", SALT_ORE, natureGroup);
        registerWithItem("salt_block", SALT_BLOCK, furnGroup);
        registerWithItem("nether_salt", NETHER_SALT, natureGroup);
        registerWithItem("nether_coal_ore", NETHER_COAL_ORE, natureGroup);
    }
}