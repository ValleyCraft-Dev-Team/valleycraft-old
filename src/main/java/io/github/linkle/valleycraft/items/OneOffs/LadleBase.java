package io.github.linkle.valleycraft.items.OneOffs;

import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

import static io.github.linkle.valleycraft.init.ItemGroups.EXPLORATION_GROUP;

public class LadleBase extends ShovelItem {
    public LadleBase(ToolMaterial LadleMaterial) {
        super(LadleMaterial, 1, -3.0f, new Settings().group(EXPLORATION_GROUP));
    }
}


