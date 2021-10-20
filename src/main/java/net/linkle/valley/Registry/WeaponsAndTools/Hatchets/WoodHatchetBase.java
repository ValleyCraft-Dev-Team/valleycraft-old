package net.linkle.valley.Registry.WeaponsAndTools.Hatchets;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class WoodHatchetBase extends AxeItem {
    public WoodHatchetBase(ToolMaterial WoodToolMaterialKnife) {
        super(WoodToolMaterialKnife, 5, -2.6f, new Settings().group(EXPLORATION_GROUP
));
    }
}


