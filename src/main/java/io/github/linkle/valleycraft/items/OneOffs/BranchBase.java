package io.github.linkle.valleycraft.items.OneOffs;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static io.github.linkle.valleycraft.init.ItemGroups.EXPLORATION_GROUP;

public class BranchBase extends SwordItem {
    public BranchBase(ToolMaterial BranchMaterial) {
        super(BranchMaterial, 1, -1.4f, new Settings().group(EXPLORATION_GROUP));
    }
}


