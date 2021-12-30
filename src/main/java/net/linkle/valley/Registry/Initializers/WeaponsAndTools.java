package net.linkle.valley.Registry.Initializers;

import static net.linkle.valley.Registry.Utils.Util.register;

import net.linkle.valley.Registry.WeaponsAndTools.Hatchets.*;
import net.linkle.valley.Registry.WeaponsAndTools.Knives.*;
import net.linkle.valley.Registry.WeaponsAndTools.OneOffs.*;
import net.linkle.valley.Registry.WeaponsAndTools.RGRest.*;
import net.linkle.valley.Registry.WeaponsAndTools.Sickles.*;
import net.minecraft.item.Item;

public class WeaponsAndTools {

    public static final Item TONGS = new TongsBase(new TongsToolMaterial());
    
    public static void initialize() {

        //Branch
        register("tree_branch", new BranchBase(new BranchMaterial()));

        //Sharp Flint Rock
        register("flint_rock", new FlintBaseRock(new FlintToolMaterialRock()));

        //Bone Knife
        register("bone_knife", new BoneBaseKnife(new BoneToolMaterialKnife()));

        //Climbing Axe
        register("climbing_axe", new ClimbingAxeBase(new ClimingAxeToolMaterial()));

        //Rock Pick
        //register("rock_pick", new RockPickBase(new RockPickToolMaterial()));

        //Ice Tongs
        register("tongs", TONGS);

        //Lumber Axe
        register("lumber_axe", new LumberAxeBase(new LumberAxeToolMaterial()));

        //Sieve
        //register("hand_sieve", new SieveBase(new SieveToolMaterial()));

        //Rock Breaker
        //register("rock_breaker", new RockBreakerBase(new RockBreakerToolMaterial()));

        //Ladle
        //register("soup_ladle", new LadleBase(new LadleMaterial()));

        //Traveler's Sword
        //register("travelers_sword", new TravelerSwordBase(new TravelerToolMaterialSword()));

        //Viking Tools
        //register("viking_great_axe", new VikingGreatAxeBase(new VikingToolMaterial()));
        //register("viking_hatchet", new VikingHatchetBase(new VikingToolMaterial()));
        //register("viking_knife", new VikingKnifeBase(new VikingToolMaterial()));
        //register("viking_war_axe", new VikingWarAxeBase(new VikingToolMaterial()));
        //register("viking_hoe", new VikingHoeBase(new VikingToolMaterial()));
        //register("viking_shovel", new VikingShovelBase(new VikingToolMaterial()));
        //register("viking_hammer", new VikingHammerBase(new VikingToolMaterial()));
        //register("viking_pickaxe", new VikingPickBase(new VikingToolMaterial()));
        //register("viking_sword", new VikingSwordBase(new VikingToolMaterial()));
        //register("viking_spear", new VikingSpearBase(new VikingToolMaterial()));

        //Witch's Tools
        //register("witch_wand", new WitchWandBase(new WitchToolMaterialKnife()));
        //register("witch_staff", new WitchStaffBase(new WitchToolMaterialKnife()));
        //register("witch_dagger", new WitchKnifeBase(new WitchToolMaterialKnife()));

        //Druid Staff
        register("druid_staff", new DruidStaffBase(new DruidToolMaterialStaff()));
        //register("redstone_wand", REDSTONE_WAND);

        //Knives
        register("wood_knife", new KnifeBase(new WoodToolMaterialKnife(), 2, -2.2f));
        register("stone_knife", new KnifeBase(new StoneToolMaterialKnife(), 2, -2.0f));
        register("golden_knife", new KnifeBase(new GoldenToolMaterialKnife(), 2, -2.2f));
        register("iron_knife", new KnifeBase(new IronToolMaterialKnife(), 3, -2.0f));
        register("rg_knife", new KnifeBase(new RGToolMaterialKnife(), 3, -2.0f));
        register("diamond_knife", new KnifeBase(new DiamondToolMaterialKnife(), 4, -2.0f));
        register("netherite_knife", new KnifeBase(new NetheriteToolMaterialKnife(), 5, -2.0f));
        //Sickles
        register("wood_sickle", new SickleBase(new WoodToolMaterialSickle(), 2, -3.4f));
        register("stone_sickle", new SickleBase(new StoneToolMaterialSickle(), 2, -3.3f));
        register("golden_sickle", new SickleBase(new GoldenToolMaterialSickle(), 2, -3.4f));
        register("iron_sickle", new SickleBase(new IronToolMaterialSickle(), 2, -3.2f));
        register("rg_sickle", new SickleBase(new RGToolMaterialSickle(), 2, -3.2f));
        register("diamond_sickle", new SickleBase(new DiamondToolMaterialSickle(), 2, -3.1f));
        register("netherite_sickle", new SickleBase(new NetheriteToolMaterialSickle(), 3, -3.0f));
        //Hatchets
        register("wood_hatchet", new HatchetBase(new WoodToolMaterialHatchet(), 5, -2.6f));
        register("stone_hatchet", new HatchetBase(new StoneToolMaterialHatchet(), 7, -2.6f));
        register("golden_hatchet", new HatchetBase(new GoldenToolMaterialHatchet(), 5, -2.4f));
        register("iron_hatchet", new HatchetBase(new IronToolMaterialHatchet(), 7, -2.5f));
        register("rg_hatchet", new HatchetBase(new RGToolMaterialHatchet(), 7, -2.5f));
        register("diamond_hatchet", new HatchetBase(new DiamondToolMaterialHatchet(), 7, -2.4f));
        register("netherite_hatchet", new HatchetBase(new NetheriteToolMaterialHatchet(), 8, -2.4f));
        //Rose Gold Tools
        register("rg_shovel", new RGShovelBase(new RGToolMaterialShovel()));
        register("rg_pickaxe", new RGPickaxeBase(new RGToolMaterialPickaxe()));
        register("rg_axe", new RGAxeBase(new RGToolMaterialAxe()));
        register("rg_hoe", new RGHoeBase(new RGToolMaterialHoe()));
        register("rg_sword", new RGSwordBase(new RGToolMaterialSword()));

        //Artifacts
        //register("royal_sword", new RoyalSwordBase(new ToolMaterialSoldiersSpear()));
        //register("soldiers_spear", new SoldiersSpearBase(new ToolMaterialSoldiersSpear()));
        //register("diamond_cutlass", new DiamondCutlassBase(new DiamondToolMaterialCutlass()));
        //register("rusty_sword", new RustySwordBase(new ToolMaterialSoldiersSpear()));
    }
}
