package com.example.loginscreen.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.loginscreen.Delivery
import com.example.loginscreen.Login
import com.example.loginscreen.shopping.Details

@Composable
fun AppNavigator(navHostController:NavHostController) {

    NavHost(navController =navHostController , startDestination ="onboard") {
        composable("onboard"){
            Delivery{navHostController.navigate("Login")}
        }
        composable("Login"){
            Login{
                navHostController.navigate("Details")
            }
        }
        composable("Details"){
            Details()
        }
    }

}