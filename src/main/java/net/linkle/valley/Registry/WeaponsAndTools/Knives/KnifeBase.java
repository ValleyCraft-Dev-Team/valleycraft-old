package net.linkle.valley.Registry.WeaponsAndTools.Knives;

import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class KnifeBase extends SwordItem {
    public KnifeBase(ToolMaterial material, int attackDamage, float attackSpeed) {
        super(material, attackDamage, attackSpeed, new Item.Settings().group(EXPLORATION_GROUP));
    }
}
