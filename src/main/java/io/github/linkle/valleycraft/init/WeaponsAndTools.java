package io.github.linkle.valleycraft.init;

import io.github.linkle.valleycraft.items.OneOffs.*;
import io.github.linkle.valleycraft.items.hatchets.*;
import io.github.linkle.valleycraft.items.knives.*;
import io.github.linkle.valleycraft.items.roseGold.*;
import io.github.linkle.valleycraft.items.sickles.*;
import io.github.linkle.valleycraft.utils.Util;
import net.minecraft.item.Item;

import static io.github.linkle.valleycraft.utils.Util.register;

public class WeaponsAndTools {

    public static final Item TONGS = new TongsBase(new TongsToolMaterial());

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

        //Druid Staff
        Util.register("druid_staff", new DruidStaffBase(new DruidToolMaterialStaff()));

        //Knives
        register("wood_knife", new KnifeBase(new WoodToolMaterialKnife(), 2, -2.2f));
        register("stone_knife", new KnifeBase(new StoneToolMaterialKnife(), 2, -2.0f));
        register("golden_knife", new KnifeBase(new GoldenToolMaterialKnife(), 2, -2.2f));
        register("iron_knife", new KnifeBase(new IronToolMaterialKnife(), 3, -2.0f));
        register("rg_knife", new KnifeBase(new RoseGoldToolMaterialKnife(), 3, -2.0f));
        register("diamond_knife", new KnifeBase(new DiamondToolMaterialKnife(), 4, -2.0f));
        register("netherite_knife", new KnifeBase(new NetheriteToolMaterialKnife(), 5, -2.0f));
        //Sickles
        Util.register("wood_sickle", new SickleBase(new WoodToolMaterialSickle(), 2, -3.4f));
        Util.register("stone_sickle", new SickleBase(new StoneToolMaterialSickle(), 2, -3.3f));
        Util.register("golden_sickle", new SickleBase(new GoldenToolMaterialSickle(), 2, -3.4f));
        Util.register("iron_sickle", new SickleBase(new IronToolMaterialSickle(), 2, -3.2f));
        Util.register("rg_sickle", new SickleBase(new RoseGoldToolMaterialSickle(), 2, -3.2f));
        Util.register("diamond_sickle", new SickleBase(new DiamondToolMaterialSickle(), 2, -3.1f));
        Util.register("netherite_sickle", new SickleBase(new NetheriteToolMaterialSickle(), 3, -3.0f));
        //Hatchets
        Util.register("wood_hatchet", new HatchetBase(new WoodToolMaterialHatchet(), 5, -2.6f));
        Util.register("stone_hatchet", new HatchetBase(new StoneToolMaterialHatchet(), 7, -2.6f));
        Util.register("golden_hatchet", new HatchetBase(new GoldenToolMaterialHatchet(), 5, -2.4f));
        Util.register("iron_hatchet", new HatchetBase(new IronToolMaterialHatchet(), 7, -2.5f));
        Util.register("rg_hatchet", new HatchetBase(new RoseGoldToolMaterialHatchet(), 7, -2.5f));
        Util.register("diamond_hatchet", new HatchetBase(new DiamondToolMaterialHatchet(), 7, -2.4f));
        Util.register("netherite_hatchet", new HatchetBase(new NetheriteToolMaterialHatchet(), 8, -2.4f));
        //Rose Gold Tools
        register("rg_shovel", new RGShovelBase(new RoseGoldToolMaterialShovel()));
        register("rg_pickaxe", new RGPickaxeBase(new RoseGoldToolMaterialPickaxe()));
        register("rg_axe", new RGAxeBase(new RoseGoldToolMaterialAxe()));
        register("rg_hoe", new RGHoeBase(new RoseGoldToolMaterialHoe()));
        register("rg_sword", new RGSwordBase(new RoseGoldToolMaterialSword()));
    }
}
