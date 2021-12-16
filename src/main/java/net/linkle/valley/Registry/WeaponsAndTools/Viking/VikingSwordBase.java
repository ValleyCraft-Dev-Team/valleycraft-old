package net.linkle.valley.Registry.WeaponsAndTools.Viking;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class VikingSwordBase extends SwordItem {
    public VikingSwordBase(ToolMaterial VikingToolMaterial) {
        super(VikingToolMaterial, 5, -3.2f, new Settings().group(EXPLORATION_GROUP));
    }
}
