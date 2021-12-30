package net.linkle.valley.Registry.WeaponsAndTools.OneOffs;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

public class WitchStaffBase extends HoeItem {
    public WitchStaffBase(ToolMaterial WitchToolMaterialKnife) {
        super(WitchToolMaterialKnife, 5, -2.4f, new Settings().group(EXPLORATION_GROUP));
    }
}
