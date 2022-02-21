package io.github.linkle.valleycraft.api;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;

import java.util.Collections;
import java.util.List;

//Code taken from Draylar's Gate of Babylon mod, and is important to make enchantments behave on tools with custom classes

//Have a custom tool type extend this class when you want to define unusual enchantments for it (not just what vanilla lets it accept by default)

public interface EnchantmentHandler {

    //Use this method to list enchantment categories the item should accept *all* enchantments from.
    //Enchantment categories are shown in EnchantmentTarget.class in Minecraft's source code.
    //Here's my best guesses as to what's in each one:
    //ARMOR         Protection, Fire Protection, Blast Protection, Projectile Protection, Thorns
    //ARMOR_FEET    Depth Strider, Frost Walker, Soul Speed, Feather Falling
    //ARMOR_LEGS    Nothing in vanilla
    //ARMOR_CHEST   Nothing in vanilla
    //ARMOR_HEAD    Respiration, Aqua Affinity
    //WEAPON        Sharpness, Smite, Bane of Arthropods, Fire Aspect, Looting, Sweeping Edge
    //DIGGER        Efficiency, Fortune, Silk Touch
    //FISHING_ROD   Luck of the Sea, Lure
    //TRIDENT       Riptide, Loyalty, Channeling, Impaling
    //BREAKABLE     Mending, Unbreaking
    //BOW           Power, Punch, Flame, Infinity
    //WEARABLE      Nothing in vanilla
    //CROSSBOW      Quick Charge, Multishot, Piercing
    //VANISHABLE    Curse of Vanishing
    default List<EnchantmentTarget> getEnchantmentTypes() {
        return Collections.emptyList();
    }

    /** Use this method to list specific enchantments the item should *not* accept that it would otherwise. */
    default boolean isInvalid(Enchantment enchantment) {
        return false;
    }

    /** Use this method to list specific enchantments the item *should* accept. */
    default boolean isExplicitlyValid(Enchantment enchantment) {
        return false;
    }
}