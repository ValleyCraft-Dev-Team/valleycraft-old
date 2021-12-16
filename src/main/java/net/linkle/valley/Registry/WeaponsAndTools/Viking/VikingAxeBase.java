package net.linkle.valley.Registry.WeaponsAndTools.Viking;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

public class VikingAxeBase extends AxeItem {
    public VikingAxeBase(ToolMaterial VikingToolMaterial) {
        super(VikingToolMaterial, 5, -3.2f, new Settings().group(EXPLORATION_GROUP));
    }
}
