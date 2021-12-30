package io.github.linkle.valleycraft.items.OneOffs;

import static io.github.linkle.valleycraft.init.ItemGroups.EXPLORATION_GROUP;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class RockPickBase extends PickaxeItem {
    public RockPickBase(ToolMaterial RockPickToolMaterial) {
        super(RockPickToolMaterial, 3, -2.0f, new Settings().group(EXPLORATION_GROUP));
    }
}
