package io.github.linkle.valleycraft.config;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import org.apache.commons.lang3.ClassUtils;

import io.github.linkle.valleycraft.ValleyMain;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.gui.registry.api.GuiRegistryAccess;
import me.shedaniel.clothconfig2.api.AbstractConfigListEntry;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.util.Pair;

/** Lang generator to generate translation from valleycraft autoconfig and output logs. Open the mod menu to output the log */
@Environment(EnvType.CLIENT)
public class ConfigLangGen {
    // This should be disable all a time. If this is true, please set it to false.
    private static final boolean isEnable = false;
    
    private static final HashMap<Class<?>, Map<String, String>> MAP = new HashMap<>();;
    private static final ArrayList<Pair<String, String>> LIST = new ArrayList<>(100);
    
    public static void initialize() {
        if (!isEnable) return;
        
        // This is where it class registered for lang generate
        register(EntityConfig.class, EntityConfig::getLang);
        register(OreConfig.class, OreConfig::getLang);
        
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (!LIST.isEmpty()) {
                var build = new StringBuilder(500).append('\n');
                
                for (var pair : LIST) {
                    build.append("  ").append('\"');
                    build.append(pair.getLeft());
                    build.append("\": \"");
                    build.append(pair.getRight());
                    build.append("\",\n");
                }
                
                ValleyMain.LOGGER.info(build);
                LIST.clear();
            }
        });
        
        var registry = AutoConfig.getGuiRegistry(VConfig.class);
        registry.registerPredicateTransformer(ConfigLangGen::transform, ConfigLangGen::predicate);
    }
    
    private static boolean predicate(Field field) {
        return !ClassUtils.isPrimitiveOrWrapper(field.getDeclaringClass());
    }
    
    @SuppressWarnings("rawtypes")
    private static List<AbstractConfigListEntry> transform(List<AbstractConfigListEntry> guis, String i13n, Field field,
            Object config, Object defaults, GuiRegistryAccess registry) {
        
        var map = MAP.get(defaults.getClass());
        if (map != null) {
            LIST.add(new Pair<>(i13n, map.get(field.getName())));
        }
        
        return guis;
    }
    
    private static void register(Class<?> type, Consumer<Map<String, String>> consumer) {
        var map = new HashMap<String, String>(32);
        consumer.accept(map);
        MAP.put(type, map);
    }
}
