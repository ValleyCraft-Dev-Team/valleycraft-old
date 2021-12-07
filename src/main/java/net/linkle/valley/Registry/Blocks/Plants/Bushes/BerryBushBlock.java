package net.linkle.valley.Registry.Blocks.Plants.Bushes;

import java.util.function.Predicate;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SweetBerryBushBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class BerryBushBlock extends SweetBerryBushBlock {
    
    private final boolean damageEntity;
    private final Predicate<BlockState> canPlantOnTop;
    
    public BerryBushBlock(boolean damageEntity) {
        this(damageEntity, floor -> floor.isIn(BlockTags.DIRT) || floor.isOf(Blocks.FARMLAND));
    }

    public BerryBushBlock(boolean damageEntity, Predicate<BlockState> canPlantOnTop) {
        super(Settings.copy(Blocks.SWEET_BERRY_BUSH));
        this.damageEntity = damageEntity;
        this.canPlantOnTop = canPlantOnTop;
    }
    
    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (damageEntity) {
            super.onEntityCollision(state, world, pos, entity);
        }
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        int age = state.get(AGE);
        boolean grown = age == MAX_AGE;
        
        if (!grown && player.getStackInHand(hand).isOf(Items.BONE_MEAL)) {
            return ActionResult.PASS;
        }
        
        if (age > 1) {
            int amount = 1 + world.random.nextInt(2);
            dropStack(world, pos, new ItemStack(this, amount + (grown ? 1 : 0)));
            world.playSound((PlayerEntity)null, pos, SoundEvents.ITEM_CROP_PLANT, SoundCategory.BLOCKS, 1.0F, 0.8F + world.random.nextFloat() * 0.4F);
            world.setBlockState(pos, state.with(AGE, 1), Block.NOTIFY_LISTENERS);
            return ActionResult.success(world.isClient);
        }
        
        return super.onUse(state, world, pos, player, hand, hit);
    }
    
    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return canPlantOnTop.test(floor);
    }
}
