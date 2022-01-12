package io.github.linkle.valleycraft.utils;

import java.util.function.IntPredicate;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Heightmap;
import net.minecraft.world.WorldAccess;

/** Only place block on certain height map. */
public class HeightMapBlockPlacer implements BlockPlacer {
    
    private final Heightmap.Type type;
    private final IntPredicate predicate;
    
    /** @param predicate comparing block's height and world's heightmap. */
    public HeightMapBlockPlacer(Heightmap.Type type, IntPredicate predicate) {
        this.type = type;
        this.predicate = predicate;
    }

    @Override
    public boolean place(WorldAccess world, BlockPos pos, BlockState state, int flags) {
        if (predicate.test(Integer.compare(pos.getY(), world.getTopY(type, pos.getX(), pos.getZ())))) {
            return world.setBlockState(pos, state, flags);
        }
        return false;
    }
}
