package io.github.linkle.valleycraft.items.roseGold;

import io.github.linkle.valleycraft.init.ItemGroups;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

public class RGAxeBase extends AxeItem {
    public RGAxeBase(ToolMaterial RGToolMaterialAxe) {
        super(RGToolMaterialAxe, 8, -3.1f, new Settings().group(ItemGroups.EXPLORATION_GROUP));
    }
}