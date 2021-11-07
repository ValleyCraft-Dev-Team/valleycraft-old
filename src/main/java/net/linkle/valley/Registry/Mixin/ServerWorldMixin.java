package net.linkle.valley.Registry.Mixin;

import java.util.Set;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import net.linkle.valley.Registry.Armors.Extensions.RedstoneWorldExt;
import net.minecraft.block.Blocks;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.profiler.Profiler;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.MutableWorldProperties;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;

@Mixin(ServerWorld.class)
abstract class ServerWorldMixin extends World implements RedstoneWorldExt {
    
    private final Set<BlockPos> emitBlockList = new ObjectArraySet<>();
    private final Set<BlockPos> lastEmitBlockList = new ObjectArraySet<>();

    ServerWorldMixin(MutableWorldProperties properties, RegistryKey<World> registryRef,
            DimensionType dimensionType, Supplier<Profiler> profiler, boolean isClient, boolean debugWorld, long seed) {
        super(properties, registryRef, dimensionType, profiler, isClient, debugWorld, seed);
    }
    
    @Inject(method = "tick", at = @At("TAIL"))
    void endTick(BooleanSupplier shouldKeepTicking, CallbackInfo info) {
        if (!emitBlockList.isEmpty() || !lastEmitBlockList.isEmpty()) {
            for (var pos : emitBlockList) {
                var state = this.getBlockState(pos);
                state.neighborUpdate(this, pos, Blocks.REDSTONE_BLOCK, pos, true);
            }
            
            // Fix the issues with some redstone block not unpowered.
            for (var pos : lastEmitBlockList) {
                if (!emitBlockList.contains(pos)) {
                    var state = this.getBlockState(pos);
                    state.neighborUpdate(this, pos, Blocks.AIR, pos, true);
                }
            }
            
            lastEmitBlockList.clear();
            lastEmitBlockList.addAll(emitBlockList); // Remember list.
            emitBlockList.clear();
        }
    }
    
    @Override
    public boolean isReceivingRedstonePower(BlockPos pos) {
        return super.isReceivingRedstonePower(pos);
    }
    
    @Inject(method = "isReceivingRedstonePower", at = @At("HEAD"), cancellable = true)
    void isBeenEmittedPower(BlockPos pos, CallbackInfoReturnable<Boolean> info) {
        if (emitBlockList.contains(pos)) {
            info.setReturnValue(true);
        }
    }
    
    @Override
    public void putEmitPower(BlockPos pos) {
        emitBlockList.add(pos);
    }
    
    @Override
    public boolean isReceivingPower(BlockPos pos) {
        return emitBlockList.contains(pos);
    }
}
