package net.linkle.valley.Registry.WeaponsAndTools.RGRest;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class RGSwordBase extends SwordItem {
    public RGSwordBase(ToolMaterial RGToolMaterialSword) {
        super(RGToolMaterialSword, 5, -2.4f, new Settings().group(EXPLORATION_GROUP));
    }
}