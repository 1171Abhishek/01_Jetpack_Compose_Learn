package com.company.android.a01_Intro

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.company.android.R
import com.company.android.ui.theme.AndroidTheme


/*
In Jetpack Compose, ContentScale controls how an image is resized and positioned
within its space, maintaining its aspect ratio.
 */
@Composable
fun ContentScaleFunction() {
    Text(text = "Hello Android")

//    ContentScale.Crop
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Magenta),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .background(Color.White)
                .size(300.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.wallpaper),
                contentDescription = null,
//                contentScale = ContentScale.Crop        // Scale the source to fit the destination while maintaining aspect ratio.
//                contentScale = ContentScale.FillBounds  // Scale horizontal and vertically non-uniformly to fill the destination bounds.
//                contentScale = ContentScale.FillHeight  // Scale the source maintaining the aspect ratio so that the bounds match the destination height.
//                contentScale = ContentScale.FillWidth   // Scale the source maintaining the aspect ratio so that the bounds match the destination width.
//                contentScale = ContentScale.Fit         // Uniformly scale the source to ensure both width and height are equal to or less than the destination while maintaining aspect ratio.
                contentScale = ContentScale.None     // "Uniformly scale the source to ensure both width and height are equal to or less than the destination while maintaining aspect ratio."
            )
        }

    }

}

@Preview(showSystemUi = true)
@Composable
fun ContentScaleFunctionPreview() {
    AndroidTheme {
        ContentScaleFunction()
    }
}