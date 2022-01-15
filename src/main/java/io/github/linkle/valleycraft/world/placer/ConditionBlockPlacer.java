package io.github.linkle.valleycraft.world.placer;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldAccess;

/** A simple condition block placer. */
public class ConditionBlockPlacer implements BlockPlacer {
    private final BiPredicate<WorldAccess, BlockPos> predicate;
    
    public ConditionBlockPlacer(Predicate<BlockState> predicate) {
        this((world, pos) -> predicate.test(world.getBlockState(pos)));
    }
    
    public ConditionBlockPlacer(BiPredicate<WorldAccess, BlockPos> predicate) {
        this.predicate = predicate;
    }

    @Override
    public boolean place(WorldAccess world, BlockPos pos, BlockState state, int flags) {
        return predicate.test(world, pos) ? world.setBlockState(pos, state, flags) : false;
    }
}
