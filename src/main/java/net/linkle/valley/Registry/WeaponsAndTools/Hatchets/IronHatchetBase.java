package net.linkle.valley.Registry.WeaponsAndTools.Hatchets;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class IronHatchetBase extends AxeItem {
    public IronHatchetBase(ToolMaterial IronToolMaterialKnife) {
        super(IronToolMaterialKnife, 7, -2.5f, new Settings().group(EXPLORATION_GROUP
));
    }
}


