package com.scorpiathepro.scorpiamod.integration;

import com.scorpiathepro.scorpiamod.ScorpiaMod;
import com.scorpiathepro.scorpiamod.recipe.GrindingStationRecipe;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.List;
import java.util.Objects;

@JeiPlugin
public class JEIScorpiaModPlugin implements IModPlugin {
    public static RecipeType<GrindingStationRecipe> GRINDING_TYPE =
            new RecipeType<>(GrindingStationRecipeCategory.UID, GrindingStationRecipe.class);

    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(ScorpiaMod.MOD_ID, "jei_plugin");
    }


    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new
                GrindingStationRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager rm = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
        List<GrindingStationRecipe> recipesGrinding = rm.getAllRecipesFor(GrindingStationRecipe.Type.INSTANCE);
        registration.addRecipes(GRINDING_TYPE, recipesGrinding);
    }
}
