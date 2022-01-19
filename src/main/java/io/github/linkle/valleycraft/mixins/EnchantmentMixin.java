package io.github.linkle.valleycraft.mixins;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import io.github.linkle.valleycraft.api.EnchantmentHandler;

@Mixin(Enchantment.class)
public abstract class EnchantmentMixin {

        //This mixin lets us customize what enchantments are applicable on our tools using EnchantmentHelper methods
        //This code is ported from Draylar's Gate of Babylon mod (legally via MIT license)

    @Shadow @Final public EnchantmentTarget type;

    @Inject(
            method = "isAcceptableItem",
            at = @At("HEAD"),
            cancellable = true)
    private void checkValidity(ItemStack stack, CallbackInfoReturnable<Boolean> cir) {
        // If the stack being checked is from this mod, run our custom logic to determine
        // whether the given type is valid.
        if(stack.getItem() instanceof EnchantmentHandler) {
            //Check if the item is set to explicitly accept a specific enchantment
            if(((EnchantmentHandler) stack.getItem()).isExplicitlyValid((Enchantment) (Object) this)) {
                cir.setReturnValue(true);
                return;
            }

            //Check if the item is set to accept enchantments from the category the enchantment is in
            //These categories can be found in EnchantmentTarget.class in the Minecraft source
            //They are hardcoded, so, for example, only tools that extend MiningToolItem can accept Efficiency, Silk Touch or Fortune in vanilla
            boolean contains = ((EnchantmentHandler) stack.getItem()).getEnchantmentTypes().contains(type);
            boolean itemAccepts = !((EnchantmentHandler) stack.getItem()).isInvalid((Enchantment) (Object) this);

            // Only abort-mission early if we deem the stack to be valid for this enchantment.
            // This allows for the default logic to attempt to run as well.
            if(contains && itemAccepts) {
                cir.setReturnValue(true);
            }
        }
    }
}