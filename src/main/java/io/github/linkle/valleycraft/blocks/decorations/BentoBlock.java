package io.github.linkle.valleycraft.blocks.decorations;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import io.github.linkle.valleycraft.blocks.HorizontalWithWaterBlock;
import net.minecraft.block.*;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction.Axis;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class BentoBlock extends HorizontalWithWaterBlock {
    protected static final VoxelShape SHAPE_X = Block.createCuboidShape(5, 0, 3, 11, 3.5, 13);
    protected static final VoxelShape SHAPE_Z = Block.createCuboidShape(3, 0, 5, 13, 3.5, 11);

    public BentoBlock() {
        super(FabricBlockSettings.of(Material.WOOD)
                .sounds(BlockSoundGroup.WOOD)
                .strength(0.5f, 2.5f));
        setDefaultState();
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return state.get(FACING).getAxis() == Axis.X ? SHAPE_X : SHAPE_Z;
    }

    @Override
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }
}

