package net.linkle.valley;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.linkle.valley.Registry.Initializers.Entities;
import net.minecraft.block.Block;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.render.RenderLayer;

import static net.linkle.valley.Registry.Initializers.Plants.*;
import static net.linkle.valley.Registry.Initializers.StoneBlocks.*;
import static net.linkle.valley.Registry.Initializers.Crops.*;
import static net.linkle.valley.Registry.Initializers.Furniture.*;
import static net.linkle.valley.Registry.Initializers.FurnitureCont.*;
import static net.linkle.valley.Registry.Initializers.PotBlock.POTTED_ROSE_SPRIG;

import java.util.ArrayList;

@Environment(EnvType.CLIENT)
public class ClientModInitFix implements ClientModInitializer {
    
    @Override
    public void onInitializeClient() {
        Entities.initializeClient();
        renderLayer();

        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> {
            return tintIndex == 1 ? BiomeColors.getFoliageColor(view, pos) : -1;
        }, APPLE_LEAVES);

        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> {
            return tintIndex == 1 ? 4764952 : -1;
        }, APPLE_LEAVES);

        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> {
            return tintIndex == 1 ? BiomeColors.getFoliageColor(view, pos) : -1;
        }, APPLE_LEAVES_EMPTY);

        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> {
            return tintIndex == 1 ? 4764952 : -1;
        }, APPLE_LEAVES_EMPTY);
    }
    
    private static void renderLayer() {
        var cullouts = new ArrayList<Block>(300);
        var translucents = new ArrayList<Block>(100);
        
        //bush texture fix
        cullouts.add(BITTER_BERRY_BUSH);
        cullouts.add(SPICY_BERRY_BUSH);
        cullouts.add(TOMATO_BUSH);
        cullouts.add(HOLLY_BUSH);

        cullouts.add(RICE_SEEDLINGS);
        cullouts.add(MAIZE_CROP);

        cullouts.add(REDSTONE_LANTERN);
        cullouts.add(WREATH);

        cullouts.add(PLANTER);
        cullouts.add(PLANTER_WATER);
        
        cullouts.add(PET_BED);

        cullouts.add(SOUL_HANGING);
        cullouts.add(LANTERN_HANGING);
        cullouts.add(FAIRY_HANGING);
        cullouts.add(RED_HANGING);

        cullouts.add(ROUNDED_BARREL);
        
        //spike trap fix
        cullouts.add(SPIKE_WALL_BLOCK);

        //nether plants
        //cullouts.add(BLAZE_NETTLE);
        //cullouts.add(WEAPING_BRIAR);
        //cullouts.add(CORRUPT_WART);
        //cullouts.add(TAINTED_BUSH);
        //cullouts.add(WATCHERS_GAZE);

        //bushes
        cullouts.add(TUMBLE_WEED);

        cullouts.add(JAR_BLOCK);
        cullouts.add(BOWL_BLOCK);
        cullouts.add(MUG_BLOCK);
        cullouts.add(BENTO_BLOCK);
        cullouts.add(STEW_POT);
        cullouts.add(TABLE_OAK);
        cullouts.add(TABLE_SPRUCE);
        cullouts.add(TABLE_BIRCH);
        cullouts.add(TABLE_ACACIA);
        cullouts.add(TABLE_JUNGLE);
        cullouts.add(TABLE_DARK);
        cullouts.add(TABLE_CRIMSON);
        cullouts.add(TABLE_WARPED);
        cullouts.add(TABLE_STONE);
        cullouts.add(STOOL_OAK);
        cullouts.add(STOOL_SPRUCE);
        cullouts.add(STOOL_JUNGLE);
        cullouts.add(STOOL_ACACIA);
        cullouts.add(STOOL_BIRCH);
        cullouts.add(STOOL_DARK);
        cullouts.add(STOOL_CRIMSON);
        cullouts.add(STOOL_WARPED);
        cullouts.add(SMALL_MUG_BLOCK);
        cullouts.add(STOOL_PLAID);
        cullouts.add(TABLE_PLAID);
        cullouts.add(CHAIR_STONE);
        
        cullouts.add(CREST);
        cullouts.add(GEAR);

        cullouts.add(SMALL_CACTUS);
        cullouts.add(ROSEBUSH);
        cullouts.add(BUSH);
        cullouts.add(LILACBUSH);
        cullouts.add(PEONYBUSH);
        cullouts.add(FERNBUSH);
        cullouts.add(TAPROOTS);
        cullouts.add(REED_BLOCK);
        cullouts.add(BUSH_DEAD_TALL);
        cullouts.add(BUSH_ALIVE);
        cullouts.add(HERBS);
        cullouts.add(BUSH_ALIVE_TALL);
        cullouts.add(WILD_BEET);
        cullouts.add(WILD_POTATO);
        cullouts.add(WILD_CARROT);
        cullouts.add(WILD_WHEAT);
        cullouts.add(WEAPING_SWAMP_WILLOW);
        cullouts.add(REDWOOD_SORREL);
        cullouts.add(DANDELION_PUFF);
        cullouts.add(ROCK_PILE);
        cullouts.add(RED_PILE);
        cullouts.add(BLUE_PILE);
        cullouts.add(MINER_BUSH);
        cullouts.add(ONION);
        cullouts.add(SNOW_BUSH);
        cullouts.add(SNOW_YAM);
        cullouts.add(WINTER_ROOT);
        cullouts.add(SNOW_ROCK_PILE);
        cullouts.add(MOSSY_VINE);
        cullouts.add(MOSSY_VINE_PLANT);
        cullouts.add(JUNGLE_BUSH);
        cullouts.add(SWAMP_BUSH);
        cullouts.add(JUNGLE_CAP);
        cullouts.add(SPROUT);
        cullouts.add(SWAMP_RIBBON);
        cullouts.add(BLACK_DAHLIA);
        cullouts.add(LAVENDER);
        cullouts.add(LAVENDER_SPRIG);
        cullouts.add(ROSE_SPRIG);
        cullouts.add(ICE_ROSE);
        cullouts.add(ORANGE_FERN);
        cullouts.add(ORANGE_BEAUTY);
        cullouts.add(AMERANTH_BLOCK);
        cullouts.add(APPLE_LEAVES);
        cullouts.add(APPLE_SAPLING);
        cullouts.add(CROCUS);
        cullouts.add(MOREL);
        cullouts.add(HEDGE);

        cullouts.add(POTTED_ROSE_SPRIG);

        cullouts.add(FROZEN_FOSSIL);
        cullouts.add(CICADA);
        
        //Seed Type Crops
        cullouts.add(PUFF_CROP_BLOCK);
        cullouts.add(GB_CROP_BLOCK);
        cullouts.add(MANDRAKE_CROP_BLOCK);
        cullouts.add(CRYSTAL_CROP_BLOCK);

        translucents.add(HANGING);
        translucents.add(HANGING_F);
        translucents.add(HANGING_R);
        cullouts.add(HANGING_D);
        cullouts.add(HANGING_A);
        cullouts.add(HANGING_E);

        translucents.add(CRYSTAL);
        translucents.add(FROZEN_FOSSIL);

        cullouts.add(ROPE_BRIDGE);
        cullouts.add(ROPE_BRIDGE_ANCHOR);

        cullouts.add(SCREEN);
        cullouts.add(NET);
        cullouts.add(IRON_LADDER);
        cullouts.add(IRON_LADDER);
        cullouts.add(BAMBOO_LADDER);
        cullouts.add(OAK_LADDER);
        cullouts.add(BIRCH_LADDER);
        cullouts.add(DARK_LADDER);
        cullouts.add(WARPED_LADDER);
        cullouts.add(CRIMSON_LADDER);
        cullouts.add(ACACIA_LADDER);
        cullouts.add(JUNGLE_LADDER);
        cullouts.add(SPRUCE_LADDER);

        cullouts.add(ANCHOR);

        cullouts.add(SCARE);
        cullouts.add(SCARE_HAT);
        cullouts.add(SCARE_GLOW);
        cullouts.add(SCARE_HAT_GLOW);
        cullouts.add(SCARE_HAT_SOUL);
        cullouts.add(SCARE_SOUL);

        cullouts.add(SCARE_TARGET);
        cullouts.add(RARE_MELON);
        cullouts.add(RARE_SKELETON);
        cullouts.add(RARE_ZOMBIE);

        cullouts.add(SNOW);

        cullouts.add(SCARE_COPPER);
        cullouts.add(SCARE_HAT_COPPER);

        cullouts.add(STEW_POT_CAMPFIRE);

        cullouts.add(BEVELED_PANE);
        cullouts.add(BEVELED_PANE_COPPER);
        cullouts.add(BEVELED_PANE_GOLD);
        cullouts.add(BEVELED_PANE_NETHERITE);
        
        //Amethyst
        translucents.add(BEVELED_PANE_A);
        translucents.add(BEVELED_PANE_A_C);
        translucents.add(BEVELED_PANE_A_G);
        translucents.add(BEVELED_PANE_A_N);

        //translucents.add(CAMPFIRE_POT_BLOCK_NORM);
        //translucents.add(CAMPFIRE_POT_BLOCK_SOUL);
        cullouts.add(BRAZIER);
        cullouts.add(SOUL_BRAZIER);
        cullouts.add(COPPER_BRAZIER);
        cullouts.add(BLAZE_BRAZIER);

        cullouts.add(BLAZE_BRAZIER);

        cullouts.add(STUMP_BROWN);
        cullouts.add(STUMP_RED);
        cullouts.add(STUMP_MOREL);

        cullouts.add(APPLE_LEAVES_EMPTY);
        cullouts.add(KEG);

        cullouts.add(STUFFY_BROWN);
        cullouts.add(STUFFY_WHITE);

        cullouts.add(CHAIN_C);
        cullouts.add(CHAIN_G);
        cullouts.add(CHAIN_N);
        
        cullouts.add(GOLEM_R);
        cullouts.add(GOLEM_W);
        cullouts.add(GOLEM_I);
        
        cullouts.add(CAMPFIRE_RING);
        
        translucents.add(LOGPILE);

        cullouts.add(GIANT_RED);
        cullouts.add(GIANT_BROWN);
        translucents.add(BRAZIER_METAL);
        translucents.add(SPIDER_EGG_BLOCK);
        translucents.add(COIN_STACK);

        // Remapping block's render layer.
        var layerMap = BlockRenderLayerMap.INSTANCE;
        for (var block : cullouts) {
            layerMap.putBlock(block, RenderLayer.getCutout());
        }
        for (var block : translucents) {
            layerMap.putBlock(block, RenderLayer.getTranslucent());
        }
    }
}