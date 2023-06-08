package com.scorpiathepro.scorpiamod.entity.client;

import com.scorpiathepro.scorpiamod.ScorpiaMod;
import com.scorpiathepro.scorpiamod.entity.custom.ScorpionEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ScorpionModel extends AnimatedGeoModel<ScorpionEntity> {


    @Override
    public ResourceLocation getModelResource(ScorpionEntity object) {
        return new ResourceLocation(ScorpiaMod.MOD_ID, "geo/scorpion.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ScorpionEntity object) {
        return new ResourceLocation(ScorpiaMod.MOD_ID, "textures/entity/scorpion_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ScorpionEntity animatable) {
        return new ResourceLocation(ScorpiaMod.MOD_ID, "animations/scorpion.animation.json");
    }
}