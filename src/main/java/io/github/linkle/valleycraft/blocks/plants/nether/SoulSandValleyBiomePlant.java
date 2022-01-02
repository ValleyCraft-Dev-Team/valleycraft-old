package io.github.linkle.valleycraft.blocks.plants.nether;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.Random;

public class SoulSandValleyBiomePlant extends PlantBlock {
    protected static final VoxelShape SHAPE = Block.createCuboidShape(2, 0, 2, 14, 13, 14);

    public SoulSandValleyBiomePlant() {
        super(FabricBlockSettings.of(Material.NETHER_SHOOTS)
                .nonOpaque()
                .breakByHand(true).ticksRandomly()
                .sounds(BlockSoundGroup.NYLIUM).luminance(7)
                .strength(0.4f, 0.2f));
    }

    public SoulSandValleyBiomePlant(Settings settings) {
        super(settings);
    }

    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        Block block = floor.getBlock();
        return  block == Blocks.SOUL_SOIL ||
                block == Blocks.SOUL_SAND;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if (random.nextInt(10) != 0)
            return;

        double x = pos.getX() + 0.5;
        double y = pos.getY() + 0.1;
        double z = pos.getZ() + 0.5;
        double xRand = MathHelper.nextDouble(random, -0.1, 0.1);
        double yRand = MathHelper.nextDouble(random, -0.1, 0.1);
        double zRand = MathHelper.nextDouble(random, -0.1, 0.1);
        world.addParticle(ParticleTypes.SOUL, x, y, z, xRand, 0.05 + yRand, zRand);
    }

    public static final VoxelShape BlockCollisionShape;

    public VoxelShape getCollisionShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return BlockCollisionShape;
    }

    static {
        BlockCollisionShape = VoxelShapes.empty();
    }
}
