package io.github.linkle.valleycraft.init;

import io.github.linkle.valleycraft.blocks.decorations.*;
import io.github.linkle.valleycraft.blocks.plants.Hanging.HangingBlock;
import io.github.linkle.valleycraft.blocks.plants.Stumps.StumpBlock;
import io.github.linkle.valleycraft.utils.Util;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Rarity;

import static io.github.linkle.valleycraft.init.ItemGroups.*;
import static io.github.linkle.valleycraft.init.ItemGroups.COOKING_GROUP;

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
    public static final Block B_MOSSY = new BrownBlock();
    public static final Block B_STAIRS = new BrownStairsBlock();
    public static final Block B_SLAB = new BrownSlabBlock();
    public static final Block SCREEN = new ScreenBlock();
    public static final Block BRAZIER = new BrazierBlock(15, 1);
    public static final Block SOUL_BRAZIER = new BrazierBlock(10, 2);
    public static final Block COPPER_BRAZIER = new BrazierBlock(13, 1);
    public static final Block BLAZE_BRAZIER = new BrazierBlock(15, 3);

    public static final Block C_BRICKS = new BrownBlock();
    public static final Block C_CHISELED = new BrownBlock();
    public static final Block C_STAIRS = new BrownStairsBlock();
    public static final Block C_SLAB = new BrownSlabBlock();
    public static final Block C_MOSSY = new BrownBlock();
    public static final Block C_CRACK = new BrownBlock();
    public static final Block C_SMOOTH = new BrownBlock();

    public static final Block ANCHOR = new AnchorBlock();

    public static final Block CHARCOAL_BLOCK = new Block(FabricBlockSettings.of(Material.STONE)
            .requiresTool()
            .sounds(BlockSoundGroup.STONE)
            .strength(1.5f, 2.0f));

    public static final Block FIBER_BALE = new BaleBlock();
    public static final Block AMERANTH_BALE = new BaleBlock();
    public static final Block SEAWEED_BALE = new BaleBlock();

    //rope
    public static final Block CLIMBABLE_ROPE = new VChainBlock(FabricBlockSettings.of(Material.NETHER_WOOD).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.NETHER_STEM)
            .strength(0,0.1f));

    //chain
    public static final Block CHAIN_C = new VChainBlock();
    public static final Block CHAIN_G = new VChainBlock();
    public static final Block CHAIN_N = new VChainBlock();

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
    //public static final Block JAR_BLOCK = new DishBlock();
    public static final Block BENTO_BLOCK = new BentoBlock();
    public static final Block BOWL_BLOCK = new BowlBlock();
    public static final Block STEW_POT = new StewPotBlock();
    public static final Block STEW_POT_CAMPFIRE = new StewPotCampfireBlock();
    public static final Block SMALL_MUG_BLOCK = new DishBlock();
    public static final Block GOBLET_BLOCK = new DishBlock();

    public static final Block SPIKE_WALL_BLOCK = new SpikeTrapBlock(FabricBlockSettings.of(Material.WOOD)
            .breakByHand(true)
            .sounds(BlockSoundGroup.WOOD)
            .strength(0.5f, 1.0f));

    public static final Block ROUNDED_BARREL = new RoundedBarrelBlock();
    public static final Block SOUL_JACK = new JackBlock();
    public static final Block COPPER_JACK = new JackBlock();
    public static final Block VOLCANIC_STONE_SMOOTH = new StoneBlock();

    public static final Block LANTERN_HANGING = new LanternBlock(15, false);
    public static final Block SOUL_HANGING = new LanternBlock(10, false);
    //public static final Block FAIRY_HANGING = new LanternBlock(15, false);
    public static final Block RED_HANGING = new LanternBlock(7, true);

    public static final Block CHIMNEY_COBBLE = new ChimneyBlock(FabricBlockSettings.of(Material.STONE)
            .requiresTool()
            .sounds(BlockSoundGroup.STONE)
            .strength(1.5f, 2.0f));

    public static final Block HANGING = new HangingBlock();

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

    public static final Block STUMP_MOREL  = new StumpBlock(Plants.MOREL.getDefaultState());
    public static final Block STUMP_RED  = new StumpBlock(Blocks.RED_MUSHROOM.getDefaultState());
    public static final Block STUMP_BROWN  = new StumpBlock(Blocks.BROWN_MUSHROOM.getDefaultState());

    public static final Block KEG = new KegBlock();

    //public static final Block PET_BED = new PetBedBlock();
    public static final Block WREATH = new WreathBlock();
    public static final Block CREST = new CrestBlock();

    public static final Block BRAZIER_METAL = new BrazierMetalBlock();

    public static void initialize() {
        var furnGroup = new Item.Settings().group(FURNITURE_GROUP);
        var explGroup = new Item.Settings().group(EXPLORATION_GROUP);
        var cookGroup = new Item.Settings().group(COOKING_GROUP);
        var furnGroupRare = new Item.Settings().group(FURNITURE_GROUP).rarity(Rarity.RARE);
        
        Util.registerWithItem("table_oak", TABLE_OAK, furnGroup);
        Util.registerWithItem("table_stone", TABLE_STONE, furnGroup);
        Util.registerWithItem("table_plaid", TABLE_PLAID, furnGroup);
        Util.registerWithItem("table_birch", TABLE_BIRCH, furnGroup);
        Util.registerWithItem("table_spruce", TABLE_SPRUCE, furnGroup);
        Util.registerWithItem("table_jungle", TABLE_JUNGLE, furnGroup);
        Util.registerWithItem("table_acacia", TABLE_ACACIA, furnGroup);
        Util.registerWithItem("table_dark_oak", TABLE_DARK, furnGroup);
        Util.registerWithItem("table_warped", TABLE_WARPED, furnGroup);
        Util.registerWithItem("table_crimson", TABLE_CRIMSON, furnGroup);
        
        Util.registerWithItem("stool_oak", STOOL_OAK, furnGroup);
        Util.registerWithItem("stool_stone", STOOL_STONE, furnGroup);
        Util.registerWithItem("stool_plaid", STOOL_PLAID, furnGroup);
        Util.registerWithItem("stool_birch", STOOL_BIRCH, furnGroup);
        Util.registerWithItem("stool_spruce", STOOL_SPRUCE, furnGroup);
        Util.registerWithItem("stool_jungle", STOOL_JUNGLE, furnGroup);
        Util.registerWithItem("stool_acacia", STOOL_ACACIA, furnGroup);
        Util.registerWithItem("stool_dark_oak", STOOL_DARK, furnGroup);
        Util.registerWithItem("stool_warped", STOOL_WARPED, furnGroup);
        Util.registerWithItem("stool_crimson", STOOL_CRIMSON, furnGroup);

        //registerWithItem("chair_stone", CHAIR_STONE, furnGroup);

        Util.registerWithItem("iron_ladder", IRON_LADDER, furnGroup);
        Util.registerWithItem("bamboo_ladder", BAMBOO_LADDER, furnGroup);
        Util.registerWithItem("ladder_oak", OAK_LADDER, furnGroup);
        Util.registerWithItem("ladder_birch", BIRCH_LADDER, furnGroup);
        Util.registerWithItem("ladder_spruce", SPRUCE_LADDER, furnGroup);
        Util.registerWithItem("ladder_jungle", JUNGLE_LADDER, furnGroup);
        Util.registerWithItem("ladder_acacia", ACACIA_LADDER, furnGroup);
        Util.registerWithItem("ladder_dark", DARK_LADDER, furnGroup);
        Util.registerWithItem("ladder_warped", WARPED_LADDER, furnGroup);
        Util.registerWithItem("ladder_crimson", CRIMSON_LADDER, furnGroup);

        Util.registerWithItem("scarecrow", SCARE, furnGroup);
        Util.registerWithItem("scarecrow_target", SCARE_TARGET, furnGroup);
        Util.registerWithItem("scarecrow_hat", SCARE_HAT, furnGroup);
        Util.registerWithItem("scarecrow_glow", SCARE_GLOW, furnGroup);
        Util.registerWithItem("scarecrow_hat_glow", SCARE_HAT_GLOW, furnGroup);
        Util.registerWithItem("scarecrow_soul", SCARE_SOUL, furnGroup);
        Util.registerWithItem("scarecrow_hat_soul", SCARE_HAT_SOUL, furnGroup);
        Util.registerWithItem("scarecrow_copper", SCARE_COPPER, furnGroup);
        Util.registerWithItem("scarecrow_hat_copper", SCARE_HAT_COPPER, furnGroup);
        
        Util.registerWithItem("rarecrow_melon", RARE_MELON, furnGroup);
        Util.registerWithItem("rarecrow_zombie", RARE_ZOMBIE, furnGroup);
        Util.registerWithItem("rarecrow_skeleton", RARE_SKELETON, furnGroup);

        Util.registerWithItem("snow", SNOW, furnGroup);
        
        Util.registerWithItem("spike_wall_block", SPIKE_WALL_BLOCK, furnGroup);
        Util.registerWithItem("brazier", BRAZIER, furnGroup);
        Util.registerWithItem("brazier_soul", SOUL_BRAZIER, furnGroup);
        Util.registerWithItem("brazier_copper", COPPER_BRAZIER, furnGroup);
        
        //registerWithItem("brazier_metal", BRAZIER_METAL, furnGroup);
        //registerWithItem("blaze_brazier", BLAZE_BRAZIER, furnGroup);

        //Crock Pots *coming soonTM*
        //registerWithItem("campfire_pot", CAMPFIRE_POT, explGroup);
        //registerWithItem("soul_campfire_pot", SOUL_CAMPFIRE_POT, explGroup);
        
        Util.registerWithItem("screen", SCREEN, furnGroup);

        Util.registerWithItem("charcoal_block", CHARCOAL_BLOCK, furnGroup);

        Util.registerWithItem("seaweed_block", SEAWEED_BALE, furnGroup);
        //registerWithItem("ameranth_block", AMERANTH_BALE, furnGroup);
        Util.registerWithItem("fiber_block", FIBER_BALE, furnGroup);

        Util.registerWithItem("climbable_rope", CLIMBABLE_ROPE, explGroup);
        Util.registerWithItem("copper_chain", CHAIN_C, explGroup);
        Util.registerWithItem("golden_chain", CHAIN_G, explGroup);
        Util.registerWithItem("netherite_chain", CHAIN_N, explGroup);

        Util.registerWithItem("brown_bricks", B_BRICKS, furnGroup);
        Util.registerWithItem("brown_cracked_bricks", B_CRACKED, furnGroup);
        Util.registerWithItem("brown_mossy_bricks", B_MOSSY, furnGroup);
        Util.registerWithItem("brown_brick_slab", B_SLAB, furnGroup);
        Util.registerWithItem("brown_brick_stairs", B_STAIRS, furnGroup);
        Util.registerWithItem("smooth_stone", SMOOTH_STONE_BRICK, furnGroup);
        Util.registerWithItem("stone_tiles", SMOOTH_STONE_TILE, furnGroup);
        Util.registerWithItem("stone_tile_slab", SMOOTH_STONE_TILE_SLAB, furnGroup);
        Util.registerWithItem("stone_tile_stairs", SMOOTH_STONE_TILE_STAIRS, furnGroup);
        
        Util.registerWithItem("cobblestone_brick", COBBLE_BRICK, furnGroup);
        Util.registerWithItem("cobblestone_mossy_brick", COBBLE_MOSSY, furnGroup);
        Util.registerWithItem("cobblestone_brick_slab", COBBLE_SLAB, furnGroup);
        Util.registerWithItem("cobblestone_brick_stairs", COBBLE_STAIRS, furnGroup);
        
        Util.registerWithItem("carmine_bricks", C_BRICKS, furnGroup);
        Util.registerWithItem("carmine_slab", C_SLAB, furnGroup);
        Util.registerWithItem("carmine_stairs", C_STAIRS, furnGroup);
        Util.registerWithItem("chiseled_carmine", C_CHISELED, furnGroup);
        Util.registerWithItem("carmine_cracked", C_CRACK, furnGroup);
        Util.registerWithItem("carmine_mossy", C_MOSSY, furnGroup);
        Util.registerWithItem("carmine_smooth", C_SMOOTH, furnGroup);

        //Lanterns & Torches
        Util.registerWithItem("redstone_lantern", REDSTONE_LANTERN, furnGroup);
        
        Util.registerWithItem("mug_block", MUG_BLOCK, cookGroup);
        Util.registerWithItem("small_mug_block", SMALL_MUG_BLOCK, cookGroup);
        Util.registerWithItem("goblet", GOBLET_BLOCK, furnGroupRare);
        Util.registerWithItem("bowl_block", BOWL_BLOCK, cookGroup);
        Util.registerWithItem("bento_block", BENTO_BLOCK, cookGroup);
        Util.registerWithItem("stew_pot", STEW_POT, furnGroup);
        Util.registerWithItem("stew_campfire_pot", STEW_POT_CAMPFIRE, furnGroup);
        
        Util.registerWithItem("anchor", ANCHOR, furnGroupRare);
        Util.registerWithItem("beveled_glass", BEVELED_PANE, furnGroup);
        Util.registerWithItem("beveled_glass_copper", BEVELED_PANE_COPPER, furnGroup);
        Util.registerWithItem("beveled_glass_gold", BEVELED_PANE_GOLD, furnGroup);
        Util.registerWithItem("beveled_glass_netherite", BEVELED_PANE_NETHERITE, furnGroup);
        
        //amethyst
        Util.registerWithItem("beveled_glass_amethyst", BEVELED_PANE_A, furnGroup);
        Util.registerWithItem("beveled_glass_amethyst_copper", BEVELED_PANE_A_C, furnGroup);
        Util.registerWithItem("beveled_glass_amethyst_gold", BEVELED_PANE_A_G, furnGroup);
        Util.registerWithItem("beveled_glass_amethyst_netherite", BEVELED_PANE_A_N, furnGroup);

        Util.registerWithItem("rope_bridge", ROPE_BRIDGE, explGroup);
        Util.registerWithItem("rope_bridge_anchor", ROPE_BRIDGE_ANCHOR, explGroup);
        Util.registerWithItem("net_block", NET, explGroup);

        Util.registerWithItem("lantern_hanging", LANTERN_HANGING, furnGroup);
        Util.registerWithItem("soul_hanging", SOUL_HANGING, furnGroup);
        Util.registerWithItem("redstone_hanging", RED_HANGING, furnGroup);

        Util.registerWithItem("rounded_barrel", ROUNDED_BARREL, furnGroup);

        Util.registerWithItem("soul_jack_o_lantern", SOUL_JACK, furnGroup);
        Util.registerWithItem("copper_jack_o_lantern", COPPER_JACK, furnGroup);

        Util.registerWithItem("volc_stone_smooth", VOLCANIC_STONE_SMOOTH, furnGroup);
        
        Util.registerWithItem("chimney_cobble", CHIMNEY_COBBLE, furnGroup);
        
        Util.registerWithItem("hanging_pot", HANGING, furnGroup);

        //registerWithItem("hanging_redstone", HANGING_R, furnGroup);
        //registerWithItem("hanging_fluorite", HANGING_F, furnGroup);

        //registerWithItem("hanging_diamond", HANGING_D, furnGroup);
        //registerWithItem("hanging_emerald", HANGING_E, furnGroup);
        //registerWithItem("hanging_amethyst", HANGING_A, furnGroup);
        //registerWithItem("hanging_glowstone", HANGING_G, furnGroup);

        //registerWithItem("crystal_ball", CRYSTAL, furnGroup);
        //registerWithItem("crystal_ball_snow", CRYSTAL_FROZEN, furnGroupRare);
        
        Util.registerWithItem("bookshelf_cobweb", BOOK_COBWEB, furnGroup);
        
        Util.registerWithItem("bookshelf_empty", EMPTY_SHELF, furnGroup);
        Util.registerWithItem("bookshelf_empty_cobweb", EMPTY_COBWEB, furnGroup);
        
        Util.registerWithItem("bookshelf_lantern", LANTERN_SHELF, furnGroup);
        Util.registerWithItem("bookshelf_lantern_cobweb", LANTERN_COBWEB, furnGroup);
        
        Util.registerWithItem("bookshelf_potions", POTION_SHELF, furnGroup);
        Util.registerWithItem("bookshelf_potions_cobweb", POTION_COBWEB, furnGroup);
        
        Util.registerWithItem("bookshelf_anthropology", ANTHRO_SHELF, furnGroup);
        Util.registerWithItem("bookshelf_anthropology_cobweb", ANTHRO_COBWEB, furnGroup);
        
        Util.registerWithItem("bookshelf_dishes", DISH_SHELF, furnGroup);
        Util.registerWithItem("bookshelf_dishes_cobweb", DISH_COBWEB, furnGroup);
        
        Util.registerWithItem("stump_morel", STUMP_MOREL, furnGroup);
        Util.registerWithItem("stump_red", STUMP_RED, furnGroup);
        Util.registerWithItem("stump_brown", STUMP_BROWN, furnGroup);

        Util.registerWithItem("keg", KEG, furnGroup);

        Util.registerWithItem("wreath", WREATH, furnGroup);
        Util.registerWithItem("miners_crest", CREST, furnGroup);
        
        //registerWithItem("gear", GEAR, furnGroupRare);

        //registerWithItem("pet_bed", PET_BED, furnGroup);
        
        //Fuels
        //same as Coal Block
        FuelRegistry.INSTANCE.add(CHARCOAL_BLOCK, 16000);
    }
}
