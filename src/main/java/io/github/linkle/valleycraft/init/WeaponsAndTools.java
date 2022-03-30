package io.github.linkle.valleycraft.init;

import io.github.linkle.valleycraft.items.OneOffs.*;
import io.github.linkle.valleycraft.items.hatchets.*;
import io.github.linkle.valleycraft.items.knives.*;
import io.github.linkle.valleycraft.items.ocean_relics.*;
import io.github.linkle.valleycraft.items.roseGold.*;
import io.github.linkle.valleycraft.items.sickles.*;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.item.Item.Settings;

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
        Reg.register("tree_branch", new BranchBase(new BranchMaterial()));

        //Sharp Flint Rock
        Reg.register("flint_rock", new FlintBaseRock(new FlintToolMaterialRock()));

        //Bone Knife
        Reg.register("bone_knife", new BoneBaseKnife(new BoneToolMaterialKnife()));

        //Climbing Axe
        Reg.register("climbing_axe", new ClimbingAxeBase(new ClimingAxeToolMaterial()));

        //Ice Tongs
        Reg.register("tongs", TONGS);

        //Lumber Axe
        Reg.register("lumber_axe", new LumberAxeBase(new LumberAxeToolMaterial()));

        //Prismarine Scalpel
        Reg.register("prismarine_scalpel", new ScalpelBase(new PrismarineToolMaterialScalpel(), 2, -2.0f));

        //Druid Staff
        Reg.register("druid_staff", DRUID);

        //Coral Knife
        Reg.register("coral_knife", CORAL_KNIFE);

        //Mermaid Weapons
        Reg.register("mermaids_spear", MERMAID_SPEAR);
        Reg.register("mermaids_sword", MERMAID_SWORD);
        Reg.register("encrusted_pickaxe", ENCRUSTED_PICKAXE);

        //Knives
        Reg.register("wood_knife", new KnifeBase(ToolMaterials.WOOD, KNIFE_BASE_DAMAGE, KNIFE_BASE_SPEED, BASIC_KNIFE_SETTINGS));
        Reg.register("stone_knife", new KnifeBase(ToolMaterials.STONE, KNIFE_BASE_DAMAGE, KNIFE_BASE_SPEED, BASIC_KNIFE_SETTINGS));
        Reg.register("golden_knife", new KnifeBase(ToolMaterials.GOLD, KNIFE_BASE_DAMAGE, KNIFE_BASE_SPEED, BASIC_KNIFE_SETTINGS));
        Reg.register("iron_knife", new KnifeBase(ToolMaterials.IRON, KNIFE_BASE_DAMAGE, KNIFE_BASE_SPEED, BASIC_KNIFE_SETTINGS));
        Reg.register("rg_knife", new KnifeBase(new RoseGoldToolMaterial(), KNIFE_BASE_DAMAGE, KNIFE_BASE_SPEED, BASIC_KNIFE_SETTINGS));
        Reg.register("diamond_knife", new KnifeBase(ToolMaterials.DIAMOND, KNIFE_BASE_DAMAGE, KNIFE_BASE_SPEED, BASIC_KNIFE_SETTINGS));
        Reg.register("netherite_knife", new KnifeBase(ToolMaterials.NETHERITE, KNIFE_BASE_DAMAGE, KNIFE_BASE_SPEED, BASIC_KNIFE_SETTINGS));
        //Sickles
        //Lower tier sickles have slightly slower attack speeds than base, to match vanilla hoes
        Reg.register("wood_sickle", new SickleBase(ToolMaterials.WOOD, SICKLE_BASE_DAMAGE, SICKLE_BASE_SPEED -0.4f));
        Reg.register("stone_sickle", new SickleBase(ToolMaterials.STONE, SICKLE_BASE_DAMAGE, SICKLE_BASE_SPEED -0.3f));
        Reg.register("golden_sickle", new SickleBase(ToolMaterials.GOLD, SICKLE_BASE_DAMAGE, SICKLE_BASE_SPEED -0.4f));
        Reg.register("iron_sickle", new SickleBase(ToolMaterials.IRON, SICKLE_BASE_DAMAGE, SICKLE_BASE_SPEED -0.2f));
        Reg.register("rg_sickle", new SickleBase(new RoseGoldToolMaterial(), SICKLE_BASE_DAMAGE, SICKLE_BASE_SPEED -0.2f));
        Reg.register("diamond_sickle", new SickleBase(ToolMaterials.DIAMOND, SICKLE_BASE_DAMAGE, SICKLE_BASE_SPEED -0.1f));
        Reg.register("netherite_sickle", new SickleBase(ToolMaterials.NETHERITE, SICKLE_BASE_DAMAGE, SICKLE_BASE_SPEED));
        //Hatchets
        //Lower tier hatchest have slightly slower attack speeds than base, to match vanilla axes
        Reg.register("wood_hatchet", new HatchetBase(ToolMaterials.WOOD, HATCHET_BASE_DAMAGE, HATCHET_BASE_SPEED -0.2f));
        Reg.register("stone_hatchet", new HatchetBase(ToolMaterials.STONE, HATCHET_BASE_DAMAGE, HATCHET_BASE_SPEED -0.2f));
        Reg.register("golden_hatchet", new HatchetBase(ToolMaterials.GOLD, HATCHET_BASE_DAMAGE, HATCHET_BASE_SPEED));
        Reg.register("iron_hatchet", new HatchetBase(ToolMaterials.IRON, HATCHET_BASE_DAMAGE, HATCHET_BASE_SPEED -0.1f));
        Reg.register("rg_hatchet", new HatchetBase(new RoseGoldToolMaterial(), HATCHET_BASE_DAMAGE, HATCHET_BASE_SPEED -0.1f));
        Reg.register("diamond_hatchet", new HatchetBase(ToolMaterials.DIAMOND, HATCHET_BASE_DAMAGE, HATCHET_BASE_SPEED));
        Reg.register("netherite_hatchet", new HatchetBase(ToolMaterials.NETHERITE, HATCHET_BASE_DAMAGE, HATCHET_BASE_SPEED));
        //Rose Gold Tools
        //The shovel specifically can just use the vanilla class. All other tool classes have protected methods, so we have to extend them.
        //TL;DR: The shovel is different because only it can use the vanilla class, because mojank
        Reg.register("rg_shovel", new ShovelItem(new RoseGoldToolMaterial(), 3.5f, -3f, new Settings().group(ItemGroups.EXPLORATION_GROUP)));
        Reg.register("rg_pickaxe", new RGPickaxeBase(new RoseGoldToolMaterial()));
        Reg.register("rg_axe", new RGAxeBase(new RoseGoldToolMaterial()));
        Reg.register("rg_hoe", new RGHoeBase(new RoseGoldToolMaterial()));
        Reg.register("rg_sword", new RGSwordBase(new RoseGoldToolMaterial()));
    }
}
