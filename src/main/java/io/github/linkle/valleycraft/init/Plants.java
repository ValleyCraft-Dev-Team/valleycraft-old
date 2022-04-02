package io.github.linkle.valleycraft.init;

import static io.github.linkle.valleycraft.init.ItemGroups.COOKING_GROUP;
import static io.github.linkle.valleycraft.init.ItemGroups.NATURE_GROUP;

import io.github.linkle.valleycraft.blocks.cave.CrystalBlock;
import io.github.linkle.valleycraft.blocks.cave.SpiderEggBlock;
import io.github.linkle.valleycraft.blocks.crops.MaizeCropBlock;
import io.github.linkle.valleycraft.blocks.crops.RiceCropBlock;
import io.github.linkle.valleycraft.blocks.plants.CactusBlock;
import io.github.linkle.valleycraft.blocks.plants.MushBlock;
import io.github.linkle.valleycraft.blocks.plants.ReedBlock;
import io.github.linkle.valleycraft.blocks.plants.RockBlock;
import io.github.linkle.valleycraft.blocks.plants.SaplingBlock;
import io.github.linkle.valleycraft.blocks.plants.SmallCactusBlock;
import io.github.linkle.valleycraft.blocks.plants.Decorative.Plant;
import io.github.linkle.valleycraft.blocks.plants.Decorative.RoseBushGlow;
import io.github.linkle.valleycraft.blocks.plants.Decorative.RoseBushTall;
import io.github.linkle.valleycraft.blocks.plants.Decorative.SnowBush;
import io.github.linkle.valleycraft.blocks.plants.Decorative.VinesBlock;
import io.github.linkle.valleycraft.blocks.plants.Decorative.VinesPlantBlock;
import io.github.linkle.valleycraft.blocks.plants.bushes.BerryBushBlock;
import io.github.linkle.valleycraft.blocks.plants.bushes.HedgeBushBlock;
import io.github.linkle.valleycraft.blocks.plants.bushes.JungleBushBlock;
import io.github.linkle.valleycraft.blocks.plants.bushes.TumbleWeedBlock;
import io.github.linkle.valleycraft.blocks.plants.nether.CrimsonBiomePlant;
import io.github.linkle.valleycraft.blocks.plants.nether.NetherWastesBiomePlant;
import io.github.linkle.valleycraft.blocks.plants.nether.SoulSandValleyBiomePlant;
import io.github.linkle.valleycraft.blocks.sapling.AppleSaplingGen;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CarpetBlock;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.block.MossBlock;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class Plants {

    public static final Block TUMBLE_WEED = new TumbleWeedBlock(FabricBlockSettings.of(Material.LEAVES).nonOpaque()
            .sounds(BlockSoundGroup.GRASS)
            .strength(0.4f,0.1f));

    public static final Block SMALL_ROSE_BUSH = new Plant();
    public static final Block SMALL_LILAC = new Plant();
    public static final Block SMALL_PEONY = new Plant();
    public static final Block COMMON_BUSH = new Plant();
    public static final Block MOREL = new MushBlock();
    public static final Block WILD_HERBS = new Plant();

    public static final Block BOXWOOD_BUSH = new HedgeBushBlock(FabricBlockSettings.of(Material.LEAVES).nonOpaque()
            .sounds(BlockSoundGroup.GRASS)
            .strength(0,0.1f));

    public static final Block SMALL_CACTUS = new CactusBlock();
    public static final Block FLOWERING_CACTUS = new SmallCactusBlock();

    public static final Block CATTAILS = new ReedBlock(FabricBlockSettings.of(Material.UNDERWATER_PLANT).nonOpaque()
            .sounds(BlockSoundGroup.GRASS)
            .strength(0,0.1f));

    public static final Block WILD_CARROT = new Plant();
    public static final Block WILD_POTATO = new Plant();
    public static final Block WILD_BEETROOT = new Plant();
    public static final Block WILD_WHEAT = new Plant();
    public static final Block MATURE_DANDELIONS = new Plant();
    public static final Block REDWOOD_SORREL = new Plant();
    public static final Block WEEPING_JUNGLE_WILLOW = new RoseBushGlow();
    public static final Block CROCUS = new Plant();
    public static final Block WILD_TAPROOTS = new Plant();

    public static final Block SCRAGGLY_BUSH = new RoseBushTall();
    public static final Block SNOWY_BUSH = new SnowBush();

    public static final Block DRY_MOSS_CARPET = new CarpetBlock(Block.Settings.of(Material.PLANT, MapColor.YELLOW).strength(0.1f).sounds(BlockSoundGroup.MOSS_CARPET));
    public static final Block DRY_MOSS = new MossBlock(Block.Settings.of(Material.MOSS_BLOCK, MapColor.YELLOW).strength(0.1f).sounds(BlockSoundGroup.MOSS_BLOCK));

    public static final Block ROCKS = new RockBlock();
    public static final Block CRYSTALLIZED_REDSTONE = new CrystalBlock(FabricBlockSettings.of(Material.AMETHYST)
            .nonOpaque().requiresTool().sounds(BlockSoundGroup.AMETHYST_CLUSTER)
            .strength(1.5f,2.0f).luminance(7), true, UniformIntProvider.create(2, 5));

    public static final Block SNOWY_ROCKS = new RockBlock();

    // Mossy vines
    public static final VinesBlock MOSS_VINES = new VinesBlock(
            FabricBlockSettings.of(Material.PLANT, MapColor.GREEN)
            .ticksRandomly()
            .noCollision()
            .breakInstantly()
            .sounds(BlockSoundGroup.WEEPING_VINES));
    public static final VinesPlantBlock MOSS_VINES_PLANT = new VinesPlantBlock(
            FabricBlockSettings.of(Material.PLANT, MapColor.GREEN)
            .noCollision()
            .breakInstantly()
            .sounds(BlockSoundGroup.WEEPING_VINES));

    // Dry vines
    public static final VinesBlock DRY_VINES = new VinesBlock(
            FabricBlockSettings.of(Material.PLANT, MapColor.YELLOW)
            .ticksRandomly()
            .noCollision()
            .breakInstantly()
            .sounds(BlockSoundGroup.WEEPING_VINES), Block.createCuboidShape(2, 9, 2, 14, 16, 14));
    public static final VinesPlantBlock DRY_VINES_PLANT = new VinesPlantBlock(
            FabricBlockSettings.of(Material.PLANT, MapColor.YELLOW)
            .noCollision()
            .breakInstantly()
            .sounds(BlockSoundGroup.WEEPING_VINES));

    public static final Block BLUE_POPPY_BUSH = new JungleBushBlock(FabricBlockSettings.of(Material.LEAVES).nonOpaque()
            .sounds(BlockSoundGroup.GRASS)
            .strength(0,0.1f));

    public static final Block VERDANT_BUSH = new Plant();
    public static final Block ORANGE_GILLED_WAXING_CAP = new MushBlock();
    public static final Block SPROUT = new Plant();

    public static final Block POND_RIBBONS = new Plant();
    public static final Block BLACK_DAHLIA = new Plant();
    public static final Block LAVENDER = new Plant();
    public static final Block SPRING_OF_LAVENDER = new Plant();
    public static final Block ROSE = new Plant();
    public static final Block FROZEN_ROSE = new Plant();
    public static final Block ORANGE_FERN = new Plant();
    public static final Block ORANGE_BEAUTY = new Plant();

    public static final SaplingBlock APPLE_SAPLING = new SaplingBlock(new AppleSaplingGen());
    public static final Block FRUIT_BEARING_APPLE_LEAVES = new LeavesBlock(Settings.copy(Blocks.OAK_LEAVES));
    public static final Block APPLE_LEAVES = new LeavesBlock(Settings.copy(Blocks.OAK_LEAVES));

    public static final Block CAVE_SPIDER_EGG = new SpiderEggBlock(FabricBlockSettings.of(Material.CACTUS, MapColor.LIGHT_GRAY)
            .nonOpaque()
            .sounds(BlockSoundGroup.WOOL).breakInstantly()
            .strength(0.0f,0.1f).ticksRandomly());

    public static final Block PANFLOWERS = new Plant();
    public static final Block HONEY_CLUSTER = new Plant();

    public static final Block ROOTED_WATCHER = new CrimsonBiomePlant();
    public static final Block SOUL_SPORECAP = new SoulSandValleyBiomePlant();
    public static final Block TAINTED_NETHER_WART = new NetherWastesBiomePlant();

    public static void initialize() {
        var natureGroup = new Item.Settings().group(NATURE_GROUP);

        Reg.registerWithItem("small_cactus", SMALL_CACTUS, natureGroup);
        Reg.registerWithItem("flowering_cactus", FLOWERING_CACTUS, natureGroup);
        Reg.registerWithItem("tumbleweed", TUMBLE_WEED, natureGroup);
        //bushes
        Reg.registerWithItem("small_rose_bush", SMALL_ROSE_BUSH, natureGroup);
        Reg.registerWithItem("small_lilac", SMALL_LILAC, natureGroup);
        Reg.registerWithItem("small_peony", SMALL_PEONY, natureGroup);
        Reg.registerWithItem("common_bush", COMMON_BUSH, natureGroup);
        Reg.registerWithItem("scraggly_bush", SCRAGGLY_BUSH, natureGroup);
        Reg.registerWithItem("wild_herbs", WILD_HERBS, new Item.Settings().group(NATURE_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.5f).build()).maxCount(64));
        Reg.registerWithItem("wild_taproots", WILD_TAPROOTS, new Item.Settings().group(NATURE_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.5f).build()).maxCount(64));

        Reg.registerWithItem("weeping_jungle_willow", WEEPING_JUNGLE_WILLOW, natureGroup);
        Reg.registerWithItem("pond_ribbons", POND_RIBBONS, natureGroup);

        Reg.registerWithItem("redwood_sorrel", REDWOOD_SORREL, natureGroup);
        Reg.registerWithItem("crocus", CROCUS, natureGroup);

        Reg.registerWithItem("mature_dandelions", MATURE_DANDELIONS, natureGroup);
        Reg.registerWithItem("lavender", LAVENDER, natureGroup);
        Reg.registerWithItem("spring_of_lavender", SPRING_OF_LAVENDER, natureGroup);
        Reg.registerWithItem("rose", ROSE, natureGroup);
        Reg.registerWithItem("black_dahlia", BLACK_DAHLIA, natureGroup);
        Reg.registerWithItem("frozen_rose", FROZEN_ROSE, natureGroup);
        Reg.registerWithItem("orange_beauty", ORANGE_BEAUTY, natureGroup);

        Reg.registerWithItem("panflowers", PANFLOWERS, natureGroup);
        Reg.registerWithItem("honey_cluster", HONEY_CLUSTER, natureGroup);

        Reg.registerWithItem("orange_gilled_waxing_cap", ORANGE_GILLED_WAXING_CAP, natureGroup);

        Reg.registerWithItem("orange_fern", ORANGE_FERN, natureGroup);

        Reg.registerWithItem("sprout", SPROUT, natureGroup);

        Reg.registerWithItem("wild_carrot", WILD_CARROT, natureGroup);
        Reg.registerWithItem("wild_potato", WILD_POTATO, natureGroup);
        Reg.registerWithItem("wild_beetroot", WILD_BEETROOT, natureGroup);
        Reg.registerWithItem("wild_wheat", WILD_WHEAT, natureGroup);
        Reg.registerWithItem("morel", MOREL, natureGroup);

        Reg.registerWithItem("cattails", CATTAILS, natureGroup);

        Reg.registerWithItem("rocks", ROCKS, natureGroup);
        Reg.registerWithItem("snowy_rocks", SNOWY_ROCKS, natureGroup);
        Reg.registerWithItem("crystallized_redstone", CRYSTALLIZED_REDSTONE, natureGroup);
        Reg.registerWithItem("snowy_bush", SNOWY_BUSH, natureGroup);

        MOSS_VINES.setPlant(MOSS_VINES_PLANT);
        MOSS_VINES_PLANT.setStem(MOSS_VINES);
        Reg.registerWithItem("moss_vines", MOSS_VINES, natureGroup);
        Reg.register("moss_vines_plant", MOSS_VINES_PLANT);

        DRY_VINES.setPlant(DRY_VINES_PLANT);
        DRY_VINES_PLANT.setStem(DRY_VINES);
        Reg.registerWithItem("dry_vines", DRY_VINES, natureGroup);
        Reg.register("dry_vines_plant", DRY_VINES_PLANT);

        Reg.registerWithItem("dry_moss_carpet", DRY_MOSS_CARPET, natureGroup);
        Reg.registerWithItem("dry_moss", DRY_MOSS, natureGroup);

        Reg.registerWithItem("blue_poppy_bush", BLUE_POPPY_BUSH, natureGroup);
        Reg.registerWithItem("verdant_bush", VERDANT_BUSH, natureGroup);
        Reg.registerWithItem("boxwood_bush", BOXWOOD_BUSH, natureGroup);

        Reg.registerWithItem("apple_sapling", APPLE_SAPLING, natureGroup);
        Reg.registerWithItem("fruit_bearing_apple_leaves", FRUIT_BEARING_APPLE_LEAVES, natureGroup);
        Reg.registerWithItem("apple_leaves", APPLE_LEAVES, natureGroup);

        Reg.registerWithItem("cave_spider_egg", CAVE_SPIDER_EGG, natureGroup);

        Reg.registerWithItem("rooted_watcher", ROOTED_WATCHER, natureGroup);
        Reg.registerWithItem("tainted_nether_wart", TAINTED_NETHER_WART, natureGroup);
        Reg.registerWithItem("soul_sporecap", SOUL_SPORECAP, natureGroup);
    }
}
