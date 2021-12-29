package io.github.linkle.valleycraft.blocks.plants.aquatic;

import io.github.linkle.valleycraft.init.Aquatic;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.KelpBlock;

public class GlowKelp extends KelpBlock {

    public GlowKelp() {
        super(Settings.copy(Blocks.KELP).luminance(s -> 10)
                .emissiveLighting((blockState, pos, view) -> true));
    }

    @Override
    protected Block getPlant() {
        return Aquatic.GLOW_KELP_PLANT;
    }

}