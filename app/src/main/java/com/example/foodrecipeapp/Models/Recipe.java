package com.example.foodrecipeapp.Models;

import java.util.ArrayList;

public class Recipe{
    public boolean vegetarian;
    public boolean vegan;
    public boolean glutenFree;
    public boolean dairyFree;
    public boolean veryHealthy;
    public boolean cheap;
    public boolean veryPopular;
    public boolean sustainable;
    public boolean lowFodmap;
    public int weightWatcherSmartPoints;
    public String gaps;
    public int preparationMinutes;
    public int cookingMinutes;
    public int aggregateLikes;
    public int healthScore;
    public String creditsText;
    public String license;
    public String sourceName;
    public double pricePerServing;
    public ArrayList<ExtendedIngredient> extendedIngredients;
    public int id;
    public String title;
    public int readyInMinutes;
    public int servings;
    public String sourceUrl;
    public String image;
    public String imageType;
    public String summary;
    public ArrayList<Object> cuisines;
    public ArrayList<String> dishTypes;
    public ArrayList<Object> diets;
    public ArrayList<String> occasions;
    public String instructions;
    public ArrayList<AnalyzedInstruction> analyzedInstructions;
    public Object originalId;
    public double spoonacularScore;
    public String spoonacularSourceUrl;
}
