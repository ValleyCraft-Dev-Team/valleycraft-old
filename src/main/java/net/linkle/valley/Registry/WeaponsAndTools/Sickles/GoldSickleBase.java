package net.linkle.valley.Registry.WeaponsAndTools.Sickles;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class GoldSickleBase extends HoeItem {
    public GoldSickleBase(ToolMaterial GoldToolMaterialSickle) {
        super(GoldToolMaterialSickle, 2, -3.4f, new Settings().group(EXPLORATION_GROUP
));
    }
}