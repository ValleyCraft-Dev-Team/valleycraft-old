package io.github.linkle.valleycraft.items.OneOffs;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

import static io.github.linkle.valleycraft.init.ItemGroups.EXPLORATION_GROUP;

public class RockBreakerBase extends PickaxeItem {
    public RockBreakerBase(ToolMaterial RockBreakerToolMaterial) {
        super(RockBreakerToolMaterial, 5, -3.2f, new Settings().group(EXPLORATION_GROUP
));
    }
}


