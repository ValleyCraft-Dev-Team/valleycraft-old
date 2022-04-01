package io.github.linkle.valleycraft.init;

import io.github.linkle.valleycraft.blocks.decorations.*;
import io.github.linkle.valleycraft.blocks.plants.Hanging.HangingBlock;
import io.github.linkle.valleycraft.blocks.plants.Stumps.StumpBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.Oxidizable.OxidationLevel;
import net.minecraft.item.Item;
import net.minecraft.item.WallStandingBlockItem;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Rarity;

import static io.github.linkle.valleycraft.init.ItemGroups.*;
import static io.github.linkle.valleycraft.init.ItemGroups.COOKING_GROUP;

public class Furniture {
    public static final Block OAK_TABLE = new TableBlock();
    public static final Block DARK_OAK_TABLE = new TableBlock();
    public static final Block SPRUCE_TABLE = new TableBlock();
    public static final Block JUNGLE_TABLE = new TableBlock();
    public static final Block ACACIA_TABLE = new TableBlock();
    public static final Block BIRCH_TABLE = new TableBlock();
    public static final Block WARPED_TABLE = new TableBlock();
    public static final Block CRIMSON_TABLE = new TableBlock();
    public static final Block STONE_TABLE = new TableBlock();
    public static final Block TABLE_WITH_PLAID_TABLECLOTH = new TableBlock();

    public static final Block OAK_STOOL = new StoolBlock();
    public static final Block DARK_OAK_STOOL = new StoolBlock();
    public static final Block SPRUCE_STOOL = new StoolBlock();
    public static final Block JUNGLE_STOOL = new StoolBlock();
    public static final Block ACACIA_STOOL = new StoolBlock();
    public static final Block BIRCH_STOOL = new StoolBlock();
    public static final Block WARPED_STOOL = new StoolBlock();
    public static final Block CRIMSON_STOOL = new StoolBlock();
    public static final Block STONE_STOOL = new StoolBlock();
    public static final Block STOOL_WITH_PLAID_BLANKET = new StoolBlock();

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
    public static final Block HATTED_SCARECROW = new StatueBlock(false);

    public static final Block SCARECR_O_LANTERN = new StatueBlock(true);
    public static final Block HATTED_SCARECR_O_LANTERN = new StatueBlock(true);

    public static final Block HAUNTED_SCARECROW = new StatueBlock(true);
    public static final Block HATTED_N_HAUNTED_SCARECROW = new StatueBlock(true);

    public static final Block TARGET_RARECROW = new StatueBlock(false);
    public static final Block MELONHEAD_RARECROW = new StatueBlock(false);
    public static final Block ZOMBIE_RARECROW = new StatueBlock(false);
    public static final Block SKELETON_RARECROW = new StatueBlock(false);

    public static final Block COPPERFLAME_SCARECROW = new StatueBlock(true);
    public static final Block HATTED_COPPERFLAME_SCARECROW = new StatueBlock(true);

    public static final Block SNOWMAN = new SnowmanBlock();

    public static final Block ROPE_BRIDGE = new RopeBridgeBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque()
            .sounds(BlockSoundGroup.WOOD)
            .strength(1.0f,1f));

    public static final Block ROPE_BRIDGE_ANCHOR = new RopeBridgeBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque()
            .sounds(BlockSoundGroup.WOOD)
            .strength(1.0f,1f).collidable(false));

    public static final Block POLISHED_STONE = new PolishedStoneBlock();
    public static final Block STONE_TILES = new PolishedStoneBlock();
    public static final Block STONE_TILE_SLAB = new TileSlabBlock();
    public static final Block STONE_TILE_STAIRS = new TileStairsBlock();

    public static final Block COBBLESTONE_BRICKS = new PolishedStoneBlock();
    public static final Block MOSSY_COBBLESTONE_BRICKS = new PolishedStoneBlock();
    public static final Block CHISELED_COBBLESTONE_BRICKS = new PolishedStoneBlock();
    public static final Block COBBLESTONE_BRICK_SLAB = new TileSlabBlock();
    public static final Block COBBLESTONE_BRICK_STAIRS = new TileStairsBlock();

    public static final Block SMOOTH_STONE_TILES = new PolishedStoneBlock();
    public static final Block SMOOTH_STONE_TILE_SLAB = new TileSlabBlock();
    public static final Block SMOOTH_STONE_TILE_STAIRS = new TileStairsBlock();

    public static final Block QUARTZ_TILES = new PolishedStoneBlock();
    public static final Block QUARTZ_TILE_SLAB = new TileSlabBlock();
    public static final Block QUARTZ_TILE_STAIRS = new TileStairsBlock();

    public static final Block KITCHEN_TILES = new PolishedStoneBlock();
    public static final Block KITCHEN_TILE_SLAB = new TileSlabBlock();
    public static final Block KITCHEN_TILE_STAIRS = new TileStairsBlock();

    public static final Block VOLCANIC_TILES = new PolishedStoneBlock();
    public static final Block VOLCANIC_TILE_SLAB = new TileSlabBlock();
    public static final Block VOLCANIC_TILE_STAIRS = new TileStairsBlock();

    public static final Block VOLCANIC_BRICKS = new PolishedStoneBlock();
    public static final Block VOLCANIC_BRICK_SLAB = new TileSlabBlock();
    public static final Block VOLCANIC_BRICK_STAIRS = new TileStairsBlock();

    public static final Block NET = new NetBlock();
    public static final Block MIXED_BRICKS = new BrownBlock();
    public static final Block CRACKED_MIXED_BRICKS = new BrownBlock();
    public static final Block MOSSY_MIXED_BRICKS = new BrownBlock();
    public static final Block MIXED_BRICK_STAIRS = new BrownStairsBlock();
    public static final Block MIXED_BRICK_SLAB = new BrownSlabBlock();
    public static final Block FIREPLACE_SCREEN = new ScreenBlock();
    public static final Block BRAZIER = new BrazierBlock(15, 1);
    public static final Block SOUL_BRAZIER = new BrazierBlock(10, 2);
    public static final Block COPPERFLAME_BRAZIER = new BrazierBlock(13, 1);

    public static final Block CARMINE_BRICKS = new BrownBlock();
    public static final Block CHISELED_CARMINE = new BrownBlock();
    public static final Block CARMINE_BRICK_STAIRS = new BrownStairsBlock();
    public static final Block CARMINE_BRICK_SLAB = new BrownSlabBlock();
    public static final Block MOSSY_CARMINE = new BrownBlock();
    public static final Block CRACKED_CARMINE = new BrownBlock();
    public static final Block POLISHED_CARMINE = new BrownBlock();

    public static final Block ANCHOR = new AnchorBlock();

    public static final Block CHARCOAL_BLOCK = new Block(FabricBlockSettings.of(Material.STONE)
            .requiresTool()
            .sounds(BlockSoundGroup.STONE)
            .strength(1.5f, 2.0f));

    public static final Block PLANT_FIBER_BALE = new BaleBlock();
    public static final Block SEAWEED_BLOCK = new BaleBlock();
    public static final Block GLOW_KELP_BLOCK = new GlowingBaleBlock();

    //rope
    public static final Block ROPE = new VChainBlock(FabricBlockSettings.of(Material.NETHER_WOOD).nonOpaque()
            .sounds(BlockSoundGroup.NETHER_STEM)
            .strength(0,0.1f));

    //chain
    public static final Block COPPER_CHAIN = new OxidizableChainBlock(OxidationLevel.UNAFFECTED);
    public static final Block EXPOSED_COPPER_CHAIN = new OxidizableChainBlock(OxidationLevel.EXPOSED);
    public static final Block WEATHERED_COPPER_CHAIN = new OxidizableChainBlock(OxidationLevel.WEATHERED);
    public static final Block OXIDIZED_COPPER_CHAIN = new OxidizableChainBlock(OxidationLevel.OXIDIZED);

    public static final Block WAXED_COPPER_CHAIN = new VChainBlock();
    public static final Block WAXED_EXPOSED_COPPER_CHAIN = new VChainBlock();
    public static final Block WAXED_WEATHERED_COPPER_CHAIN = new VChainBlock();
    public static final Block WAXED_OXIDIZED_COPPER_CHAIN = new VChainBlock();

    public static final Block GOLDEN_CHAIN = new VChainBlock();
    public static final Block NETHERITE_CHAIN = new VChainBlock();

    //lantern
    public static final Block REDSTONE_LANTERN = new RedLanternBlock(FabricBlockSettings.of(Material.METAL).nonOpaque()
            .sounds(BlockSoundGroup.CHAIN)
            .strength(1.0f,0.8f).luminance(7));

    public static final Block IRON_BEVELED_GLASS = new BeveledGlassBlock();
    public static final Block COPPER_BEVELED_GLASS = new BeveledGlassBlock();
    public static final Block GOLDEN_BEVELED_GLASS = new BeveledGlassBlock();
    public static final Block NETHERITE_BEVELED_GLASS = new BeveledGlassBlock();

    public static final Block BEVELED_AMETHYST_GLASS = new BeveledGlassBlock();
    public static final Block COPPER_BEVELED_AMETHYST_GLASS = new BeveledGlassBlock();
    public static final Block GOLDEN_BEVELED_AMETHYST_GLASS = new BeveledGlassBlock();
    public static final Block NETHERITE_BEVELED_AMETHYST_GLASS = new BeveledGlassBlock();

    public static final Block MEAD_MUG = new DishBlock();
    public static final Block BENTO_BOX = new BentoBlock();
    public static final Block BOWL_BLOCK = new BowlBlock();
    public static final Block STEW_POT = new StewPotBlock();
    public static final Block CAMPFIRE_STEW_POT = new StewPotCampfireBlock();
    public static final Block TEA_MUG = new DishBlock();
    public static final Block GOLDEN_CHALICE = new DishBlock();

    public static final Block SPIKE_WALL_BLOCK = new SpikeTrapBlock(FabricBlockSettings.of(Material.WOOD)
            .sounds(BlockSoundGroup.WOOD)
            .strength(0.5f, 1.0f));

    public static final Block ROUNDED_BARREL = new RoundedBarrelBlock();
    public static final Block SOUL_JACK_O_LANTERN = new JackBlock();
    public static final Block COPPERFLAME_JACK_O_LANTERN = new JackBlock();
    public static final Block POLISHED_VOLCANIC_STONE = new StoneBlock();

    public static final Block HANGING_LANTERN = new LanternBlock(15, false);
    public static final Block HANGING_SOUL_LANTERN = new LanternBlock(10, false);
    public static final Block HANGING_REDSTONE_LANTERN = new LanternBlock(7, true);

    public static final Block COBBLESTONE_CHIMNEY = new ChimneyBlock(FabricBlockSettings.of(Material.STONE)
            .requiresTool()
            .sounds(BlockSoundGroup.STONE)
            .strength(1.5f, 2.0f));

    public static final Block COBBLESTONE_BRICK_CHIMNEY = new ChimneyBlock(FabricBlockSettings.of(Material.STONE)
            .requiresTool()
            .sounds(BlockSoundGroup.STONE)
            .strength(1.5f, 2.0f));

    public static final Block BRICK_CHIMNEY = new ChimneyBlock(FabricBlockSettings.of(Material.STONE)
            .requiresTool()
            .sounds(BlockSoundGroup.STONE)
            .strength(1.5f, 2.0f));

    public static final Block VOLCANIC_BRICK_CHIMNEY = new ChimneyBlock(FabricBlockSettings.of(Material.STONE)
            .requiresTool()
            .sounds(BlockSoundGroup.STONE)
            .strength(1.5f, 2.0f));

    public static final Block CARMINE_BRICK_CHIMNEY = new ChimneyBlock(FabricBlockSettings.of(Material.STONE)
            .requiresTool()
            .sounds(BlockSoundGroup.STONE)
            .strength(1.5f, 2.0f));

    public static final Block HANGING_GLASS_PLANTER = new HangingBlock();

    public static final Block COBWEBBED_BOOKSHELF = new BookshelfBlock();
    public static final Block EMPTY_BOOKSHELF = new BookshelfBlock();
    public static final Block BOOKSHELF_EMPTY_COBWEB = new BookshelfBlock();
    public static final Block BOOKSHELF_WITH_LANTERN = new BookshelfBlockGlow();
    public static final Block COBWEBBED_BOOKSHELF_WITH_LANTERN = new BookshelfBlockGlow();
    public static final Block DISH_SHELF = new BookshelfBlock();
    public static final Block COBWEBBED_DISH_SHELF = new BookshelfBlock();
    public static final Block POTION_SHELF = new BookshelfBlock();
    public static final Block COBWEBBED_POTION_SHELF = new BookshelfBlock();
    public static final Block ANTHROPOLOGISTS_SHELF = new BookshelfBlock();
    public static final Block COBWEBBED_ANTHROPOLOGISTS_SHELF = new BookshelfBlock();

    public static final Block MOREL_LOGS = new StumpBlock(Plants.MOREL.getDefaultState());
    public static final Block RED_MUSHROOM_LOGS = new StumpBlock(Blocks.RED_MUSHROOM.getDefaultState());
    public static final Block BROWN_MUSHROOM_LOGS = new StumpBlock(Blocks.BROWN_MUSHROOM.getDefaultState());

    public static final Block KEG = new KegBlock();

    public static final Block WREATH = new WreathBlock();
    public static final Block MINERS_CREST = new CrestBlock();

    public static final Block BONE_TORCH = new TorchBlock(Block.Settings.copy(Blocks.TORCH).sounds(BlockSoundGroup.BONE), ParticleTypes.FLAME);
    public static final Block WALL_BONE_TORCH = new WallTorchBlock(Block.Settings.copy(Blocks.WALL_TORCH).sounds(BlockSoundGroup.BONE), ParticleTypes.FLAME);

    public static final Block SOUL_BONE_TORCH = new TorchBlock(Block.Settings.copy(Blocks.SOUL_TORCH).sounds(BlockSoundGroup.BONE), ParticleTypes.SOUL_FIRE_FLAME);
    public static final Block SOUL_WALL_BONE_TORCH = new WallTorchBlock(Block.Settings.copy(Blocks.SOUL_WALL_TORCH).sounds(BlockSoundGroup.BONE), ParticleTypes.SOUL_FIRE_FLAME);

    public static final Block REDSTONE_BONE_TORCH = new RedstoneTorchBlock(Block.Settings.copy(Blocks.REDSTONE_TORCH).sounds(BlockSoundGroup.BONE));
    public static final Block REDSTONE_WALL_BONE_TORCH = new WallRedstoneTorchBlock(Block.Settings.copy(Blocks.REDSTONE_WALL_TORCH).sounds(BlockSoundGroup.BONE));

    public static final Block ICE_BOX = new IceBoxBarrelBlock();

    public static final Block CHISELED_VOLCANIC_BRICKS = new PolishedStoneBlock();
    public static final Block ENCRUSTED_SANDSTONE = new EncrustedBlock();

    public static void initialize() {
        var furnGroup = new Item.Settings().group(FURNITURE_GROUP);
        var explGroup = new Item.Settings().group(EXPLORATION_GROUP);
        var cookGroup = new Item.Settings().group(COOKING_GROUP);
        var artGroup = new Item.Settings().group(ARTEFACT_GROUP).rarity(Rarity.RARE);
        new Item.Settings().group(FURNITURE_GROUP).rarity(Rarity.RARE);

        //Tables
        Reg.registerWithItem("oak_table", OAK_TABLE, furnGroup);
        Reg.registerWithItem("birch_table", BIRCH_TABLE, furnGroup);
        Reg.registerWithItem("spruce_table", SPRUCE_TABLE, furnGroup);
        Reg.registerWithItem("jungle_table", JUNGLE_TABLE, furnGroup);
        Reg.registerWithItem("acacia_table", ACACIA_TABLE, furnGroup);
        Reg.registerWithItem("dark_oak_table", DARK_OAK_TABLE, furnGroup);
        Reg.registerWithItem("crimson_table", CRIMSON_TABLE, furnGroup);
        Reg.registerWithItem("warped_table", WARPED_TABLE, furnGroup);
        Reg.registerWithItem("stone_table", STONE_TABLE, furnGroup);
        Reg.registerWithItem("table_with_plaid_tablecloth", TABLE_WITH_PLAID_TABLECLOTH, furnGroup);

        //Stools
        Reg.registerWithItem("oak_stool", OAK_STOOL, furnGroup);
        Reg.registerWithItem("birch_stool", BIRCH_STOOL, furnGroup);
        Reg.registerWithItem("spruce_stool", SPRUCE_STOOL, furnGroup);
        Reg.registerWithItem("jungle_stool", JUNGLE_STOOL, furnGroup);
        Reg.registerWithItem("acacia_stool", ACACIA_STOOL, furnGroup);
        Reg.registerWithItem("dark_oak_stool", DARK_OAK_STOOL, furnGroup);
        Reg.registerWithItem("crimson_stool", CRIMSON_STOOL, furnGroup);
        Reg.registerWithItem("warped_stool", WARPED_STOOL, furnGroup);
        Reg.registerWithItem("stone_stool", STONE_STOOL, furnGroup);
        Reg.registerWithItem("stool_with_plaid_blanket", STOOL_WITH_PLAID_BLANKET, furnGroup);

        //Ladders
        Reg.registerWithItem("iron_ladder", IRON_LADDER, furnGroup);
        Reg.registerWithItem("bamboo_ladder", BAMBOO_LADDER, furnGroup);
        Reg.registerWithItem("ladder_oak", OAK_LADDER, furnGroup);
        Reg.registerWithItem("ladder_birch", BIRCH_LADDER, furnGroup);
        Reg.registerWithItem("ladder_spruce", SPRUCE_LADDER, furnGroup);
        Reg.registerWithItem("ladder_jungle", JUNGLE_LADDER, furnGroup);
        Reg.registerWithItem("ladder_acacia", ACACIA_LADDER, furnGroup);
        Reg.registerWithItem("ladder_dark_oak", DARK_LADDER, furnGroup);
        Reg.registerWithItem("ladder_crimson", CRIMSON_LADDER, furnGroup);
        Reg.registerWithItem("ladder_warped", WARPED_LADDER, furnGroup);

        //Scarecrows
        Reg.registerWithItem("scarecrow", SCARE, furnGroup);
        Reg.registerWithItem("hatted_scarecrow", HATTED_SCARECROW, furnGroup);
        Reg.registerWithItem("scarecr_o_lantern", SCARECR_O_LANTERN, furnGroup);
        Reg.registerWithItem("hatted_scarecr_o_lantern", HATTED_SCARECR_O_LANTERN, furnGroup);
        Reg.registerWithItem("haunted_scarecrow", HAUNTED_SCARECROW, furnGroup);
        Reg.registerWithItem("hatted_n_haunted_scarecrow", HATTED_N_HAUNTED_SCARECROW, furnGroup);
        Reg.registerWithItem("copperflame_scarecrow", COPPERFLAME_SCARECROW, furnGroup);
        Reg.registerWithItem("hatted_copperflame_scarecrow", HATTED_COPPERFLAME_SCARECROW, furnGroup);

        //Rarecrows
        Reg.registerWithItem("target_rarecrow", TARGET_RARECROW, furnGroup);
        Reg.registerWithItem("melonhead_rarecrow", MELONHEAD_RARECROW, furnGroup);
        Reg.registerWithItem("zombie_rarecrow", ZOMBIE_RARECROW, furnGroup);
        Reg.registerWithItem("skeleton_rarecrow", SKELETON_RARECROW, furnGroup);

        //Braziers
        Reg.registerWithItem("brazier", BRAZIER, furnGroup);
        Reg.registerWithItem("soul_brazier", SOUL_BRAZIER, furnGroup);
        Reg.registerWithItem("copperflame_brazier", COPPERFLAME_BRAZIER, furnGroup);

        //Compressed resource blocks
        Reg.registerWithItem("charcoal_block", CHARCOAL_BLOCK, furnGroup);
        Reg.registerWithItem("plant_fiber_bale", PLANT_FIBER_BALE, furnGroup);
        Reg.registerWithItem("glow_kelp_block", GLOW_KELP_BLOCK, furnGroup);
        Reg.registerWithItem("seaweed_block", SEAWEED_BLOCK, furnGroup);

        //Misc. decor
        Reg.registerWithItem("rope", ROPE, explGroup);
        Reg.registerWithItem("snowman", SNOWMAN, furnGroup);
        Reg.registerWithItem("spike_trap", SPIKE_WALL_BLOCK, furnGroup);
        Reg.registerWithItem("fireplace_screen", FIREPLACE_SCREEN, furnGroup);
        Reg.registerWithItem("rope_bridge", ROPE_BRIDGE, explGroup);
        Reg.registerWithItem("rope_bridge_anchor", ROPE_BRIDGE_ANCHOR, explGroup);
        Reg.registerWithItem("net", NET, explGroup);
        Reg.registerWithItem("keg", KEG, furnGroup);
        Reg.registerWithItem("rounded_barrel", ROUNDED_BARREL, furnGroup);
        Reg.registerWithItem("ice_box", ICE_BOX, furnGroup);
        Reg.registerWithItem("hanging_glass_planter", HANGING_GLASS_PLANTER, furnGroup);
        Reg.registerWithItem("wreath", WREATH, furnGroup);
        Reg.registerWithItem("miners_crest", MINERS_CREST, furnGroup);

        //Chains
        Reg.registerWithItem("copper_chain", COPPER_CHAIN, explGroup);
        Reg.registerWithItem("exposed_copper_chain", EXPOSED_COPPER_CHAIN, explGroup);
        Reg.registerWithItem("weathered_copper_chain", WEATHERED_COPPER_CHAIN, explGroup);
        Reg.registerWithItem("oxidized_copper_chain", OXIDIZED_COPPER_CHAIN, explGroup);
        Reg.registerWithItem("waxed_copper_chain", WAXED_COPPER_CHAIN, explGroup);
        Reg.registerWithItem("waxed_exposed_copper_chain", WAXED_EXPOSED_COPPER_CHAIN, explGroup);
        Reg.registerWithItem("waxed_weathered_copper_chain", WAXED_WEATHERED_COPPER_CHAIN, explGroup);
        Reg.registerWithItem("waxed_oxidized_copper_chain", WAXED_OXIDIZED_COPPER_CHAIN, explGroup);
        Reg.registerWithItem("golden_chain", GOLDEN_CHAIN, explGroup);
        Reg.registerWithItem("netherite_chain", NETHERITE_CHAIN, explGroup);

        //Mixed brick blocks
        Reg.registerWithItem("mixed_bricks", MIXED_BRICKS, furnGroup);
        Reg.registerWithItem("cracked_mixed_bricks", CRACKED_MIXED_BRICKS, furnGroup);
        Reg.registerWithItem("mossy_mixed_bricks", MOSSY_MIXED_BRICKS, furnGroup);
        Reg.registerWithItem("mixed_brick_slab", MIXED_BRICK_SLAB, furnGroup);
        Reg.registerWithItem("mixed_brick_stairs", MIXED_BRICK_STAIRS, furnGroup);

        //Cobblestone brick blocks
        Reg.registerWithItem("cobblestone_bricks", COBBLESTONE_BRICKS, furnGroup);
        Reg.registerWithItem("mossy_cobblestone_bricks", MOSSY_COBBLESTONE_BRICKS, furnGroup);
        Reg.registerWithItem("chiseled_cobblestone_bricks", CHISELED_COBBLESTONE_BRICKS, furnGroup);
        Reg.registerWithItem("cobblestone_brick_stairs", COBBLESTONE_BRICK_STAIRS, furnGroup);
        Reg.registerWithItem("cobblestone_brick_slab", COBBLESTONE_BRICK_SLAB, furnGroup);

        //Polished stone & stone tile blocks
        Reg.registerWithItem("polished_stone", POLISHED_STONE, furnGroup);
        Reg.registerWithItem("stone_tiles", STONE_TILES, furnGroup);
        Reg.registerWithItem("stone_tile_stairs", STONE_TILE_STAIRS, furnGroup);
        Reg.registerWithItem("stone_tile_slab", STONE_TILE_SLAB, furnGroup);

        //Smooth stone tile blocks
        Reg.registerWithItem("smooth_stone_tiles", SMOOTH_STONE_TILES, furnGroup);
        Reg.registerWithItem("smooth_stone_tile_slab", SMOOTH_STONE_TILE_SLAB, furnGroup);
        Reg.registerWithItem("smooth_stone_tile_stairs", SMOOTH_STONE_TILE_STAIRS, furnGroup);

        //Quartz tile blocks
        Reg.registerWithItem("quartz_tiles", QUARTZ_TILES, furnGroup);
        Reg.registerWithItem("quartz_tile_stairs", QUARTZ_TILE_STAIRS, furnGroup);
        Reg.registerWithItem("quartz_tile_slab", QUARTZ_TILE_SLAB, furnGroup);

        //Kitchen tile blocks
        Reg.registerWithItem("kitchen_tiles", KITCHEN_TILES, furnGroup);
        Reg.registerWithItem("kitchen_tile_stairs", KITCHEN_TILE_STAIRS, furnGroup);
        Reg.registerWithItem("kitchen_tile_slab", KITCHEN_TILE_SLAB, furnGroup);

        //Volcanic tile blocks
        Reg.registerWithItem("volcanic_tiles", VOLCANIC_TILES, furnGroup);
        Reg.registerWithItem("volcanic_tile_stairs", VOLCANIC_TILE_STAIRS, furnGroup);
        Reg.registerWithItem("volcanic_tile_slab", VOLCANIC_TILE_SLAB, furnGroup);

        //Volcanic brick blocks & polished volcanic rock
        Reg.registerWithItem("volcanic_bricks", VOLCANIC_BRICKS, furnGroup);
        Reg.registerWithItem("volcanic_brick_stairs", VOLCANIC_BRICK_STAIRS, furnGroup);
        Reg.registerWithItem("volcanic_brick_slab", VOLCANIC_BRICK_SLAB, furnGroup);
        Reg.registerWithItem("chiseled_volcanic_bricks", CHISELED_VOLCANIC_BRICKS, furnGroup);
        Reg.registerWithItem("polished_volcanic_stone", POLISHED_VOLCANIC_STONE, furnGroup);

        //Carmine brick blocks & polished carmine
        Reg.registerWithItem("carmine_bricks", CARMINE_BRICKS, furnGroup);
        Reg.registerWithItem("carmine_brick_stairs", CARMINE_BRICK_STAIRS, furnGroup);
        Reg.registerWithItem("carmine_brick_slab", CARMINE_BRICK_SLAB, furnGroup);
        Reg.registerWithItem("chiseled_carmine", CHISELED_CARMINE, furnGroup);
        Reg.registerWithItem("cracked_carmine", CRACKED_CARMINE, furnGroup);
        Reg.registerWithItem("mossy_carmine", MOSSY_CARMINE, furnGroup);
        Reg.registerWithItem("polished_carmine", POLISHED_CARMINE, furnGroup);

        //Encrusted sandstone
        Reg.registerWithItem("encrusted_sandstone", ENCRUSTED_SANDSTONE, furnGroup);

        //Lanterns
        Reg.registerWithItem("redstone_lantern", REDSTONE_LANTERN, furnGroup);
        Reg.registerWithItem("hanging_lantern", HANGING_LANTERN, furnGroup);
        Reg.registerWithItem("hanging_soul_lantern", HANGING_SOUL_LANTERN, furnGroup);
        Reg.registerWithItem("hanging_redstone_lantern", HANGING_REDSTONE_LANTERN, furnGroup);

        //Dishes
        Reg.registerWithItem("mead_mug", MEAD_MUG, cookGroup);
        Reg.registerWithItem("tea_mug", TEA_MUG, cookGroup);
        Reg.registerWithItem("bowl_block", BOWL_BLOCK, cookGroup);
        Reg.registerWithItem("bento_box", BENTO_BOX, cookGroup);
        Reg.registerWithItem("stew_pot", STEW_POT, furnGroup);

        //Campfire enhancers
        Reg.registerWithItem("campfire_stew_pot", CAMPFIRE_STEW_POT, furnGroup);

        //Artifacts
        Reg.registerWithItem("golden_chalice", GOLDEN_CHALICE, artGroup);
        Reg.registerWithItem("anchor", ANCHOR, artGroup);

        //Glass panes
        Reg.registerWithItem("iron_beveled_glass", IRON_BEVELED_GLASS, furnGroup);
        Reg.registerWithItem("copper_beveled_glass", COPPER_BEVELED_GLASS, furnGroup);
        Reg.registerWithItem("golden_beveled_glass", GOLDEN_BEVELED_GLASS, furnGroup);
        Reg.registerWithItem("netherite_beveled_glass", NETHERITE_BEVELED_GLASS, furnGroup);
        Reg.registerWithItem("beveled_amethyst_glass", BEVELED_AMETHYST_GLASS, furnGroup);
        Reg.registerWithItem("copper_beveled_amethyst_glass", COPPER_BEVELED_AMETHYST_GLASS, furnGroup);
        Reg.registerWithItem("golden_beveled_amethyst_glass", GOLDEN_BEVELED_AMETHYST_GLASS, furnGroup);
        Reg.registerWithItem("netherite_beveled_amethyst_glass", NETHERITE_BEVELED_AMETHYST_GLASS, furnGroup);

        //Jack o'Lantern variants
        Reg.registerWithItem("soul_jack_o_lantern", SOUL_JACK_O_LANTERN, furnGroup);
        Reg.registerWithItem("copperflame_jack_o_lantern", COPPERFLAME_JACK_O_LANTERN, furnGroup);

        //Chimneys
        Reg.registerWithItem("cobblestone_chimney", COBBLESTONE_CHIMNEY, furnGroup);
        Reg.registerWithItem("cobblestone_brick_chimney", COBBLESTONE_BRICK_CHIMNEY, furnGroup);
        Reg.registerWithItem("brick_chimney", BRICK_CHIMNEY, furnGroup);
        Reg.registerWithItem("carmine_brick_chimney", CARMINE_BRICK_CHIMNEY, furnGroup);
        Reg.registerWithItem("volcanic_brick_chimney", VOLCANIC_BRICK_CHIMNEY, furnGroup);

        //Bookshelf variants
        Reg.registerWithItem("cobwebbed_bookshelf", COBWEBBED_BOOKSHELF, furnGroup);
        Reg.registerWithItem("empty_bookshelf", EMPTY_BOOKSHELF, furnGroup);
        Reg.registerWithItem("bookshelf_empty_cobweb", BOOKSHELF_EMPTY_COBWEB, furnGroup);
        Reg.registerWithItem("bookshelf_with_lantern", BOOKSHELF_WITH_LANTERN, furnGroup);
        Reg.registerWithItem("cobwebbed_bookshelf_with_lantern", COBWEBBED_BOOKSHELF_WITH_LANTERN, furnGroup);
        Reg.registerWithItem("potion_shelf", POTION_SHELF, furnGroup);
        Reg.registerWithItem("cobwebbed_potion_shelf", COBWEBBED_POTION_SHELF, furnGroup);
        Reg.registerWithItem("anthropologists_shelf", ANTHROPOLOGISTS_SHELF, furnGroup);
        Reg.registerWithItem("cobwebbed_anthropologists_shelf", COBWEBBED_ANTHROPOLOGISTS_SHELF, furnGroup);
        Reg.registerWithItem("dish_shelf", DISH_SHELF, furnGroup);
        Reg.registerWithItem("cobwebbed_dish_shelf", COBWEBBED_DISH_SHELF, furnGroup);

        //Mushroom logs
        Reg.registerWithItem("morel_logs", MOREL_LOGS, furnGroup);
        Reg.registerWithItem("red_mushroom_logs", RED_MUSHROOM_LOGS, furnGroup);
        Reg.registerWithItem("brown_mushroom_logs", BROWN_MUSHROOM_LOGS, furnGroup);

        //Torches
        Reg.register("bone_torch", new WallStandingBlockItem(BONE_TORCH, WALL_BONE_TORCH, furnGroup));
        Reg.register("wall_bone_torch", WALL_BONE_TORCH);
        Reg.register("soul_bone_torch", new WallStandingBlockItem(SOUL_BONE_TORCH, SOUL_WALL_BONE_TORCH, furnGroup));
        Reg.register("soul_wall_bone_torch", SOUL_WALL_BONE_TORCH);
        Reg.register("redstone_bone_torch", new WallStandingBlockItem(REDSTONE_BONE_TORCH, REDSTONE_WALL_BONE_TORCH, furnGroup));
        Reg.register("redstone_wall_bone_torch", REDSTONE_WALL_BONE_TORCH);

        //Fuels
        //same as Coal Block
        FuelRegistry.INSTANCE.add(CHARCOAL_BLOCK, 16000);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(COPPER_CHAIN, EXPOSED_COPPER_CHAIN);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_COPPER_CHAIN, WEATHERED_COPPER_CHAIN);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_COPPER_CHAIN, OXIDIZED_COPPER_CHAIN);

        OxidizableBlocksRegistry.registerWaxableBlockPair(COPPER_CHAIN, WAXED_COPPER_CHAIN);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_COPPER_CHAIN, WAXED_EXPOSED_COPPER_CHAIN);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_COPPER_CHAIN, WAXED_WEATHERED_COPPER_CHAIN);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_COPPER_CHAIN, WAXED_OXIDIZED_COPPER_CHAIN);
    }
}
