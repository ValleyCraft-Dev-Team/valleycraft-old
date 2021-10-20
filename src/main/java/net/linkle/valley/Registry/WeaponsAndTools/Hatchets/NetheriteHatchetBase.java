package net.linkle.valley.Registry.WeaponsAndTools.Hatchets;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class NetheriteHatchetBase extends AxeItem {
    public NetheriteHatchetBase(ToolMaterial NetheriteToolMaterialKnife) {
        super(NetheriteToolMaterialKnife, 8, -2.4f, new Settings().group(EXPLORATION_GROUP
));
    }
}


