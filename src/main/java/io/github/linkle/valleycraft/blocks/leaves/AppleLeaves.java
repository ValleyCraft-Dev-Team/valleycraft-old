package io.github.linkle.valleycraft.blocks.leaves;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class AppleLeaves extends LeavesBlock {
    private final BooleanProperty HAS_APPLES = BooleanProperty.of("has_apples");

    public AppleLeaves(Settings settings) {
        super(settings);
        setDefaultState(getDefaultState().with(HAS_APPLES, false));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(HAS_APPLES);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (state.get(HAS_APPLES)) {
            world.setBlockState(pos, state.with(HAS_APPLES, false));
            dropStack(world, pos, new ItemStack(Items.APPLE, 2));
        }
        return ActionResult.FAIL;
    }
}