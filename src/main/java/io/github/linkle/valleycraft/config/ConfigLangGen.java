package io.github.linkle.valleycraft.config;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import org.apache.commons.lang3.ClassUtils;

import io.github.linkle.valleycraft.ValleyMain;
import io.github.linkle.valleycraft.config.objects.EntityConfig;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.gui.registry.api.GuiRegistryAccess;
import me.shedaniel.clothconfig2.api.AbstractConfigListEntry;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;

/** Lang generator to generate translation from valleycraft autoconfig and output logs. Open the mod menu to output the log */
@Environment(EnvType.CLIENT)
public class ConfigLangGen {
    /** This should be disable all a time. If this is true, please set it to false. */
    private static final boolean isEnable = false;
    
    private static final HashMap<Class<?>, Map<String, String>> MAP = new HashMap<>();;
    private static final LinkedHashSet<Trans> LIST = new LinkedHashSet<>(100);
    
    public static void initialize() {
        if (!isEnable) return;
        
        // This is where it class registered for lang generate
        register(EntityConfig.class, EntityConfig::getLang);
        //register(OreConfig.class, OreConfig::getLang);
        //register(NetherConfig.class, NetherConfig::getLang);
        
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (!LIST.isEmpty()) {
                var build = new StringBuilder(500).append('\n');
                
                for (var tran : LIST) {
                    build.append("  ").append('\"');
                    build.append(tran.key);
                    build.append("\": \"");
                    build.append(tran.val);
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
            LIST.add(new Trans(i13n, map.get(field.getName())));
        }
        
        return guis;
    }
    
    private static void register(Class<?> type, Consumer<Map<String, String>> consumer) {
        var map = new HashMap<String, String>(32);
        consumer.accept(map);
        MAP.put(type, map);
    }
    
    /** Trans Right! */
    private static class Trans {
        final String key, val;
        
        Trans(String key, String value) {
            this.key = key;
            this.val = value;
        }
        
        @Override
        public int hashCode() {
            return key.hashCode();
        }
        
        @Override
        public boolean equals(Object obj) {
            return key.equals(obj);
        }
    }
}
