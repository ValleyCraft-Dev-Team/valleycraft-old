package net.linkle.valley;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.fabricmc.api.ModInitializer;
import net.linkle.valley.Registry.Blocks.Decorations.Furnaces.Furnaces;
import net.linkle.valley.Registry.Criterion.VCriteria;
import net.linkle.valley.Registry.Initializers.*;
import net.linkle.valley.Registry.Initializers.ConfiguredFeatures.*;

public class ValleyMain implements ModInitializer {

    public static final String MOD_ID = "valley";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        // This should stay first before items and blocks.
        Object initializer1 = VItemTags.KNIVES; // will force the class to load (any static member will do)
        Object initializer2 = VCriteria.BROKE_BLOCK;

        //Item Initializers
        FoodAndCooking.initialize();
        Fishing.initialize();
        ItemGroups.initialize();
        WeaponsAndTools.initialize();
        MiscItems.initialize();
        Armors.initialize();

        //Block Initializers
        Furniture.initialize();
        FurnitureCont.initialize();
        Plants.initialize();
        Aquatic.initialize();
        Crops.initialize();
        StoneBlocks.initialize();
        Furnaces.ints();
        PotBlock.initialize();
        
        // Misc Initializers (Recommended put it after the blocks and items initializers)
        VLootTables.initialize();
        Sounds.initialize();
        Compostables.initialize();
        Entities.initialize();

        //Configured Feature Initializers
        OreConfiguredFeatures.initialize();
        OverworldPlantConfiguredFeatures.initialize();
        CaveFeatures.initialize();
        OceanFeatures.initialize();
        Trees.ints();

        //Future Updates ;)
        //NetherPlantConfiguredFeatures.initialize();
        //CavePlantConfiguredFeatures.initialize();
        //WaterPlantConfiguredFeatures.initialize();

        //Tells you if this shit actually worked
        System.out.println("The main mod initialization sections loaded fine somehow.");
    }
}