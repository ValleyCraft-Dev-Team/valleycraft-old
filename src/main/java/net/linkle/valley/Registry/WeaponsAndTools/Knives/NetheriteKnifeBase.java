package net.linkle.valley.Registry.WeaponsAndTools.Knives;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class NetheriteKnifeBase extends SwordItem {
    public NetheriteKnifeBase(ToolMaterial NetheriteToolMaterialKnife) {
        super(NetheriteToolMaterialKnife, 5, -2.0f, new Settings().group(EXPLORATION_GROUP
));
    }
}


