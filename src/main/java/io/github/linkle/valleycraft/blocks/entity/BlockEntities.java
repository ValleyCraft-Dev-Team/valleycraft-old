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
	
	public static final Block CRAB_TRAP = new CrabTrap();
	
	public static void ints() {
	    var furnGroup = new BlockItem.Settings().group(FURNITURE_GROUP);
	    
	    Util.register("brick_furnace", new BlockItem(BRICK_FURNACE, furnGroup));
	    BrickFurnace.BLOCK_ENTITY = createBlockEntity("brick_furnace", BRICK_FURNACE, BrickFurnaceEntity::new);
	    
	    Util.register("crab_trap", new BlockItem(CRAB_TRAP, new BlockItem.Settings().group(ItemGroups.FISHING_GROUP)));
	    CrabTrap.BLOCK_ENTITY = createBlockEntity("crab_trap", CRAB_TRAP, CrabTrapEntity::new);	    
	}
	
	@SuppressWarnings("unchecked")
    private static <T extends BlockEntity> BlockEntityType<T> createBlockEntity(String id, Block block, Factory<BlockEntity> factory) {
		var entity = FabricBlockEntityTypeBuilder.create(factory, block).build();
		return (BlockEntityType<T>)Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(ValleyMain.MOD_ID, id), entity);
	}
}
