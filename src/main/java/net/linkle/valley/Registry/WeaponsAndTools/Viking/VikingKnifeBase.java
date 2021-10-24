package net.linkle.valley.Registry.WeaponsAndTools.Viking;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class VikingKnifeBase extends SwordItem {
    public VikingKnifeBase(ToolMaterial VikingToolMaterial) {
        super(VikingToolMaterial, 3, -2.0f, new Settings().group(EXPLORATION_GROUP
));
    }
}


