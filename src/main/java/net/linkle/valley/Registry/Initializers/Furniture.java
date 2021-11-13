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
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Rarity;

import static net.linkle.valley.Registry.Initializers.ItemGroups.*;
import static net.linkle.valley.Registry.Initializers.ItemGroups.COOKING_GROUP;
import static net.linkle.valley.Registry.Utils.Util.registerWithItem;

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

    public static final Block IRON_LADDER = new LadderBlock(FabricBlockSettings.of(Material.METAL).sounds(BlockSoundGroup.METAL).strength(1f,5f));
    public static final Block BAMBOO_LADDER = new LadderBlock();
    public static final Block OAK_LADDER = new LadderBlock();
    public static final Block BIRCH_LADDER = new LadderBlock();
    public static final Block ACACIA_LADDER = new LadderBlock();
    public static final Block SPRUCE_LADDER = new LadderBlock();
    public static final Block DARK_LADDER = new LadderBlock();
    public static final Block JUNGLE_LADDER = new LadderBlock();
    public static final Block CRIMSON_LADDER = new LadderBlock();
    public static final Block WARPED_LADDER = new LadderBlock();

    public static final Block SCARE = new StatueBlock(false);
    public static final Block SCARE_HAT = new StatueBlock(false);

    public static final Block SCARE_GLOW = new StatueBlock(true);
    public static final Block SCARE_HAT_GLOW = new StatueBlock(true);

    public static final Block SCARE_SOUL = new StatueBlock(true);
    public static final Block SCARE_HAT_SOUL = new StatueBlock(true);

    public static final Block SCARE_TARGET = new StatueBlock(false);
    public static final Block RARE_MELON = new StatueBlock(false);
    public static final Block RARE_ZOMBIE = new StatueBlock(false);
    public static final Block RARE_SKELETON = new StatueBlock(false);

    public static final Block SCARE_COPPER = new StatueBlock(true);
    public static final Block SCARE_HAT_COPPER = new StatueBlock(true);

    public static final Block SNOW = new SnowmanBlock();

    public static final Block ROPE_BRIDGE = new RopeBridgeBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.WOOD)
            .strength(1.0f,1f));

    public static final Block ROPE_BRIDGE_ANCHOR = new RopeBridgeBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.WOOD)
            .strength(1.0f,1f).collidable(false));

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
    public static final Block B_CRACKED = new BrownBlock();
    public static final Block B_MOSSY = new BrownMossyBlock();
    public static final Block B_STAIRS = new BrownStairsBlock();
    public static final Block B_SLAB = new BrownSlabBlock();
    public static final Block SCREEN = new ScreenBlock();
    public static final Block BRAZIER = new BrazierBlock(15);
    public static final Block SOUL_BRAZIER = new BrazierBlock(10);
    public static final Block COPPER_BRAZIER = new BrazierBlock(13);
    public static final Block BLAZE_BRAZIER = new BrazierBlock(15);

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
    public static final Block VOLCANIC_STONE_SMOOTH = new StoneOreBlock();

    public static final Block LANTERN_HANGING = new LanternBlock(15, false);
    public static final Block SOUL_HANGING = new LanternBlock(10, false);
    public static final Block FAIRY_HANGING = new LanternBlock(15, false);
    public static final Block RED_HANGING = new LanternBlock(7, true);

    public static final Block CHIMNEY_COBBLE = new ChimneyBlock(FabricBlockSettings.of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES)
            .breakByHand(false)
            .sounds(BlockSoundGroup.STONE)
            .strength(1, 2.0f));

    public static final Block HANGING = new HangingBlock();
    public static final Block CRYSTAL = new CrystalBlock();

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

    public static final Block KEG = new KegBlock();

    public static final Block PET_BED = new PetBedBlock();
    public static final Block WREATH = new WreathBlock();
    public static final Block CREST = new CrestBlock();
    public static final Block GEAR = new GearBlock();

    public static final Block BRAZIER_METAL = new BrazierMetalBlock();

    public static void initialize() {
        var furnGroup = new Item.Settings().group(FURNITURE_GROUP);
        var explGroup = new Item.Settings().group(EXPLORATION_GROUP);
        var cookGroup = new Item.Settings().group(COOKING_GROUP);
        var furnGroupRare = new Item.Settings().group(FURNITURE_GROUP).rarity(Rarity.RARE);
        
        registerWithItem("table_oak", TABLE_OAK, furnGroup);
        registerWithItem("table_stone", TABLE_STONE, furnGroup);
        registerWithItem("table_plaid", TABLE_PLAID, furnGroup);
        registerWithItem("table_birch", TABLE_BIRCH, furnGroup);
        registerWithItem("table_spruce", TABLE_SPRUCE, furnGroup);
        registerWithItem("table_jungle", TABLE_JUNGLE, furnGroup);
        registerWithItem("table_acacia", TABLE_ACACIA, furnGroup);
        registerWithItem("table_dark_oak", TABLE_DARK, furnGroup);
        registerWithItem("table_warped", TABLE_WARPED, furnGroup);
        registerWithItem("table_crimson", TABLE_CRIMSON, furnGroup);
        
        registerWithItem("stool_oak", STOOL_OAK, furnGroup);
        registerWithItem("stool_stone", STOOL_STONE, furnGroup);
        registerWithItem("stool_plaid", STOOL_PLAID, furnGroup);
        registerWithItem("stool_birch", STOOL_BIRCH, furnGroup);
        registerWithItem("stool_spruce", STOOL_SPRUCE, furnGroup);
        registerWithItem("stool_jungle", STOOL_JUNGLE, furnGroup);
        registerWithItem("stool_acacia", STOOL_ACACIA, furnGroup);
        registerWithItem("stool_dark_oak", STOOL_DARK, furnGroup);
        registerWithItem("stool_warped", STOOL_WARPED, furnGroup);
        registerWithItem("stool_crimson", STOOL_CRIMSON, furnGroup);

        //registerWithItem("chair_stone", CHAIR_STONE, furnGroup);

        registerWithItem("iron_ladder", IRON_LADDER, furnGroup);
        registerWithItem("bamboo_ladder", BAMBOO_LADDER, furnGroup);
        registerWithItem("ladder_oak", OAK_LADDER, furnGroup);
        registerWithItem("ladder_birch", BIRCH_LADDER, furnGroup);
        registerWithItem("ladder_spruce", SPRUCE_LADDER, furnGroup);
        registerWithItem("ladder_jungle", JUNGLE_LADDER, furnGroup);
        registerWithItem("ladder_acacia", ACACIA_LADDER, furnGroup);
        registerWithItem("ladder_dark", DARK_LADDER, furnGroup);
        registerWithItem("ladder_warped", WARPED_LADDER, furnGroup);
        registerWithItem("ladder_crimson", CRIMSON_LADDER, furnGroup);

        registerWithItem("scarecrow", SCARE, furnGroup);
        registerWithItem("scarecrow_target", SCARE_TARGET, furnGroup);
        registerWithItem("scarecrow_hat", SCARE_HAT, furnGroup);
        registerWithItem("scarecrow_glow", SCARE_GLOW, furnGroup);
        registerWithItem("scarecrow_hat_glow", SCARE_HAT_GLOW, furnGroup);
        registerWithItem("scarecrow_soul", SCARE_SOUL, furnGroup);
        registerWithItem("scarecrow_hat_soul", SCARE_HAT_SOUL, furnGroup);
        registerWithItem("scarecrow_copper", SCARE_COPPER, furnGroup);
        registerWithItem("scarecrow_hat_copper", SCARE_HAT_COPPER, furnGroup);
        
        registerWithItem("rarecrow_melon", RARE_MELON, furnGroup);
        registerWithItem("rarecrow_zombie", RARE_ZOMBIE, furnGroup);
        registerWithItem("rarecrow_skeleton", RARE_SKELETON, furnGroup);

        registerWithItem("snow", SNOW, furnGroup);
        
        registerWithItem("spike_wall_block", SPIKE_WALL_BLOCK, furnGroup);
        registerWithItem("brazier", BRAZIER, furnGroup);
        registerWithItem("brazier_soul", SOUL_BRAZIER, furnGroup);
        registerWithItem("brazier_copper", COPPER_BRAZIER, furnGroup);
        
        //registerWithItem("brazier_metal", BRAZIER_METAL, furnGroup);
        //registerWithItem("blaze_brazier", BLAZE_BRAZIER, furnGroup);

        //Crock Pots *coming soonTM*
        //registerWithItem("campfire_pot", CAMPFIRE_POT, explGroup);
        //registerWithItem("soul_campfire_pot", SOUL_CAMPFIRE_POT, explGroup);
        
        registerWithItem("screen", SCREEN, furnGroup);

        registerWithItem("charcoal_block", CHARCOAL_BLOCK, furnGroup);

        registerWithItem("seaweed_block", SEAWEED_BALE, furnGroup);
        //registerWithItem("ameranth_block", AMERANTH_BALE, furnGroup);
        registerWithItem("fiber_block", FIBER_BALE, furnGroup);

        registerWithItem("climbable_rope", CLIMBABLE_ROPE, explGroup);
        registerWithItem("copper_chain", CHAIN_C, explGroup);
        registerWithItem("golden_chain", CHAIN_G, explGroup);
        registerWithItem("netherite_chain", CHAIN_N, explGroup);

        registerWithItem("brown_bricks", B_BRICKS, furnGroup);
        registerWithItem("brown_cracked_bricks", B_CRACKED, furnGroup);
        registerWithItem("brown_mossy_bricks", B_MOSSY, furnGroup);
        registerWithItem("brown_brick_slab", B_SLAB, furnGroup);
        registerWithItem("brown_brick_stairs", B_STAIRS, furnGroup);
        registerWithItem("smooth_stone", SMOOTH_STONE_BRICK, furnGroup);
        registerWithItem("stone_tiles", SMOOTH_STONE_TILE, furnGroup);
        registerWithItem("stone_tile_slab", SMOOTH_STONE_TILE_SLAB, furnGroup);
        registerWithItem("stone_tile_stairs", SMOOTH_STONE_TILE_STAIRS, furnGroup);
        
        registerWithItem("cobblestone_brick", COBBLE_BRICK, furnGroup);
        registerWithItem("cobblestone_mossy_brick", COBBLE_MOSSY, furnGroup);
        registerWithItem("cobblestone_brick_slab", COBBLE_SLAB, furnGroup);
        registerWithItem("cobblestone_brick_stairs", COBBLE_STAIRS, furnGroup);
        
        registerWithItem("carmine_bricks", C_BRICKS, furnGroup);
        registerWithItem("carmine_slab", C_SLAB, furnGroup);
        registerWithItem("carmine_stairs", C_STAIRS, furnGroup);
        registerWithItem("chiseled_carmine", C_CHISELED, furnGroup);
        registerWithItem("carmine_cracked", C_CRACK, furnGroup);
        registerWithItem("carmine_mossy", C_MOSSY, furnGroup);
        registerWithItem("carmine_smooth", C_SMOOTH, furnGroup);

        //Lanterns & Torches
        registerWithItem("redstone_lantern", REDSTONE_LANTERN, furnGroup);
        
        registerWithItem("mug_block", MUG_BLOCK, cookGroup);
        registerWithItem("small_mug_block", SMALL_MUG_BLOCK, cookGroup);
        registerWithItem("goblet", GOBLET_BLOCK, furnGroupRare);
        registerWithItem("bowl_block", BOWL_BLOCK, cookGroup);
        registerWithItem("bento_block", BENTO_BLOCK, cookGroup);
        registerWithItem("stew_pot", STEW_POT, furnGroup);
        registerWithItem("stew_campfire_pot", STEW_POT_CAMPFIRE, furnGroup);
        
        registerWithItem("anchor", ANCHOR, furnGroupRare);
        registerWithItem("beveled_glass", BEVELED_PANE, furnGroup);
        registerWithItem("beveled_glass_copper", BEVELED_PANE_COPPER, furnGroup);
        registerWithItem("beveled_glass_gold", BEVELED_PANE_GOLD, furnGroup);
        registerWithItem("beveled_glass_netherite", BEVELED_PANE_NETHERITE, furnGroup);
        
        //amethyst
        registerWithItem("beveled_glass_amethyst", BEVELED_PANE_A, furnGroup);
        registerWithItem("beveled_glass_amethyst_copper", BEVELED_PANE_A_C, furnGroup);
        registerWithItem("beveled_glass_amethyst_gold", BEVELED_PANE_A_G, furnGroup);
        registerWithItem("beveled_glass_amethyst_netherite", BEVELED_PANE_A_N, furnGroup);

        registerWithItem("rope_bridge", ROPE_BRIDGE, explGroup);
        registerWithItem("rope_bridge_anchor", ROPE_BRIDGE_ANCHOR, explGroup);
        registerWithItem("net_block", NET, explGroup);

        registerWithItem("lantern_hanging", LANTERN_HANGING, furnGroup);
        registerWithItem("soul_hanging", SOUL_HANGING, furnGroup);
        registerWithItem("redstone_hanging", RED_HANGING, furnGroup);

        registerWithItem("rounded_barrel", ROUNDED_BARREL, furnGroup);

        registerWithItem("soul_jack_o_lantern", SOUL_JACK, furnGroup);
        registerWithItem("copper_jack_o_lantern", COPPER_JACK, furnGroup);

        registerWithItem("volc_stone_smooth", VOLCANIC_STONE_SMOOTH, furnGroup);
        
        registerWithItem("chimney_cobble", CHIMNEY_COBBLE, furnGroup);
        
        registerWithItem("hanging_pot", HANGING, furnGroup);

        //registerWithItem("hanging_redstone", HANGING_R, furnGroup);
        //registerWithItem("hanging_fluorite", HANGING_F, furnGroup);

        registerWithItem("hanging_diamond", HANGING_D, furnGroup);
        registerWithItem("hanging_emerald", HANGING_E, furnGroup);
        registerWithItem("hanging_amethyst", HANGING_A, furnGroup);
        registerWithItem("hanging_glowstone", HANGING_G, furnGroup);

        registerWithItem("crystal_ball", CRYSTAL, furnGroup);
        //registerWithItem("crystal_ball_snow", CRYSTAL_FROZEN, furnGroupRare);
        
        registerWithItem("bookshelf_cobweb", BOOK_COBWEB, furnGroup);
        
        registerWithItem("bookshelf_empty", EMPTY_SHELF, furnGroup);
        registerWithItem("bookshelf_empty_cobweb", EMPTY_COBWEB, furnGroup);
        
        registerWithItem("bookshelf_lantern", LANTERN_SHELF, furnGroup);
        registerWithItem("bookshelf_lantern_cobweb", LANTERN_COBWEB, furnGroup);
        
        registerWithItem("bookshelf_potions", POTION_SHELF, furnGroup);
        registerWithItem("bookshelf_potions_cobweb", POTION_COBWEB, furnGroup);
        
        registerWithItem("bookshelf_anthropology", ANTHRO_SHELF, furnGroup);
        registerWithItem("bookshelf_anthropology_cobweb", ANTHRO_COBWEB, furnGroup);
        
        registerWithItem("bookshelf_dishes", DISH_SHELF, furnGroup);
        registerWithItem("bookshelf_dishes_cobweb", DISH_COBWEB, furnGroup);
        
        registerWithItem("stump_morel", STUMP_MOREL, furnGroup);
        registerWithItem("stump_red", STUMP_RED, furnGroup);
        registerWithItem("stump_brown", STUMP_BROWN, furnGroup);

        registerWithItem("keg", KEG, furnGroup);

        registerWithItem("wreath", WREATH, furnGroup);
        registerWithItem("miners_crest", CREST, furnGroup);
        
        registerWithItem("gear", GEAR, furnGroupRare);

        registerWithItem("pet_bed", PET_BED, furnGroup);
        
        //Fuels
        //same as Coal Block
        FuelRegistry.INSTANCE.add(CHARCOAL_BLOCK, 16000);
    }
}
