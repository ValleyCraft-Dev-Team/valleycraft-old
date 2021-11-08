package net.linkle.valley.Registry.Initializers;

import net.linkle.valley.ValleyMain;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Sounds {
    public static final SoundEvent DUCK_QUACK = newSound("duck_quack");
    
    public static void initialize() {
        register(DUCK_QUACK);
    }
    
    private static SoundEvent newSound(String ID) {
        return new SoundEvent(new Identifier(ValleyMain.MOD_ID, ID));
    }
    
    private static void register(SoundEvent sound) {
        Registry.register(Registry.SOUND_EVENT, sound.getId(), sound);
    }
}
