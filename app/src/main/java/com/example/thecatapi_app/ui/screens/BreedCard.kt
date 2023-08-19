package com.example.thecatapi_app.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import coil.compose.AsyncImage
import coil.request.ImageRequest
import coil.size.Size
import com.example.thecatapi_app.ui.theme.TheCatAPI_APPTheme


@Composable
fun BreedCard(name : String, imageUrl: String) {

    Card(modifier = Modifier.padding(16.dp)){
        Text(
            modifier = Modifier.padding(8.dp).fillMaxWidth(),
            text = name,
            fontSize = 20.sp,
            textAlign = TextAlign.Center
        )

        AsyncImage(
            modifier = Modifier.fillMaxSize() ,
            model = ImageRequest.Builder(LocalContext.current).data(imageUrl.toUri()).crossfade(true).size(
                Size.ORIGINAL).build(),
            contentDescription = name,
            contentScale = ContentScale.Crop
        )
    }

}

@Preview(showBackground = true)
@Composable
fun BreedPreview() {
    TheCatAPI_APPTheme {
        BreedCard("sibirskaya", "https://img2.goodfon.com/original/5184x3456/1/4f/kot-koshka-meyn-kun-meyn-kun.jpg")
    }
}