package com.scorpiathepro.scorpiamod.item;

import com.scorpiathepro.scorpiamod.ScorpiaMod;
import com.scorpiathepro.scorpiamod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static Tier DRAGON;

    static {
        DRAGON = TierSortingRegistry.registerTier(
                new ForgeTier(5, 3000, 13f, 6f, 24,
                        ModTags.Blocks.NEEDS_DRAGON_TOOL, () -> Ingredient.of(ModItems.Dragon_Shell.get())),
                new ResourceLocation(ScorpiaMod.MOD_ID, "dragon"), List.of(Tiers.NETHERITE), List.of());
    }
}
