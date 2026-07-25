package com.example.navdrawerapp.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.navdrawerapp.ui.theme.NavDrawerAppTheme

@Composable
fun Screen5(
    onBackClick: () -> Unit
) {
    ScreenContent(
        title = "Screen 5",
        description = "Ini adalah Screen Kelima. Penambahan fitur navigasi berhasil dilakukan!",
        buttonText = "Selesai",
        onBackClick = onBackClick
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Screen5Preview() {
    NavDrawerAppTheme {
        Screen5(onBackClick = {})
    }
}
