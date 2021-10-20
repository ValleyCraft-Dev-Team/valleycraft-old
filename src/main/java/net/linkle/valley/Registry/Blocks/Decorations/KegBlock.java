package net.linkle.valley.Registry.Blocks.Decorations;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.item.Items;
import net.minecraft.potion.PotionUtil;
import net.minecraft.potion.Potions;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.tag.FluidTags;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class KegBlock extends FacingBlock {
    public static final VoxelShape COLLISION_SHAPE;
    public static final VoxelShape OUTLINE_SHAPE;
    protected static final VoxelShape EAST_SHAPE;
    protected static final VoxelShape WEST_SHAPE;
    protected static final VoxelShape SOUTH_SHAPE;
    protected static final VoxelShape NORTH_SHAPE;
    protected static final VoxelShape UP_SHAPE;
    protected static final VoxelShape DOWN_SHAPE;

    public KegBlock(FabricBlockSettings strength) {
        super(FabricBlockSettings.of(Material.WOOD).nonOpaque()
                .breakByHand(true)
                .sounds(BlockSoundGroup.WOOD)
                .strength(1.0f, 1.0f));
        this.setDefaultState((BlockState)((BlockState)this.stateManager.getDefaultState()).with(FACING, Direction.NORTH));
    }

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

    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return (BlockState)super.getPlacementState(ctx).with(FACING, ctx.getPlayerLookDirection().getOpposite());
    }

    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!state.canPlaceAt(world, pos)) {
            world.breakBlock(pos, true);
        }

    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return COLLISION_SHAPE;
    }

    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }

    static {
        COLLISION_SHAPE = Block.createCuboidShape(1.0D, 0.0D, 1.0D, 15.0D, 15.0D, 15.0D);
        OUTLINE_SHAPE = Block.createCuboidShape(1.0D, 0.0D, 1.0D, 15.0D, 16.0D, 15.0D);
        UP_SHAPE = Block.createCuboidShape(1.0D, 0.0D, 1.0D, 15.0D, 16.0D, 15.0D);
        DOWN_SHAPE = Block.createCuboidShape(1.0D, 0.0D, 1.0D, 15.0D, 16.0D, 15.0D);
        EAST_SHAPE = Block.createCuboidShape(1.0D, 0.0D, 1.0D, 15.0D, 16.0D, 15.0D);
        WEST_SHAPE = Block.createCuboidShape(1.0D, 0.0D, 1.0D, 15.0D, 16.0D, 15.0D);
        NORTH_SHAPE = Block.createCuboidShape(1.0D, 0.0D, 1.0D, 15.0D, 16.0D, 15.0D);
        SOUTH_SHAPE = Block.createCuboidShape(1.0D, 0.0D, 1.0D, 15.0D, 16.0D, 15.0D);
    }

    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        var stack = player.getStackInHand(hand);
        if (!world.isClient) {
            boolean hasFill = false;
            if (stack.isOf(Items.BUCKET)) {
                hasFill = true;
                player.setStackInHand(hand, ItemUsage.exchangeStack(stack, player, new ItemStack(Items.WATER_BUCKET)));
            } else if (stack.isOf(Items.GLASS_BOTTLE)) {
                hasFill = true;
                player.setStackInHand(hand, ItemUsage.exchangeStack(stack, player, PotionUtil.setPotion(new ItemStack(Items.POTION), Potions.WATER)));
            }

            if (hasFill) {
                world.playSound((PlayerEntity)null, pos,
                        stack.isOf(Items.BUCKET) ? SoundEvents.ITEM_BUCKET_FILL : SoundEvents.ITEM_BOTTLE_FILL,
                        SoundCategory.BLOCKS, 1.0F, 1.0F);
            }
        }

        return stack.isOf(Items.BUCKET) || stack.isOf(Items.GLASS_BOTTLE) ? ActionResult.success(world.isClient) : ActionResult.PASS;
    }

    @Override
    public void appendTooltip(ItemStack itemStack, BlockView world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add( new TranslatableText("block.valley.keg.tooltip") );
    }
}
