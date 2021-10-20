package net.linkle.valley.Registry.WeaponsAndTools.OneOffs;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class TongsBase extends PickaxeItem {
    public TongsBase(ToolMaterial TongsToolMaterial) {
        super(TongsToolMaterial, 2, -2.8f, new Settings().group(EXPLORATION_GROUP));
    }
}


