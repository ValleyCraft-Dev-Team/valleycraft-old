package io.github.linkle.valleycraft.init;

import io.github.linkle.valleycraft.blocks.crops.MaizeCropBlock;
import io.github.linkle.valleycraft.blocks.crops.RiceCropBlock;
import io.github.linkle.valleycraft.blocks.plants.CropsSeeds.VCropBlock;
import io.github.linkle.valleycraft.blocks.plants.bushes.BerryBushBlock;
import io.github.linkle.valleycraft.items.food.FoodItemBase;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.tag.BlockTags;

import static io.github.linkle.valleycraft.init.ItemGroups.COOKING_GROUP;
import static io.github.linkle.valleycraft.init.ItemGroups.NATURE_GROUP;

public class Crops {
    //Puff Ball
    public static final CropBlock PUFF_CROP_BLOCK = new VCropBlock();
    public static final Item PUFF_SEEDS = new AliasedBlockItem(PUFF_CROP_BLOCK, new Item.Settings().group(NATURE_GROUP));
    //Green Bean
    public static final CropBlock GB_CROP_BLOCK = new VCropBlock();
    public static final Item GB_SEEDS = new AliasedBlockItem(GB_CROP_BLOCK, new Item.Settings().group(NATURE_GROUP));
    public static final Item GREEN_BEAN = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build()).maxCount(64));
    //Mandrake
    public static final CropBlock MANDRAKE_CROP_BLOCK = new VCropBlock();
    public static final Item MANDRAKE_SEEDS = new AliasedBlockItem(MANDRAKE_CROP_BLOCK, new Item.Settings().group(NATURE_GROUP));
    public static final Item MANDRAKE = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build()).maxCount(64));
    //Foods
    public static final Item COOKED_MANDRAKE = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(6).saturationModifier(0.8f).build()).maxCount(64));
    //Onions
    public static final CropBlock ONION_CROP_BLOCK = new VCropBlock();
    public static final Item ONION_SEEDS = new AliasedBlockItem(ONION_CROP_BLOCK, new Item.Settings().group(NATURE_GROUP));
    public static final Item ONION = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build()).maxCount(64));
    //Miners Lettuce
    public static final CropBlock MINERS_CROP_BLOCK = new VCropBlock();
    public static final Item MINERS_LETTUCE_ITEM = new AliasedBlockItem(MINERS_CROP_BLOCK, new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.6f).build()).maxCount(64));
    //Snow Yam
    public static final CropBlock SNOW_CROP_BLOCK = new VCropBlock();
    public static final Item SNOW_YAM_ITEM = new AliasedBlockItem(SNOW_CROP_BLOCK, new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build()).maxCount(64));
    //Fire Pepper
    public static final CropBlock PEPPER_CROP_BLOCK = new VCropBlock(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));
    public static final Item PEPPER_SEEDS = new AliasedBlockItem(PEPPER_CROP_BLOCK, new Item.Settings().group(NATURE_GROUP));
    public static final Item PEPPER_ITEM = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build()).maxCount(64));
    //Eggplant
    public static final CropBlock EGGPLANT_CROP_BLOCK = new VCropBlock(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));
    public static final Item EGGPLANT_SEEDS = new AliasedBlockItem(EGGPLANT_CROP_BLOCK, new Item.Settings().group(NATURE_GROUP));
    public static final Item EGGPLANT_ITEM = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build()).maxCount(64));
    //Corn
    public static final Block CORN_CROP = new MaizeCropBlock(FabricBlockSettings.copy(Blocks.WHEAT));
    public static final Item CORN = new AliasedBlockItem(CORN_CROP, new Item.Settings().group(NATURE_GROUP));
    //Rice
    public static final Block RICE_CROP = new RiceCropBlock(FabricBlockSettings.copy(Blocks.WHEAT));
    public static final Item RICE_SEEDLINGS = new AliasedBlockItem(RICE_CROP, new Item.Settings().group(NATURE_GROUP));
    //Tomato
    public static final Block TOMATO_BUSH = new BerryBushBlock(false);
    public static final Item TOMATO = new AliasedBlockItem(TOMATO_BUSH, new Item.Settings().group(NATURE_GROUP));
    //Bitter Berries
    public static final Block BITTER_BERRY_BUSH = new BerryBushBlock(true);
    public static final Item BITTER_BERRIES = new AliasedBlockItem(BITTER_BERRY_BUSH, new Item.Settings().group(NATURE_GROUP));
    //Sour Berries
    public static final Block SOUR_BERRY_BUSH = new BerryBushBlock(true);
    public static final Item SOUR_BERRIES = new AliasedBlockItem(SOUR_BERRY_BUSH, new Item.Settings().group(NATURE_GROUP));
    //Spicy Berries
    public static final Block SPICY_BERRY_BUSH = new BerryBushBlock(true, floor ->
            floor.isIn(BlockTags.BASE_STONE_NETHER) || floor.isIn(BlockTags.NYLIUM) || floor.isOf(Blocks.MAGMA_BLOCK)
    );
    public static final Item SPICY_BERRIES = new AliasedBlockItem(SPICY_BERRY_BUSH, new Item.Settings().group(NATURE_GROUP));
    //Holly
    public static final Block HOLLY_BUSH = new BerryBushBlock(true);
    public static final Item HOLLY = new AliasedBlockItem(HOLLY_BUSH, new Item.Settings().group(NATURE_GROUP));

    public static void initialize() {
        //Puff Ball
        Reg.register("puff_balls", PUFF_CROP_BLOCK);
        Reg.register("puff_ball_seeds", PUFF_SEEDS);
        //Green Bean
        Reg.register("green_bean_trellis", GB_CROP_BLOCK);
        Reg.register("green_bean_seeds", GB_SEEDS);
        Reg.register("green_beans", GREEN_BEAN);
        //Mandrake
        Reg.register("living_mandrakes", MANDRAKE_CROP_BLOCK);
        Reg.register("living_mandrake_seed_bulbs", MANDRAKE_SEEDS);
        Reg.register("living_mandrake", MANDRAKE);
        Reg.register("cooked_mandrake", COOKED_MANDRAKE);
        //Snow Yam
        Reg.register("snow_yams", SNOW_CROP_BLOCK);
        Reg.register("snow_yam", SNOW_YAM_ITEM);
        //Miners Lettuce
        Reg.register("miners_lettuce", MINERS_CROP_BLOCK);
        Reg.register("miners_lettuce", MINERS_LETTUCE_ITEM);
        //Onion
        Reg.register("onions", ONION_CROP_BLOCK);
        Reg.register("onion_seeds", ONION_SEEDS);
        Reg.register("onion", ONION);
        //Pepper
        Reg.register("fire_peppers", PEPPER_CROP_BLOCK);
        Reg.register("fire_pepper_seeds", PEPPER_SEEDS);
        Reg.register("fire_pepper", PEPPER_ITEM);
        //Eggplant
        Reg.register("eggplants", EGGPLANT_CROP_BLOCK);
        Reg.register("eggplant_seeds", EGGPLANT_SEEDS);
        Reg.register("eggplant", EGGPLANT_ITEM);
        //Corn
        Reg.register("corn_stalks", CORN_CROP);
        Reg.register("corn", CORN);
        //Rice
        Reg.register("rice", RICE_CROP);
        Reg.register("rice_seedlings", RICE_SEEDLINGS);
        //Tomato
        Reg.register("tomatoes", TOMATO_BUSH);
        Reg.register("tomato", TOMATO);
        //Bitter Berries
        Reg.register("bitter_berry_bush", BITTER_BERRY_BUSH);
        Reg.register("bitter_berries", BITTER_BERRIES);
        //Sour Berries
        Reg.register("sour_berry_bush", SOUR_BERRY_BUSH);
        Reg.register("sour_berries", SOUR_BERRIES);
        //Spicy Berries
        Reg.register("spicy_berry_bush", SPICY_BERRY_BUSH);
        Reg.register("spicy_berries", SPICY_BERRIES);
        //Holly
        Reg.register("holly_bush", HOLLY_BUSH);
        Reg.register("holly", HOLLY);

    }
}
