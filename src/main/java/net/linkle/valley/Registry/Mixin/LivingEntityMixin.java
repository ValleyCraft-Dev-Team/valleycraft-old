package net.linkle.valley.Registry.Mixin;

import java.util.function.Predicate;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.linkle.valley.Registry.WeaponsAndTools.OneOffs.ClimbingAxeBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.World;

@Mixin(LivingEntity.class)
abstract class LivingEntityMixin extends Entity {
    
    private byte durTick;

    LivingEntityMixin(EntityType<?> type, World world) {
        super(type, world);
    }

    @Shadow
    abstract boolean isHolding(Predicate<ItemStack> item);

    @Shadow
    abstract void swingHand(Hand hand);

    @Shadow
    abstract ItemStack getMainHandStack();
    
    @Shadow
    abstract ItemStack getOffHandStack();
    
    @Shadow
    abstract void sendEquipmentBreakStatus(EquipmentSlot slot);
    
    @Inject(method = "isClimbing", at = @At("HEAD"), cancellable = true)
    void climbingAxe(CallbackInfoReturnable<Boolean> info) {
        if (isHolding(item -> item.getItem() instanceof ClimbingAxeBase)) {
            var box = getBoundingBox().expand(0.01, 0, 0.01);
            var minPos = new BlockPos(box.minX, box.minY, box.minZ);
            var maxPos = new BlockPos(box.maxX, box.maxY, box.maxZ);
            if (world.isRegionLoaded(minPos, maxPos)) {
                var boxShape = VoxelShapes.cuboid(box);
                var mutable = new BlockPos.Mutable();
                var bool = horizontalCollision;
                
                if (!bool) loops : 
                for(int x = minPos.getX(); x <= maxPos.getX(); ++x)
                for(int y = minPos.getY(); y <= maxPos.getY(); ++y)
                for(int z = minPos.getZ(); z <= maxPos.getZ(); ++z) {
                    var state = world.getBlockState(mutable.set(x, y, z));
                    var blockShape = state.getCollisionShape(world, mutable).offset(x, y, z);
                    if (VoxelShapes.matchesAnywhere(blockShape, boxShape, BooleanBiFunction.AND)) {
                        bool = true;
                        break loops;
                    }
                }
                
                if (bool) {
                    var hand = getMainHandStack().getItem() instanceof ClimbingAxeBase ? Hand.MAIN_HAND : Hand.OFF_HAND;
                    var axe = hand == Hand.MAIN_HAND ? getMainHandStack() : getOffHandStack();
                    var climbing = !onGround && !MathHelper.approximatelyEquals(prevY, getY());
                    
                    if (!world.isClient) {
                        if (climbing && --durTick < 0) {
                            durTick = 15;
                            axe.damage(1, (LivingEntity)(Object)this, e -> {
                                sendEquipmentBreakStatus(hand == Hand.MAIN_HAND ? EquipmentSlot.MAINHAND : EquipmentSlot.OFFHAND);
                            });
                        }
                    }
                    
                    if (climbing) {
                        swingHand(hand);
                    }
                    
                    info.setReturnValue(true);
                }
            }
        }
    }
}
