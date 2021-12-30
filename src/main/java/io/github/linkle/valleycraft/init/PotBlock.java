package io.github.linkle.valleycraft.init;

import io.github.linkle.valleycraft.ValleyMain;
import net.minecraft.block.Block;
import net.minecraft.block.FlowerPotBlock;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static io.github.linkle.valleycraft.init.Plants.ROSE_SPRIG;
import static net.minecraft.block.Blocks.POTTED_POPPY;

public class PotBlock {

    public static final Block POTTED_ROSE_SPRIG = new FlowerPotBlock(ROSE_SPRIG, Block.Settings.copy(POTTED_POPPY));

    public static void initialize() {
        register("potted_single_rose", POTTED_ROSE_SPRIG);
    }
    
    private static void register(String name, Block flower) {
        Registry.register(Registry.BLOCK, new Identifier(ValleyMain.MOD_ID, name), flower);
    }
}
