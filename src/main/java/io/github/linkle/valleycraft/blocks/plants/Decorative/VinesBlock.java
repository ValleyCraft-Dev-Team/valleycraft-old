package io.github.linkle.valleycraft.blocks.plants.Decorative;

import java.util.Random;

import net.minecraft.block.AbstractPlantBlock;
import net.minecraft.block.AbstractPlantStemBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.VineLogic;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.WorldAccess;

public class VinesBlock extends AbstractPlantStemBlock {

    public static final int MAX_AGE = 5;

    private Block plant;
    private final double growthChance;

    public VinesBlock(Settings settings) {
        this(settings, createCuboidShape(4, 9, 4, 12, 16, 12));
    }

    public VinesBlock(Settings settings, VoxelShape shape) {
        super(settings, Direction.DOWN, shape, false, 0.1);
        growthChance = 0.1;
    }

    public void setPlant(AbstractPlantBlock plant) {
        this.plant = plant;
    }

    @Override
    public BlockState getRandomGrowthState(WorldAccess world) {
        return getDefaultState().with(AGE, world.getRandom().nextInt(MAX_AGE));
    }

    @Override
    public boolean hasRandomTicks(BlockState state) {
        return state.get(AGE) < MAX_AGE;
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        BlockPos blockPos;
        if (state.get(AGE) < MAX_AGE && random.nextDouble() < growthChance && chooseStemState(world.getBlockState(blockPos = pos.offset(growthDirection)))) {
            world.setBlockState(blockPos, age(state, world.random));
        }
    }

    @Override
    protected BlockState age(BlockState state, Random random) {
        return state.cycle(AGE);
    }

    @Override
    public BlockState withMaxAge(BlockState state) {
        return state.with(AGE, MAX_AGE);
    }

    @Override
    public boolean hasMaxAge(BlockState state) {
        return state.get(AGE) == MAX_AGE;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        BlockPos blockPos = pos.offset(growthDirection);
        int age = Math.min(state.get(AGE) + 1, MAX_AGE);
        int len = getGrowthLength(random);
        for (int i = 0; i < len && chooseStemState(world.getBlockState(blockPos)); ++i) {
            world.setBlockState(blockPos, state.with(AGE, age));
            blockPos = blockPos.offset(growthDirection);
            age = Math.min(age + 1, MAX_AGE);
        }
    }

    @Override
    protected int getGrowthLength(Random random) {
        return VineLogic.getGrowthLength(random);
    }

    @Override
    protected Block getPlant() {
        return plant;
    }

    @Override
    protected boolean chooseStemState(BlockState state) {
        return VineLogic.isValidForWeepingStem(state);
    }
}
