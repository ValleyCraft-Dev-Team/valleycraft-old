package net.linkle.valley.Registry.WeaponsAndTools.Knives;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class WoodKnifeBase extends SwordItem {
    public WoodKnifeBase(ToolMaterial WoodToolMaterialKnife) {
        super(WoodToolMaterialKnife, 2, -2.2f, new Settings().group(EXPLORATION_GROUP
));
    }
}


