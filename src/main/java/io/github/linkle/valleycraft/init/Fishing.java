
package io.github.linkle.valleycraft.init;

import static io.github.linkle.valleycraft.init.ItemGroups.FISHING_GROUP;

import io.github.linkle.valleycraft.items.food.FoodItemBase;
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
    public static final Item OCTOROK = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(5).saturationModifier(0.4f).build()).rarity(Rarity.RARE).maxCount(64));
    public static final Item GHOSTFIN = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).rarity(Rarity.EPIC).maxCount(64));
    public static final Item PERCH = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item DUNGENESS_CRAB = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 900),0.8f).build()).maxCount(64));
    public static final Item MUSSEL = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 900),0.3f).build()).maxCount(64));
    public static final Item BROWN_MUSSEL = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 900),0.3f).build()).maxCount(64));
    public static final Item CERITH_SNAIL = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item LIONFISH = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item SARDINE = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item GELAFIN = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build()).rarity(Rarity.COMMON).maxCount(64));
    public static final Item GLISTERING_ANGLER = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(6).saturationModifier(0.4f).build()).rarity(Rarity.RARE).maxCount(64));
    public static final Item SPINY_LOBSTER = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 900),0.8f).build()).maxCount(64));
    public static final Item PRIDEFIN = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(6).saturationModifier(0.4f).build()).rarity(Rarity.EPIC).maxCount(64));
    public static final Item MASKING_CRAB = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 900),0.8f).build()).maxCount(64));
    public static final Item BONEFIN = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(StatusEffects.WITHER, 300),0.8f).build()).maxCount(64));
    public static final Item ABYSS_WATCHER = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(6).saturationModifier(0.4f).build()).rarity(Rarity.RARE).maxCount(64));
    public static final Item SALTWATER_STONEROLLER_MINNOW = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build()).maxCount(64).rarity(Rarity.COMMON));
    public static final Item RAINBOW_WRASSE = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64).rarity(Rarity.RARE));
    public static final Item HAIRY_FROG_FISH = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item MARLIN_SPIKE = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item RED_PORGY = new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));

    public static final Item FIRE_EEL_BUCKET = new EntityBucketItem(Entities.FIRE_EEL, Fluids.WATER, SoundEvents.ITEM_BUCKET_EMPTY_FISH, new Item.Settings().group(FISHING_GROUP).maxCount(1));
    public static final Item PERCH_BUCKET = new EntityBucketItem(Entities.PERCH, Fluids.WATER, SoundEvents.ITEM_BUCKET_EMPTY_FISH, new Item.Settings().group(FISHING_GROUP).maxCount(1));
    public static final Item SARDINE_BUCKET = new EntityBucketItem(Entities.SARDINE, Fluids.WATER, SoundEvents.ITEM_BUCKET_EMPTY_FISH, new Item.Settings().group(FISHING_GROUP).maxCount(1));
    public static final Item MINNOW_BUCKET = new EntityBucketItem(Entities.MINNOW, Fluids.WATER, SoundEvents.ITEM_BUCKET_EMPTY_FISH, new Item.Settings().group(FISHING_GROUP).maxCount(1));
    public static final Item RED_PORGY_BUCKET = new EntityBucketItem(Entities.RED_PORGY, Fluids.WATER, SoundEvents.ITEM_BUCKET_EMPTY_FISH, new Item.Settings().group(FISHING_GROUP).maxCount(1));

    public static void initialize() {
        Reg.register("perch", PERCH);
        Reg.register("dungeness_crab", DUNGENESS_CRAB);
        Reg.register("masking_crab", MASKING_CRAB);
        Reg.register("spiny_lobster", SPINY_LOBSTER);
        Reg.register("mussel", MUSSEL);
        Reg.register("brown_mussel", BROWN_MUSSEL);
        Reg.register("cerith_snail", CERITH_SNAIL);
        Reg.register("marlin_spike", MARLIN_SPIKE);
        Reg.register("lionfish", LIONFISH);
        Reg.register("sardine", SARDINE);
        Reg.register("red_porgy", RED_PORGY);
        Reg.register("saltwater_stoneroller_minnow", SALTWATER_STONEROLLER_MINNOW);
        Reg.register("gelafin", GELAFIN);
        Reg.register("pridefin", PRIDEFIN);
        Reg.register("rainbow_wrasse", RAINBOW_WRASSE);
        Reg.register("glistering_angler", GLISTERING_ANGLER);
        Reg.register("octorok", OCTOROK);
        Reg.register("hairy_frog_fish", HAIRY_FROG_FISH);
        Reg.register("fire_eel", FIRE_EEL);
        Reg.register("ghostfin", GHOSTFIN);
        Reg.register("abyss_watcher", ABYSS_WATCHER);
        Reg.register("bonefin", BONEFIN);
        Reg.register("fire_eel_bucket", FIRE_EEL_BUCKET);
        Reg.register("perch_bucket", PERCH_BUCKET);
        Reg.register("sardine_bucket", SARDINE_BUCKET);
        Reg.register("minnow_bucket", MINNOW_BUCKET);
        Reg.register("red_porgy_bucket", RED_PORGY_BUCKET);
    }
}