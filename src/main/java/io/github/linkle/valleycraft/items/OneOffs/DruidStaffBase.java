package io.github.linkle.valleycraft.items.OneOffs;

import static net.minecraft.item.Items.BONE_MEAL;

import io.github.linkle.valleycraft.init.ItemGroups;
import io.github.linkle.valleycraft.utils.VItemUsageContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;

public class DruidStaffBase extends Item {
    
    public DruidStaffBase() {
        super(new Settings().group(ItemGroups.EXPLORATION_GROUP).maxDamage(250));
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        var result = BONE_MEAL.useOnBlock(new VItemUsageContext(context, new ItemStack(this)));
        if (result.isAccepted()) {
            context.getStack().damage(1, context.getPlayer(), entity -> entity.sendToolBreakStatus(context.getHand()));
        }
        return result;
    }
}