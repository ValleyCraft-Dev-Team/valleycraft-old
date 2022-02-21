package io.github.linkle.valleycraft.init;

import java.util.List;
import java.util.Random;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOffers;

public class WanderingTraderOffers {
    public static void initialize() {
        //TradeOfferHelper.registerWanderingTraderOffers(0, WanderingTraderOffers::addTradesLevel0);
    }

    private static void addTradesLevel(List<TradeOffers.Factory> list) {
        list.add(new Factory(new TradeOffer(new ItemStack(Items.EMERALD, 1), new ItemStack(Items.DIRT, 1), 1, 3, 1)));
    }

    private static class Factory implements TradeOffers.Factory {

        final TradeOffer offer;

        Factory(TradeOffer offer) {
            this.offer = offer;
        }

        @Override
        public TradeOffer create(Entity entity, Random random) {
            return offer;
        }

    }
}