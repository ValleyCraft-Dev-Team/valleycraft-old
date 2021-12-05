package net.linkle.valley.Registry.Criterion;

import static net.linkle.valley.Registry.Mixin.CriteriaInvoker.register;

public class VCriteria {
    public static final BrokeBlockCriterion BROKE_BLOCK = register(new BrokeBlockCriterion());
    public static final HardCodedCriterion SPIDER_SPAWN = register(new HardCodedCriterion("spider_spawn"));
}
