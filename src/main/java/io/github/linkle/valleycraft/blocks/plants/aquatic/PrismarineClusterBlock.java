package io.github.linkle.valleycraft.blocks.plants.aquatic;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AmethystClusterBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

public class PrismarineClusterBlock extends AmethystClusterBlock {
    
    public PrismarineClusterBlock() {
        super(6, 3, FabricBlockSettings.of(Material.UNDERWATER_PLANT)
                .nonOpaque().luminance(7)
                .breakByHand(false)
                .sounds(BlockSoundGroup.GLASS)
                .strength(1, 0.5f)
                .noCollision());
    }
    
    @Override
    public void onStacksDropped(BlockState state, ServerWorld world, BlockPos pos, ItemStack stack) {
        super.onStacksDropped(state, world, pos, stack);
        if (EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, stack) == 0) {
            dropExperience(world, pos, MathHelper.nextInt(world.random, 2, 5));
        }
    }
}