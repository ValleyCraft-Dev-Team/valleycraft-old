package net.linkle.valley.Registry.Initializers;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.linkle.valley.Registry.Blocks.Plants.Decorative.RoseBush;
import net.minecraft.block.Block;
import net.minecraft.block.FlowerPotBlock;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.linkle.valley.Registry.Initializers.Blocks.ROSE_SPRIG;
import static net.linkle.valley.ValleyMain.MOD_ID;
import static net.minecraft.block.Blocks.POTTED_POPPY;

public class PotBlock {

    public static final Block POTTED_ROSE_SPRIG = new FlowerPotBlock (ROSE_SPRIG, FabricBlockSettings.copy(POTTED_POPPY));

    public static void initialize() {
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "potted_single_rose"), new FlowerPotBlock
                (POTTED_ROSE_SPRIG, net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings.copy(POTTED_POPPY)));
    }
}
