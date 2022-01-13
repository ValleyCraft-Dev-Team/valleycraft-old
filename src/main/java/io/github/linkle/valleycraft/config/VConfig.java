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
	public Fishing fishing = new Fishing();

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

	public static class Fishing implements ConfigData {
		public boolean fishingLootEnabled = true;
	}

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
		public OreConfig oceanStone = new OreConfig(33, 10, 0, 128);
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
			public boolean wheatPatchEnabled = true;
			public boolean carrotPatchEnabled = true;
			public boolean beetPatchEnabled = true;
			public boolean potatoPatchEnabled = true;
			public boolean willowPatchEnabled = true;
			public boolean ribbonPatchEnabled = true;
			public boolean orangeFernPatchEnabled = true;
			public boolean orangeBeautyPatchEnabled = true;
			public boolean dahliaPatchEnabled = true;
			public boolean lavenderPatchEnabled = true;
			public boolean sorrelPatchEnabled = true;
			public boolean dandelionPatchEnabled = true;
			public boolean herbPatchEnabled = true;
			public boolean taprootPatchEnabled = true;
			public boolean crocusPatchEnabled = true;
			public boolean hollyPatchEnabled = true;
			public boolean morelPatchEnabled = true;
			public boolean bushPatchEnabled = true;
			public boolean sproutPatchEnabled = true;
			public boolean jungleCapPatchEnabled = true;
			public boolean panPatchEnabled = true;
			public boolean swampBushPatchEnabled = true;
			public boolean rockPatchEnabled = true;
			public boolean snowPatchEnabled = true;
			public boolean snowRockPatchEnabled = true;
			public boolean rosePatchEnabled = true;
			public boolean honeyClusterPatchEnabled = true;
			public boolean lilacPatchEnabled = true;
			public boolean peonyPatchEnabled = true;
			public boolean tumblePatchEnabled = true;
			public boolean floweringCactusPatchEnabled = true;
			public boolean cactusPatchEnabled = true;
			public boolean alivePatchEnabled = true;
			public boolean bitterPatchEnabled = true;
			public boolean tomatoPatchEnabled = true;
			public boolean sourPatchEnabled = true;
			public boolean reedPatchEnabled = true;
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