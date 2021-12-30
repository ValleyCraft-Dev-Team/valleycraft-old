package net.linkle.valley.Registry.WeaponsAndTools.Viking;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

public class VikingHoeBase extends HoeItem {
    public VikingHoeBase(ToolMaterial VikingToolMaterial) {
        super(VikingToolMaterial, 2, -2.5f, new Settings().group(EXPLORATION_GROUP));
    }
}
