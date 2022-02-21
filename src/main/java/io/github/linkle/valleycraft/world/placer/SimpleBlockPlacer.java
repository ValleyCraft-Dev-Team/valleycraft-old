package io.github.linkle.valleycraft.world.placer;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldAccess;

public class SimpleBlockPlacer implements BlockPlacer {
    public static final BlockPlacer INSTANCE = new SimpleBlockPlacer();

    @Override
    public boolean place(WorldAccess world, BlockPos pos, BlockState state, int flags) {
        return world.setBlockState(pos, state, flags);
    }
}
