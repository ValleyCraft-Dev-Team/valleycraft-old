package io.github.linkle.valleycraft.items.OneOffs;

import static io.github.linkle.valleycraft.init.ItemGroups.EXPLORATION_GROUP;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

public class WitchKnifeBase extends HoeItem {
    public WitchKnifeBase(ToolMaterial WitchToolMaterialKnife) {
        super(WitchToolMaterialKnife, 3, -2.0f, new Settings().group(EXPLORATION_GROUP));
    }
}
