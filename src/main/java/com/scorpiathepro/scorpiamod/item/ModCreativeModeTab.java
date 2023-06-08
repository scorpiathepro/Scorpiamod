package com.scorpiathepro.scorpiamod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab SCORPIA_TAB = new CreativeModeTab("scorpiatab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.Dragon_Shell.get());
        }
    };
}

