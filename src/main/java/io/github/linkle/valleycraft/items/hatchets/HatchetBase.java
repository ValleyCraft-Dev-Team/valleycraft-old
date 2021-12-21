package io.github.linkle.valleycraft.items.hatchets;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

import static io.github.linkle.valleycraft.init.ItemGroups.EXPLORATION_GROUP;

public class HatchetBase extends AxeItem {
    public HatchetBase(ToolMaterial material, float attackDamage, float attackSpeed) {
        super(material, attackDamage, attackSpeed, new Settings().group(EXPLORATION_GROUP));
    }
}
