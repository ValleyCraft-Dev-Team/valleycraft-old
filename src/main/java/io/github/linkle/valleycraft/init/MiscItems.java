package io.github.linkle.valleycraft.init;


import io.github.linkle.valleycraft.items.misc.*;
import io.github.linkle.valleycraft.items.totems.GrowthTotemBase;
import io.github.linkle.valleycraft.items.totems.RainTotemBase;
import io.github.linkle.valleycraft.items.totems.StormTotemBase;
import io.github.linkle.valleycraft.items.totems.SunshineTotemBase;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Rarity;

public class MiscItems {
    public static final Item BOMB_BAG = new BombBundleBase(new Item.Settings().group(ItemGroups.MISC_GROUP).rarity(Rarity.UNCOMMON).maxCount(16));
    public static final Item ARROW_BUNDLE = new ArrowBundleBase(new Item.Settings().group(ItemGroups.EXPLORATION_GROUP).rarity(Rarity.UNCOMMON).maxCount(16));
    public static final Item TURF_ITEM = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP));
    public static final Item MUD = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64));
    public static final Item MUD_BRICK = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64));
    public static final Item FLOUR_BAG = new MiscItemBase(new Item.Settings().group(ItemGroups.COOKING_GROUP).maxCount(64));
    public static final Item COPPER_NUGGET = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64));
    public static final Item NETHER_NUGGET = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64));
    public static final Item SALTPETER = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64));
    public static final Item SQUID_SUCKER = new MiscItemBase(new Item.Settings().group(ItemGroups.FISHING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER,600), 0.9f).build()).maxCount(64));
    public static final Item FIBER = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64));
    public static final Item MOSS_BALL = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64));
    public static final Item MOSS_BALL_DRY = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64));
    public static final Item PUFF_BALL = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64));
    public static final Item E_TOTEM = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(1));
    public static final Item S_TOTEM = new SunshineTotemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(1));
    public static final Item ST_TOTEM = new StormTotemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(1));
    public static final Item R_TOTEM = new RainTotemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(1));
    public static final Item G_TOTEM = new GrowthTotemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(1));
    public static final Item MULCH = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64));
    public static final Item FUR_CLUMP = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64));
    public static final Item BEAR_SPAWN_EGG = new SpawnEggItem(Entities.BEAR, 0x56290D, 0x120802, new Item.Settings().group(ItemGroups.MISC_GROUP));
    public static final Item DUCK_SPAWN_EGG = new SpawnEggItem(Entities.DUCK, 0x5B3200, 0x445B22, new Item.Settings().group(ItemGroups.MISC_GROUP));
    public static final Item DUCK_EGG = new MiscItemBase(new Item.Settings().maxCount(16).group(ItemGroups.MISC_GROUP));
    public static final Item COPPER_BILLET = new BilletItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64).recipeRemainder(COPPER_NUGGET));
    public static final Item ARROWHEAD = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64));
    public static final Item DRIP_ARROWHEAD = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64));
    public static final Item OBSIDIAN_ARROWHEAD = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64));
    public static final Item BOOK_COVER = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64));
    public static final Item BAIT = new BaitItemBase(new Item.Settings().group(ItemGroups.FISHING_GROUP).maxCount(64), "item.valley.bait.tooltip_2");
    public static final Item GOLDEN_BAIT = new BaitItemBase(new Item.Settings().group(ItemGroups.FISHING_GROUP).maxCount(64), "item.valley.bait.tooltip_3");
    public static final Item LINGERING_POWDER = new LingeringItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(16).rarity(Rarity.UNCOMMON));
    public static final Item MESSAGE_BOTTLE = new BottleBundleBase(new Item.Settings().group(ItemGroups.ARTEFACT_GROUP).maxCount(1).rarity(Rarity.RARE));
    public static final Item SEA_EYE = new EyeItemBase(new Item.Settings().group(ItemGroups.ARTEFACT_GROUP).maxCount(1).rarity(Rarity.EPIC));

    public static void initialize() {
        Reg.register("fur_clump", FUR_CLUMP);
        Reg.register("copper_billet", COPPER_BILLET);
        Reg.register("knapped_flint_arrowhead", ARROWHEAD);
        Reg.register("knapped_obsidian_arrowhead", OBSIDIAN_ARROWHEAD);
        Reg.register("knapped_dripstone_arrowhead", DRIP_ARROWHEAD);
        Reg.register("mud_brick", MUD_BRICK);
        Reg.register("flour_bag", FLOUR_BAG);
        Reg.register("puff_ball", PUFF_BALL);
        Reg.register("saltpeter", SALTPETER);
        Reg.register("fiber", FIBER);
        Reg.register("book_cover", BOOK_COVER);
        Reg.register("bait", BAIT);
        Reg.register("glistering_bait", GOLDEN_BAIT);
        Reg.register("moss_ball", MOSS_BALL);
        Reg.register("moss_ball_dry", MOSS_BALL_DRY);
        Reg.register("null_totem", E_TOTEM);
        Reg.register("sunshine_totem", S_TOTEM);
        Reg.register("rain_totem", R_TOTEM);
        Reg.register("storm_totem", ST_TOTEM);
        Reg.register("growth_totem", G_TOTEM);
        Reg.register("bomb_bag", BOMB_BAG);
        Reg.register("arrow_bundle", ARROW_BUNDLE);
        Reg.register("copper_nugget", COPPER_NUGGET);
        Reg.register("netherite_nugget", NETHER_NUGGET);
        Reg.register("lingering_powder", LINGERING_POWDER);
        Reg.register("message_bottle", MESSAGE_BOTTLE);
        Reg.register("sea_creature_eye", SEA_EYE);
        Reg.register("mud", MUD);
        Reg.register("mulch", MULCH);
        Reg.register("turf", TURF_ITEM);
        Reg.register("squid_sucker", SQUID_SUCKER);
        Reg.register("duck_egg", DUCK_EGG);
        Reg.register("bear_spawn_egg", BEAR_SPAWN_EGG);
        Reg.register("duck_spawn_egg", DUCK_SPAWN_EGG);
    }
}
