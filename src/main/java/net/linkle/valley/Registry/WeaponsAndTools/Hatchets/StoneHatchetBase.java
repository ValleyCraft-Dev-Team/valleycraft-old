package net.linkle.valley.Registry.WeaponsAndTools.Hatchets;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class StoneHatchetBase extends AxeItem {
    public StoneHatchetBase(ToolMaterial StoneToolMaterialKnife) {
        super(StoneToolMaterialKnife, 7, -2.6f, new Settings().group(EXPLORATION_GROUP
));
    }
}


