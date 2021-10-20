package net.linkle.valley.Registry.WeaponsAndTools.OneOffs;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class ClimbingAxeBase extends AxeItem {
    public ClimbingAxeBase(ToolMaterial ClimbingAxeToolMaterial) {
        super(ClimbingAxeToolMaterial, 6.5f, -3f, new Settings().group(EXPLORATION_GROUP
));
    }
}


