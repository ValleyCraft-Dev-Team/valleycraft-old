package io.github.linkle.valleycraft.utils;

import java.util.Random;

public class SeedRandom extends Random {
    private static final long serialVersionUID = 1L;
    
    private static final long multiplier = 0x5DEECE66DL;
    private static final long addend = 0xBL;
    private static final long mask = (1L << 48) - 1;

    public long seed;
    
    public SeedRandom() {
    }
    
    public SeedRandom(long seed) {
        super(seed);
    }
    
    @Override
    public void setSeed(long seed) {
        this.seed = seed;
    }
    
    @Override
    protected int next(int bits) {
        long oldseed, nextseed;
        do {
            oldseed = seed;
            nextseed = (oldseed * multiplier + addend) & mask;
        } while (!compareAndSet(oldseed, nextseed));
        return (int)(nextseed >>> (48 - bits));
    }
    
    private boolean compareAndSet(long oldseed, long nextseed) {
        var bool = seed == oldseed;
        if (bool) {
            seed = nextseed;
        }
        return bool;
    }
}
