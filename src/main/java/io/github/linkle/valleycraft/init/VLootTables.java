package io.github.linkle.valleycraft.init;

import io.github.linkle.valleycraft.ValleyMain;
import io.github.linkle.valleycraft.utils.loot.LootBuilder;
import io.github.linkle.valleycraft.utils.loot.LootTableHelper;
import io.github.linkle.valleycraft.utils.loot.LootUtils;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
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

public class VLootTables {
    public static void initialize() {
        blocks();
        entities();
        
        if (ValleyMain.CONFIG.fishing.fishingLootEnabled) {
            LootTableHelper.injectLoot(LootTables.FISHING_FISH_GAMEPLAY, VLootTables::fishingFishLoot);
            LootTableHelper.injectLoot(LootTables.FISHING_JUNK_GAMEPLAY, VLootTables::fishingJunkLoot);
        }
    }
    
    private static void fishingFishLoot(FabricLootPoolBuilder pool) {
        pool.with(ItemEntry.builder(Fishing.CRAB).weight(13));
        pool.with(ItemEntry.builder(Fishing.MUSSEL).weight(13));
        pool.with(ItemEntry.builder(Fishing.BROWN_MUSSEL).weight(13));
        pool.with(ItemEntry.builder(Fishing.CERITH_SNAIL).weight(13));
        pool.with(ItemEntry.builder(Aquatic.CLAM).weight(24));
        pool.with(ItemEntry.builder(Fishing.SARDINE).weight(43));
        pool.with(ItemEntry.builder(Fishing.LIONFISH).weight(6));
        pool.with(ItemEntry.builder(Fishing.SLIMEFISH).weight(20));
        pool.with(ItemEntry.builder(Fishing.PERCH).weight(40));
        pool.with(ItemEntry.builder(Aquatic.SAND_DOLLAR).weight(10));
        pool.with(ItemEntry.builder(Aquatic.STARFISH).weight(2));
        pool.with(ItemEntry.builder(Fishing.FIRE_EEL).weight(7));
        pool.with(ItemEntry.builder(Fishing.OCTO).weight(9));
        pool.with(ItemEntry.builder(Fishing.GLISTERING_ANGLER).weight(7));
        pool.with(ItemEntry.builder(Fishing.GHOST_FISH).weight(5));
    }
    
    private static void fishingJunkLoot(FabricLootPoolBuilder pool) {
        pool.with(ItemEntry.builder(Aquatic.RED_SEA_GRASS).weight(17));
        pool.with(ItemEntry.builder(Aquatic.GLOW_KELP).weight(10));
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
    }

    private static void blocks() {
        LootBuilder builder = LootBuilder.create()
            .rolls(1).with(MiscItems.FIBER)
            .withCondition(new MatchToolLootCondition(LootUtils.tag(VItemTags.KNIVES))
        );

        LootTableHelper.appendLoot(Blocks.GRASS.getLootTableId(), builder);
        LootTableHelper.appendLoot(Blocks.TALL_GRASS.getLootTableId(), builder);

        builder = LootBuilder.create()
                .rolls(1).with(FoodAndCooking.WORM)
                .withCondition(new MatchToolLootCondition(LootUtils.tag(FabricToolTags.SHOVELS))
        );

        LootTableHelper.appendLoot(Blocks.GRASS.getLootTableId(), builder);
        LootTableHelper.appendLoot(Blocks.TALL_GRASS.getLootTableId(), builder);

        builder = LootBuilder.create()
            .rolls(1).with(Blocks.ICE)
            .withCondition(new MatchToolLootCondition(LootUtils.items(WeaponsAndTools.TONGS))
        );
        LootTableHelper.appendLoot(Blocks.ICE.getLootTableId(), builder);
        LootTableHelper.appendLoot(Blocks.BLUE_ICE.getLootTableId(), builder);
        LootTableHelper.appendLoot(Blocks.PACKED_ICE.getLootTableId(), builder);
    }
}
