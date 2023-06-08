package com.scorpiathepro.scorpiamod.item.custom;

import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.phys.EntityHitResult;

public class DragonBowItem extends BowItem {
    public DragonBowItem(Properties p_40660_) {
        super(p_40660_);
    }
    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
        pTarget.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 75), pAttacker);
        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }
}
