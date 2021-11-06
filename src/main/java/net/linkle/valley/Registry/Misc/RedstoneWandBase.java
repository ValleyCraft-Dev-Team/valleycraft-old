package net.linkle.valley.Registry.Misc;

import java.util.List;

import net.linkle.valley.Registry.Armors.Extensions.LaserHitExt;
import net.linkle.valley.Registry.Armors.Extensions.RedstoneWorldExt;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.CatEntity;
import net.minecraft.entity.projectile.ProjectileUtil;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class RedstoneWandBase extends Item {
    public static final int RED = 255, GREEN = 40, BLUE = 40, ALPHA = 200;
    public static final double DIST = 128;

    public RedstoneWandBase(Settings settings) {
        super(settings.maxCount(1));
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (world.isClient) return; // Server-side only.
        if (entity instanceof LivingEntity living && living.isHolding(this)) {
            // Raycast the block from holder's face direction.
            BlockHitResult blockHit = (BlockHitResult) living.raycast(DIST, 1, false);

            Box box = null;
            BlockPos pos = null;
            if (!world.isAir(blockHit.getBlockPos())) {
                // If block found, obtain the block position, then create and expand the bounding box.
                pos = blockHit.getBlockPos().offset(blockHit.getSide());
                box = new Box(pos).expand(10);
            }

            // Setup vectors
            Vec3d eyePos = entity.getEyePos();
            Vec3d dir = entity.getRotationVec(1).multiply(DIST);
            Vec3d atPos = eyePos.add(dir);

            // Raycast the entity from holder's face direction.
            LivingEntity liv = null;
            Box enBox = entity.getBoundingBox().stretch(dir).expand(1.0D);
            EntityHitResult entityHit = ProjectileUtil.raycast(entity, eyePos, atPos, enBox, e -> !e.isSpectator() && e.collides(), DIST * DIST);
            if (entityHit != null && entityHit.getEntity()instanceof LivingEntity e) {
                var a = blockHit.getPos().subtract(eyePos);
                var b = entityHit.getPos().subtract(eyePos);
                var dis1 = Math.sqrt(a.x * a.x + a.y * a.y + a.z * a.z);
                var dis2 = Math.sqrt(b.x * b.x + b.y * b.y + b.z * b.z);

                // Check the ray hit distant between entity's box point and block's box point.
                if (dis2 < dis1) {
                    // Override the current target/hit.
                    liv = e;
                    box = e.getBoundingBox().expand(10);
                }
            }

            // If the block or entity has'nt found, then canceled.
            if (box == null) return;
            
            // Powers redstone block like Redstone Lamp.
            if (pos != null && liv == null) {
                ((RedstoneWorldExt)world).putEmitPower(blockHit.getBlockPos().toImmutable());
            }

            // Create the list of cats within the bounding box.
            List<Entity> list = world.getOtherEntities(living, box, e -> e instanceof CatEntity);

            // Iterate the cats!
            for (Entity e : list) {
                var cat = (CatEntity) e;

                // Fix the derpy cat's "running" while sitting
                if (cat.isSitting()) continue;

                // Grab the cat's navigation and set the moving target.
                var nav = cat.getNavigation();
                if (liv != null) {
                    ((LaserHitExt) e).setLaserHit(liv);
                    nav.startMovingTo(liv, CatEntity.SPRINTING_SPEED);
                } else if (pos != null) {
                    nav.startMovingTo(pos.getX() + .5, pos.getY() + .5, pos.getZ() + .5, CatEntity.SPRINTING_SPEED);
                }
            }
        }
    }
}
