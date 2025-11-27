package com.example.praktikum7.viewmodel



import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.praktikum7.repositori.RepositoriSiswa
import com.example.praktikum7.room.Siswa

class EntryViewModel(private val repositoriSiswa: RepositoriSiswa): ViewModel() {
    var uiStateSiswa by mutableStateOf(UIStateSiswa())

    private fun validasiInput(uiState: DetailSiswa = uiStateSiswa.detailSiswa): Boolean{
        return with(uiState){
            nama.isNotBlank() && alamat.isNotBlank() && telpon.isNotBlank()
        }
    }

    fun updateUiState(detailSiswa: DetailSiswa){
        uiStateSiswa =
            UIStateSiswa(detailSiswa = detailSiswa,
                isEntryValid = validasiInput(detailSiswa))
    }

