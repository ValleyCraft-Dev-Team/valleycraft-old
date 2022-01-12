package io.github.linkle.valleycraft.blocks.entity;

import net.minecraft.block.entity.BlockEntityType;

@FunctionalInterface
public interface MultiBlockEntity {
    void setType(BlockEntityType<?> type);
}
