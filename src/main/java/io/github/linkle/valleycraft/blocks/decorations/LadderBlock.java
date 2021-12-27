package io.github.linkle.valleycraft.blocks.decorations;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import io.github.linkle.valleycraft.blocks.HorizontalWithWaterBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class LadderBlock extends HorizontalWithWaterBlock {
    protected static final VoxelShape EAST_SHAPE;
    protected static final VoxelShape WEST_SHAPE;
    protected static final VoxelShape SOUTH_SHAPE;
    protected static final VoxelShape NORTH_SHAPE;
    
    public LadderBlock() {
        this(FabricBlockSettings.of(Material.WOOD)
                .sounds(BlockSoundGroup.WOOD)
                .strength(0.6f));
    }

    public LadderBlock(FabricBlockSettings setting) {
        super(setting.nonOpaque().breakByHand(true));
        setDefaultState();
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        switch (state.get(FACING)) {
            case NORTH:
                return NORTH_SHAPE;
            case SOUTH:
                return SOUTH_SHAPE;
            case WEST:
                return WEST_SHAPE;
            case EAST:
                return EAST_SHAPE;
            default: return NORTH_SHAPE;
        }
    }
    
    @Override
    protected Direction getFacing(ItemPlacementContext ctx) {
        var pos = ctx.getBlockPos();
        var world = ctx.getWorld();
        var side = ctx.getSide();
        BlockState state;
        
        if (side.getAxis().isVertical()) {
            state = world.getBlockState(pos.offset(side.getOpposite()));
            if (state.getBlock() instanceof LadderBlock) {
                return state.get(FACING);
            }
        }
        
        if ((state = world.getBlockState(pos.down())).getBlock() instanceof LadderBlock) {
            return state.get(FACING);
        } 
        if ((state = world.getBlockState(pos.up())).getBlock() instanceof LadderBlock) {
            return state.get(FACING);
        }
        
        return getSideElseUserFacing(ctx);
    }

    @Override
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }

    static {
        EAST_SHAPE = Block.createCuboidShape(13,0,0,16,16,16);
        NORTH_SHAPE = Block.createCuboidShape(0,0,0,16,16,3);
        WEST_SHAPE = Block.createCuboidShape(0,0,0,3,16,16);
        SOUTH_SHAPE = Block.createCuboidShape(0,0,13,16,16,16);
    }
}

