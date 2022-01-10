package io.github.linkle.valleycraft.world.gen.structures;

import io.github.linkle.valleycraft.ValleyMain;
import net.minecraft.structure.StructurePieceType;
import net.minecraft.structure.StructurePieceType.ManagerAware;
import net.minecraft.structure.StructurePieceType.Simple;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class VStructurePieceType {
    public static final StructurePieceType SHIPWRECK = register(ShipwreckGenerator.Piece::new, "shipwreck");

    private static StructurePieceType register(StructurePieceType type, String id) {
        return Registry.register(Registry.STRUCTURE_PIECE, new Identifier(ValleyMain.MOD_ID, id), type);
    }

    private static StructurePieceType register(Simple type, String id) {
        return register((StructurePieceType)type, id);
    }

    private static StructurePieceType register(ManagerAware type, String id) {
        return register((StructurePieceType)type, id);
    }
}
