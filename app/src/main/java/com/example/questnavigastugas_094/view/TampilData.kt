package com.example.questnavigastugas_094.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun DaftarData(
    onTambahDataClicked:() -> Unit,
    onBerandaClicked:() -> Unit
){
    val nama = "IRZA YAUMIL SYAHRAR"
    val jenisKelamin = "Laki-laki"
    val status = "Lajang"
    val alamat = "Jambi"

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF6E6FF))
            .verticalScroll(rememberScrollState()) // Tambahkan ini agar aman di semua ukuran layar
    )
}