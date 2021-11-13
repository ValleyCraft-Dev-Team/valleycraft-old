package net.linkle.valley.Registry.Initializers;


import net.linkle.valley.Registry.Misc.*;
import net.linkle.valley.Registry.WeaponsAndTools.Totems.GrowthTotemBase;
import net.linkle.valley.Registry.WeaponsAndTools.Totems.RainTotemBase;
import net.linkle.valley.Registry.WeaponsAndTools.Totems.StormTotemBase;
import net.linkle.valley.Registry.WeaponsAndTools.Totems.SunshineTotemBase;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Rarity;

import static net.linkle.valley.Registry.Initializers.ItemGroups.*;
import static net.linkle.valley.Registry.Utils.Util.register;

public class MiscItems {
    public static final Item BOMB_BAG = new BombBundleBase(new Item.Settings().group(MISC_GROUP).rarity(Rarity.UNCOMMON).maxCount(16));
    public static final Item ARROW_BUNDLE = new ArrowBundleBase(new Item.Settings().group(EXPLORATION_GROUP).rarity(Rarity.UNCOMMON).maxCount(16));
    public static final Item STIRRUP = new MiscItemBase(new Item.Settings().group(MISC_GROUP));
    public static final Item TURF_ITEM = new MiscItemBase(new Item.Settings().group(MISC_GROUP));
    public static final Item MUD = new MiscItemBase(new Item.Settings().group(MISC_GROUP).maxCount(64));
    public static final Item MUD_BRICK = new MiscItemBase(new Item.Settings().group(MISC_GROUP).maxCount(64));
    public static final Item FLOUR_BAG = new MiscItemBase(new Item.Settings().group(COOKING_GROUP).maxCount(64));
    public static final Item AMERANTH = new MiscItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build()).maxCount(64));
    public static final Item COPPER_NUGGET = new MiscItemBase(new Item.Settings().group(MISC_GROUP).maxCount(64));
    public static final Item NETHER_NUGGET = new MiscItemBase(new Item.Settings().group(MISC_GROUP).maxCount(64));
    public static final Item SALTPETER = new MiscItemBase(new Item.Settings().group(MISC_GROUP).maxCount(64));
    public static final Item SQUID_SUCKER = new MiscItemBase(new Item.Settings().group(MISC_GROUP).maxCount(64));
    public static final Item FIBER = new MiscItemBase(new Item.Settings().group(MISC_GROUP).maxCount(64));
    public static final Item MOSS_BALL = new MiscItemBase(new Item.Settings().group(MISC_GROUP).maxCount(64));
    public static final Item PUFF_BALL = new MiscItemBase(new Item.Settings().group(MISC_GROUP).maxCount(64));
    public static final Item E_TOTEM = new MiscItemBase(new Item.Settings().group(MISC_GROUP).maxCount(1));
    public static final Item S_TOTEM = new SunshineTotemBase(new Item.Settings().group(MISC_GROUP).maxCount(1));
    public static final Item ST_TOTEM = new StormTotemBase(new Item.Settings().group(MISC_GROUP).maxCount(1));
    public static final Item R_TOTEM = new RainTotemBase(new Item.Settings().group(MISC_GROUP).maxCount(1));
    public static final Item G_TOTEM = new GrowthTotemBase(new Item.Settings().group(MISC_GROUP).maxCount(1));
    public static final Item MULCH = new MiscItemBase(new Item.Settings().group(MISC_GROUP).maxCount(64));
    public static final Item FUR_CLUMP = new MiscItemBase(new Item.Settings().group(MISC_GROUP).maxCount(64));
    public static final Item RAWHIDE = new MiscItemBase(new Item.Settings().group(MISC_GROUP).maxCount(64));
    public static final Item BEAR_SPAWN_EGG = new SpawnEggItem(Entities.BEAR, 0x56290D, 0x120802, new Item.Settings().group(MISC_GROUP));
    public static final Item DUCK_SPAWN_EGG = new SpawnEggItem(Entities.DUCK, 0x5B3200, 0x445B22, new Item.Settings().group(MISC_GROUP));
    public static final Item DUCK_EGG = new MiscItemBase((new Item.Settings()).maxCount(16).group(MISC_GROUP));
    public static final Item COPPER_BILLET = new BilletItemBase(new Item.Settings().group(MISC_GROUP).maxCount(64).recipeRemainder(COPPER_NUGGET));
    public static final Item ARROWHEAD = new MiscItemBase(new Item.Settings().group(MISC_GROUP).maxCount(64));
    public static final Item DRIP_ARROWHEAD = new MiscItemBase(new Item.Settings().group(MISC_GROUP).maxCount(64));
    public static final Item HOOK_I = new MiscItemBase(new Item.Settings().group(FISHING_GROUP).maxCount(64));
    public static final Item HOOK_C = new MiscItemBase(new Item.Settings().group(FISHING_GROUP).maxCount(64).rarity(Rarity.UNCOMMON));
    public static final Item HOOK_G = new MiscItemBase(new Item.Settings().group(FISHING_GROUP).maxCount(64).rarity(Rarity.RARE));
    public static final Item HOOK_N = new MiscItemBase(new Item.Settings().group(FISHING_GROUP).maxCount(64).rarity(Rarity.EPIC));
    public static final Item DRIFT = new MiscItemBase(new Item.Settings().group(FISHING_GROUP).maxCount(64));
    public static final Item SPRUCE_STICK = new MiscItemBase(new Item.Settings().group(MISC_GROUP).maxCount(64));
    public static final Item COIN = new MiscItemBase(new Item.Settings().group(MISC_GROUP).maxCount(64).rarity(Rarity.UNCOMMON));
    public static final Item REDSTONE_WAND = new RedstoneWandBase(new Item.Settings().group(MISC_GROUP).rarity(Rarity.UNCOMMON));

    public static void initialize() {
        register("redstone_wand", REDSTONE_WAND);

        register("stirrup", STIRRUP);
        register("fur_clump", FUR_CLUMP);
        register("rawhide_lashing", RAWHIDE);
        register("copper_billet", COPPER_BILLET);
        register("knapped_dripstone_arrowhead", DRIP_ARROWHEAD);
        register("knapped_flint_arrowhead", ARROWHEAD);
        register("mud_brick", MUD_BRICK);
        register("flour_bag", FLOUR_BAG);
        register("puff_ball", PUFF_BALL);
        //register("ameranth", AMERANTH);
        register("saltpeter", SALTPETER);
        register("fiber", FIBER);
        register("moss_ball", MOSS_BALL);
        register("null_totem", E_TOTEM);
        register("sunshine_totem", S_TOTEM);
        register("rain_totem", R_TOTEM);
        register("storm_totem", ST_TOTEM);
        register("growth_totem", G_TOTEM);
        register("bomb_bag", BOMB_BAG);
        register("arrow_bundle", ARROW_BUNDLE);
        register("copper_nugget", COPPER_NUGGET);
        register("netherite_nugget", NETHER_NUGGET);
        register("driftwood", DRIFT);
        register("spruce_bark_hilt", SPRUCE_STICK);

        //register("fish_hook_iron", HOOK_I);
        //register("fish_hook_copper", HOOK_C);
        //register("fish_hook_gold", HOOK_G);
        //register("fish_hook_netherite", HOOK_N);

        //register("coin", COIN);

        register("mud", MUD);
        register("mulch", MULCH);
        register("turf", TURF_ITEM);
        register("squid_sucker", SQUID_SUCKER);
        register("duck_egg", DUCK_EGG);
        register("bear_spawn_egg", BEAR_SPAWN_EGG);
        register("duck_spawn_egg", DUCK_SPAWN_EGG);
    }
}
