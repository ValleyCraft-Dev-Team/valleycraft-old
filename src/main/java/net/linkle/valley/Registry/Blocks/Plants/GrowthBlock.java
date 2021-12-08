package net.linkle.valley.Registry.Blocks.Plants;

import java.util.Random;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldAccess;

public abstract class GrowthBlock extends Block {

    public static final BooleanProperty MOSSY = BooleanProperty.of("mossy");

    public GrowthBlock() {
        super(FabricBlockSettings.of(Material.STONE)
                .requiresTool()
                .breakByTool(FabricToolTags.PICKAXES, 1)
                .ticksRandomly()
                .sounds(BlockSoundGroup.STONE)
                .strength(2, 5));
        setDefaultState(stateManager.getDefaultState().with(MOSSY, false));
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        return direction == Direction.UP ? state.with(MOSSY, isBlockUpper(neighborState)) : super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockState blockState = ctx.getWorld().getBlockState(ctx.getBlockPos().up());
        return getDefaultState().with(MOSSY, isBlockUpper(blockState));
    }

    protected abstract boolean isBlockUpper(BlockState state);
    
    protected abstract BlockState getBlockUpper();
    
    protected abstract BlockState getBlockLower();

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(MOSSY);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (world.random.nextInt(5) > 0) {
            return;
        }
        
        BlockPos blockPos = pos.down();
        if (world.isAir(blockPos)) {
            world.setBlockState(blockPos, getBlockLower());
        }

        BlockPos blockPosTop = pos.up();
        if (world.isAir(blockPosTop)) {
            world.setBlockState(blockPosTop, getBlockUpper());
        }
    }
}
