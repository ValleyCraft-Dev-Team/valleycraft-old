package io.github.linkle.valleycraft.client.entity.renderer;

import io.github.linkle.valleycraft.utils.Util;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.CodEntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.passive.FishEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3f;

public class CodEntityRenderer extends MobEntityRenderer<FishEntity, CodEntityModel<FishEntity>> {

    private final Identifier texture;

    private CodEntityRenderer(EntityRendererFactory.Context context, Identifier texture) {
        super(context, new CodEntityModel<>(context.getPart(EntityModelLayers.COD)), 0.3f);
        this.texture = texture;
    }

    @Override
    public Identifier getTexture(FishEntity entity) {
        return texture;
    }

    @Override
    protected void setupTransforms(FishEntity codEntity, MatrixStack matrixStack, float f, float g, float h) {
        super.setupTransforms(codEntity, matrixStack, f, g, h);
        float i = 4.3f * MathHelper.sin(0.6f * f);
        matrixStack.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(i));
        if (!codEntity.isTouchingWater()) {
            matrixStack.translate(0.1f, 0.1f, -0.1f);
            matrixStack.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(90.0f));
        }
    }

    /** @param texture file name of the fish texture. */
    public static EntityRendererFactory<FishEntity> create(String texture) {
        var id = Util.newId("textures/entity/fish/" + texture + ".png");
        return context -> new CodEntityRenderer(context, id);
    }
}
