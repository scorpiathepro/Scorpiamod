package com.scorpiathepro.scorpiamod.integration;

import com.scorpiathepro.scorpiamod.ScorpiaMod;
import com.scorpiathepro.scorpiamod.block.ModBlocks;
import com.scorpiathepro.scorpiamod.recipe.GrindingStationRecipe;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

public class GrindingStationRecipeCategory implements IRecipeCategory<GrindingStationRecipe> {
    public final static ResourceLocation UID = new ResourceLocation(ScorpiaMod.MOD_ID, "grinding");
    public final static ResourceLocation TEXTURE =
            new ResourceLocation(ScorpiaMod.MOD_ID, "textures/gui/grinding_station_gui.png");

    private final IDrawable background;
    private final IDrawable icon;

    public GrindingStationRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(ModBlocks.Grinding_Station.get()));
    }

    @Override
    public RecipeType<GrindingStationRecipe> getRecipeType() {
        return JEIScorpiaModPlugin.GRINDING_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.literal("Grinding Station");
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, GrindingStationRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 86, 15).addIngredients(recipe.getIngredients().get(0));

        builder.addSlot(RecipeIngredientRole.OUTPUT, 86, 60).addItemStack(recipe.getResultItem());
    }
}
