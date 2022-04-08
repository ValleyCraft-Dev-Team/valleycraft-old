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
    public static final Block SANDY_GRAVEL = new VolcanicAshBlock();
    public static final Block BLEACHED_GRAVEL = new VolcanicAshBlock();
    public static final Block SCALDING_VOLCANIC_STONE = new ScaldingBlock();
    public static final Block GLACIAL_STONE = new GlacialStone();

    public static final Block SALT_ORE = new OreBlock(Block.Settings.copy(Blocks.COAL_ORE), UniformIntProvider.create(0, 2));
    public static final Block SALT_BLOCK = new StoneBlock();
    public static final Block SALTPETER_BLOCK = new StoneBlock();
    public static final Block NETHER_SALT_ORE = new OreBlock(Block.Settings.copy(Blocks.NETHER_QUARTZ_ORE), UniformIntProvider.create(0, 2));
    public static final Block NETHER_COAL_ORE = new OreBlock(Block.Settings.copy(Blocks.NETHER_QUARTZ_ORE), UniformIntProvider.create(0, 2));
    public static final Block MUD = new MudBlock(Blocks.TERRACOTTA, Block.Settings.of(Material.SOIL)
            .sounds(BlockSoundGroup.GRAVEL)
            .strength(0.6f, 1.5f));

    public static final Block CARMINE = new StoneBlock();
    public static final Block MOSSY_CARMINE = new MossBlock();
    public static final Block BLOSSOMING_CARMINE = new SporeBlock();
    public static final Block COBBLED_CARMINE = new Block(Block.Settings.copy(Blocks.COBBLESTONE));
    public static final Block MOSSY_STONE = new MossBlock();
    public static final Block DRY_MOSSY_STONE = new DryMossBlock();

    public static final Block MARINITE = new StoneBlock();
    public static final Block GRIMESTONE = new StoneBlock();
    public static final Block DIABASE = new StoneBlock();
    public static final Block VERDANTINE = new StoneBlock();

    public static final Block LIMESTONE = new StoneBlock();
    public static final Block PUMICE = new StoneBlock();
    public static final Block JASPER = new StoneBlock();
    public static final Block GREEN_GRANITE = new StoneBlock();

    public static final Block POLISHED_DIABASE = new StoneBlock();
    public static final Block POLISHED_GRIMESTONE = new StoneBlock();
    public static final Block POLISHED_VERDANTINE = new StoneBlock();
    public static final Block POLISHED_MARINITE = new StoneBlock();
    public static final Block POLISHED_JASPER = new StoneBlock();
    public static final Block POLISHED_PUMICE = new StoneBlock();
    public static final Block POLISHED_GREEN_GRANITE = new StoneBlock();
    public static final Block POLISHED_LIMESTONE = new StoneBlock();

    public static final Block ROTTEN_FLESH_BLOCK = new FleshBlock();

    //public static final Block CICADA = new CicadaBlock();

    public static void initialize() {
        var natureGroup = new Item.Settings().group(NATURE_GROUP);
        var furnGroup = new Item.Settings().group(FURNITURE_GROUP);

        Reg.registerWithItem("mud", MUD, natureGroup);

        Reg.registerWithItem("volcanic_ash", VOLCANIC_ASH, natureGroup);
        Reg.registerWithItem("volcanic_stone", VOLCANIC_STONE, natureGroup);
        Reg.registerWithItem("scalding_volcanic_stone", SCALDING_VOLCANIC_STONE, natureGroup);

        Reg.registerWithItem("mixed_ore", MIXED_ORE, natureGroup);
        Reg.registerWithItem("deepslate_mixed_ore", DEEPSLATE_MIXED_ORE, natureGroup);
        Reg.registerWithItem("saltpeter_ore", SALTPETER_ORE, natureGroup);
        Reg.registerWithItem("deepslate_saltpeter_ore", DEEPSLATE_SALTPETER_ORE, natureGroup);

        Reg.registerWithItem("glacial_stone", GLACIAL_STONE, natureGroup);
        Reg.registerWithItem("scalding_stone", SCALDING_STONE, natureGroup);
        Reg.registerWithItem("scalding_sandstone", SCALDING_SANDSTONE, natureGroup);
        Reg.registerWithItem("sandy_gravel", SANDY_GRAVEL, natureGroup);
        Reg.registerWithItem("bleached_gravel", BLEACHED_GRAVEL, natureGroup);

        Reg.registerWithItem("carmine", CARMINE, natureGroup);
        Reg.registerWithItem("cobbled_carmine", COBBLED_CARMINE, furnGroup);
        Reg.registerWithItem("blossoming_carmine", BLOSSOMING_CARMINE, natureGroup);
        Reg.registerWithItem("mossy_carmine", MOSSY_CARMINE, natureGroup);

        Reg.registerWithItem("mossy_stone", MOSSY_STONE, natureGroup);
        Reg.registerWithItem("dry_mossy_stone", DRY_MOSSY_STONE, natureGroup);

        Reg.registerWithItem("marinite", MARINITE, natureGroup);
        Reg.registerWithItem("grimestone", GRIMESTONE, natureGroup);
        Reg.registerWithItem("diabase", DIABASE, natureGroup);
        Reg.registerWithItem("verdantine", VERDANTINE, natureGroup);
        Reg.registerWithItem("green_granite", GREEN_GRANITE, natureGroup);
        Reg.registerWithItem("pumice", PUMICE, natureGroup);
        Reg.registerWithItem("jasper", JASPER, natureGroup);
        Reg.registerWithItem("limestone", LIMESTONE, natureGroup);

        Reg.registerWithItem("polished_diabase", POLISHED_DIABASE, furnGroup);
        Reg.registerWithItem("polished_grimestone", POLISHED_GRIMESTONE, furnGroup);
        Reg.registerWithItem("polished_marinite", POLISHED_MARINITE, furnGroup);
        Reg.registerWithItem("polished_verdantine", POLISHED_VERDANTINE, furnGroup);
        Reg.registerWithItem("polished_green_granite", POLISHED_GREEN_GRANITE, furnGroup);
        Reg.registerWithItem("polished_pumice", POLISHED_PUMICE, furnGroup);
        Reg.registerWithItem("polished_jasper", POLISHED_JASPER, furnGroup);
        Reg.registerWithItem("polished_limestone", POLISHED_LIMESTONE, furnGroup);

        Reg.registerWithItem("salt_ore", SALT_ORE, natureGroup);
        Reg.registerWithItem("salt_block", SALT_BLOCK, furnGroup);
        Reg.registerWithItem("saltpeter_block", SALTPETER_BLOCK, furnGroup);
        Reg.registerWithItem("rotten_flesh_block", ROTTEN_FLESH_BLOCK, furnGroup);
        Reg.registerWithItem("nether_salt_ore", NETHER_SALT_ORE, natureGroup);
        Reg.registerWithItem("nether_coal_ore", NETHER_COAL_ORE, natureGroup);
    }
}