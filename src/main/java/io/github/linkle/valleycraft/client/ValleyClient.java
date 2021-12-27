package io.github.linkle.valleycraft.client;

import io.github.linkle.valleycraft.init.Entities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.render.RenderLayer;

import java.util.ArrayList;

import static io.github.linkle.valleycraft.init.Aquatic.*;
import static io.github.linkle.valleycraft.init.Crops.*;
import static io.github.linkle.valleycraft.init.Furniture.*;
import static io.github.linkle.valleycraft.init.FurnitureCont.CAMPFIRE_RING;
import static io.github.linkle.valleycraft.init.Plants.*;
import static io.github.linkle.valleycraft.init.PotBlock.POTTED_ROSE_SPRIG;

@Environment(EnvType.CLIENT)
public class ValleyClient implements ClientModInitializer {
    
    @Override
    public void onInitializeClient() {
        Entities.initializeClient();
        renderLayer();

        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) ->
                tintIndex == 1 ? BiomeColors.getFoliageColor(view, pos) : -1,
                APPLE_LEAVES
        );
        ColorProviderRegistry.ITEM.register((stack, tintIndex) ->
                tintIndex == 1 ? 4764952 : -1,
                APPLE_LEAVES
        );

        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) ->
                tintIndex == 1 ? BiomeColors.getFoliageColor(view, pos) : -1,
                APPLE_LEAVES_EMPTY
        );
        ColorProviderRegistry.ITEM.register((stack, tintIndex) ->
                tintIndex == 1 ? 4764952 : -1,
                APPLE_LEAVES_EMPTY
        );
    }
    
    private static void renderLayer() {
        var culloutBlocks = new ArrayList<Block>(300);
        var translucentBlocks = new ArrayList<Block>(100);
        
        //bush texture fix
        culloutBlocks.add(BITTER_BERRY_BUSH);
        culloutBlocks.add(SPICY_BERRY_BUSH);
        culloutBlocks.add(TOMATO_BUSH);
        culloutBlocks.add(HOLLY_BUSH);

        culloutBlocks.add(RICE_SEEDLINGS);
        culloutBlocks.add(MAIZE_CROP);

        culloutBlocks.add(REDSTONE_LANTERN);
        culloutBlocks.add(WREATH);

        culloutBlocks.add(SOUL_HANGING);
        culloutBlocks.add(LANTERN_HANGING);
        culloutBlocks.add(RED_HANGING);

        culloutBlocks.add(ROUNDED_BARREL);
        
        //spike trap fix
        culloutBlocks.add(SPIKE_WALL_BLOCK);

        //nether plants
        //cullouts.add(BLAZE_NETTLE);
        //cullouts.add(WEAPING_BRIAR);
        //cullouts.add(CORRUPT_WART);
        //cullouts.add(TAINTED_BUSH);
        //cullouts.add(WATCHERS_GAZE);

        //bushes
        culloutBlocks.add(TUMBLE_WEED);

        //culloutBlocks.add(BOWL_BLOCK);
        //culloutBlocks.add(MUG_BLOCK);
        //culloutBlocks.add(BENTO_BLOCK);
        //culloutBlocks.add(STEW_POT);

        culloutBlocks.add(SMALL_CACTUS);
        culloutBlocks.add(ROSEBUSH);
        culloutBlocks.add(BUSH);
        culloutBlocks.add(LILACBUSH);
        culloutBlocks.add(PEONYBUSH);
        culloutBlocks.add(FERNBUSH);
        culloutBlocks.add(TAPROOTS);
        culloutBlocks.add(REED_BLOCK);
        culloutBlocks.add(BUSH_ALIVE);
        culloutBlocks.add(HERBS);
        culloutBlocks.add(WILD_BEET);
        culloutBlocks.add(WILD_POTATO);
        culloutBlocks.add(WILD_CARROT);
        culloutBlocks.add(WILD_WHEAT);
        culloutBlocks.add(WEAPING_SWAMP_WILLOW);
        culloutBlocks.add(REDWOOD_SORREL);
        culloutBlocks.add(DANDELION_PUFF);
        culloutBlocks.add(PANFLOWER);
        culloutBlocks.add(HONEY_CLUSTER);
        culloutBlocks.add(FLOWERING_CACTUS);
        culloutBlocks.add(PEPPER_CROP_BLOCK);
        culloutBlocks.add(EGGPLANT_CROP_BLOCK);
        //culloutBlocks.add(ROCK_PILE);
        culloutBlocks.add(REDSTONE_CRYSTAL);
        culloutBlocks.add(ONION_CROP_BLOCK);
        culloutBlocks.add(SNOW_CROP_BLOCK);
        culloutBlocks.add(MINERS_CROP_BLOCK);
        culloutBlocks.add(SNOW_BUSH);
        //culloutBlocks.add(SNOW_ROCK_PILE);
        culloutBlocks.add(MOSSY_VINES);
        culloutBlocks.add(MOSSY_VINES_PLANT);
        culloutBlocks.add(DRY_VINES);
        culloutBlocks.add(DRY_VINES_PLANT);
        culloutBlocks.add(JUNGLE_BUSH);
        culloutBlocks.add(SWAMP_BUSH);
        culloutBlocks.add(JUNGLE_CAP);
        culloutBlocks.add(SPROUT);
        culloutBlocks.add(SWAMP_RIBBON);
        culloutBlocks.add(BLACK_DAHLIA);
        culloutBlocks.add(LAVENDER);
        culloutBlocks.add(LAVENDER_SPRIG);
        culloutBlocks.add(ROSE_SPRIG);
        culloutBlocks.add(ICE_ROSE);
        culloutBlocks.add(ORANGE_FERN);
        culloutBlocks.add(ORANGE_BEAUTY);
        culloutBlocks.add(APPLE_LEAVES);
        culloutBlocks.add(APPLE_SAPLING);
        culloutBlocks.add(CROCUS);
        culloutBlocks.add(MOREL);
        culloutBlocks.add(HEDGE);

        culloutBlocks.add(POTTED_ROSE_SPRIG);

        //culloutBlocks.add(FROZEN_FOSSIL);
        //culloutBlocks.add(CICADA);
        
        //Seed Type Crops
        culloutBlocks.add(PUFF_CROP_BLOCK);
        culloutBlocks.add(GB_CROP_BLOCK);
        culloutBlocks.add(MANDRAKE_CROP_BLOCK);
        culloutBlocks.add(CRYSTAL_CROP_BLOCK);

        culloutBlocks.add(HANGING);

        culloutBlocks.add(ROPE_BRIDGE);
        culloutBlocks.add(ROPE_BRIDGE_ANCHOR);

        culloutBlocks.add(SCREEN);
        culloutBlocks.add(NET);
        culloutBlocks.add(IRON_LADDER);
        culloutBlocks.add(IRON_LADDER);
        culloutBlocks.add(BAMBOO_LADDER);
        culloutBlocks.add(OAK_LADDER);
        culloutBlocks.add(BIRCH_LADDER);
        culloutBlocks.add(DARK_LADDER);
        culloutBlocks.add(WARPED_LADDER);
        culloutBlocks.add(CRIMSON_LADDER);
        culloutBlocks.add(ACACIA_LADDER);
        culloutBlocks.add(JUNGLE_LADDER);
        culloutBlocks.add(SPRUCE_LADDER);

        culloutBlocks.add(ANCHOR);

        culloutBlocks.add(SCARE);
        culloutBlocks.add(SCARE_HAT);
        culloutBlocks.add(SCARE_GLOW);
        culloutBlocks.add(SCARE_HAT_GLOW);
        culloutBlocks.add(SCARE_HAT_SOUL);
        culloutBlocks.add(SCARE_SOUL);

        culloutBlocks.add(SCARE_TARGET);
        culloutBlocks.add(RARE_MELON);
        culloutBlocks.add(RARE_SKELETON);
        culloutBlocks.add(RARE_ZOMBIE);

        culloutBlocks.add(SNOW);

        culloutBlocks.add(SCARE_COPPER);
        culloutBlocks.add(SCARE_HAT_COPPER);

        culloutBlocks.add(STEW_POT_CAMPFIRE);

        culloutBlocks.add(BEVELED_PANE);
        culloutBlocks.add(BEVELED_PANE_COPPER);
        culloutBlocks.add(BEVELED_PANE_GOLD);
        culloutBlocks.add(BEVELED_PANE_NETHERITE);
        
        //Amethyst
        translucentBlocks.add(BEVELED_PANE_A);
        translucentBlocks.add(BEVELED_PANE_A_C);
        translucentBlocks.add(BEVELED_PANE_A_G);
        translucentBlocks.add(BEVELED_PANE_A_N);

        culloutBlocks.add(BRAZIER);
        culloutBlocks.add(SOUL_BRAZIER);
        culloutBlocks.add(COPPER_BRAZIER);
        culloutBlocks.add(BLAZE_BRAZIER);

        culloutBlocks.add(BLAZE_BRAZIER);

        culloutBlocks.add(STUMP_BROWN);
        culloutBlocks.add(STUMP_RED);
        culloutBlocks.add(STUMP_MOREL);

        culloutBlocks.add(APPLE_LEAVES_EMPTY);

        culloutBlocks.add(CHAIN_C);
        culloutBlocks.add(CHAIN_G);
        culloutBlocks.add(CHAIN_N);
        
        culloutBlocks.add(CAMPFIRE_RING);
        
        culloutBlocks.add(SPIDER_EGG_BLOCK);
        culloutBlocks.add(RED_SEA_GRASS);
        culloutBlocks.add(GLOW_KELP_PLANT);
        culloutBlocks.add(GLOW_KELP);
        translucentBlocks.add(BRAZIER_METAL);

        // Remapping block's render layer. This code should always be last!
        var layerMap = BlockRenderLayerMap.INSTANCE;
        for (var block : culloutBlocks) {
            layerMap.putBlock(block, RenderLayer.getCutout());
        }
        for (var block : translucentBlocks) {
            layerMap.putBlock(block, RenderLayer.getTranslucent());
        }
    }
}