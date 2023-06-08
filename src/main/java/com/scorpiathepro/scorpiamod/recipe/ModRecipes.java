package com.scorpiathepro.scorpiamod.recipe;

import com.scorpiathepro.scorpiamod.ScorpiaMod;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, ScorpiaMod.MOD_ID);

    public static final RegistryObject<RecipeSerializer<GrindingStationRecipe>> Grinding_SERIALIZER =
            SERIALIZERS.register("grinding", () -> GrindingStationRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
