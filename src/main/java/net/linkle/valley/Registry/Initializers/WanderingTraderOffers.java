package net.linkle.valley.Registry.Initializers;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.linkle.valley.Registry.Utils.SimpleConfig;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;

public class WanderingTraderOffers {
    public static void initialize(SimpleConfig config) {
        /*
        config.script("disable-wandering-trades", 
            "Disables wandering traders for offering vallycraft items."
        );
        if (config.get("disable-wandering-trades", false)) {
            return;
        }
        TradeOfferHelper.registerWanderingTraderOffers(0, factories -> {
            factories.add((g, a) -> {
                return new TradeOffer(new ItemStack(Items.NETHERITE_BLOCK, 64), new ItemStack(Items.DIRT, 1), 1, 3, 1);
            });
        });
        */
    }
}
