package net.linkle.valley.Registry.WeaponsAndTools.Knives;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class RGKnifeBase extends SwordItem {
    public RGKnifeBase(ToolMaterial RGToolMaterialKnife) {
        super(RGToolMaterialKnife, 3, -2.0f, new Settings().group(EXPLORATION_GROUP
));
    }
}


