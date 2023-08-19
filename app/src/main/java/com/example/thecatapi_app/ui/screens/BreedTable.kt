package com.example.thecatapi_app.ui.screens

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.thecatapi_app.dataclass.Breed
import com.example.thecatapi_app.ui.theme.TheCatAPI_APPTheme

@Composable
fun BreedTable(breeds : List<Breed>) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2)
    ){
        items(breeds) {
            BreedCard(name = it.name, imageUrl = it.imageUrl)
        }
    }
}

//val exampleBreed = Breed("Bengal", "https://i.pinimg.com/originals/e2/d1/a1/e2d1a1224578b38ab5e25b4cc01e0d07.jpg")
//val exampleBreeds = listOf<Breed>(exampleBreed, exampleBreed, exampleBreed)
