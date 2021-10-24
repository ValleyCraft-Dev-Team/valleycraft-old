package net.linkle.valley.Registry.WeaponsAndTools.OneOffs;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class BoneBaseKnife extends PickaxeItem {
    public BoneBaseKnife(ToolMaterial FlintToolMaterialRock) {
        super(FlintToolMaterialRock, 2, -2.0f, new Settings().group(EXPLORATION_GROUP));
    }
}


