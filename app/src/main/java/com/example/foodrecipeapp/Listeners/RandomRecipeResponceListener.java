package com.example.foodrecipeapp.Listeners;

import com.example.foodrecipeapp.Models.RandomRecipeApiResponse;

public interface RandomRecipeResponceListener {
    void didFetch(RandomRecipeApiResponse response, String message);
    void didError(String message);
}
