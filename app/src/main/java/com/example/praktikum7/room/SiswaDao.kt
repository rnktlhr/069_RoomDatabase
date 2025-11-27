package com.example.praktikum7.room

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface SiswaDao {
    @Query("SELECT * from tblsiswa ORDER BY nama ASC")
    fun getAllSiswa(): Flow<List<Siswa>>
}