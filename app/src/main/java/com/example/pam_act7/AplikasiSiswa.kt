package com.example.pam_act7

import android.app.Application
import com.example.pam_act7.repositori.ContainerApp

class AplikasiSiswa : Application(){
    /**
     * AppContainer instance digunakan oleh kelas-kelas lainnya untuk mendapatkan dependensi
     */
    lateinit var container: ContainerApp

}