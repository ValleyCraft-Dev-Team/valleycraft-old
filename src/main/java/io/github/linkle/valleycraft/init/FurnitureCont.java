package io.github.linkle.valleycraft.init;

import io.github.linkle.valleycraft.blocks.decorations.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;

import static io.github.linkle.valleycraft.init.ItemGroups.ARTEFACT_GROUP;
import static io.github.linkle.valleycraft.init.ItemGroups.FURNITURE_GROUP;

public class FurnitureCont {
    public static final Block BROWN_BEAR_STUFFY = new StuffyBlock();
    public static final Block POLAR_BEAR_STUFFY = new StuffyBlock();

    public static final Block CAMPFIRE_RING = new CampfireRocksBlock();
    public static final Block LOG_PILE = new LogPileBlock();

    public static final Block BUNDLED_BAMBOO = new CrateBlock();
    public static final Block BUNDLED_SUGAR_CANE = new CrateBlock();
    public static final Block COCOA_BEAN_CRATE = new CrateBlock();
    public static final Block CHORUS_FRUIT_CRATE = new CrateBlock();
    public static final Block GLOW_BERRY_CRATE = new CrateBlock();
    public static final Block SWEET_BERRY_CRATE = new CrateBlock();
    public static final Block BITTER_BERRY_CRATE = new CrateBlock();
    public static final Block SPICY_BERRY_CRATE = new CrateBlock();
    public static final Block GREEN_BEAN_CRATE = new CrateBlock();
    public static final Block LIVING_MANDRAKE_CRATE = new CrateBlock();
    public static final Block SNOW_YAM_CRATE = new CrateBlock();
    public static final Block HOLLY_CRATE = new CrateBlock();
    public static final Block RICE_CRATE = new CrateBlock();
    public static final Block CORN_CRATE = new CrateBlock();
    public static final Block ONION_CRATE = new CrateBlock();
    public static final Block TOMATO_CRATE = new CrateBlock();
    public static final Block PUFF_BALL_CRATE = new CrateBlock();
    public static final Block MINERS_LETTUCE_CRATE = new CrateBlock();
    public static final Block DUCK_EGG_CRATE = new CrateBlock();
    public static final Block CHICKEN_EGG_CRATE = new CrateBlock();
    public static final Block BEETROOT_CRATE = new CrateBlock();
    public static final Block POTATO_CRATE = new CrateBlock();
    public static final Block CARROT_CRATE = new CrateBlock();
    public static final Block APPLE_CRATE = new CrateBlock();
    public static final Block FIRE_PEPPER_CRATE = new CrateBlock();
    public static final Block EGGPLANT_CRATE = new CrateBlock();
    public static final Block SOUR_BERRY_CRATE = new CrateBlock();
    public static final Block POISONOUS_POTATO_CRATE = new CrateBlock();

    public static final Block BONE_JOINT_BLOCK = new BoneJointBlock();
    public static final Block STARGAZING_SUPPLIES = new StewPotBlock();

    @SuppressWarnings("unused")
    public static void initialize() {
        var furnGroup = new Item.Settings().group(FURNITURE_GROUP);
        var furnGroupRare = new Item.Settings().group(FURNITURE_GROUP).rarity(Rarity.RARE);
        var furnGroupEpic = new Item.Settings().group(FURNITURE_GROUP).rarity(Rarity.EPIC);
        var arteGroup = new Item.Settings().group(ARTEFACT_GROUP);

        Reg.registerWithItem("brown_bear_stuffy", BROWN_BEAR_STUFFY, furnGroup);
        Reg.registerWithItem("polar_bear_stuffy", POLAR_BEAR_STUFFY, furnGroup);

        Reg.registerWithItem("log_pile", LOG_PILE, furnGroup);

        Reg.registerWithItem("campfire_ring", CAMPFIRE_RING, furnGroup);

        Reg.registerWithItem("apple_crate", APPLE_CRATE, furnGroup);
        Reg.registerWithItem("carrot_crate", CARROT_CRATE, furnGroup);
        Reg.registerWithItem("potato_crate", POTATO_CRATE, furnGroup);
        Reg.registerWithItem("poisonous_potato_crate", POISONOUS_POTATO_CRATE, furnGroup);
        Reg.registerWithItem("beetroot_crate", BEETROOT_CRATE, furnGroup);

        Reg.registerWithItem("rice_crate", RICE_CRATE, furnGroup);
        Reg.registerWithItem("corn_crate", CORN_CRATE, furnGroup);
        Reg.registerWithItem("tomato_crate", TOMATO_CRATE, furnGroup);
        Reg.registerWithItem("green_bean_crate", GREEN_BEAN_CRATE, furnGroup);
        Reg.registerWithItem("living_mandrake_crate", LIVING_MANDRAKE_CRATE, furnGroup);
        Reg.registerWithItem("snow_yam_crate", SNOW_YAM_CRATE, furnGroup);
        Reg.registerWithItem("fire_pepper_crate", FIRE_PEPPER_CRATE, furnGroup);
        Reg.registerWithItem("eggplant_crate", EGGPLANT_CRATE, furnGroup);
        Reg.registerWithItem("onion_crate", ONION_CRATE, furnGroup);
        Reg.registerWithItem("miners_lettuce_crate", MINERS_LETTUCE_CRATE, furnGroup);

        Reg.registerWithItem("chorus_fruit_crate", CHORUS_FRUIT_CRATE, furnGroup);
        Reg.registerWithItem("sweet_berry_crate", SWEET_BERRY_CRATE, furnGroup);
        Reg.registerWithItem("glow_berry_crate", GLOW_BERRY_CRATE, furnGroup);
        Reg.registerWithItem("bitter_berry_crate", BITTER_BERRY_CRATE, furnGroup);
        Reg.registerWithItem("sour_berry_crate", SOUR_BERRY_CRATE, furnGroup);
        Reg.registerWithItem("spicy_berry_crate", SPICY_BERRY_CRATE, furnGroup);
        Reg.registerWithItem("holly_crate", HOLLY_CRATE, furnGroup);
        Reg.registerWithItem("cocoa_bean_crate", COCOA_BEAN_CRATE, furnGroup);
        Reg.registerWithItem("puff_ball_crate", PUFF_BALL_CRATE, furnGroup);

        Reg.registerWithItem("duck_egg_crate", DUCK_EGG_CRATE, furnGroup);
        Reg.registerWithItem("chicken_egg_crate", CHICKEN_EGG_CRATE, furnGroup);

        Reg.registerWithItem("bundled_bamboo", BUNDLED_BAMBOO, furnGroup);
        Reg.registerWithItem("bundled_sugar_cane", BUNDLED_SUGAR_CANE, furnGroup);

        Reg.registerWithItem("bone_joint_block", BONE_JOINT_BLOCK, furnGroup);
        Reg.registerWithItem("stargazing_supplies", STARGAZING_SUPPLIES, furnGroup);

    }
}