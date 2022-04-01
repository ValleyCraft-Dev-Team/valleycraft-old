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

    //When we need to access a tool or weapon elsewhere in the codebase, such as to inject them into loot tables, we need them stored in variables.
    //For the tools and weapons to which that applies, we define them here, then register them with the others.
    public static final Item TONGS = new TongsBase(new TongsToolMaterial());
    public static final Item DRUID = new DruidStaffBase();
    public static final Item MERMAIDS_SWORD = new MermaidSwordItem(new MermaidWeaponToolMaterial(), 5, -1.5f);
    public static final Item MERMAIDS_SPEAR = new MermaidSpearItem(new MermaidWeaponToolMaterial(), 7, -1.8f);
    public static final Item ENCRUSTED_PICKAXE = new EncrustedPickaxeItem(new EncrustedPickaxeToolMaterial(), 2, -2.8f);
    public static final Item CORAL_DAGGER = new CoralDaggerItem(new CoralDaggerToolMaterial(), 3, -1.4f);

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
        Reg.register("tree_branch", new BranchBase(new BranchMaterial()));                      //Branch
        Reg.register("sharpened_flint", new FlintBaseRock(new FlintToolMaterialRock()));        //Sharpened Flint
        Reg.register("bone_knife", new BoneBaseKnife(new BoneToolMaterialKnife()));             //Bone Knife
        Reg.register("climbing_axe", new ClimbingAxeBase(new ClimingAxeToolMaterial()));        //Climbing Axe
        Reg.register("tongs", TONGS);                                                           //Ice Tongs
        Reg.register("lumber_axe", new LumberAxeBase(new LumberAxeToolMaterial()));             //Lumber Axe
        Reg.register("druid_staff", DRUID);                                                     //Druid Staff
        Reg.register("coral_dagger", CORAL_DAGGER);                                             //Coral Dagger
        Reg.register("mermaids_spear", MERMAIDS_SPEAR);                                         //Mermaid's Spear
        Reg.register("mermaids_sword", MERMAIDS_SWORD);                                         //Mermaid's Sword
        Reg.register("encrusted_pickaxe", ENCRUSTED_PICKAXE);                                   //Encrusted Pickaxe

        //Prismarine Scalpel
        Reg.register("prismarine_scalpel", new ScalpelBase(new PrismarineToolMaterialScalpel(), 2, -2.0f));

        //Knives
        Reg.register("wood_knife", new KnifeBase(ToolMaterials.WOOD, KNIFE_BASE_DAMAGE, KNIFE_BASE_SPEED, BASIC_KNIFE_SETTINGS));
        Reg.register("stone_knife", new KnifeBase(ToolMaterials.STONE, KNIFE_BASE_DAMAGE, KNIFE_BASE_SPEED, BASIC_KNIFE_SETTINGS));
        Reg.register("golden_knife", new KnifeBase(ToolMaterials.GOLD, KNIFE_BASE_DAMAGE, KNIFE_BASE_SPEED, BASIC_KNIFE_SETTINGS));
        Reg.register("iron_knife", new KnifeBase(ToolMaterials.IRON, KNIFE_BASE_DAMAGE, KNIFE_BASE_SPEED, BASIC_KNIFE_SETTINGS));
        Reg.register("rose_gold_knife", new KnifeBase(new RoseGoldToolMaterial(), KNIFE_BASE_DAMAGE, KNIFE_BASE_SPEED, BASIC_KNIFE_SETTINGS));
        Reg.register("diamond_knife", new KnifeBase(ToolMaterials.DIAMOND, KNIFE_BASE_DAMAGE, KNIFE_BASE_SPEED, BASIC_KNIFE_SETTINGS));
        Reg.register("netherite_knife", new KnifeBase(ToolMaterials.NETHERITE, KNIFE_BASE_DAMAGE, KNIFE_BASE_SPEED, BASIC_KNIFE_SETTINGS));
        //Sickles
        //Lower tier sickles have slightly slower attack speeds than base, to match vanilla hoes
        Reg.register("wood_sickle", new SickleBase(ToolMaterials.WOOD, SICKLE_BASE_DAMAGE, SICKLE_BASE_SPEED -0.4f));
        Reg.register("stone_sickle", new SickleBase(ToolMaterials.STONE, SICKLE_BASE_DAMAGE, SICKLE_BASE_SPEED -0.3f));
        Reg.register("golden_sickle", new SickleBase(ToolMaterials.GOLD, SICKLE_BASE_DAMAGE, SICKLE_BASE_SPEED -0.4f));
        Reg.register("iron_sickle", new SickleBase(ToolMaterials.IRON, SICKLE_BASE_DAMAGE, SICKLE_BASE_SPEED -0.2f));
        Reg.register("rose_gold_sickle", new SickleBase(new RoseGoldToolMaterial(), SICKLE_BASE_DAMAGE, SICKLE_BASE_SPEED -0.2f));
        Reg.register("diamond_sickle", new SickleBase(ToolMaterials.DIAMOND, SICKLE_BASE_DAMAGE, SICKLE_BASE_SPEED -0.1f));
        Reg.register("netherite_sickle", new SickleBase(ToolMaterials.NETHERITE, SICKLE_BASE_DAMAGE, SICKLE_BASE_SPEED));
        //Hatchets
        //Lower tier hatchets have slightly slower attack speeds than base, to match vanilla axes
        Reg.register("wood_hatchet", new HatchetBase(ToolMaterials.WOOD, HATCHET_BASE_DAMAGE, HATCHET_BASE_SPEED -0.2f));
        Reg.register("stone_hatchet", new HatchetBase(ToolMaterials.STONE, HATCHET_BASE_DAMAGE, HATCHET_BASE_SPEED -0.2f));
        Reg.register("golden_hatchet", new HatchetBase(ToolMaterials.GOLD, HATCHET_BASE_DAMAGE, HATCHET_BASE_SPEED));
        Reg.register("iron_hatchet", new HatchetBase(ToolMaterials.IRON, HATCHET_BASE_DAMAGE, HATCHET_BASE_SPEED -0.1f));
        Reg.register("rose_gold_hatchet", new HatchetBase(new RoseGoldToolMaterial(), HATCHET_BASE_DAMAGE, HATCHET_BASE_SPEED -0.1f));
        Reg.register("diamond_hatchet", new HatchetBase(ToolMaterials.DIAMOND, HATCHET_BASE_DAMAGE, HATCHET_BASE_SPEED));
        Reg.register("netherite_hatchet", new HatchetBase(ToolMaterials.NETHERITE, HATCHET_BASE_DAMAGE, HATCHET_BASE_SPEED));
        //Rose Gold Tools
        //The shovel specifically can just use the vanilla class. All other tool classes have protected methods, so we have to extend them.
        //TL;DR: The shovel is different because only it can use the vanilla class, because mojank
        Reg.register("rose_gold_shovel", new ShovelItem(new RoseGoldToolMaterial(), 3.5f, -3f, new Settings().group(ItemGroups.EXPLORATION_GROUP)));
        Reg.register("rose_gold_pickaxe", new RGPickaxeBase(new RoseGoldToolMaterial()));
        Reg.register("rose_gold_axe", new RGAxeBase(new RoseGoldToolMaterial()));
        Reg.register("rose_gold_hoe", new RGHoeBase(new RoseGoldToolMaterial()));
        Reg.register("rose_gold_sword", new RGSwordBase(new RoseGoldToolMaterial()));
    }
}
