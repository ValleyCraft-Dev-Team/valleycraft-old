package io.github.linkle.valleycraft.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = "valleycraft")
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
		public boolean generateScaldingVolcanicStoneInJungle = true;
		public boolean generateCarmineStone = true;
		public boolean generateMossyCarmineStone = true;
		public boolean generateMudInJungle = true;
		public boolean generateSporeyCarmineStone = true;
		public boolean generateMossyStone = true;
		public boolean generateOceanStone = true;
		public boolean generateGreenGranite = true;
		public boolean generateSwampStone = true;
		public boolean generateDarkStone = true;
		public boolean generateLimestone = true;
		public boolean generatePumice = true;
		public boolean generateJasper = true;
		public boolean generateUndergroundSand = true;
		public boolean generateUndergroundSandstone = true;
		public boolean generateDryMoss = true;
		public boolean generateGravelInDeserts = true;
		public boolean generateScaldingSandstone = true;
		public boolean generateUndergroundRedSand = true;
		public boolean generateUndergroundRedSandstone = true;
		public boolean generateScaldingStone = true;
		public boolean generateUndergroundIce = true;
		public boolean generateUndergroundPackedIce = true;
		public boolean generateUndergroundSnow = true;
		public boolean generateUndergroundBlueIce = true;
		public boolean generateUndergroundPowderedSnow = true;
		public boolean generateGlacialStone = true;
		public boolean generateSaltOre = true;
		public boolean generateMixedOre = true;
		public boolean generateSaltpeterOre = true;
		public boolean generateMud = true;
		public boolean generateVolcanicAsh = true;
		public boolean generateVolcanicStone = true;
		public boolean generateNetherSaltOre = true;
		public boolean generateNetherCoalOre = true;
		public boolean generateTaigaStone = true;
	}

	public static class FeatureGenerations implements ConfigData {
		@ConfigEntry.Gui.CollapsibleObject
		public CaveFeatures caveFeatures = new CaveFeatures();

		@ConfigEntry.Gui.CollapsibleObject
		public OceanFeatures oceanFeatures = new OceanFeatures();

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

		public static class OceanFeatures implements ConfigData {
			public boolean redSeaGrassPatchEnabled = true;
			public boolean clamPatchEnabled = true;
			public boolean sandDollarPatchEnabled = true;
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
	    public boolean bearSpawnEnabled = true;
	    public boolean duckSpawnEnabled = true;
	}
	
	public static class Misc implements ConfigData {
	    @Comment("Disables food's special status effects when eaten")
        public boolean foodEffectsEnabled = true;
	    @Comment("Disables Cave Spider Egg's web cluster cover around the egg")
        public boolean spiderEggWebGenEnabled = true;
    }
}