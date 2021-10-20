package net.linkle.valley.Registry.WeaponsAndTools.Knives;

import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class IronKnifeBase extends SwordItem {
    public IronKnifeBase(ToolMaterial IronToolMaterialKnife) {
        super(IronToolMaterialKnife, 3, -2.0f, new Item.Settings().group(EXPLORATION_GROUP
));
    }
}


