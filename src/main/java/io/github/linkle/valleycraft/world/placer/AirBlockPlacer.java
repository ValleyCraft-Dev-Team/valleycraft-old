package io.github.linkle.valleycraft.world.placer;

/** Will place block if there is an air. */
public class AirBlockPlacer extends ConditionBlockPlacer {
    public static final AirBlockPlacer INSTANCE = new AirBlockPlacer();

    public AirBlockPlacer() {
        super((world, pos) -> world.isAir(pos));
    }
}
