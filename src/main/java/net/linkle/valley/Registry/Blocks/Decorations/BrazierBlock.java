package net.linkle.valley.Registry.Blocks.Decorations;

import java.util.Random;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.linkle.valley.Registry.Commons.BlockWithWater;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.ShapeContext;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class BrazierBlock extends BlockWithWater {
    protected static final VoxelShape SHAPE = createCuboidShape(5, 0, 5, 11, 16, 11);
    
    private final float fireDamage;

    public BrazierBlock(int luminance, float fireDamage) {
        super(FabricBlockSettings.of(Material.WOOD)
                .breakByHand(true).breakByTool(FabricToolTags.AXES)
                .sounds(BlockSoundGroup.STONE)
                .luminance(state -> state.get(WATERLOGGED) ? 0 : luminance)
                .strength(1.0f, 1.0f));
        this.fireDamage = fireDamage;
        setDefaultState();
    }
    
    @Override
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
    
    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (!entity.isFireImmune() && !state.get(WATERLOGGED) && entity instanceof LivingEntity living && !EnchantmentHelper.hasFrostWalker(living)) {
            entity.damage(DamageSource.IN_FIRE, fireDamage);
        }
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if (state.get(WATERLOGGED))  {
            return;
        }

        if (random.nextInt(50) == 0) {
            world.playSound(pos.getX() + 0.5, pos.getY() + 1.2, pos.getZ() + 0.5, SoundEvents.BLOCK_CAMPFIRE_CRACKLE, SoundCategory.BLOCKS, 0.5F + random.nextFloat(), random.nextFloat() * 0.7F + 0.6F, false);
        }

        if (random.nextInt(100) == 0) {
            for(int i = 0; i < random.nextInt(1) + 1; ++i) {
                world.addParticle(ParticleTypes.LAVA, pos.getX() + 0.5, pos.getY() + 1.2, pos.getZ() + 0.5, (random.nextFloat() / 2.0F), 5.0E-5D, random.nextFloat() / 2.0F);
            }
        }
    }
}

