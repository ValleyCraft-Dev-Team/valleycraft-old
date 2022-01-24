package io.github.linkle.valleycraft.blocks.decorations;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import io.github.linkle.valleycraft.blocks.HorizontalWithWaterBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public class LanternBlock extends HorizontalWithWaterBlock {
    private static final VoxelShape SHAPE = Block.createCuboidShape(5, 1, 5, 11, 8, 11);

    private final boolean emitsRedstone;
    
    public LanternBlock(int luminance, boolean emitsRedstone) {
        super(FabricBlockSettings.of(Material.METAL)
                .breakByHand(true)
                .sounds(BlockSoundGroup.CHAIN)
                .luminance(luminance)
                .strength(1f, 3.5f));
        setDefaultState();
        this.emitsRedstone = emitsRedstone;
    }
    
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        var state = super.getPlacementState(ctx);
        if (state.canPlaceAt(ctx.getWorld(), ctx.getBlockPos())) {
            return state;
        }
        return null;
    }
    
    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        var face = state.get(FACING);
        var offset = pos.offset(face);
        return world.getBlockState(offset).isSideSolidFullSquare(world, offset, face.getOpposite());
    }
    
    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (!state.canPlaceAt(world, pos)) {
            return Blocks.AIR.getDefaultState();
        }
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }
    
    @Override
    protected Direction getFacing(ItemPlacementContext ctx) {
        return getSideElseUserFacing(ctx);
    }
    
    @Override
    public boolean emitsRedstonePower(BlockState state) {
        return emitsRedstone;
    }
    
    @Override
    public int getWeakRedstonePower(BlockState state, BlockView world, BlockPos pos, Direction direction) {
        return emitsRedstone ? 15 : 0;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }
}

