package net.linkle.valley.Registry.WeaponsAndTools.Hatchets;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

import static net.linkle.valley.Registry.Initializers.ItemGroups.EXPLORATION_GROUP;

public class DiamondHatchetBase extends AxeItem {
    public DiamondHatchetBase(ToolMaterial DiamondToolMaterialKnife) {
        super(DiamondToolMaterialKnife, 7, -2.4f, new Settings().group(EXPLORATION_GROUP
                //aD 0 = 1
                //aS 0 = 4

                //netherite axe aD 10, aS 1
                //n h9, 1.6
                //diamond axe aD 9, aS 1
                //d h8, 1.6
                //gold axe aD 7, aS 1
                //g h6, 1.6
                //iron axe aD 9, aS 0.9
                //i h 8, 1.5
                //stone axe aD 9, aS 0.8
                //s h 8, 1.4
                //wood axe aD 7, aS 0.8
                //w h 6, 1.4

                //n h 1, 4
                //n s 4, 1
                //d h 1, 4
                //d s 3, 0.9
                //i h 1, 3
                //i s 3, 0.8
                //g h 1, 1
                //g s 3, 0.6
                //s h 1, 2
                //s s 3, 0.7
                //w h 1, 1
                //w s 3, 0.6

                //n s 8, 1.6
                //n k 6, 2
                //d s 7, 1.6
                //d k 5, 2
                //i s 6, 1.6
                //i k 4, 2
                //g s 4, 1.6
                //g k 3, 1.8
                //s s 5, 1.6
                //s k 3.5, 2
                //w s 4, 1.4
                //w k 3, 1.8
));
    }
}


