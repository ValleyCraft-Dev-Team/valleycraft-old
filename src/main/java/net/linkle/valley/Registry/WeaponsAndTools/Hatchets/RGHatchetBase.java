package net.linkle.valley.Registry.WeaponsAndTools.Hatchets;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class RGHatchetBase extends AxeItem {
    public RGHatchetBase(ToolMaterial RGToolMaterialKnife) {
        super(RGToolMaterialKnife, 7, -2.5f, new Settings().group(EXPLORATION_GROUP
));
    }
}


