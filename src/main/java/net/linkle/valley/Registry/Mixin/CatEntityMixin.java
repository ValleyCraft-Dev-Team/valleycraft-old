package net.linkle.valley.Registry.Mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.linkle.valley.Registry.Armors.Extensions.LaserHitExt;
import net.linkle.valley.Registry.Entity.Ai.LaserAttackGoal;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.CatEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.world.World;

@Mixin(CatEntity.class)
abstract class CatEntityMixin extends TameableEntity implements LaserHitExt {

    LivingEntity laserHit;
    //boolean hasSeenLaser;

    CatEntityMixin(EntityType<? extends TameableEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(method = "initGoals", at = @At("TAIL"))
    void initGoals(CallbackInfo info) {
        targetSelector.add(2, new LaserAttackGoal(this));
    }

    @Inject(method = "tick", at = @At("TAIL"))
    void tickMovement(CallbackInfo info) {
        laserHit = null;
    }

    @Override
    public LivingEntity getLaserHit() {
        return laserHit;
    }

    @Override
    public void setLaserHit(LivingEntity entity) {
        laserHit = entity;
        //hasSeenLaser = true;
    }
}
