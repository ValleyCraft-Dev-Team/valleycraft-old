package net.linkle.valley.Registry.WeaponsAndTools.RGRest;

import net.minecraft.item.HoeItem;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class RGPickaxeBase extends PickaxeItem {
    public RGPickaxeBase(ToolMaterial RGToolMaterialPickaxe) {
        super(RGToolMaterialPickaxe, 3, -2.8f, new Settings().group(EXPLORATION_GROUP
));
    }
}