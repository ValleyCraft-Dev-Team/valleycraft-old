package net.linkle.valley.Registry.WeaponsAndTools.OneOffs;

import net.minecraft.item.HoeItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class WitchWandBase extends HoeItem {
    public WitchWandBase(ToolMaterial WitchToolMaterialKnife) {
        super(WitchToolMaterialKnife, 7, -2.5f, new Settings().group(EXPLORATION_GROUP
            ));
    }
}


