package com.scorpiathepro.scorpiamod.world.feature;

import com.scorpiathepro.scorpiamod.ScorpiaMod;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, ScorpiaMod.MOD_ID);

    public static final RegistryObject<PlacedFeature> DRAGON_ORE_PLACED = PLACED_FEATURES.register("dragon_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.DRAGON_ORE.getHolder().get(), commonOrePlacement(6, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-11), VerticalAnchor.aboveBottom(57)))));



    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    public static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }



    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }
}
