package io.github.linkle.valleycraft.client.entity.renderer;

import io.github.linkle.valleycraft.ValleyMain;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.ChickenEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory.Context;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class DuckEntityRenderer extends ChickenEntityRenderer {
    private static final Identifier TEXTURE = new Identifier(ValleyMain.MOD_ID, "textures/entity/duck.png");

    public DuckEntityRenderer(Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(ChickenEntity entity) {
        return TEXTURE;
    }
}
