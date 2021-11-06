package net.linkle.valley.Registry.Initializers;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.linkle.valley.Registry.Blocks.Decorations.*;
import net.linkle.valley.Registry.Blocks.Plants.Hanging.HangingBlock;
import net.linkle.valley.Registry.Blocks.Plants.Hanging.HangingCrystalAltBlock;
import net.linkle.valley.Registry.Blocks.Plants.Hanging.HangingCrystalBlock;
import net.linkle.valley.Registry.Blocks.Plants.Hanging.HangingRedstoneCrystalBlock;
import net.linkle.valley.Registry.Blocks.Plants.Stumps.BrownStumpBlock;
import net.linkle.valley.Registry.Blocks.Plants.Stumps.MorelStumpBlock;
import net.linkle.valley.Registry.Blocks.Plants.Stumps.RedStumpBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

import static net.linkle.valley.Registry.Initializers.ItemGroups.*;
import static net.linkle.valley.Registry.Initializers.ItemGroups.COOKING_GROUP;
import static net.linkle.valley.ValleyMain.MOD_ID;

public class Furniture {
    public static final Block TABLE_OAK = new TableBlock();
    public static final Block TABLE_DARK = new TableBlock();
    public static final Block TABLE_SPRUCE = new TableBlock();
    public static final Block TABLE_JUNGLE = new TableBlock();
    public static final Block TABLE_ACACIA = new TableBlock();
    public static final Block TABLE_BIRCH = new TableBlock();
    public static final Block TABLE_WARPED = new TableBlock();
    public static final Block TABLE_CRIMSON = new TableBlock();
    public static final Block TABLE_STONE = new TableBlock();
    public static final Block TABLE_PLAID = new TableBlock();

    public static final Block STOOL_OAK = new StoolBlock();
    public static final Block STOOL_DARK = new StoolBlock();
    public static final Block STOOL_SPRUCE = new StoolBlock();
    public static final Block STOOL_JUNGLE = new StoolBlock();
    public static final Block STOOL_ACACIA = new StoolBlock();
    public static final Block STOOL_BIRCH = new StoolBlock();
    public static final Block STOOL_WARPED = new StoolBlock();
    public static final Block STOOL_CRIMSON = new StoolBlock();
    public static final Block STOOL_STONE = new StoolBlock();
    public static final Block STOOL_PLAID = new StoolBlock();

    public static final Block CHAIR_STONE = new StoolBlock();

    public static final Block IRON_LADDER = new IronLadderBlock();
    public static final Block BAMBOO_LADDER = new LadderBlock();
    public static final Block OAK_LADDER = new LadderBlock();
    public static final Block BIRCH_LADDER = new LadderBlock();
    public static final Block ACACIA_LADDER = new LadderBlock();
    public static final Block SPRUCE_LADDER = new LadderBlock();
    public static final Block DARK_LADDER = new LadderBlock();
    public static final Block JUNGLE_LADDER = new LadderBlock();
    public static final Block CRIMSON_LADDER = new LadderBlock();
    public static final Block WARPED_LADDER = new LadderBlock();

    public static final Block SCARE = new StatueBlock();
    public static final Block SCARE_HAT = new StatueBlock();

    public static final Block SCARE_GLOW = new StatueGlowBlock();
    public static final Block SCARE_HAT_GLOW = new StatueGlowBlock();

    public static final Block SCARE_SOUL = new StatueGlowBlock();
    public static final Block SCARE_HAT_SOUL = new StatueGlowBlock();

    public static final Block SCARE_TARGET = new StatueBlock();
    public static final Block RARE_MELON = new StatueBlock();
    public static final Block RARE_ZOMBIE = new StatueBlock();
    public static final Block RARE_SKELETON = new StatueBlock();

    public static final Block SCARE_COPPER = new StatueGlowBlock();
    public static final Block SCARE_HAT_COPPER = new StatueGlowBlock();

    public static final Block SNOW = new SnowmanBlock();

    public static final Block ROPE_BRIDGE = new RopeBridgeBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.WOOD)
            .strength(1.0f,1f));

    public static final Block ROPE_BRIDGE_ANCHOR = new RopeNoColBridgeBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.WOOD)
            .strength(1.0f,1f));

    public static final Block SMOOTH_STONE_BRICK = new PolishedStoneBlock();
    public static final Block SMOOTH_STONE_TILE = new PolishedStoneBlock();
    public static final Block SMOOTH_STONE_TILE_SLAB = new TileSlabBlock();
    public static final Block SMOOTH_STONE_TILE_STAIRS = new TileStairsBlock();

    public static final Block COBBLE_BRICK = new PolishedStoneBlock();
    public static final Block COBBLE_MOSSY = new PolishedStoneBlock();
    public static final Block COBBLE_SLAB = new TileSlabBlock();
    public static final Block COBBLE_STAIRS = new TileStairsBlock();

    public static final Block NET = new NetBlock();
    public static final Block B_BRICKS = new BrownBlock();
    public static final Block B_CRACKED = new BrownCrackedBlock();
    public static final Block B_MOSSY = new BrownMossyBlock();
    public static final Block B_STAIRS = new BrownStairsBlock();
    public static final Block B_SLAB = new BrownSlabBlock();
    public static final Block SCREEN = new ScreenBlock();
    public static final Block BRAZIER = new BrazierBlock();
    public static final Block SOUL_BRAZIER = new BrazierBlock();
    public static final Block COPPER_BRAZIER = new BrazierBlock();
    public static final Block BLAZE_BRAZIER = new BrazierBlock();

    public static final Block C_BRICKS = new BrownBlock();
    public static final Block C_CHISELED = new BrownBlock();
    public static final Block C_STAIRS = new BrownStairsBlock();
    public static final Block C_SLAB = new BrownSlabBlock();
    public static final Block C_MOSSY = new BrownBlock();
    public static final Block C_CRACK = new BrownBlock();
    public static final Block C_SMOOTH = new BrownBlock();

    public static final Block ANCHOR = new AnchorBlock();

    public static final Block CHARCOAL_BLOCK = new CharcoalBlock(FabricBlockSettings.of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES)
            .breakByHand(false)
            .sounds(BlockSoundGroup.STONE)
            .strength(1, 2.0f));

    public static final Block FIBER_BALE = new BaleBlock(FabricBlockSettings.of(Material.STONE)
            .breakByTool(FabricToolTags.HOES)
            .breakByHand(true)
            .sounds(BlockSoundGroup.GRASS)
            .strength(1, 1.0f));

    public static final Block AMERANTH_BALE = new BaleBlock(FabricBlockSettings.of(Material.STONE)
            .breakByTool(FabricToolTags.HOES)
            .breakByHand(true)
            .sounds(BlockSoundGroup.GRASS)
            .strength(1, 1.0f));

    public static final Block SEAWEED_BALE = new BaleBlock(FabricBlockSettings.of(Material.STONE)
            .breakByTool(FabricToolTags.HOES)
            .breakByHand(true)
            .sounds(BlockSoundGroup.GRASS)
            .strength(1, 1.0f));

    //rope
    public static final Block CLIMBABLE_ROPE = new ClimbableRopeBlock(FabricBlockSettings.of(Material.NETHER_WOOD).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.NETHER_STEM)
            .strength(0,0.1f));

    //chain
    public static final Block CHAIN_C = new ClimbableChainBlock(FabricBlockSettings.of(Material.NETHER_WOOD).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.CHAIN)
            .strength(1,1.1f));
    public static final Block CHAIN_G = new ClimbableChainBlock(FabricBlockSettings.of(Material.NETHER_WOOD).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.CHAIN)
            .strength(1,1.1f));
    public static final Block CHAIN_N = new ClimbableChainBlock(FabricBlockSettings.of(Material.NETHER_WOOD).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.CHAIN)
            .strength(1,1.1f));

    //lantern

    public static final Block REDSTONE_LANTERN = new RedLanternBlock(FabricBlockSettings.of(Material.METAL).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.CHAIN)
            .strength(1.0f,0.8f).luminance(7));

    public static final Block BEVELED_PANE = new BeveledGlassBlock();
    public static final Block BEVELED_PANE_COPPER = new BeveledGlassBlock();
    public static final Block BEVELED_PANE_GOLD = new BeveledGlassBlock();
    public static final Block BEVELED_PANE_NETHERITE = new BeveledGlassBlock();

    public static final Block BEVELED_PANE_A = new BeveledGlassBlock();
    public static final Block BEVELED_PANE_A_C = new BeveledGlassBlock();
    public static final Block BEVELED_PANE_A_G = new BeveledGlassBlock();
    public static final Block BEVELED_PANE_A_N = new BeveledGlassBlock();

    public static final Block MUG_BLOCK = new DishBlock();
    public static final Block JAR_BLOCK = new DishBlock();
    public static final Block BENTO_BLOCK = new BentoBlock();
    public static final Block BOWL_BLOCK = new BowlBlock();
    public static final Block STEW_POT = new StewPotBlock();
    public static final Block STEW_POT_CAMPFIRE = new StewPotCampfireBlock();
    public static final Block SMALL_MUG_BLOCK = new DishBlock();
    public static final Block GOBLET_BLOCK = new DishBlock();

    public static final Block SPIKE_WALL_BLOCK = new SpikeTrapBlock(FabricBlockSettings.of(Material.WOOD)
            .breakByTool(FabricToolTags.AXES)
            .breakByHand(true)
            .sounds(BlockSoundGroup.WOOD)
            .strength(1.5f, 1.5f));

    public static final Block ROUNDED_BARREL = new RoundedBarrelBlock();
    public static final Block SOUL_JACK = new JackBlock();
    public static final Block COPPER_JACK = new JackBlock();
    public static final Block VOLCANIC_STONE_SMOOTH = new SaltOreBlock();

    public static final Block LANTERN_HANGING = new LanternBlock();
    public static final Block SOUL_HANGING = new LanternBlock();
    public static final Block FAIRY_HANGING = new LanternBlock();
    public static final Block RED_HANGING = new RedstoneHangingLanternBlock();

    public static final Block CHIMNEY_COBBLE = new ChimneyBlock(FabricBlockSettings.of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES)
            .breakByHand(false)
            .sounds(BlockSoundGroup.STONE)
            .strength(1, 2.0f));

    public static final Block HANGING = new HangingBlock();
    public static final Block CRYSTAL = new CrystalBlock();
    public static final Block CRYSTAL_FROZEN = new CrystalBlockFrozen();

    public static final Block BOOK_COBWEB = new BookshelfBlock();
    public static final Block EMPTY_SHELF = new BookshelfBlock();
    public static final Block EMPTY_COBWEB = new BookshelfBlock();
    public static final Block LANTERN_SHELF = new BookshelfBlockGlow();
    public static final Block LANTERN_COBWEB = new BookshelfBlockGlow();
    public static final Block DISH_SHELF = new BookshelfBlock();
    public static final Block DISH_COBWEB = new BookshelfBlock();
    public static final Block POTION_SHELF = new BookshelfBlock();
    public static final Block POTION_COBWEB = new BookshelfBlock();
    public static final Block ANTHRO_SHELF = new BookshelfBlock();
    public static final Block ANTHRO_COBWEB  = new BookshelfBlock();

    public static final Block STUMP_MOREL  = new MorelStumpBlock();
    public static final Block STUMP_RED  = new RedStumpBlock();
    public static final Block STUMP_BROWN  = new BrownStumpBlock();

    public static final Block HANGING_R = new HangingRedstoneCrystalBlock();
    public static final Block HANGING_F = new HangingCrystalBlock();
    public static final Block HANGING_D = new HangingCrystalAltBlock();
    public static final Block HANGING_E = new HangingCrystalAltBlock();
    public static final Block HANGING_A = new HangingCrystalAltBlock();
    public static final Block HANGING_G = new HangingCrystalBlock();

    public static final Block KEG = new KegBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.WOOD)
            .strength(1.0f, 1.0f));

    public static final Block PET_BED = new PetBedBlock();
    public static final Block WREATH = new WreathBlock();
    public static final Block CREST = new CrestBlock();
    public static final Block GEAR = new GearBlock();

    public static final Block BRAZIER_METAL = new BrazierMetalBlock();

    public static void initialize() {
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "table_oak"), TABLE_OAK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "table_oak"), new BlockItem(TABLE_OAK, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "table_stone"), TABLE_STONE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "table_stone"), new BlockItem(TABLE_STONE, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "table_plaid"), TABLE_PLAID);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "table_plaid"), new BlockItem(TABLE_PLAID, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "table_birch"), TABLE_BIRCH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "table_birch"), new BlockItem(TABLE_BIRCH, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "table_spruce"), TABLE_SPRUCE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "table_spruce"), new BlockItem(TABLE_SPRUCE, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "table_jungle"), TABLE_JUNGLE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "table_jungle"), new BlockItem(TABLE_JUNGLE, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "table_acacia"), TABLE_ACACIA);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "table_acacia"), new BlockItem(TABLE_ACACIA, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "table_dark_oak"), TABLE_DARK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "table_dark_oak"), new BlockItem(TABLE_DARK, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "table_warped"), TABLE_WARPED);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "table_warped"), new BlockItem(TABLE_WARPED, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "table_crimson"), TABLE_CRIMSON);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "table_crimson"), new BlockItem(TABLE_CRIMSON, new Item.Settings().group(FURNITURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stool_oak"), STOOL_OAK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stool_oak"), new BlockItem(STOOL_OAK, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stool_stone"), STOOL_STONE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stool_stone"), new BlockItem(STOOL_STONE, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stool_plaid"), STOOL_PLAID);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stool_plaid"), new BlockItem(STOOL_PLAID, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stool_birch"), STOOL_BIRCH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stool_birch"), new BlockItem(STOOL_BIRCH, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stool_spruce"), STOOL_SPRUCE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stool_spruce"), new BlockItem(STOOL_SPRUCE, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stool_jungle"), STOOL_JUNGLE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stool_jungle"), new BlockItem(STOOL_JUNGLE, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stool_acacia"), STOOL_ACACIA);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stool_acacia"), new BlockItem(STOOL_ACACIA, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stool_dark_oak"), STOOL_DARK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stool_dark_oak"), new BlockItem(STOOL_DARK, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stool_warped"), STOOL_WARPED);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stool_warped"), new BlockItem(STOOL_WARPED, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stool_crimson"), STOOL_CRIMSON);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stool_crimson"), new BlockItem(STOOL_CRIMSON, new Item.Settings().group(FURNITURE_GROUP)));

        //Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "chair_stone"), CHAIR_STONE);
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "chair_stone"), new BlockItem(CHAIR_STONE, new Item.Settings().group(FURNITURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "iron_ladder"), IRON_LADDER);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "iron_ladder"), new BlockItem(IRON_LADDER, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "bamboo_ladder"), BAMBOO_LADDER);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bamboo_ladder"), new BlockItem(BAMBOO_LADDER, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "ladder_oak"), OAK_LADDER);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ladder_oak"), new BlockItem(OAK_LADDER, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "ladder_birch"),  BIRCH_LADDER);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ladder_birch"), new BlockItem(BIRCH_LADDER, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "ladder_spruce"), SPRUCE_LADDER);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ladder_spruce"), new BlockItem(SPRUCE_LADDER, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "ladder_jungle"), JUNGLE_LADDER);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ladder_jungle"), new BlockItem(JUNGLE_LADDER, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "ladder_acacia"), ACACIA_LADDER);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ladder_acacia"), new BlockItem(ACACIA_LADDER, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "ladder_dark"), DARK_LADDER);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ladder_dark"), new BlockItem(DARK_LADDER, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "ladder_warped"), WARPED_LADDER);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ladder_warped"), new BlockItem(WARPED_LADDER, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "ladder_crimson"), CRIMSON_LADDER);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ladder_crimson"), new BlockItem(CRIMSON_LADDER, new Item.Settings().group(FURNITURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "scarecrow"), SCARE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "scarecrow"), new BlockItem(SCARE, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "scarecrow_target"), SCARE_TARGET);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "scarecrow_target"), new BlockItem(SCARE_TARGET, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "scarecrow_hat"), SCARE_HAT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "scarecrow_hat"), new BlockItem(SCARE_HAT, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "scarecrow_glow"), SCARE_GLOW);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "scarecrow_glow"), new BlockItem(SCARE_GLOW, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "scarecrow_hat_glow"), SCARE_HAT_GLOW);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "scarecrow_hat_glow"), new BlockItem(SCARE_HAT_GLOW, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "scarecrow_soul"), SCARE_SOUL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "scarecrow_soul"), new BlockItem(SCARE_SOUL, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "scarecrow_hat_soul"), SCARE_HAT_SOUL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "scarecrow_hat_soul"), new BlockItem(SCARE_HAT_SOUL, new Item.Settings().group(FURNITURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "scarecrow_copper"), SCARE_COPPER);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "scarecrow_copper"), new BlockItem(SCARE_COPPER, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "scarecrow_hat_copper"), SCARE_HAT_COPPER);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "scarecrow_hat_copper"), new BlockItem(SCARE_HAT_COPPER, new Item.Settings().group(FURNITURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "rarecrow_melon"), RARE_MELON);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rarecrow_melon"), new BlockItem(RARE_MELON, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "rarecrow_zombie"), RARE_ZOMBIE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rarecrow_zombie"), new BlockItem(RARE_ZOMBIE, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "rarecrow_skeleton"), RARE_SKELETON);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rarecrow_skeleton"), new BlockItem(RARE_SKELETON, new Item.Settings().group(FURNITURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "snow"), SNOW);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "snow"), new BlockItem(SNOW, new Item.Settings().group(FURNITURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "spike_wall_block"), SPIKE_WALL_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "spike_wall_block"), new BlockItem(SPIKE_WALL_BLOCK, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "brazier"), BRAZIER);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "brazier"), new BlockItem(BRAZIER, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "brazier_soul"), SOUL_BRAZIER);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "brazier_soul"), new BlockItem(SOUL_BRAZIER, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "brazier_copper"), COPPER_BRAZIER);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "brazier_copper"), new BlockItem(COPPER_BRAZIER, new Item.Settings().group(FURNITURE_GROUP)));
        //Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "brazier_metal"), BRAZIER_METAL);
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "brazier_metal"), new BlockItem(BRAZIER_METAL, new Item.Settings().group(FURNITURE_GROUP)));
        //Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "blaze_brazier"), BLAZE_BRAZIER);
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "blaze_brazier"), new BlockItem(BLAZE_BRAZIER, new Item.Settings().group(FURNITURE_GROUP)));


        //Crock Pots *coming soonTM*
        //Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "campfire_pot"), CAMPFIRE_POT);
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "campfire_pot"), new BlockItem(CAMPFIRE_POT, new Item.Settings().group(EXPLORATION_GROUP)));
        //Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "soul_campfire_pot"), SOUL_CAMPFIRE_POT);
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "soul_campfire_pot"), new BlockItem(SOUL_CAMPFIRE_POT, new Item.Settings().group(EXPLORATION_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "screen"), SCREEN);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "screen"), new BlockItem(SCREEN, new Item.Settings().group(FURNITURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "charcoal_block"), CHARCOAL_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "charcoal_block"), new BlockItem(CHARCOAL_BLOCK, new Item.Settings().group(FURNITURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "seaweed_block"), SEAWEED_BALE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "seaweed_block"), new BlockItem(SEAWEED_BALE, new Item.Settings().group(FURNITURE_GROUP)));
        //Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "ameranth_block"), AMERANTH_BALE);
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ameranth_block"), new BlockItem(AMERANTH_BALE, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "fiber_block"), FIBER_BALE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fiber_block"), new BlockItem(FIBER_BALE, new Item.Settings().group(FURNITURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "climbable_rope"), CLIMBABLE_ROPE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "climbable_rope"), new BlockItem(CLIMBABLE_ROPE, new Item.Settings().group(EXPLORATION_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "copper_chain"), CHAIN_C);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "copper_chain"), new BlockItem(CHAIN_C, new Item.Settings().group(EXPLORATION_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "golden_chain"), CHAIN_G);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "golden_chain"), new BlockItem(CHAIN_G, new Item.Settings().group(EXPLORATION_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "netherite_chain"), CHAIN_N);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "netherite_chain"), new BlockItem(CHAIN_N, new Item.Settings().group(EXPLORATION_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "brown_bricks"), B_BRICKS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "brown_bricks"), new BlockItem(B_BRICKS, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "brown_cracked_bricks"), B_CRACKED);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "brown_cracked_bricks"), new BlockItem(B_CRACKED, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "brown_mossy_bricks"), B_MOSSY);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "brown_mossy_bricks"), new BlockItem(B_MOSSY, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "brown_brick_slab"), B_SLAB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "brown_brick_slab"), new BlockItem(B_SLAB, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "brown_brick_stairs"), B_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "brown_brick_stairs"), new BlockItem(B_STAIRS, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "smooth_stone"), SMOOTH_STONE_BRICK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "smooth_stone"), new BlockItem(SMOOTH_STONE_BRICK, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stone_tiles"), SMOOTH_STONE_TILE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_tiles"), new BlockItem(SMOOTH_STONE_TILE, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stone_tile_slab"), SMOOTH_STONE_TILE_SLAB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_tile_slab"), new BlockItem(SMOOTH_STONE_TILE_SLAB, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stone_tile_stairs"), SMOOTH_STONE_TILE_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_tile_stairs"), new BlockItem(SMOOTH_STONE_TILE_STAIRS, new Item.Settings().group(FURNITURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "cobblestone_brick"), COBBLE_BRICK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cobblestone_brick"), new BlockItem(COBBLE_BRICK, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "cobblestone_mossy_brick"), COBBLE_MOSSY);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cobblestone_mossy_brick"), new BlockItem(COBBLE_MOSSY, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "cobblestone_brick_slab"), COBBLE_SLAB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cobblestone_brick_slab"), new BlockItem(COBBLE_SLAB, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "cobblestone_brick_stairs"), COBBLE_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cobblestone_brick_stairs"), new BlockItem(COBBLE_STAIRS, new Item.Settings().group(FURNITURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "carmine_bricks"), C_BRICKS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "carmine_bricks"), new BlockItem(C_BRICKS, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "carmine_slab"), C_SLAB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "carmine_slab"), new BlockItem(C_SLAB, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "carmine_stairs"), C_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "carmine_stairs"), new BlockItem(C_STAIRS, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "chiseled_carmine"), C_CHISELED);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "chiseled_carmine"), new BlockItem(C_CHISELED, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "carmine_cracked"), C_CRACK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "carmine_cracked"), new BlockItem(C_CRACK, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "carmine_mossy"), C_MOSSY);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "carmine_mossy"), new BlockItem(C_MOSSY, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "carmine_smooth"), C_SMOOTH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "carmine_smooth"), new BlockItem(C_SMOOTH, new Item.Settings().group(FURNITURE_GROUP)));

        //Lanterns & Torches
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "redstone_lantern"), REDSTONE_LANTERN);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "redstone_lantern"), new BlockItem(REDSTONE_LANTERN, new Item.Settings().group(FURNITURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "mug_block"), MUG_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "mug_block"), new BlockItem(MUG_BLOCK, new Item.Settings().group(COOKING_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "small_mug_block"), SMALL_MUG_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "small_mug_block"), new BlockItem(SMALL_MUG_BLOCK, new Item.Settings().group(COOKING_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "goblet"), GOBLET_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "goblet"), new BlockItem(GOBLET_BLOCK, new Item.Settings().group(FURNITURE_GROUP).rarity(Rarity.RARE)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "bowl_block"), BOWL_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bowl_block"), new BlockItem(BOWL_BLOCK, new Item.Settings().group(COOKING_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "bento_block"), BENTO_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bento_block"), new BlockItem(BENTO_BLOCK, new Item.Settings().group(COOKING_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stew_pot"), STEW_POT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stew_pot"), new BlockItem(STEW_POT, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stew_campfire_pot"), STEW_POT_CAMPFIRE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stew_campfire_pot"), new BlockItem(STEW_POT_CAMPFIRE, new Item.Settings().group(FURNITURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "anchor"), ANCHOR);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "anchor"), new BlockItem(ANCHOR, new Item.Settings().group(FURNITURE_GROUP).rarity(Rarity.RARE)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "beveled_glass"), BEVELED_PANE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "beveled_glass"), new BlockItem(BEVELED_PANE, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "beveled_glass_copper"), BEVELED_PANE_COPPER);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "beveled_glass_copper"), new BlockItem(BEVELED_PANE_COPPER, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "beveled_glass_gold"), BEVELED_PANE_GOLD);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "beveled_glass_gold"), new BlockItem(BEVELED_PANE_GOLD, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "beveled_glass_netherite"), BEVELED_PANE_NETHERITE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "beveled_glass_netherite"), new BlockItem(BEVELED_PANE_NETHERITE, new Item.Settings().group(FURNITURE_GROUP)));
        //amethyst
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "beveled_glass_amethyst"), BEVELED_PANE_A);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "beveled_glass_amethyst"), new BlockItem(BEVELED_PANE_A, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "beveled_glass_amethyst_copper"), BEVELED_PANE_A_C);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "beveled_glass_amethyst_copper"), new BlockItem(BEVELED_PANE_A_C, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "beveled_glass_amethyst_gold"), BEVELED_PANE_A_G);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "beveled_glass_amethyst_gold"), new BlockItem(BEVELED_PANE_A_G, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "beveled_glass_amethyst_netherite"), BEVELED_PANE_A_N);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "beveled_glass_amethyst_netherite"), new BlockItem(BEVELED_PANE_A_N, new Item.Settings().group(FURNITURE_GROUP)));

        //Fuels
        //same as Coal Block
        FuelRegistry.INSTANCE.add(CHARCOAL_BLOCK, 16000);

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "rope_bridge"), ROPE_BRIDGE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rope_bridge"), new BlockItem(ROPE_BRIDGE, new Item.Settings().group(EXPLORATION_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "rope_bridge_anchor"), ROPE_BRIDGE_ANCHOR);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rope_bridge_anchor"), new BlockItem(ROPE_BRIDGE_ANCHOR, new Item.Settings().group(EXPLORATION_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "net_block"), NET);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "net_block"), new BlockItem(NET, new Item.Settings().group(EXPLORATION_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "lantern_hanging"), LANTERN_HANGING);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "lantern_hanging"), new BlockItem(LANTERN_HANGING, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "soul_hanging"), SOUL_HANGING);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "soul_hanging"), new BlockItem(SOUL_HANGING, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "redstone_hanging"), RED_HANGING);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "redstone_hanging"), new BlockItem(RED_HANGING, new Item.Settings().group(FURNITURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "rounded_barrel"), ROUNDED_BARREL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rounded_barrel"), new BlockItem(ROUNDED_BARREL, new Item.Settings().group(FURNITURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "soul_jack_o_lantern"), SOUL_JACK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "soul_jack_o_lantern"), new BlockItem(SOUL_JACK, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "copper_jack_o_lantern"), COPPER_JACK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "copper_jack_o_lantern"), new BlockItem(COPPER_JACK, new Item.Settings().group(FURNITURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "volc_stone_smooth"), VOLCANIC_STONE_SMOOTH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "volc_stone_smooth"), new BlockItem(VOLCANIC_STONE_SMOOTH, new Item.Settings().group(FURNITURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "chimney_cobble"), CHIMNEY_COBBLE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "chimney_cobble"), new BlockItem(CHIMNEY_COBBLE, new Item.Settings().group(FURNITURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "hanging_pot"), HANGING);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hanging_pot"), new BlockItem(HANGING, new Item.Settings().group(FURNITURE_GROUP)));

        //Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "hanging_redstone"), HANGING_R);
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hanging_redstone"), new BlockItem(HANGING_R, new Item.Settings().group(FURNITURE_GROUP)));
        //Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "hanging_fluorite"), HANGING_F);
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hanging_fluorite"), new BlockItem(HANGING_F, new Item.Settings().group(FURNITURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "hanging_diamond"), HANGING_D);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hanging_diamond"), new BlockItem(HANGING_D, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "hanging_emerald"), HANGING_E);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hanging_emerald"), new BlockItem(HANGING_E, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "hanging_amethyst"), HANGING_A);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hanging_amethyst"), new BlockItem(HANGING_A, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "hanging_glowstone"), HANGING_G);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hanging_glowstone"), new BlockItem(HANGING_G, new Item.Settings().group(FURNITURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "crystal_ball"), CRYSTAL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "crystal_ball"), new BlockItem(CRYSTAL, new Item.Settings().group(FURNITURE_GROUP)));
        //Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "crystal_ball_snow"), CRYSTAL_FROZEN);
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "crystal_ball_snow"), new BlockItem(CRYSTAL_FROZEN, new Item.Settings().group(ARTIFACT_GROUP).rarity(Rarity.RARE)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "bookshelf_cobweb"), BOOK_COBWEB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bookshelf_cobweb"), new BlockItem(BOOK_COBWEB, new Item.Settings().group(FURNITURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "bookshelf_empty"), EMPTY_SHELF);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bookshelf_empty"), new BlockItem(EMPTY_SHELF, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "bookshelf_empty_cobweb"), EMPTY_COBWEB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bookshelf_empty_cobweb"), new BlockItem(EMPTY_COBWEB, new Item.Settings().group(FURNITURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "bookshelf_lantern"), LANTERN_SHELF);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bookshelf_lantern"), new BlockItem(LANTERN_SHELF, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "bookshelf_lantern_cobweb"), LANTERN_COBWEB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bookshelf_lantern_cobweb"), new BlockItem(LANTERN_COBWEB, new Item.Settings().group(FURNITURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "bookshelf_potions"), POTION_SHELF);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bookshelf_potions"), new BlockItem(POTION_SHELF, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "bookshelf_potions_cobweb"), POTION_COBWEB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bookshelf_potions_cobweb"), new BlockItem(POTION_COBWEB, new Item.Settings().group(FURNITURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "bookshelf_anthropology"), ANTHRO_SHELF);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bookshelf_anthropology"), new BlockItem(ANTHRO_SHELF, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "bookshelf_anthropology_cobweb"), ANTHRO_COBWEB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bookshelf_anthropology_cobweb"), new BlockItem(ANTHRO_COBWEB, new Item.Settings().group(FURNITURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "bookshelf_dishes"), DISH_SHELF);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bookshelf_dishes"), new BlockItem(DISH_SHELF, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "bookshelf_dishes_cobweb"), DISH_COBWEB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bookshelf_dishes_cobweb"), new BlockItem(DISH_COBWEB, new Item.Settings().group(FURNITURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stump_morel"), STUMP_MOREL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stump_morel"), new BlockItem(STUMP_MOREL, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stump_red"), STUMP_RED);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stump_red"), new BlockItem(STUMP_RED, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stump_brown"), STUMP_BROWN);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stump_brown"), new BlockItem(STUMP_BROWN, new Item.Settings().group(FURNITURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "keg"), KEG);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "keg"), new BlockItem(KEG, new Item.Settings().group(FURNITURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "wreath"), WREATH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "wreath"), new BlockItem(WREATH, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "miners_crest"), CREST);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "miners_crest"), new BlockItem(CREST, new Item.Settings().group(FURNITURE_GROUP)));
        //Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "gear"), GEAR);
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "gear"), new BlockItem(GEAR, new Item.Settings().group(ARTIFACT_GROUP).rarity(Rarity.RARE)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "pet_bed"), PET_BED);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pet_bed"), new BlockItem(PET_BED, new Item.Settings().group(FURNITURE_GROUP)));
    }
}
