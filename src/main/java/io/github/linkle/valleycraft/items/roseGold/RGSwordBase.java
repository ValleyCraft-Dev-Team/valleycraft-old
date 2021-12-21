package io.github.linkle.valleycraft.items.roseGold;

import io.github.linkle.valleycraft.init.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class RGSwordBase extends SwordItem {
    public RGSwordBase(ToolMaterial RGToolMaterialSword) {
        super(RGToolMaterialSword, 5, -2.4f, new Settings().group(ItemGroups.EXPLORATION_GROUP));
    }
}