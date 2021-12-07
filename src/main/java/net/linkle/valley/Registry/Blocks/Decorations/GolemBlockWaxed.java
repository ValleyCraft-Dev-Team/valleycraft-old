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
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class GolemBlockWaxed extends HorizontalWithWaterBlock {
    private static final VoxelShape SHAPE = Block.createCuboidShape(4, 0, 4, 12, 12, 12);

    public GolemBlockWaxed() {
        super(FabricBlockSettings.of(Material.METAL)
                .breakByHand(true)
                .sounds(BlockSoundGroup.CHAIN).luminance(4)
                .strength(1.5f, 2.5f));
        setDefaultState();
    }
    
    @Override
    protected Direction getFacing(ItemPlacementContext ctx) {
        return super.getFacing(ctx).getOpposite();
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }

    @Override
    public void appendTooltip(ItemStack itemStack, BlockView world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add( new TranslatableText("block.valley.golem_waxed.tooltip") );
        tooltip.add( new TranslatableText("block.valley.golem_waxed.tooltip_2") );
    }
}

