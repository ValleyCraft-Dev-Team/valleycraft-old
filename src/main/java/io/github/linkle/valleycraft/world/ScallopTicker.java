package io.github.linkle.valleycraft.world;

import io.github.linkle.valleycraft.blocks.plants.aquatic.GiantClamBlock;
import net.minecraft.block.BlockState;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction.Axis;
import net.minecraft.util.math.Direction.AxisDirection;
import net.minecraft.util.math.MathHelper;

import static net.minecraft.util.math.MathHelper.nextDouble;

public class ScallopTicker extends WorldTicker {
    
    private final ClientWorld world;
    private final BlockPos pos;
    private int timer;
    private double power;

    public ScallopTicker(ClientWorld world, BlockPos pos) {
        super(GiantClamBlock.MAX_TICK);
        this.world = world;
        this.pos = pos.toImmutable();
        power = 2;
    }

    @Override
    public Reason tick() {
        var state = world.getBlockState(pos);
        if (!(state.getBlock() instanceof GiantClamBlock)) {
            return Reason.DELETE;
        }
        
        if ((tick&1) == 0 && tick > 7) {
            return Reason.CONTINUE;
        }
        
        var random = world.random;
        var face = state.get(Properties.HORIZONTAL_FACING).getOpposite();
        var wise = face.rotateYClockwise();
        double xScl = Math.abs(wise.getOffsetX());
        double zScl = Math.abs(wise.getOffsetZ());
        
        double xPos = pos.getX() + 0.5 + (face.getOffsetX() * 0.2) + (nextDouble(random, -0.3, 0.3) * xScl);
        double yPos = pos.getY() + nextDouble(random, 0.2, 0.45);
        double zPos = pos.getZ() + 0.5 + (face.getOffsetZ() * 0.2) + (nextDouble(random, -0.3, 0.3) * zScl);
        double xVel = face.getOffsetX() * nextDouble(random, 0.5, 1.1);
        double yVel = nextDouble(random, 0.2, 0.8);
        double zVel = face.getOffsetZ() * nextDouble(random, 0.5, 1.1);
        
        xPos += random.nextDouble() * face.getOffsetX() * 0.3;
        zPos += random.nextDouble() * face.getOffsetZ() * 0.3;
        
        xVel += nextDouble(random, -0.1, 0.1) * xScl;
        zVel += nextDouble(random, -0.1, 0.1) * zScl;
        
        world.addParticle(ParticleTypes.BUBBLE_COLUMN_UP, xPos, yPos, zPos, xVel, yVel, zVel);
        
        return Reason.CONTINUE;
    }

    @Override
    public void end(boolean isDelete) {
        BlockState state;
        if (isDelete || !((state = world.getBlockState(pos)).getBlock() instanceof GiantClamBlock)) return;
        var random = world.random;
        var face = state.get(Properties.HORIZONTAL_FACING);
        var limit = 0.6;
        for (int i = 0; i < 16; i++) {
            var angle = random.nextDouble() * Math.PI * 2.0;
            var sin = Math.sin(angle);
            var cos = Math.cos(angle);
            
            if (face.getAxis() == Axis.X) {
                if (face.getDirection() == AxisDirection.POSITIVE) {
                    if (sin > limit) continue;
                } else {
                    if (sin < -limit) continue;
                }
            } else {
                if (face.getDirection() == AxisDirection.POSITIVE) {
                    if (cos > limit) continue;
                } else {
                    if (cos < -limit) continue;
                }
            }
            
            sin *= 0.4;
            cos *= 0.4;
            
            var x = pos.getX() + 0.5 + sin;
            var z = pos.getZ() + 0.5 + cos;
            var y = pos.getY() + 0.25;
            
            sin *= nextDouble(random, 1.15, 1.4);
            cos *= nextDouble(random, 1.15, 1.4);
            
            world.addParticle(ParticleTypes.BUBBLE_COLUMN_UP, x, y, z, sin, nextDouble(random, 0.1, 0.5), cos);
        }
    }
}
