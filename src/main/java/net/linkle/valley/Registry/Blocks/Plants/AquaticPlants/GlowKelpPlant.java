package net.linkle.valley.Registry.Blocks.Plants.AquaticPlants;

import net.linkle.valley.Registry.Initializers.Aquatic;
import net.minecraft.block.AbstractPlantStemBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.KelpPlantBlock;

public class GlowKelpPlant extends KelpPlantBlock {

    public GlowKelpPlant() {
        super(Settings.copy(Blocks.KELP_PLANT).luminance(s->10));
    }

    @Override
    protected AbstractPlantStemBlock getStem() {
        return Aquatic.GLOW_KELP;
    }
}
