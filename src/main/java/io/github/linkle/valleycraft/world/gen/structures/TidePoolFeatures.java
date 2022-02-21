package io.github.linkle.valleycraft.world.gen.structures;

import net.minecraft.structure.StructureGeneratorFactory;
import net.minecraft.structure.StructurePiecesCollector;
import net.minecraft.structure.StructurePiecesGenerator;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Heightmap;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.StructureFeature;

public class TidePoolFeatures extends StructureFeature<DefaultFeatureConfig> {
    public TidePoolFeatures() {
        super(DefaultFeatureConfig.CODEC, StructureGeneratorFactory.simple(TidePoolFeatures::canGenerate, TidePoolFeatures::addPieces));
    }

    private static boolean canGenerate(StructureGeneratorFactory.Context<DefaultFeatureConfig> context) {
        return context.isBiomeValid(Heightmap.Type.OCEAN_FLOOR_WG);
    }

    private static void addPieces(StructurePiecesCollector collector, StructurePiecesGenerator.Context<DefaultFeatureConfig> context) {
        int x = context.chunkPos().getStartX();
        int z = context.chunkPos().getStartZ();
        int y = context.chunkGenerator().getHeight(x, z, Heightmap.Type.OCEAN_FLOOR_WG, context.world());
        var pos = new BlockPos(x, y, z);
        TidePoolGenerator.addParts(collector, context, pos);
    }
}
