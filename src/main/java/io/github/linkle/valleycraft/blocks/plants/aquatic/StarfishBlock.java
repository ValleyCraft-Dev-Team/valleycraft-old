package io.github.linkle.valleycraft.blocks.plants.aquatic;

public class StarfishBlock extends AquaticBlock {
    public StarfishBlock() {
        super(getSettings().noCollision(), createCuboidShape(1, 0, 1, 16, 1, 16));
    }
}