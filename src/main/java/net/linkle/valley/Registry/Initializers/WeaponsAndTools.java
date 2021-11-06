package net.linkle.valley.Registry.Initializers;

import static net.linkle.valley.ValleyMain.MOD_ID;

import net.linkle.valley.Registry.WeaponsAndTools.Hatchets.*;
import net.linkle.valley.Registry.WeaponsAndTools.Knives.*;
import net.linkle.valley.Registry.WeaponsAndTools.OneOffs.*;
import net.linkle.valley.Registry.WeaponsAndTools.RGRest.*;
import net.linkle.valley.Registry.WeaponsAndTools.Sickles.*;
import net.linkle.valley.Registry.WeaponsAndTools.Viking.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class WeaponsAndTools {

    public static void initialize() {

        //Branch
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "tree_branch"), new BranchBase(new BranchMaterial()));

        //Sharp Flint Rock
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flint_rock"), new FlintBaseRock(new FlintToolMaterialRock()));

        //Bone Knife
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bone_knife"), new BoneBaseKnife(new BoneToolMaterialKnife()));

        //Climbing Axe
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "climbing_axe"), new ClimbingAxeBase(new ClimingAxeToolMaterial()));

        //Rock Pick
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rock_pick"), new RockPickBase(new RockPickToolMaterial()));

        //Ice Tongs
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "tongs"), new TongsBase(new TongsToolMaterial()));

        //Lumber Axe
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "lumber_axe"), new LumberAxeBase(new LumberAxeToolMaterial()));

        //Sieve
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hand_sieve"), new SieveBase(new SieveToolMaterial()));

        //Rock Breaker
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rock_breaker"), new RockBreakerBase(new RockBreakerToolMaterial()));

        //Ladle
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "soup_ladle"), new LadleBase(new LadleMaterial()));

        //Traveler's Sword
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "travelers_sword"), new TravelerSwordBase(new TravelerToolMaterialSword()));

        //Viking Tools
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "viking_great_axe"), new VikingGreatAxeBase(new VikingToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "viking_hatchet"), new VikingHatchetBase(new VikingToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "viking_knife"), new VikingKnifeBase(new VikingToolMaterial()));
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "viking_war_axe"), new VikingWarAxeBase(new VikingToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "viking_hoe"), new VikingHoeBase(new VikingToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "viking_shovel"), new VikingShovelBase(new VikingToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "viking_hammer"), new VikingHammerBase(new VikingToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "viking_pickaxe"), new VikingPickBase(new VikingToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "viking_sword"), new VikingSwordBase(new VikingToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "viking_spear"), new VikingSpearBase(new VikingToolMaterial()));

        //Witch's Tools
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "witch_wand"), new WitchWandBase(new WitchToolMaterialKnife()));
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "witch_staff"), new WitchStaffBase(new WitchToolMaterialKnife()));
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "witch_dagger"), new WitchKnifeBase(new WitchToolMaterialKnife()));

        //Druid Staff
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "druid_staff"), new DruidStaffBase(new DruidToolMaterialStaff()));

        //Knives
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "wood_knife"), new WoodKnifeBase(new WoodToolMaterialKnife()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_knife"), new StoneKnifeBase(new StoneToolMaterialKnife()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "golden_knife"), new GoldKnifeBase(new GoldenToolMaterialKnife()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "iron_knife"), new IronKnifeBase(new IronToolMaterialKnife()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rg_knife"), new RGKnifeBase(new RGToolMaterialKnife()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "diamond_knife"), new DiamondKnifeBase(new DiamondToolMaterialKnife()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "netherite_knife"), new NetheriteKnifeBase(new NetheriteToolMaterialKnife()));
        //Sickles
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "wood_sickle"), new WoodSickleBase(new WoodToolMaterialSickle()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_sickle"), new StoneSickleBase(new StoneToolMaterialSickle()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "golden_sickle"), new GoldSickleBase(new GoldenToolMaterialSickle()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "iron_sickle"), new IronSickleBase(new IronToolMaterialSickle()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rg_sickle"), new RGSickleBase(new RGToolMaterialSickle()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "diamond_sickle"), new DiamondSickleBase(new DiamondToolMaterialSickle()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "netherite_sickle"), new NetheriteSickleBase(new NetheriteToolMaterialSickle()));
        //Hatchets
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "wood_hatchet"), new WoodHatchetBase(new WoodToolMaterialHatchet()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_hatchet"), new StoneHatchetBase(new StoneToolMaterialHatchet()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "golden_hatchet"), new GoldHatchetBase(new GoldenToolMaterialHatchet()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "iron_hatchet"), new IronHatchetBase(new IronToolMaterialHatchet()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rg_hatchet"), new RGHatchetBase(new RGToolMaterialHatchet()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "diamond_hatchet"), new DiamondHatchetBase(new DiamondToolMaterialHatchet()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "netherite_hatchet"), new NetheriteHatchetBase(new NetheriteToolMaterialHatchet()));
        //Rose Gold Tools
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rg_shovel"), new RGShovelBase(new RGToolMaterialShovel()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rg_pickaxe"), new RGPickaxeBase(new RGToolMaterialPickaxe()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rg_axe"), new RGAxeBase(new RGToolMaterialAxe()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rg_hoe"), new RGHoeBase(new RGToolMaterialHoe()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rg_sword"), new RGSwordBase(new RGToolMaterialSword()));

        //Artifacts
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "royal_sword"), new RoyalSwordBase(new ToolMaterialSoldiersSpear()));
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "soldiers_spear"), new SoldiersSpearBase(new ToolMaterialSoldiersSpear()));
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "diamond_cutlass"), new DiamondCutlassBase(new DiamondToolMaterialCutlass()));
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rusty_sword"), new RustySwordBase(new ToolMaterialSoldiersSpear()));
    }
}
