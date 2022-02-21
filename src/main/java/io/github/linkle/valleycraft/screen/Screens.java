package io.github.linkle.valleycraft.screen;

import io.github.linkle.valleycraft.ValleyMain;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry.SimpleClientHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class Screens {
    public static final ScreenHandlerType<CrabTrapScreenHandler> CRAB_TRAP = register("crab_trap", CrabTrapScreenHandler::new);

    public static void initialize() {
        ValleyMain.LOGGER.info("Screens initialized");
    }

    public static <T extends ScreenHandler> ScreenHandlerType<T> register(String id, SimpleClientHandlerFactory<T> factory) {
        return ScreenHandlerRegistry.registerSimple(new Identifier(ValleyMain.MOD_ID, id), factory);
    }
}
