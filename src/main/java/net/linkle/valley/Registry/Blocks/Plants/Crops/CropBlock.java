package net.linkle.valley.Registry.Blocks.Plants.Crops;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Fertilizable;
import net.minecraft.block.PlantBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public abstract class CropBlock extends PlantBlock implements Fertilizable {
    
    protected final VoxelShape[] shapes;
    protected IntProperty ageProp;

    protected CropBlock(Settings settings) {
        super(settings);
        shapes = new VoxelShape[getMaxAge()+1];
    }
    
    protected final void setDefaultState() {
        setDefaultState(stateManager.getDefaultState().with(ageProp, 0));
    }
    
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return shapes[state.get(ageProp)];
    }
    
    @Override
    public boolean isFertilizable(BlockView world, BlockPos pos, BlockState state, boolean isClient) {
        return state.get(ageProp) < getMaxAge();
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        int i = Math.min(getMaxAge(), state.get(ageProp)+MathHelper.nextInt(world.random, 2, 3));
        world.setBlockState(pos, state.with(ageProp, i), 2);
    }
    
    @Override
    public boolean hasRandomTicks(BlockState state) {
        return state.get(ageProp) < getMaxAge();
    }
    
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(ageProp = IntProperty.of("age", 0, getMaxAge()));
    }
    
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        int age = state.get(ageProp);
        boolean mature = age == getMaxAge();
        
        if (!mature && player.getStackInHand(hand).getItem() == Items.BONE_MEAL) {
            return ActionResult.PASS;
        }
        
        if (mature) {
            dropStack(world, pos, new ItemStack(getPickItem(), getAmount(world.random) + (mature ? 1 : 0)));
            world.playSound(null, pos, SoundEvents.ITEM_CROP_PLANT, SoundCategory.BLOCKS, 1.0F, 0.8F + world.random.nextFloat() * 0.4F);
            world.setBlockState(pos, state.with(ageProp, getPickedMinAge()), 2);
            return ActionResult.success(world.isClient);
        }
        
        return super.onUse(state, world, pos, player, hand, hit);
    }
    
    protected final void growTick(ServerWorld world, BlockState state, BlockPos pos, int chance) {
        int age = state.get(ageProp);
        if (age < 6 && world.random.nextInt(chance) == 0 && world.getBaseLightLevel(pos, 0) >= 8) {
            world.setBlockState(pos, state.with(ageProp, age + 1), 2);
        }
    }
    
    @Override
    public abstract void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random);
    
    /** Get crop's drop/pick item. */
    protected abstract ItemConvertible getPickItem();
    
    /** Get crop's pick amount/count. */
    protected abstract int getAmount(Random random);
    
    /** Get min age after it been picked. */
    protected abstract int getPickedMinAge();
    
    /** Get max age. */
    protected abstract int getMaxAge();
}
