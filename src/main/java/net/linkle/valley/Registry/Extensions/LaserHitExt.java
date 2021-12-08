package net.linkle.valley.Registry.Extensions;

import net.minecraft.entity.LivingEntity;

public interface LaserHitExt {

    LivingEntity getLaserHit();

    void setLaserHit(LivingEntity entity);

    default boolean hasEntity() {
        return getLaserHit() != null;
    }
}
