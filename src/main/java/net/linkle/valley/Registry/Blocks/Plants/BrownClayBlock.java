package net.linkle.valley.Registry.Blocks.Plants;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.Material;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

import static net.linkle.valley.Registry.Initializers.Plants.REED_BLOCK;

public class BrownClayBlock extends FallingBlock {
    public BrownClayBlock() {
        super(FabricBlockSettings.of(Material.SOIL)
                .breakByTool(FabricToolTags.SHOVELS)
                .breakByHand(true).ticksRandomly()
                .sounds(BlockSoundGroup.GRAVEL)
                .strength(0.6f, 1.5f));
    }

    //
    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        BlockPos blockPos = pos.up();
        if (world.isWater(blockPos)) {
            world.setBlockState(blockPos, REED_BLOCK.getDefaultState());
        }
    }

}
