package net.linkle.valley.Registry.WeaponsAndTools.Knives;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class GoldKnifeBase extends SwordItem {
    public GoldKnifeBase(ToolMaterial GoldToolMaterialKnife) {
        super(GoldToolMaterialKnife, 2, -2.2f, new Settings().group(EXPLORATION_GROUP
));
    }
}


