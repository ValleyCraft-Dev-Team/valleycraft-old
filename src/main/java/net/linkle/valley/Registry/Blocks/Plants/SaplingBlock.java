package net.linkle.valley.Registry.Blocks.Plants;

import net.minecraft.block.Material;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.sound.BlockSoundGroup;

public class SaplingBlock extends net.minecraft.block.SaplingBlock {
	public SaplingBlock(SaplingGenerator generator) {
		super(generator, Settings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS));
	}
}
