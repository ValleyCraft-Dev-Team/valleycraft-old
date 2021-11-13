package net.linkle.valley.Registry.WeaponsAndTools.OneOffs;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class DiamondCutlassBase extends SwordItem {
    public DiamondCutlassBase(ToolMaterial DiamondToolMaterialCutlass) {
        super(DiamondToolMaterialCutlass, 7, -3.0f, new Settings().group(EXPLORATION_GROUP));
    }
}
