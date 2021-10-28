package net.linkle.valley.Registry.Blocks.Plants;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import static net.linkle.valley.Registry.Initializers.StoneBlocks.B_ROOTS;

public class MudBlock extends FallingBlock {
    public MudBlock() {
        super(FabricBlockSettings.of(Material.SOIL)
                .breakByTool(FabricToolTags.SHOVELS)
                .breakByHand(true)
                .sounds(BlockSoundGroup.GRAVEL)
                .strength(0.6f, 1.5f));
    }

    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (player.getStackInHand(hand).getItem() == Items.BONE_MEAL) {
            world.setBlockState(pos, B_ROOTS.getDefaultState());
        }
        return ActionResult.PASS;
    }
}