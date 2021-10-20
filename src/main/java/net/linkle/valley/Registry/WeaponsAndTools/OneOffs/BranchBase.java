package net.linkle.valley.Registry.WeaponsAndTools.OneOffs;

import net.minecraft.block.GrassBlock;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class BranchBase extends SwordItem {
    public BranchBase(ToolMaterial BranchMaterial) {
        super(BranchMaterial, 1, -1.4f, new Settings().group(EXPLORATION_GROUP));
    }
}


