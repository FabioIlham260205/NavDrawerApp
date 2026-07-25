package com.example.navdrawerapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.navdrawerapp.ui.screens.HomeScreen
import com.example.navdrawerapp.ui.screens.Screen1
import com.example.navdrawerapp.ui.screens.Screen2
import com.example.navdrawerapp.ui.screens.Screen3
import com.example.navdrawerapp.ui.screens.Screen4
import com.example.navdrawerapp.ui.screens.Screen5

/**
 * File NavGraph.kt
 * ================
 * Navigation Graph = peta navigasi seluruh halaman dalam aplikasi.
 */

@Composable
fun NavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(route = Screen.Home.route) {
            HomeScreen(
                onNavigateToScreen = { screen ->
                    navController.navigate(screen.route)
                }
            )
        }

        composable(route = Screen.Screen1.route) {
            Screen1(onBackClick = { navController.popBackStack() })
        }

        composable(route = Screen.Screen2.route) {
            Screen2(onBackClick = { navController.popBackStack() })
        }

        composable(route = Screen.Screen3.route) {
            Screen3(onBackClick = { navController.popBackStack() })
        }

        // Latihan 2a: Tambahkan route untuk Screen 4 dan Screen 5
        composable(route = Screen.Screen4.route) {
            Screen4(onBackClick = { navController.popBackStack() })
        }

        composable(route = Screen.Screen5.route) {
            Screen5(onBackClick = { navController.popBackStack() })
        }
    }
}
