package io.github.linkle.valleycraft.init;

import io.github.linkle.valleycraft.blocks.plants.CropsSeeds.VCropBlock;
import io.github.linkle.valleycraft.items.food.FoodItemBase;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.CropBlock;
import net.minecraft.block.Material;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;

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
    }
}
