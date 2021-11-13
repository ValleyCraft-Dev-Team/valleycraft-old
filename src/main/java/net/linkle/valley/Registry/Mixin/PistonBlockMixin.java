package net.linkle.valley.Registry.Mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.linkle.valley.Registry.Armors.Extensions.RedstoneWorldExt;
import net.minecraft.block.FacingBlock;
import net.minecraft.block.PistonBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

@Mixin(PistonBlock.class)
class PistonBlockMixin extends FacingBlock {

    PistonBlockMixin(Settings settings) {
        super(settings);
    }
    
    @Inject(method = "shouldExtend", at = @At("HEAD"), cancellable = true)
    void pistonFix(World world, BlockPos pos, Direction pistonFace, CallbackInfoReturnable<Boolean> info) {
        if (world instanceof RedstoneWorldExt ext && ext.isReceivingPower(pos)) {
            info.setReturnValue(true);
        }
    }
}
