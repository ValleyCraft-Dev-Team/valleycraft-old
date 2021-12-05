package net.linkle.valley.Registry.Criterion;

import org.jetbrains.annotations.Nullable;

import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;

import net.linkle.valley.ValleyMain;
import net.minecraft.advancement.criterion.AbstractCriterion;
import net.minecraft.advancement.criterion.AbstractCriterionConditions;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.predicate.entity.AdvancementEntityPredicateDeserializer;
import net.minecraft.predicate.entity.AdvancementEntityPredicateSerializer;
import net.minecraft.predicate.entity.EntityPredicate.Extended;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;
import net.minecraft.util.registry.Registry;

public class BrokeBlockCriterion extends AbstractCriterion<BrokeBlockCriterion.Conditions> {
    private static final Identifier ID = new Identifier(ValleyMain.MOD_ID, "broke_block");

    @Override
    public Identifier getId() {
        return ID;
    }

    @Override
    protected Conditions conditionsFromJson(JsonObject jsonObject, Extended playerPredicate,
            AdvancementEntityPredicateDeserializer predicateDeserializer) {
        var block = getBlock(jsonObject);
        var statePredicate = StatePredicate.fromJson(jsonObject.get("state"));
        if (block != null) {
            statePredicate.check(block.getStateManager(), (name) -> {
                throw new JsonSyntaxException("Block " + block + " has no property " + name + ":");
            });
        }

        return new BrokeBlockCriterion.Conditions(block, statePredicate, playerPredicate);
    }

    @Nullable
    private static Block getBlock(JsonObject obj) {
        if (obj.has("block")) {
            Identifier identifier = new Identifier(JsonHelper.getString(obj, "block"));
            return (Block) Registry.BLOCK.getOrEmpty(identifier).orElseThrow(() -> {
                return new JsonSyntaxException("Unknown block type '" + identifier + "'");
            });
        } else {
            return null;
        }
    }

    public void trigger(ServerPlayerEntity player, BlockState state) {
        this.trigger(player, (conditions) -> {
            return conditions.matches(state);
        });
    }

    static class Conditions extends AbstractCriterionConditions {
        private final Block block;
        private final StatePredicate state;

        public Conditions(Block block, StatePredicate state, Extended player) {
            super(ID, player);
            this.block = block;
            this.state = state;
        }

        public boolean matches(BlockState state) {
            if (this.block != null && !state.isOf(this.block)) {
                return false;
            }
            if (!this.state.test(state)) {
                return false;
            }

            return true;
        }

        @Override
        public JsonObject toJson(AdvancementEntityPredicateSerializer predicateSerializer) {
            JsonObject jsonObject = super.toJson(predicateSerializer);
            if (block != null) {
                jsonObject.addProperty("block", Registry.BLOCK.getId(block).toString());
            }

            jsonObject.add("state", state.toJson());
            return jsonObject;
        }
    }
}
