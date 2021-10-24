package net.linkle.valley.Registry.Initializers;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.linkle.valley.ValleyMain;
import net.linkle.valley.Registry.Entity.BearEntity;
import net.linkle.valley.Registry.Entity.BearEntityRenderer;
import net.linkle.valley.Registry.Entity.DuckEntity;
import net.linkle.valley.Registry.Entity.DuckEntityRenderer;
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

    @SuppressWarnings("deprecation")
    public static void initialize() {
        FabricDefaultAttributeRegistry.register(BEAR, BearEntity.createPolarBearAttributes());
        FabricDefaultAttributeRegistry.register(DUCK, DuckEntity.createChickenAttributes());

        var keys = BiomeSelectors.includeByKey(
            BiomeKeys.GIANT_SPRUCE_TAIGA,
            BiomeKeys.GIANT_SPRUCE_TAIGA_HILLS,
            BiomeKeys.GIANT_TREE_TAIGA,
            BiomeKeys.GIANT_TREE_TAIGA_HILLS
        );
        BiomeModifications.addSpawn(keys, SpawnGroup.CREATURE, BEAR, 2, 1, 2);
    }

    public static void initializeClient() {
        EntityRendererRegistry.register(BEAR, BearEntityRenderer::new);
        EntityRendererRegistry.register(DUCK, DuckEntityRenderer::new);
    }
}
