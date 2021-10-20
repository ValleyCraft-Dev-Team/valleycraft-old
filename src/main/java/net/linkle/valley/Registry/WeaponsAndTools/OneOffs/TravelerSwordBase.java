package net.linkle.valley.Registry.WeaponsAndTools.OneOffs;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class TravelerSwordBase extends SwordItem {
    public TravelerSwordBase(ToolMaterial RGToolMaterialSword) {
        super(RGToolMaterialSword, 9, -2.2f, new Settings().group(EXPLORATION_GROUP
));
    }
}