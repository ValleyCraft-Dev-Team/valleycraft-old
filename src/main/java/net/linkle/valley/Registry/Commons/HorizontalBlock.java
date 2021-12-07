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
    
    /** A common method to set its default state. */
    protected void setDefaultState() {
        setDefaultState(stateManager.getDefaultState().with(FACING, Direction.NORTH));
    }

    /**
     * Please call this subclass method to append facing property:
     * <code>super.appendProperties(builder)</code>
     */
    @Override
    protected void appendProperties(Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    /**
     * Use {@link DirectionBlock#getFacing(ItemPlacementContext)} if you only modify
     * face direction placement.
     */
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return super.getPlacementState(ctx).with(FACING, getFacing(ctx));
    }

    /** Override this method for custom facing. */
    protected Direction getFacing(ItemPlacementContext ctx) {
        return ctx.getPlayerFacing();
    }

    /**
     * Utility method for horizontal side. If the block place on vertical side, then
     * get the player's yaw facing.
     */
    protected static Direction getSideElseUserFacing(ItemPlacementContext ctx) {
        final Direction side = ctx.getSide();
        return side.getAxis().isVertical() ? ctx.getPlayerFacing() : side.getOpposite();
    }
}
