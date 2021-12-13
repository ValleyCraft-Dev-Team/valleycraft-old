package net.linkle.valley.Registry.Blocks.Plants.Decorative;

import static net.minecraft.block.Blocks.MOSS_CARPET;
import static net.minecraft.block.Blocks.SPORE_BLOSSOM;

import java.util.Random;

import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;

public class SporeBlock extends OreBlock {

    public SporeBlock() {
        super(Settings.of(Material.STONE)
                .requiresTool()
                .ticksRandomly()
                .sounds(BlockSoundGroup.STONE)
                .strength(2, 5));
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (world.random.nextInt(5) > 0) {
            return;
        }
        
        BlockPos blockPos = pos.down();
        if (world.isAir(blockPos)) {
            world.setBlockState(blockPos, SPORE_BLOSSOM.getDefaultState());
        }

        BlockPos blockPosTop = pos.up();
        if (world.isAir(blockPosTop)) {
            world.setBlockState(blockPosTop, MOSS_CARPET.getDefaultState());
        }
    }


}
