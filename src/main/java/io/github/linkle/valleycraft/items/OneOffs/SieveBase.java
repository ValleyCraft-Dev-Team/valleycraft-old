package io.github.linkle.valleycraft.items.OneOffs;

import static io.github.linkle.valleycraft.init.ItemGroups.EXPLORATION_GROUP;

import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class SieveBase extends ShovelItem {
    public SieveBase(ToolMaterial SieveToolMaterial) {
        super(SieveToolMaterial, 3, -2.5f, new Settings().group(EXPLORATION_GROUP));
    }
}
