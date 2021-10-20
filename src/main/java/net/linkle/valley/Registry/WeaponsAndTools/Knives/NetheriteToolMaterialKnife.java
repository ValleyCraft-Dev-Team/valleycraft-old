package net.linkle.valley.Registry.WeaponsAndTools.Knives;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class NetheriteToolMaterialKnife implements ToolMaterial {
    @Override
    public int getDurability() {
        //Wood: 59
        //Flint: 95
        //Stone: 131
        //Iron: 250
        //Golden: 32
        //Diamond: 1561
        //Netherite: 2031
        return 2031;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        //Nothing: 1.0f
        //Wood: 2.0f
        //Flint: 3.0f
        //Stone: 4.0f
        //Iron: 6.0f
        //Diamond: 8.0f
        //Netherite: 10.0f
        //Gold: 12.0f
        return 10.0f;
    }

    @Override
    public float getAttackDamage() {
        //Wood: 0.0f
        //Flint: 0.5f
        //Stone: 1.0f
        //Iron: 2.0f
        //Diamond: 3.0f
        //Gold: 0.0f
        //Netherite: 4.0f?
        return 0.0f;
    }

    @Override
    public int getMiningLevel() {
        //Wood: 0
        //Flint: 1
        //Stone: 1
        //Iron: 2
        //Diamond: 3
        //Gold: 0
        //Netherite: 3
        return 3;
    }

    @Override
    public int getEnchantability() {
        //Wood: 15
        //Flint: 10
        //Stone: 5
        //Iron: 14
        //Diamond: 10
        //Gold: 22
        //Netherite: ??
        return 14;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.NETHERITE_INGOT);
    }
}
