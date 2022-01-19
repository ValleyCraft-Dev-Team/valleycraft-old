package io.github.linkle.valleycraft.mixins;

import com.google.common.collect.Lists;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentLevelEntry;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.registry.Registry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import io.github.linkle.valleycraft.api.EnchantmentHandler;
import io.github.linkle.valleycraft.entities.DuckEntity;

import java.util.List;

@Mixin(EnchantmentHelper.class)
public class EnchantmentHelperMixin {

        //Treat ducks as if they have depth strider
    @Inject(method =  "getDepthStrider", at = @At("HEAD"), cancellable = true)
    private static void getDepthStrider(LivingEntity entity, CallbackInfoReturnable<Integer> info) {
        if (entity instanceof DuckEntity) {
            info.setReturnValue(2);
        }
    }

        //Make the enchanting table dish out the correct enchantments to tools whose applicable enchantments we've customized
        //This code is ported from Draylar's Gate of Babylon mod (legally via MIT license)
    @Inject(method = "getPossibleEntries", at = @At("HEAD"), cancellable = true)
    private static void adjustPossibleEntries(int power, ItemStack stack, boolean treasureAllowed, CallbackInfoReturnable<List<EnchantmentLevelEntry>> cir) {
        Item item = stack.getItem();

        // Only adjust if the stack being passed in is our weapon
        if (item instanceof EnchantmentHandler) {
            List<EnchantmentLevelEntry> entries = Lists.newArrayList();

            // Collect valid enchantments
            Registry.ENCHANTMENT.forEach(enchantment -> {

                // Items can whitelist certain enchantments to always be valid.
                if(!((EnchantmentHandler) item).isExplicitlyValid(enchantment)) {

                    // This is where our primary logic-change is.
                    // Instead of asking the type for validity, we ask the enchantment.
                    // This allows our other hook in EnchantmentMixin to run.
                    if(!enchantment.isAcceptableItem(stack)) {
                        return;
                    }

                    // Ensure the stack accepts the given enchantment.
                    if(((EnchantmentHandler) item).isInvalid(enchantment)) {
                        return;
                    }

                    // If the enchantment is not available in the general pool (Soul Speed),
                    // ignore it.
                    if(!enchantment.isAvailableForRandomSelection()) {
                        return;
                    }

                    // If the enchantment is a treasure enchantment
                    //  and we are not looking for treasure enchantments, ignore it.
                    if(enchantment.isTreasure() && !treasureAllowed) {
                        return;
                    }
                }

                // Add all valid enchantment-power entries to the list.
                for (int i = enchantment.getMaxLevel(); i > enchantment.getMinLevel() - 1; --i) {
                    if (power >= enchantment.getMinPower(i) && power <= enchantment.getMaxPower(i)) {
                        entries.add(new EnchantmentLevelEntry(enchantment, i));
                        break;
                    }
                }
            });

            cir.setReturnValue(entries);
        }
    }
}