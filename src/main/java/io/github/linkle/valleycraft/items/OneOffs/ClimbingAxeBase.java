package io.github.linkle.valleycraft.items.OneOffs;

import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterial;

import static io.github.linkle.valleycraft.init.ItemGroups.EXPLORATION_GROUP;

public class ClimbingAxeBase extends ToolItem {
    public ClimbingAxeBase(ToolMaterial ClimbingAxeToolMaterial) {
        super(ClimbingAxeToolMaterial, new Settings().group(EXPLORATION_GROUP));
    }
}
