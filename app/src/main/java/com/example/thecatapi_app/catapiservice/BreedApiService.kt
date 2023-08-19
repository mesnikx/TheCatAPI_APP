package com.example.thecatapi_app.catapiservice

import com.example.thecatapi_app.dataclass.Breed
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface BreedApiService {
    @GET("v1/breeds")
    suspend fun getBreeds(): List<Breed>

}

val retrofit = Retrofit.Builder()
    .baseUrl("https://api.thecatapi.com/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

val breedApiService = retrofit.create(BreedApiService::class.java)


val client = OkHttpClient.Builder()
    .build()

class Repository() {
    suspend fun getBreeds() = breedApiService.getBreeds()
}