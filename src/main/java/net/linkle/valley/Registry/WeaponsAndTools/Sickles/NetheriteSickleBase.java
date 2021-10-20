package net.linkle.valley.Registry.WeaponsAndTools.Sickles;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class NetheriteSickleBase extends HoeItem {
    public NetheriteSickleBase(ToolMaterial NetheriteToolMaterialSickle) {
        super(NetheriteToolMaterialSickle, 3, -3.0f, new Settings().group(EXPLORATION_GROUP
));
    }
}