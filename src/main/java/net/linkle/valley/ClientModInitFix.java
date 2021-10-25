package net.linkle.valley;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.linkle.valley.Registry.Initializers.Entities;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.render.RenderLayer;

import static net.linkle.valley.Registry.Initializers.Blocks.*;
import static net.linkle.valley.Registry.Initializers.BlocksCont.*;
import static net.linkle.valley.Registry.Initializers.Crops.*;
import static net.linkle.valley.Registry.Initializers.Furniture.*;
import static net.linkle.valley.Registry.Initializers.FurnitureCont.*;
import static net.linkle.valley.Registry.Initializers.PotBlock.POTTED_ROSE_SPRIG;

public class ClientModInitFix implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        Entities.initializeClient();
        
        //bush texture fix
        BlockRenderLayerMap.INSTANCE.putBlock(BITTER_BERRY_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SPICY_BERRY_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TOMATO_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(HOLLY_BUSH, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(RICE_SEEDLINGS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MAIZE_CROP, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(REDSTONE_LANTERN, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(REDSTONE_LANTERN, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(WREATH, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(WREATH, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(PLANTER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(PLANTER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(PLANTER_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(PLANTER_WATER, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(PET_BED, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(PET_BED, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(SOUL_HANGING, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SOUL_HANGING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(LANTERN_HANGING, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(LANTERN_HANGING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FAIRY_HANGING, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(FAIRY_HANGING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(RED_HANGING, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(RED_HANGING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ROUNDED_BARREL, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ROUNDED_BARREL, RenderLayer.getCutout());
        //spike trap fix
        BlockRenderLayerMap.INSTANCE.putBlock(SPIKE_WALL_BLOCK, RenderLayer.getCutout());

        //nether plants
        //BlockRenderLayerMap.INSTANCE.putBlock(BLAZE_NETTLE, RenderLayer.getCutout());
        //BlockRenderLayerMap.INSTANCE.putBlock(WEAPING_BRIAR, RenderLayer.getCutout());
        //BlockRenderLayerMap.INSTANCE.putBlock(CORRUPT_WART, RenderLayer.getCutout());
        //BlockRenderLayerMap.INSTANCE.putBlock(TAINTED_BUSH, RenderLayer.getCutout());
        //BlockRenderLayerMap.INSTANCE.putBlock(WATCHERS_GAZE, RenderLayer.getCutout());

        //bushes
        BlockRenderLayerMap.INSTANCE.putBlock(TUMBLE_WEED, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(JAR_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(JAR_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BOWL_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(BOWL_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MUG_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(MUG_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BENTO_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(BENTO_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(STEW_POT, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(STEW_POT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TABLE_OAK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(TABLE_OAK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TABLE_SPRUCE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(TABLE_SPRUCE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TABLE_BIRCH, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(TABLE_BIRCH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TABLE_ACACIA, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(TABLE_ACACIA, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TABLE_JUNGLE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(TABLE_JUNGLE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TABLE_DARK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(TABLE_DARK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TABLE_CRIMSON, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(TABLE_CRIMSON, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TABLE_WARPED, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(TABLE_WARPED, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TABLE_STONE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(TABLE_STONE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(STOOL_OAK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(STOOL_OAK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(STOOL_SPRUCE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(STOOL_SPRUCE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(STOOL_JUNGLE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(STOOL_JUNGLE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(STOOL_ACACIA, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(STOOL_ACACIA, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(STOOL_BIRCH, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(STOOL_BIRCH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(STOOL_DARK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(STOOL_DARK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(STOOL_CRIMSON, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(STOOL_CRIMSON, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(STOOL_WARPED, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(STOOL_WARPED, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SMALL_MUG_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SMALL_MUG_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(STOOL_PLAID, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(STOOL_PLAID, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TABLE_PLAID, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(TABLE_PLAID, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CHAIR_STONE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(CHAIR_STONE, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(CREST, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(CREST, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GEAR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(GEAR, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(SMALL_CACTUS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SMALL_CACTUS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ROSEBUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(LILACBUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(PEONYBUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FERNBUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(REED_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(REED_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BUSH_DEAD_TALL, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(BUSH_DEAD_TALL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BUSH_ALIVE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(BUSH_ALIVE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BUSH_ALIVE_TALL, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(BUSH_ALIVE_TALL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WILD_BEET, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(WILD_BEET, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WILD_POTATO, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(WILD_POTATO, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WILD_CARROT, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(WILD_CARROT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WILD_WHEAT, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(WILD_WHEAT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WEAPING_SWAMP_WILLOW, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(WEAPING_SWAMP_WILLOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(REDWOOD_SORREL, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(REDWOOD_SORREL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DANDELION_PUFF, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DANDELION_PUFF, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ROCK_PILE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ROCK_PILE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(RED_PILE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(RED_PILE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BLUE_PILE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(BLUE_PILE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MINER_BUSH, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(MINER_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ONION, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ONION, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SNOW_BUSH, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SNOW_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SNOW_YAM, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SNOW_YAM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WINTER_ROOT, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(WINTER_ROOT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SNOW_ROCK_PILE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SNOW_ROCK_PILE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MOSSY_VINE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(MOSSY_VINE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(JUNGLE_BUSH, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(JUNGLE_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SWAMP_BUSH, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SWAMP_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(JUNGLE_CAP, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(JUNGLE_CAP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SPROUT, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SPROUT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SWAMP_RIBBON, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SWAMP_RIBBON, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BLACK_DAHLIA, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(BLACK_DAHLIA, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(LAVENDER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(LAVENDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(LAVENDER_SPRIG, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(LAVENDER_SPRIG, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ROSE_SPRIG, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ROSE_SPRIG, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ICE_ROSE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ICE_ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ORANGE_FERN, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ORANGE_FERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ORANGE_BEAUTY, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ORANGE_BEAUTY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AMERANTH_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(AMERANTH_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(APPLE_LEAVES, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(APPLE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(APPLE_SAPLING, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(APPLE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CROCUS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(CROCUS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MOREL, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(MOREL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(HEDGE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(HEDGE, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(POTTED_ROSE_SPRIG, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(POTTED_ROSE_SPRIG, RenderLayer.getTranslucent());

        BlockRenderLayerMap.INSTANCE.putBlock(FROZEN_FOSSIL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FROZEN_FOSSIL, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(CICADA, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CICADA, RenderLayer.getTranslucent());

        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> {
            if (tintIndex == 1)
                return BiomeColors.getFoliageColor(view, pos);
            return 0xFFFFFFFF;
        }, APPLE_LEAVES);

        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> {
            if (tintIndex == 1)
                return 4764952;
            return 0xFFFFFFFF;
        }, APPLE_LEAVES);

        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> {
            if (tintIndex == 1)
                return BiomeColors.getFoliageColor(view, pos);
            return 0xFFFFFFFF;
        }, APPLE_LEAVES_EMPTY);

        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> {
            if (tintIndex == 1)
                return 4764952;
            return 0xFFFFFFFF;
        }, APPLE_LEAVES_EMPTY);

        //Seed Type Crops
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), PUFF_CROP_BLOCK);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), GB_CROP_BLOCK);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), MANDRAKE_CROP_BLOCK);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), CRYSTAL_CROP_BLOCK);

        BlockRenderLayerMap.INSTANCE.putBlock(HANGING, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(HANGING_F, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(HANGING_R, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(HANGING_D, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(HANGING_D, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(HANGING_A, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(HANGING_A, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(HANGING_E, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(HANGING_E, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(CRYSTAL, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(CRYSTAL_FROZEN, RenderLayer.getTranslucent());

        BlockRenderLayerMap.INSTANCE.putBlock(ROPE_BRIDGE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ROPE_BRIDGE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ROPE_BRIDGE_ANCHOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ROPE_BRIDGE_ANCHOR, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(SCREEN, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SCREEN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(NET, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(NET, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(IRON_LADDER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(IRON_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BAMBOO_LADDER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(BAMBOO_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OAK_LADDER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(OAK_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BIRCH_LADDER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(BIRCH_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DARK_LADDER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DARK_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WARPED_LADDER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(WARPED_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CRIMSON_LADDER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(CRIMSON_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ACACIA_LADDER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ACACIA_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(JUNGLE_LADDER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(JUNGLE_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SPRUCE_LADDER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SPRUCE_LADDER, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ANCHOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ANCHOR, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(SCARE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SCARE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SCARE_HAT, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SCARE_HAT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SCARE_GLOW, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SCARE_GLOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SCARE_HAT_GLOW, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SCARE_HAT_GLOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SCARE_HAT_SOUL, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SCARE_HAT_SOUL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SCARE_SOUL, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SCARE_SOUL, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(SCARE_TARGET, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SCARE_TARGET, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(RARE_MELON, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(RARE_MELON, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(RARE_SKELETON, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(RARE_SKELETON, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(RARE_ZOMBIE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(RARE_ZOMBIE, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(SNOW, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SNOW, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(SCARE_COPPER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SCARE_COPPER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SCARE_HAT_COPPER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SCARE_HAT_COPPER, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(STEW_POT_CAMPFIRE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(STEW_POT_CAMPFIRE, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BEVELED_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(BEVELED_PANE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BEVELED_PANE_COPPER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(BEVELED_PANE_COPPER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BEVELED_PANE_GOLD, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(BEVELED_PANE_GOLD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BEVELED_PANE_NETHERITE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(BEVELED_PANE_NETHERITE, RenderLayer.getCutout());
        //Amethyst
        BlockRenderLayerMap.INSTANCE.putBlock(BEVELED_PANE_A, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(BEVELED_PANE_A_C, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(BEVELED_PANE_A_G, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(BEVELED_PANE_A_N, RenderLayer.getTranslucent());

        //BlockRenderLayerMap.INSTANCE.putBlock(CAMPFIRE_POT_BLOCK_NORM, RenderLayer.getTranslucent());
        //BlockRenderLayerMap.INSTANCE.putBlock(CAMPFIRE_POT_BLOCK_SOUL, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(BRAZIER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SOUL_BRAZIER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(COPPER_BRAZIER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(BLAZE_BRAZIER, RenderLayer.getTranslucent());

        BlockRenderLayerMap.INSTANCE.putBlock(CHIMNEY_COBBLE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(CHIMNEY_COBBLE, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(STUMP_BROWN, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(STUMP_BROWN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(STUMP_RED, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(STUMP_RED, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(STUMP_MOREL, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(STUMP_MOREL, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(APPLE_LEAVES_EMPTY, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(APPLE_LEAVES_EMPTY, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(KEG, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(KEG, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(STUFFY_BROWN, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(STUFFY_BROWN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(STUFFY_WHITE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(STUFFY_WHITE, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(CHAIN_C, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(CHAIN_C, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CHAIN_G, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(CHAIN_G, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CHAIN_N, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(CHAIN_N, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(GOLEM_R, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(GOLEM_R, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOLEM_W, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(GOLEM_W, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GOLEM_I, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(GOLEM_I, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(CAMPFIRE_RING, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(CAMPFIRE_RING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(LOGPILE, RenderLayer.getTranslucent());
    }
}