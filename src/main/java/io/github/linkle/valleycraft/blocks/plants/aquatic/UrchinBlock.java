package io.github.linkle.valleycraft.blocks.plants.aquatic;

import io.github.linkle.valleycraft.init.Entities;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import static io.github.linkle.valleycraft.init.Entities.FIRE_EEL;

public class UrchinBlock extends AquaticBlock {
    
    public UrchinBlock() {
        super(getSettings().strength(1, 0.5f), createCuboidShape(4, 0, 4, 12, 7, 12));
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        entity.slowMovement(state, new Vec3d(0.9, 0.85, 0.9));
        if (entity instanceof LivingEntity && entity.getType() != EntityType.TROPICAL_FISH && entity.getType() != EntityType.SALMON
                && entity.getType() != EntityType.PUFFERFISH  && entity.getType() != EntityType.COD  && entity.getType() != EntityType.SQUID
                && entity.getType() != EntityType.GLOW_SQUID  && entity.getType() != EntityType.GUARDIAN  && entity.getType() != EntityType.ELDER_GUARDIAN
                && entity.getType() != EntityType.AXOLOTL && entity.getType() != Entities.FIRE_EEL) {
            if (state.get(WATERLOGGED)) {
                entity.damage(DamageSource.CACTUS, 2.0F);
            }
            entity.damage(DamageSource.CACTUS, 2.0F);
        }
    }
}