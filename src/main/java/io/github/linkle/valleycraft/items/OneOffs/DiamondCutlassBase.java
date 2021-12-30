package io.github.linkle.valleycraft.items.OneOffs;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static io.github.linkle.valleycraft.init.ItemGroups.EXPLORATION_GROUP;

public class DiamondCutlassBase extends SwordItem {
    public DiamondCutlassBase(ToolMaterial DiamondToolMaterialCutlass) {
        super(DiamondToolMaterialCutlass, 7, -3.0f, new Settings().group(EXPLORATION_GROUP));
    }
}
