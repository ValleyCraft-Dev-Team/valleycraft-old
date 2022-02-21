package io.github.linkle.valleycraft.blocks.decorations;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.MagmaBlock;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import static io.github.linkle.valleycraft.ValleyMain.CONFIG;

public class ScaldingBlock extends MagmaBlock {
    public ScaldingBlock() {
        super(Settings.copy(Blocks.MAGMA_BLOCK).strength(1.5f, 6.0f)); // Stone Block's strength.
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (CONFIG.misc.scaldingBurn.test(entity))
            super.onSteppedOn(world, pos, state, entity);
    }
}
