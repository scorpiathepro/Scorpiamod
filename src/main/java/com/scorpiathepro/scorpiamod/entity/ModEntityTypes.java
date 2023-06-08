package com.scorpiathepro.scorpiamod.entity;

import com.scorpiathepro.scorpiamod.ScorpiaMod;
import com.scorpiathepro.scorpiamod.entity.custom.ScorpionEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ScorpiaMod.MOD_ID);

    public static final RegistryObject<EntityType<ScorpionEntity>> Scorpion =
            ENTITY_TYPES.register("scorpion",
                    () -> EntityType.Builder.of(ScorpionEntity::new, MobCategory.MONSTER)
                            .sized(0.5f, 0.3f)
                            .build(new ResourceLocation(ScorpiaMod.MOD_ID, "scorpion").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
