package com.example.thecatapi_app.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.thecatapi_app.catapiservice.Repository
import com.example.thecatapi_app.dataclass.Breed
import kotlinx.coroutines.launch
import java.lang.Exception

class BreedsViewModel(val repository : Repository = Repository()) : ViewModel() {
    var breedList = listOf<Breed>()


    fun getBreedList() {
        viewModelScope.launch {
            try {
                breedList = repository.getBreeds()
            } catch (e :Exception) {
                println("Repository error")
            }
        }
    }
}