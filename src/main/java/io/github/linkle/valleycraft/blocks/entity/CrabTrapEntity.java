package io.github.linkle.valleycraft.blocks.entity;

import java.util.function.Supplier;

import org.spongepowered.include.com.google.common.collect.ImmutableSet;

import io.github.linkle.valleycraft.init.CrabTrapBaits;
import io.github.linkle.valleycraft.init.VLootTables;
import io.github.linkle.valleycraft.screen.CrabTrapScreenHandler;
import io.github.linkle.valleycraft.utils.Util;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.LockableContainerBlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.context.LootContext;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.property.Properties;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome.Category;

public class CrabTrapEntity extends LockableContainerBlockEntity implements SidedInventory {

    private static final ImmutableSet<Category> BIOMES = ImmutableSet.of(Category.OCEAN, Category.RIVER, Category.BEACH,
            Category.SWAMP);

    private DefaultedList<ItemStack> inventory = DefaultedList.ofSize(10, ItemStack.EMPTY);
    private int timer, maxTimer;
    private boolean isInProgress = false;
    private Condition condition = Condition.PERFECT;

    protected final PropertyDelegate propertyDelegate = new PropertyDelegate() {
        @Override
        public int get(int index) {
            return index == 0 ? (isInProgress ? 1 : 0) : 0;
        }

        @Override
        public void set(int index, int value) {
            if (index == 0)
                isInProgress = value == 1;
        }

        @Override
        public int size() {
            return 1;
        }
    };

    public CrabTrapEntity(BlockPos pos, BlockState state) {
        super(CrabTrap.BLOCK_ENTITY, pos, state);
    }

    // Working
    public static void tick(World world, BlockPos pos, BlockState state, CrabTrapEntity entity) {
        var bait = entity.getBait();
        if (bait.isEmpty() || entity.isInvaild()) {
            entity.isInProgress = false;
            return;
        }

        var isFull = true;
        for (int i = 1; i < 10; i++) {
            if (entity.inventory.get(i).isEmpty()) {
                isFull = false;
                break;
            }
        }
        if (isFull) {
            entity.isInProgress = false;
            return;
        }

        if (!entity.isInProgress) {
            entity.isInProgress = true;
            entity.setBaitTimer();
        }

        if (entity.timer-- <= 0) {
            entity.setBaitTimer();
            entity.addLoot();
        }
    }

    // Utilities

    private ItemStack getBait() {
        return inventory.get(0);
    }

    private void setBaitTimer() {
        //timer = CrabTrapBaits.get(getBait().getItem(), world.random);
        timer = 1 * 20;
        maxTimer = timer;
    }

    public void checkValidation() {
        if (!world.getBlockState(pos).get(Properties.WATERLOGGED)) {
            condition = Condition.NOT_WATERLOGGED;
            return;
        }

        if (!BIOMES.contains(world.getBiome(pos).getCategory())) {
            condition = Condition.INVAILD_BIOME;
            return;
        }

        condition = Condition.PERFECT;
    }
    
    private boolean isInvaild() {
        return condition.isInvaild();
    }
    
    private void addLoot() {
        // TODO: Use loot table.
        var builder = new LootContext.Builder((ServerWorld)world);
        var lootTable = world.getServer().getLootManager().getTable(VLootTables.BAITING);
        var list = lootTable.generateLoot(builder.build(LootContextTypes.EMPTY));
        for (var loot : list) {
            var added = false;
            for (int i = 1; i < 10; i++) {
                var stack = getStack(i);
                if (stack.isEmpty()) {
                    setStack(i, loot);
                    added = true;
                } else if (Util.canMergeItems(stack, loot)) {
                    int num = Math.min(loot.getMaxCount(), 16) - stack.getCount();
                    int change = Math.min(loot.getCount(), num);
                    stack.increment(change);
                    added = change > 0;
                }
                
                if (added) break;
            }
            
            if (added) {
                getBait().decrement(1);
                markDirty();
            }
        }
    }

    // Override stuff

    @Override // Working
    public boolean isValid(int slot, ItemStack stack) {
        return slot == 0 ? CrabTrapBaits.contains(stack.getItem()) : true;
    }

    // Implementation stuff

    @Override // Done
    public int size() {
        return inventory.size();
    }

    @Override // Done
    public boolean isEmpty() {
        for (var item : inventory) {
            if (item.isEmpty())
                continue;
            return false;
        }
        return true;
    }

    @Override // Done
    public ItemStack getStack(int slot) {
        if (slot >= 0 && slot < size()) {
            return inventory.get(slot);
        }
        return ItemStack.EMPTY;
    }

    @Override // Done
    public ItemStack removeStack(int slot, int amount) {
        return Inventories.splitStack(inventory, slot, amount);
    }

    @Override // Done
    public ItemStack removeStack(int slot) {
        return Inventories.removeStack(inventory, slot);
    }

    @Override // Done
    public void setStack(int slot, ItemStack stack) {
        if (slot >= 0 && slot < size()) {
            inventory.set(slot, stack);
        }
    }

    @Override // Done
    public boolean canPlayerUse(PlayerEntity player) {
        if (world.getBlockEntity(pos) != this) {
            return false;
        }
        return !(player.squaredDistanceTo(pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5) > 64.0);
    }

    @Override // Done
    public void clear() {
        inventory.clear();
    }

    @Override // Done
    protected Text getContainerName() {
        var text = new TranslatableText("block.valley.crab_trap");

        if (condition.isInvaild()) {
            text.append(" ").append(new TranslatableText(condition.key).formatted(Formatting.DARK_RED));
        }

        return text;
    }

    @Override // Done
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new CrabTrapScreenHandler(syncId, playerInventory, this, propertyDelegate);
    }

    // Named Binary Tag stuff

    @Override // Done?
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        inventory = DefaultedList.ofSize(size(), ItemStack.EMPTY);
        Inventories.readNbt(nbt, inventory);
        timer = nbt.getInt("Timer");
        maxTimer = nbt.getInt("MaxTimer");
        isInProgress = nbt.getBoolean("IsInProgress");
    }

    @Override // Done?
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, inventory);
        nbt.putInt("Timer", timer);
        nbt.putInt("MaxTimer", maxTimer);
        nbt.putBoolean("IsInProgress", isInProgress);
    }
    
    private static final int[] BAIT_SLOTS = {0};
    
    private static final int[] LOOT_SLOTS = ((Supplier<int[]>)() -> {
        var slots = new int[9];
        for (int i = 0; i < slots.length; i++) slots[i] = i + 1;
        return slots;
    }).get();

    @Override
    public int[] getAvailableSlots(Direction face) {
        return face == Direction.DOWN ? LOOT_SLOTS : BAIT_SLOTS;
    }

    @Override
    public boolean canInsert(int slot, ItemStack stack, Direction face) {
        return slot == 0 && CrabTrapBaits.contains(stack.getItem());
    }

    @Override
    public boolean canExtract(int slot, ItemStack stack, Direction face) {
        return slot != 0;
    }
    
    static enum Condition {
        PERFECT(null), NOT_WATERLOGGED("text.valley.crab_trap.not_waterlogged"),
        INVAILD_BIOME("text.valley.crab_trap.invaild_biome");

        String key;

        Condition(String key) {
            this.key = key;
        }

        boolean isInvaild() {
            return this != PERFECT;
        }
    }
}
