package net.linkle.valley.Registry.WeaponsAndTools.OneOffs;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class SieveBase extends ShovelItem {
    public SieveBase(ToolMaterial SieveToolMaterial) {
        super(SieveToolMaterial, 3, -2.5f, new Settings().group(EXPLORATION_GROUP));
    }
}
