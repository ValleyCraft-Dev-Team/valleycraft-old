package io.github.linkle.valleycraft.world;

import java.util.function.BooleanSupplier;

public class LambdaTicker extends WorldTicker {

    private final BooleanSupplier exe;

    public LambdaTicker(BooleanSupplier exe) {
        this(Integer.MAX_VALUE, exe);

    }

    public LambdaTicker(int tick, BooleanSupplier exe) {
        super(tick);
        this.exe = exe;
    }

    @Override
    public Reason tick() {
        return exe.getAsBoolean() ? Reason.STOP : Reason.CONTINUE;
    }

    @Override
    public void end(boolean isDelete) {

    }
}
