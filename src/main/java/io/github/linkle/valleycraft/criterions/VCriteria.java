package io.github.linkle.valleycraft.criterions;

import io.github.linkle.valleycraft.mixins.CriteriaInvoker;

public class VCriteria {
    public static final BrokeBlockCriterion BROKE_BLOCK = CriteriaInvoker.register(new BrokeBlockCriterion());
    public static final HardCodedCriterion SPIDER_SPAWN = CriteriaInvoker.register(new HardCodedCriterion("spider_spawn"));
}
