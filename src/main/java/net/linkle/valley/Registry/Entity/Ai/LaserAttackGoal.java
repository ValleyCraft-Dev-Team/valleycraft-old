package net.linkle.valley.Registry.Entity.Ai;

import java.util.EnumSet;

import net.linkle.valley.Registry.Armors.Extensions.LaserHitExt;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.TargetPredicate;
import net.minecraft.entity.ai.goal.TrackTargetGoal;
import net.minecraft.entity.passive.CatEntity;
import net.minecraft.entity.passive.TameableEntity;

public class LaserAttackGoal extends TrackTargetGoal {
    private final TameableEntity tameable;
    private final LaserHitExt laserExt;

    public LaserAttackGoal(TameableEntity tameable) {
        super(tameable, false);
        this.tameable = tameable;
        this.laserExt = (LaserHitExt) tameable;
        setControls(EnumSet.of(Control.TARGET));
    }

    @Override
    public boolean canStart() {
        if (laserExt.hasEntity()) {
            var entity = laserExt.getLaserHit();
            if (entity instanceof CatEntity) {
                return false;
            }

            var owner = tameable.getOwner();
            if (owner != null && entity instanceof TameableEntity tam && owner == tam.getOwner()) {
                return false;
            }

            return owner != entity && canTrack(entity, TargetPredicate.DEFAULT);
        }

        return false;
    }

    @Override
    public void start() {
        if (laserExt.hasEntity()) {
            mob.setTarget(laserExt.getLaserHit());
            super.start();
        }
    }

    @Override
    public boolean shouldContinue() {
        if (!laserExt.hasEntity()) {
            return false;
        }
        return super.shouldContinue();
    }

    @Override
    public void stop() {
        laserExt.setLaserHit((LivingEntity) null);
        super.stop();
    }
}
