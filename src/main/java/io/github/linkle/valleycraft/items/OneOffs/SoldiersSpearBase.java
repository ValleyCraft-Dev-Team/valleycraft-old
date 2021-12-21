package io.github.linkle.valleycraft.items.OneOffs;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static io.github.linkle.valleycraft.init.ItemGroups.EXPLORATION_GROUP;

public class SoldiersSpearBase extends SwordItem {
    public SoldiersSpearBase(ToolMaterial ToolMaterialSoldiersSpear) {
        super(ToolMaterialSoldiersSpear, 5, -2.0f, new Settings().group(EXPLORATION_GROUP));
    }
}
