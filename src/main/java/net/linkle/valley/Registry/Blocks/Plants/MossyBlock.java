package net.linkle.valley.Registry.Blocks.Plants;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.datafixer.fix.ChunkPalettedStorageFix;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.Random;

import static net.linkle.valley.Registry.Initializers.Blocks.MOSSY_VINE;
import static net.linkle.valley.Registry.Initializers.Blocks.REED_BLOCK;
import static net.minecraft.block.Blocks.MOSS_CARPET;
import static net.minecraft.block.Blocks.VINE;
import static net.minecraft.state.property.Properties.FACING;

public class MossyBlock extends OreBlock {

    public MossyBlock() {
        super(FabricBlockSettings.of(Material.STONE)
                .breakByTool(FabricToolTags.PICKAXES)
                .breakByHand(false).ticksRandomly()
                .sounds(BlockSoundGroup.STONE)
                .strength(3, 3f));
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        BlockPos blockPos = pos.down();
        if (world.isAir(blockPos)) {
            world.setBlockState(blockPos, MOSSY_VINE.getDefaultState());
        }

        BlockPos blockPosTop = pos.up();
        if (world.isAir(blockPosTop)) {
            world.setBlockState(blockPosTop, MOSS_CARPET.getDefaultState());
        }
    }


}
