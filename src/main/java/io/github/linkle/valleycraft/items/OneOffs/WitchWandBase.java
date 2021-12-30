package io.github.linkle.valleycraft.items.OneOffs;

import static io.github.linkle.valleycraft.init.ItemGroups.EXPLORATION_GROUP;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

public class WitchWandBase extends HoeItem {
    public WitchWandBase(ToolMaterial WitchToolMaterialKnife) {
        super(WitchToolMaterialKnife, 7, -2.5f, new Settings().group(EXPLORATION_GROUP));
    }
}
