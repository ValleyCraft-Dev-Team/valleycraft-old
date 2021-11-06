package net.linkle.valley.Registry.Armors.Extensions;

import net.minecraft.entity.LivingEntity;

public interface LaserHitExt {

    LivingEntity getLaserHit();

    void setLaserHit(LivingEntity entity);

    default boolean hasEntity() {
        return getLaserHit() != null;
    }
}
