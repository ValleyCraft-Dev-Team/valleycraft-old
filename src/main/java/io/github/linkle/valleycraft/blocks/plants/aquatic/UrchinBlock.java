package io.github.linkle.valleycraft.blocks.plants.aquatic;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.GuardianEntity;
import net.minecraft.entity.mob.WaterCreatureEntity;
import net.minecraft.entity.passive.AxolotlEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.World;

public class UrchinBlock extends AquaticBlock {
    protected static final VoxelShape SHAPE = createCuboidShape(4, 0, 4, 12, 7, 12);

    public UrchinBlock() {
        super(getSettings().strength(1, 0.5f), createCuboidShape(4, 0, 4, 12, 7, 12));
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (entity instanceof WaterCreatureEntity ||
            entity instanceof GuardianEntity ||
            entity instanceof AxolotlEntity) {
            return;
        }

        entity.damage(DamageSource.CACTUS, 2.0F);
    }
}