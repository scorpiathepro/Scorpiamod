package com.scorpiathepro.scorpiamod.item;

import com.scorpiathepro.scorpiamod.ScorpiaMod;
import com.scorpiathepro.scorpiamod.block.ModBlocks;
import com.scorpiathepro.scorpiamod.entity.ModEntityTypes;
import com.scorpiathepro.scorpiamod.item.custom.*;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ScorpiaMod.MOD_ID);

    public static final RegistryObject<Item> Dragon_Shell = ITEMS.register("dragon_shell",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCORPIA_TAB)));

    public static final RegistryObject<Item> Netherite_Dust = ITEMS.register("netherite_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCORPIA_TAB)));
    public static final RegistryObject<Item> Gold_Dust = ITEMS.register("gold_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCORPIA_TAB)));
    public static final RegistryObject<Item> Iron_Dust = ITEMS.register("iron_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCORPIA_TAB)));
    public static final RegistryObject<Item> Emerald_Dust = ITEMS.register("emerald_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCORPIA_TAB)));
    public static final RegistryObject<Item> Copper_Dust = ITEMS.register("copper_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCORPIA_TAB)));
    public static final RegistryObject<Item> Dragon_Dust = ITEMS.register("dragon_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCORPIA_TAB)));
    public static final RegistryObject<Item> Diamond_Dust = ITEMS.register("diamond_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCORPIA_TAB)));

    public static final RegistryObject<Item> Iron_Blade = ITEMS.register("iron_blade",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCORPIA_TAB)));

    public static final RegistryObject<Item> Real_Dragon_Fruit = ITEMS.register("real_dragon_fruit",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCORPIA_TAB)
                    .food(new FoodProperties.Builder().nutrition(3).saturationMod(2f).build())));

    public static final RegistryObject<Item> Real_Dragon_Fruit_Seed = ITEMS.register("real_dragon_fruit_seed",
            () -> new ItemNameBlockItem(ModBlocks.Real_Dragon_Fruit_Crop.get(),
                    new Item.Properties().tab(ModCreativeModeTab.SCORPIA_TAB)));

    public static final RegistryObject<Item> Dragon_Leather = ITEMS.register("dragon_leather",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCORPIA_TAB)));

    public static final RegistryObject<Item> Dragon_Fragment = ITEMS.register("dragon_fragment",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCORPIA_TAB)));

    public static final RegistryObject<Item> Dragon_Helmet = ITEMS.register("dragon_helmet",
            () -> new DragonArmorItem(ModArmorMaterials.DRAGON , EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.SCORPIA_TAB)));

    public static final RegistryObject<Item> Dragon_Chestplate = ITEMS.register("dragon_chestplate",
            () -> new DragonArmorItem(ModArmorMaterials.DRAGON , EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.SCORPIA_TAB)));

    public static final RegistryObject<Item> Dragon_Leggins = ITEMS.register("dragon_leggins",
            () -> new DragonArmorItem(ModArmorMaterials.DRAGON , EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.SCORPIA_TAB)));

    public static final RegistryObject<Item> Dragon_Boots = ITEMS.register("dragon_boots",
            () -> new DragonArmorItem(ModArmorMaterials.DRAGON , EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.SCORPIA_TAB)));

    public static final RegistryObject<Item> Dragon_Eye = ITEMS.register("dragon_eye",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCORPIA_TAB)));
    public static final RegistryObject<Item> Scorpion_Sting = ITEMS.register("scorpion_sting",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCORPIA_TAB)));
    public static final RegistryObject<Item> Egg_Shell = ITEMS.register("egg_shell",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCORPIA_TAB)));
    public static final RegistryObject<Item> Arrow = ITEMS.register("arrow",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCORPIA_TAB)));

    public static final RegistryObject<Item> Dragon_Bow = ITEMS.register("dragon_bow",
            () -> new DragonBowItem(new Item.Properties().tab(ModCreativeModeTab.SCORPIA_TAB).stacksTo(1)));

    public static final RegistryObject<Item> Dragon_Pickaxe = ITEMS.register("dragon_pickaxe",
            () -> new PickaxeItem(ModToolTiers.DRAGON, 1, 1.5f,
                    new Item.Properties().tab(ModCreativeModeTab.SCORPIA_TAB).stacksTo(1)));

    public static final RegistryObject<Item> Scorpion_Sword = ITEMS.register("scorpion_sword",
            () -> new PoisonSwordItem(Tiers.NETHERITE, 3, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.SCORPIA_TAB).stacksTo(1)));

    public static final RegistryObject<Item> Diamond_Detector = ITEMS.register("diamond_detector",
            () -> new DiamondDetectorItem(new Item.Properties().tab(ModCreativeModeTab.SCORPIA_TAB).durability(16)));
    public static final RegistryObject<Item> Dragon_Ore_Detector = ITEMS.register("dragon_ore_detector",
            () -> new DragonOreDetectorItem(new Item.Properties().tab(ModCreativeModeTab.SCORPIA_TAB).durability(16)));
    public static final RegistryObject<Item> Iron_Detector = ITEMS.register("iron_detector",
            () -> new IronDetectorItem(new Item.Properties().tab(ModCreativeModeTab.SCORPIA_TAB).durability(16)));
    public static final RegistryObject<Item> Gold_Detector = ITEMS.register("gold_detector",
            () -> new GoldDetectorItem(new Item.Properties().tab(ModCreativeModeTab.SCORPIA_TAB).durability(16)));
    public static final RegistryObject<Item> Netherite_Detector = ITEMS.register("netherite_detector",
            () -> new NetheriteDetectorItem(new Item.Properties().tab(ModCreativeModeTab.SCORPIA_TAB).durability(16)));
    public static final RegistryObject<Item> Emerald_Detector = ITEMS.register("emerald_detector",
            () -> new EmeraldDetectorItem(new Item.Properties().tab(ModCreativeModeTab.SCORPIA_TAB).durability(16)));
    public static final RegistryObject<Item> Copper_Detector = ITEMS.register("copper_detector",
            () -> new CopperDetectorItem(new Item.Properties().tab(ModCreativeModeTab.SCORPIA_TAB).durability(16)));

    public static final RegistryObject<Item> Scorpion_Spawn_Egg = ITEMS.register("scorpion_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.Scorpion, 0x582e0c, 0xbea982,
                    new Item.Properties().tab(ModCreativeModeTab.SCORPIA_TAB)));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
