package io.github.linkle.valleycraft.items.OneOffs;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import static io.github.linkle.valleycraft.init.ItemGroups.EXPLORATION_GROUP;

public class StormKnifeBase extends HoeItem {
    public StormKnifeBase(ToolMaterial StormToolMaterialKnife) {
        super(StormToolMaterialKnife, 3, -2.0f, new Settings().group(EXPLORATION_GROUP
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


