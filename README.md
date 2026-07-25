### NAMA : FABIO ILHAM MUHAMMAD
### NIM : 23083000111

<p align="center">
  <img src="https://github.com/user-attachments/assets/77a5c8af-2021-4ad9-9faf-83d4500af082" width="220">
  <img src="https://github.com/user-attachments/assets/54222222-be16-40b7-a279-016a31608a0c" width="220">
  <img src="https://github.com/user-attachments/assets/04a847a6-cbf8-491c-ac67-04537b4e2995" width="220">
  <img src="https://github.com/user-attachments/assets/9f7aa85d-69cb-4b92-89dc-7756146a2b0e" width="220">
</p>

<p align="center">
  <img src="https://github.com/user-attachments/assets/12628efd-4bd1-431a-b294-ef7a142e3011" width="220">
  <img src="https://github.com/user-attachments/assets/7b470e0e-47ee-4a90-a06b-74e97839c6d7" width="220">
  <img src="https://github.com/user-attachments/assets/77a86048-6e18-4acf-82bd-bb1ba5dc09ba" width="220">

</p>

1. Screen 1 Menampilkan Menu utama
2. Screen 2 Navigation Drawer menampilkan screen home screen 2 screen 3
3. Screen 3 tampilan screen 1
4. Screen 4 Tampilan screen 2
5. Screen 5 Tampilan screen 3
6. Screen 6 Tampilan screen 4
7. Screen 7 Tampilan screen 5










# NavDrawerApp - Simulasi Navigation Drawer
## Android Jetpack Compose Project

### Deskripsi
Aplikasi Android yang mendemonstrasikan implementasi **Navigation Drawer** 
menggunakan Jetpack Compose dan Material3.

Terdapat 3 menu di drawer: **Screen 1**, **Screen 2**, dan **Screen 3**.
Setiap screen menampilkan TopAppBar dengan back arrow dan area konten.

---

### Struktur Project

```
NavDrawerApp/
├── app/src/main/
│   ├── java/com/example/navdrawerapp/
│   │   ├── MainActivity.kt                    ← Activity utama (entry point)
│   │   └── ui/
│   │       ├── components/
│   │       │   └── DrawerContent.kt            ← Isi Navigation Drawer (menu)
│   │       ├── navigation/
│   │       │   ├── NavigationRoutes.kt         ← Definisi route setiap halaman
│   │       │   └── NavGraph.kt                 ← Peta navigasi antar halaman
│   │       ├── screens/
│   │       │   ├── HomeScreen.kt               ← Halaman utama + Drawer
│   │       │   ├── ScreenContent.kt            ← Komponen generik screen
│   │       │   ├── Screen1.kt                  ← Halaman Screen 1
│   │       │   ├── Screen2.kt                  ← Halaman Screen 2
│   │       │   └── Screen3.kt                  ← Halaman Screen 3
│   │       └── theme/
│   │           ├── Color.kt                    ← Warna Compose (sinkron color.xml)
│   │           └── Theme.kt                    ← Tema Material3
│   └── res/values/
│       ├── color.xml                           ← Semua warna hexadecimal
│       ├── strings.xml                         ← String resources
│       └── themes.xml                          ← Tema XML
```

---

### Alur Navigasi

```
┌─────────────────────┐
│   HomeScreen        │
│   (Navigation       │──── Geser kiri / tap ikon ≡
│    Drawer)          │
└────────┬────────────┘
         │
    ┌────┼────┐
    ▼    ▼    ▼
Screen1  Screen2  Screen3
    │    │    │
    └────┼────┘
         │ (Back Arrow)
         ▼
    HomeScreen
```

---

### Cara Menjalankan

1. Buka Android Studio
2. Pilih **File → Open** → arahkan ke folder `NavDrawerApp`
3. Tunggu Gradle sync selesai
4. Klik **Run** (▶) atau tekan Shift + F10
5. Pilih emulator atau device fisik

---

### Dependencies Utama

| Library                | Kegunaan                          |
|------------------------|-----------------------------------|
| Jetpack Compose BOM    | UI toolkit modern                 |
| Material3              | Desain komponen Material You      |
| Navigation Compose     | Navigasi antar halaman            |
| Material Icons Extended| Ikon tambahan (Menu, ArrowBack)   |

---

### Warna (color.xml)

Semua warna tersimpan di `res/values/color.xml` dan diduplikasi 
di `Color.kt` untuk penggunaan di Compose.

---

Copyright Disiapkan oleh Kukuh Yudhistiro - 2026
