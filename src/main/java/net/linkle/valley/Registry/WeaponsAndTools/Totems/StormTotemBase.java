package net.linkle.valley.Registry.WeaponsAndTools.Totems;

import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;

public class StormTotemBase extends AbstractTotemBase {
    public StormTotemBase(Settings settings) {
        super(settings);
    }

    @Override
    public boolean canSetWeather(World world) {
        return !world.isThundering();
    }

    @Override
    public void setWeather(ServerWorld world) {
        world.setWeather(0, MAX_DURATION, true, true);
    }
}