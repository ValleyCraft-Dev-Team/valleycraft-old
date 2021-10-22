package net.linkle.valley.Registry.WeaponsAndTools.OneOffs;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class RockPickBase extends PickaxeItem {
    public RockPickBase(ToolMaterial RockPickToolMaterial) {
        super(RockPickToolMaterial, 3, -2.0f, new Settings().group(EXPLORATION_GROUP
));
    }
}


