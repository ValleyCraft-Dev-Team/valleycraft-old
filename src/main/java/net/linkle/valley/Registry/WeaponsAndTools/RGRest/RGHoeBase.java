package net.linkle.valley.Registry.WeaponsAndTools.RGRest;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class RGHoeBase extends HoeItem {
    public RGHoeBase(ToolMaterial RGToolMaterialHoe) {
        super(RGToolMaterialHoe, 0, -3.1f, new Settings().group(EXPLORATION_GROUP
));
    }
}