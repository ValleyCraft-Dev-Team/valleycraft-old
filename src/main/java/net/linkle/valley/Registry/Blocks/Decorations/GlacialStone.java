package net.linkle.valley.Registry.Blocks.Decorations;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

import static net.linkle.valley.Registry.Initializers.Blocks.REED_BLOCK;

public class GlacialStone extends SoulSandBlock {
    public GlacialStone() {
        super(FabricBlockSettings.of(Material.STONE)
                .breakByTool(FabricToolTags.PICKAXES)
                .breakByHand(true).ticksRandomly()
                .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                .strength(1f, 2.5f));
    }
}
