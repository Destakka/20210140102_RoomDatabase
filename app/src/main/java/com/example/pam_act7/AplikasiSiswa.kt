package com.example.pam_act7

import android.app.Application
import com.example.pam_act7.repositori.ContainerApp
import com.example.pam_act7.repositori.ContainerDataApp

class AplikasiSiswa : Application(){
    /**
     * AppContainer instance digunakan oleh kelas-kelas lainnya untuk mendapatkan dependensi
     */
    lateinit var container: ContainerApp

    override fun onCreate(){
        super.onCreate()
        container = ContainerDataApp(this)
    }
}