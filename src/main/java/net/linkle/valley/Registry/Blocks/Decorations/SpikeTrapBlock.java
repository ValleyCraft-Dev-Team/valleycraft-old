package net.linkle.valley.Registry.Blocks.Decorations;

import net.linkle.valley.Registry.Commons.DirectionBlockWithWater;
import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class SpikeTrapBlock extends DirectionBlockWithWater {
    protected static final VoxelShape SHAPE = Block.createCuboidShape(1, 1, 1, 15, 15, 15);

    public SpikeTrapBlock(AbstractBlock.Settings settings) {
        super(settings.noCollision());
        this.setDefaultState(this.stateManager.getDefaultState().with(WATERLOGGED, false).with(FACING, Direction.DOWN));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return true;
    }
    
    @Override
    protected Direction getFacing(ItemPlacementContext ctx) {
        return super.getFacing(ctx).getOpposite();
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (entity instanceof LivingEntity && entity.getType() != EntityType.BEE) {
            if (state.get(WATERLOGGED)) {
                entity.damage(DamageSource.CACTUS, 2.0F);
            }
            entity.damage(DamageSource.CACTUS, 4.0F);
        }
    }
}
