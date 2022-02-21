package io.github.linkle.valleycraft.blocks.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder.Factory;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;

/** Allowing to have multiable block instance in one block entity class. */
public class BlockEntityFactory implements Factory<BlockEntity> {
    public BlockEntityType<?> type;

    private final FactoryBlock factory;

    public BlockEntityFactory(FactoryBlock factory) {
        this.factory = factory;
    }

    @Override
    public BlockEntity create(BlockPos blockPos, BlockState blockState) {
        return factory.create(type, blockPos, blockState);
    }

    @FunctionalInterface
    public interface FactoryBlock {
        BlockEntity create(BlockEntityType<?> type, BlockPos pos, BlockState state);
    }
}
