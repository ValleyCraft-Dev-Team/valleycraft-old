package net.linkle.valley.Registry.WeaponsAndTools.RGRest;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class RGPickaxeBase extends PickaxeItem {
    public RGPickaxeBase(ToolMaterial RGToolMaterialPickaxe) {
        super(RGToolMaterialPickaxe, 3, -2.8f, new Settings().group(EXPLORATION_GROUP));
    }
}