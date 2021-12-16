package net.linkle.valley.Registry.WeaponsAndTools.RGRest;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class RGShovelBase extends ShovelItem {
    public RGShovelBase(ToolMaterial RGToolMaterialShovel) {
        super(RGToolMaterialShovel, 3, -3f, new Settings().group(EXPLORATION_GROUP));
    }
}