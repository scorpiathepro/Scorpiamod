package com.scorpiathepro.scorpiamod.block;


import com.scorpiathepro.scorpiamod.ScorpiaMod;
import com.scorpiathepro.scorpiamod.block.custom.GrindingStationBlock;
import com.scorpiathepro.scorpiamod.block.custom.RealDragonFruitCropBlock;
import com.scorpiathepro.scorpiamod.block.custom.SpawnerCore;
import com.scorpiathepro.scorpiamod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import com.scorpiathepro.scorpiamod.item.ModCreativeModeTab;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ScorpiaMod.MOD_ID);
   public static final RegistryObject<Block> Harden_Endstone = registerBlock("harden_endstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.SCORPIA_TAB);

    public static final RegistryObject<Block> Dragon_Ore = registerBlock("dragon_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(12f).requiresCorrectToolForDrops()), ModCreativeModeTab.SCORPIA_TAB);

    public static final RegistryObject<Block> Dragon_Block = registerBlock("dragon_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(14f).requiresCorrectToolForDrops()), ModCreativeModeTab.SCORPIA_TAB);


    public static final RegistryObject<Block> Spawner_Bars = registerBlock("spawner_bars",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(8f).requiresCorrectToolForDrops()), ModCreativeModeTab.SCORPIA_TAB);

    public static final RegistryObject<Block> Spawner_Core = registerBlock("spawner_core",
            () -> new SpawnerCore(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(8f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.SCORPIA_TAB);

    public static final RegistryObject<Block> Grinding_Station = registerBlock("grinding_station",
            () -> new GrindingStationBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).noOcclusion()), ModCreativeModeTab.SCORPIA_TAB);

    public static final RegistryObject<Block> Real_Dragon_Fruit_Crop = BLOCKS.register("real_dragon_fruit_crop",
            () -> new RealDragonFruitCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}