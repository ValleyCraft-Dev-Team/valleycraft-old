package io.github.linkle.valleycraft.config;

import java.util.ArrayList;

import me.shedaniel.autoconfig.ConfigHolder;

import static io.github.linkle.valleycraft.ValleyMain.CONFIG;
import static io.github.linkle.valleycraft.ValleyMain.LOGGER;

/** Config version handler, it checks the config file version and reset the value to the new default. */
public class ConfigVersionHandler {
    
    static final int VERSION = 1;
    
    private static final VConfig DEFAULT = new VConfig();
    private static final ArrayList<Runnable> ARRAY = new ArrayList<>();
    
    private static void init() {
        ARRAY.add(ConfigVersionHandler::handleVersion0); // version 0 handler;
        ARRAY.add(ConfigVersionHandler::handleVersion1); // version 1 handler;
        ARRAY.add(ConfigVersionHandler::handleVersion2); // version 2 handler;
    }
    
    public static void handle(ConfigHolder<VConfig> holder) {
        var config = holder.getConfig();
        int version = config.configVersion;
        if (version >= VERSION) {
            config.configVersion = VERSION;
            return;
        }
        init();
        
        for (int i = Math.max(version, 0); i < VERSION; i++) {
            if (i < 0 || i >= ARRAY.size()) continue;
            ARRAY.get(i).run();
        }
        
        config.configVersion = VERSION;
        holder.save();
    }
    
    // version handler
    
    // valley 2.3 to 2.3.1
    private static void handleVersion0() {
        var oldMobs = CONFIG.mobs;
        var newMobs = DEFAULT.mobs;
        
        if (oldMobs.duckSpawn.weight == 7) {
            oldMobs.duckSpawn.weight = newMobs.duckSpawn.weight; // 6
        }
        if (oldMobs.minnowSpawn.weight == 5) {
            oldMobs.minnowSpawn.weight = newMobs.minnowSpawn.weight; // 4
        }
        if (oldMobs.sardineSpawn.weight == 5) {
            oldMobs.sardineSpawn.weight = newMobs.sardineSpawn.weight; // 4
        }
        if (oldMobs.redPorgySpawn.weight == 5) {
            oldMobs.redPorgySpawn.weight = newMobs.redPorgySpawn.weight; // 4
        }
    }
    
    private static void handleVersion1() {
        LOGGER.info("Handle config version 1");
    }
    
    private static void handleVersion2() {
        LOGGER.info("Handle config version 2");
    }
}
