package net.linkle.valley.Registry.Entity;

import net.linkle.valley.ValleyMain;
import net.minecraft.client.render.entity.ChickenEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory.Context;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.util.Identifier;

public class DuckEntityRenderer extends ChickenEntityRenderer {
    private static final Identifier TEXTURE = new Identifier(ValleyMain.MOD_ID, "textures/entity/duck.png");

    public DuckEntityRenderer(Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(ChickenEntity polarBearEntity) {
        return TEXTURE;
    }
}
