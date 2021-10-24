package net.linkle.valley.Registry.Blocks.Decorations.Furnaces;

import 	net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.datafixer.TypeReferences;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.minecraft.util.registry.Registry;

import static net.linkle.valley.Registry.Initializers.ItemGroups.FURNITURE_GROUP;
import static net.linkle.valley.ValleyMain.MOD_ID;

public class Furnaces {
	public static final Block BRICK_FURNACE = new BrickFurnace(FabricBlockSettings.of(Material.STONE)
			.breakByTool(FabricToolTags.PICKAXES)
			.breakByHand(false)
			.sounds(BlockSoundGroup.DEEPSLATE_BRICKS).luminance(7)
			.strength(1.5f, 2f));
	
	public static void ints() {
		var identity = new Identifier(MOD_ID, "brick_furnace");
	    Registry.register(Registry.BLOCK, identity, BRICK_FURNACE);
	    Registry.register(Registry.ITEM, identity, new BlockItem(BRICK_FURNACE, new BlockItem.Settings().group(FURNITURE_GROUP)));
	    BrickFurnace.BLOCK_ENTITY = createFurnaceEntity(identity, BRICK_FURNACE);
	}
	
	private static BlockEntityType<BrickFurnaceBlockEntity> createFurnaceEntity(Identifier id, Block block) {
		var type = Util.getChoiceType(TypeReferences.BLOCK_ENTITY, id.toString());
		var entity = FabricBlockEntityTypeBuilder.create(BrickFurnaceBlockEntity::new, block).build(type);
		return Registry.register(Registry.BLOCK_ENTITY_TYPE, id, entity);
	}
}
