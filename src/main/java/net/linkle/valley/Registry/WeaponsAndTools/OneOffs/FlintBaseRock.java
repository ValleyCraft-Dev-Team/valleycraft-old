package net.linkle.valley.Registry.WeaponsAndTools.OneOffs;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class FlintBaseRock extends PickaxeItem {
    public FlintBaseRock(ToolMaterial FlintToolMaterialRock) {
        super(FlintToolMaterialRock, 2, -2.8f, new Settings().group(EXPLORATION_GROUP));
    }
}


