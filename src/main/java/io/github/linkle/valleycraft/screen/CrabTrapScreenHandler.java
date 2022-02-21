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

    public CrabTrapScreenHandler(int syncId, PlayerInventory playerInventory) {
        this(syncId, playerInventory, new SimpleInventory(10), new ArrayPropertyDelegate(3));
    }

    public CrabTrapScreenHandler(int syncId, PlayerInventory playerInventory, Inventory inventory,
            PropertyDelegate propertyDelegate) {
        super(Screens.CRAB_TRAP, syncId);
        this.inventory = inventory;
        this.propertyDelegate = propertyDelegate;
        addSlot(new InputSlot(inventory, 0, 38, 35));
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

    //This method adds shift-clicking functionality.
    //It is referenced off of the method of the same name in AbstractFurnaceScreenHandler.
    @Override
    public ItemStack transferSlot(PlayerEntity player, int index) {
        //Initialize itemStack as an empty stack for now
        ItemStack itemStack = ItemStack.EMPTY;
        //Use the index input variable to get which slot the player clicked
        Slot slot = slots.get(index);
        //This method is adapted from a similar one in AbstractFurnaceScreenHandler. I replaced all the magic numbers with variables.
        //The slots are counted from left to right and top to bottom, like reading, starting with one.
        //Slot 1 = the bait slot
        //Slots 2-10 = the output slots
        //Slots 11-37 = the player's inventory
        //Slots 38-46 = the player's hotbar
        final int NumberOfSlots = 46;
        final int BaitSlot = 0;
        final int FirstOutputSlot = 1;
        final int LastOutputSlot = 9;
        final int FirstPlayerInvSlot = 10;
        final int LastPlayerInvSlot = 36;
        final int FirstHotbarSlot = 37;
        //Make sure the slot the player clicked isn't empty or "null" before we proceed
        if (slot != null && slot.hasStack()) {
            //Get the ItemStack contained in the slot the player shift-clicked and store it
            ItemStack itemStack2 = slot.getStack();
            //Copy said ItemStack into another variable
            itemStack = itemStack2.copy();
            //If the player shift clicked one of the output slots, move it into the player's inventory or hotbar...
            if (index >= FirstOutputSlot && index <= LastOutputSlot) {
                if (!insertItem(itemStack2, FirstPlayerInvSlot, NumberOfSlots, true)) {
                    return ItemStack.EMPTY;
                }
                //... then call this method so the game can tell that an item was "crafted."
                slot.onQuickTransfer(itemStack2, itemStack);
                //Else, if the player shift clicked the bait slot, remove bait and place it into the player's inventory or hotbar.
            } else if (index == 0 ? !insertItem(itemStack2, FirstPlayerInvSlot, NumberOfSlots, false)
                    //Else, if the player shift clicked a bait item stack, place bait into the bait slot from the player's inventory or hotbar.
                    : isBait(itemStack2) ? !insertItem(itemStack2, BaitSlot, BaitSlot +1, false)
                            //Else, if the player shift clicked one of their inventory slots, move items from their inventory into their hotbar.
                            : index >= FirstPlayerInvSlot && index <= LastPlayerInvSlot ? !insertItem(itemStack2, FirstHotbarSlot, NumberOfSlots, false)
                                    //Else, if the player shift clicked one of their hotbar slots, move items from their hotbar into their inventory.
                                    : index >= FirstHotbarSlot && index < NumberOfSlots && !insertItem(itemStack2, FirstPlayerInvSlot, LastPlayerInvSlot +1, false)) {
                return ItemStack.EMPTY;
            }
            if (itemStack2.isEmpty()) {
                slot.setStack(ItemStack.EMPTY);
            } else {
                slot.markDirty();
            }
            if (itemStack2.getCount() == itemStack.getCount()) {
                return ItemStack.EMPTY;
            }
            slot.onTakeItem(player, itemStack2);
        }
        return itemStack;
    }

    public boolean isInProgress() {
        return propertyDelegate.get(0) != 0;
    }

    public int getTimer() {
        return propertyDelegate.get(1);
    }

    public int getMaxTimer() {
        return propertyDelegate.get(2);
    }

    private static class InputSlot extends Slot {
        public InputSlot(Inventory inventory, int index, int x, int y) {
            super(inventory, index, x, y);
        }

        @Override
        public boolean canInsert(ItemStack stack) {
            return isBait(stack);
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
            return 16;
        }
    }

    //This method checks if a given ItemStack is bait and returns true if it is
    public static boolean isBait(ItemStack stack) {
        return CrabTrapBaits.contains(stack.getItem());
    }
}
