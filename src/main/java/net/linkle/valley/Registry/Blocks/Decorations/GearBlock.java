package net.linkle.valley.Registry.Blocks.Decorations;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.linkle.valley.Registry.Commons.DirectionBlockWithWater;
import net.minecraft.block.*;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

import java.util.List;

public class GearBlock extends DirectionBlockWithWater {
    protected static final VoxelShape EAST_SHAPE;
    protected static final VoxelShape WEST_SHAPE;
    protected static final VoxelShape SOUTH_SHAPE;
    protected static final VoxelShape NORTH_SHAPE;
    protected static final VoxelShape UP_SHAPE;
    protected static final VoxelShape DOWN_SHAPE;

    public GearBlock() {
        super(FabricBlockSettings.of(Material.WOOD)
                .breakByHand(true)
                .sounds(BlockSoundGroup.WOOD)
                .strength(1.0f, 0.5f));
        setDefaultState(stateManager.getDefaultState().with(WATERLOGGED, false).with(FACING, Direction.NORTH));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        switch ((Direction)state.get(FACING)) {
            case NORTH:
                return NORTH_SHAPE;
            case SOUTH:
                return SOUTH_SHAPE;
            case WEST:
                return WEST_SHAPE;
            case EAST:
                return EAST_SHAPE;
            case UP:
                return UP_SHAPE;
            case DOWN:
            default:
                return DOWN_SHAPE;
        }
    }

    @Override
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }
    
    @Override
    public void appendTooltip(ItemStack itemStack, BlockView world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add( new TranslatableText("block.valley.gear.tooltip") );
        tooltip.add( new TranslatableText("block.valley.gear.tooltip_2") );

    }

    static {
        UP_SHAPE = Block.createCuboidShape(1.0D, 1.0D, 0.0D, 15.0D, 15.0D, 1.0D);
        DOWN_SHAPE = Block.createCuboidShape(1.0D, 1.0D, 0.0D, 15.0D, 15.0D, 1.0D);
        WEST_SHAPE = Block.createCuboidShape(0.0D, 1.0D, 1.0D, 1.0D, 15.0D, 15.0D);
        EAST_SHAPE = Block.createCuboidShape(15.0D, 1.0D, 1.0D, 16.0D, 15.0D, 15.0D);
        NORTH_SHAPE = Block.createCuboidShape(1.0D, 1.0D, 0.0D, 15.0D, 15.0D, 1.0D);
        SOUTH_SHAPE = Block.createCuboidShape(1.0D, 1.0D, 15.0D, 15.0D, 15.0D, 16.0D);
    }
}

