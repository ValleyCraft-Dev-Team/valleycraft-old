package net.linkle.valley.Registry.Blocks.Decorations.Furnaces;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.RecipeType;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.SmokerScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.math.BlockPos;

public class BrickFurnaceBlockEntity extends AbstractFurnaceBlockEntity {

	public BrickFurnaceBlockEntity(BlockPos pos, BlockState state) {
		// RecipeType.SMELTING to include all smeltable items like furnace. 
		super(BrickFurnace.BLOCK_ENTITY, pos, state, RecipeType.SMOKING); 
	}

	/** The title of the furnace user interface. Usually use your furnace's block name. */
	@Override 
	protected Text getContainerName() {
		return new TranslatableText("block.valley.brick_furnace");
	}
	
	@Override 
	protected int getFuelTime(ItemStack fuel) {
		return super.getFuelTime(fuel) / 2; // Divide it by two to get cook time twice as fast.
	}

	@Override
	protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
		return new SmokerScreenHandler(syncId, playerInventory, this, propertyDelegate);
	}
}
