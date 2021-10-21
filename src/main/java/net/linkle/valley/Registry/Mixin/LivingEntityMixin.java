package net.linkle.valley.Registry.Mixin;

import java.util.function.Predicate;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.linkle.valley.Registry.WeaponsAndTools.OneOffs.ClimbingAxeBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

@Mixin(LivingEntity.class)
abstract class LivingEntityMixin extends Entity {

	LivingEntityMixin(EntityType<?> type, World world) {
		super(type, world);
	}
	
	@Shadow
	abstract boolean isHolding(Predicate<ItemStack> item);
	
	@Shadow
	abstract void swingHand(Hand hand);
	
	@Shadow
	abstract ItemStack getMainHandStack();
	
	@Inject(method = "isClimbing", at = @At("HEAD"), cancellable = true)
	void climbingAxe(CallbackInfoReturnable<Boolean> info) {
		if (horizontalCollision && isHolding(item -> item.getItem() instanceof ClimbingAxeBase)) {
			swingHand(getMainHandStack().getItem() instanceof ClimbingAxeBase ? Hand.MAIN_HAND : Hand.OFF_HAND);
			info.setReturnValue(true);
		}
	}
}
