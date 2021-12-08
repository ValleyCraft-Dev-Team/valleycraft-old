package net.linkle.valley.Registry.Initializers;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.linkle.valley.Registry.Blocks.Plants.*;
import net.linkle.valley.Registry.Blocks.Plants.AquaticPlants.ClamBlock;
import net.linkle.valley.Registry.Blocks.Plants.Bushes.*;
import net.linkle.valley.Registry.Blocks.Plants.Cave.*;
import net.linkle.valley.Registry.Blocks.Plants.CactusBlock;
import net.linkle.valley.Registry.Blocks.Plants.Crops.MaizeCropBlock;
import net.linkle.valley.Registry.Blocks.Plants.Crops.RiceCropBlock;
import net.linkle.valley.Registry.Blocks.Plants.Decorative.*;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CarpetBlock;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.block.MossBlock;
import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.tag.BlockTags;

import static net.linkle.valley.Registry.Initializers.ItemGroups.*;
import static net.linkle.valley.Registry.Utils.Util.registerWithItem;
import static net.linkle.valley.Registry.Utils.Util.register;

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
    public static final Block BUSH_ALIVE_TALL = new RoseBushTall();
    public static final Block BUSH_DEAD_TALL = new RoseBushTall();
    public static final Block SNOW_BUSH = new SnowBush();
    public static final Block SNOW_YAM = new SnowBush();
    public static final Block WINTER_ROOT = new SnowBushHidden();
    
    public static final Block DRY_MOSS_CARPET = new CarpetBlock(Block.Settings.of(Material.PLANT, MapColor.YELLOW).strength(0.1f).sounds(BlockSoundGroup.MOSS_CARPET));
    public static final Block DRY_MOSS = new MossBlock(Block.Settings.of(Material.MOSS_BLOCK, MapColor.YELLOW).strength(0.1f).sounds(BlockSoundGroup.MOSS_BLOCK));
    
    public static final Block ROCK_PILE = new RockBlock();
    public static final Block RED_PILE = new CrystalBlock(FabricBlockSettings.of(Material.STONE).nonOpaque()
            .breakByHand(false).breakByTool(FabricToolTags.PICKAXES)
            .sounds(BlockSoundGroup.AMETHYST_CLUSTER)
            .strength(1.0f,2.0f).luminance(7), true);

    public static final Block BLUE_PILE = new CrystalBlock(FabricBlockSettings.of(Material.STONE).nonOpaque()
            .breakByHand(false).breakByTool(FabricToolTags.PICKAXES)
            .sounds(BlockSoundGroup.AMETHYST_CLUSTER)
            .strength(1.0f,2.0f).luminance(13), false);

    public static final Block COIN_STACK = new CrystalBlock(FabricBlockSettings.of(Material.METAL).nonOpaque()
            .breakByHand(false).breakByTool(FabricToolTags.PICKAXES)
            .sounds(BlockSoundGroup.CHAIN).breakInstantly()
            .strength(1.0f,2.0f), false);

    //public static final Block GREEN_PILE = new BlueCrystalBlock(FabricBlockSettings.of(Material.STONE).nonOpaque()
            //.breakByHand(false).breakByTool(FabricToolTags.PICKAXES)
            //.sounds(BlockSoundGroup.AMETHYST_CLUSTER)
            //.strength(3.5f,2.0f).luminance(7));

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
    public static final Block DRIFT = new ClamBlock();

    public static final SaplingBlock APPLE_SAPLING = new SaplingBlock(new AppleSaplingGen());
    public static final Block APPLE_LEAVES = new LeavesBlock(Settings.copy(Blocks.OAK_LEAVES));
    public static final Block APPLE_LEAVES_EMPTY = new LeavesBlock(Settings.copy(Blocks.OAK_LEAVES));

    public static final Block GIANT_RED = new GiantShroomBlock(FabricBlockSettings.of(Material.LEAVES).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.WOOD)
            .strength(0.4f,0.1f));

    public static final Block GIANT_BROWN = new GiantShroomBlock(FabricBlockSettings.of(Material.LEAVES).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.GRASS)
            .strength(0.4f,0.1f));

    public static final Block SPIDER_EGG_BLOCK = new SpiderEggBlock(FabricBlockSettings.of(Material.CACTUS, MapColor.LIGHT_GRAY)
            .breakByHand(true).nonOpaque().luminance(3)
            .sounds(BlockSoundGroup.WOOL).breakInstantly().ticksRandomly()
            .strength(0.0f,0.1f));

    public static final Block PANFLOWER = new Plant();
    public static final Block HONEY_CLUSTER = new Plant();

    public static void initialize() {
        var natureGroup = new Item.Settings().group(NATURE_GROUP);

        registerWithItem("small_cactus", SMALL_CACTUS, natureGroup);
        registerWithItem("flowering_cactus", FLOWERING_CACTUS, natureGroup);
        registerWithItem("tumbleweed", TUMBLE_WEED, natureGroup);
        //bushes
        registerWithItem("rose_bush", ROSEBUSH, natureGroup);
        registerWithItem("lilac_bush", LILACBUSH, natureGroup);
        registerWithItem("peony_bush", PEONYBUSH, natureGroup);
        registerWithItem("bush", BUSH, natureGroup);
        registerWithItem("alive_bush", BUSH_ALIVE, natureGroup);
        //registerWithItem("alive_bush_tall", BUSH_ALIVE_TALL, natureGroup);
        //registerWithItem("dead_bush_tall", BUSH_DEAD_TALL, natureGroup);
        registerWithItem("herbs", HERBS, new Item.Settings().group(NATURE_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.5f).build()).maxCount(64));
        registerWithItem("taproots", TAPROOTS, new Item.Settings().group(NATURE_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.5f).build()).maxCount(64));

        registerWithItem("weaping_willow", WEAPING_SWAMP_WILLOW, natureGroup);
        registerWithItem("pond_ribbons", SWAMP_RIBBON, natureGroup);

        registerWithItem("redwood_sorrel", REDWOOD_SORREL, natureGroup);
        registerWithItem("crocus", CROCUS, natureGroup);

        registerWithItem("dandelion_puffs", DANDELION_PUFF, natureGroup);
        registerWithItem("lavender", LAVENDER, natureGroup);
        registerWithItem("lavender_sprig", LAVENDER_SPRIG, natureGroup);
        registerWithItem("single_rose", ROSE_SPRIG, natureGroup);
        registerWithItem("black_dahlia", BLACK_DAHLIA, natureGroup);
        registerWithItem("ice_rose", ICE_ROSE, natureGroup);
        registerWithItem("orange_beauty", ORANGE_BEAUTY, natureGroup);

        registerWithItem("panflower", PANFLOWER, natureGroup);
        registerWithItem("honey_cluster", HONEY_CLUSTER, natureGroup);

        //registerWithItem("fern_bush", FERNBUSH, natureGroup);
        //mushrooms
        //registerWithItem("colossal_red_shroom", GIANT_RED, natureGroup);
        //registerWithItem("colossal_brown_shroom", GIANT_BROWN, natureGroup);
        registerWithItem("jungle_cap", JUNGLE_CAP, natureGroup);

        registerWithItem("orange_fern", ORANGE_FERN, natureGroup);

        registerWithItem("sprout", SPROUT, natureGroup);

        registerWithItem("wild_carrot", WILD_CARROT, natureGroup);
        registerWithItem("wild_potato", WILD_POTATO, natureGroup);
        registerWithItem("wild_beet", WILD_BEET, natureGroup);
        registerWithItem("wild_wheat", WILD_WHEAT, natureGroup);
        registerWithItem("morel", MOREL, natureGroup);
        
        registerWithItem("rice_crop", RICE_SEEDLINGS, natureGroup);
        registerWithItem("tomato_bush", TOMATO_BUSH, new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build()).maxCount(64));
        registerWithItem("spicy_berries", SPICY_BERRY_BUSH, new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,600), 1.0f).build()).maxCount(64));
        registerWithItem("bitter_berries", BITTER_BERRY_BUSH, new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build()).maxCount(64));
        registerWithItem("holly", HOLLY_BUSH, new Item.Settings().group(NATURE_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.POISON,400), 1.0f).build()).maxCount(64));

        registerWithItem("maize_crop", MAIZE_CROP, new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build()).maxCount(64));


        registerWithItem("reeds", REED_BLOCK, natureGroup);

        //registerWithItem("driftwood", DRIFT, new Item.Settings().group(NATURE_GROUP).maxCount(64));

        registerWithItem("rocks", ROCK_PILE, natureGroup);
        registerWithItem("snow_rocks", SNOW_ROCK_PILE, natureGroup);
        registerWithItem("redstone_crystal", RED_PILE, natureGroup);
        //registerWithItem("fluorite_crystal", BLUE_PILE, natureGroup);
        //registerWithItem("coin_stack", COIN_STACK, new Item.Settings().group(ARTIFACT_GROUP).rarity(Rarity.UNCOMMON));
        //registerWithItem("power_crystal", GREEN_PILE, natureGroup);
        registerWithItem("snow_bush", SNOW_BUSH, natureGroup);
        //registerWithItem("snow_yam", SNOW_YAM, natureGroup);
        //registerWithItem("winter_root", WINTER_ROOT, natureGroup);

        //registerWithItem("ameranth_crop", AMERANTH_BLOCK, natureGroup);

        MOSSY_VINES.setPlant(MOSSY_VINES_PLANT);
        MOSSY_VINES_PLANT.setStem(MOSSY_VINES);
        registerWithItem("mossy_vines", MOSSY_VINES, natureGroup);
        register("mossy_vines_plant", MOSSY_VINES_PLANT);
        
        DRY_VINES.setPlant(DRY_VINES_PLANT);
        DRY_VINES_PLANT.setStem(DRY_VINES);
        registerWithItem("dry_vines", DRY_VINES, natureGroup);
        register("dry_vines_plant", DRY_VINES_PLANT);
        
        registerWithItem("dry_moss_carpet", DRY_MOSS_CARPET, natureGroup);
        registerWithItem("dry_moss", DRY_MOSS, natureGroup);
        
        registerWithItem("jungle_bush", JUNGLE_BUSH, natureGroup);
        registerWithItem("swamp_bush", SWAMP_BUSH, natureGroup);
        registerWithItem("hedge", HEDGE, natureGroup);
        
        registerWithItem("apple_sapling", APPLE_SAPLING, natureGroup);
        registerWithItem("apple_leaves", APPLE_LEAVES, natureGroup);
        registerWithItem("apple_leaves_empty", APPLE_LEAVES_EMPTY, natureGroup);

        registerWithItem("spider_egg", SPIDER_EGG_BLOCK, natureGroup);
    }
}
