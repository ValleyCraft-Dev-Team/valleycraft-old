package io.github.linkle.valleycraft.blocks.plants.nether;

import java.util.Random;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.PlantBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class SoulSandValleyBiomePlant extends PlantBlock {
    protected static final VoxelShape SHAPE = createCuboidShape(2, 0, 2, 14, 13, 14);

    public SoulSandValleyBiomePlant() {
        super(FabricBlockSettings.of(Material.NETHER_SHOOTS)
                .nonOpaque().luminance(7)
                .ticksRandomly()
                .sounds(BlockSoundGroup.FUNGUS)
                .strength(0, 0.2f)
                .noCollision());
    }

    public SoulSandValleyBiomePlant(Settings settings) {
        super(settings);
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isIn(BlockTags.SOUL_SPEED_BLOCKS);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if (random.nextInt(10) != 0)
            return;

        double x = pos.getX() + MathHelper.nextDouble(random, 0.2, 0.8);
        double y = pos.getY() + MathHelper.nextDouble(random, 0.2, 0.8);
        double z = pos.getZ() + MathHelper.nextDouble(random, 0.2, 0.8);
        double xRand = MathHelper.nextDouble(random, -0.05, 0.05);
        double yRand = MathHelper.nextDouble(random, -0.05, 0.05) + 0.03;
        double zRand = MathHelper.nextDouble(random, -0.05, 0.05);
        world.addParticle(ParticleTypes.SOUL, x, y, z, xRand, yRand, zRand);
    }
}
