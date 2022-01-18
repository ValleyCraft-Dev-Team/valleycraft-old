package io.github.linkle.valleycraft.init;

import static net.fabricmc.fabric.api.tag.TagFactory.BLOCK;

import net.minecraft.block.Block;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class VBlockTags {

        //Warning!
        //This class makes tags in the Valleycraft namespace instead of the c namespace, unlike VItemTags.
        //This is intentional, because no other mods will have sickles that work the same way as Valleycraft's.

    public static final Tag<Block> SICKLE_HARVESTABLES = BLOCK.create(newId("sickle_harvestables"));

    // private constructor to avoid instantiation
    private VBlockTags() {
        assert false; // should never be called
    }
    
    private static Identifier newId(String id) {
        return new Identifier("valley", id);
    }
    
}
