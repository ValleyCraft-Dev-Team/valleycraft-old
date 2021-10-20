package net.linkle.valley.Registry.Initializers;

import net.linkle.valley.Registry.Blocks.Decorations.*;
import net.linkle.valley.Registry.Blocks.Plants.BrownClayBlock;
import net.linkle.valley.Registry.Blocks.Plants.MossyBlock;
import net.linkle.valley.Registry.Blocks.Plants.MudBlock;
import net.linkle.valley.Registry.Blocks.Plants.Decorative.SporeBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.linkle.valley.ValleyMain.MOD_ID;
import static net.linkle.valley.Registry.Initializers.ItemGroups.*;

public class BlocksCont {
    public static final Block VOLCANIC_ASH = new VolcanicAshBlock();
    public static final Block VOLCANIC_STONE = new SaltOreBlock();

    public static final Block MIXED_ORE = new SaltOreBlock();
    public static final Block SALTPETER_ORE = new SaltOreBlock();
    public static final Block FOSSIL_ORE = new SaltOreBlock();

    public static final Block SCALDING_STONE = new ScaldingBlock();
    public static final Block SCALDING_SANDSTONE = new ScaldingBlock();
    public static final Block DESERT_GRAVEL = new VolcanicAshBlock();
    public static final Block BLEACHED_GRAVEL = new VolcanicAshBlock();
    public static final Block SCALDING_VOLC = new ScaldingBlock();
    public static final Block GLACIAL_STONE = new GlacialStone();

    public static final Block SALT_ORE = new SaltOreBlock();
    public static final Block SALT_BLOCK = new SaltOreBlock();
    public static final Block NETHER_SALT = new NetherSaltBlock();
    public static final Block NETHER_COAL_ORE = new NetherCoalOreBlock();
    public static final Block B_CLAY = new MudBlock();
    public static final Block B_ROOTS = new BrownClayBlock();

    public static final Block JUNGLE = new SaltOreBlock();
    public static final Block JUNGLE_MOSSY = new MossyBlock();
    public static final Block JUNGLE_SPOREY = new SporeBlock();
    public static final Block JUNGLE_COBBLE = new SaltOreBlock();
    public static final Block STONE_MOSSY = new MossyBlock();

    public static final Block OCEAN_STONE = new SaltOreBlock();
    public static final Block SWAMP_STONE = new SaltOreBlock();
    public static final Block DARK_STONE = new SaltOreBlock();
    public static final Block TAIGA_STONE = new SaltOreBlock();

    public static void initialize() {
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "brown_clay"), B_CLAY);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "brown_clay"), new BlockItem(B_CLAY, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "muddy_reed_roots"), B_ROOTS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "muddy_reed_roots"), new BlockItem(B_ROOTS, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "volc_ash"), VOLCANIC_ASH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "volc_ash"), new BlockItem(VOLCANIC_ASH, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "volc_stone"), VOLCANIC_STONE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "volc_stone"), new BlockItem(VOLCANIC_STONE, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "scalding_volc_stone"), SCALDING_VOLC);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "scalding_volc_stone"), new BlockItem(SCALDING_VOLC, new Item.Settings().group(NATURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "mixed_ore"), MIXED_ORE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "mixed_ore"), new BlockItem(MIXED_ORE, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "saltpeter_ore"), SALTPETER_ORE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "saltpeter_ore"), new BlockItem(SALTPETER_ORE, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "fossil_ore"), FOSSIL_ORE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fossil_ore"), new BlockItem(FOSSIL_ORE, new Item.Settings().group(NATURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "glacial_stone"), GLACIAL_STONE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "glacial_stone"), new BlockItem(GLACIAL_STONE, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "scalding_stone"), SCALDING_STONE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "scalding_stone"), new BlockItem(SCALDING_STONE, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "scalding_sandstone"), SCALDING_SANDSTONE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "scalding_sandstone"), new BlockItem(SCALDING_SANDSTONE, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "desert_gravel"), DESERT_GRAVEL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "desert_gravel"), new BlockItem(DESERT_GRAVEL, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "bleached_gravel"), BLEACHED_GRAVEL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bleached_gravel"), new BlockItem(BLEACHED_GRAVEL, new Item.Settings().group(FURNITURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "jungle_stone"), JUNGLE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "jungle_stone"), new BlockItem(JUNGLE, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "jungle_cobble"), JUNGLE_COBBLE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "jungle_cobble"), new BlockItem(JUNGLE_COBBLE, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "jungle_sporey"), JUNGLE_SPOREY);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "jungle_sporey"), new BlockItem(JUNGLE_SPOREY, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "jungle_mossy"), JUNGLE_MOSSY);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "jungle_mossy"), new BlockItem(JUNGLE_MOSSY, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stone_mossy"), STONE_MOSSY);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_mossy"), new BlockItem(STONE_MOSSY, new Item.Settings().group(NATURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "oceanstone"), OCEAN_STONE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "oceanstone"), new BlockItem(OCEAN_STONE, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "swampstone"), SWAMP_STONE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "swampstone"), new BlockItem(SWAMP_STONE, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "darkstone"), DARK_STONE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "darkstone"), new BlockItem(DARK_STONE, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "taigastone"), TAIGA_STONE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "taigastone"), new BlockItem(TAIGA_STONE, new Item.Settings().group(NATURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "salt_ore"), SALT_ORE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "salt_ore"), new BlockItem(SALT_ORE, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "salt_block"), SALT_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "salt_block"), new BlockItem(SALT_BLOCK, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "nether_salt"), NETHER_SALT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "nether_salt"), new BlockItem(NETHER_SALT, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "nether_coal_ore"), NETHER_COAL_ORE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "nether_coal_ore"), new BlockItem(NETHER_COAL_ORE, new Item.Settings().group(NATURE_GROUP)));
    }
}