package io.github.linkle.valleycraft.items.OneOffs;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

import static io.github.linkle.valleycraft.init.ItemGroups.EXPLORATION_GROUP;

public class LumberAxeBase extends AxeItem {
    public LumberAxeBase(ToolMaterial LumberAxeToolMaterial) {
        super(LumberAxeToolMaterial, 7.5f, -3.2f, new Settings().group(EXPLORATION_GROUP
                ));
    }
}


