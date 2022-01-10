package io.github.linkle.valleycraft;

import io.github.linkle.valleycraft.blocks.entity.BlockEntities;
import io.github.linkle.valleycraft.config.VConfig;
import io.github.linkle.valleycraft.criterions.VCriteria;
import io.github.linkle.valleycraft.init.*;
import io.github.linkle.valleycraft.init.features.*;
import io.github.linkle.valleycraft.network.ServerNetwork;
import io.github.linkle.valleycraft.screen.Screens;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ValleyMain implements ModInitializer {

    public static final String MOD_ID = "valley";
    public static final Logger LOGGER = LogManager.getLogger("ValleyCraft");

    public static VConfig CONFIG;

    @Override
    @SuppressWarnings("unused")
    public void onInitialize() {
        AutoConfig.register(VConfig.class, JanksonConfigSerializer::new);
        CONFIG = AutoConfig.getConfigHolder(VConfig.class).getConfig();

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
        BlockEntities.ints();
        PotBlock.initialize();
        
        // Misc Initializers (Recommended put it after the blocks and items initializers)
        Screens.initialize();
        VLootTables.initialize();
        Sounds.initialize();
        Compostables.initialize();
        Entities.initialize();
        WanderingTraderOffers.initialize();
        CrabTrapBaits.initialize();
        ServerNetwork.initialize();
        WanderingTraderOffers.initialize();
        Structures.initialize();
        
        //Configured Feature Initializers
        OreFeatures.initialize();
        PlantFeatures.initialize();
        CaveFeatures.initialize();
        NetherFeatures.initialize();
        OceanFeatures.initialize();
        Trees.initialize();

        //Future Updates ;)
        //NetherPlantConfiguredFeatures.initialize();
        //CavePlantConfiguredFeatures.initialize();
        //WaterPlantConfiguredFeatures.initialize();

        //Tells you if this shit actually worked
        LOGGER.info("The main mod initialization sections loaded fine somehow.");
    }
}