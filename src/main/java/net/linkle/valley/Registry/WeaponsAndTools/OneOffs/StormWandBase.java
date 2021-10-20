package net.linkle.valley.Registry.WeaponsAndTools.OneOffs;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class StormWandBase extends HoeItem {
    public StormWandBase(ToolMaterial StormToolMaterialKnife) {
        super(StormToolMaterialKnife, 7, -2.5f, new Settings().group(EXPLORATION_GROUP
            ));
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient) {
            ((ServerWorld)world).setWeather(0, 24000, true, false);
        }
        return TypedActionResult.pass(user.getStackInHand(hand));
    }
}


