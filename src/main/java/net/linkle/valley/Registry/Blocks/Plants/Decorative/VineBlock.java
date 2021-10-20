package net.linkle.valley.Registry.Blocks.Plants.Decorative;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class VineBlock extends Block {
    protected static final VoxelShape SHAPE = Block.createCuboidShape(2.0D, -7.0D, 2.0D, 14.0D, 16.0D, 14.0D);

    public VineBlock() {
        super(FabricBlockSettings.of(Material.LEAVES)
                .breakByTool(FabricToolTags.SHEARS)
                .breakByHand(true)
                .sounds(BlockSoundGroup.WEEPING_VINES_LOW_PITCH)
                .strength(0, 0.5f));
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    public static final VoxelShape BlockCollisionShape;

    public VoxelShape getCollisionShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return BlockCollisionShape;
    }

    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return true;
    }

    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (entity instanceof LivingEntity && entity.getType() != EntityType.FOX && entity.getType() != EntityType.BEE && entity.getType() != EntityType.BAT && entity.getType() != EntityType.CAT && entity.getType() != EntityType.OCELOT) {
            entity.slowMovement(state, new Vec3d(0.800000011920929D, 0.75D, 0.800000011920929D));
        }
    }

    static {
        BlockCollisionShape = VoxelShapes.empty();
    }
}
