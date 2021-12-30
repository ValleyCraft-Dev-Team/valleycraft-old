package net.linkle.valley.Registry.WeaponsAndTools.Viking;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class VikingSpearBase extends SwordItem {
    public VikingSpearBase(ToolMaterial VikingToolMaterial) {
        super(VikingToolMaterial, 5, -2.0f, new Settings().group(EXPLORATION_GROUP));
    }
}
