package com.example.myrecipeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.navigation.compose.rememberNavController
import com.example.myrecipeapp.ui.theme.MyRecipeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            val isDark = isSystemInDarkTheme()
            enableEdgeToEdge(
                statusBarStyle = if(isDark) {
                    SystemBarStyle.dark(Color.Black.toArgb())
                } else {
                    SystemBarStyle.light(scrim = Color.White.toArgb(), darkScrim = Color.White.toArgb())
                }
            )
            MyRecipeAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    RecipeApp(navController = navController, Modifier.padding(innerPadding))
                }
            }
        }
    }
}
