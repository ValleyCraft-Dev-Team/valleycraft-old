package net.linkle.valley.Registry.WeaponsAndTools.Knives;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class StoneKnifeBase extends SwordItem {
    public StoneKnifeBase(ToolMaterial StoneToolMaterialKnife) {
        super(StoneToolMaterialKnife, 2, -2.0f, new Settings().group(EXPLORATION_GROUP
));
    }
}


