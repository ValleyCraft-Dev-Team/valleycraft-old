package net.linkle.valley.Registry.Mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.linkle.valley.Registry.Initializers.MiscItems;
import net.linkle.valley.Registry.Misc.RedstoneWandBase;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.item.HeldItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Arm;
import net.minecraft.util.Hand;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3f;
import net.minecraft.util.math.Vector4f;

@Environment(EnvType.CLIENT)
@Mixin(HeldItemRenderer.class)
class HeldLaserRendererMixin {
	
	@Inject(method = "renderFirstPersonItem", at = @At("HEAD"))
	void renderLaserItem(AbstractClientPlayerEntity player, float tickDelta, float pitch, Hand hand,
			float swingProgress, ItemStack item, float equipProgress, MatrixStack matrices,
			VertexConsumerProvider vertexConsumers, int light, CallbackInfo info) {
		
	    if (item.isOf(MiscItems.REDSTONE_WAND)) {
            float lerp = MathHelper.lerp(equipProgress, -0.02f, -0.9f);
            float xPos = hand == Hand.MAIN_HAND ? 0.7f : -0.7f;

            if (player.getMainArm() == Arm.LEFT) {
                xPos = -xPos;
            }

            var vec4 = new Vector4f(xPos, lerp, -0.65f, 1);
            vec4.transform(matrices.peek().getModel());

            var vec3 = new Vec3f(vec4);
            vec3.add(0, 0, -10);
            vec3.normalize();
            
            var consumer = vertexConsumers.getBuffer(RenderLayer.getLines());
            consumer.vertex(0, 0, -10)
            .color(RedstoneWandBase.RED, RedstoneWandBase.GREEN, RedstoneWandBase.BLUE, RedstoneWandBase.ALPHA)
            .normal(vec3.getX(), vec3.getY(), vec3.getZ()).next();

            consumer.vertex(vec4.getX(), vec4.getY(), vec4.getZ())
            .color(RedstoneWandBase.RED, RedstoneWandBase.GREEN, RedstoneWandBase.BLUE, RedstoneWandBase.ALPHA)
            .normal(vec3.getX(), vec3.getY(), vec3.getZ()).next(); 
        }
	}
}
