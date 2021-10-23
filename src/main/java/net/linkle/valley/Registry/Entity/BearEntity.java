package net.linkle.valley.Registry.Entity;

import net.linkle.valley.Registry.Initializers.Entities;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.passive.PolarBearEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;

/**
 * Extended from PolarBearEntity class. You can override methods and make
 * changes.
 */
public class BearEntity extends PolarBearEntity {
    public BearEntity(EntityType<? extends PolarBearEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return Entities.BEAR.create(world);
    }
}
