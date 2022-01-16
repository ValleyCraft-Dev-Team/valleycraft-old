package io.github.linkle.valleycraft.world.gen.structures;

import java.util.Random;

import io.github.linkle.valleycraft.init.Aquatic;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.fluid.Fluids;
import net.minecraft.state.property.Properties;
import net.minecraft.structure.PostPlacementProcessor;
import net.minecraft.structure.StructureGeneratorFactory;
import net.minecraft.structure.StructurePiecesCollector;
import net.minecraft.structure.StructurePiecesGenerator;
import net.minecraft.structure.StructurePiecesList;
import net.minecraft.util.math.BlockBox;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.Heightmap;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.StructureAccessor;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.StructureFeature;

public class ResearchStationFeature extends StructureFeature<DefaultFeatureConfig> {

    public ResearchStationFeature() {
        super(DefaultFeatureConfig.CODEC, StructureGeneratorFactory.simple(ResearchStationFeature::canGenerate, ResearchStationFeature::addPieces), ResearchStationFeature::postPlace);
    }
    
    private static void postPlace(StructureWorldAccess world, StructureAccessor structureAccessor, ChunkGenerator chunkGenerator, Random random, BlockBox chunkBox, ChunkPos chunkPos, StructurePiecesList children) {
        var mutable = new BlockPos.Mutable();
        var blockBox = children.getBoundingBox();
        var bottom = world.getBottomY();
        int y = blockBox.getMinY();
        for (int x = chunkBox.getMinX(); x <= chunkBox.getMaxX(); ++x) {
            block: for (int z = chunkBox.getMinZ(); z <= chunkBox.getMaxZ(); ++z) {
                mutable.set(x, y, z);
                if (children.contains(mutable) && world.getBlockState(mutable).isOf(Blocks.RED_NETHER_BRICKS)) {
                    world.setBlockState(mutable, Blocks.OAK_LOG.getDefaultState(), Block.NOTIFY_LISTENERS);
                    int num = 0;
                    for (int i = y-1; i >= Math.max(y-100, bottom) ; i--) {
                        mutable.setY(i);
                        var state = world.getBlockState(mutable);
                        var bool = state.getMaterial().isLiquid() || state.isAir();
                        if (bool || num++ < 3) {
                            world.setBlockState(mutable, Blocks.OAK_LOG.getDefaultState(), Block.NOTIFY_LISTENERS);
                            if (random.nextInt(10) == 0) {
                                var face = Direction.fromHorizontal(random.nextInt(4));
                                var pos = mutable.offset(face);
                                if (canReplace(world, pos)) {
                                    var newState = Aquatic.BARNACLE.getDefaultState().with(Properties.FACING, face);
                                    newState = newState.with(Properties.WATERLOGGED, world.getFluidState(pos).getFluid() == Fluids.WATER);
                                    world.setBlockState(pos, newState, Block.NOTIFY_LISTENERS);
                                }
                            }
                            if (bool) num = 0;
                        } else {
                            continue block;
                        }
                    }
                }
            }
        }
    }
    
    private static boolean canReplace(StructureWorldAccess world, BlockPos pos) {
        var state = world.getBlockState(pos);
        return state.getMaterial().isLiquid() || state.isAir();
    }

    private static boolean canGenerate(StructureGeneratorFactory.Context<DefaultFeatureConfig> context) {
        return context.isBiomeValid(Heightmap.Type.MOTION_BLOCKING);
    }   

    private static void addPieces(StructurePiecesCollector collector, StructurePiecesGenerator.Context<DefaultFeatureConfig> context) {
        int x = context.chunkPos().getStartX();
        int z = context.chunkPos().getStartZ();
        int y = context.chunkGenerator().getHeight(x, z, Heightmap.Type.MOTION_BLOCKING, context.world());
        var pos = new BlockPos(x, y-4, z);
        ResearchStationGenerator.addParts(collector, context, pos);
    }
}
