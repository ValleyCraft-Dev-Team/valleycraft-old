package net.linkle.valley.Registry.WeaponsAndTools.OneOffs;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class RoyalSwordBase extends SwordItem {
    public RoyalSwordBase(ToolMaterial ToolMaterialSoldiersSpear) {
        super(ToolMaterialSoldiersSpear, 5, -2.0f, new Settings().group(EXPLORATION_GROUP));
    }
}
