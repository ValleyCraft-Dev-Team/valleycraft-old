package io.github.linkle.valleycraft.config.enums;

import java.util.function.Predicate;

import net.minecraft.entity.Entity;

public enum EntityCondition implements Predicate<Entity> {
    ALL, PLAYER, DISABLE;

    @Override
    public boolean test(Entity entity) {
        return switch (this) {
        case ALL -> true;
        case PLAYER -> entity.isPlayer();
        case DISABLE -> false;
        };
    }

    @Override
    public String toString() {
        return switch (this) {
        case ALL -> "All";
        case PLAYER -> "Player Only";
        case DISABLE -> "Disable";
        };
    }
}