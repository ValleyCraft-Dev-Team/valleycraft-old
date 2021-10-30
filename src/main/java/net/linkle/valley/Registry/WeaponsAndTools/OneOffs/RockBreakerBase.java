package net.linkle.valley.Registry.WeaponsAndTools.OneOffs;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class RockBreakerBase extends PickaxeItem {
    public RockBreakerBase(ToolMaterial RockBreakerToolMaterial) {
        super(RockBreakerToolMaterial, 5, -3.2f, new Settings().group(EXPLORATION_GROUP
));
    }
}


