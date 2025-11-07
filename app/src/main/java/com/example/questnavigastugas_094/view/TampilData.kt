package com.example.questnavigastugas_094.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

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
    {
        //Header
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color(0xFFB56BFF))
                .padding(16.dp),
            contentAlignment = Alignment.BottomStart
        )
    }
}