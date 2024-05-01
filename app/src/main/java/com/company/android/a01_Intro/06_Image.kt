package com.company.android.a01_Intro

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.company.android.R
import com.company.android.ui.theme.AndroidTheme

@Composable
fun ImageFunction() {
    Image(
        painter = painterResource(id = R.drawable.wallpaper),
        contentDescription = "lake wallpaper" ,
        alpha = 0.9f    // Opacity
    )
}


@Preview(showSystemUi = true)
@Composable
fun ImageFunctionPreview() {
    AndroidTheme {
        ImageFunction()
    }
}