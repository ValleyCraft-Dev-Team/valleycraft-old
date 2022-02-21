package io.github.linkle.valleycraft.network;

import io.github.linkle.valleycraft.blocks.plants.aquatic.GiantClamBlock;
import io.github.linkle.valleycraft.extension.WorldExt;
import io.github.linkle.valleycraft.world.ScallopTicker;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;

@Environment(EnvType.CLIENT)
public class ClientNetwork {
    public static void initialize() {
        ClientPlayNetworking.registerGlobalReceiver(Networks.SCALLOP_OPEN, (client, handler, buffer, responseSender) -> {
            var pos = buffer.readBlockPos();
            client.execute(() -> {
                var world = client.world;
                if (world == null) return;

                if (world.getBlockState(pos).getBlock() instanceof GiantClamBlock) {
                    ((WorldExt)world).addTicker(new ScallopTicker(world, pos));
                }
            });
        });
    }
}
