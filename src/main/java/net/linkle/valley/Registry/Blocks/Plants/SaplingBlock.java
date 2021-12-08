package net.linkle.valley.Registry.Blocks.Plants;

import net.minecraft.block.Blocks;
import net.minecraft.block.sapling.SaplingGenerator;

public class SaplingBlock extends net.minecraft.block.SaplingBlock {
	public SaplingBlock(SaplingGenerator generator) {
		super(generator, Settings.copy(Blocks.OAK_SAPLING));
	}
}
