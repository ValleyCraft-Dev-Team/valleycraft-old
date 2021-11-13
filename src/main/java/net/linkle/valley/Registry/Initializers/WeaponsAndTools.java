package net.linkle.valley.Registry.Initializers;

import static net.linkle.valley.Registry.Utils.Util.register;

import net.linkle.valley.Registry.WeaponsAndTools.Hatchets.*;
import net.linkle.valley.Registry.WeaponsAndTools.Knives.*;
import net.linkle.valley.Registry.WeaponsAndTools.OneOffs.*;
import net.linkle.valley.Registry.WeaponsAndTools.RGRest.*;
import net.linkle.valley.Registry.WeaponsAndTools.Sickles.*;
import net.linkle.valley.Registry.WeaponsAndTools.Viking.*;

public class WeaponsAndTools {

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
        register("tongs", new TongsBase(new TongsToolMaterial()));

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
        register("viking_hatchet", new VikingHatchetBase(new VikingToolMaterial()));
        register("viking_knife", new VikingKnifeBase(new VikingToolMaterial()));
        //register("viking_war_axe", new VikingWarAxeBase(new VikingToolMaterial()));
        register("viking_hoe", new VikingHoeBase(new VikingToolMaterial()));
        register("viking_shovel", new VikingShovelBase(new VikingToolMaterial()));
        register("viking_hammer", new VikingHammerBase(new VikingToolMaterial()));
        register("viking_pickaxe", new VikingPickBase(new VikingToolMaterial()));
        register("viking_sword", new VikingSwordBase(new VikingToolMaterial()));
        register("viking_spear", new VikingSpearBase(new VikingToolMaterial()));

        //Witch's Tools
        //register("witch_wand", new WitchWandBase(new WitchToolMaterialKnife()));
        //register("witch_staff", new WitchStaffBase(new WitchToolMaterialKnife()));
        //register("witch_dagger", new WitchKnifeBase(new WitchToolMaterialKnife()));

        //Druid Staff
        register("druid_staff", new DruidStaffBase(new DruidToolMaterialStaff()));

        //Knives
        register("wood_knife", new WoodKnifeBase(new WoodToolMaterialKnife()));
        register("stone_knife", new StoneKnifeBase(new StoneToolMaterialKnife()));
        register("golden_knife", new GoldKnifeBase(new GoldenToolMaterialKnife()));
        register("iron_knife", new IronKnifeBase(new IronToolMaterialKnife()));
        register("rg_knife", new RGKnifeBase(new RGToolMaterialKnife()));
        register("diamond_knife", new DiamondKnifeBase(new DiamondToolMaterialKnife()));
        register("netherite_knife", new NetheriteKnifeBase(new NetheriteToolMaterialKnife()));
        //Sickles
        register("wood_sickle", new WoodSickleBase(new WoodToolMaterialSickle()));
        register("stone_sickle", new StoneSickleBase(new StoneToolMaterialSickle()));
        register("golden_sickle", new GoldSickleBase(new GoldenToolMaterialSickle()));
        register("iron_sickle", new IronSickleBase(new IronToolMaterialSickle()));
        register("rg_sickle", new RGSickleBase(new RGToolMaterialSickle()));
        register("diamond_sickle", new DiamondSickleBase(new DiamondToolMaterialSickle()));
        register("netherite_sickle", new NetheriteSickleBase(new NetheriteToolMaterialSickle()));
        //Hatchets
        register("wood_hatchet", new WoodHatchetBase(new WoodToolMaterialHatchet()));
        register("stone_hatchet", new StoneHatchetBase(new StoneToolMaterialHatchet()));
        register("golden_hatchet", new GoldHatchetBase(new GoldenToolMaterialHatchet()));
        register("iron_hatchet", new IronHatchetBase(new IronToolMaterialHatchet()));
        register("rg_hatchet", new RGHatchetBase(new RGToolMaterialHatchet()));
        register("diamond_hatchet", new DiamondHatchetBase(new DiamondToolMaterialHatchet()));
        register("netherite_hatchet", new NetheriteHatchetBase(new NetheriteToolMaterialHatchet()));
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
