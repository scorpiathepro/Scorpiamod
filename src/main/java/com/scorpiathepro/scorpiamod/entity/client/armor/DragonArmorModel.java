package com.scorpiathepro.scorpiamod.entity.client.armor;

import com.scorpiathepro.scorpiamod.ScorpiaMod;
import com.scorpiathepro.scorpiamod.item.custom.DragonArmorItem;
import net.minecraft.resources.ResourceLocation;

import software.bernie.geckolib3.model.AnimatedGeoModel;


public class DragonArmorModel extends AnimatedGeoModel<DragonArmorItem> {


    @Override
    public ResourceLocation getModelResource(DragonArmorItem object) {
        return new ResourceLocation(ScorpiaMod.MOD_ID, "geo/dragon_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(DragonArmorItem object) {
        return new ResourceLocation(ScorpiaMod.MOD_ID, "textures/models/armor/dragon_armor_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(DragonArmorItem animatable) {
        return new ResourceLocation(ScorpiaMod.MOD_ID, "animations/armor_animation.json");
    }
}
