package io.github.linkle.valleycraft.blocks.plants.aquatic;

import java.util.Random;

import io.github.linkle.valleycraft.network.ServerNetwork;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager.Builder;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class GiantClamBlock extends AquaticFacingBlock {
    protected static final BooleanProperty OPEN = Properties.OPEN;
    public static final VoxelShape SHAPE = Block.createCuboidShape(1, 0, 1, 15, 4, 15);
    
    public static final int MAX_TICK = 50;

    public GiantClamBlock() {
        super(getSettings().strength(0.3f, 0.5f), SHAPE);
        setDefaultState(stateManager.getDefaultState()
                .with(FACING, Direction.NORTH)
                .with(WATERLOGGED, false)
                .with(OPEN, false));
    }

    @Override
    protected void appendProperties(Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(OPEN);
    }
    
    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        super.randomTick(state, world, pos, random);

        if (random.nextInt(3) != 0 || state.get(OPEN) || !state.get(WATERLOGGED)) {
            return;
        }

        open(state, world, pos);
        ServerNetwork.sendScallopOpen(world, pos);
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
            ServerNetwork.sendScallopOpen(server, pos);
        }

        return ActionResult.SUCCESS;
    }

    protected void open(BlockState state, World world, BlockPos pos) {
        world.setBlockState(pos, state.with(OPEN, true), Block.NOTIFY_ALL);
        world.updateNeighborsAlways(pos, this);
        world.createAndScheduleBlockTick(pos, this, MAX_TICK);
    }
}