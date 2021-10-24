package net.linkle.valley.Registry.WeaponsAndTools.Viking;

import net.minecraft.item.AxeItem;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class VikingPickBase extends PickaxeItem {
    public VikingPickBase(ToolMaterial VikingToolMaterial) {
        super(VikingToolMaterial, 3, -2.8f, new Settings().group(EXPLORATION_GROUP
));
    }
}


