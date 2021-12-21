package io.github.linkle.valleycraft.criterions;

import com.google.gson.JsonObject;
import io.github.linkle.valleycraft.ValleyMain;
import net.minecraft.advancement.criterion.AbstractCriterion;
import net.minecraft.advancement.criterion.AbstractCriterionConditions;
import net.minecraft.predicate.entity.AdvancementEntityPredicateDeserializer;
import net.minecraft.predicate.entity.EntityPredicate.Extended;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;

/**
 * A criteria class that can be used to trigger advancement in java code. Use;
 * <code>"trigger": "valley:YOUR_CRITERIA_ID"</code>. It is recommended to have
 * criteria a different ID for each one advancement. So it doesn't trigger more
 * than one advancement.
 */
public class HardCodedCriterion extends AbstractCriterion<HardCodedCriterion.Conditions> {
    private final Identifier id;

    /**
     * Use; <code>"trigger": "valley:YOUR_CRITERIA_ID"</code>. It is recommended to
     * have criteria a different ID for each one advancement. So it doesn't trigger
     * more than one advancement.
     */
    HardCodedCriterion(String id) {
        this.id = new Identifier(ValleyMain.MOD_ID, id);
    }

    public void trigger(ServerPlayerEntity player) {
        trigger(player, conditions -> true);
    }

    @Override
    public Identifier getId() {
        return id;
    }

    @Override
    protected Conditions conditionsFromJson(JsonObject obj, Extended playerPredicate,
            AdvancementEntityPredicateDeserializer predicateDeserializer) {
        return new Conditions(id, playerPredicate);
    }

    static class Conditions extends AbstractCriterionConditions {
        Conditions(Identifier id, Extended player) {
            super(id, player);
        }
    }
}
