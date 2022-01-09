package io.github.linkle.valleycraft.blocks.plants.aquatic;

import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class UrchinBlock extends AquaticBlock {
    
    public UrchinBlock() {
        super(getSettings().strength(1, 0.5f), createCuboidShape(4, 0, 4, 12, 7, 12));
    }
    
    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        entity.damage(DamageSource.CACTUS, 2);
    }
}