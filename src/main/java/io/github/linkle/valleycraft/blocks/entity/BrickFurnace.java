package io.github.linkle.valleycraft.blocks.entity;

import java.util.Random;

import org.jetbrains.annotations.Nullable;

import net.minecraft.block.AbstractFurnaceBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

public class BrickFurnace extends AbstractFurnaceBlock implements MultiBlockEntity {
	
	public BlockEntityType<BrickFurnaceEntity> blockEntity;

	public BrickFurnace(Settings settings) {
		super(settings);
	}
	
    @Override
    @SuppressWarnings("unchecked")
    public void setType(BlockEntityType<?> type) {
        this.blockEntity = (BlockEntityType<BrickFurnaceEntity>)type;
    }

	public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
		return new BrickFurnaceEntity(blockEntity, pos, state);
	}

	@Nullable
	public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
		return checkType(world, type, blockEntity);
	}

	protected void openScreen(World world, BlockPos pos, PlayerEntity player) {
		var entity = world.getBlockEntity(pos);
		if (entity instanceof BrickFurnaceEntity) {
			player.openHandledScreen((NamedScreenHandlerFactory)entity);
		}

	}

	public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
		//if (state.get(LIT))
			double xPos = pos.getX() + 0.5D;
			double yPos = pos.getY();
			double zPos = pos.getZ() + 0.5D;
			if (random.nextDouble() < 0.1D) {
				world.playSound(xPos, yPos, zPos, SoundEvents.BLOCK_SMOKER_SMOKE, SoundCategory.BLOCKS, 1.0F, 1.0F, false);
			}

			var face = state.get(FACING);
			var axis = face.getAxis();
			double rand = random.nextDouble() * 0.6D - 0.3D;
			double xRand = axis == Direction.Axis.X ? face.getOffsetX() * 0.52D : rand;
			double yRand = random.nextDouble() * 6.0D / 16.0D;
			double zRand = axis == Direction.Axis.Z ? face.getOffsetZ() * 0.52D : rand;
			world.addParticle(ParticleTypes.SMOKE, xPos + xRand, yPos + yRand, zPos + zRand, 0.0D, 0.0D, 0.0D);
			world.addParticle(ParticleTypes.FLAME, xPos + xRand, yPos + yRand, zPos + zRand, 0.0D, 0.0D, 0.0D);
	}
}
