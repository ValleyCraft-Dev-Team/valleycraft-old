package io.github.linkle.valleycraft.init;


import io.github.linkle.valleycraft.items.misc.ArrowBundleBase;
import io.github.linkle.valleycraft.items.misc.BilletItemBase;
import io.github.linkle.valleycraft.items.misc.BombBundleBase;
import io.github.linkle.valleycraft.items.misc.MiscItemBase;
import io.github.linkle.valleycraft.items.totems.GrowthTotemBase;
import io.github.linkle.valleycraft.items.totems.RainTotemBase;
import io.github.linkle.valleycraft.items.totems.StormTotemBase;
import io.github.linkle.valleycraft.items.totems.SunshineTotemBase;
import io.github.linkle.valleycraft.utils.Util;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Rarity;

public class MiscItems {
    public static final Item BOMB_BAG = new BombBundleBase(new Item.Settings().group(ItemGroups.MISC_GROUP).rarity(Rarity.UNCOMMON).maxCount(16));
    public static final Item ARROW_BUNDLE = new ArrowBundleBase(new Item.Settings().group(ItemGroups.EXPLORATION_GROUP).rarity(Rarity.UNCOMMON).maxCount(16));
    public static final Item STIRRUP = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP));
    public static final Item TURF_ITEM = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP));
    public static final Item MUD = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64));
    public static final Item MUD_BRICK = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64));
    public static final Item FLOUR_BAG = new MiscItemBase(new Item.Settings().group(ItemGroups.COOKING_GROUP).maxCount(64));
    public static final Item AMERANTH = new MiscItemBase(new Item.Settings().group(ItemGroups.COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build()).maxCount(64));
    public static final Item COPPER_NUGGET = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64));
    public static final Item NETHER_NUGGET = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64));
    public static final Item SALTPETER = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64));
    public static final Item SQUID_SUCKER = new MiscItemBase(new Item.Settings().group(ItemGroups.FISHING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER,600), 0.9f).build()).maxCount(64));
    public static final Item FIBER = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64));
    public static final Item MOSS_BALL = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64));
    public static final Item PUFF_BALL = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64));
    public static final Item E_TOTEM = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(1));
    public static final Item S_TOTEM = new SunshineTotemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(1));
    public static final Item ST_TOTEM = new StormTotemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(1));
    public static final Item R_TOTEM = new RainTotemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(1));
    public static final Item G_TOTEM = new GrowthTotemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(1));
    public static final Item MULCH = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64));
    public static final Item FUR_CLUMP = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64));
    public static final Item RAWHIDE = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64));
    public static final Item BEAR_SPAWN_EGG = new SpawnEggItem(Entities.BEAR, 0x56290D, 0x120802, new Item.Settings().group(ItemGroups.MISC_GROUP));
    public static final Item DUCK_SPAWN_EGG = new SpawnEggItem(Entities.DUCK, 0x5B3200, 0x445B22, new Item.Settings().group(ItemGroups.MISC_GROUP));
    public static final Item DUCK_EGG = new MiscItemBase((new Item.Settings()).maxCount(16).group(ItemGroups.MISC_GROUP));
    public static final Item COPPER_BILLET = new BilletItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64).recipeRemainder(COPPER_NUGGET));
    public static final Item ARROWHEAD = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64));
    public static final Item DRIP_ARROWHEAD = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64));
    public static final Item HOOK_I = new MiscItemBase(new Item.Settings().group(ItemGroups.FISHING_GROUP).maxCount(64));
    public static final Item HOOK_C = new MiscItemBase(new Item.Settings().group(ItemGroups.FISHING_GROUP).maxCount(64).rarity(Rarity.UNCOMMON));
    public static final Item HOOK_G = new MiscItemBase(new Item.Settings().group(ItemGroups.FISHING_GROUP).maxCount(64).rarity(Rarity.RARE));
    public static final Item HOOK_N = new MiscItemBase(new Item.Settings().group(ItemGroups.FISHING_GROUP).maxCount(64).rarity(Rarity.EPIC));
    public static final Item SPRUCE_STICK = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64));
    public static final Item COIN = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64).rarity(Rarity.UNCOMMON));
    public static final Item BOOK_COVER = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64));

    public static void initialize() {
        Util.register("fur_clump", FUR_CLUMP);
        Util.register("copper_billet", COPPER_BILLET);
        Util.register("knapped_dripstone_arrowhead", DRIP_ARROWHEAD);
        Util.register("knapped_flint_arrowhead", ARROWHEAD);
        Util.register("mud_brick", MUD_BRICK);
        Util.register("flour_bag", FLOUR_BAG);
        Util.register("puff_ball", PUFF_BALL);
        Util.register("saltpeter", SALTPETER);
        Util.register("fiber", FIBER);
        Util.register("book_cover", BOOK_COVER);
        Util.register("moss_ball", MOSS_BALL);
        Util.register("null_totem", E_TOTEM);
        Util.register("sunshine_totem", S_TOTEM);
        Util.register("rain_totem", R_TOTEM);
        Util.register("storm_totem", ST_TOTEM);
        Util.register("growth_totem", G_TOTEM);
        Util.register("bomb_bag", BOMB_BAG);
        Util.register("arrow_bundle", ARROW_BUNDLE);
        Util.register("copper_nugget", COPPER_NUGGET);
        Util.register("netherite_nugget", NETHER_NUGGET);

        Util.register("mud", MUD);
        Util.register("mulch", MULCH);
        Util.register("turf", TURF_ITEM);
        Util.register("squid_sucker", SQUID_SUCKER);
        Util.register("duck_egg", DUCK_EGG);
        Util.register("bear_spawn_egg", BEAR_SPAWN_EGG);
        Util.register("duck_spawn_egg", DUCK_SPAWN_EGG);
    }
}
