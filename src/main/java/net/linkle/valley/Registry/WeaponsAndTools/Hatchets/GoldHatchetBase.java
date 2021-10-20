package net.linkle.valley.Registry.WeaponsAndTools.Hatchets;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class GoldHatchetBase extends AxeItem {
    public GoldHatchetBase(ToolMaterial GoldToolMaterialKnife) {
        super(GoldToolMaterialKnife, 5, -2.4f, new Settings().group(EXPLORATION_GROUP
));
    }
}


