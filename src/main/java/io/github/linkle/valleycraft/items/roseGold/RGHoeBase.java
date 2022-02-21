package io.github.linkle.valleycraft.items.roseGold;

import io.github.linkle.valleycraft.init.ItemGroups;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

public class RGHoeBase extends HoeItem {
    public RGHoeBase(ToolMaterial RGToolMaterialHoe) {
        super(RGToolMaterialHoe, -1, -3f, new Settings().group(ItemGroups.EXPLORATION_GROUP
                ));
    }
}