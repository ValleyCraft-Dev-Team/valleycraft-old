package io.github.linkle.valleycraft.client.entity.renderer;

import io.github.linkle.valleycraft.ValleyMain;
import net.minecraft.client.render.entity.EntityRendererFactory.Context;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.PolarBearEntityRenderer;
import net.minecraft.entity.passive.PolarBearEntity;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class BearEntityRenderer extends PolarBearEntityRenderer {
    private static final Identifier TEXTURE = new Identifier(ValleyMain.MOD_ID, "textures/entity/bear/brownbear.png");

    public BearEntityRenderer(Context context) {
        super(context);
    }

    public Identifier getTexture(PolarBearEntity entity) {
        return TEXTURE;
    }
}
