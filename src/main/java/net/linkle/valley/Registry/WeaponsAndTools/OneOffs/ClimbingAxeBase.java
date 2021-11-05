package net.linkle.valley.Registry.WeaponsAndTools.OneOffs;

import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class ClimbingAxeBase extends ToolItem {
    public ClimbingAxeBase(ToolMaterial ClimbingAxeToolMaterial) {
        super(ClimbingAxeToolMaterial, new Settings().group(EXPLORATION_GROUP));
    }
}
