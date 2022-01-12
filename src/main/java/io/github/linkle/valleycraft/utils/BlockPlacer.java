package io.github.linkle.valleycraft.utils;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldAccess;

@FunctionalInterface
public interface BlockPlacer {
    default boolean place(WorldAccess world, BlockPos pos, BlockState state) {
        return place(world, pos, state, Block.NOTIFY_LISTENERS);
    }
    
    boolean place(WorldAccess world, BlockPos pos, BlockState state, int flags);
}
