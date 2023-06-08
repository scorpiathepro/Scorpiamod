package com.scorpiathepro.scorpiamod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.scorpiathepro.scorpiamod.ScorpiaMod;
import com.scorpiathepro.scorpiamod.entity.custom.ScorpionEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class ScorpionRenderer extends GeoEntityRenderer<ScorpionEntity> {
    public ScorpionRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new ScorpionModel());
        this.shadowRadius = 0.2f;
    }

    @Override
    public ResourceLocation getTextureLocation(ScorpionEntity instance) {
        return new ResourceLocation(ScorpiaMod.MOD_ID, "textures/entity/scorpion_texture.png");
    }

    @Override
    public RenderType getRenderType(ScorpionEntity animatable, float partialTick, PoseStack poseStack,
                                    @Nullable MultiBufferSource bufferSource,
                                    @Nullable VertexConsumer buffer, int packedLight,
                                    ResourceLocation texture) {
        poseStack.scale(0.4f, 0.4f, 0.4f);

        return super.getRenderType(animatable, partialTick, poseStack, bufferSource, buffer, packedLight, texture);
    }
}
