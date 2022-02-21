package io.github.linkle.valleycraft.world.gen.structures;

import java.util.Map;
import java.util.Random;

import io.github.linkle.valleycraft.utils.Util;
import net.minecraft.block.entity.LootableContainerBlockEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.loot.LootTables;
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
import net.minecraft.util.Pair;
import net.minecraft.util.math.BlockBox;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ServerWorldAccess;

public class ResearchStationGenerator {
    private static final Map<String, Identifier> LOOT_TABLES =
            Map.of("map_chest", LootTables.SHIPWRECK_MAP_CHEST,
                    "treasure_chest", LootTables.SHIPWRECK_TREASURE_CHEST,
                    "supply_chest", LootTables.SHIPWRECK_SUPPLY_CHEST);

    private static final Pair<Identifier, Identifier>
    RESEARCH_STATION = new Pair<>(Util.newId("ocean/research_station"), Util.newId("ocean/research_station_abandoned"));

    private static final Pair<Identifier, Identifier>
    RESEARCH_STATION_LARGE = new Pair<>(Util.newId("ocean/research_station_large"), Util.newId("ocean/research_station_abandoned_large"));

    public static void addParts(StructurePiecesHolder holder, Context<?> context, BlockPos pos) {
        var rotation = BlockRotation.random(context.random());

        Pair<Identifier, Identifier> pair;
        if (context.random().nextInt(5) == 0) {
            pair = RESEARCH_STATION_LARGE;
        } else {
            pair = RESEARCH_STATION;
        }

        holder.addPiece(new Piece(context.structureManager(), context.random().nextInt(5) == 0 ? pair.getRight() : pair.getLeft(), pos, rotation));
    }

    public static class Piece
    extends SimpleStructurePiece {
        public Piece(StructureManager manager, Identifier id, BlockPos pos, BlockRotation rotation) {
            super(VStructurePieceType.RESEARCH_STATION, 0, manager, id, id.toString(), createPlacementData(rotation), pos);
        }

        public Piece(StructureManager manager, NbtCompound nbt) {
            super(VStructurePieceType.RESEARCH_STATION, nbt, manager, identifier -> createPlacementData(BlockRotation.valueOf(nbt.getString("Rot"))));
        }

        @Override
        protected void writeNbt(StructureContext context, NbtCompound nbt) {
            super.writeNbt(context, nbt);
            nbt.putString("Rot", placementData.getRotation().name());
        }

        @Override
        protected void handleMetadata(String metadata, BlockPos pos, ServerWorldAccess world, Random random, BlockBox box) {
            var loot = LOOT_TABLES.get(metadata);
            if (loot != null) {
                LootableContainerBlockEntity.setLootTable(world, random, pos.down(), loot);
                return;
            }

            if (metadata.equals("villager")) {
                var entity = EntityType.VILLAGER.create(world.toServerWorld());
                entity.setPersistent();
                entity.refreshPositionAndAngles(pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5, 0.0f, 0.0f);
                entity.initialize(world, world.getLocalDifficulty(pos), SpawnReason.STRUCTURE, null, null);
                world.spawnEntityAndPassengers(entity);
            }
        }

        private static StructurePlacementData createPlacementData(BlockRotation rotation) {
            var data = new StructurePlacementData();
            data.setRotation(rotation);
            data.addProcessor(BlockIgnoreStructureProcessor.IGNORE_AIR_AND_STRUCTURE_BLOCKS);
            return data;
        }
    }
}
