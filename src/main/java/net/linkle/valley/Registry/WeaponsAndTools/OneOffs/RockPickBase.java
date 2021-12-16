package net.linkle.valley.Registry.WeaponsAndTools.OneOffs;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class RockPickBase extends PickaxeItem {
    public RockPickBase(ToolMaterial RockPickToolMaterial) {
        super(RockPickToolMaterial, 3, -2.0f, new Settings().group(EXPLORATION_GROUP));
    }
}
