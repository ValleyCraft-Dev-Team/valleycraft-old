package io.github.linkle.valleycraft.config;

import io.github.linkle.valleycraft.ValleyMain;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.annotation.ConfigEntry.Gui;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = ValleyMain.MOD_ID)
@Config.Gui.Background("valley:textures/blocks/brown_bricks.png")
public class VConfig implements ConfigData {

    @Comment("Disables fishing loots for valleycraft items")
    @ConfigEntry.Gui.CollapsibleObject
    public FishingConfig fishing = new FishingConfig();

    @Comment("Disables generation of features like stones, mud, sandstone, \nand biome-specific blobs, but not ores.")
    @ConfigEntry.Gui.CollapsibleObject
    public BlobsGenerations blobsGenerations = new BlobsGenerations();

    @Comment("Disables generate of features like plants, flowers, crops, and rocks.")
    @ConfigEntry.Gui.CollapsibleObject
    public FeatureGenerations featureGenerations = new FeatureGenerations();

    @Comment("Disables mob spawns")
    @ConfigEntry.Gui.CollapsibleObject
    public Mobs mobs = new Mobs();

    @Comment("Other miscellaneous options")
    @ConfigEntry.Gui.CollapsibleObject
    public Misc misc = new Misc();

    public static class BlobsGenerations implements ConfigData {
        @Gui.CollapsibleObject
        public OreConfig scaldingVolcanicStoneInJungle = new OreConfig(20, 15, 0, 64);
        @Gui.CollapsibleObject
        public OreConfig carmineStone = new OreConfig(20, 15, 0, 128);
        @Gui.CollapsibleObject
        public OreConfig mossyCarmineStone = new OreConfig(20, 15, 0, 128);
        @Gui.CollapsibleObject
        public OreConfig mudInJungle = new OreConfig(33, 3, 32, 128);
        @Gui.CollapsibleObject
        public OreConfig sporeyCarmineStone = new OreConfig(5, 15, 0, 128);
        @Gui.CollapsibleObject
        public OreConfig mossyStone = new OreConfig(33, 15, 0, 128);
        @Gui.CollapsibleObject
        public OreConfig mariniteStone = new OreConfig(33, 10, 0, 128);
        @Gui.CollapsibleObject
        public OreConfig greenGranite = new OreConfig(15, 5, 0, 50);
        @Gui.CollapsibleObject
        public OreConfig swampStone = new OreConfig(33, 20, 0, 128);
        @Gui.CollapsibleObject
        public OreConfig darkStone = new OreConfig(33, 15, 0, 128);
        @Gui.CollapsibleObject
        public OreConfig limestone = new OreConfig(15, 10, 0, 50);
        @Gui.CollapsibleObject
        public OreConfig pumice = new OreConfig(15, 10, 0, 50);
        @Gui.CollapsibleObject
        public OreConfig jasper = new OreConfig(15, 5, 0, 50);
        @Gui.CollapsibleObject
        public OreConfig undergroundSand = new OreConfig(33, 20, 0, 128);
        @Gui.CollapsibleObject
        public OreConfig undergroundSandstone = new OreConfig(33, 20, 0, 128);
        @Gui.CollapsibleObject
        public OreConfig dryMoss = new OreConfig(20, 10, 0, 64);
        @Gui.CollapsibleObject
        public OreConfig gravelInDeserts = new OreConfig(33, 20, 0, 128);
        @Gui.CollapsibleObject
        public OreConfig scaldingSandstone = new OreConfig(33, 15, 0, 64);
        @Gui.CollapsibleObject
        public OreConfig undergroundRedSand = new OreConfig(33, 20, 0, 128);
        @Gui.CollapsibleObject
        public OreConfig undergroundRedSandstone = new OreConfig(33, 20, 0, 128);
        @Gui.CollapsibleObject
        public OreConfig scaldingStone = new OreConfig(20, 8, 0, 32);
        @Gui.CollapsibleObject
        public OreConfig undergroundIce = new OreConfig(33, 20, 0, 128);
        @Gui.CollapsibleObject
        public OreConfig undergroundPackedIce = new OreConfig(16, 20, 0, 128);
        @Gui.CollapsibleObject
        public OreConfig undergroundSnow = new OreConfig(33, 20, 0, 128);
        @Gui.CollapsibleObject
        public OreConfig undergroundBlueIce = new OreConfig(16, 5, 0, 128);
        @Gui.CollapsibleObject
        public OreConfig undergroundPowderedSnow = new OreConfig(20, 15, 0, 128);
        @Gui.CollapsibleObject
        public OreConfig glacialStone = new OreConfig(5, 5, 0, 48);
        @Gui.CollapsibleObject
        public OreConfig saltOre = new OreConfig(6, 15, 0, 64);
        @Gui.CollapsibleObject
        public OreConfig mixedOre = new OreConfig(6, 10, 0, 32);
        @Gui.CollapsibleObject
        public OreConfig saltpeterOre = new OreConfig(6, 6, 0, 32);
        @Gui.CollapsibleObject
        public OreConfig mud = new OreConfig(33, 5, 32, 64);
        @Gui.CollapsibleObject
        public OreConfig volcanicAsh = new OreConfig(33, 10, 0, 128);
        @Gui.CollapsibleObject
        public OreConfig volcanicStone = new OreConfig(33, 20, 0, 128);
        @Gui.CollapsibleObject
        public OreConfig netherSaltOre = new OreConfig(12, 10, 0, 0, true, true);
        @Gui.CollapsibleObject
        public OreConfig netherCoalOre = new OreConfig(12, 10, 0, 0, true, true);
        @Gui.CollapsibleObject
        public OreConfig taigaStone = new OreConfig(33, 15, 0, 128);
    }

    public static class FeatureGenerations implements ConfigData {
        @ConfigEntry.Gui.CollapsibleObject
        public CaveFeatures caveFeatures = new CaveFeatures();

        @ConfigEntry.Gui.CollapsibleObject
        public OceanFeatures oceanFeatures = new OceanFeatures();

        @ConfigEntry.Gui.CollapsibleObject
        public NetherFeatures netherFeatures = new NetherFeatures();

        @ConfigEntry.Gui.CollapsibleObject
        public PlantFeatures plantFeatures = new PlantFeatures();

        @ConfigEntry.Gui.CollapsibleObject
        public Trees trees = new Trees();

        public static class CaveFeatures implements ConfigData {
            public boolean redstoneCrystalPatchEnabled = true;
            public boolean spiderSackPatchEnabled = true;
            public boolean glowKelpPatchEnabled = true;
            public boolean rocksPatchEnabled = true;
        }

        public static class NetherFeatures implements ConfigData {
            public boolean soulSporecapPatchEnabled = true;
            public boolean rootedWatcherPatchEnabled = true;
            public boolean taintedWartPatchEnabled = true;
        }

        public static class OceanFeatures implements ConfigData {
            public boolean redSeaGrassPatchEnabled = true;
            public boolean clamPatchEnabled = true;
            public boolean sandDollarPatchEnabled = true;
            public boolean starfishPatchEnabled = true;
        }

        public static class PlantFeatures implements ConfigData {
            @Gui.CollapsibleObject
            public PlantConfig wheatPatch = new PlantConfig(1, 1);
            @Gui.CollapsibleObject
            public PlantConfig carrotPatch = new PlantConfig(1, 1);
            @Gui.CollapsibleObject
            public PlantConfig beetPatch = new PlantConfig(1, 1);
            @Gui.CollapsibleObject
            public PlantConfig potatoPatch = new PlantConfig(1, 1);
            @Gui.CollapsibleObject
            public PlantConfig willowPatch = new PlantConfig(2, 1);
            @Gui.CollapsibleObject
            public PlantConfig ribbonPatch = new PlantConfig(12, 1);
            @Gui.CollapsibleObject
            public PlantConfig orangeFernPatch = new PlantConfig(5, 1);
            @Gui.CollapsibleObject
            public PlantConfig orangeBeautyPatch = new PlantConfig(2, 1);
            @Gui.CollapsibleObject
            public PlantConfig dahliaPatch = new PlantConfig(8, 1);
            @Gui.CollapsibleObject
            public PlantConfig lavenderPatch = new PlantConfig(8, 1);
            @Gui.CollapsibleObject
            public PlantConfig sorrelPatch = new PlantConfig(5, 1);
            @Gui.CollapsibleObject
            public PlantConfig dandelionPatch = new PlantConfig(2, 1);
            @Gui.CollapsibleObject
            public PlantConfig herbPatch = new PlantConfig(1, 1);
            @Gui.CollapsibleObject
            public PlantConfig taprootPatch = new PlantConfig(1, 1);
            @Gui.CollapsibleObject
            public PlantConfig crocusPatch = new PlantConfig(3, 1);
            @Gui.CollapsibleObject
            public PlantConfig hollyPatch = new PlantConfig(1, 1);
            @Gui.CollapsibleObject
            public PlantConfig morelPatch = new PlantConfig(3, 1);
            @Gui.CollapsibleObject
            public PlantConfig bushPatch = new PlantConfig(7, 1);
            @Gui.CollapsibleObject
            public PlantConfig sproutPatch = new PlantConfig(3, 1);
            @Gui.CollapsibleObject
            public PlantConfig boxwoodPatch = new PlantConfig(7, 1);
            @Gui.CollapsibleObject
            public PlantConfig jungleCapPatch = new PlantConfig(1, 1);
            @Gui.CollapsibleObject
            public PlantConfig panPatch = new PlantConfig(1, 1);
            @Gui.CollapsibleObject
            public PlantConfig swampBushPatch = new PlantConfig(7, 1);
            @Gui.CollapsibleObject
            public PlantConfig rockPatch = new PlantConfig(8, 1);
            @Gui.CollapsibleObject
            public PlantConfig snowPatch = new PlantConfig(10, 1);
            @Gui.CollapsibleObject
            public PlantConfig snowRockPatch = new PlantConfig(0, 1);
            @Gui.CollapsibleObject
            public PlantConfig rosePatch = new PlantConfig(1, 1);
            @Gui.CollapsibleObject
            public PlantConfig honeyClusterPatch = new PlantConfig(2, 1);
            @Gui.CollapsibleObject
            public PlantConfig lilacPatch = new PlantConfig(1, 1);
            @Gui.CollapsibleObject
            public PlantConfig peonyPatch = new PlantConfig(1, 1);
            @Gui.CollapsibleObject
            public PlantConfig tumblePatch = new PlantConfig(1, 1);
            @Gui.CollapsibleObject
            public PlantConfig floweringCactusPatch = new PlantConfig(3, 1);
            @Gui.CollapsibleObject
            public PlantConfig cactusPatch = new PlantConfig(2, 1);
            @Gui.CollapsibleObject
            public PlantConfig alivePatch = new PlantConfig(10, 1);
            @Gui.CollapsibleObject
            public PlantConfig bitterPatch = new PlantConfig(2, 1);
            @Gui.CollapsibleObject
            public PlantConfig tomatoPatch = new PlantConfig(1, 1);
            @Gui.CollapsibleObject
            public PlantConfig sourPatch = new PlantConfig(2, 1);
            @Gui.CollapsibleObject
            public PlantConfig reedPatch = new PlantConfig(0, 1);
        }

        public static class Trees implements ConfigData {
            public boolean appleTreeEnabled = true;
        }
    }

    public static class Mobs implements ConfigData {
        @ConfigEntry.Gui.CollapsibleObject
        public EntityConfig bear = new EntityConfig(5, 1, 2);

        @ConfigEntry.Gui.CollapsibleObject
        public EntityConfig duck = new EntityConfig(7, 3, 4);

        @ConfigEntry.Gui.CollapsibleObject
        public EntityConfig fireEel = new EntityConfig(6, 1, 2);

        @ConfigEntry.Gui.CollapsibleObject
        public EntityConfig perch = new EntityConfig(6, 3, 6);

        @ConfigEntry.Gui.CollapsibleObject
        public EntityConfig minnow = new EntityConfig(6, 3, 6);

        @ConfigEntry.Gui.CollapsibleObject
        public EntityConfig sardine = new EntityConfig(6, 3, 6);

        @ConfigEntry.Gui.CollapsibleObject
        public EntityConfig red_porgy = new EntityConfig(6, 3, 6);
    }

    public static class Misc implements ConfigData {
        @Comment("Disables food's special status effects when eaten")
        public boolean foodEffectsEnabled = true;
        @Comment("Disables Cave Spider Egg's web cluster cover around the egg")
        public boolean spiderEggWebGenEnabled = true;
    }
}