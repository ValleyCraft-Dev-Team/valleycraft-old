package net.linkle.valley.Registry.WeaponsAndTools.Viking;

import net.minecraft.item.AxeItem;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class VikingHammerBase extends PickaxeItem {
    public VikingHammerBase(ToolMaterial VikingToolMaterial) {
        super(VikingToolMaterial, 5, -3.0f, new Settings().group(EXPLORATION_GROUP
));
    }
}


