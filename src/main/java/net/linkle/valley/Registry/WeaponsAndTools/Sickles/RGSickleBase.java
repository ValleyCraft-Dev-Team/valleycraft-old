package net.linkle.valley.Registry.WeaponsAndTools.Sickles;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class RGSickleBase extends HoeItem {
    public RGSickleBase(ToolMaterial RGToolMaterialSickle) {
        super(RGToolMaterialSickle, 2, -3.2f, new Settings().group(EXPLORATION_GROUP
));
    }
}