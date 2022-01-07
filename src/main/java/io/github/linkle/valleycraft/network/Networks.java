package io.github.linkle.valleycraft.network;

import io.github.linkle.valleycraft.ValleyMain;
import net.minecraft.util.Identifier;

public class Networks {
    
    public static final Identifier SCALLOP_OPEN = register("scallop_open");
    
    private static Identifier register(String id) {
        return new Identifier(ValleyMain.MOD_ID, id);
    }
}
