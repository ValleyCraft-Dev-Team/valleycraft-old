package net.linkle.valley.Registry.Entity;

import net.linkle.valley.ValleyMain;
import net.minecraft.client.render.entity.EntityRendererFactory.Context;
import net.minecraft.client.render.entity.PolarBearEntityRenderer;
import net.minecraft.entity.passive.PolarBearEntity;
import net.minecraft.util.Identifier;

public class BearEntityRenderer extends PolarBearEntityRenderer {
    private static final Identifier TEXTURE = new Identifier(ValleyMain.MOD_ID, "textures/entity/bear/brownbear.png");

    public BearEntityRenderer(Context context) {
        super(context);
    }

    public Identifier getTexture(PolarBearEntity polarBearEntity) {
        return TEXTURE;
    }
}
