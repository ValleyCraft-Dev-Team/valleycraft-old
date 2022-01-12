package io.github.linkle.valleycraft.client.entity.renderer;

import io.github.linkle.valleycraft.ValleyMain;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.SalmonEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.passive.FishEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3f;

@Environment(EnvType.CLIENT)
public class SalmonEntityRenderer extends MobEntityRenderer<FishEntity, SalmonEntityModel<FishEntity>> {
    private final Identifier texture;

    private SalmonEntityRenderer(EntityRendererFactory.Context context, Identifier texture) {
        super(context, new SalmonEntityModel<>(context.getPart(EntityModelLayers.SALMON)), 0.4f);
        this.texture = texture;
    }

    @Override
    public Identifier getTexture(FishEntity entity) {
        return texture;
    }

    @Override
    protected void setupTransforms(FishEntity entity, MatrixStack matrixStack, float f, float g, float h) {
        super.setupTransforms(entity, matrixStack, f, g, h);
        float i = 1.0f;
        float j = 1.0f;
        if (!entity.isTouchingWater()) {
            i = 1.3f;
            j = 1.7f;
        }
        float k = i * 4.3f * MathHelper.sin(j * 0.6f * f);
        matrixStack.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(k));
        matrixStack.translate(0.0, 0.0, -0.4f);
        if (!entity.isTouchingWater()) {
            matrixStack.translate(0.2f, 0.1f, 0.0);
            matrixStack.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(90.0f));
        }
    }

    /** @param texture file name of the fish texture. */
    public static EntityRendererFactory<FishEntity> create(String texture) {
        var id = new Identifier(ValleyMain.MOD_ID, "textures/entity/fish/" + texture + ".png");
        return context -> new SalmonEntityRenderer(context, id);
    }
}
