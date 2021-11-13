package net.linkle.valley.Registry.Initializers;


import net.linkle.valley.Registry.Blocks.Decorations.*;
import net.linkle.valley.Registry.Blocks.Plants.*;
import net.linkle.valley.Registry.Blocks.Plants.Decorative.SporeBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.linkle.valley.Registry.Initializers.ItemGroups.NATURE_GROUP;
import static net.linkle.valley.ValleyMain.MOD_ID;
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
    public static final Block B_ROOTS = new BrownClayBlock();

    public static final Block JUNGLE = new StoneOreBlock();
    public static final Block JUNGLE_MOSSY = new MossyBlock();
    public static final Block JUNGLE_SPOREY = new SporeBlock();
    public static final Block JUNGLE_COBBLE = new StoneOreBlock();
    public static final Block STONE_MOSSY = new MossyBlock();

    public static final Block OCEAN_STONE = new StoneOreBlock();
    public static final Block SWAMP_STONE = new StoneOreBlock();
    public static final Block DARK_STONE = new StoneOreBlock();
    public static final Block TAIGA_STONE = new StoneOreBlock();

    public static final Block CICADA = new CicadaBlock();

    public static void initialize() {
        var natureGroup = new Item.Settings().group(NATURE_GROUP);
        
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
        registerWithItem("jungle_cobble", JUNGLE_COBBLE, natureGroup);
        registerWithItem("jungle_sporey", JUNGLE_SPOREY, natureGroup);
        registerWithItem("jungle_mossy", JUNGLE_MOSSY, natureGroup);
        registerWithItem("stone_mossy", STONE_MOSSY, natureGroup);
        
        registerWithItem("oceanstone", OCEAN_STONE, natureGroup);
        registerWithItem("swampstone", SWAMP_STONE, natureGroup);
        registerWithItem("darkstone", DARK_STONE, natureGroup);
        registerWithItem("taigastone", TAIGA_STONE, natureGroup);
        
        registerWithItem("salt_ore", SALT_ORE, natureGroup);
        registerWithItem("salt_block", SALT_BLOCK, natureGroup);
        registerWithItem("nether_salt", NETHER_SALT, natureGroup);
        registerWithItem("nether_coal_ore", NETHER_COAL_ORE, natureGroup);
    }
}