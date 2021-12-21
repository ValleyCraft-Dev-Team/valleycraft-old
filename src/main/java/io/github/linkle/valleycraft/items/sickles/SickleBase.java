package io.github.linkle.valleycraft.items.sickles;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

import static io.github.linkle.valleycraft.init.ItemGroups.EXPLORATION_GROUP;

public class SickleBase extends HoeItem {
    public SickleBase(ToolMaterial material, int attackDamage, float attackSpeed) {
        super(material, attackDamage, attackSpeed, new Settings().group(EXPLORATION_GROUP));
    }
}