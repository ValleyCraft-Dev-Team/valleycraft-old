package io.github.linkle.valleycraft.init;


import io.github.linkle.valleycraft.blocks.decorations.*;
import io.github.linkle.valleycraft.blocks.plants.Decorative.SporeBlock;
import io.github.linkle.valleycraft.blocks.terrain.MudBlock;
import io.github.linkle.valleycraft.blocks.plants.DryMossBlock;
import io.github.linkle.valleycraft.blocks.plants.MossBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.intprovider.UniformIntProvider;

import static io.github.linkle.valleycraft.init.ItemGroups.FURNITURE_GROUP;
import static io.github.linkle.valleycraft.init.ItemGroups.NATURE_GROUP;

public class StoneBlocks {
    public static final Block VOLCANIC_ASH = new VolcanicAshBlock();
    public static final Block VOLCANIC_STONE = new StoneBlock();

    public static final Block MIXED_ORE = new OreBlock(Block.Settings.copy(Blocks.COAL_ORE));
    public static final Block DEEPSLATE_MIXED_ORE = new OreBlock(Block.Settings.copy(Blocks.COAL_ORE), UniformIntProvider.create(0, 2));
    public static final Block SALTPETER_ORE = new OreBlock(Block.Settings.copy(Blocks.COAL_ORE), UniformIntProvider.create(1, 3));
    public static final Block DEEPSLATE_SALTPETER_ORE = new OreBlock(Block.Settings.copy(Blocks.COAL_ORE), UniformIntProvider.create(1, 3));
    //public static final Block FROZEN_FOSSIL = new FrozenFossilOreBlock();

    public static final Block SCALDING_STONE = new ScaldingBlock();
    public static final Block SCALDING_SANDSTONE = new ScaldingBlock();
    public static final Block DESERT_GRAVEL = new VolcanicAshBlock();
    public static final Block BLEACHED_GRAVEL = new VolcanicAshBlock();
    public static final Block SCALDING_VOLC = new ScaldingBlock();
    public static final Block GLACIAL_STONE = new GlacialStone();

    public static final Block SALT_ORE = new OreBlock(Block.Settings.copy(Blocks.COAL_ORE), UniformIntProvider.create(0, 2));
    public static final Block SALT_BLOCK = new StoneBlock();
    public static final Block SALTPETER_BLOCK = new StoneBlock();
    public static final Block NETHER_SALT = new OreBlock(Block.Settings.copy(Blocks.NETHER_QUARTZ_ORE), UniformIntProvider.create(0, 2));
    public static final Block NETHER_COAL_ORE = new OreBlock(Block.Settings.copy(Blocks.NETHER_QUARTZ_ORE), UniformIntProvider.create(0, 2));
    public static final Block B_CLAY = new MudBlock(Blocks.TERRACOTTA, Block.Settings.of(Material.SOIL)
            .sounds(BlockSoundGroup.GRAVEL)
            .strength(0.6f, 1.5f));

    public static final Block JUNGLE = new StoneBlock();
    public static final Block JUNGLE_MOSSY = new MossBlock();
    public static final Block JUNGLE_SPOREY = new SporeBlock();
    public static final Block JUNGLE_COBBLE = new Block(Block.Settings.copy(Blocks.COBBLESTONE));
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

    public static final Block FLESH_BLOCK = new FleshBlock();

    //public static final Block CICADA = new CicadaBlock();

    public static void initialize() {
        var natureGroup = new Item.Settings().group(NATURE_GROUP);
        var furnGroup = new Item.Settings().group(FURNITURE_GROUP);

        Reg.registerWithItem("brown_clay", B_CLAY, natureGroup);
        Reg.registerWithItem("volc_ash", VOLCANIC_ASH, natureGroup);
        Reg.registerWithItem("volc_stone", VOLCANIC_STONE, natureGroup);
        Reg.registerWithItem("scalding_volc_stone", SCALDING_VOLC, natureGroup);

        Reg.registerWithItem("mixed_ore", MIXED_ORE, natureGroup);
        Reg.registerWithItem("deepslate_mixed_ore", DEEPSLATE_MIXED_ORE, natureGroup);
        Reg.registerWithItem("saltpeter_ore", SALTPETER_ORE, natureGroup);
        Reg.registerWithItem("deepslate_saltpeter_ore", DEEPSLATE_SALTPETER_ORE, natureGroup);

        Reg.registerWithItem("glacial_stone", GLACIAL_STONE, natureGroup);
        Reg.registerWithItem("scalding_stone", SCALDING_STONE, natureGroup);
        Reg.registerWithItem("scalding_sandstone", SCALDING_SANDSTONE, natureGroup);
        Reg.registerWithItem("desert_gravel", DESERT_GRAVEL, natureGroup);
        Reg.registerWithItem("bleached_gravel", BLEACHED_GRAVEL, natureGroup);

        Reg.registerWithItem("jungle_stone", JUNGLE, natureGroup);
        Reg.registerWithItem("jungle_cobble", JUNGLE_COBBLE, furnGroup);
        Reg.registerWithItem("jungle_sporey", JUNGLE_SPOREY, natureGroup);
        Reg.registerWithItem("jungle_mossy", JUNGLE_MOSSY, natureGroup);
        Reg.registerWithItem("stone_mossy", STONE_MOSSY, natureGroup);
        Reg.registerWithItem("dry_mossy_stone", DRY_MOSS_STONE, natureGroup);

        Reg.registerWithItem("oceanstone", OCEAN_STONE, natureGroup);
        Reg.registerWithItem("swampstone", SWAMP_STONE, natureGroup);
        Reg.registerWithItem("darkstone", DARK_STONE, natureGroup);
        Reg.registerWithItem("taigastone", TAIGA_STONE, natureGroup);
        Reg.registerWithItem("green_granite", GREEN_GRANITE, natureGroup);
        Reg.registerWithItem("pumice", PUMICE, natureGroup);
        Reg.registerWithItem("jasper", JASPER, natureGroup);
        Reg.registerWithItem("limestone", LIMESTONE, natureGroup);

        Reg.registerWithItem("diabase_smooth", DIABASE_SMOOTH, furnGroup);
        Reg.registerWithItem("grimestone_smooth", GRIMESTONE_SMOOTH, furnGroup);
        Reg.registerWithItem("marinite_smooth", MARINITE_SMOOTH, furnGroup);
        Reg.registerWithItem("verdantine_smooth", VERDANTINE_SMOOTH, furnGroup);
        Reg.registerWithItem("green_granite_smooth", GREEN_GRANITE_SMOOTH, furnGroup);
        Reg.registerWithItem("pumice_smooth", PUMICE_SMOOTH, furnGroup);
        Reg.registerWithItem("jasper_smooth", JASPER_SMOOTH, furnGroup);
        Reg.registerWithItem("limestone_smooth", LIMESTONE_SMOOTH, furnGroup);

        Reg.registerWithItem("salt_ore", SALT_ORE, natureGroup);
        Reg.registerWithItem("salt_block", SALT_BLOCK, furnGroup);
        Reg.registerWithItem("saltpeter_block", SALTPETER_BLOCK, furnGroup);
        Reg.registerWithItem("flesh_block", FLESH_BLOCK, furnGroup);
        Reg.registerWithItem("nether_salt", NETHER_SALT, natureGroup);
        Reg.registerWithItem("nether_coal_ore", NETHER_COAL_ORE, natureGroup);
    }
}