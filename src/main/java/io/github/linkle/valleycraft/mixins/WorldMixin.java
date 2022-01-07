package io.github.linkle.valleycraft.mixins;

import java.util.ArrayList;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import io.github.linkle.valleycraft.extension.WorldExt;
import io.github.linkle.valleycraft.world.WorldTicker;
import io.github.linkle.valleycraft.world.WorldTicker.Reason;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

@Mixin(World.class)
abstract class WorldMixin implements WorldAccess, WorldExt {
    
    private final ArrayList<WorldTicker> tickers = new ArrayList<>();
    
    @Override
    public void addTicker(WorldTicker ticker) {
        tickers.add(ticker);
    }
    
    @Inject(method = "tickBlockEntities", at = @At("HEAD"))
    void tick(CallbackInfo info) {
        for (int i = 0; i < tickers.size(); i++) {
            var ticker = tickers.get(i);
            var reason = ticker.tick();
            if (reason.shouldStop() || ticker.tick-- <= 0) {
                ticker.end(reason == Reason.DELETE);
                tickers.remove(i--);
                continue;
            }
        }
    }
}
