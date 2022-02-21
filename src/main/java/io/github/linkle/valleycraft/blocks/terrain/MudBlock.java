package io.github.linkle.valleycraft.blocks.terrain;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FallingBlock;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

//Largely a copy-paste of the vanilla ConcretePowderBlock.class, since private methods there made extension & overriding impractical.
//The only notable change is that WATER was replaced with LAVA in the check for adjacent fluids.

public class MudBlock extends FallingBlock {
    private final BlockState hardenedState;

    public MudBlock(Block hardened, Settings settings) {
        super (settings);
        hardenedState = hardened.getDefaultState();
    }

    @Override
    public void onLanding(World world, BlockPos pos, BlockState fallingBlockState, BlockState currentStateInPos, FallingBlockEntity fallingBlockEntity) {
        if (MudBlock.shouldHarden(world, pos, currentStateInPos)) {
            world.setBlockState(pos, hardenedState, Block.NOTIFY_ALL);
        }
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockPos blockPos;
        World blockView = ctx.getWorld();
        if (MudBlock.shouldHarden(blockView, blockPos = ctx.getBlockPos(), blockView.getBlockState(blockPos))) {
            return hardenedState;
        }
        return super.getPlacementState(ctx);
    }

    public static boolean shouldHarden(BlockView world, BlockPos pos, BlockState state) {
        return MudBlock.hardensIn(state) || MudBlock.hardensOnAnySide(world, pos);
    }

    public static boolean hardensOnAnySide(BlockView world, BlockPos pos) {
        boolean bl = false;
        BlockPos.Mutable mutable = pos.mutableCopy();
        for (Direction direction : Direction.values()) {
            BlockState blockState = world.getBlockState(mutable);
            if (direction == Direction.DOWN && !MudBlock.hardensIn(blockState)) continue;
            mutable.set(pos, direction);
            blockState = world.getBlockState(mutable);
            if (!MudBlock.hardensIn(blockState) || blockState.isSideSolidFullSquare(world, pos, direction.getOpposite())) continue;
            bl = true;
            break;
        }
        return bl;
    }

    public static boolean hardensIn(BlockState state) {
        return state.getFluidState().isIn(FluidTags.LAVA);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (MudBlock.hardensOnAnySide(world, pos)) {
            return hardenedState;
        }
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    public int getColor(BlockState state, BlockView world, BlockPos pos) {
        return state.getMapColor(world, pos).color;
    }
}