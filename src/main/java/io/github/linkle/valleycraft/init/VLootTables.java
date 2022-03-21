package io.github.linkle.valleycraft.init;

import static io.github.linkle.valleycraft.ValleyMain.CONFIG;

import io.github.linkle.valleycraft.ValleyMain;
import io.github.linkle.valleycraft.utils.loot.LootBuilder;
import io.github.linkle.valleycraft.utils.loot.LootTableHelper;
import io.github.linkle.valleycraft.utils.loot.LootUtils;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.condition.MatchToolLootCondition;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.EmptyEntry;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.LootingEnchantLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class VLootTables {

    public static final Identifier BAITING = register("crabtrap/baiting");

    public static void initialize() {
        blocks();
        entities();
        chests();

        //If the config has fishing enabled...
        if (CONFIG.fishing.enabled) {
            //... inject our fish and junk into the respective vanilla loot tables
            LootTableHelper.injectLoot(LootTables.FISHING_FISH_GAMEPLAY, VLootTables::fishingFishLoot);
            LootTableHelper.injectLoot(LootTables.FISHING_JUNK_GAMEPLAY, VLootTables::fishingJunkLoot);
        }
    }

    private static void fishingFishLoot(FabricLootPoolBuilder pool) {
        pool.with(ItemEntry.builder(Fishing.CRAB).weight(20));
        pool.with(ItemEntry.builder(Fishing.MASKING_CRAB).weight(10));
        pool.with(ItemEntry.builder(Fishing.LOBSTER).weight(20));
        pool.with(ItemEntry.builder(Fishing.MUSSEL).weight(13));
        pool.with(ItemEntry.builder(Fishing.BROWN_MUSSEL).weight(13));
        pool.with(ItemEntry.builder(Fishing.CERITH_SNAIL).weight(13));
        pool.with(ItemEntry.builder(Fishing.MARLIN_SPIKE).weight(13));
        pool.with(ItemEntry.builder(MiscItems.SQUID_SUCKER).weight(4));
        pool.with(ItemEntry.builder(Aquatic.CLAM).weight(24));
        pool.with(ItemEntry.builder(Fishing.SARDINE).weight(43));
        pool.with(ItemEntry.builder(Fishing.LIONFISH).weight(6));
        pool.with(ItemEntry.builder(Fishing.SLIMEFISH).weight(20));
        pool.with(ItemEntry.builder(Fishing.PERCH).weight(40));
        pool.with(ItemEntry.builder(Aquatic.SAND_DOLLAR).weight(10));
        pool.with(ItemEntry.builder(Aquatic.STARFISH_ORANGE).weight(10));
        pool.with(ItemEntry.builder(Fishing.FIRE_EEL).weight(7));
        pool.with(ItemEntry.builder(Fishing.OCTO).weight(9));
        pool.with(ItemEntry.builder(Fishing.GLISTERING_ANGLER).weight(3));
        pool.with(ItemEntry.builder(Fishing.GHOST_FISH).weight(5));
        pool.with(ItemEntry.builder(Fishing.PRIDEFIN).weight(5));
        pool.with(ItemEntry.builder(Fishing.WRASSE).weight(5));
        pool.with(ItemEntry.builder(Fishing.FROG_FISH).weight(7));
        pool.with(ItemEntry.builder(Aquatic.SEA_URCHIN).weight(13));
        pool.with(ItemEntry.builder(Fishing.MARLIN_SPIKE).weight(10));
        pool.with(ItemEntry.builder(Fishing.STONEROLLER).weight(43));
        pool.with(ItemEntry.builder(Fishing.ABYSS_WATCHER).weight(15));
        pool.with(ItemEntry.builder(Fishing.BONEFIN).weight(13));
        pool.with(ItemEntry.builder(MiscItems.SEA_EYE).weight(2));
        pool.with(ItemEntry.builder(MiscItems.MESSAGE_BOTTLE).weight(5));
    }

    private static void fishingJunkLoot(FabricLootPoolBuilder pool) {
        pool.with(ItemEntry.builder(Aquatic.RED_SEA_GRASS).weight(17));
        pool.with(ItemEntry.builder(Aquatic.GLOW_KELP).weight(10));
        pool.with(ItemEntry.builder(Items.BONE).weight(4));
        pool.with(ItemEntry.builder(Items.SKELETON_SKULL).weight(1));
    }

    private static void entities() {
        LootBuilder builder = LootBuilder.create();
        builder.rolls(1).with(ItemEntry.builder(MiscItems.SQUID_SUCKER)
                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 2)))
                .apply(LootingEnchantLootFunction.builder(UniformLootNumberProvider.create(0, 1)))
                );

        LootTableHelper.appendLoot(EntityType.SQUID.getLootTableId(), builder);
        LootTableHelper.appendLoot(EntityType.GLOW_SQUID.getLootTableId(), builder);

        LootTableHelper.appendLoot(EntityType.SKELETON.getLootTableId(), LootBuilder.create()
                .rolls(1).with(MiscItems.ARROW_BUNDLE)
                .conditionally(RandomChanceLootCondition.builder(0.1f))
                );
        LootTableHelper.appendLoot(EntityType.SKELETON.getLootTableId(), LootBuilder.create()
                .rolls(1).with(Items.SKELETON_SKULL)
                .conditionally(RandomChanceLootCondition.builder(0.025f))
                );

        LootTableHelper.appendLoot(EntityType.STRAY.getLootTableId(), LootBuilder.create()
                .rolls(1).with(MiscItems.ARROW_BUNDLE)
                .conditionally(RandomChanceLootCondition.builder(0.15f))
                );
        LootTableHelper.appendLoot(EntityType.STRAY.getLootTableId(), LootBuilder.create()
                .rolls(1).with(Items.SKELETON_SKULL)
                .conditionally(RandomChanceLootCondition.builder(0.025f))
                );
    }

    private static void chests() {
        LootTableHelper.appendLoot(LootTables.ABANDONED_MINESHAFT_CHEST,
                LootBuilder.create().rolls(1).with(EmptyEntry.Serializer().weight(0)));

        //Inject all three mermaid weapons into the large ocean ruin loot table
        LootTableHelper.appendLoot(LootTables.UNDERWATER_RUIN_BIG_CHEST,
                LootBuilder.create().rolls(1)
                .with(WeaponsAndTools.MERMAID_SWORD)
                .with(WeaponsAndTools.MERMAID_SPEAR)
                .with(WeaponsAndTools.CORAL_KNIFE)
                //Only 9 in 10 large ocean ruin chests will contain a mermaid weapon
                .conditionally(RandomChanceLootCondition.builder(0.91f))
                );
        //Inject encrusted pickaxe into the small ocean ruin loot table
        LootTableHelper.appendLoot(LootTables.UNDERWATER_RUIN_BIG_CHEST,
                LootBuilder.create().rolls(1)
                .with(WeaponsAndTools.ENCRUSTED_PICKAXE)
                //Only 1 in 15 small ocean ruin chests will contain an encrusted pickaxe
                .conditionally(RandomChanceLootCondition.builder(0.07f))
                );
    }

    private static void blocks() {
        //When we need to add an item to multiple loot tables, like fiber or worms,
        //first we make a "loot builder" and store it in a variable,
        //then we call it for all of the blocks we want to drop the item.

        //Create fiber loot builder and apply it to grass and tall grass
        LootBuilder builder = LootBuilder.create()
                .rolls(1).with(MiscItems.FIBER)
                .withCondition(new MatchToolLootCondition(LootUtils.tag(VItemTags.SICKLES))
                        );

        LootTableHelper.appendLoot(Blocks.GRASS.getLootTableId(), builder);
        LootTableHelper.appendLoot(Blocks.TALL_GRASS.getLootTableId(), builder);

        /*
        //Create worm loot builder and apply it to grass and tall grass
        builder = LootBuilder.create()
                .rolls(1).with(FoodAndCooking.WORM)
                .withCondition(new MatchToolLootCondition(LootUtils.tag(FabricToolTags.SHOVELS)));

        LootTableHelper.appendLoot(Blocks.GRASS.getLootTableId(), builder);
        LootTableHelper.appendLoot(Blocks.TALL_GRASS.getLootTableId(), builder);
        */

        //When we need to add an item to just one loot table, we don't need to store a builder.

        //Make all three ice variants drop themselves whem mined with ice tongs
        LootTableHelper.appendLoot(Blocks.ICE.getLootTableId(),
                LootBuilder.create().with(Blocks.ICE).withCondition(new MatchToolLootCondition(LootUtils.items(WeaponsAndTools.TONGS))));
        LootTableHelper.appendLoot(Blocks.BLUE_ICE.getLootTableId(),
                LootBuilder.create().with(Blocks.BLUE_ICE).withCondition(new MatchToolLootCondition(LootUtils.items(WeaponsAndTools.TONGS))));
        LootTableHelper.appendLoot(Blocks.PACKED_ICE.getLootTableId(),
                LootBuilder.create().with(Blocks.PACKED_ICE).withCondition(new MatchToolLootCondition(LootUtils.items(WeaponsAndTools.TONGS))));
    }

    private static Identifier register(String id) {
        return new Identifier(ValleyMain.MOD_ID, id);
    }
}
