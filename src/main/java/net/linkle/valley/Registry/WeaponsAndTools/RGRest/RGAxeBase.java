package net.linkle.valley.Registry.WeaponsAndTools.RGRest;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

public class RGAxeBase extends AxeItem {
    public RGAxeBase(ToolMaterial RGToolMaterialAxe) {
        super(RGToolMaterialAxe, 8, -3.1f, new Settings().group(EXPLORATION_GROUP));
    }
}