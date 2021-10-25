package net.linkle.valley.Registry.WeaponsAndTools.Totems;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import java.util.List;

public class DruidRuneTotemBase extends AbstractTotemBase {
    public DruidRuneTotemBase(Settings settings) {
        super(settings);
    }

    @Override
    public boolean canSetWeather(World world) {
        return !world.isRaining() || !world.isThundering();
    }

    @Override
    public void setWeather(ServerWorld world) {
        world.setWeather(MAX_DURATION, 0, false, false);
    }

    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        PlayerEntity playerEntity = user instanceof PlayerEntity ? (PlayerEntity)user : null;
        if (playerEntity instanceof ServerPlayerEntity) {
            Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity)playerEntity, stack);
        }

        if (playerEntity != null) {
            playerEntity.incrementStat(Stats.USED.getOrCreateStat(this));
            if (!playerEntity.getAbilities().creativeMode) {
                stack.decrement(1);
            }
        }

        if (playerEntity == null || !playerEntity.getAbilities().creativeMode) {
            if (stack.isEmpty()) {
                var item = Registry.ITEM.getOrEmpty(new Identifier("valley:anchor"));
                return new ItemStack(item.get(), 1);
            }

            if (playerEntity != null) {
                playerEntity.getInventory().insertStack(new ItemStack(Items.ARROW, 8));
            }
        }

        return stack.isEmpty() ? new ItemStack(Items.ARROW, 8) : stack;
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add( new TranslatableText("item.valley.druid_rune.tooltip").formatted(Formatting.YELLOW) );
        tooltip.add( new TranslatableText("item.valley.druid_rune.tooltip_2").formatted(Formatting.YELLOW) );
    }
}