package io.github.linkle.valleycraft.blocks.entity;

import static io.github.linkle.valleycraft.init.ItemGroups.FURNITURE_GROUP;

import io.github.linkle.valleycraft.ValleyMain;
import io.github.linkle.valleycraft.init.ItemGroups;
import io.github.linkle.valleycraft.init.MiscItems;
import io.github.linkle.valleycraft.utils.Util;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder.Factory;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockEntities {
	public static final Block BRICK_FURNACE = new BrickFurnace(FabricBlockSettings.of(Material.STONE)
	        .requiresTool()
			.sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
			.luminance(7)
			.strength(1.5f, 2f));

	public static final Block COBBLE_FURNACE = new BrickFurnace(FabricBlockSettings.of(Material.STONE)
			.requiresTool()
			.sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
			.luminance(7)
			.strength(1.5f, 2f));

	public static final Block VOLCANIC_FURNACE = new BrickFurnace(FabricBlockSettings.of(Material.STONE)
			.requiresTool()
			.sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
			.luminance(7)
			.strength(1.5f, 2f));

	public static final Block CARMINE_FURNACE = new BrickFurnace(FabricBlockSettings.of(Material.STONE)
			.requiresTool()
			.sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
			.luminance(7)
			.strength(1.5f, 2f));

	public static final Block CRAB_TRAP = new CrabTrap();
	
	public static void ints() {
	    var furnGroup = new BlockItem.Settings().group(FURNITURE_GROUP);
	    
	    Util.register("brick_furnace", new BlockItem(BRICK_FURNACE, furnGroup));
	    createBlockEntity("brick_furnace", BRICK_FURNACE, new BlockEntityFactory(BrickFurnaceEntity::new));

		Util.register("cobble_furnace", new BlockItem(COBBLE_FURNACE, furnGroup));
		createBlockEntity("cobble_furnace", COBBLE_FURNACE, new BlockEntityFactory(BrickFurnaceEntity::new));

		Util.register("carmine_furnace", new BlockItem(CARMINE_FURNACE, furnGroup));
		createBlockEntity("carmine_furnace", CARMINE_FURNACE, new BlockEntityFactory(BrickFurnaceEntity::new));

		Util.register("volcanic_furnace", new BlockItem(VOLCANIC_FURNACE, furnGroup));
		createBlockEntity("volcanic_furnace", VOLCANIC_FURNACE, new BlockEntityFactory(BrickFurnaceEntity::new));

		Util.register("crab_trap", new BlockItem(CRAB_TRAP, new BlockItem.Settings().group(ItemGroups.FISHING_GROUP)));
	    CrabTrap.BLOCK_ENTITY = createBlockEntity("crab_trap", CRAB_TRAP, CrabTrapEntity::new);	    
	}
	
    private static <T extends BlockEntity> BlockEntityType<T> createBlockEntity(String id, Block block, Factory<T> factory) {
		var entity = FabricBlockEntityTypeBuilder.create(factory, block).build();
		if (factory instanceof BlockEntityFactory fact) {
		    fact.type = entity;
		} if (block instanceof MultiBlockEntity multi) {
		    multi.setType(entity);
		}
		return Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(ValleyMain.MOD_ID, id), entity);
	}
}
