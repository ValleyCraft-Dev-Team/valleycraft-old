package net.linkle.valley.Registry.Extensions;

import net.minecraft.util.math.BlockPos;

public interface RedstoneWorldExt {
    void putEmitPower(BlockPos pos);
    boolean isReceivingPower(BlockPos pos);
}
