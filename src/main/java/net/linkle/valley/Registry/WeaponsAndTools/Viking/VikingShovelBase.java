package net.linkle.valley.Registry.WeaponsAndTools.Viking;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class VikingShovelBase extends ShovelItem {
    public VikingShovelBase(ToolMaterial VikingToolMaterial) {
        super(VikingToolMaterial, 2, -3.0f, new Settings().group(EXPLORATION_GROUP
));
    }
}


