package io.github.linkle.valleycraft.init;

import io.github.linkle.valleycraft.entities.BearEntity;
import io.github.linkle.valleycraft.client.entity.renderer.BearEntityRenderer;
import io.github.linkle.valleycraft.entities.DuckEntity;
import io.github.linkle.valleycraft.client.entity.renderer.DuckEntityRenderer;
import io.github.linkle.valleycraft.ValleyMain;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.BiomeKeys;

public class Entities {

    public static final EntityType<BearEntity> BEAR = Registry.register(Registry.ENTITY_TYPE,
        new Identifier(ValleyMain.MOD_ID, "bear"),
        FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, BearEntity::new)
        .dimensions(EntityDimensions.fixed(1.4F, 1.4F)).trackRangeBlocks(10)
        .specificSpawnBlocks(Blocks.GRASS_BLOCK, Blocks.PODZOL, Blocks.COARSE_DIRT).build()
    );
    
    public static final EntityType<DuckEntity> DUCK = Registry.register(Registry.ENTITY_TYPE,
        new Identifier(ValleyMain.MOD_ID, "duck"),
        FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, DuckEntity::new)
        .dimensions(EntityDimensions.fixed(0.4F, 0.7F)).trackRangeBlocks(10)
        .specificSpawnBlocks(Blocks.GRASS_BLOCK).build()
    );

    public static void initialize() {
        FabricDefaultAttributeRegistry.register(BEAR, BearEntity.createPolarBearAttributes());
        FabricDefaultAttributeRegistry.register(DUCK, DuckEntity.createChickenAttributes());

        if (ValleyMain.CONFIG.mobs.bearSpawnEnabled) {
            var keys = BiomeSelectors.includeByKey(
                BiomeKeys.OLD_GROWTH_PINE_TAIGA,
                BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA
            );
            BiomeModifications.addSpawn(keys, SpawnGroup.CREATURE, BEAR, 3, 1, 2);
        }
        
        if (ValleyMain.CONFIG.mobs.duckSpawnEnabled) {
            var keys = BiomeSelectors.includeByKey(
                BiomeKeys.OLD_GROWTH_BIRCH_FOREST
            );
            BiomeModifications.addSpawn(keys, SpawnGroup.CREATURE, DUCK, 8, 3, 4);
        }
    }

    @Environment(EnvType.CLIENT)
    public static void initializeClient() {
        EntityRendererRegistry.register(BEAR, BearEntityRenderer::new);
        EntityRendererRegistry.register(DUCK, DuckEntityRenderer::new);
    }
}
