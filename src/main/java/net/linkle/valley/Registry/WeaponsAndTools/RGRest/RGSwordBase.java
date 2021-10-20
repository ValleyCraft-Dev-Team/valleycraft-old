package net.linkle.valley.Registry.WeaponsAndTools.RGRest;

import net.minecraft.item.HoeItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class RGSwordBase extends SwordItem {
    public RGSwordBase(ToolMaterial RGToolMaterialSword) {
        super(RGToolMaterialSword, 5, -2.4f, new Settings().group(EXPLORATION_GROUP
));
    }
}