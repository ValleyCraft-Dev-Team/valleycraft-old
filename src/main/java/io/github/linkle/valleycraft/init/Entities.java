package io.github.linkle.valleycraft.init;

import io.github.linkle.valleycraft.ValleyMain;
import io.github.linkle.valleycraft.client.entity.renderer.BearEntityRenderer;
import io.github.linkle.valleycraft.client.entity.renderer.CodEntityRenderer;
import io.github.linkle.valleycraft.client.entity.renderer.DuckEntityRenderer;
import io.github.linkle.valleycraft.client.entity.renderer.SalmonEntityRenderer;
import io.github.linkle.valleycraft.entities.*;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.FishEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.biome.BiomeKeys;

public class Entities {

    public static final EntityType<BearEntity> BEAR = Registry.register(Registry.ENTITY_TYPE,
        new Identifier(ValleyMain.MOD_ID, "bear"),
        FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, BearEntity::new)
        .dimensions(EntityDimensions.fixed(1.4F, 1.4F)).trackRangeBlocks(10).build()
    );
    
    public static final EntityType<DuckEntity> DUCK = Registry.register(Registry.ENTITY_TYPE,
        new Identifier(ValleyMain.MOD_ID, "duck"),
        FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, DuckEntity::new)
        .trackRangeBlocks(10).dimensions(EntityDimensions.fixed(0.4F, 0.7F))
        .specificSpawnBlocks(Blocks.WATER).build()
    );
    
    public static final EntityType<EelEntity> FIRE_EEL = Registry.register(Registry.ENTITY_TYPE,
        new Identifier(ValleyMain.MOD_ID, "fire_eel"),
        FabricEntityTypeBuilder.create(SpawnGroup.WATER_AMBIENT, EelEntity::new)
        .trackRangeBlocks(4).dimensions(EntityDimensions.fixed(0.7f, 0.4f)).build()
    );
    
    public static final EntityType<PerchEntity> PERCH = Registry.register(Registry.ENTITY_TYPE,
        new Identifier(ValleyMain.MOD_ID, "perch"),
        FabricEntityTypeBuilder.create(SpawnGroup.WATER_AMBIENT, PerchEntity::new)
        .trackRangeBlocks(4).dimensions(EntityDimensions.fixed(0.5f, 0.3f)).build()
    );

    public static final EntityType<MinnowEntity> MINNOW = Registry.register(Registry.ENTITY_TYPE,
            new Identifier(ValleyMain.MOD_ID, "minnow"),
            FabricEntityTypeBuilder.create(SpawnGroup.WATER_AMBIENT, MinnowEntity::new)
                    .trackRangeBlocks(4).dimensions(EntityDimensions.fixed(0.5f, 0.3f)).build()
    );

    public static final EntityType<SardineEntity> SARDINE = Registry.register(Registry.ENTITY_TYPE,
            new Identifier(ValleyMain.MOD_ID, "sardine"),
            FabricEntityTypeBuilder.create(SpawnGroup.WATER_AMBIENT, SardineEntity::new)
                    .trackRangeBlocks(4).dimensions(EntityDimensions.fixed(0.5f, 0.3f)).build()
    );

    public static final EntityType<RedPorgyEntity> RED_PORGY = Registry.register(Registry.ENTITY_TYPE,
            new Identifier(ValleyMain.MOD_ID, "red_porgy"),
            FabricEntityTypeBuilder.create(SpawnGroup.WATER_AMBIENT, RedPorgyEntity::new)
                    .trackRangeBlocks(4).dimensions(EntityDimensions.fixed(0.5f, 0.3f)).build()
    );

    public static void initialize() {
        var config = ValleyMain.CONFIG.mobs;
        FabricDefaultAttributeRegistry.register(BEAR, BearEntity.createPolarBearAttributes());
        FabricDefaultAttributeRegistry.register(DUCK, DuckEntity.createChickenAttributes());
        FabricDefaultAttributeRegistry.register(FIRE_EEL, MobEntity.createMobAttributes().add(EntityAttributes.GENERIC_MAX_HEALTH, 8)); // 8 heath point
        FabricDefaultAttributeRegistry.register(PERCH, FishEntity.createFishAttributes());
        FabricDefaultAttributeRegistry.register(MINNOW, FishEntity.createFishAttributes());
        FabricDefaultAttributeRegistry.register(SARDINE, FishEntity.createFishAttributes());
        FabricDefaultAttributeRegistry.register(RED_PORGY, FishEntity.createFishAttributes());
        
        var keys = BiomeSelectors.includeByKey(
            BiomeKeys.OLD_GROWTH_PINE_TAIGA,
            BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA
        );
        config.bearSpawn.addSpawn(keys, SpawnGroup.CREATURE, BEAR);
        config.duckSpawn.addSpawn(BiomeSelectors.categories(Category.RIVER), SpawnGroup.CREATURE, DUCK);
        
        keys = BiomeSelectors.includeByKey(
            BiomeKeys.LUKEWARM_OCEAN,
            BiomeKeys.DEEP_LUKEWARM_OCEAN,
            BiomeKeys.WARM_OCEAN,
            BiomeKeys.DEEP_OCEAN
        );
        config.perchSpawn.addSpawn(keys, SpawnGroup.WATER_AMBIENT, PERCH);
        
        
        keys = BiomeSelectors.includeByKey(
            BiomeKeys.COLD_OCEAN,
            BiomeKeys.DEEP_COLD_OCEAN,
            BiomeKeys.FROZEN_OCEAN,
            BiomeKeys.DEEP_LUKEWARM_OCEAN,
            BiomeKeys.DEEP_OCEAN,
            BiomeKeys.DEEP_FROZEN_OCEAN
        );
        config.sardineSpawn.addSpawn(keys, SpawnGroup.WATER_AMBIENT, SARDINE);
        
        config.fireEelSpawn.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.WARM_OCEAN), SpawnGroup.WATER_AMBIENT, FIRE_EEL);
        config.minnowSpawn.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.WARM_OCEAN), SpawnGroup.WATER_AMBIENT, MINNOW);
        config.redPorgySpawn.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.WARM_OCEAN), SpawnGroup.WATER_AMBIENT, RED_PORGY);
    }

    @Environment(EnvType.CLIENT)
    public static void initializeClient() {
        EntityRendererRegistry.register(BEAR, BearEntityRenderer::new);
        EntityRendererRegistry.register(DUCK, DuckEntityRenderer::new);
        EntityRendererRegistry.register(FIRE_EEL, SalmonEntityRenderer.create("fire_eel_salmon"));
        EntityRendererRegistry.register(PERCH, CodEntityRenderer.create("perch_cod"));
        EntityRendererRegistry.register(MINNOW, CodEntityRenderer.create("minnow_cod"));
        EntityRendererRegistry.register(SARDINE, CodEntityRenderer.create("sardine_cod"));
        EntityRendererRegistry.register(RED_PORGY, CodEntityRenderer.create("red_porgy_cod"));
    }
}
