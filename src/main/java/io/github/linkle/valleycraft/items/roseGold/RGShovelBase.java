package io.github.linkle.valleycraft.items.roseGold;

import io.github.linkle.valleycraft.init.ItemGroups;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class RGShovelBase extends ShovelItem {
    public RGShovelBase(ToolMaterial RGToolMaterialShovel) {
        super(RGToolMaterialShovel, 3, -3f, new Settings().group(ItemGroups.EXPLORATION_GROUP));
    }
}