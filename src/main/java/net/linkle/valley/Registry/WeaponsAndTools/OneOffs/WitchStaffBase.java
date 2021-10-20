package net.linkle.valley.Registry.WeaponsAndTools.OneOffs;

import net.minecraft.item.HoeItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class WitchStaffBase extends HoeItem {
    public WitchStaffBase(ToolMaterial WitchToolMaterialKnife) {
        super(WitchToolMaterialKnife, 5, -2.4f, new Settings().group(EXPLORATION_GROUP
));
    }
}


