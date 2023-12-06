package com.example.pam_act7.ui.halaman

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.pam_act7.R
import com.example.pam_act7.data.Siswa
import com.example.pam_act7.navigasi.DestinasiNavigasi

object DestinasiHome : DestinasiNavigasi {
    override val route = "home"
    override val titleRes = R.string.app_name
}

@Composable
fun DataSiswa(
    siswa: Siswa,
    modifier: Modifier = Modifier
){

}