
package io.github.linkle.valleycraft.init;

import static io.github.linkle.valleycraft.init.ItemGroups.FISHING_GROUP;

import io.github.linkle.valleycraft.items.food.FoodItemBase;
import io.github.linkle.valleycraft.utils.Util;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.EntityBucketItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Rarity;

public class Fishing {
    public static final Item FIRE_EEL = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build()).rarity(Rarity.RARE).maxCount(64));
    public static final Item OCTO = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(5).saturationModifier(0.4f).build()).rarity(Rarity.RARE).maxCount(64));
    public static final Item GHOST_FISH = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).rarity(Rarity.EPIC).maxCount(64));
    public static final Item PERCH = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item CRAB = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 900),0.8f).build()).maxCount(64));
    public static final Item MUSSEL = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 900),0.3f).build()).maxCount(64));
    public static final Item BROWN_MUSSEL = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 900),0.3f).build()).maxCount(64));
    public static final Item CERITH_SNAIL = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item LIONFISH = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item SARDINE = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item SLIMEFISH = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build()).rarity(Rarity.COMMON).maxCount(64));
    public static final Item GLISTERING_ANGLER = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(6).saturationModifier(0.4f).build()).rarity(Rarity.RARE).maxCount(64));
    public static final Item LOBSTER = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 900),0.8f).build()).maxCount(64));
    public static final Item PRIDEFIN = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(6).saturationModifier(0.4f).build()).rarity(Rarity.EPIC).maxCount(64));
    public static final Item MASKING_CRAB = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 900),0.8f).build()).maxCount(64));
    public static final Item BONEFIN = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(StatusEffects.WITHER, 300),0.8f).build()).maxCount(64));
    public static final Item ABYSS_WATCHER = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(6).saturationModifier(0.4f).build()).rarity(Rarity.RARE).maxCount(64));
    public static final Item STONEROLLER = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build()).maxCount(64).rarity(Rarity.COMMON));
    public static final Item WRASSE = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64).rarity(Rarity.RARE));
    public static final Item FROG_FISH = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item MARLIN_SPIKE = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item RED_PORGY = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));

    public static final Item BUCKET_FIRE_EEL = new EntityBucketItem(Entities.FIRE_EEL, Fluids.WATER, SoundEvents.ITEM_BUCKET_EMPTY_FISH, new Item.Settings().group(FISHING_GROUP).maxCount(1));
    public static final Item BUCKET_PERCH = new EntityBucketItem(Entities.PERCH, Fluids.WATER, SoundEvents.ITEM_BUCKET_EMPTY_FISH, new Item.Settings().group(FISHING_GROUP).maxCount(1));
    public static final Item BUCKET_SARDINE = new EntityBucketItem(Entities.SARDINE, Fluids.WATER, SoundEvents.ITEM_BUCKET_EMPTY_FISH, new Item.Settings().group(FISHING_GROUP).maxCount(1));
    public static final Item BUCKET_MINNOW = new EntityBucketItem(Entities.MINNOW, Fluids.WATER, SoundEvents.ITEM_BUCKET_EMPTY_FISH, new Item.Settings().group(FISHING_GROUP).maxCount(1));
    public static final Item BUCKET_RED_PORGY = new EntityBucketItem(Entities.RED_PORGY, Fluids.WATER, SoundEvents.ITEM_BUCKET_EMPTY_FISH, new Item.Settings().group(FISHING_GROUP).maxCount(1));

    public static void initialize() {
        Util.register("perch", PERCH);
        Util.register("crab_red", CRAB);
        Util.register("masking_crab", MASKING_CRAB);
        Util.register("lobster", LOBSTER);
        Util.register("mussel", MUSSEL);
        Util.register("brown_mussel", BROWN_MUSSEL);
        Util.register("cerith_snail", CERITH_SNAIL);
        Util.register("marlin_spike_seashell", MARLIN_SPIKE);
        Util.register("lionfish", LIONFISH);
        Util.register("sardine", SARDINE);
        Util.register("red_porgy", RED_PORGY);
        Util.register("stoneroller_minnow", STONEROLLER);
        Util.register("slime_fish", SLIMEFISH);
        Util.register("pridefin", PRIDEFIN);
        Util.register("rainbow_wrasse", WRASSE);
        Util.register("glistering_anglerfish", GLISTERING_ANGLER);
        Util.register("octopus", OCTO);
        Util.register("hairy_frog_fish", FROG_FISH);
        Util.register("fire_eel", FIRE_EEL);
        Util.register("ghost_fish", GHOST_FISH);
        Util.register("abyss_watcher", ABYSS_WATCHER);
        Util.register("bonefin", BONEFIN);
        Util.register("bucket_fire_eel", BUCKET_FIRE_EEL);
        Util.register("bucket_perch", BUCKET_PERCH);
        Util.register("bucket_sardine", BUCKET_SARDINE);
        Util.register("bucket_minnow", BUCKET_MINNOW);
        Util.register("bucket_red_porgy", BUCKET_RED_PORGY);

    }
}