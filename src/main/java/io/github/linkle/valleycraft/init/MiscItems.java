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
    public static final Item GRASS_TURF = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP));
    public static final Item MUD_BALL = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64));
    public static final Item BROWN_BRICK = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64));
    public static final Item FLOUR = new MiscItemBase(new Item.Settings().group(ItemGroups.COOKING_GROUP).maxCount(64));
    public static final Item COPPER_NUGGET = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64));
    public static final Item NETHERITE_NUGGET = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64));
    public static final Item SALTPETER = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64));
    public static final Item SQUID_SUCKER = new MiscItemBase(new Item.Settings().group(ItemGroups.FISHING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER,600), 0.9f).build()).maxCount(64));
    public static final Item PLANT_FIBER = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64));
    public static final Item MOSS_CLUMP = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64));
    public static final Item DRY_MOSS_CLUMP = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64));
    public static final Item PUFF_BALL = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64));
    public static final Item BLANK_EFFIGY = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(1));
    public static final Item SUNSHINE_EFFIGY = new SunshineTotemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(1));
    public static final Item STORM_EFFIGY = new StormTotemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(1));
    public static final Item RAIN_AND_SNOW_EFFIGY = new RainTotemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(1));
    public static final Item GROWTH_EFFIGY = new GrowthTotemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(1));
    public static final Item MULCH = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64));
    public static final Item FUR_CLUMP = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64));
    public static final Item BEAR_SPAWN_EGG = new SpawnEggItem(Entities.BEAR, 0x56290D, 0x120802, new Item.Settings().group(ItemGroups.MISC_GROUP));
    public static final Item DUCK_SPAWN_EGG = new SpawnEggItem(Entities.DUCK, 0x5B3200, 0x445B22, new Item.Settings().group(ItemGroups.MISC_GROUP));
    public static final Item DUCK_EGG = new MiscItemBase(new Item.Settings().maxCount(16).group(ItemGroups.MISC_GROUP));
    public static final Item COPPER_BILLET = new BilletItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64).recipeRemainder(COPPER_NUGGET));
    public static final Item KNAPPED_FLINT_ARROWHEAD = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64));
    public static final Item KNAPPED_DRIPSTONE_ARROWHEAD = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64));
    public static final Item KNAPPED_OBSIDIAN_ARROWHEAD = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64));
    public static final Item CANVAS = new MiscItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(64));
    public static final Item BAIT = new BaitItemBase(new Item.Settings().group(ItemGroups.FISHING_GROUP).maxCount(64), "item.valley.bait.tooltip_2");
    public static final Item GOLDEN_BAIT = new BaitItemBase(new Item.Settings().group(ItemGroups.FISHING_GROUP).maxCount(64), "item.valley.bait.tooltip_3");
    public static final Item LINGERING_POWDER = new LingeringItemBase(new Item.Settings().group(ItemGroups.MISC_GROUP).maxCount(16).rarity(Rarity.UNCOMMON));
    public static final Item MESSAGE_IN_A_BOTTLE = new BottleBundleBase(new Item.Settings().group(ItemGroups.ARTEFACT_GROUP).maxCount(1).rarity(Rarity.RARE));
    public static final Item SEA_CREATURE_EYE = new EyeItemBase(new Item.Settings().group(ItemGroups.ARTEFACT_GROUP).maxCount(1).rarity(Rarity.EPIC));

    public static void initialize() {
        Reg.register("fur_clump", FUR_CLUMP);
        Reg.register("copper_billet", COPPER_BILLET);
        Reg.register("knapped_flint_arrowhead", KNAPPED_FLINT_ARROWHEAD);
        Reg.register("knapped_obsidian_arrowhead", KNAPPED_OBSIDIAN_ARROWHEAD);
        Reg.register("knapped_dripstone_arrowhead", KNAPPED_DRIPSTONE_ARROWHEAD);
        Reg.register("brown_brick", BROWN_BRICK);
        Reg.register("flour", FLOUR);
        Reg.register("puff_ball", PUFF_BALL);
        Reg.register("saltpeter", SALTPETER);
        Reg.register("plant_fiber", PLANT_FIBER);
        Reg.register("canvas", CANVAS);
        Reg.register("bait", BAIT);
        Reg.register("golden_bait", GOLDEN_BAIT);
        Reg.register("moss_clump", MOSS_CLUMP);
        Reg.register("dry_moss_clump", DRY_MOSS_CLUMP);
        Reg.register("blank_effigy", BLANK_EFFIGY);
        Reg.register("sunshine_effigy", SUNSHINE_EFFIGY);
        Reg.register("rain_and_snow_effigy", RAIN_AND_SNOW_EFFIGY);
        Reg.register("storm_effigy", STORM_EFFIGY);
        Reg.register("growth_effigy", GROWTH_EFFIGY);
        Reg.register("bomb_bag", BOMB_BAG);
        Reg.register("arrow_bundle", ARROW_BUNDLE);
        Reg.register("copper_nugget", COPPER_NUGGET);
        Reg.register("netherite_nugget", NETHERITE_NUGGET);
        Reg.register("lingering_powder", LINGERING_POWDER);
        Reg.register("message_in_a_bottle", MESSAGE_IN_A_BOTTLE);
        Reg.register("sea_creature_eye", SEA_CREATURE_EYE);
        Reg.register("mud_ball", MUD_BALL);
        Reg.register("mulch", MULCH);
        Reg.register("grass_turf", GRASS_TURF);
        Reg.register("squid_sucker", SQUID_SUCKER);
        Reg.register("duck_egg", DUCK_EGG);
        Reg.register("bear_spawn_egg", BEAR_SPAWN_EGG);
        Reg.register("duck_spawn_egg", DUCK_SPAWN_EGG);
    }
}
