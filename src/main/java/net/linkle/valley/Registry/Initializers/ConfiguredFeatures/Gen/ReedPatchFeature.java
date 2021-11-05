package net.linkle.valley.Registry.Initializers.ConfiguredFeatures.Gen;

import net.linkle.valley.Registry.Initializers.Plants;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.util.FeatureContext;

public class ReedPatchFeature extends Feature<DefaultFeatureConfig> {
    
    private static final IntProvider COUNTS = UniformIntProvider.create(3, 5);
    private static final int SIZE = 4;
    
    private final BlockState state;

    public ReedPatchFeature() {
        super(DefaultFeatureConfig.CODEC);
        state = Plants.REED_BLOCK.getDefaultState();
    }

    @Override
    public boolean generate(FeatureContext<DefaultFeatureConfig> context) {
        var random = context.getRandom();
        var origin = context.getOrigin();
        var world = context.getWorld();
        var amount = COUNTS.get(random);
        var mutable = new BlockPos.Mutable();
        var spawned = 0;
        
        for (int i = 0; i < amount; i++) {
            int xPos = random.nextInt(SIZE) - random.nextInt(SIZE);
            int zPos = random.nextInt(SIZE) - random.nextInt(SIZE);
            mutable.set(origin, xPos, 0, zPos);
            
            if (isWater(world, mutable) && state.canPlaceAt(world, mutable)) {
                world.setBlockState(mutable, state, Block.NOTIFY_LISTENERS);
                spawned++;
            }
        }
        
        return spawned > 0;
    }
    
    private static boolean isWater(StructureWorldAccess world, BlockPos pos) {
        var state = world.getFluidState(pos);
        return state.isIn(FluidTags.WATER) && state.getLevel() == 8;
    }
}
