package net.linkle.valley.Registry.WeaponsAndTools.Viking;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class VikingHatchetBase extends AxeItem {
    public VikingHatchetBase(ToolMaterial VikingToolMaterial) {
        super(VikingToolMaterial, 7, -2.5f, new Settings().group(EXPLORATION_GROUP
));
    }
}


