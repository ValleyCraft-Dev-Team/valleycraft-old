package net.linkle.valley.Registry.WeaponsAndTools.OneOffs;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class SieveBase extends ShovelItem {
    public SieveBase(ToolMaterial SieveToolMaterial) {
        super(SieveToolMaterial, 3, -2.5f, new Settings().group(EXPLORATION_GROUP
));
    }
}


