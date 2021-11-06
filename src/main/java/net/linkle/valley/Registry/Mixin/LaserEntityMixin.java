package net.linkle.valley.Registry.Mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.linkle.valley.Registry.Initializers.MiscItems;
import net.linkle.valley.Registry.Misc.RedstoneWandBase;
import net.minecraft.client.render.Frustum;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.resource.SynchronousResourceReloader;

@Environment(EnvType.CLIENT)
@Mixin(EntityRenderDispatcher.class)
abstract class LaserEntityMixin implements SynchronousResourceReloader {
	
	@Inject(method = "shouldRender()Z", at = @At("HEAD"), cancellable = true)
	<E extends Entity> void shouldRender(E entity, Frustum frustum, double x, double y, double z, CallbackInfoReturnable<Boolean> info) {
		if (entity instanceof LivingEntity living && living.isHolding(MiscItems.REDSTONE_WAND)) {
			info.setReturnValue(true);
		}
	}
	
	@Inject(method = "render", at = @At("HEAD"))
	<E extends Entity> void renderLine(E entity, double x, double y, double z, float yaw, float tickDelta,
			MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, CallbackInfo info) {
		
		if (entity instanceof LivingEntity living && living.isHolding(MiscItems.REDSTONE_WAND)) {
			matrices.push();
			matrices.translate(x, y, z);
			
			var consumer = vertexConsumers.getBuffer(RenderLayer.getLines());
			var vec3d = entity.getRotationVec(tickDelta);
			var matrix4f = matrices.peek().getModel();
			var matrix3f = matrices.peek().getNormal();
			consumer.vertex(matrix4f, 0, entity.getStandingEyeHeight(), 0).
			color(RedstoneWandBase.RED, RedstoneWandBase.GREEN, RedstoneWandBase.BLUE, RedstoneWandBase.ALPHA).
			normal(matrix3f, (float)vec3d.x, (float)vec3d.y, (float)vec3d.z).next();
			
			var dist = RedstoneWandBase.DIST;
			var rawHit = living.raycast(dist, tickDelta, false);
			if (rawHit != null) {
				dist = Math.sqrt(rawHit.squaredDistanceTo(entity));
			}
			
			float xStep = (float)(vec3d.x * dist);
			float yStep = (float)((double)entity.getStandingEyeHeight() + vec3d.y * dist);
			float zStep = (float)(vec3d.z * dist);
			
			consumer.vertex(matrix4f, xStep, yStep, zStep).
			color(RedstoneWandBase.RED, RedstoneWandBase.GREEN, RedstoneWandBase.BLUE, RedstoneWandBase.ALPHA).
			normal(matrix3f, (float)vec3d.x, (float)vec3d.y, (float)vec3d.z).next();
		
			matrices.pop();
		}
	}
}
