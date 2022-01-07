package io.github.linkle.valleycraft.network;

import io.netty.buffer.Unpooled;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

public class ServerNetwork {
    public static void initialize() {
        
    }
    
    public static void sendScallopOpen(ServerWorld world, BlockPos pos) {
        var packet = new PacketByteBuf(Unpooled.buffer(64));
        packet.writeBlockPos(pos);
        
        for (var player : world.getPlayers()) {
            if (player.world == world && pos.isWithinDistance(player.getPos(), 48)) {
                ServerPlayNetworking.send(player, Networks.SCALLOP_OPEN, packet);
            }
        }
    }
}
