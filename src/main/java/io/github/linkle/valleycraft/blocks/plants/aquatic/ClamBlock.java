package io.github.linkle.valleycraft.blocks.plants.aquatic;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager.Builder;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class ClamBlock extends AquaticBlock {
    protected static final BooleanProperty OPEN = Properties.OPEN;

    public ClamBlock() {
        setDefaultState(stateManager.getDefaultState().with(FACING, Direction.NORTH).with(WATERLOGGED, false).with(OPEN,
                false));
    }

    @Override
    protected void appendProperties(Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(OPEN);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        super.randomTick(state, world, pos, random);
        
        if (state.get(OPEN) || !state.get(WATERLOGGED)) {
            return;
        }
        
        open(state, world, pos);
        spawnBubbles(world, pos);
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!state.get(OPEN).booleanValue()) {
            return;
        }

        world.setBlockState(pos, state.with(OPEN, false), Block.NOTIFY_ALL);
        world.updateNeighborsAlways(pos, this);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand,
            BlockHitResult hit) {
        if (state.get(OPEN) || !state.get(WATERLOGGED)) {
            return ActionResult.PASS;
        }

        open(state, world, pos);
        
        if (world instanceof ServerWorld server) {
            spawnBubbles(server, pos);
        }
        
        return ActionResult.SUCCESS;
    }
    

    protected void open(BlockState state, World world, BlockPos pos) {
        world.setBlockState(pos, state.with(OPEN, true), Block.NOTIFY_ALL);
        world.updateNeighborsAlways(pos, this);
        world.createAndScheduleBlockTick(pos, this, 30);
    }
    
    @Override
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        super.onStateReplaced(state, world, pos, newState, moved);
    }

    protected void spawnBubbles(ServerWorld world, BlockPos pos) {
        double x = pos.getX() + 0.5;
        double y = pos.getY() + 0.15;
        double z = pos.getZ() + 0.5;
        world.spawnParticles(ParticleTypes.BUBBLE_COLUMN_UP, x, y, z, 5, 0.05, 0.05, 0.05, 0.2);
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if (!state.get(OPEN))
            return;
        
        double x = pos.getX() + 0.5;
        double y = pos.getY() + 0.1;
        double z = pos.getZ() + 0.5;
        double xRand = MathHelper.nextDouble(random, -0.1, 0.1);
        double yRand = MathHelper.nextDouble(random, -0.1, 0.1);
        double zRand = MathHelper.nextDouble(random, -0.1, 0.1);
        world.addParticle(ParticleTypes.BUBBLE_COLUMN_UP, x, y, z, xRand, 0.1 + yRand, zRand);
    }
}