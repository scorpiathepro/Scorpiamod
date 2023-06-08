package com.scorpiathepro.scorpiamod.event;

import com.scorpiathepro.scorpiamod.ScorpiaMod;
import com.scorpiathepro.scorpiamod.entity.client.armor.DragonArmorRenderer;
import com.scorpiathepro.scorpiamod.item.custom.DragonArmorItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = ScorpiaMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventClientBusEvents {
    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {
        GeoArmorRenderer.registerArmorRenderer(DragonArmorItem.class, new DragonArmorRenderer());
    }
}
