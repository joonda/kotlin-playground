package com.example.myrecipeapp

sealed class Screen(val route: String) {
    object RecipeScreen: Screen("recipe-screen")
    object DetailScreen: Screen("detail-screen")
}