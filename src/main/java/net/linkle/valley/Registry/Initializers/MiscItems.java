package net.linkle.valley.Registry.Initializers;


import net.linkle.valley.Registry.Misc.*;
import net.linkle.valley.Registry.WeaponsAndTools.Totems.RainTotemBase;
import net.linkle.valley.Registry.WeaponsAndTools.Totems.RuneTotemBase;
import net.linkle.valley.Registry.WeaponsAndTools.Totems.StormTotemBase;
import net.linkle.valley.Registry.WeaponsAndTools.Totems.SunshineTotemBase;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

import static net.linkle.valley.ValleyMain.MOD_ID;
import static net.linkle.valley.Registry.Initializers.ItemGroups.*;

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
    public static final Item G_TOTEM = new MiscItemBase(new Item.Settings().group(MISC_GROUP).maxCount(1));
    public static final Item RUNE_TOTEM = new RuneTotemBase(new Item.Settings().group(MISC_GROUP).maxCount(1));
    public static final Item MULCH = new MiscItemBase(new Item.Settings().group(MISC_GROUP).maxCount(64));
    public static final Item FUR_CLUMP = new MiscItemBase(new Item.Settings().group(MISC_GROUP).maxCount(64));
    public static final Item RAWHIDE = new MiscItemBase(new Item.Settings().group(MISC_GROUP).maxCount(64));
    public static final Item BEAR_SPAWN_EGG = new SpawnEggItem(Entities.BEAR, 0x56290D, 0x120802, new Item.Settings().group(MISC_GROUP));
    public static final Item DUCK_SPAWN_EGG = new SpawnEggItem(Entities.DUCK, 0x5B3200, 0x445B22, new Item.Settings().group(MISC_GROUP));
    public static final Item DUCK_EGG = new MiscItemBase((new Item.Settings()).maxCount(16).group(MISC_GROUP));
    public static final Item COPPER_BILLET = new BilletItemBase(new Item.Settings().group(MISC_GROUP).maxCount(64));
    public static final Item ARROWHEAD = new MiscItemBase(new Item.Settings().group(MISC_GROUP).maxCount(64));
    public static final Item DRIP_ARROWHEAD = new MiscItemBase(new Item.Settings().group(MISC_GROUP).maxCount(64));

    public static void initialize() {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stirrup"), STIRRUP);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fur_clump"), FUR_CLUMP);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rawhide_lashing"), RAWHIDE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "copper_billet"), COPPER_BILLET);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "knapped_dripstone_arrowhead"), DRIP_ARROWHEAD);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "knapped_flint_arrowhead"), ARROWHEAD);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "mud_brick"), MUD_BRICK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flour_bag"), FLOUR_BAG);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "puff_ball"), PUFF_BALL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ameranth"), AMERANTH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "saltpeter"), SALTPETER);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fiber"), FIBER);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "moss_ball"), MOSS_BALL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rune"), RUNE_TOTEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "null_totem"), E_TOTEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "sunshine_totem"), S_TOTEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rain_totem"), R_TOTEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "storm_totem"), ST_TOTEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "growth_totem"), G_TOTEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bomb_bag"), BOMB_BAG);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "arrow_bundle"), ARROW_BUNDLE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "copper_nugget"), COPPER_NUGGET);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "netherite_nugget"), NETHER_NUGGET);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "mud"), MUD);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "mulch"), MULCH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "turf"), TURF_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "squid_sucker"), SQUID_SUCKER);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "duck_egg"), DUCK_EGG);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bear_spawn_egg"), BEAR_SPAWN_EGG);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "duck_spawn_egg"), DUCK_SPAWN_EGG);
    }
}
