package net.linkle.valley.Registry.Blocks.Plants;

import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.Material;
import net.minecraft.entity.EntityType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class AppleLeavesBlock extends LeavesBlock {

	public AppleLeavesBlock() {
		super(Settings.of(Material.LEAVES)
		.strength(0.2F)
		.ticksRandomly()
		.sounds(BlockSoundGroup.GRASS)
		.nonOpaque()
		.allowsSpawning(AppleLeavesBlock::canSpawnOnLeaves)
		.suffocates(AppleLeavesBlock::never)
		.blockVision(AppleLeavesBlock::never));
	}

	private static Boolean canSpawnOnLeaves(BlockState state, BlockView world, BlockPos pos, EntityType<?> type) {
		return type == EntityType.OCELOT || type == EntityType.PARROT;
	}
	
	private static boolean never(BlockState state, BlockView world, BlockPos pos) {
		return false;
	}
}
