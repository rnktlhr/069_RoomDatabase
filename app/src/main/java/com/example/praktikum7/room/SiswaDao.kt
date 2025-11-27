package com.example.praktikum7.room

import androidx.room.Dao
import androidx.room.Query

@Dao
interface SiswaDao {
    @Query("SELECT * from tblsiswa ORDER BY nama ASC")
}