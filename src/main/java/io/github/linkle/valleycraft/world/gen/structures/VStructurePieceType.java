package io.github.linkle.valleycraft.world.gen.structures;

import io.github.linkle.valleycraft.utils.Util;
import net.minecraft.structure.StructurePieceType;
import net.minecraft.structure.StructurePieceType.ManagerAware;
import net.minecraft.util.registry.Registry;

public class VStructurePieceType {
    public static final StructurePieceType SHIPWRECK = register(ShipwreckGenerator.Piece::new, "shipwreck");
    public static final StructurePieceType RESEARCH_STATION = register(ResearchStationGenerator.Piece::new, "research_station");
    public static final StructurePieceType TIDE_POOL = register(TidePoolGenerator.Piece::new, "tide_pool");

    private static StructurePieceType register(StructurePieceType type, String id) {
        return Registry.register(Registry.STRUCTURE_PIECE, Util.newId(id), type);
    }

    private static StructurePieceType register(ManagerAware type, String id) {
        return register((StructurePieceType)type, id);
    }
}
