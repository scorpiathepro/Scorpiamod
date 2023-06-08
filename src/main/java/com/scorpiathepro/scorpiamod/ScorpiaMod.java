package com.scorpiathepro.scorpiamod;

import com.mojang.logging.LogUtils;
import com.scorpiathepro.scorpiamod.block.ModBlocks;
import com.scorpiathepro.scorpiamod.block.entity.ModBlockEntities;
import com.scorpiathepro.scorpiamod.entity.ModEntityTypes;
import com.scorpiathepro.scorpiamod.entity.client.ScorpionRenderer;
import com.scorpiathepro.scorpiamod.item.ModItems;
import com.scorpiathepro.scorpiamod.loot.ModLootModifiers;
import com.scorpiathepro.scorpiamod.recipe.ModRecipes;
import com.scorpiathepro.scorpiamod.screen.GrindingStationScreen;
import com.scorpiathepro.scorpiamod.screen.ModMenuTypes;
import com.scorpiathepro.scorpiamod.util.ModItemProperties;
import com.scorpiathepro.scorpiamod.world.feature.ModConfiguredFeatures;
import com.scorpiathepro.scorpiamod.world.feature.ModPlacedFeatures;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import software.bernie.geckolib3.GeckoLib;

import java.awt.*;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ScorpiaMod.MOD_ID)
public class ScorpiaMod {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "scorpiamod";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    public ScorpiaMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModBlockEntities.register(modEventBus);
        ModMenuTypes.register(modEventBus);
        ModRecipes.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        ModConfiguredFeatures.register(modEventBus);
        ModPlacedFeatures.register(modEventBus);

        ModEntityTypes.register(modEventBus);

        ModLootModifiers.register(modEventBus);

        GeckoLib.initialize();


        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            SpawnPlacements.register(ModEntityTypes.Scorpion.get(),
                    SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Monster::checkMonsterSpawnRules);
        });




    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

            ModItemProperties.addCustomItemProperties();

            EntityRenderers.register(ModEntityTypes.Scorpion.get(), ScorpionRenderer::new);

            ItemBlockRenderTypes.setRenderLayer(ModBlocks.Spawner_Bars.get(), RenderType.translucent());

            ItemBlockRenderTypes.setRenderLayer(ModBlocks.Real_Dragon_Fruit_Crop.get(), RenderType.cutout());

            MenuScreens.register(ModMenuTypes.Grinding_Station_Menu.get(), GrindingStationScreen::new);
        }
    }
}
