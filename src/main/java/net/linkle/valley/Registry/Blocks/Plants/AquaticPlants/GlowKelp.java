package net.linkle.valley.Registry.Blocks.Plants.AquaticPlants;

import net.linkle.valley.Registry.Initializers.Aquatic;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.KelpBlock;

public class GlowKelp extends KelpBlock {

    public GlowKelp() {
        super(Settings.copy(Blocks.KELP).luminance(s->10));
    }

    @Override
    protected Block getPlant() {
        return Aquatic.GLOW_KELP_PLANT;
    }
}
