package net.linkle.valley.Registry.Blocks.Plants.Stumps;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

import static net.minecraft.block.Blocks.BROWN_MUSHROOM;

public class BrownStumpBlock extends Block {

    public BrownStumpBlock() {
        super(FabricBlockSettings.of(Material.WOOD)
                .breakByTool(FabricToolTags.AXES)
                .breakByHand(true).ticksRandomly()
                .sounds(BlockSoundGroup.WOOD).nonOpaque()
                .strength(1, 1f));
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        BlockPos blockPosTop = pos.up();
        if (world.isAir(blockPosTop)) {
            world.setBlockState(blockPosTop, BROWN_MUSHROOM.getDefaultState());
        }
    }
}
