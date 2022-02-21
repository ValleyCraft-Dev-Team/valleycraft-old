package io.github.linkle.valleycraft.blocks.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.RecipeType;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.SmokerScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.math.BlockPos;

public class BrickFurnaceEntity extends AbstractFurnaceBlockEntity {

    public BrickFurnaceEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state, RecipeType.SMOKING);
    }

    @Override
    protected Text getContainerName() {
        return new TranslatableText(getCachedState().getBlock().asItem().getTranslationKey());
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
