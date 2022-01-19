package io.github.linkle.valleycraft.init;

import io.github.linkle.valleycraft.items.OneOffs.*;
import io.github.linkle.valleycraft.items.hatchets.*;
import io.github.linkle.valleycraft.items.knives.*;
import io.github.linkle.valleycraft.items.ocean_relics.*;
import io.github.linkle.valleycraft.items.roseGold.*;
import io.github.linkle.valleycraft.items.sickles.*;
import io.github.linkle.valleycraft.utils.Util;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.item.Item.Settings;

import static io.github.linkle.valleycraft.utils.Util.register;

import static io.github.linkle.valleycraft.init.ItemGroups.EXPLORATION_GROUP;

public class WeaponsAndTools {

        //Store instances of each gear item's base classes, configured with the chosen attack damage, speed, etc.
        //We only store them in variables when another class needs to do things like inject them into loot tables
    public static final Item TONGS = new TongsBase(new TongsToolMaterial());
    public static final Item DRUID = new DruidStaffBase();
    public static final Item MERMAID_SWORD = new MermaidSwordItem(new MermaidWeaponToolMaterial(), 5, -1.5f);
    public static final Item MERMAID_SPEAR = new MermaidSpearItem(new MermaidWeaponToolMaterial(), 7, -1.8f);
    public static final Item ENCRUSTED_PICKAXE = new EncrustedPickaxeItem(new EncrustedPickaxeToolMaterial(), 2, -2.8f);
    public static final Item CORAL_KNIFE = new CoralDaggerItem(new CoralDaggerToolMaterial(), 3, -1.4f);

        //The base attack damage of each tool type.
        //These values are added to the attack stats of their materials when they're registered.
        //The attack stats are listed in RoseGoldToolMaterial.class.
    public static final Integer KNIFE_BASE_DAMAGE = 1;
    public static final Integer SICKLE_BASE_DAMAGE = 7;
    public static final Integer HATCHET_BASE_DAMAGE = 4;
        //The base attack speed of each tool type.
        //These numbers are subtracted from four, so 4.0 will make the tool never charge, and higher will likely cause issues.
        //Larger number = slower, smaller number = faster.
    public static final Float KNIFE_BASE_SPEED = -2.0f;
    public static final Float SICKLE_BASE_SPEED = -3.0f;
    public static final Float HATCHET_BASE_SPEED = -2.4f;
        //The item settings for knives made of 'basic' materials- wood, gold, stone, iron, rose gold, diamond, netherite
    public static final Item.Settings BASIC_KNIFE_SETTINGS = new Settings().group(EXPLORATION_GROUP);

    public static void initialize() {
        //Branch
        Util.register("tree_branch", new BranchBase(new BranchMaterial()));

        //Sharp Flint Rock
        Util.register("flint_rock", new FlintBaseRock(new FlintToolMaterialRock()));

        //Bone Knife
        Util.register("bone_knife", new BoneBaseKnife(new BoneToolMaterialKnife()));

        //Climbing Axe
        Util.register("climbing_axe", new ClimbingAxeBase(new ClimingAxeToolMaterial()));

        //Ice Tongs
        Util.register("tongs", TONGS);

        //Lumber Axe
        Util.register("lumber_axe", new LumberAxeBase(new LumberAxeToolMaterial()));

        //Prismarine Scalpel
        Util.register("prismarine_scalpel", new ScalpelBase(new PrismarineToolMaterialScalpel(), 2, -2.0f));

        //Druid Staff
        Util.register("druid_staff", DRUID);

        //Coral Knife
        Util.register("coral_knife", CORAL_KNIFE);

        //Mermaid Weapons
        Util.register("mermaids_spear", MERMAID_SPEAR);
        Util.register("mermaids_sword", MERMAID_SWORD);
        Util.register("encrusted_pickaxe", ENCRUSTED_PICKAXE);

            //Knives
        register("wood_knife", new KnifeBase(ToolMaterials.WOOD, KNIFE_BASE_DAMAGE, KNIFE_BASE_SPEED, BASIC_KNIFE_SETTINGS));
        register("stone_knife", new KnifeBase(ToolMaterials.STONE, KNIFE_BASE_DAMAGE, KNIFE_BASE_SPEED, BASIC_KNIFE_SETTINGS));
        register("golden_knife", new KnifeBase(ToolMaterials.GOLD, KNIFE_BASE_DAMAGE, KNIFE_BASE_SPEED, BASIC_KNIFE_SETTINGS));
        register("iron_knife", new KnifeBase(ToolMaterials.IRON, KNIFE_BASE_DAMAGE, KNIFE_BASE_SPEED, BASIC_KNIFE_SETTINGS));
        register("rg_knife", new KnifeBase(new RoseGoldToolMaterial(), KNIFE_BASE_DAMAGE, KNIFE_BASE_SPEED, BASIC_KNIFE_SETTINGS));
        register("diamond_knife", new KnifeBase(ToolMaterials.DIAMOND, KNIFE_BASE_DAMAGE, KNIFE_BASE_SPEED, BASIC_KNIFE_SETTINGS));
        register("netherite_knife", new KnifeBase(ToolMaterials.NETHERITE, KNIFE_BASE_DAMAGE, KNIFE_BASE_SPEED, BASIC_KNIFE_SETTINGS));
            //Sickles
            //Lower tier sickles have slightly slower attack speeds than base, to match vanilla hoes
        Util.register("wood_sickle", new SickleBase(ToolMaterials.WOOD, SICKLE_BASE_DAMAGE, SICKLE_BASE_SPEED -0.4f));
        Util.register("stone_sickle", new SickleBase(ToolMaterials.STONE, SICKLE_BASE_DAMAGE, SICKLE_BASE_SPEED -0.3f));
        Util.register("golden_sickle", new SickleBase(ToolMaterials.GOLD, SICKLE_BASE_DAMAGE, SICKLE_BASE_SPEED -0.4f));
        Util.register("iron_sickle", new SickleBase(ToolMaterials.IRON, SICKLE_BASE_DAMAGE, SICKLE_BASE_SPEED -0.2f));
        Util.register("rg_sickle", new SickleBase(new RoseGoldToolMaterial(), SICKLE_BASE_DAMAGE, SICKLE_BASE_SPEED -0.2f));
        Util.register("diamond_sickle", new SickleBase(ToolMaterials.DIAMOND, SICKLE_BASE_DAMAGE, SICKLE_BASE_SPEED -0.1f));
        Util.register("netherite_sickle", new SickleBase(ToolMaterials.NETHERITE, SICKLE_BASE_DAMAGE, SICKLE_BASE_SPEED));
            //Hatchets
            //Lower tier hatchest have slightly slower attack speeds than base, to match vanilla axes
        Util.register("wood_hatchet", new HatchetBase(ToolMaterials.WOOD, HATCHET_BASE_DAMAGE, HATCHET_BASE_SPEED -0.2f));
        Util.register("stone_hatchet", new HatchetBase(ToolMaterials.STONE, HATCHET_BASE_DAMAGE, HATCHET_BASE_SPEED -0.2f));
        Util.register("golden_hatchet", new HatchetBase(ToolMaterials.GOLD, HATCHET_BASE_DAMAGE, HATCHET_BASE_SPEED));
        Util.register("iron_hatchet", new HatchetBase(ToolMaterials.IRON, HATCHET_BASE_DAMAGE, HATCHET_BASE_SPEED -0.1f));
        Util.register("rg_hatchet", new HatchetBase(new RoseGoldToolMaterial(), HATCHET_BASE_DAMAGE, HATCHET_BASE_SPEED -0.1f));
        Util.register("diamond_hatchet", new HatchetBase(ToolMaterials.DIAMOND, HATCHET_BASE_DAMAGE, HATCHET_BASE_SPEED));
        Util.register("netherite_hatchet", new HatchetBase(ToolMaterials.NETHERITE, HATCHET_BASE_DAMAGE, HATCHET_BASE_SPEED));
            //Rose Gold Tools
            //The shovel specifically can just use the vanilla class. All other tool classes have protected methods, so we have to extend them.
            //TL;DR: The shovel is different because only it can use the vanilla class, because mojank
        register("rg_shovel", new ShovelItem(new RoseGoldToolMaterial(), 3.5f, -3f, new Settings().group(ItemGroups.EXPLORATION_GROUP)));
        register("rg_pickaxe", new RGPickaxeBase(new RoseGoldToolMaterial()));
        register("rg_axe", new RGAxeBase(new RoseGoldToolMaterial()));
        register("rg_hoe", new RGHoeBase(new RoseGoldToolMaterial()));
        register("rg_sword", new RGSwordBase(new RoseGoldToolMaterial()));
    }
}
