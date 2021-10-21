package net.linkle.valley;

import net.fabricmc.api.ModInitializer;
import net.linkle.valley.Registry.Blocks.Decorations.Furnaces.Furnaces;
import net.linkle.valley.Registry.Initializers.*;
import net.linkle.valley.Registry.Initializers.ConfiguredFeatures.OreConfiguredFeatures;
import net.linkle.valley.Registry.Initializers.ConfiguredFeatures.OverworldPlantConfiguredFeatures;
import net.linkle.valley.Registry.Initializers.ConfiguredFeatures.Trees;

public class ValleyMain implements ModInitializer {

    public static final String MOD_ID = "valley";

    @Override
    public void onInitialize() {

        //Item Initializers
        FoodAndCooking.initialize();
        ItemGroups.initialize();
        WeaponsAndTools.initialize();
        MiscItems.initialize();


        //Block Initializers
        Furniture.initialize();
        FurnitureCont.initialize();
        Blocks.initialize();
        Crops.initialize();
        BlocksCont.initialize();
        Furnaces.ints();
        PotBlock.initialize();
        
        // Misc Initializers (Recommended put it after the blocks and items initializers)
        Compostables.initialize();

        //Configured Feature Initializers
        OreConfiguredFeatures.initialize();
        OverworldPlantConfiguredFeatures.initialize();
        Trees.ints();

        //Future Updates ;)
        //NetherPlantConfiguredFeatures.initialize();
        //CavePlantConfiguredFeatures.initialize();
        //WaterPlantConfiguredFeatures.initialize();

        //Tells you if this shit actually worked
        System.out.println("The main mod initialization sections loaded fine somehow.");
    }
}