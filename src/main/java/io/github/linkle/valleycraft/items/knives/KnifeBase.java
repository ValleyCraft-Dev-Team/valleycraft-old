package io.github.linkle.valleycraft.items.knives;

import io.github.linkle.valleycraft.init.ItemGroups;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class KnifeBase extends SwordItem {
    public KnifeBase(ToolMaterial material, int attackDamage, float attackSpeed) {
        super(material, attackDamage, attackSpeed, new Item.Settings().group(ItemGroups.EXPLORATION_GROUP));
    }
}
