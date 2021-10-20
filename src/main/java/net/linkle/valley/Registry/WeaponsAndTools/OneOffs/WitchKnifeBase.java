package net.linkle.valley.Registry.WeaponsAndTools.OneOffs;

import net.minecraft.item.HoeItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class WitchKnifeBase extends HoeItem {
    public WitchKnifeBase(ToolMaterial WitchToolMaterialKnife) {
        super(WitchToolMaterialKnife, 3, -2.0f, new Settings().group(EXPLORATION_GROUP
));
    }
}


