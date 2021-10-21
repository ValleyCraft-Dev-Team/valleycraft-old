package net.linkle.valley.Registry.WeaponsAndTools.Totems;

import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;

public class SunshineTotemBase extends AbstractTotemBase {
    public SunshineTotemBase(Settings settings) {
        super(settings);
    }

    @Override
    public boolean canSetWeather(World world) {
        return world.isRaining();
    }

    @Override
    public void setWeather(ServerWorld world) {
        world.setWeather(MAX_DURATION, 0, false, false);
    }
}