package io.github.linkle.valleycraft.blocks.entity;

import static io.github.linkle.valleycraft.init.ItemGroups.FURNITURE_GROUP;

import io.github.linkle.valleycraft.ValleyMain;
import io.github.linkle.valleycraft.init.ItemGroups;
import io.github.linkle.valleycraft.init.Reg;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder.Factory;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockEntities {
    public static final Block BRICK_STOVE = new BrickFurnace(Block.Settings.copy(Blocks.FURNACE)
            .sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
            .luminance(s->7));

    public static final Block COBBLESTONE_STOVE = new BrickFurnace(Block.Settings.copy(BRICK_STOVE));
    public static final Block VOLCANIC_BRICK_STOVE = new BrickFurnace(Block.Settings.copy(BRICK_STOVE));
    public static final Block CARMINE_BRICK_STOVE = new BrickFurnace(Block.Settings.copy(BRICK_STOVE));

    public static final Block CRAB_TRAP = new CrabTrap();

    public static void ints() {
        var furnGroup = new BlockItem.Settings().group(FURNITURE_GROUP);

        Reg.register("brick_stove", new BlockItem(BRICK_STOVE, furnGroup));
        createBlockEntity("brick_stove", BRICK_STOVE, new BlockEntityFactory(BrickFurnaceEntity::new));

        Reg.register("cobblestone_stove", new BlockItem(COBBLESTONE_STOVE, furnGroup));
        createBlockEntity("cobblestone_stove", COBBLESTONE_STOVE, new BlockEntityFactory(BrickFurnaceEntity::new));

        Reg.register("carmine_brick_stove", new BlockItem(CARMINE_BRICK_STOVE, furnGroup));
        createBlockEntity("carmine_brick_stove", CARMINE_BRICK_STOVE, new BlockEntityFactory(BrickFurnaceEntity::new));

        Reg.register("volcanic_brick_stove", new BlockItem(VOLCANIC_BRICK_STOVE, furnGroup));
        createBlockEntity("volcanic_brick_stove", VOLCANIC_BRICK_STOVE, new BlockEntityFactory(BrickFurnaceEntity::new));

        Reg.register("crab_trap", new BlockItem(CRAB_TRAP, new BlockItem.Settings().group(ItemGroups.FISHING_GROUP)));
        CrabTrap.BLOCK_ENTITY = createBlockEntity("crab_trap", CRAB_TRAP, CrabTrapEntity::new);
    }

    private static <T extends BlockEntity> BlockEntityType<T> createBlockEntity(String id, Block block, Factory<T> factory) {
        var entity = FabricBlockEntityTypeBuilder.create(factory, block).build();
        if (factory instanceof BlockEntityFactory fact) {
            fact.type = entity;
        } if (block instanceof MultiBlockEntity multi) {
            multi.setType(entity);
        }
        return Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(ValleyMain.MOD_ID, id), entity);
    }
}
