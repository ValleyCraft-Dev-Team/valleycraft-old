package io.github.linkle.valleycraft.items.OneOffs;

import static io.github.linkle.valleycraft.init.ItemGroups.EXPLORATION_GROUP;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

public class WitchStaffBase extends HoeItem {
    public WitchStaffBase(ToolMaterial WitchToolMaterialKnife) {
        super(WitchToolMaterialKnife, 5, -2.4f, new Settings().group(EXPLORATION_GROUP));
    }
}
