package net.linkle.valley.Registry.Blocks.Plants.CropsSeeds;

import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;

public class VCropBlock extends CropBlock {
    protected static final Settings SETTINGS = Settings.copy(Blocks.WHEAT).nonOpaque();
    
    public VCropBlock() {
        super(SETTINGS);
    }
    
    public VCropBlock(Settings settings) {
        super(settings);
    }

    public ItemConvertible getSeedsItem() {
        return this;
    }
}
