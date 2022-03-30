package io.github.linkle.valleycraft.init;

import io.github.linkle.valleycraft.blocks.decorations.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;

import static io.github.linkle.valleycraft.init.ItemGroups.ARTEFACT_GROUP;
import static io.github.linkle.valleycraft.init.ItemGroups.FURNITURE_GROUP;

public class FurnitureCont {
    public static final Block STUFFY_BROWN = new StuffyBlock();
    public static final Block STUFFY_WHITE = new StuffyBlock();

    public static final Block GOLEM_R = new GolemBlockWaxed();
    public static final Block GOLEM_W = new GolemBlockRusted();
    public static final Block GOLEM_I = new GolemBlock();

    public static final Block CAMPFIRE_RING = new CampfireRocksBlock();
    public static final Block LOGPILE = new LogPileBlock();

    public static final Block CRATE_BAMBOO = new CrateBlock();
    public static final Block CRATE_SUGAR = new CrateBlock();
    public static final Block CRATE_COCOA = new CrateBlock();
    public static final Block CRATE_CHORUS = new CrateBlock();
    public static final Block CRATE_GLOW = new CrateBlock();
    public static final Block CRATE_SWEET = new CrateBlock();
    public static final Block CRATE_BITTER = new CrateBlock();
    public static final Block CRATE_SPICY = new CrateBlock();
    public static final Block CRATE_GREEN = new CrateBlock();
    public static final Block CRATE_MANDRAKE = new CrateBlock();
    public static final Block CRATE_SNOW = new CrateBlock();
    public static final Block CRATE_HOLLY = new CrateBlock();
    public static final Block CRATE_RICE = new CrateBlock();
    public static final Block CRATE_CORN = new CrateBlock();
    public static final Block CRATE_ONION = new CrateBlock();
    public static final Block CRATE_TOMATO = new CrateBlock();
    public static final Block CRATE_PUFF = new CrateBlock();
    public static final Block CRATE_MINER = new CrateBlock();
    public static final Block CRATE_DUCK = new CrateBlock();
    public static final Block CRATE_EGG = new CrateBlock();
    public static final Block CRATE_BEET = new CrateBlock();
    public static final Block CRATE_POTATO = new CrateBlock();
    public static final Block CRATE_CARROT = new CrateBlock();
    public static final Block CRATE_APPLE = new CrateBlock();
    public static final Block CRATE_PEPPER = new CrateBlock();
    public static final Block CRATE_EGGPLANT = new CrateBlock();
    public static final Block CRATE_SOUR = new CrateBlock();
    public static final Block CRATE_POISON = new CrateBlock();

    public static final Block BONE_JOINT = new BoneJointBlock();
    public static final Block TELESCOPE_BLOCK = new StewPotBlock();

    @SuppressWarnings("unused")
    public static void initialize() {
        var furnGroup = new Item.Settings().group(FURNITURE_GROUP);
        var furnGroupRare = new Item.Settings().group(FURNITURE_GROUP).rarity(Rarity.RARE);
        var furnGroupEpic = new Item.Settings().group(FURNITURE_GROUP).rarity(Rarity.EPIC);
        var arteGroup = new Item.Settings().group(ARTEFACT_GROUP);

        Reg.registerWithItem("stuffy_brown", STUFFY_BROWN, furnGroup);
        Reg.registerWithItem("stuffy_white", STUFFY_WHITE, furnGroup);

        Reg.registerWithItem("log_pile", LOGPILE, furnGroup);

        Reg.registerWithItem("campfire_ring", CAMPFIRE_RING, furnGroup);

        Reg.registerWithItem("crate_apple", CRATE_APPLE, furnGroup);
        Reg.registerWithItem("crate_carrot", CRATE_CARROT, furnGroup);
        Reg.registerWithItem("crate_potato", CRATE_POTATO, furnGroup);
        Reg.registerWithItem("crate_poison", CRATE_POISON, furnGroup);
        Reg.registerWithItem("crate_beet", CRATE_BEET, furnGroup);

        Reg.registerWithItem("crate_rice", CRATE_RICE, furnGroup);
        Reg.registerWithItem("crate_corn", CRATE_CORN, furnGroup);
        Reg.registerWithItem("crate_tomato", CRATE_TOMATO, furnGroup);

        Reg.registerWithItem("crate_green", CRATE_GREEN, furnGroup);
        Reg.registerWithItem("crate_mandrake", CRATE_MANDRAKE, furnGroup);
        Reg.registerWithItem("crate_snow", CRATE_SNOW, furnGroup);
        Reg.registerWithItem("crate_pepper", CRATE_PEPPER, furnGroup);
        Reg.registerWithItem("crate_eggplant", CRATE_EGGPLANT, furnGroup);

        Reg.registerWithItem("crate_onion", CRATE_ONION, furnGroup);
        Reg.registerWithItem("crate_miner", CRATE_MINER, furnGroup);

        Reg.registerWithItem("crate_chorus", CRATE_CHORUS, furnGroup);
        Reg.registerWithItem("crate_sweet", CRATE_SWEET, furnGroup);
        Reg.registerWithItem("crate_glow", CRATE_GLOW, furnGroup);
        Reg.registerWithItem("crate_bitter", CRATE_BITTER, furnGroup);
        Reg.registerWithItem("crate_sour", CRATE_SOUR, furnGroup);
        Reg.registerWithItem("crate_spicy", CRATE_SPICY, furnGroup);
        Reg.registerWithItem("crate_holly", CRATE_HOLLY, furnGroup);
        Reg.registerWithItem("crate_cocoa", CRATE_COCOA, furnGroup);

        Reg.registerWithItem("crate_puff", CRATE_PUFF, furnGroup);

        Reg.registerWithItem("crate_duck", CRATE_DUCK, furnGroup);
        Reg.registerWithItem("crate_egg", CRATE_EGG, furnGroup);

        Reg.registerWithItem("crate_bamboo", CRATE_BAMBOO, furnGroup);
        Reg.registerWithItem("crate_sugar", CRATE_SUGAR, furnGroup);

        Reg.registerWithItem("bone_joint_block", BONE_JOINT, furnGroup);
        Reg.registerWithItem("telescope_block", TELESCOPE_BLOCK, furnGroup);

    }
}