package io.github.linkle.valleycraft.items.OneOffs;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

import static io.github.linkle.valleycraft.init.ItemGroups.EXPLORATION_GROUP;

public class TongsBase extends PickaxeItem {
    public TongsBase(ToolMaterial TongsToolMaterial) {
        super(TongsToolMaterial, 2, -2.8f, new Settings().group(EXPLORATION_GROUP));
    }
}


