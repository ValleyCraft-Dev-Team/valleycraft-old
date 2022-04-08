package io.github.linkle.valleycraft.init;

import io.github.linkle.valleycraft.blocks.decorations.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class BuildingBlocks {
    // Mixed Bricks
    public static final Block MIXED_BRICKS = new BrownBlock();
    public static final Block CRACKED_MIXED_BRICKS = new BrownBlock();
    public static final Block MOSSY_MIXED_BRICKS = new BrownBlock();
    public static final Block MIXED_BRICK_STAIRS = new BrownStairsBlock();
    public static final Block MIXED_BRICK_SLAB = new BrownSlabBlock();

    // Cobblestone Bricks
    public static final Block COBBLESTONE_BRICKS = new PolishedStoneBlock();
    public static final Block MOSSY_COBBLESTONE_BRICKS = new PolishedStoneBlock();
    public static final Block CHISELED_COBBLESTONE_BRICKS = new PolishedStoneBlock();
    public static final Block COBBLESTONE_BRICK_STAIRS = new TileStairsBlock(COBBLESTONE_BRICKS);
    public static final Block COBBLESTONE_BRICK_SLAB = new TileSlabBlock();

    // Polished Stone & Stone Tiles
    public static final Block POLISHED_STONE = new PolishedStoneBlock();
    public static final Block STONE_TILES = new PolishedStoneBlock();
    public static final Block STONE_TILE_SLAB = new TileSlabBlock();
    public static final Block STONE_TILE_STAIRS = new TileStairsBlock(STONE_TILES);

    // Smooth Stone Tiles
    public static final Block SMOOTH_STONE_TILES = new PolishedStoneBlock();
    public static final Block SMOOTH_STONE_TILE_SLAB = new TileSlabBlock();
    public static final Block SMOOTH_STONE_TILE_STAIRS = new TileStairsBlock(SMOOTH_STONE_TILES);

    // Quartz Tiles
    public static final Block QUARTZ_TILES = new PolishedStoneBlock();
    public static final Block QUARTZ_TILE_SLAB = new TileSlabBlock();
    public static final Block QUARTZ_TILE_STAIRS = new TileStairsBlock(QUARTZ_TILES);

    // Kitchen Tiles
    public static final Block KITCHEN_TILES = new PolishedStoneBlock();
    public static final Block KITCHEN_TILE_SLAB = new TileSlabBlock();
    public static final Block KITCHEN_TILE_STAIRS = new TileStairsBlock(KITCHEN_TILES);

    // Volcanic Tiles
    public static final Block VOLCANIC_TILES = new PolishedStoneBlock();
    public static final Block VOLCANIC_TILE_SLAB = new TileSlabBlock();
    public static final Block VOLCANIC_TILE_STAIRS = new TileStairsBlock(VOLCANIC_TILES);

    // Volcanic Bricks & Polished Volcanic Stone
    public static final Block POLISHED_VOLCANIC_STONE = new StoneBlock();
    public static final Block VOLCANIC_BRICKS = new PolishedStoneBlock();
    public static final Block CHISELED_VOLCANIC_BRICKS = new PolishedStoneBlock();
    public static final Block VOLCANIC_BRICK_STAIRS = new TileStairsBlock(VOLCANIC_BRICKS);
    public static final Block VOLCANIC_BRICK_SLAB = new TileSlabBlock();

    // Carmine Bricks & Polished Carmine
    public static final Block POLISHED_CARMINE = new BrownBlock();
    public static final Block CARMINE_BRICKS = new BrownBlock();
    public static final Block MOSSY_CARMINE = new BrownBlock();
    public static final Block CRACKED_CARMINE = new BrownBlock();
    public static final Block CHISELED_CARMINE = new BrownBlock();
    public static final Block CARMINE_BRICK_STAIRS = new BrownStairsBlock();
    public static final Block CARMINE_BRICK_SLAB = new BrownSlabBlock();

    // Encrusted Sandstone
    public static final Block ENCRUSTED_SANDSTONE = new EncrustedBlock();

    public static void initialize() {
        var furnGroup = new Item.Settings().group(ItemGroups.FURNITURE_GROUP);

        // Mixed Bricks
        Reg.registerWithItem("mixed_bricks", MIXED_BRICKS, furnGroup);
        Reg.registerWithItem("cracked_mixed_bricks", CRACKED_MIXED_BRICKS, furnGroup);
        Reg.registerWithItem("mossy_mixed_bricks", MOSSY_MIXED_BRICKS, furnGroup);
        Reg.registerWithItem("mixed_brick_stairs", MIXED_BRICK_STAIRS, furnGroup);
        Reg.registerWithItem("mixed_brick_slab", MIXED_BRICK_SLAB, furnGroup);

        // Cobblestone Bricks
        Reg.registerWithItem("cobblestone_bricks", COBBLESTONE_BRICKS, furnGroup);
        Reg.registerWithItem("mossy_cobblestone_bricks", MOSSY_COBBLESTONE_BRICKS, furnGroup);
        Reg.registerWithItem("chiseled_cobblestone_bricks", CHISELED_COBBLESTONE_BRICKS, furnGroup);
        Reg.registerWithItem("cobblestone_brick_stairs", COBBLESTONE_BRICK_STAIRS, furnGroup);
        Reg.registerWithItem("cobblestone_brick_slab", COBBLESTONE_BRICK_SLAB, furnGroup);

        // Polished Stone & Stone Tiles
        Reg.registerWithItem("polished_stone", POLISHED_STONE, furnGroup);
        Reg.registerWithItem("stone_tiles", STONE_TILES, furnGroup);
        Reg.registerWithItem("stone_tile_stairs", STONE_TILE_STAIRS, furnGroup);
        Reg.registerWithItem("stone_tile_slab", STONE_TILE_SLAB, furnGroup);

        // Smooth Stone Tiles
        Reg.registerWithItem("smooth_stone_tiles", SMOOTH_STONE_TILES, furnGroup);
        Reg.registerWithItem("smooth_stone_tile_slab", SMOOTH_STONE_TILE_SLAB, furnGroup);
        Reg.registerWithItem("smooth_stone_tile_stairs", SMOOTH_STONE_TILE_STAIRS, furnGroup);

        // Quartz Tiles
        Reg.registerWithItem("quartz_tiles", QUARTZ_TILES, furnGroup);
        Reg.registerWithItem("quartz_tile_stairs", QUARTZ_TILE_STAIRS, furnGroup);
        Reg.registerWithItem("quartz_tile_slab", QUARTZ_TILE_SLAB, furnGroup);

        // Kitchen Tiles
        Reg.registerWithItem("kitchen_tiles", KITCHEN_TILES, furnGroup);
        Reg.registerWithItem("kitchen_tile_stairs", KITCHEN_TILE_STAIRS, furnGroup);
        Reg.registerWithItem("kitchen_tile_slab", KITCHEN_TILE_SLAB, furnGroup);

        // Volcanic Tiles
        Reg.registerWithItem("volcanic_tiles", VOLCANIC_TILES, furnGroup);
        Reg.registerWithItem("volcanic_tile_stairs", VOLCANIC_TILE_STAIRS, furnGroup);
        Reg.registerWithItem("volcanic_tile_slab", VOLCANIC_TILE_SLAB, furnGroup);

        // Volcanic Bricks & Polished Volcanic Stone
        Reg.registerWithItem("volcanic_bricks", VOLCANIC_BRICKS, furnGroup);
        Reg.registerWithItem("volcanic_brick_stairs", VOLCANIC_BRICK_STAIRS, furnGroup);
        Reg.registerWithItem("volcanic_brick_slab", VOLCANIC_BRICK_SLAB, furnGroup);
        Reg.registerWithItem("chiseled_volcanic_bricks", CHISELED_VOLCANIC_BRICKS, furnGroup);
        Reg.registerWithItem("polished_volcanic_stone", POLISHED_VOLCANIC_STONE, furnGroup);

        // Carmine brick blocks & polished carmine
        Reg.registerWithItem("carmine_bricks", CARMINE_BRICKS, furnGroup);
        Reg.registerWithItem("carmine_brick_stairs", CARMINE_BRICK_STAIRS, furnGroup);
        Reg.registerWithItem("carmine_brick_slab", CARMINE_BRICK_SLAB, furnGroup);
        Reg.registerWithItem("chiseled_carmine", CHISELED_CARMINE, furnGroup);
        Reg.registerWithItem("cracked_carmine_bricks", CRACKED_CARMINE, furnGroup);
        Reg.registerWithItem("mossy_carmine_bricks", MOSSY_CARMINE, furnGroup);
        Reg.registerWithItem("polished_carmine", POLISHED_CARMINE, furnGroup);

        // Encrusted sandstone
        Reg.registerWithItem("encrusted_sandstone", ENCRUSTED_SANDSTONE, furnGroup);
    }
}
