package net.linkle.valley.Registry.WeaponsAndTools.Sickles;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class StoneSickleBase extends HoeItem {
    public StoneSickleBase(ToolMaterial StoneToolMaterialSickle) {
        super(StoneToolMaterialSickle, 2, -3.3f, new Settings().group(EXPLORATION_GROUP
));
    }
}