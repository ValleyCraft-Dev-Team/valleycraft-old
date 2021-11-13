package net.linkle.valley.Registry.Blocks.Decorations;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.linkle.valley.Registry.Commons.HorizontalWithWaterBlock;
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

public class LanternBlock extends HorizontalWithWaterBlock {
    private static final VoxelShape SHAPE = Block.createCuboidShape(5, 1, 5, 11, 8, 11);

    private final boolean emitsRedstone;
    
    public LanternBlock(int luminance, boolean emitsRedstone) {
        super(FabricBlockSettings.of(Material.METAL)
                .breakByHand(true)
                .sounds(BlockSoundGroup.CHAIN).luminance(luminance)
                .strength(1f, 3.5f));
        setDefaultState(stateManager.getDefaultState().with(WATERLOGGED, false).with(FACING, Direction.NORTH));
        this.emitsRedstone = emitsRedstone;
    }
    
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        var state = super.getPlacementState(ctx);
        var face = ctx.getSide();
        
        if (face.getAxis().isHorizontal()) {
            return state.with(FACING, face.getOpposite());
        }
        
        return state;
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

