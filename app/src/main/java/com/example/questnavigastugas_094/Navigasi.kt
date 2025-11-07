package com.example.questnavigastugas_094

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.questnavigastugas_094.view.DaftarData
import com.example.questnavigastugas_094.view.FormulirPendaftaran
import com.example.questnavigastugas_094.view.HalamanUtama

enum class Tampilan {
    SelamatDatang,
    DaftarPeserta,
    Formulir
}

@Composable
fun AplikasiPendaftaran(
    navController: NavHostController = rememberNavController()
) {
    Scaffold { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Tampilan.SelamatDatang.name, // Mulai dari layar SelamatDatang
            modifier = Modifier.padding(innerPadding)
        ) {
            // Rute untuk Layar 1: SelamatDatang
            composable(route = Tampilan.SelamatDatang.name) {
                HalamanUtama(
                    onNextButtonClicked = {
                        // Pindah ke layar DaftarPeserta
                        navController.navigate(Tampilan.DaftarPeserta.name)
                    }
                )
            }

            // Rute untuk Layar 2: DaftarPeserta
            composable(route = Tampilan.DaftarPeserta.name) {
                DaftarData(
                    onTambahDataClicked = {
                        // Pindah ke layar Formulir
                        navController.navigate(Tampilan.Formulir.name)
                    },
                    onBerandaClicked = {
                        // Kembali ke layar SelamatDatang
                        navController.popBackStack(Tampilan.SelamatDatang.name, inclusive = false)
                    }
                )
            }

            // Rute untuk Layar 3: Formulir
            composable(route = Tampilan.Formulir.name) {
                FormulirPendaftaran(
                    onSubmitButtonClicked = {
                        // Kembali ke layar sebelumnya (DaftarPeserta)
                        navController.popBackStack()
                    }
                )
            }
        }
    }
}