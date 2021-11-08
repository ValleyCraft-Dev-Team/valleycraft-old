package net.linkle.valley.Registry.Initializers;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.linkle.valley.Registry.Blocks.Plants.*;
import net.linkle.valley.Registry.Blocks.Plants.Bushes.*;
import net.linkle.valley.Registry.Blocks.Plants.Cave.*;
import net.linkle.valley.Registry.Blocks.Plants.Crops.AmeranthCropBlock;
import net.linkle.valley.Registry.Blocks.Plants.CactusBlock;
import net.linkle.valley.Registry.Blocks.Plants.Crops.MaizeCropBlock;
import net.linkle.valley.Registry.Blocks.Plants.Crops.RiceCropBlock;
import net.linkle.valley.Registry.Blocks.Plants.Decorative.*;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

import static net.linkle.valley.ValleyMain.MOD_ID;
import static net.linkle.valley.Registry.Initializers.ItemGroups.*;

public class Plants {
    //bushes
    public static final Block BITTER_BERRY_BUSH = new BitterBerryBushBlock(FabricBlockSettings.of(Material.LEAVES).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.GRASS)
            .strength(0,0.1f));

    public static final Block SPICY_BERRY_BUSH = new SpicyBerryBushBlock(FabricBlockSettings.of(Material.LEAVES).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.NETHER_WART)
            .strength(0,0.1f).luminance(5));

    public static final Block TOMATO_BUSH = new TomatoBushBlock(FabricBlockSettings.of(Material.LEAVES).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.GRASS)
            .strength(0,0.1f));

    public static final Block HOLLY_BUSH = new HollyBushBlock(FabricBlockSettings.of(Material.LEAVES).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.GRASS)
            .strength(0,0.1f));

    public static final Block TUMBLE_WEED = new TumbleWeedBlock(FabricBlockSettings.of(Material.LEAVES).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.GRASS)
            .strength(0.4f,0.1f));
    //crops

    public static final Block RICE_SEEDLINGS = new RiceCropBlock(FabricBlockSettings.of(Material.LEAVES).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.GRASS)
            .strength(0,0.1f));

    public static final Block MAIZE_CROP = new MaizeCropBlock(FabricBlockSettings.of(Material.LEAVES).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.GRASS)
            .strength(0,0.1f));

    public static final Block AMERANTH_BLOCK = new AmeranthCropBlock(FabricBlockSettings.of(Material.LEAVES).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.GRASS)
            .strength(0,0.1f));

    public static final Block ROSEBUSH = new RoseBush();
    public static final Block LILACBUSH = new RoseBush();
    public static final Block PEONYBUSH = new RoseBush();
    public static final Block FERNBUSH = new RoseBush();
    public static final Block BUSH = new RoseBush();
    public static final Block MOREL = new MorelBlock();
    public static final Block HERBS = new RoseBush();

    public static final Block HEDGE = new HedgeBushBlock(FabricBlockSettings.of(Material.LEAVES).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.GRASS)
            .strength(0,0.1f));

    public static final Block SMALL_CACTUS = new CactusBlock();

    public static final Block REED_BLOCK = new ReedBlock(FabricBlockSettings.of(Material.LEAVES).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.GRASS)
            .strength(0,0.1f));

    public static final Block WILD_CARROT = new RoseBush();
    public static final Block WILD_POTATO = new RoseBush();
    public static final Block WILD_BEET = new RoseBush();
    public static final Block WILD_WHEAT = new RoseBush();
    public static final Block DANDELION_PUFF = new RoseBush();
    public static final Block REDWOOD_SORREL = new RoseBush();
    public static final Block WEAPING_SWAMP_WILLOW = new RoseBushGlow();
    public static final Block CROCUS = new RoseBush();
    public static final Block TAPROOTS = new RoseBush();

    public static final Block BUSH_ALIVE = new RoseBushTall();
    public static final Block BUSH_ALIVE_TALL = new RoseBushTall();
    public static final Block BUSH_DEAD_TALL = new RoseBushTall();
    public static final Block SNOW_BUSH = new SnowBush();
    public static final Block SNOW_YAM = new SnowBush();
    public static final Block WINTER_ROOT = new SnowBushHidden();

    public static final Block MINER_BUSH = new MinerBushBlock(FabricBlockSettings.of(Material.LEAVES).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.GRASS)
            .strength(0,0.1f));

    public static final Block ROCK_PILE = new RockBlock();
    public static final Block RED_PILE = new RedCrystalBlock(FabricBlockSettings.of(Material.STONE).nonOpaque()
            .breakByHand(false).breakByTool(FabricToolTags.PICKAXES)
            .sounds(BlockSoundGroup.AMETHYST_CLUSTER)
            .strength(1.0f,2.0f).luminance(7));

    public static final Block BLUE_PILE = new BlueCrystalBlock(FabricBlockSettings.of(Material.STONE).nonOpaque()
            .breakByHand(false).breakByTool(FabricToolTags.PICKAXES)
            .sounds(BlockSoundGroup.AMETHYST_CLUSTER)
            .strength(1.0f,2.0f).luminance(13));

    public static final Block COIN_STACK = new CoinStackBlock(FabricBlockSettings.of(Material.METAL).nonOpaque()
            .breakByHand(false).breakByTool(FabricToolTags.PICKAXES)
            .sounds(BlockSoundGroup.CHAIN).breakInstantly()
            .strength(1.0f,2.0f));

    //public static final Block GREEN_PILE = new BlueCrystalBlock(FabricBlockSettings.of(Material.STONE).nonOpaque()
            //.breakByHand(false).breakByTool(FabricToolTags.PICKAXES)
            //.sounds(BlockSoundGroup.AMETHYST_CLUSTER)
            //.strength(3.5f,2.0f).luminance(7));

    public static final Block SNOW_ROCK_PILE = new RockBlock();

    public static final Block ONION = new OnionBushBlock(FabricBlockSettings.of(Material.LEAVES).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.GRASS)
            .strength(0,0.1f));

    public static final MossVinesBlock MOSSY_VINE = new MossVinesBlock(FabricBlockSettings.of(Material.PLANT, MapColor.GREEN).ticksRandomly().noCollision().breakInstantly().sounds(BlockSoundGroup.WEEPING_VINES));
    public static final Block MOSSY_VINE_PLANT = new MossVinesPlantBlock(FabricBlockSettings.of(Material.PLANT, MapColor.GREEN).noCollision().breakInstantly().sounds(BlockSoundGroup.WEEPING_VINES));
    public static final Block JUNGLE_BUSH = new JungleBushBlock(FabricBlockSettings.of(Material.LEAVES).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.GRASS)
            .strength(0,0.1f));

    public static final Block SWAMP_BUSH = new RoseBush();
    public static final Block JUNGLE_CAP = new RoseBush();
    public static final Block SPROUT = new RoseBush();

    public static final Block SWAMP_RIBBON = new RoseBush();
    public static final Block BLACK_DAHLIA = new RoseBush();
    public static final Block LAVENDER = new RoseBush();
    public static final Block LAVENDER_SPRIG = new RoseBush();
    public static final Block ROSE_SPRIG = new RoseBush();
    public static final Block ICE_ROSE = new RoseBush();
    public static final Block ORANGE_FERN = new RoseBush();
    public static final Block ORANGE_BEAUTY = new RoseBush();

    public static final SaplingBlock APPLE_SAPLING = new SaplingBlock(new AppleSaplingGen());
    public static final Block APPLE_LEAVES = new AppleLeavesBlock();
    public static final Block APPLE_LEAVES_EMPTY = new AppleLeavesBlock();

    public static final Block GIANT_RED = new GiantShroomBlock(FabricBlockSettings.of(Material.LEAVES).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.WOOD)
            .strength(0.4f,0.1f));

    public static final Block GIANT_BROWN = new GiantShroomBlock(FabricBlockSettings.of(Material.LEAVES).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.GRASS)
            .strength(0.4f,0.1f));

    public static final Block SPIDER_EGG_BLOCK = new SpiderEggBlock(FabricBlockSettings.of(Material.LEAVES)
            .breakByHand(true).nonOpaque().luminance(3)
            .sounds(BlockSoundGroup.WOOL).breakInstantly()
            .strength(0.0f,0.1f));

    public static void initialize() {

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "small_cactus"), SMALL_CACTUS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "small_cactus"), new BlockItem(SMALL_CACTUS, new Item.Settings().group(NATURE_GROUP)));
        //bushes
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "rose_bush"), ROSEBUSH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rose_bush"), new BlockItem(ROSEBUSH, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "lilac_bush"), LILACBUSH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "lilac_bush"), new BlockItem(LILACBUSH, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "peony_bush"), PEONYBUSH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "peony_bush"), new BlockItem(PEONYBUSH, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "bush"), BUSH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bush"), new BlockItem(BUSH, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "alive_bush"), BUSH_ALIVE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "alive_bush"), new BlockItem(BUSH_ALIVE, new Item.Settings().group(NATURE_GROUP)));
        //Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "alive_bush_tall"), BUSH_ALIVE_TALL);
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "alive_bush_tall"), new BlockItem(BUSH_ALIVE_TALL, new Item.Settings().group(NATURE_GROUP)));
        //Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "dead_bush_tall"), BUSH_DEAD_TALL);
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dead_bush_tall"), new BlockItem(BUSH_DEAD_TALL, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "herbs"), HERBS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "herbs"), new BlockItem(HERBS, new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.5f).build()).maxCount(64)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "taproots"), TAPROOTS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "taproots"), new BlockItem(TAPROOTS, new Item.Settings().group(NATURE_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.5f).build()).maxCount(64)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "weaping_willow"), WEAPING_SWAMP_WILLOW);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "weaping_willow"), new BlockItem(WEAPING_SWAMP_WILLOW, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "pond_ribbons"), SWAMP_RIBBON);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pond_ribbons"), new BlockItem(SWAMP_RIBBON, new Item.Settings().group(NATURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "redwood_sorrel"), REDWOOD_SORREL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "redwood_sorrel"), new BlockItem(REDWOOD_SORREL, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "crocus"), CROCUS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "crocus"), new BlockItem(CROCUS, new Item.Settings().group(NATURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "dandelion_puffs"), DANDELION_PUFF);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dandelion_puffs"), new BlockItem(DANDELION_PUFF, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "lavender"), LAVENDER);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "lavender"), new BlockItem(LAVENDER, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "lavender_sprig"), LAVENDER_SPRIG);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "lavender_sprig"), new BlockItem(LAVENDER_SPRIG, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "single_rose"), ROSE_SPRIG);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "single_rose"), new BlockItem(ROSE_SPRIG, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "black_dahlia"), BLACK_DAHLIA);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "black_dahlia"), new BlockItem(BLACK_DAHLIA, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "ice_rose"), ICE_ROSE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ice_rose"), new BlockItem(ICE_ROSE, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "orange_beauty"), ORANGE_BEAUTY);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "orange_beauty"), new BlockItem(ORANGE_BEAUTY, new Item.Settings().group(NATURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "fern_bush"), FERNBUSH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fern_bush"), new BlockItem(FERNBUSH, new Item.Settings().group(NATURE_GROUP)));
        //mushrooms
        //Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "colossal_red_shroom"), GIANT_RED);
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "colossal_red_shroom"), new BlockItem(GIANT_RED, new Item.Settings().group(NATURE_GROUP)));
        //Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "colossal_brown_shroom"), GIANT_BROWN);
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "colossal_brown_shroom"), new BlockItem(GIANT_BROWN, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "jungle_cap"), JUNGLE_CAP);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "jungle_cap"), new BlockItem(JUNGLE_CAP, new Item.Settings().group(NATURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "orange_fern"), ORANGE_FERN);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "orange_fern"), new BlockItem(ORANGE_FERN, new Item.Settings().group(NATURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "sprout"), SPROUT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "sprout"), new BlockItem(SPROUT, new Item.Settings().group(NATURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "wild_carrot"), WILD_CARROT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "wild_carrot"), new BlockItem(WILD_CARROT, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "wild_potato"), WILD_POTATO);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "wild_potato"), new BlockItem(WILD_POTATO, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "wild_beet"), WILD_BEET);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "wild_beet"), new BlockItem(WILD_BEET, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "wild_wheat"), WILD_WHEAT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "wild_wheat"), new BlockItem(WILD_WHEAT, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "morel"), MOREL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "morel"), new BlockItem(MOREL, new Item.Settings().group(NATURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "rice_crop"), RICE_SEEDLINGS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rice_crop"), new BlockItem(RICE_SEEDLINGS, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "tomato_bush"), TOMATO_BUSH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "tomato_bush"), new BlockItem(TOMATO_BUSH, new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build()).maxCount(64)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "spicy_berries"), SPICY_BERRY_BUSH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "spicy_berries"), new BlockItem(SPICY_BERRY_BUSH, new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,600), 1.0f).build()).maxCount(64)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "bitter_berries"), BITTER_BERRY_BUSH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bitter_berries"), new BlockItem(BITTER_BERRY_BUSH, new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.POISON,200), 1.0f).build()).maxCount(64)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "holly"), HOLLY_BUSH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "holly"), new BlockItem(HOLLY_BUSH, new Item.Settings().group(NATURE_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.POISON,400), 1.0f).build()).maxCount(64)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "maize_crop"), MAIZE_CROP);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "maize_crop"), new BlockItem(MAIZE_CROP, new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build()).maxCount(64)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "tumbleweed"), TUMBLE_WEED);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "tumbleweed"), new BlockItem(TUMBLE_WEED, new Item.Settings().group(NATURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "reeds"), REED_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "reeds"), new BlockItem(REED_BLOCK, new Item.Settings().group(NATURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "rocks"), ROCK_PILE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rocks"), new BlockItem(ROCK_PILE, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "snow_rocks"), SNOW_ROCK_PILE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "snow_rocks"), new BlockItem(SNOW_ROCK_PILE, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "redstone_crystal"), RED_PILE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "redstone_crystal"), new BlockItem(RED_PILE, new Item.Settings().group(NATURE_GROUP)));
        //Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "fluorite_crystal"), BLUE_PILE);
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fluorite_crystal"), new BlockItem(BLUE_PILE, new Item.Settings().group(NATURE_GROUP)));
        //Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "coin_stack"), COIN_STACK);
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "coin_stack"), new BlockItem(COIN_STACK, new Item.Settings().group(ARTIFACT_GROUP).rarity(Rarity.UNCOMMON)));
        //Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "power_crystal"), GREEN_PILE);
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "power_crystal"), new BlockItem(GREEN_PILE, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "snow_bush"), SNOW_BUSH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "snow_bush"), new BlockItem(SNOW_BUSH, new Item.Settings().group(NATURE_GROUP)));
        //Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "snow_yam"), SNOW_YAM);
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "snow_yam"), new BlockItem(SNOW_YAM, new Item.Settings().group(NATURE_GROUP)));
        //Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "winter_root"), WINTER_ROOT);
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "winter_root"), new BlockItem(WINTER_ROOT, new Item.Settings().group(NATURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "miners_lettuce"), MINER_BUSH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "miners_lettuce"), new BlockItem(MINER_BUSH, new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build()).maxCount(64)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "onion"), ONION);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "onion"), new BlockItem(ONION, new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build()).maxCount(64)));
        //Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "ameranth_crop"), AMERANTH_BLOCK);
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ameranth_crop"), new BlockItem(AMERANTH_BLOCK, new Item.Settings().group(NATURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "mossy_vines"), MOSSY_VINE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "mossy_vines"), new BlockItem(MOSSY_VINE, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "mossy_vines_plant"), MOSSY_VINE_PLANT);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "jungle_bush"), JUNGLE_BUSH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "jungle_bush"), new BlockItem(JUNGLE_BUSH, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "swamp_bush"), SWAMP_BUSH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "swamp_bush"), new BlockItem(SWAMP_BUSH, new Item.Settings().group(NATURE_GROUP)));
        //Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "hedge"), HEDGE);
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hedge"), new BlockItem(HEDGE, new Item.Settings().group(NATURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "apple_sapling"),  APPLE_SAPLING);
        Registry.register(Registry.ITEM,  new Identifier(MOD_ID, "apple_sapling"),  new BlockItem(APPLE_SAPLING, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "apple_leaves"), APPLE_LEAVES);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "apple_leaves"), new BlockItem(APPLE_LEAVES, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "apple_leaves_empty"), APPLE_LEAVES_EMPTY);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "apple_leaves_empty"), new BlockItem(APPLE_LEAVES_EMPTY, new Item.Settings().group(NATURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "spider_egg"), SPIDER_EGG_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "spider_egg"), new BlockItem(SPIDER_EGG_BLOCK, new Item.Settings().group(NATURE_GROUP)));
    }
}
