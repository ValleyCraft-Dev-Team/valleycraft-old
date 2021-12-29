package io.github.linkle.valleycraft.blocks.plants.aquatic;

import io.github.linkle.valleycraft.init.Aquatic;
import net.minecraft.block.AbstractPlantStemBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.KelpPlantBlock;

public class GlowKelpPlant extends KelpPlantBlock {

    public GlowKelpPlant() {
        super(Settings.copy(Blocks.KELP_PLANT).luminance(s -> 10)
                .emissiveLighting((blockState, pos, view) -> true));
    }

    @Override
    protected AbstractPlantStemBlock getStem() {
        return Aquatic.GLOW_KELP;
    }

}