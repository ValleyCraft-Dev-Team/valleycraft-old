package net.linkle.valley.Registry.Initializers;

import net.linkle.valley.ValleyMain;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Sounds {
    public static final SoundEvent DUCK_QUACK = new SoundEvent(new Identifier(ValleyMain.MOD_ID, "duck_quack"));
    
    public static void initialize() {
        Registry.register(Registry.SOUND_EVENT, DUCK_QUACK.getId(), DUCK_QUACK);
    }
}
