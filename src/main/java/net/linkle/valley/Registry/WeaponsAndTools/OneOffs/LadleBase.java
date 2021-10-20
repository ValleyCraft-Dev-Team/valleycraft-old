package net.linkle.valley.Registry.WeaponsAndTools.OneOffs;

import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class LadleBase extends ShovelItem {
    public LadleBase(ToolMaterial LadleMaterial) {
        super(LadleMaterial, 1, -3.0f, new Settings().group(EXPLORATION_GROUP));
    }
}


