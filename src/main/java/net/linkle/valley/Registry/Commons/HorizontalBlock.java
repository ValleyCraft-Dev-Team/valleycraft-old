package net.linkle.valley.Registry.Commons;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager.Builder;
import net.minecraft.util.math.Direction;

/**
 * Commonly used for blocks with horizontal facing. Overriding the method such
 * as appendProperties and getPlacementState without calling the subclass method
 * 'super.appendProperties()' is prone to break block's horizontal facing.
 */
public class HorizontalBlock extends HorizontalFacingBlock {

    protected HorizontalBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected void appendProperties(Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return super.getPlacementState(ctx).with(FACING, getFacing(ctx));
    }
    
    /** Override this method for custom facing. */
    protected Direction getFacing(ItemPlacementContext ctx) {
        return ctx.getPlayerFacing();
    }
}
