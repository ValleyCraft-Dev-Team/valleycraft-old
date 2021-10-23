package net.linkle.valley.Registry.Entity;

import net.linkle.valley.Registry.Initializers.Entities;
import net.linkle.valley.Registry.Initializers.MiscItems;
import net.linkle.valley.Registry.Initializers.Sounds;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.AnimalMateGoal;
import net.minecraft.entity.ai.goal.EscapeDangerGoal;
import net.minecraft.entity.ai.goal.FollowParentGoal;
import net.minecraft.entity.ai.goal.LookAroundGoal;
import net.minecraft.entity.ai.goal.LookAtEntityGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.TemptGoal;
import net.minecraft.entity.ai.goal.WanderAroundFarGoal;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.recipe.Ingredient;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;

public class DuckEntity extends ChickenEntity {
    
    private static final Ingredient BREEDING_INGREDIENT;
    private static final int DROP_DURATION = 6000;
    
    private int dropFeatherTime;
    private int duckEggLayTime;

    public DuckEntity(EntityType<? extends ChickenEntity> entityType, World world) {
        super(entityType, world);
        dropFeatherTime = getRandomTime();
        duckEggLayTime  = getRandomTime();
    }
    
    @Override
    protected void initGoals() {
        goalSelector.add(0, new SwimGoal(this));
        goalSelector.add(1, new EscapeDangerGoal(this, 1.4D));
        goalSelector.add(2, new AnimalMateGoal(this, 1.0D));
        goalSelector.add(3, new TemptGoal(this, 1.0D, BREEDING_INGREDIENT, false));
        goalSelector.add(4, new FollowParentGoal(this, 1.1D));
        goalSelector.add(5, new WanderAroundFarGoal(this, 1.0D));
        goalSelector.add(6, new LookAtEntityGoal(this, PlayerEntity.class, 6.0F));
        goalSelector.add(7, new LookAroundGoal(this));
    }

    @Override
    public ChickenEntity createChild(ServerWorld serverWorld, PassiveEntity passiveEntity) {
        return Entities.DUCK.create(serverWorld);
    }

    @Override
    public void tickMovement() {
        super.tickMovement();
        eggLayTime = DROP_DURATION; // Disable laying chicken egg.
        
        if (!world.isClient && isAlive() && !isBaby() && !hasJockey()) {
            if (--duckEggLayTime <= 0) {
                playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (random.nextFloat() - random.nextFloat()) * 0.2F + 1.0F);
                duckEggLayTime = getRandomTime();
                dropItem(MiscItems.DUCK_EGG);
            }
            if (--dropFeatherTime <= 0) {
                dropFeatherTime = getRandomTime();
                dropItem(Items.FEATHER);
            }
        }
    }
    
    @Override
    protected SoundEvent getAmbientSound() {
        return Sounds.DUCK_QUACK;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return Sounds.DUCK_QUACK;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return Sounds.DUCK_QUACK;
    }
    
    @Override
    public boolean isBreedingItem(ItemStack stack) {
        return BREEDING_INGREDIENT.test(stack);
    }
    
    @Override
    public void readCustomDataFromNbt(NbtCompound nbt) {
        super.readCustomDataFromNbt(nbt);
        dropFeatherTime = nbt.getInt("DropFeatherTime");
        duckEggLayTime  = nbt.getInt("DuckEggLayTime");
    }

    @Override
    public void writeCustomDataToNbt(NbtCompound nbt) {
        super.writeCustomDataToNbt(nbt);
        nbt.putInt("DropFeatherTime", dropFeatherTime);
        nbt.putInt("DuckEggLayTime", duckEggLayTime);
    }
    
    private int getRandomTime() {
        return random.nextInt(DROP_DURATION) + DROP_DURATION;
    }
    
    static {
        BREEDING_INGREDIENT = Ingredient.ofItems(Items.KELP);
    }
}
