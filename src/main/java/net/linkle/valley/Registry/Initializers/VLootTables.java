package net.linkle.valley.Registry.Initializers;

import net.linkle.valley.Registry.Loot.LootBuilder;
import net.linkle.valley.Registry.Loot.LootTableHelper;
import net.linkle.valley.Registry.Loot.LootUtils;
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
        // chests();
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
            .rolls(1).with(Blocks.ICE)
            .withCondition(new MatchToolLootCondition(LootUtils.items(WeaponsAndTools.TONGS))
        );
        LootTableHelper.appendLoot(Blocks.ICE.getLootTableId(), builder);
        LootTableHelper.appendLoot(Blocks.BLUE_ICE.getLootTableId(), builder);
        LootTableHelper.appendLoot(Blocks.PACKED_ICE.getLootTableId(), builder);
    }
}
