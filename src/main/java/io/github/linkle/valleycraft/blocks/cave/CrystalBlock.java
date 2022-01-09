package io.github.linkle.valleycraft.blocks.cave;

import io.github.linkle.valleycraft.blocks.BlockWithWater;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class CrystalBlock extends BlockWithWater {
    protected static final VoxelShape SHAPE = createCuboidShape(1, 0, 1, 15, 15, 15);

    private final boolean isRedstone;
    private final UniformIntProvider experienceDropped;

    public CrystalBlock(Settings settings, boolean isRedstone, UniformIntProvider experienceDropped) {
        super(settings);
        setDefaultState();
        this.isRedstone = isRedstone;
        this.experienceDropped = experienceDropped;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public boolean emitsRedstonePower(BlockState state) {
        return isRedstone;
    }

    @Override
    public int getWeakRedstonePower(BlockState state, BlockView world, BlockPos pos, Direction direction) {
        return isRedstone ? 15 : 0;
    }

    @Override
    public void onStacksDropped(BlockState state, ServerWorld world, BlockPos pos, ItemStack stack) {
        int i;
        super.onStacksDropped(state, world, pos, stack);
        if (EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, stack) == 0 && (i = experienceDropped.get(world.random)) > 0) {
            this.dropExperience(world, pos, i);
        }
    }
}