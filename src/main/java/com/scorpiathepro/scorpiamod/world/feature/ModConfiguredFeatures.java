package com.scorpiathepro.scorpiamod.world.feature;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.scorpiathepro.scorpiamod.ScorpiaMod;
import com.scorpiathepro.scorpiamod.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, ScorpiaMod.MOD_ID);

    public static final Supplier<List<OreConfiguration.TargetBlockState>> DRAGON_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), ModBlocks.Dragon_Ore.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> DRAGON_ORE = CONFIGURED_FEATURES.register("dragon_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(DRAGON_ORES.get(), 4)));




    public static void register(IEventBus eventBus) {
        CONFIGURED_FEATURES.register(eventBus);
    }
}
