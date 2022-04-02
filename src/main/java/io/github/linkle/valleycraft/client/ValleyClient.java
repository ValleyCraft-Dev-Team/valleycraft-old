package io.github.linkle.valleycraft.client;

import io.github.linkle.valleycraft.client.screen.HandledScreens;
import io.github.linkle.valleycraft.config.ConfigLangGen;
import io.github.linkle.valleycraft.init.Entities;
import io.github.linkle.valleycraft.network.ClientNetwork;
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
import static io.github.linkle.valleycraft.init.FurnitureCont.STARGAZING_SUPPLIES;
import static io.github.linkle.valleycraft.init.Plants.*;
import static io.github.linkle.valleycraft.init.PotBlock.POTTED_ROSE_SPRIG;

@Environment(EnvType.CLIENT)
public class ValleyClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ConfigLangGen.initialize();
        Entities.initializeClient();
        HandledScreens.initialize();
        ClientNetwork.initialize();
        renderLayer();

        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) ->
        tintIndex == 1 ? BiomeColors.getFoliageColor(view, pos) : -1,
                FRUIT_BEARING_APPLE_LEAVES
                );
        ColorProviderRegistry.ITEM.register((stack, tintIndex) ->
        tintIndex == 1 ? 4764952 : -1,
                FRUIT_BEARING_APPLE_LEAVES
                );

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
                COMMON_BUSH
                );
        ColorProviderRegistry.ITEM.register((stack, tintIndex) ->
        4764952,
                COMMON_BUSH
                );
    }

    private static void renderLayer() {
        var culloutBlocks = new ArrayList<Block>(300);
        var translucentBlocks = new ArrayList<Block>(100);

        //bush texture fix
        culloutBlocks.add(BITTER_BERRY_BUSH);
        culloutBlocks.add(SOUR_BERRY_BUSH);
        culloutBlocks.add(SPICY_BERRY_BUSH);
        culloutBlocks.add(TOMATO_BUSH);
        culloutBlocks.add(HOLLY_BUSH);

        culloutBlocks.add(RICE_CROP);
        culloutBlocks.add(CORN_CROP);

        culloutBlocks.add(REDSTONE_LANTERN);
        culloutBlocks.add(WREATH);

        culloutBlocks.add(HANGING_SOUL_LANTERN);
        culloutBlocks.add(HANGING_LANTERN);
        culloutBlocks.add(HANGING_REDSTONE_LANTERN);

        culloutBlocks.add(ROUNDED_BARREL);

        //spike trap fix
        culloutBlocks.add(SPIKE_WALL_BLOCK);
        culloutBlocks.add(STARGAZING_SUPPLIES);

        //nether plants
        //cullouts.add(BLAZE_NETTLE);
        //cullouts.add(WEAPING_BRIAR);
        //cullouts.add(CORRUPT_WART);
        //cullouts.add(TAINTED_BUSH);
        //cullouts.add(WATCHERS_GAZE);

        //bushes
        culloutBlocks.add(TUMBLE_WEED);

        //nether plants
        culloutBlocks.add(ROOTED_WATCHER);
        culloutBlocks.add(SOUL_SPORECAP);
        culloutBlocks.add(TAINTED_NETHER_WART);

        //sea plants
        culloutBlocks.add(SEA_URCHIN);
        culloutBlocks.add(PURPLE_ANEMONE);
        culloutBlocks.add(PINK_ANEMONE);
        culloutBlocks.add(YELLOW_ANEMONE);
        culloutBlocks.add(GREEN_ANEMONE);
        culloutBlocks.add(ORANGE_ANEMONE);
        culloutBlocks.add(STARFISH);
        culloutBlocks.add(GIANT_SCALLOP);
        culloutBlocks.add(THORACICA_BARNACLE);
        culloutBlocks.add(DANCING_SEA_FERN);
        culloutBlocks.add(TUBE_WORMS);
        culloutBlocks.add(PRISMARINE_CLUSTER);

        //culloutBlocks.add(BOWL_BLOCK);
        //culloutBlocks.add(MUG_BLOCK);
        //culloutBlocks.add(BENTO_BLOCK);
        //culloutBlocks.add(STEW_POT);

        culloutBlocks.add(SMALL_CACTUS);
        culloutBlocks.add(SMALL_ROSE_BUSH);
        culloutBlocks.add(COMMON_BUSH);
        culloutBlocks.add(SMALL_LILAC);
        culloutBlocks.add(SMALL_PEONY);
        culloutBlocks.add(WILD_TAPROOTS);
        culloutBlocks.add(CATTAILS);
        culloutBlocks.add(SCRAGGLY_BUSH);
        culloutBlocks.add(WILD_HERBS);
        culloutBlocks.add(WILD_BEETROOT);
        culloutBlocks.add(WILD_POTATO);
        culloutBlocks.add(WILD_CARROT);
        culloutBlocks.add(WILD_WHEAT);
        culloutBlocks.add(WEEPING_JUNGLE_WILLOW);
        culloutBlocks.add(REDWOOD_SORREL);
        culloutBlocks.add(MATURE_DANDELIONS);
        culloutBlocks.add(PANFLOWERS);
        culloutBlocks.add(HONEY_CLUSTER);
        culloutBlocks.add(FLOWERING_CACTUS);
        culloutBlocks.add(PEPPER_CROP_BLOCK);
        culloutBlocks.add(EGGPLANT_CROP_BLOCK);
        //culloutBlocks.add(ROCK_PILE);
        culloutBlocks.add(CRYSTALLIZED_REDSTONE);
        culloutBlocks.add(ONION_CROP_BLOCK);
        culloutBlocks.add(SNOW_CROP_BLOCK);
        culloutBlocks.add(MINERS_CROP_BLOCK);
        culloutBlocks.add(SNOWY_BUSH);
        //culloutBlocks.add(SNOW_ROCK_PILE);
        culloutBlocks.add(MOSS_VINES);
        culloutBlocks.add(MOSS_VINES_PLANT);
        culloutBlocks.add(DRY_VINES);
        culloutBlocks.add(DRY_VINES_PLANT);
        culloutBlocks.add(BLUE_POPPY_BUSH);
        culloutBlocks.add(VERDANT_BUSH);
        culloutBlocks.add(ORANGE_GILLED_WAXING_CAP);
        culloutBlocks.add(SPROUT);
        culloutBlocks.add(POND_RIBBONS);
        culloutBlocks.add(BLACK_DAHLIA);
        culloutBlocks.add(LAVENDER);
        culloutBlocks.add(SPRING_OF_LAVENDER);
        culloutBlocks.add(ROSE);
        culloutBlocks.add(FROZEN_ROSE);
        culloutBlocks.add(ORANGE_FERN);
        culloutBlocks.add(ORANGE_BEAUTY);
        culloutBlocks.add(FRUIT_BEARING_APPLE_LEAVES);
        culloutBlocks.add(APPLE_SAPLING);
        culloutBlocks.add(CROCUS);
        culloutBlocks.add(MOREL);
        culloutBlocks.add(BOXWOOD_BUSH);

        culloutBlocks.add(POTTED_ROSE_SPRIG);

        //culloutBlocks.add(FROZEN_FOSSIL);
        //culloutBlocks.add(CICADA);

        //Seed Type Crops
        culloutBlocks.add(PUFF_CROP_BLOCK);
        culloutBlocks.add(GB_CROP_BLOCK);
        culloutBlocks.add(MANDRAKE_CROP_BLOCK);

        culloutBlocks.add(HANGING_GLASS_PLANTER);

        culloutBlocks.add(ROPE_BRIDGE);
        culloutBlocks.add(ROPE_BRIDGE_ANCHOR);

        culloutBlocks.add(FIREPLACE_SCREEN);
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
        culloutBlocks.add(HATTED_SCARECROW);
        culloutBlocks.add(SCARECR_O_LANTERN);
        culloutBlocks.add(HATTED_SCARECR_O_LANTERN);
        culloutBlocks.add(HATTED_N_HAUNTED_SCARECROW);
        culloutBlocks.add(HAUNTED_SCARECROW);

        culloutBlocks.add(TARGET_RARECROW);
        culloutBlocks.add(MELONHEAD_RARECROW);
        culloutBlocks.add(SKELETON_RARECROW);
        culloutBlocks.add(ZOMBIE_RARECROW);

        culloutBlocks.add(SNOWMAN);

        culloutBlocks.add(COPPERFLAME_SCARECROW);
        culloutBlocks.add(HATTED_COPPERFLAME_SCARECROW);

        culloutBlocks.add(CAMPFIRE_STEW_POT);

        culloutBlocks.add(IRON_BEVELED_GLASS);
        culloutBlocks.add(COPPER_BEVELED_GLASS);
        culloutBlocks.add(GOLDEN_BEVELED_GLASS);
        culloutBlocks.add(NETHERITE_BEVELED_GLASS);

        //Amethyst
        translucentBlocks.add(BEVELED_AMETHYST_GLASS);
        translucentBlocks.add(COPPER_BEVELED_AMETHYST_GLASS);
        translucentBlocks.add(GOLDEN_BEVELED_AMETHYST_GLASS);
        translucentBlocks.add(NETHERITE_BEVELED_AMETHYST_GLASS);

        culloutBlocks.add(BRAZIER);
        culloutBlocks.add(SOUL_BRAZIER);
        culloutBlocks.add(COPPERFLAME_BRAZIER);

        culloutBlocks.add(BROWN_MUSHROOM_LOGS);
        culloutBlocks.add(RED_MUSHROOM_LOGS);
        culloutBlocks.add(MOREL_LOGS);

        culloutBlocks.add(APPLE_LEAVES);

        culloutBlocks.add(COPPER_CHAIN);
        culloutBlocks.add(EXPOSED_COPPER_CHAIN);
        culloutBlocks.add(WEATHERED_COPPER_CHAIN);
        culloutBlocks.add(OXIDIZED_COPPER_CHAIN);

        culloutBlocks.add(WAXED_COPPER_CHAIN);
        culloutBlocks.add(WAXED_EXPOSED_COPPER_CHAIN);
        culloutBlocks.add(WAXED_WEATHERED_COPPER_CHAIN);
        culloutBlocks.add(WAXED_OXIDIZED_COPPER_CHAIN);

        culloutBlocks.add(GOLDEN_CHAIN);
        culloutBlocks.add(NETHERITE_CHAIN);

        culloutBlocks.add(CAMPFIRE_RING);

        culloutBlocks.add(CAVE_SPIDER_EGG);
        culloutBlocks.add(RED_SEA_GRASS);
        culloutBlocks.add(GLOW_KELP_PLANT);
        culloutBlocks.add(GLOW_KELP);

        culloutBlocks.add(BONE_TORCH);
        culloutBlocks.add(WALL_BONE_TORCH);
        culloutBlocks.add(SOUL_BONE_TORCH);
        culloutBlocks.add(SOUL_WALL_BONE_TORCH);
        culloutBlocks.add(REDSTONE_BONE_TORCH);
        culloutBlocks.add(REDSTONE_WALL_BONE_TORCH);

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