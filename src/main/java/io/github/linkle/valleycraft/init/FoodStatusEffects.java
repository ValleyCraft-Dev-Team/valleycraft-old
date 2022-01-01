package io.github.linkle.valleycraft.init;

import io.github.linkle.valleycraft.utils.FoodStatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class FoodStatusEffects {

	public static final FoodStatusEffect CHOCO_MILK = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,300));
	public static final FoodStatusEffect PUMPKIN_BOTTLE = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,300));
	public static final FoodStatusEffect TEA = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,120));
	public static final FoodStatusEffect TEA_BB = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.SPEED,1200));
	public static final FoodStatusEffect TEA_SB = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,1200));
	public static final FoodStatusEffect TEA_M = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.HASTE,1200));
	public static final FoodStatusEffect TEA_D = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.LUCK,1200));
	public static final FoodStatusEffect TEA_L = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 240));
	public static final FoodStatusEffect TEA_SR = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 240));

	public static final FoodStatusEffect HONEYCOMB_CHUNK = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,120));
	public static final FoodStatusEffect CLOWN_SALAD = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE,600));

	public static final FoodStatusEffect RAW_EGGS = new FoodStatusEffect().addEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600), 0.7f);

	public static final FoodStatusEffect APPLE_JUICE = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.SPEED,600));
	public static final FoodStatusEffect BEET_JUICE = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING,600));
	public static final FoodStatusEffect CARROT_JUICE = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,600), new StatusEffectInstance(StatusEffects.GLOWING,600));
	public static final FoodStatusEffect POTATO_JUICE = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.POISON,600));
	public static final FoodStatusEffect MOREL_OIL = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS,600));
	public static final FoodStatusEffect GB_JUICE = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.LUCK,600));
	public static final FoodStatusEffect GB_JUICE_2 = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.GLOWING,600));

	public static final FoodStatusEffect PUMPKIN_BOWL = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,300));

	public static final FoodStatusEffect BBOX_CLOWNFISH = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,900));
	public static final FoodStatusEffect BBOX_SALMON = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.SPEED,900));
	public static final FoodStatusEffect BBOX_UNAGI = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST,900));
	public static final FoodStatusEffect BBOX_GH_TAIL = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE,1800));
	public static final FoodStatusEffect STEAMED_COD = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,450));
	public static final FoodStatusEffect CARROT_STEW = new FoodStatusEffect().addEffect(new StatusEffectInstance(StatusEffects.REGENERATION,450),1.0f);
	public static final FoodStatusEffect CREAMY_HEART_STEW = new FoodStatusEffect().addEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST,450),1.0f);
	public static final FoodStatusEffect CRAB_CAKE = new FoodStatusEffect().addEffect(new StatusEffectInstance(StatusEffects.STRENGTH,900),1.0f);

	public static final FoodStatusEffect SALMON_ROLL = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.SPEED,450));
	public static final FoodStatusEffect CRAB_ROLL = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,450));
	public static final FoodStatusEffect PERCH_ROLL = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,450));
	public static final FoodStatusEffect FIRE_EEL_ROLL = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,450));
	public static final FoodStatusEffect OCTO_ROLL = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,450));

	public static final FoodStatusEffect AMERANTH_PANCAKE_DOUGH = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,200));
	public static final FoodStatusEffect AMERANTH_PANCAKE = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,450));
	public static final FoodStatusEffect AMERANTH_PORRIDGE = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,675));
	public static final FoodStatusEffect AMERANTH_PANCAKE_BREAKFAST = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,900));

	public static final FoodStatusEffect APPLE_CYSER = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,300), new StatusEffectInstance(StatusEffects.REGENERATION,600), new StatusEffectInstance(StatusEffects.SPEED,600));
	public static final FoodStatusEffect BITTER_BERRY_CYSER = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,300), new StatusEffectInstance(StatusEffects.RESISTANCE,600), new StatusEffectInstance(StatusEffects.STRENGTH,600));
	public static final FoodStatusEffect SPICY_BERRY_CYSER = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,300), new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,600), new StatusEffectInstance(StatusEffects.SLOW_FALLING,600));
	public static final FoodStatusEffect SWEET_BERRY_CYSER = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,300), new StatusEffectInstance(StatusEffects.HEALTH_BOOST,600), new StatusEffectInstance(StatusEffects.STRENGTH,600));
	public static final FoodStatusEffect SOUR_BERRY_CYSER = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,300), new StatusEffectInstance(StatusEffects.HEALTH_BOOST,600), new StatusEffectInstance(StatusEffects.REGENERATION,600));
	public static final FoodStatusEffect MEAD_MUG = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,300), new StatusEffectInstance(StatusEffects.STRENGTH,600), new StatusEffectInstance(StatusEffects.SPEED,600));
	public static final FoodStatusEffect CHOCO_CYSER = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,300), new StatusEffectInstance(StatusEffects.NIGHT_VISION,600), new StatusEffectInstance(StatusEffects.SPEED,600));

	public static final FoodStatusEffect SWEET_BERRY_WINE = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,200), new StatusEffectInstance(StatusEffects.REGENERATION,500), new StatusEffectInstance(StatusEffects.STRENGTH,600));
	public static final FoodStatusEffect BITTER_BERRY_WINE = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,200), new StatusEffectInstance(StatusEffects.SLOW_FALLING,500), new StatusEffectInstance(StatusEffects.STRENGTH,600));
	public static final FoodStatusEffect SOUR_BERRY_WINE = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,200), new StatusEffectInstance(StatusEffects.HEALTH_BOOST,500), new StatusEffectInstance(StatusEffects.STRENGTH,600));
	public static final FoodStatusEffect SPICY_BERRY_WINE = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,200), new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,500), new StatusEffectInstance(StatusEffects.SPEED,600));
	public static final FoodStatusEffect CHORUS_WINE = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,400), new StatusEffectInstance(StatusEffects.INVISIBILITY,600), new StatusEffectInstance(StatusEffects.RESISTANCE,600));

	public static final FoodStatusEffect CHICKEN_CURRY = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING,450));
	public static final FoodStatusEffect FULL_BREAKFAST_VEGETARIAN = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.HASTE,900));
	public static final FoodStatusEffect COD_CHOWDER = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,600));
	public static final FoodStatusEffect CLAM_CHOWDER = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE,600));
	public static final FoodStatusEffect SARDINE_SOUP = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,600));
	public static final FoodStatusEffect POKE_BOWL = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,120));

	public static final FoodStatusEffect COCOA = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,120));
	public static final FoodStatusEffect CLOWNFISH_ROLL = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE,450));
	public static final FoodStatusEffect CRYS_HONEY = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,240));
	public static final FoodStatusEffect MAIZE_PORRIDGE = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.HASTE,450));
	public static final FoodStatusEffect BEEF_STEW = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION,60));
	public static final FoodStatusEffect BEAR_STEW = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,60));
	public static final FoodStatusEffect SPICY_RABBIT_BIGO = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.HASTE,600));
	public static final FoodStatusEffect LAMB_BIRYANI = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,900));
	public static final FoodStatusEffect PORK_STIR_FRY = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,600));
	public static final FoodStatusEffect FROZEN_JELLY = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,600));
	public static final FoodStatusEffect ROCK_CANDY = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.SPEED,600));
	public static final FoodStatusEffect GLOW_SOUP = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,600), new StatusEffectInstance(StatusEffects.GLOWING,600));

	public static final FoodStatusEffect PANCAKE_BREAKFAST = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.HASTE,900));
	public static final FoodStatusEffect PANCAKE_BREAKFAST_LARGE = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.HASTE,1200));
	public static final FoodStatusEffect FULL_BREAKFAST = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,1200));
	public static final FoodStatusEffect BACON_AND_EGGS = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,900));
	public static final FoodStatusEffect DUMPLING = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.HASTE,1200));

	public static final FoodStatusEffect GRUB = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,1800));

	public static final FoodStatusEffect STUFFED_ONION = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST,900));
	public static final FoodStatusEffect BAKED_POTATO_SPECIAL= new FoodStatusEffect(new StatusEffectInstance(StatusEffects.LUCK,900));

	public static final FoodStatusEffect DOG_FOOD = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,900));
	public static final FoodStatusEffect FOX_FOOD = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,900));

	public static final FoodStatusEffect VEGE_STIR_FRY = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,600));
	public static final FoodStatusEffect EGG_STIR_FRY = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,600));
	public static final FoodStatusEffect BEAR_STIR_FRY = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,600));
	public static final FoodStatusEffect MANDRAKE_SOUP = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,900));
	public static final FoodStatusEffect CANDIED_SNOW_YAM = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,900));
	public static final FoodStatusEffect WINTER_ROOT_STEW = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,900));
	public static final FoodStatusEffect WORM_SOUP = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,900));
	public static final FoodStatusEffect SLIME_SOUP = new FoodStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,900));

}