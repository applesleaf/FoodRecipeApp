package com.example.foodrecipeapp.Listeners;

import com.example.foodrecipeapp.Models.RecipeDetailResponse;

public interface RecipeDetailsListener {
    void didFetch(RecipeDetailResponse response, String message);
    void didError(String messasge);
}
