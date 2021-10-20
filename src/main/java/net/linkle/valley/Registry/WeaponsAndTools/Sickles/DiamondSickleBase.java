package net.linkle.valley.Registry.WeaponsAndTools.Sickles;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class DiamondSickleBase extends HoeItem {
    public DiamondSickleBase(ToolMaterial DiamondToolMaterialSickle) {
        super(DiamondToolMaterialSickle, 2, -3.1f, new Settings().group(EXPLORATION_GROUP));
    }
}