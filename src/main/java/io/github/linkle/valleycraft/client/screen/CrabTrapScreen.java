package io.github.linkle.valleycraft.client.screen;

import com.mojang.blaze3d.systems.RenderSystem;

import io.github.linkle.valleycraft.ValleyMain;
import io.github.linkle.valleycraft.screen.CrabTrapScreenHandler;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class CrabTrapScreen extends HandledScreen<CrabTrapScreenHandler> {
    private static final Identifier TEXTURE = new Identifier(ValleyMain.MOD_ID, "textures/gui/crab_trap.png");

    public CrabTrapScreen(CrabTrapScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    @Override
    protected void init() {
        super.init();
        titleX = (backgroundWidth - textRenderer.getWidth(title)) / 2;
    }

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        renderBackground(matrices);
        super.render(matrices, mouseX, mouseY, delta);
        drawMouseoverTooltip(matrices, mouseX, mouseY);
    }

    @Override
    protected void drawBackground(MatrixStack matrices, float delta, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0f, 1.0f, 1.0f, 1.0f);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - backgroundWidth) / 2;
        int y = (height - backgroundHeight) / 2;

        drawTexture(matrices, x, y, 0, 0, backgroundWidth, backgroundHeight);

        if (handler.isInProgress()) {
            var progress = handler.getTimer() / (float)handler.getMaxTimer();
            progress = 1f - progress;
            int bar = (int)(progress * 24f);
            drawTexture(matrices, x + 61, y + 35, 176, 0, bar + 1, 16);
            drawTexture(matrices, x + 39, y + 54, 176, 16, 14, 14);
        } else {
            drawTexture(matrices, x + 39, y + 54, 190, 16, 14, 14);
        }
    }
}
