package com.example.navdrawerapp.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.navdrawerapp.ui.theme.NavDrawerAppTheme

@Composable
fun Screen4(
    onBackClick: () -> Unit
) {
    ScreenContent(
        title = "Screen 4",
        description = "Ini adalah Screen Keempat yang baru ditambahkan sesuai instruksi Latihan 2a.",
        buttonText = "Action Screen 4",
        onBackClick = onBackClick
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Screen4Preview() {
    NavDrawerAppTheme {
        Screen4(onBackClick = {})
    }
}
