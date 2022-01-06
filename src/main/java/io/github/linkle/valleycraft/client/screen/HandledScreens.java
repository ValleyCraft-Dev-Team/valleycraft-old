package io.github.linkle.valleycraft.client.screen;

import io.github.linkle.valleycraft.screen.Screens;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;

@Environment(EnvType.CLIENT)
public class HandledScreens {
    public static void initialize() {
        ScreenRegistry.register(Screens.CRAB_TRAP, CrabTrapScreen::new);
    }
}
