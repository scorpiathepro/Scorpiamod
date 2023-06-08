package com.scorpiathepro.scorpiamod.event;

import com.scorpiathepro.scorpiamod.ScorpiaMod;
import com.scorpiathepro.scorpiamod.entity.ModEntityTypes;
import com.scorpiathepro.scorpiamod.entity.custom.ScorpionEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ScorpiaMod.MOD_ID)
public class ModEvents {
    @Mod.EventBusSubscriber(modid = ScorpiaMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEventBusEvents {
        @SubscribeEvent
        public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
            event.put(ModEntityTypes.Scorpion.get(), ScorpionEntity.setAttributes());
        }
    }
}

