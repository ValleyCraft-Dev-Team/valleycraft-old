package net.linkle.valley.Registry.Blocks.Decorations;

import java.util.List;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.linkle.valley.Registry.Commons.HorizontalWithWaterBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.ShapeContext;
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
import net.minecraft.world.World;

public class ScreenBlock extends HorizontalWithWaterBlock {
    private static final VoxelShape EAST_SHAPE;
    private static final VoxelShape WEST_SHAPE;
    private static final VoxelShape SOUTH_SHAPE;
    private static final VoxelShape NORTH_SHAPE;

    public ScreenBlock() {
        super(FabricBlockSettings.of(Material.METAL).nonOpaque()
                .breakByHand(true)
                .sounds(BlockSoundGroup.METAL)
                .strength(1f,5f));
        setDefaultState(stateManager.getDefaultState().with(WATERLOGGED, false).with(FACING, Direction.NORTH));
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
            default:
                return NORTH_SHAPE;
        }
    }

    @Override
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }

    static {
        EAST_SHAPE = Block.createCuboidShape(15,0,0,16,20,16);
        NORTH_SHAPE = Block.createCuboidShape(0,0,0,16,20,1);
        WEST_SHAPE = Block.createCuboidShape(0,0,0,1,20,16);
        SOUTH_SHAPE = Block.createCuboidShape(0,0,15,16,20,16);
    }

    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        //default white text
        tooltip.add(new TranslatableText("block.screen.tooltip"));
        tooltip.add(new TranslatableText("block.screen.tooltip_two"));
    }
}

