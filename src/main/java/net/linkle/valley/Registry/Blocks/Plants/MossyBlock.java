package net.linkle.valley.Registry.Blocks.Plants;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldAccess;

import java.util.Random;

import static net.linkle.valley.Registry.Initializers.Plants.MOSSY_VINE;
import static net.minecraft.block.Blocks.MOSS_CARPET;

public class MossyBlock extends OreBlock {
    
    public static final BooleanProperty MOSSY = BooleanProperty.of("mossy");

    public MossyBlock() {
        super(FabricBlockSettings.of(Material.STONE)
                .requiresTool()
                .breakByTool(FabricToolTags.PICKAXES, 1)
                .ticksRandomly()
                .sounds(BlockSoundGroup.STONE)
                .strength(3, 3f));
        setDefaultState(stateManager.getDefaultState().with(MOSSY, false));
    }
    
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        return direction == Direction.UP ? state.with(MOSSY, isMoss(neighborState)) : super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockState blockState = ctx.getWorld().getBlockState(ctx.getBlockPos().up());
        return this.getDefaultState().with(MOSSY, isMoss(blockState));
    }

    private static boolean isMoss(BlockState state) {
        return state.isOf(Blocks.MOSS_CARPET) || state.isOf(Blocks.MOSS_BLOCK);
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(MOSSY);
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
