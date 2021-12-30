package io.github.linkle.valleycraft.init;

import io.github.linkle.valleycraft.blocks.cave.CrystalBlock;
import io.github.linkle.valleycraft.blocks.cave.SpiderEggBlock;
import io.github.linkle.valleycraft.blocks.plants.CactusBlock;
import io.github.linkle.valleycraft.blocks.crops.MaizeCropBlock;
import io.github.linkle.valleycraft.blocks.crops.RiceCropBlock;
import io.github.linkle.valleycraft.blocks.plants.Decorative.*;
import io.github.linkle.valleycraft.blocks.plants.SaplingBlock;
import io.github.linkle.valleycraft.blocks.plants.*;
import io.github.linkle.valleycraft.blocks.plants.bushes.BerryBushBlock;
import io.github.linkle.valleycraft.blocks.plants.bushes.HedgeBushBlock;
import io.github.linkle.valleycraft.blocks.plants.bushes.JungleBushBlock;
import io.github.linkle.valleycraft.blocks.plants.bushes.TumbleWeedBlock;
import io.github.linkle.valleycraft.blocks.sapling.AppleSaplingGen;
import io.github.linkle.valleycraft.utils.Util;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.block.MossBlock;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.tag.BlockTags;

import static io.github.linkle.valleycraft.init.ItemGroups.COOKING_GROUP;
import static io.github.linkle.valleycraft.init.ItemGroups.NATURE_GROUP;

public class Plants {
    //bushes
    public static final Block BITTER_BERRY_BUSH = new BerryBushBlock(true);

    public static final Block SPICY_BERRY_BUSH = new BerryBushBlock(true, floor -> 
        floor.isIn(BlockTags.BASE_STONE_NETHER) || floor.isIn(BlockTags.NYLIUM) || floor.isOf(Blocks.MAGMA_BLOCK)
    );

    public static final Block TOMATO_BUSH = new BerryBushBlock(false);

    public static final Block HOLLY_BUSH = new BerryBushBlock(true);

    public static final Block TUMBLE_WEED = new TumbleWeedBlock(FabricBlockSettings.of(Material.LEAVES).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.GRASS)
            .strength(0.4f,0.1f));
    //crops

    public static final Block RICE_SEEDLINGS = new RiceCropBlock(FabricBlockSettings.copy(Blocks.WHEAT));

    public static final Block MAIZE_CROP = new MaizeCropBlock(FabricBlockSettings.copy(Blocks.WHEAT));

    public static final Block ROSEBUSH = new Plant();
    public static final Block LILACBUSH = new Plant();
    public static final Block PEONYBUSH = new Plant();
    public static final Block FERNBUSH = new Plant();
    public static final Block BUSH = new Plant();
    public static final Block MOREL = new MushBlock();
    public static final Block HERBS = new Plant();

    public static final Block HEDGE = new HedgeBushBlock(FabricBlockSettings.of(Material.LEAVES).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.GRASS)
            .strength(0,0.1f));

    public static final Block SMALL_CACTUS = new CactusBlock();
    public static final Block FLOWERING_CACTUS = new SmallCactusBlock();

    public static final Block REED_BLOCK = new ReedBlock(FabricBlockSettings.of(Material.UNDERWATER_PLANT).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.GRASS)
            .strength(0,0.1f));

    public static final Block WILD_CARROT = new Plant();
    public static final Block WILD_POTATO = new Plant();
    public static final Block WILD_BEET = new Plant();
    public static final Block WILD_WHEAT = new Plant();
    public static final Block DANDELION_PUFF = new Plant();
    public static final Block REDWOOD_SORREL = new Plant();
    public static final Block WEAPING_SWAMP_WILLOW = new RoseBushGlow();
    public static final Block CROCUS = new Plant();
    public static final Block TAPROOTS = new Plant();

    public static final Block BUSH_ALIVE = new RoseBushTall();
    public static final Block SNOW_BUSH = new SnowBush();
    
    public static final Block DRY_MOSS_CARPET = new CarpetBlock(Block.Settings.of(Material.PLANT, MapColor.YELLOW).strength(0.1f).sounds(BlockSoundGroup.MOSS_CARPET));
    public static final Block DRY_MOSS = new MossBlock(Block.Settings.of(Material.MOSS_BLOCK, MapColor.YELLOW).strength(0.1f).sounds(BlockSoundGroup.MOSS_BLOCK));
    
    public static final Block ROCK_PILE = new RockBlock();
    public static final Block REDSTONE_CRYSTAL = new CrystalBlock(FabricBlockSettings.of(Material.AMETHYST)
            .nonOpaque().requiresTool().sounds(BlockSoundGroup.AMETHYST_CLUSTER)
            .strength(1.5f,2.0f).luminance(7), true);

    public static final Block SNOW_ROCK_PILE = new RockBlock();

    // Mossy vines
    public static final VinesBlock MOSSY_VINES = new VinesBlock(
            FabricBlockSettings.of(Material.PLANT, MapColor.GREEN)
            .ticksRandomly()
            .noCollision()
            .breakInstantly()
            .sounds(BlockSoundGroup.WEEPING_VINES));
    public static final VinesPlantBlock MOSSY_VINES_PLANT = new VinesPlantBlock(
            FabricBlockSettings.of(Material.PLANT, MapColor.GREEN)
            .noCollision()
            .breakInstantly()
            .sounds(BlockSoundGroup.WEEPING_VINES));
    
    // Dry vines
    public static final VinesBlock DRY_VINES = new VinesBlock(
            FabricBlockSettings.of(Material.PLANT, MapColor.YELLOW)
            .ticksRandomly()
            .noCollision()
            .breakInstantly()
            .sounds(BlockSoundGroup.WEEPING_VINES));
    public static final VinesPlantBlock DRY_VINES_PLANT = new VinesPlantBlock(
            FabricBlockSettings.of(Material.PLANT, MapColor.YELLOW)
            .noCollision()
            .breakInstantly()
            .sounds(BlockSoundGroup.WEEPING_VINES));
    
    public static final Block JUNGLE_BUSH = new JungleBushBlock(FabricBlockSettings.of(Material.LEAVES).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.GRASS)
            .strength(0,0.1f));

    public static final Block SWAMP_BUSH = new Plant();
    public static final Block JUNGLE_CAP = new MushBlock();
    public static final Block SPROUT = new Plant();

    public static final Block SWAMP_RIBBON = new Plant();
    public static final Block BLACK_DAHLIA = new Plant();
    public static final Block LAVENDER = new Plant();
    public static final Block LAVENDER_SPRIG = new Plant();
    public static final Block ROSE_SPRIG = new Plant();
    public static final Block ICE_ROSE = new Plant();
    public static final Block ORANGE_FERN = new Plant();
    public static final Block ORANGE_BEAUTY = new Plant();

    public static final SaplingBlock APPLE_SAPLING = new SaplingBlock(new AppleSaplingGen());
    public static final Block APPLE_LEAVES = new LeavesBlock(Settings.copy(Blocks.OAK_LEAVES));
    public static final Block APPLE_LEAVES_EMPTY = new LeavesBlock(Settings.copy(Blocks.OAK_LEAVES));

    public static final Block SPIDER_EGG_BLOCK = new SpiderEggBlock(FabricBlockSettings.of(Material.CACTUS, MapColor.LIGHT_GRAY)
            .breakByHand(true).nonOpaque().luminance(3)
            .sounds(BlockSoundGroup.WOOL).breakInstantly().ticksRandomly()
            .strength(0.0f,0.1f));

    public static final Block PANFLOWER = new Plant();
    public static final Block HONEY_CLUSTER = new Plant();

    public static void initialize() {
        var natureGroup = new Item.Settings().group(NATURE_GROUP);

        Util.registerWithItem("small_cactus", SMALL_CACTUS, natureGroup);
        Util.registerWithItem("flowering_cactus", FLOWERING_CACTUS, natureGroup);
        Util.registerWithItem("tumbleweed", TUMBLE_WEED, natureGroup);
        //bushes
        Util.registerWithItem("rose_bush", ROSEBUSH, natureGroup);
        Util.registerWithItem("lilac_bush", LILACBUSH, natureGroup);
        Util.registerWithItem("peony_bush", PEONYBUSH, natureGroup);
        Util.registerWithItem("bush", BUSH, natureGroup);
        Util.registerWithItem("alive_bush", BUSH_ALIVE, natureGroup);
        Util.registerWithItem("herbs", HERBS, new Item.Settings().group(NATURE_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.5f).build()).maxCount(64));
        Util.registerWithItem("taproots", TAPROOTS, new Item.Settings().group(NATURE_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.5f).build()).maxCount(64));

        Util.registerWithItem("weaping_willow", WEAPING_SWAMP_WILLOW, natureGroup);
        Util.registerWithItem("pond_ribbons", SWAMP_RIBBON, natureGroup);

        Util.registerWithItem("redwood_sorrel", REDWOOD_SORREL, natureGroup);
        Util.registerWithItem("crocus", CROCUS, natureGroup);

        Util.registerWithItem("dandelion_puffs", DANDELION_PUFF, natureGroup);
        Util.registerWithItem("lavender", LAVENDER, natureGroup);
        Util.registerWithItem("lavender_sprig", LAVENDER_SPRIG, natureGroup);
        Util.registerWithItem("single_rose", ROSE_SPRIG, natureGroup);
        Util.registerWithItem("black_dahlia", BLACK_DAHLIA, natureGroup);
        Util.registerWithItem("ice_rose", ICE_ROSE, natureGroup);
        Util.registerWithItem("orange_beauty", ORANGE_BEAUTY, natureGroup);

        Util.registerWithItem("panflower", PANFLOWER, natureGroup);
        Util.registerWithItem("honey_cluster", HONEY_CLUSTER, natureGroup);

        Util.registerWithItem("jungle_cap", JUNGLE_CAP, natureGroup);

        Util.registerWithItem("orange_fern", ORANGE_FERN, natureGroup);

        Util.registerWithItem("sprout", SPROUT, natureGroup);

        Util.registerWithItem("wild_carrot", WILD_CARROT, natureGroup);
        Util.registerWithItem("wild_potato", WILD_POTATO, natureGroup);
        Util.registerWithItem("wild_beet", WILD_BEET, natureGroup);
        Util.registerWithItem("wild_wheat", WILD_WHEAT, natureGroup);
        Util.registerWithItem("morel", MOREL, natureGroup);
        
        Util.registerWithItem("rice_crop", RICE_SEEDLINGS, natureGroup);
        Util.registerWithItem("tomato_bush", TOMATO_BUSH, new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build()).maxCount(64));
        Util.registerWithItem("spicy_berries", SPICY_BERRY_BUSH, new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,600), 1.0f).build()).maxCount(64));
        Util.registerWithItem("bitter_berries", BITTER_BERRY_BUSH, new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build()).maxCount(64));
        Util.registerWithItem("holly", HOLLY_BUSH, new Item.Settings().group(NATURE_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.POISON,400), 1.0f).build()).maxCount(64));

        Util.registerWithItem("maize_crop", MAIZE_CROP, new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build()).maxCount(64));


        Util.registerWithItem("reeds", REED_BLOCK, natureGroup);

        Util.registerWithItem("rocks", ROCK_PILE, natureGroup);
        Util.registerWithItem("snow_rocks", SNOW_ROCK_PILE, natureGroup);
        Util.registerWithItem("redstone_crystal", REDSTONE_CRYSTAL, natureGroup);
        Util.registerWithItem("snow_bush", SNOW_BUSH, natureGroup);

        MOSSY_VINES.setPlant(MOSSY_VINES_PLANT);
        MOSSY_VINES_PLANT.setStem(MOSSY_VINES);
        Util.registerWithItem("mossy_vines", MOSSY_VINES, natureGroup);
        Util.register("mossy_vines_plant", MOSSY_VINES_PLANT);
        
        DRY_VINES.setPlant(DRY_VINES_PLANT);
        DRY_VINES_PLANT.setStem(DRY_VINES);
        Util.registerWithItem("dry_vines", DRY_VINES, natureGroup);
        Util.register("dry_vines_plant", DRY_VINES_PLANT);
        
        Util.registerWithItem("dry_moss_carpet", DRY_MOSS_CARPET, natureGroup);
        Util.registerWithItem("dry_moss", DRY_MOSS, natureGroup);
        
        Util.registerWithItem("jungle_bush", JUNGLE_BUSH, natureGroup);
        Util.registerWithItem("swamp_bush", SWAMP_BUSH, natureGroup);
        Util.registerWithItem("hedge", HEDGE, natureGroup);
        
        Util.registerWithItem("apple_sapling", APPLE_SAPLING, natureGroup);
        Util.registerWithItem("apple_leaves", APPLE_LEAVES, natureGroup);
        Util.registerWithItem("apple_leaves_empty", APPLE_LEAVES_EMPTY, natureGroup);

        Util.registerWithItem("spider_egg", SPIDER_EGG_BLOCK, natureGroup);
    }
}
