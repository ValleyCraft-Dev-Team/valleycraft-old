package io.github.linkle.valleycraft.mixins;

import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import io.github.linkle.valleycraft.init.WeaponsAndTools;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.IceBlock;
import net.minecraft.block.TransparentBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@Mixin(IceBlock.class)
public class IceBlockMixin extends TransparentBlock {

    protected IceBlockMixin(AbstractBlock.Settings settings) {
        super(settings);
    }

        //Make ice not generate water if broken by tongs
    @Inject(method = "afterBreak", at = @At("HEAD"), cancellable = true)
    public void afterBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, @Nullable BlockEntity blockEntity, ItemStack stack, CallbackInfo info) {
        if (stack.isOf(WeaponsAndTools.TONGS)) {
            super.afterBreak(world, player, pos, state, blockEntity, stack);
            info.cancel();
        }
        
    }
    
}
