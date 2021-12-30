package io.github.linkle.valleycraft.items.OneOffs;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

import static io.github.linkle.valleycraft.init.ItemGroups.EXPLORATION_GROUP;

public class BoneBaseKnife extends PickaxeItem {
    public BoneBaseKnife(ToolMaterial FlintToolMaterialRock) {
        super(FlintToolMaterialRock, 2, -2.0f, new Settings().group(EXPLORATION_GROUP));
    }
}


