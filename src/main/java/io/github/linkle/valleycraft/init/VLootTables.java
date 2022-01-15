package io.github.linkle.valleycraft.init;

import io.github.linkle.valleycraft.ValleyMain;
import io.github.linkle.valleycraft.utils.loot.LootBuilder;
import io.github.linkle.valleycraft.utils.loot.LootTableHelper;
import io.github.linkle.valleycraft.utils.loot.LootUtils;
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
import net.minecraft.util.Identifier;

public class VLootTables {
    
    public static final Identifier BAITING = register("crabtrap/baiting");
    
    public static void initialize() {
        blocks();
        entities();
        chests();
        
        //If the config has fishing enabled...
        /*
        if (CONFIG.fishing.enabled) {
                //... inject our fish and junk into the respective vanilla loot tables
            LootTableHelper.injectLoot(LootTables.FISHING_FISH_GAMEPLAY, VLootTables::fishingFishLoot);
            LootTableHelper.injectLoot(LootTables.FISHING_JUNK_GAMEPLAY, VLootTables::fishingJunkLoot);
        } */
    }
    
    /*
    private static void fishingFishLoot(FabricLootPoolBuilder pool) {
        for (var entry : CONFIG.fishing.fish) {
            Item item = Registry.ITEM.get(new Identifier(entry.item));
            if (item == null) {
                LOGGER.warn("Unknown fishing loot item with an id: " + entry.item);
                continue;
            }
            
            pool.with(ItemEntry.builder(item).weight(entry.weight));
        }
    }
    
    private static void fishingJunkLoot(FabricLootPoolBuilder pool) {
        for (var entry : CONFIG.fishing.junk) {
            Item item = Registry.ITEM.get(new Identifier(entry.item));
            if (item == null) {
                LOGGER.warn("Unknown fishing loot item with an id: " + entry.item);
                continue;
            }
            
            pool.with(ItemEntry.builder(item).weight(entry.weight));
        }
    } */

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
    
    private static Identifier register(String id) {
        return new Identifier(ValleyMain.MOD_ID, id);
    }
}
