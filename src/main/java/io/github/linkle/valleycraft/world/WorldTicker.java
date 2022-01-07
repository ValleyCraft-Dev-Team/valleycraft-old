package io.github.linkle.valleycraft.world;


public abstract class WorldTicker {
    public int tick;
    
    protected WorldTicker(int tick) {
        this.tick = tick;
    }
    
    public abstract Reason tick();
    
    public abstract void end(boolean isDelete);
    
    public static enum Reason {
        CONTINUE, STOP, DELETE;
        
        public boolean shouldStop() {
            return this != CONTINUE;
        }
    }
}
