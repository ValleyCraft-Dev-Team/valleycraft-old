package net.linkle.valley.Registry.Initializers;

import net.linkle.valley.Registry.Blocks.Plants.CropsSeeds.*;
import net.linkle.valley.Registry.Cooking.FoodTypeBases.FoodItemBase;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.CropBlock;
import net.minecraft.block.Material;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;

import static net.linkle.valley.Registry.Initializers.ItemGroups.COOKING_GROUP;
import static net.linkle.valley.Registry.Initializers.ItemGroups.NATURE_GROUP;
import static net.linkle.valley.Registry.Utils.Util.register;

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
    //Crystal Fruit
    public static final CropBlock CRYSTAL_CROP_BLOCK = new VCropBlock();
    public static final Item CRYSTAL_SEEDS = new AliasedBlockItem(CRYSTAL_CROP_BLOCK, new Item.Settings().group(NATURE_GROUP));
    public static final Item CRYSTAL_FRUIT = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build()).maxCount(64));
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

    //Winter Root
    public static final Item WINTER_ROOT_ITEM = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build()).maxCount(64));

    //Pepper
    public static final CropBlock PEPPER_CROP_BLOCK = new VCropBlock(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));
    public static final Item PEPPER_SEEDS = new AliasedBlockItem(PEPPER_CROP_BLOCK, new Item.Settings().group(NATURE_GROUP));
    public static final Item PEPPER_ITEM = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build()).maxCount(64));

    //Eggplant
    //Pepper
    public static final CropBlock EGGPLANT_CROP_BLOCK = new VCropBlock(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));
    public static final Item EGGPLANT_SEEDS = new AliasedBlockItem(EGGPLANT_CROP_BLOCK, new Item.Settings().group(NATURE_GROUP));
    public static final Item EGGPLANT_ITEM = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build()).maxCount(64));

    public static void initialize() {
        //Puff Ball
        register("puff_crop_block", PUFF_CROP_BLOCK);
        register("puff_seeds", PUFF_SEEDS);
        //Green Bean
        register("green_bean_crop_block", GB_CROP_BLOCK);
        register("green_bean_seeds", GB_SEEDS);
        register("green_bean", GREEN_BEAN);
        //Mandrake
        register("mandrake_crop_block", MANDRAKE_CROP_BLOCK);
        register("mandrake_seeds", MANDRAKE_SEEDS);
        register("mandrake", MANDRAKE);
        register("cooked_mandrake", COOKED_MANDRAKE);
        //Crystal Fruit
        //register("crystal_crop_block", CRYSTAL_CROP_BLOCK);
        //register("crystal_seeds", CRYSTAL_SEEDS);
        //register("crystal_fruit", CRYSTAL_FRUIT);
        //Foraged Items
        //Snow Yam
        register("snow_yam_crop_block", SNOW_CROP_BLOCK);
        register("snow_yam_item", SNOW_YAM_ITEM);
        //Winter Root
        //register("winter_root_crop_block", WINTER_CROP_BLOCK);
        //register("winter_root_item", WINTER_ROOT_ITEM);
        //Miners Lettuce
        register("miners_lettuce_crop_block", MINERS_CROP_BLOCK);
        register("miners_lettuce", MINERS_LETTUCE_ITEM);
        //Onion
        register("onion_crop_block", ONION_CROP_BLOCK);
        register("onion_seeds", ONION_SEEDS);
        register("onion", ONION);
        //Pepper
        register("pepper_crop_block", PEPPER_CROP_BLOCK);
        register("pepper_seeds", PEPPER_SEEDS);
        register("fire_pepper", PEPPER_ITEM);
        //Eggplant
        register("eggplant_crop_block", EGGPLANT_CROP_BLOCK);
        register("eggplant_seeds", EGGPLANT_SEEDS);
        register("eggplant", EGGPLANT_ITEM);
    }
}
