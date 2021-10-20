package net.linkle.valley.Registry.WeaponsAndTools.RGRest;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class RGShovelBase extends ShovelItem {
    public RGShovelBase(ToolMaterial RGToolMaterialShovel) {
        super(RGToolMaterialShovel, 3, -3f, new Settings().group(EXPLORATION_GROUP
));
    }
}