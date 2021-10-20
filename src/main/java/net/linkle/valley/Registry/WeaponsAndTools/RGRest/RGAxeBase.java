package net.linkle.valley.Registry.WeaponsAndTools.RGRest;

import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class RGAxeBase extends AxeItem {
    public RGAxeBase(ToolMaterial RGToolMaterialAxe) {
        super(RGToolMaterialAxe, 8, -3.1f, new Settings().group(EXPLORATION_GROUP
));
    }
}