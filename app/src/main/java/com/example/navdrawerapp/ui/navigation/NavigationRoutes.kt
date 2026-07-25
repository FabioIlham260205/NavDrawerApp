package com.example.navdrawerapp.ui.navigation

/**
 * File NavigationRoutes.kt
 * ========================
 * Mendefinisikan semua route navigasi yang digunakan dalam aplikasi.
 */

sealed class Screen(val route: String, val title: String) {

    object Home : Screen(
        route = "home",
        title = "Menu Utama"
    )

    object Screen1 : Screen(
        route = "screen_1",
        title = "Screen 1"
    )

    object Screen2 : Screen(
        route = "screen_2",
        title = "Screen 2"
    )

    object Screen3 : Screen(
        route = "screen_3",
        title = "Screen 3"
    )

    // Latihan 2a: Tambahkan Screen 4 dan Screen 5
    object Screen4 : Screen(
        route = "screen_4",
        title = "Screen 4"
    )

    object Screen5 : Screen(
        route = "screen_5",
        title = "Screen 5"
    )
}
