package io.github.linkle.valleycraft.screen;

import io.github.linkle.valleycraft.init.CrabTrapBaits;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ArrayPropertyDelegate;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;

public class CrabTrapScreenHandler extends ScreenHandler {

    private final Inventory inventory;
    private final PropertyDelegate propertyDelegate;
    private final Slot inputSlot;

    public CrabTrapScreenHandler(int syncId, PlayerInventory playerInventory) {
        this(syncId, playerInventory, new SimpleInventory(10), new ArrayPropertyDelegate(1));
    }

    public CrabTrapScreenHandler(int syncId, PlayerInventory playerInventory, Inventory inventory,
            PropertyDelegate propertyDelegate) {
        super(Screens.CRAB_TRAP, syncId);
        this.inventory = inventory;
        this.propertyDelegate = propertyDelegate;
        this.inputSlot = addSlot(new InputSlot(inventory, 0, 38, 35));
        addProperties(propertyDelegate);

        int i;
        for (i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                addSlot(new OutputSlot(inventory, j + i * 3 + 1, 62 + j * 18 + 30, 17 + i * 18));
            }
        }

        // player inventory
        for (i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                addSlot(new Slot(playerInventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }
        for (i = 0; i < 9; ++i) {
            addSlot(new Slot(playerInventory, i, 8 + i * 18, 142));
        }
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return inventory.canPlayerUse(player);
    }

    @Override
    public ItemStack transferSlot(PlayerEntity player, int index) {
        return ItemStack.EMPTY;
    }

    public boolean isInProgress() {
        return propertyDelegate.get(0) != 0;
    }

    private static class InputSlot extends Slot {
        public InputSlot(Inventory inventory, int index, int x, int y) {
            super(inventory, index, x, y);
        }

        @Override
        public boolean canInsert(ItemStack stack) {
            return CrabTrapBaits.contains(stack.getItem());
        }
    }

    private static class OutputSlot extends Slot {
        public OutputSlot(Inventory inventory, int index, int x, int y) {
            super(inventory, index, x, y);
        }

        @Override
        public boolean canInsert(ItemStack stack) {
            return false;
        }

        @Override
        public int getMaxItemCount() {
            return 1;
        }
    }
}
