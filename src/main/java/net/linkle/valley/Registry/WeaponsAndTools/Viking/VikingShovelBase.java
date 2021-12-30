package net.linkle.valley.Registry.WeaponsAndTools.Viking;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class VikingShovelBase extends ShovelItem {
    public VikingShovelBase(ToolMaterial VikingToolMaterial) {
        super(VikingToolMaterial, 2, -3.0f, new Settings().group(EXPLORATION_GROUP));
    }
}
