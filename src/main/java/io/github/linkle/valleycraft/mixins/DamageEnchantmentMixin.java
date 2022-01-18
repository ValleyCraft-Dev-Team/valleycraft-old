package io.github.linkle.valleycraft.mixins;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.enchantment.DamageEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.ImpalingEnchantment;
import net.minecraft.entity.EquipmentSlot;

    //Code adapted from unascribed's Fabrication mod
    //This is needed to make Impaling and sword damage enchantments incompatible on mermaid weapons.

@Mixin(DamageEnchantment.class)
public class DamageEnchantmentMixin extends Enchantment {

	protected DamageEnchantmentMixin(Rarity weight, EnchantmentTarget type, EquipmentSlot[] slotTypes) {
		super(weight, type, slotTypes);
	}

        //Since we're mixin'ing the DamageEnchantment class, which handles Sharpness, Bane of Arthropods and Smite,
        //we make these enchantments incompatible with Impaling.
	@Inject(at=@At("HEAD"), method="canAccept(Lnet/minecraft/enchantment/Enchantment;)Z", cancellable=true)
	public void canAccept(Enchantment other, CallbackInfoReturnable<Boolean> ci) {
		if (other instanceof ImpalingEnchantment) {
			ci.setReturnValue(false);
		}
	}
}