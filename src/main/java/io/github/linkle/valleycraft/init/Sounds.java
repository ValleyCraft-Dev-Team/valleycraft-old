package io.github.linkle.valleycraft.init;

import io.github.linkle.valleycraft.ValleyMain;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Sounds {
    public static final SoundEvent DUCK_QUACK = register("duck_quack");
    
    public static void initialize() {
        ValleyMain.LOGGER.info("initialing the sounds");
    }
    
    private static SoundEvent register(String ID) {
        var sound = new SoundEvent(new Identifier(ValleyMain.MOD_ID, ID));
        return Registry.register(Registry.SOUND_EVENT, sound.getId(), sound);
    }
}
