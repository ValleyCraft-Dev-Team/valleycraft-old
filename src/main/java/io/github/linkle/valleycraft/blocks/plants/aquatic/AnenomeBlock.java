package io.github.linkle.valleycraft.blocks.plants.aquatic;

public class AnenomeBlock extends AquaticBlock {
    public AnenomeBlock() {
        super(getSettings().noCollision().breakByHand(false), createCuboidShape(2, 0, 2, 14, 13, 14));
    }
}