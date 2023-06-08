package com.scorpiathepro.scorpiamod.block.entity;

import com.scorpiathepro.scorpiamod.ScorpiaMod;
import com.scorpiathepro.scorpiamod.block.ModBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ScorpiaMod.MOD_ID);

    public static final RegistryObject<BlockEntityType<GrindingStationBlockEntity>> Grinding_Station =
            BLOCK_ENTITIES.register("grinding_station", () ->
                    BlockEntityType.Builder.of(GrindingStationBlockEntity::new,
                            ModBlocks.Grinding_Station.get()).build(null));






    public static void register(IEventBus eventBus){
        BLOCK_ENTITIES.register(eventBus);
    }
}
