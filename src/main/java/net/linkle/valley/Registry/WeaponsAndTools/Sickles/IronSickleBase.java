package net.linkle.valley.Registry.WeaponsAndTools.Sickles;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class IronSickleBase extends HoeItem {
    public IronSickleBase(ToolMaterial IronToolMaterialSickle) {
        super(IronToolMaterialSickle, 2, -3.2f, new Settings().group(EXPLORATION_GROUP
));
    }
}