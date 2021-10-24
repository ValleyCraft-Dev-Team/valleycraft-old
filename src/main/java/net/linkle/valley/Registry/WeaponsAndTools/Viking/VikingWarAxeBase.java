package net.linkle.valley.Registry.WeaponsAndTools.Viking;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class VikingWarAxeBase extends AxeItem {
    public VikingWarAxeBase(ToolMaterial VikingToolMaterial) {
        super(VikingToolMaterial, 6, -3.2f, new Settings().group(EXPLORATION_GROUP
));
    }
}


