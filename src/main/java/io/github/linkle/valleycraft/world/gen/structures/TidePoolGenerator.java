package io.github.linkle.valleycraft.world.gen.structures;

import java.util.ArrayList;
import java.util.Random;

import io.github.linkle.valleycraft.ValleyMain;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.structure.SimpleStructurePiece;
import net.minecraft.structure.StructureContext;
import net.minecraft.structure.StructureManager;
import net.minecraft.structure.StructurePiecesGenerator.Context;
import net.minecraft.structure.StructurePiecesHolder;
import net.minecraft.structure.StructurePlacementData;
import net.minecraft.structure.processor.BlockIgnoreStructureProcessor;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockBox;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.StructureAccessor;
import net.minecraft.world.gen.chunk.ChunkGenerator;

public class TidePoolGenerator {
    
    private static final ArrayList<Identifier> LIST = new ArrayList<>(20);
    
    static {
        add("barnacle_rock");
        add("large_dripstone");
        add("large_tropical");
        add("medium_barnacle");
        add("medium_gravel");
        add("medium_mossy");
        add("medium_prismarine");
        add("medium_pufferfish");
        add("rock_medium_1");
        add("rock_medium_2_prismarine");
        add("rock_medium_3_dripstone");
        add("rock_small_2");
        add("rock_small");
        add("small_clam");
        add("spike_large");
        add("spike_medium_2");
        add("spike_medium");
    }

    public static void addParts(StructurePiecesHolder holder, Context<?> context, BlockPos pos) {
        var rotation = BlockRotation.random(context.random());
        holder.addPiece(new Piece(context.structureManager(), Util.getRandom(LIST, context.random()), pos, rotation));
    }

    public static class Piece
    extends SimpleStructurePiece {
        public Piece(StructureManager manager, Identifier id, BlockPos pos, BlockRotation rotation) {
            super(VStructurePieceType.TIDE_POOL, 0, manager, id, id.toString(), createPlacementData(rotation), pos);
        }
        
        public Piece(StructureManager manager, NbtCompound nbt) {
            super(VStructurePieceType.TIDE_POOL, nbt, manager, identifier -> Piece.createPlacementData(BlockRotation.valueOf(nbt.getString("Rot"))));
        }
        
        @Override
        protected void writeNbt(StructureContext context, NbtCompound nbt) {
            super.writeNbt(context, nbt);
            nbt.putString("Rot", placementData.getRotation().name());
        }

        @Override
        protected void handleMetadata(String metadata, BlockPos pos, ServerWorldAccess world, Random random, BlockBox box) {
            
        }
        
        @Override
        public void generate(StructureWorldAccess world, StructureAccessor structureAccessor,
                ChunkGenerator chunkGenerator, Random random, BlockBox chunkBox, ChunkPos chunkPos, BlockPos pos) {
            this.pos = this.pos.down();
            super.generate(world, structureAccessor, chunkGenerator, random, chunkBox, chunkPos, pos);
        }
        
        private static StructurePlacementData createPlacementData(BlockRotation rotation) {
            var data = new StructurePlacementData();
            data.setRotation(rotation);
            data.addProcessor(BlockIgnoreStructureProcessor.IGNORE_AIR_AND_STRUCTURE_BLOCKS);
            return data;
        }
    }
    
    private static void add(String name) {
        LIST.add(new Identifier(ValleyMain.MOD_ID, "beachorunderwater/tide_pool_" + name));
    }
}
