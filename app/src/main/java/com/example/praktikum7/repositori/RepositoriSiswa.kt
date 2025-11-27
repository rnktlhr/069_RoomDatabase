package com.example.praktikum7.repositori

import com.example.praktikum7.room.Siswa
import com.example.praktikum7.room.SiswaDao
import kotlinx.coroutines.flow.Flow

interface RepositoriSiswa{
    fun getAllSiswaSream() : Flow<List<Siswa>>
    suspend fun insertSiswa(siswa: Siswa)
}

