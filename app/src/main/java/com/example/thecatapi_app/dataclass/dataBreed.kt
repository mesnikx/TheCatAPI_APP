package com.example.thecatapi_app.dataclass

import com.google.gson.annotations.SerializedName

data class Breed(
    @SerializedName("name") val name: String,
    @SerializedName("reference_image_id") val imageUrl:String
)