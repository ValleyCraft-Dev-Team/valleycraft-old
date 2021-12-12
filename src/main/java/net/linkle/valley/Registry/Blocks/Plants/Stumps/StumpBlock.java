package net.linkle.valley.Registry.Blocks.Plants.Stumps;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

public class StumpBlock extends Block {
    
    private final BlockState mushroom;

    public StumpBlock(BlockState mushroom) {
        super(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)
                .breakByTool(FabricToolTags.AXES)
                .breakByHand(true).ticksRandomly()
                .nonOpaque());
        this.mushroom = mushroom;
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (world.random.nextInt(5) == 0) {
            return;
        }
        
        var up = pos.up();
        if (world.isAir(up)) {
            world.setBlockState(up, mushroom);
        }
    }
}
