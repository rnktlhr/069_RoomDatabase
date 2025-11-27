package com.example.praktikum7.room

import androidx.room.Database
import androidx.room.RoomDatabase
import java.time.Instant

@Database(entities = [Siswa::class], version = 1, exportSchema = false)

abstract class DatabaseSiswa : RoomDatabase(){
    abstract fun SiswaDao(): SiswaDao

    companion object{
        @Volatile
        private  var Instance: DatabaseSiswa? = null
    }
}