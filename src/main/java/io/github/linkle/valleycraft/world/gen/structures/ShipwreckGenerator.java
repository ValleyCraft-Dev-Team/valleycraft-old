package io.github.linkle.valleycraft.world.gen.structures;

import static io.github.linkle.valleycraft.ValleyMain.MOD_ID;

import java.util.Random;

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
import net.minecraft.util.math.BlockBox;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.Heightmap;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.StructureAccessor;
import net.minecraft.world.gen.chunk.ChunkGenerator;

public class ShipwreckGenerator {
    private static final Identifier SHIPWRECK = new Identifier(MOD_ID, "underwater/shipwreck");
    
    public static void addParts(StructurePiecesHolder holder, Context<?> context, BlockPos pos) {
        var rotation = BlockRotation.random(context.random());
        holder.addPiece(new Piece(context.structureManager(), SHIPWRECK, pos, rotation));
    }
    
    public static class Piece
    extends SimpleStructurePiece {
        public Piece(StructureManager manager, Identifier id, BlockPos pos, BlockRotation rotation) {
            super(VStructurePieceType.SHIPWRECK, 0, manager, id, id.toString(), createPlacementData(rotation), pos);
        }
        
        public Piece(StructureManager manager, NbtCompound nbt) {
            super(VStructurePieceType.SHIPWRECK, nbt, manager, identifier -> Piece.createPlacementData(BlockRotation.valueOf(nbt.getString("Rot"))));
        }
        
        @Override
        protected void writeNbt(StructureContext context, NbtCompound nbt) {
            super.writeNbt(context, nbt);
            nbt.putString("Rot", placementData.getRotation().name());
        }

        @Override
        protected void handleMetadata(String metadata, BlockPos pos, ServerWorldAccess world, Random random, BlockBox box) {
            
        }
        
        private static StructurePlacementData createPlacementData(BlockRotation rotation) {
            var data = new StructurePlacementData();
            data.setRotation(rotation);
            data.addProcessor(BlockIgnoreStructureProcessor.IGNORE_AIR_AND_STRUCTURE_BLOCKS);
            return data;
        }
        
        @Override
        public void generate(StructureWorldAccess world, StructureAccessor structureAccessor, ChunkGenerator chunkGenerator, Random random, BlockBox chunkBox, ChunkPos chunkPos, BlockPos pos) {
            this.pos = this.pos.down();
            super.generate(world, structureAccessor, chunkGenerator, random, chunkBox, chunkPos, pos);
        }
    }
}
