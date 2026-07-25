package com.example.navdrawerapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.navdrawerapp.ui.navigation.Screen
import com.example.navdrawerapp.ui.theme.*

/**
 * File DrawerContent.kt
 * =====================
 * Komponen ini menampilkan isi dari Navigation Drawer.
 */

// Data class untuk menyimpan informasi setiap item menu drawer
data class DrawerMenuItem(
    val screen: Screen,
    val icon: @Composable () -> Unit,
    val label: String
)

@Composable
fun DrawerContent(
    currentRoute: String?,
    onMenuClick: (Screen) -> Unit,
    modifier: Modifier = Modifier
) {
    // Latihan 1b: Ikon yang berbeda untuk setiap menu
    val menuItems = listOf(
        DrawerMenuItem(
            screen = Screen.Screen1,
            icon = { Icon(Icons.Default.Home, contentDescription = "Screen 1") },
            label = "Screen 1"
        ),
        DrawerMenuItem(
            screen = Screen.Screen2,
            icon = { Icon(Icons.Outlined.Info, contentDescription = "Screen 2") },
            label = "Screen 2"
        ),
        DrawerMenuItem(
            screen = Screen.Screen3,
            icon = { Icon(Icons.Default.Settings, contentDescription = "Screen 3") },
            label = "Screen 3"
        ),
        // Latihan 2a: Tambahkan Screen 4 dan Screen 5
        DrawerMenuItem(
            screen = Screen.Screen4,
            icon = { Icon(Icons.Default.Person, contentDescription = "Screen 4") },
            label = "Screen 4"
        ),
        DrawerMenuItem(
            screen = Screen.Screen5,
            icon = { Icon(Icons.Default.Favorite, contentDescription = "Screen 5") },
            label = "Screen 5"
        )
    )

    ModalDrawerSheet(
        modifier = modifier,
        drawerContainerColor = BackgroundDrawer
    ) {
        // === HEADER DRAWER ===
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp) // Ukuran diperbesar untuk avatar
                .background(DrawerHeaderBackground),
            contentAlignment = Alignment.CenterStart
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                // Latihan 3a: Foto/Avatar di header drawer
                Box(
                    modifier = Modifier
                        .size(64.dp)
                        .clip(CircleShape)
                        .background(Color.White)
                        .border(2.dp, Color.White, CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.AccountCircle,
                        contentDescription = "Avatar",
                        modifier = Modifier.size(64.dp),
                        tint = Primary
                    )
                }
                
                Spacer(modifier = Modifier.height(12.dp))
                
                Text(
                    text = "NavDrawer App User",
                    color = DrawerHeaderText,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Fabioilham321@gmail.com",
                    color = DrawerHeaderText.copy(alpha = 0.7f),
                    fontSize = 14.sp
                )
            }
        }

        Spacer(modifier = Modifier.height(12.dp))

        // === DAFTAR MENU ===
        menuItems.forEach { menuItem ->
            val isSelected = currentRoute == menuItem.screen.route

            NavigationDrawerItem(
                icon = menuItem.icon,
                label = {
                    Text(
                        text = menuItem.label,
                        fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal
                    )
                },
                selected = isSelected,
                onClick = {
                    onMenuClick(menuItem.screen)
                },
                // Latihan 3b: Badge/Counter untuk item yang aktif
                badge = {
                    if (isSelected) {
                        Surface(
                            color = Primary,
                            shape = CircleShape,
                            modifier = Modifier.size(24.dp)
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Text(
                                    text = "1",
                                    color = Color.White,
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                    }
                },
                colors = NavigationDrawerItemDefaults.colors(
                    selectedContainerColor = DrawerItemSelected,
                    selectedTextColor = DrawerItemSelectedText,
                    selectedIconColor = IconActive,
                    unselectedTextColor = DrawerItemUnselectedText,
                    unselectedIconColor = IconInactive
                ),
                modifier = Modifier.padding(horizontal = 12.dp)
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        Divider(
            modifier = Modifier.padding(horizontal = 16.dp),
            color = DrawerDivider
        )
    }
}
