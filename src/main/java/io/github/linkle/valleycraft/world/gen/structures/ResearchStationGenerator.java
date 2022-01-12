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
import net.minecraft.world.ServerWorldAccess;

public class ResearchStationGenerator {
    private static final Identifier RESEARCH_STATION = new Identifier(MOD_ID, "ocean/research_station");
    private static final Identifier RESEARCH_STATION_AB = new Identifier(MOD_ID, "ocean/research_station_abandoned");
    
    public static void addParts(StructurePiecesHolder holder, Context<?> context, BlockPos pos) {
        var rotation = BlockRotation.random(context.random());
        holder.addPiece(new Piece(context.structureManager(), context.random().nextInt(5) == 0 ? RESEARCH_STATION_AB : RESEARCH_STATION, pos, rotation));
    }
    
    public static class Piece
    extends SimpleStructurePiece {
        public Piece(StructureManager manager, Identifier id, BlockPos pos, BlockRotation rotation) {
            super(VStructurePieceType.RESEARCH_STATION, 0, manager, id, id.toString(), createPlacementData(rotation), pos);
        }
        
        public Piece(StructureManager manager, NbtCompound nbt) {
            super(VStructurePieceType.RESEARCH_STATION, nbt, manager, identifier -> Piece.createPlacementData(BlockRotation.valueOf(nbt.getString("Rot"))));
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
    }
}
