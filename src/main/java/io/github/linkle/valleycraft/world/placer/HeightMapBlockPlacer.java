package io.github.linkle.valleycraft.world.placer;

import java.util.function.IntPredicate;

import net.minecraft.world.Heightmap;

/** Only place block on certain height map. */
public class HeightMapBlockPlacer extends ConditionBlockPlacer {
    /** @param predicate comparing block's height and world's heightmap. */
    public HeightMapBlockPlacer(Heightmap.Type type, IntPredicate predicate) {
        super((world, pos) -> predicate.test(Integer.compare(pos.getY(), world.getTopY(type, pos.getX(), pos.getZ()))));
    }
}
