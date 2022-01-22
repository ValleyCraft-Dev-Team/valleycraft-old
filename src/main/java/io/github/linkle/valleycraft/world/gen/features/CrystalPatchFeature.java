package io.github.linkle.valleycraft.world.gen.features;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.state.property.Properties;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.Heightmap.Type;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.util.FeatureContext;

public class CrystalPatchFeature extends Feature<CrystalPatchConfig> {

    public CrystalPatchFeature() {
        super(CrystalPatchConfig.CODEC);
    }

    @Override
    public boolean generate(FeatureContext<CrystalPatchConfig> context) {
        var config = context.getConfig();
        var random = context.getRandom();
        var origin = context.getOrigin();
        var world = context.getWorld();
        var mutable = new BlockPos.Mutable();
        var state = config.state();
        var list = new ArrayList<BlockState>(6);

        int spread = config.spread();
        int tries = config.tries();
        int spawned = 0;
        
        for (int i = 0; i < tries; ++i) {
            int xOffset = random.nextInt(spread*2) - spread;
            int yOffset = random.nextInt(spread*2) - spread;
            int zOffset = random.nextInt(spread*2) - spread;
            mutable.set(origin, xOffset, yOffset, zOffset);
            
            if (!world.isWater(mutable)) continue;
            
            
            int topY = world.getTopY(Type.OCEAN_FLOOR, mutable.getX(), mutable.getZ());
            boolean exit = topY <= mutable.getY();
            
            for (int j = 0; j < 6; j++) {
                var face = Direction.byId(i);
                var newState = state.with(Properties.FACING, face);
                if (newState.canPlaceAt(world, mutable)) {
                    
                    if (exit) {
                        var ground = world.getBlockState(mutable.offset(face.getOpposite()));
                        
                        boolean bool = 
                        ground.isIn(BlockTags.BASE_STONE_OVERWORLD) ||
                        ground.isOf(Blocks.PRISMARINE) ||
                        ground.isOf(Blocks.PRISMARINE_BRICKS) ||
                        ground.isOf(Blocks.DARK_PRISMARINE);
                        
                        if (!bool) {
                            continue;
                        }
                    }
                    
                    list.add(newState);
                }
            }
            
            if (!list.isEmpty()) {
                world.setBlockState(mutable, Util.getRandom(list, random), Block.NOTIFY_LISTENERS);
                list.clear();
                spawned++;
            }
        }

        return spawned > 0;
    }
}
