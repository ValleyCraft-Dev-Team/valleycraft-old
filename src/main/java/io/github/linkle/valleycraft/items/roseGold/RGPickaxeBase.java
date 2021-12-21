package io.github.linkle.valleycraft.items.roseGold;

import io.github.linkle.valleycraft.init.ItemGroups;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class RGPickaxeBase extends PickaxeItem {
    public RGPickaxeBase(ToolMaterial RGToolMaterialPickaxe) {
        super(RGToolMaterialPickaxe, 3, -2.8f, new Settings().group(ItemGroups.EXPLORATION_GROUP));
    }
}